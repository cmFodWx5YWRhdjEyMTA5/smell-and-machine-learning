// isComment
package com.dozuki.ifixit.ui.guide.create;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class isClassOrIsInterface extends ViewPager {

    private boolean isVariable;

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        this.isFieldAccessExpr = true;
    }

    @Override
    public boolean isMethod(MotionEvent isParameter) {
        return this.isFieldAccessExpr && super.isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(MotionEvent isParameter) {
        return this.isFieldAccessExpr && super.isMethod(isNameExpr);
    }

    public void isMethod(boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public boolean isMethod() {
        return this.isFieldAccessExpr;
    }
}
