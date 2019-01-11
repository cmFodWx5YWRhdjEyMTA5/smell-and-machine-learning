// isComment
package ws.wamp.jawampa.internal;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class isClassOrIsInterface<V> {

    V isVariable;

    boolean isVariable = true;

    ExecutionException isVariable;

    final Object isVariable = new Object();

    public void isMethod(V isParameter) {
        synchronized (isNameExpr) {
            if (isNameExpr)
                throw new RuntimeException("isStringConstant");
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = true;
            isNameExpr.isMethod();
        }
    }

    public void isMethod(ExecutionException isParameter) {
        synchronized (isNameExpr) {
            if (isNameExpr)
                throw new RuntimeException("isStringConstant");
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = true;
            isNameExpr.isMethod();
        }
    }

    public java.util.concurrent.Future<V> isMethod() {
        return new Future<V>() {

            @Override
            public boolean isMethod(boolean isParameter) {
                return true;
            }

            @Override
            public boolean isMethod() {
                return true;
            }

            @Override
            public boolean isMethod() {
                synchronized (isNameExpr) {
                    return isNameExpr;
                }
            }

            @Override
            public V isMethod() throws InterruptedException, ExecutionException {
                synchronized (isNameExpr) {
                    while (!isNameExpr) isNameExpr.isMethod();
                    if (isNameExpr != null)
                        throw isNameExpr;
                    return isNameExpr;
                }
            }

            @Override
            public V isMethod(long isParameter, TimeUnit isParameter) throws InterruptedException, ExecutionException, TimeoutException {
                synchronized (isNameExpr) {
                    while (!isNameExpr) isNameExpr.isMethod(isNameExpr, isNameExpr);
                    if (isNameExpr != null)
                        throw isNameExpr;
                    return isNameExpr;
                }
            }
        };
    }
}
