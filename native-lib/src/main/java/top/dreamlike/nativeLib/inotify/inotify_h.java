// Generated by jextract

package top.dreamlike.nativeLib.inotify;

import java.lang.foreign.Addressable;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.*;

public class inotify_h {

    /* package-private */ inotify_h() {
    }

    public static OfByte C_CHAR = Constants$root.C_CHAR$LAYOUT;
    public static OfShort C_SHORT = Constants$root.C_SHORT$LAYOUT;
    public static OfInt C_INT = Constants$root.C_INT$LAYOUT;
    public static OfLong C_LONG = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong C_LONG_LONG = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfFloat C_FLOAT = Constants$root.C_FLOAT$LAYOUT;
    public static OfDouble C_DOUBLE = Constants$root.C_DOUBLE$LAYOUT;
    public static OfAddress C_POINTER = Constants$root.C_POINTER$LAYOUT;

    public static int _SYS_INOTIFY_H() {
        return (int) 1L;
    }

    public static int _STDINT_H() {
        return (int) 1L;
    }

    public static int _FEATURES_H() {
        return (int) 1L;
    }

    public static int _DEFAULT_SOURCE() {
        return (int) 1L;
    }

    public static int __GLIBC_USE_ISOC2X() {
        return (int) 0L;
    }

    public static int __USE_ISOC11() {
        return (int) 1L;
    }

    public static int __USE_ISOC99() {
        return (int) 1L;
    }

    public static int __USE_ISOC95() {
        return (int) 1L;
    }

    public static int __USE_POSIX_IMPLICITLY() {
        return (int) 1L;
    }

    public static int _POSIX_SOURCE() {
        return (int) 1L;
    }

    public static int __USE_POSIX() {
        return (int) 1L;
    }

    public static int __USE_POSIX2() {
        return (int) 1L;
    }

    public static int __USE_POSIX199309() {
        return (int) 1L;
    }

    public static int __USE_POSIX199506() {
        return (int) 1L;
    }

    public static int __USE_XOPEN2K() {
        return (int) 1L;
    }

    public static int __USE_XOPEN2K8() {
        return (int) 1L;
    }

    public static int _ATFILE_SOURCE() {
        return (int) 1L;
    }

    public static int __USE_MISC() {
        return (int) 1L;
    }

    public static int __USE_ATFILE() {
        return (int) 1L;
    }

    public static int __USE_FORTIFY_LEVEL() {
        return (int) 0L;
    }

    public static int __GLIBC_USE_DEPRECATED_GETS() {
        return (int) 0L;
    }

    public static int __GLIBC_USE_DEPRECATED_SCANF() {
        return (int) 0L;
    }

    public static int _STDC_PREDEF_H() {
        return (int) 1L;
    }

    public static int __STDC_IEC_559__() {
        return (int) 1L;
    }

    public static int __STDC_IEC_559_COMPLEX__() {
        return (int) 1L;
    }

    public static int __GNU_LIBRARY__() {
        return (int) 6L;
    }

    public static int __GLIBC__() {
        return (int) 2L;
    }

    public static int __GLIBC_MINOR__() {
        return (int) 31L;
    }

    public static int _SYS_CDEFS_H() {
        return (int) 1L;
    }

    public static int __glibc_c99_flexarr_available() {
        return (int) 1L;
    }

    public static int __WORDSIZE() {
        return (int) 64L;
    }

    public static int __WORDSIZE_TIME64_COMPAT32() {
        return (int) 1L;
    }

    public static int __SYSCALL_WORDSIZE() {
        return (int) 64L;
    }

    public static int __LONG_DOUBLE_USES_FLOAT128() {
        return (int) 0L;
    }

    public static int __HAVE_GENERIC_SELECTION() {
        return (int) 1L;
    }

    public static int __GLIBC_USE_LIB_EXT2() {
        return (int) 0L;
    }

    public static int __GLIBC_USE_IEC_60559_BFP_EXT() {
        return (int) 0L;
    }

    public static int __GLIBC_USE_IEC_60559_BFP_EXT_C2X() {
        return (int) 0L;
    }

    public static int __GLIBC_USE_IEC_60559_FUNCS_EXT() {
        return (int) 0L;
    }

    public static int __GLIBC_USE_IEC_60559_FUNCS_EXT_C2X() {
        return (int) 0L;
    }

    public static int __GLIBC_USE_IEC_60559_TYPES_EXT() {
        return (int) 0L;
    }

    public static int _BITS_TYPES_H() {
        return (int) 1L;
    }

    public static int _BITS_TYPESIZES_H() {
        return (int) 1L;
    }

    public static int __OFF_T_MATCHES_OFF64_T() {
        return (int) 1L;
    }

    public static int __INO_T_MATCHES_INO64_T() {
        return (int) 1L;
    }

    public static int __RLIM_T_MATCHES_RLIM64_T() {
        return (int) 1L;
    }

    public static int __STATFS_MATCHES_STATFS64() {
        return (int) 1L;
    }

    public static int __FD_SETSIZE() {
        return (int) 1024L;
    }

