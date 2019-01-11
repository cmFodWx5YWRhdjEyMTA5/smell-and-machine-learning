// isComment
package org.wordpress.android.widgets;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import org.wordpress.android.util.AppLog;
import org.wordpress.android.util.AppLog.T;

/**
 * isComment
 */
public class isClassOrIsInterface extends ViewPager {

    private boolean isVariable = true;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(MotionEvent isParameter) {
        if (isNameExpr) {
            try {
                return super.isMethod(isNameExpr);
            } catch (IllegalArgumentException isParameter) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            }
        }
        return true;
    }

    // isComment
    @SuppressLint("isStringConstant")
    @Override
    public boolean isMethod(MotionEvent isParameter) {
        if (isNameExpr) {
            try {
                return super.isMethod(isNameExpr);
            } catch (IllegalArgumentException isParameter) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
            }
        }
        return true;
    }

    public void isMethod(boolean isParameter) {
        isNameExpr = isNameExpr;
    }
}
