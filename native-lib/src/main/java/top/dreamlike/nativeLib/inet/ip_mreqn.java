// Generated by jextract

package top.dreamlike.nativeLib.inet;

import top.dreamlike.common.CType;

import java.lang.foreign.*;
import java.lang.invoke.VarHandle;

public class ip_mreqn {

    static final GroupLayout $struct$LAYOUT = MemoryLayout.structLayout(
            MemoryLayout.structLayout(
                    CType.C_INT$LAYOUT.withName("s_addr")
            ).withName("imr_multiaddr"),
            MemoryLayout.structLayout(
                    CType.C_INT$LAYOUT.withName("s_addr")
            ).withName("imr_address"),
            CType.C_INT$LAYOUT.withName("imr_ifindex")
    ).withName("ip_mreqn");

    public static MemoryLayout $LAYOUT() {
        return ip_mreqn.$struct$LAYOUT;
    }

    public static MemorySegment imr_multiaddr$slice(MemorySegment seg) {
        return seg.asSlice(0, 4);
    }

    public static MemorySegment imr_address$slice(MemorySegment seg) {
        return seg.asSlice(4, 4);
    }
    static final VarHandle imr_ifindex$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("imr_ifindex"));
    public static VarHandle imr_ifindex$VH() {
        return ip_mreqn.imr_ifindex$VH;
    }
    public static int imr_ifindex$get(MemorySegment seg) {
        return (int)ip_mreqn.imr_ifindex$VH.get(seg);
    }
    public static void imr_ifindex$set( MemorySegment seg, int x) {
        ip_mreqn.imr_ifindex$VH.set(seg, x);
    }
    public static int imr_ifindex$get(MemorySegment seg, long index) {
        return (int)ip_mreqn.imr_ifindex$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void imr_ifindex$set(MemorySegment seg, long index, int x) {
        ip_mreqn.imr_ifindex$VH.set(seg.asSlice(index*sizeof()), x);
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


