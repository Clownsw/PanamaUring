// Generated by jextract

package top.dreamlike.nativeLib.unistd;

import top.dreamlike.common.CType;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

class constants$3 {

    static final FunctionDescriptor chdir$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_POINTER$LAYOUT
    );
    static final MethodHandle chdir$MH = RuntimeHelper.downcallHandle(
        "chdir",
        constants$3.chdir$FUNC
    );
    static final FunctionDescriptor fchdir$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle fchdir$MH = RuntimeHelper.downcallHandle(
        "fchdir",
        constants$3.fchdir$FUNC
    );
    static final FunctionDescriptor getcwd$FUNC = FunctionDescriptor.of(CType.C_POINTER$LAYOUT,
        CType.C_POINTER$LAYOUT,
        CType.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle getcwd$MH = RuntimeHelper.downcallHandle(
        "getcwd",
        constants$3.getcwd$FUNC
    );
    static final FunctionDescriptor getwd$FUNC = FunctionDescriptor.of(CType.C_POINTER$LAYOUT,
        CType.C_POINTER$LAYOUT
    );
    static final MethodHandle getwd$MH = RuntimeHelper.downcallHandle(
        "getwd",
        constants$3.getwd$FUNC
    );
    static final FunctionDescriptor dup$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle dup$MH = RuntimeHelper.downcallHandle(
        "dup",
        constants$3.dup$FUNC
    );
    static final FunctionDescriptor dup2$FUNC = FunctionDescriptor.of(CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT,
        CType.C_INT$LAYOUT
    );
    static final MethodHandle dup2$MH = RuntimeHelper.downcallHandle(
        "dup2",
        constants$3.dup2$FUNC
    );
}


