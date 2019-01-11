// isComment
package com.github.pockethub.android.rx;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import com.uber.autodispose.AutoDispose;
import com.uber.autodispose.AutoDisposeConverter;
import com.uber.autodispose.android.lifecycle.AndroidLifecycleScopeProvider;

public class isClassOrIsInterface {

    public static <T> AutoDisposeConverter<T> isMethod(LifecycleOwner isParameter) {
        return isMethod(isNameExpr.isMethod());
    }

    public static <T> AutoDisposeConverter<T> isMethod(Lifecycle isParameter) {
        return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
    }

    public static <T> AutoDisposeConverter<T> isMethod(LifecycleOwner isParameter, Lifecycle.Event isParameter) {
        return isMethod(isNameExpr.isMethod(), isNameExpr);
    }

    public static <T> AutoDisposeConverter<T> isMethod(Lifecycle isParameter, Lifecycle.Event isParameter) {
        return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr));
    }
}
