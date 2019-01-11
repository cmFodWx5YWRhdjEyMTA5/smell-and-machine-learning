// isComment
package com.llamacorp.equate.view.IdlingResource;

import android.support.annotation.Nullable;
import android.support.test.espresso.IdlingResource;
import java.util.concurrent.atomic.AtomicBoolean;

public class isClassOrIsInterface implements IdlingResource {

    @Nullable
    private volatile ResourceCallback isVariable;

    // isComment
    private AtomicBoolean isVariable = new AtomicBoolean(true);

    @Override
    public String isMethod() {
        return this.isMethod().isMethod();
    }

    @Override
    public boolean isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public void isMethod(ResourceCallback isParameter) {
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(boolean isParameter) {
        isNameExpr.isMethod(isNameExpr);
        if (isNameExpr && isNameExpr != null) {
            isNameExpr.isMethod();
        }
    }
}
