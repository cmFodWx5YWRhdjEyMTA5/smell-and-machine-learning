// isComment
package com.ichi2.utils;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.UiThread;
import androidx.annotation.WorkerThread;
import timber.log.Timber;

/**
 * isComment
 */
public class isClassOrIsInterface {

    private isConstructor() {
    }

    /**
     * isComment
     */
    public interface isClassOrIsInterface {

        /**
         * isComment
         */
        public void isMethod();
    }

    /**
     * isComment
     */
    public static ThreadChecker isMethod(@NonNull Thread isParameter) {
        if (isNameExpr == null) {
            throw new IllegalArgumentException("isStringConstant");
        }
        return new SingleThreadChecker(isNameExpr);
    }

    /**
     * isComment
     */
    public static ThreadChecker isMethod() {
        return new SingleThreadChecker(isNameExpr.isMethod());
    }

    /**
     * isComment
     */
    public static ThreadChecker isMethod() {
        return new SingleThreadChecker(null);
    }

    /**
     * isComment
     */
    public static boolean isMethod() {
        return isNameExpr.isMethod() == isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    @UiThread
    public static void isMethod() {
        if (!isMethod()) {
            isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod());
        }
    }

    /**
     * isComment
     */
    @WorkerThread
    public static void isMethod() {
        if (isMethod()) {
            isNameExpr.isMethod("isStringConstant");
        }
    }

    /**
     * isComment
     */
    private static class isClassOrIsInterface implements ThreadChecker {

        /**
         * isComment
         */
        private Thread isVariable;

        /**
         * isComment
         */
        private isConstructor(Thread isParameter) {
            isNameExpr = isNameExpr;
        }

        @Override
        public void isMethod() {
            // isComment
            if (isNameExpr == null) {
                isNameExpr = isNameExpr.isMethod();
                return;
            }
            if (isNameExpr != isNameExpr.isMethod()) {
                throw new IllegalStateException("isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isMethod());
            }
        }
    }
}
