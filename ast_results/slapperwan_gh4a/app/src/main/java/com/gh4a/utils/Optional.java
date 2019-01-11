// isComment
package com.gh4a.utils;

import android.support.annotation.NonNull;
import io.reactivex.Single;

public class isClassOrIsInterface<T> {

    public interface isClassOrIsInterface<T> {

        @NonNull
        T isMethod();
    }

    public interface isClassOrIsInterface<T, R> {

        @NonNull
        R isMethod(T isParameter);
    }

    private T isVariable;

    private isConstructor() {
        isNameExpr = null;
    }

    private isConstructor(T isParameter) {
        if (isNameExpr == null) {
            throw new NullPointerException("isStringConstant");
        }
        isNameExpr = isNameExpr;
    }

    public static <T> Optional<T> isMethod() {
        return new Optional<>();
    }

    public static <T> Optional<T> isMethod(T isParameter) {
        return new Optional<>(isNameExpr);
    }

    public static <T> Optional<T> isMethod(T isParameter) {
        return isNameExpr == null ? isMethod() : isMethod(isNameExpr);
    }

    public T isMethod() {
        if (isNameExpr == null) {
            throw new NullPointerException("isStringConstant");
        }
        return isNameExpr;
    }

    public boolean isMethod() {
        return isNameExpr != null;
    }

    public T isMethod() {
        return isNameExpr;
    }

    public Optional<T> isMethod(Supplier<T> isParameter) {
        return isMethod(isNameExpr != null ? isNameExpr : isNameExpr.isMethod());
    }

    public Optional<T> isMethod(Supplier<Optional<T>> isParameter) {
        if (isNameExpr != null) {
            return isMethod(isNameExpr);
        }
        return isNameExpr.isMethod();
    }

    public Single<Optional<T>> isMethod(Supplier<Single<T>> isParameter) {
        if (isMethod()) {
            return isNameExpr.isMethod(isMethod(isNameExpr));
        }
        return isNameExpr.isMethod().isMethod(Optional::of);
    }

    public Single<Optional<T>> isMethod(Supplier<Single<Optional<T>>> isParameter) {
        if (isMethod()) {
            return isNameExpr.isMethod(isMethod(isNameExpr));
        }
        return isNameExpr.isMethod();
    }

    public <R> Optional<R> isMethod(Mapper<T, R> isParameter) {
        if (isNameExpr == null) {
            return isMethod();
        }
        return isMethod(isNameExpr.isMethod(isNameExpr));
    }

    public <R> Single<Optional<R>> isMethod(Mapper<T, Single<R>> isParameter) {
        if (isNameExpr == null) {
            return isNameExpr.isMethod(isMethod());
        }
        return isNameExpr.isMethod(isNameExpr).isMethod(Optional::of);
    }
}
