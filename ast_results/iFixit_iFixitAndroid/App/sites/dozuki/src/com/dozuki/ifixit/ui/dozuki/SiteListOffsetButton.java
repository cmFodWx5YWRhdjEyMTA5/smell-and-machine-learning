// isComment
package com.dozuki.ifixit.ui.dozuki;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;
import com.dozuki.ifixit.R;

public class isClassOrIsInterface extends Button {

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    @Override
    public boolean isMethod(MotionEvent isParameter) {
        boolean isVariable = super.isMethod(isNameExpr);
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isMethod(isMethod(), isMethod() + isIntegerConstant, isMethod(), isMethod() - isIntegerConstant);
        }
        return isNameExpr;
    }
}
