// isComment
package org.andstatus.app.util;

import java.util.function.Supplier;

/**
 * isComment
 */
public class isClassOrIsInterface<T> implements Supplier<T> {

    private final Supplier<T> isVariable;

    private volatile T isVariable = null;

    public static <T> LazyVal<T> isMethod(Supplier<T> isParameter) {
        return new LazyVal<>(isNameExpr);
    }

    private isConstructor(Supplier<T> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public T isMethod() {
        T isVariable = isNameExpr;
        return isNameExpr == null ? isMethod() : isNameExpr;
    }

    private synchronized T isMethod() {
        if (isNameExpr != null)
            return isNameExpr;
        T isVariable = isNameExpr.isMethod();
        isNameExpr = isNameExpr;
        return isNameExpr;
    }

    public void isMethod() {
        isNameExpr = null;
    }
}
