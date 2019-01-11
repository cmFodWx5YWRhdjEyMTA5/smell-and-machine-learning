// isComment
package com.dozuki.ifixit.ui.guide.create;

import android.content.Context;
import android.util.AttributeSet;
import com.viewpagerindicator.TitlePageIndicator;

public class isClassOrIsInterface extends TitlePageIndicator {

    private boolean isVariable = true;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(android.view.MotionEvent isParameter) {
        return this.isFieldAccessExpr && super.isMethod(isNameExpr);
    }

    public void isMethod(boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}
