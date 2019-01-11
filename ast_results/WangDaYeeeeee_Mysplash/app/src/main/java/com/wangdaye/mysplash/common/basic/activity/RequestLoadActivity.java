// isComment
package com.wangdaye.mysplash.common.basic.activity;

import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

public abstract class isClassOrIsInterface<T> extends ReadWriteActivity {

    @Nullable
    private List<T> isVariable;

    private boolean isVariable;

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr = true;
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        if (isNameExpr != null) {
            for (T isVariable : isNameExpr) {
                isMethod(isNameExpr);
            }
            isNameExpr = null;
        }
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr = true;
    }

    public void isMethod(T isParameter) {
        if (isNameExpr) {
            isMethod(isNameExpr);
        } else {
            if (isNameExpr == null) {
                isNameExpr = new ArrayList<>();
            }
            isNameExpr.isMethod(isNameExpr);
        }
    }

    public abstract void isMethod(T isParameter);
}
