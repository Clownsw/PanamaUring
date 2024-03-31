package top.dreamlike.panama.uring.trait;

import top.dreamlike.panama.uring.nativelib.Instance;
import top.dreamlike.panama.uring.nativelib.helper.DebugHelper;

public interface NativeFd extends ReadableNativeFd, WritableNativeFd {
    int fd();

    @Override
    default int writeFd() {
        return fd();
    }

    @Override
    default int readFd() {
        return fd();
    }

    default void close() {
        int closed = Instance.LIBC.close(fd());
        if (closed < 0) {
            throw new IllegalStateException(STR."close error, reason: \{DebugHelper.currentErrorStr()}");
        }
    }
}