    public static int _BITS_TIME64_H() {
        return (int) 1L;
    }

    public static int _BITS_WCHAR_H() {
        return (int) 1L;
    }

    public static int _BITS_STDINT_INTN_H() {
        return (int) 1L;
    }

    public static int _BITS_STDINT_UINTN_H() {
        return (int) 1L;
    }

    public static int IN_ACCESS() {
        return (int) 1L;
    }

    public static int IN_MODIFY() {
        return (int) 2L;
    }

    public static int IN_ATTRIB() {
        return (int) 4L;
    }

    public static int IN_CLOSE_WRITE() {
        return (int) 8L;
    }

    public static int IN_CLOSE_NOWRITE() {
        return (int) 16L;
    }

    public static int IN_OPEN() {
        return (int) 32L;
    }

    public static int IN_MOVED_FROM() {
        return (int) 64L;
    }

    public static int IN_MOVED_TO() {
        return (int) 128L;
    }

    public static int IN_CREATE() {
        return (int) 256L;
    }

    public static int IN_DELETE() {
        return (int) 512L;
    }

    public static int IN_DELETE_SELF() {
        return (int) 1024L;
    }

    public static int IN_MOVE_SELF() {
        return (int) 2048L;
    }

    public static int IN_UNMOUNT() {
        return (int) 8192L;
    }

    public static int IN_Q_OVERFLOW() {
        return (int) 16384L;
    }

    public static int IN_IGNORED() {
        return (int) 32768L;
    }

    public static int IN_ONLYDIR() {
        return (int) 16777216L;
    }

    public static int IN_DONT_FOLLOW() {
        return (int) 33554432L;
    }

    public static int IN_EXCL_UNLINK() {
        return (int) 67108864L;
    }

    public static int IN_MASK_CREATE() {
        return (int) 268435456L;
    }

    public static int IN_MASK_ADD() {
        return (int) 536870912L;
    }

    public static int IN_ISDIR() {
        return (int) 1073741824L;
    }

    public static OfShort __int16_t = Constants$root.C_SHORT$LAYOUT;
    public static OfInt __int32_t = Constants$root.C_INT$LAYOUT;
    public static OfLong __int64_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfShort __int_least16_t = Constants$root.C_SHORT$LAYOUT;
    public static OfInt __int_least32_t = Constants$root.C_INT$LAYOUT;
    public static OfLong __int_least64_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __quad_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __intmax_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __off_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __off64_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfInt __pid_t = Constants$root.C_INT$LAYOUT;
    public static OfLong __clock_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __time_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __suseconds_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfInt __daddr_t = Constants$root.C_INT$LAYOUT;
    public static OfInt __key_t = Constants$root.C_INT$LAYOUT;
    public static OfInt __clockid_t = Constants$root.C_INT$LAYOUT;
    public static OfAddress __timer_t = Constants$root.C_POINTER$LAYOUT;
    public static OfLong __blksize_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __blkcnt_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __blkcnt64_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __fsword_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __ssize_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __syscall_slong_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong __loff_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfAddress __caddr_t = Constants$root.C_POINTER$LAYOUT;
    public static OfLong __intptr_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfInt __sig_atomic_t = Constants$root.C_INT$LAYOUT;
    public static OfShort int16_t = Constants$root.C_SHORT$LAYOUT;
    public static OfInt int32_t = Constants$root.C_INT$LAYOUT;
    public static OfLong int64_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfShort int_least16_t = Constants$root.C_SHORT$LAYOUT;
    public static OfInt int_least32_t = Constants$root.C_INT$LAYOUT;
    public static OfLong int_least64_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong int_fast16_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong int_fast32_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong int_fast64_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong intptr_t = Constants$root.C_LONG_LONG$LAYOUT;
    public static OfLong intmax_t = Constants$root.C_LONG_LONG$LAYOUT;

    public static int IN_CLOEXEC() {
        return (int) 524288L;
    }

    public static int IN_NONBLOCK() {
        return (int) 2048L;
    }

    public static MethodHandle inotify_init$MH() {
        return RuntimeHelper.requireNonNull(constants$0.inotify_init$MH, "inotify_init");
    }

