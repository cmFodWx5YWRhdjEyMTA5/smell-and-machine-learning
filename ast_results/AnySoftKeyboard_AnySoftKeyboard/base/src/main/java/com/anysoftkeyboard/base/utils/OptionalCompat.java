// isComment
package com.anysoftkeyboard.base.utils;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class isClassOrIsInterface<T> {

    public static <T> OptionalCompat<T> isMethod(@Nullable T isParameter) {
        return new OptionalCompat<>(isNameExpr);
    }

    @Nullable
    private final T isVariable;

    private isConstructor(T isParameter) {
        isNameExpr = isNameExpr;
    }

    @Nullable
    public T isMethod() {
        return isNameExpr;
    }

    public boolean isMethod() {
        return isNameExpr != null;
    }

    public boolean isMethod() {
        return isNameExpr == null;
    }

    @NonNull
    public T isMethod(@NonNull T isParameter) {
        if (isNameExpr == null)
            return isNameExpr;
        else
            return isNameExpr;
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (isNameExpr == null) {
            return true;
        }
        if (this == isNameExpr) {
            return true;
        }
        if (!(isNameExpr instanceof OptionalCompat)) {
            return true;
        }
        OptionalCompat<?> isVariable = (OptionalCompat<?>) isNameExpr;
        if (isNameExpr.isMethod() && isMethod()) {
            return true;
        }
        if (isNameExpr.isFieldAccessExpr == isNameExpr) {
            return true;
        }
        return (isNameExpr.isFieldAccessExpr != null && isNameExpr.isFieldAccessExpr.isMethod(isNameExpr));
    }

    @Override
    public int isMethod() {
        return isNameExpr == null ? isIntegerConstant : isNameExpr.isMethod() + isIntegerConstant;
    }
}
