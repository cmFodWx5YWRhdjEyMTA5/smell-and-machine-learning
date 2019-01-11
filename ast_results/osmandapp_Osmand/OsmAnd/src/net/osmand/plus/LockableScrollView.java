// isComment
package net.osmand.plus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;

public class isClassOrIsInterface extends ScrollView {

    // isComment
    // isComment
    private boolean isVariable = true;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public void isMethod(boolean isParameter) {
        isNameExpr = isNameExpr;
    }

    public boolean isMethod() {
        return isNameExpr;
    }

    @Override
    public boolean isMethod(MotionEvent isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr:
                // isComment
                if (isNameExpr) {
                    return super.isMethod(isNameExpr);
                }
                // isComment
                return true;
            default:
                return super.isMethod(isNameExpr);
        }
    }

    @Override
    public boolean isMethod(MotionEvent isParameter) {
        // isComment
        if (!isNameExpr) {
            return true;
        } else {
            return super.isMethod(isNameExpr);
        }
    }
}