    public static int inotify_init() {
        var mh$ = inotify_init$MH();
        try {
            return (int) mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle inotify_init1$MH() {
        return RuntimeHelper.requireNonNull(constants$0.inotify_init1$MH, "inotify_init1");
    }

    public static int inotify_init1(int __flags) {
        var mh$ = inotify_init1$MH();
        try {
            return (int) mh$.invokeExact(__flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle inotify_add_watch$MH() {
        return RuntimeHelper.requireNonNull(constants$0.inotify_add_watch$MH, "inotify_add_watch");
    }

    public static int inotify_add_watch(int __fd, Addressable __name, int __mask) {
        var mh$ = inotify_add_watch$MH();
        try {
            return (int) mh$.invokeExact(__fd, __name, __mask);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static MethodHandle inotify_rm_watch$MH() {
        return RuntimeHelper.requireNonNull(constants$0.inotify_rm_watch$MH, "inotify_rm_watch");
    }

    public static int inotify_rm_watch(int __fd, int __wd) {
        var mh$ = inotify_rm_watch$MH();
        try {
            return (int) mh$.invokeExact(__fd, __wd);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }

    public static long _POSIX_C_SOURCE() {
        return 200809L;
    }

    public static long __STDC_ISO_10646__() {
        return 201706L;
    }

    public static int __TIMESIZE() {
        return (int) 64L;
    }

    public static int __WCHAR_MAX() {
        return (int) 2147483647L;
    }

    public static int __WCHAR_MIN() {
        return (int) -2147483648L;
    }

    public static int INT8_MIN() {
        return (int) -128L;
    }

    public static int INT16_MIN() {
        return (int) -32768L;
    }

    public static int INT32_MIN() {
        return (int) -2147483648L;
    }

    public static long INT64_MIN() {
        return -9223372036854775808L;
    }

    public static int INT8_MAX() {
        return (int) 127L;
    }

    public static int INT16_MAX() {
        return (int) 32767L;
    }

    public static int INT32_MAX() {
        return (int) 2147483647L;
    }

    public static long INT64_MAX() {
        return 9223372036854775807L;
    }

    public static int UINT8_MAX() {
        return (int) 255L;
    }

    public static int UINT16_MAX() {
        return (int) 65535L;
    }

    public static int UINT32_MAX() {
        return (int) 4294967295L;
    }

    public static long UINT64_MAX() {
        return -1L;
    }

    public static int INT_LEAST8_MIN() {
        return (int) -128L;
    }

    public static int INT_LEAST16_MIN() {
        return (int) -32768L;
    }

    public static int INT_LEAST32_MIN() {
        return (int) -2147483648L;
    }

    public static long INT_LEAST64_MIN() {
        return -9223372036854775808L;
    }

    public static int INT_LEAST8_MAX() {
        return (int) 127L;
    }

    public static int INT_LEAST16_MAX() {
        return (int) 32767L;
    }

    public static int INT_LEAST32_MAX() {
        return (int) 2147483647L;
    }

    public static long INT_LEAST64_MAX() {
        return 9223372036854775807L;
    }

    public static int UINT_LEAST8_MAX() {
        return (int) 255L;
    }

    public static int UINT_LEAST16_MAX() {
        return (int) 65535L;
    }

    public static int UINT_LEAST32_MAX() {
        return (int) 4294967295L;
    }

    public static long UINT_LEAST64_MAX() {
        return -1L;
    }

    public static int INT_FAST8_MIN() {
        return (int) -128L;
    }

    public static long INT_FAST16_MIN() {
        return -9223372036854775808L;
    }

    public static long INT_FAST32_MIN() {
        return -9223372036854775808L;
    }

    public static long INT_FAST64_MIN() {
        return -9223372036854775808L;
    }

    public static int INT_FAST8_MAX() {
        return (int) 127L;
    }

    public static long INT_FAST16_MAX() {
        return 9223372036854775807L;
    }

    public static long INT_FAST32_MAX() {
        return 9223372036854775807L;
    }

    public static long INT_FAST64_MAX() {
        return 9223372036854775807L;
    }

    public static int UINT_FAST8_MAX() {
        return (int) 255L;
    }

    public static long UINT_FAST16_MAX() {
        return -1L;
    }

    public static long UINT_FAST32_MAX() {
        return -1L;
    }

    public static long UINT_FAST64_MAX() {
        return -1L;
    }

    public static long INTPTR_MIN() {
        return -9223372036854775808L;
    }

    public static long INTPTR_MAX() {
        return 9223372036854775807L;
    }

    public static long UINTPTR_MAX() {
        return -1L;
    }

    public static long INTMAX_MIN() {
        return -9223372036854775808L;
    }

    public static long INTMAX_MAX() {
        return 9223372036854775807L;
    }

    public static long UINTMAX_MAX() {
        return -1L;
    }

    public static long PTRDIFF_MIN() {
        return -9223372036854775808L;
    }

    public static long PTRDIFF_MAX() {
        return 9223372036854775807L;
    }

    public static int SIG_ATOMIC_MIN() {
        return (int) -2147483648L;
    }

    public static int SIG_ATOMIC_MAX() {
        return (int) 2147483647L;
    }

    public static long SIZE_MAX() {
        return -1L;
    }

    public static int WCHAR_MIN() {
        return (int) -2147483648L;
    }

    public static int WCHAR_MAX() {
        return (int) 2147483647L;
    }

    public static int WINT_MIN() {
        return (int) 0L;
    }

    public static int WINT_MAX() {
        return (int) 4294967295L;
    }

    public static int IN_CLOSE() {
        return (int) 24L;
    }

    public static int IN_MOVE() {
        return (int) 192L;
    }

    public static int IN_ONESHOT() {
        return (int) 2147483648L;
    }

    public static int IN_ALL_EVENTS() {
        return (int) 4095L;
    }
}


