// isComment
package io.github.hidroh.materialistic.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;

public class isClassOrIsInterface extends android.support.v4.view.ViewPager {

    private boolean isVariable = true;

    public isConstructor(Context isParameter) {
        this(isNameExpr, null);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(MotionEvent isParameter) {
        return isNameExpr && super.isMethod(isNameExpr);
    }

    public void isMethod(boolean isParameter) {
        isNameExpr = isNameExpr;
    }
}
