// isComment
package se.embargo.retroboy.widget;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ImageButton;

public class isClassOrIsInterface extends ImageButton {

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
    public boolean isMethod(MotionEvent isParameter) {
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            if (isMethod()) {
                isMethod(isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant));
            }
        } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            isMethod();
        }
        return super.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(boolean isParameter) {
        super.isMethod(isNameExpr);
        isMethod();
    }

    private void isMethod() {
        if (isMethod()) {
            isMethod(isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant));
        } else {
            isMethod(isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant));
        }
    }
}
