// isComment
package it.sasabz.android.sasabus.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.Button;

public class isClassOrIsInterface extends Button {

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(MotionEvent isParameter) {
        if (!isMethod() && isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            isMethod();
        }
        return super.isMethod(isNameExpr);
    }
}
