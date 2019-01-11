// isComment
package de.tap.easy_xkcd.misc;

import android.content.Context;
import androidx.viewpager.widget.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * isComment
 */
public class isClassOrIsInterface extends ViewPager {

    private boolean isVariable;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
        isNameExpr = true;
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = true;
    }

    @Override
    public boolean isMethod(MotionEvent isParameter) {
        if (!isNameExpr) {
            try {
                return super.isMethod(isNameExpr);
            } catch (IllegalArgumentException isParameter) {
                isNameExpr.isMethod();
                return true;
            }
        }
        return true;
    }

    @Override
    public boolean isMethod(MotionEvent isParameter) {
        return !isNameExpr && super.isMethod(isNameExpr);
    }

    public void isMethod(boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}
