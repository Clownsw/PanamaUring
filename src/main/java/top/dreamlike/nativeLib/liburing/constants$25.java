// Generated by jextract

package top.dreamlike.nativeLib.liburing;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

class constants$25 {

    static final FunctionDescriptor io_uring_get_sqe$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_get_sqe$MH = RuntimeHelper.downcallHandle(
        "io_uring_get_sqe",
        constants$25.io_uring_get_sqe$FUNC
    );
    static final FunctionDescriptor io_uring_register_buffers$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_register_buffers$MH = RuntimeHelper.downcallHandle(
        "io_uring_register_buffers",
        constants$25.io_uring_register_buffers$FUNC
    );
    static final FunctionDescriptor io_uring_unregister_buffers$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_unregister_buffers$MH = RuntimeHelper.downcallHandle(
        "io_uring_unregister_buffers",
        constants$25.io_uring_unregister_buffers$FUNC
    );
    static final FunctionDescriptor io_uring_register_files$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_register_files$MH = RuntimeHelper.downcallHandle(
        "io_uring_register_files",
        constants$25.io_uring_register_files$FUNC
    );
    static final FunctionDescriptor io_uring_unregister_files$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle io_uring_unregister_files$MH = RuntimeHelper.downcallHandle(
        "io_uring_unregister_files",
        constants$25.io_uring_unregister_files$FUNC
    );
    static final FunctionDescriptor io_uring_register_files_update$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_register_files_update$MH = RuntimeHelper.downcallHandle(
        "io_uring_register_files_update",
        constants$25.io_uring_register_files_update$FUNC
    );
}


