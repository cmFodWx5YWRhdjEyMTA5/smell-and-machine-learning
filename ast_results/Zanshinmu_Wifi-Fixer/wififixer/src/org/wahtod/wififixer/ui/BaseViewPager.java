// isComment
package org.wahtod.wififixer.ui;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/*isComment*/
public class isClassOrIsInterface extends ViewPager {

    private boolean isVariable;

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        this.isFieldAccessExpr = true;
    }

    @Override
    public boolean isMethod(MotionEvent isParameter) {
        if (this.isFieldAccessExpr) {
            return super.isMethod(isNameExpr);
        }
        return true;
    }

    @Override
    public boolean isMethod(MotionEvent isParameter) {
        if (this.isFieldAccessExpr) {
            return super.isMethod(isNameExpr);
        }
        return true;
    }

    public boolean isMethod() {
        return isNameExpr;
    }

    public void isMethod(boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}
