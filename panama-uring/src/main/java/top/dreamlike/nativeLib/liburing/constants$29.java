// Generated by jextract

package top.dreamlike.nativeLib.liburing;

import top.dreamlike.common.CType;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

class constants$29 {

    static final FunctionDescriptor io_uring_prep_readv$FUNC = FunctionDescriptor.ofVoid(
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle io_uring_prep_readv$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_readv",
        constants$29.io_uring_prep_readv$FUNC
    );
    static final FunctionDescriptor io_uring_prep_read_fixed$FUNC = FunctionDescriptor.ofVoid(
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_LONG_LONG$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_read_fixed$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_read_fixed",
        constants$29.io_uring_prep_read_fixed$FUNC
    );
    static final FunctionDescriptor io_uring_prep_writev$FUNC = FunctionDescriptor.ofVoid(
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle io_uring_prep_writev$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_writev",
        constants$29.io_uring_prep_writev$FUNC
    );
    static final FunctionDescriptor io_uring_prep_write_fixed$FUNC = FunctionDescriptor.ofVoid(
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_LONG_LONG$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_write_fixed$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_write_fixed",
        constants$29.io_uring_prep_write_fixed$FUNC
    );
    static final FunctionDescriptor io_uring_prep_recvmsg$FUNC = FunctionDescriptor.ofVoid(
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_recvmsg$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_recvmsg",
        constants$29.io_uring_prep_recvmsg$FUNC
    );
    static final FunctionDescriptor io_uring_prep_sendmsg$FUNC = FunctionDescriptor.ofVoid(
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle io_uring_prep_sendmsg$MH = RuntimeHelper.downcallHandle(
        "io_uring_prep_sendmsg",
        constants$29.io_uring_prep_sendmsg$FUNC
    );
}


