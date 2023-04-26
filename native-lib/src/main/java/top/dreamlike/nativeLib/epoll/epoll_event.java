// Generated by jextract

package top.dreamlike.nativeLib.epoll;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;

public class epoll_event {

    static final  GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_INT$LAYOUT.withName("events"),
        MemoryLayout.unionLayout(
                Constants$root.C_POINTER$LAYOUT.withName("ptr"),
                Constants$root.C_INT$LAYOUT.withName("res"),
                Constants$root.C_INT$LAYOUT.withName("u32"),
                Constants$root.C_LONG_LONG$LAYOUT.withName("u64")
        ).withName("data")
    ).withName("epoll_event");
    public static MemoryLayout $LAYOUT() {
        return epoll_event.$struct$LAYOUT;
    }
    static final VarHandle events$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("events"));
    public static VarHandle events$VH() {
        return epoll_event.events$VH;
    }
    public static int events$get(MemorySegment seg) {
        return (int)epoll_event.events$VH.get(seg);
    }
    public static void events$set( MemorySegment seg, int x) {
        epoll_event.events$VH.set(seg, x);
    }
    public static int events$get(MemorySegment seg, long index) {
        return (int)epoll_event.events$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void events$set(MemorySegment seg, long index, int x) {
        epoll_event.events$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment data$slice(MemorySegment seg) {
        return seg.asSlice(4, 8);
    }

    public static int fd$get(MemorySegment seg, long index){
        MemorySegment slice = seg.asSlice(index * sizeof());
        return epoll_data.fd$get(data$slice(slice));
    }

    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(int len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }

    public static MemorySegment ofAddress(MemorySegment addr, Arena session) {
        return RuntimeHelper.asArray(addr, $LAYOUT(), 1, session);
    }
}


