// isComment
package org.qii.weiciyuan.support.lib;

import org.qii.weiciyuan.support.debug.AppLogger;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * isComment
 */
public class isClassOrIsInterface extends ScheduledThreadPoolExecutor {

    public isConstructor(int isParameter) {
        super(isNameExpr);
    }

    @Override
    public ScheduledFuture isMethod(Runnable isParameter, long isParameter, long isParameter, TimeUnit isParameter) {
        return super.isMethod(isMethod(isNameExpr), isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public ScheduledFuture isMethod(Runnable isParameter, long isParameter, long isParameter, TimeUnit isParameter) {
        return super.isMethod(isMethod(isNameExpr), isNameExpr, isNameExpr, isNameExpr);
    }

    private Runnable isMethod(Runnable isParameter) {
        return new LogOnExceptionRunnable(isNameExpr);
    }

    private class isClassOrIsInterface implements Runnable {

        private Runnable isVariable;

        public isConstructor(Runnable isParameter) {
            super();
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public void isMethod() {
            try {
                isNameExpr.isMethod();
            } catch (Exception isParameter) {
                isNameExpr.isMethod("isStringConstant" + isNameExpr + "isStringConstant");
                isNameExpr.isMethod();
                throw new RuntimeException(isNameExpr);
            }
        }
    }
}
