// Generated by jextract

package top.dreamlike.nativeLib.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

class constants$32 {

    static final FunctionDescriptor io_uring_prep_fallocate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle io_uring_prep_fallocate$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_fallocate",
        constants$32.io_uring_prep_fallocate$FUNC
    );
    static final FunctionDescriptor io_uring_prep_openat$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_openat$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_openat",
        constants$32.io_uring_prep_openat$FUNC
    );
    static final FunctionDescriptor io_uring_prep_close$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_close$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_close",
        constants$32.io_uring_prep_close$FUNC
    );
    static final FunctionDescriptor io_uring_prep_read$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle io_uring_prep_read$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_read",
        constants$32.io_uring_prep_read$FUNC
    );
    static final FunctionDescriptor io_uring_prep_write$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle io_uring_prep_write$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_write",
        constants$32.io_uring_prep_write$FUNC
    );
    static final FunctionDescriptor io_uring_prep_statx$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_prep_statx$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_statx",
        constants$32.io_uring_prep_statx$FUNC
    );
}


