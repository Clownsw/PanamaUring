// Generated by jextract

package top.dreamlike.nativeLib.unistd;

import top.dreamlike.common.CType;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

class constants$6 {

    static final FunctionDescriptor sysconf$FUNC = FunctionDescriptor.of(CType.C_LONG_LONG$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle sysconf$MH = RuntimeHelper.downcallHandle(
        "sysconf",
        constants$6.sysconf$FUNC
    );
    static final FunctionDescriptor confstr$FUNC = FunctionDescriptor.of(CType.C_LONG_LONG$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle confstr$MH = RuntimeHelper.downcallHandle(
        "confstr",
        constants$6.confstr$FUNC
    );
    static final FunctionDescriptor getpid$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT);
    static final MethodHandle getpid$MH = RuntimeHelper.downcallHandle(
        "getpid",
        constants$6.getpid$FUNC
    );
    static final FunctionDescriptor getppid$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT);
    static final MethodHandle getppid$MH = RuntimeHelper.downcallHandle(
        "getppid",
        constants$6.getppid$FUNC
    );
    static final FunctionDescriptor getpgrp$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT);
    static final MethodHandle getpgrp$MH = RuntimeHelper.downcallHandle(
        "getpgrp",
        constants$6.getpgrp$FUNC
    );
    static final FunctionDescriptor __getpgid$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle __getpgid$MH = RuntimeHelper.downcallHandle(
        "__getpgid",
        constants$6.__getpgid$FUNC
    );
}


