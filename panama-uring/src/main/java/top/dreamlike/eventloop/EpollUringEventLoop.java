package top.dreamlike.eventloop;


import top.dreamlike.access.AccessHelper;
import top.dreamlike.epoll.Epoll;
import top.dreamlike.epoll.async.EpollAsyncSocket;
import top.dreamlike.helper.Pair;

import java.net.InetSocketAddress;

import static top.dreamlike.nativeLib.epoll.epoll_h.EPOLLIN;

public class EpollUringEventLoop extends IOUringEventLoop {
    private final EpollEventLoop epollEventLoop;

    private final int ioUringEventFd;


    public EpollUringEventLoop(int ringSize, int autoBufferSize, long autoSubmitDuration) {
        //todo 异常情况关闭io_uring and epoll,先假定不会出问题 java也没法支持捕获native错误
        super(ringSize, autoBufferSize, autoSubmitDuration);
        epollEventLoop = new EpollEventLoop() {
            @Override
            public boolean inEventLoop() {
                return true;
            }
        };
        epollEventLoop.tasks = tasks;
        ioUringEventFd = ioUring.registerEventFd();
        AccessHelper.registerToEpollDirectly.accept(epollEventLoop, new Pair<>(new Epoll.Event(ioUringEventFd, EPOLLIN()), (__) -> {
            //收割cqe
            super.afterSelect();
        }));
    }


    @Override
    public EpollAsyncSocket openSocket(String host, int port) {
        return new EpollAsyncSocket(new InetSocketAddress(host, port), this);
    }

    public EpollEventLoop epollMode() {
        return epollEventLoop;
    }


    @Override
    protected void selectAndWait(long duration) {
        epollEventLoop.selectAndWait(duration);
    }

    @Override
    protected void close0() throws Exception {
        super.close0();
        epollEventLoop.close0();
    }

    @Override
    protected void afterSelect() {
        epollEventLoop.afterSelect();
    }


    @Override
    public void wakeup0() {
        //启动时没有
        if (epollEventLoop != null) {
            epollEventLoop.wakeup0();
        }
    }
}
