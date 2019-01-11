// isComment
package com.rascarlo.aurdroid.viewmodels;

import android.arch.lifecycle.ViewModel;
import android.arch.lifecycle.ViewModelProvider;
import android.support.annotation.NonNull;

public class isClassOrIsInterface implements ViewModelProvider.Factory {

    private final String isVariable;

    public isConstructor(String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @NonNull
    @Override
    public <T extends ViewModel> T isMethod(@NonNull Class<T> isParameter) {
        if (isNameExpr.isMethod(InfoViewModel.class)) {
            return (T) new InfoViewModel(isNameExpr);
        }
        throw new IllegalArgumentException("isStringConstant");
    }
}
