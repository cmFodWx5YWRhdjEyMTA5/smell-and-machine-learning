// isComment
package com.app.missednotificationsreminder.binding.util;

import android.databinding.ObservableField;
import android.support.annotation.CheckResult;
import android.support.annotation.NonNull;
import rx.functions.Action1;

/**
 * isComment
 */
public class isClassOrIsInterface<T> extends BaseObservable {

    volatile T isVariable;

    /**
     * isComment
     */
    public isConstructor() {
    }

    /**
     * isComment
     */
    public isConstructor(T isParameter) {
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(T isParameter) {
        if (!isMethod(isNameExpr, isNameExpr)) {
            isNameExpr = isNameExpr;
            isMethod();
        }
    }

    public T isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public boolean isMethod(T isParameter, T isParameter) {
        return (isNameExpr == isNameExpr) || (isNameExpr != null && isNameExpr.isMethod(isNameExpr));
    }

    /**
     * isComment
     */
    @CheckResult
    @NonNull
    public Action1<? super T> isMethod() {
        return new Action1<T>() {

            @Override
            public void isMethod(T isParameter) {
                isMethod(isNameExpr);
            }
        };
    }
}
