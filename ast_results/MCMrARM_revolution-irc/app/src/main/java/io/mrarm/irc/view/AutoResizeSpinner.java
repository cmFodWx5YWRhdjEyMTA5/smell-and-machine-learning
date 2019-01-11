// isComment
package io.mrarm.irc.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SpinnerAdapter;
import io.mrarm.irc.view.theme.ThemedSpinner;

public class isClassOrIsInterface extends ThemedSpinner {

    private final Rect isVariable = new Rect();

    private final LayoutParams isVariable = new LayoutParams(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, int isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    protected void isMethod(int isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr);
        SpinnerAdapter isVariable = isMethod();
        if (isNameExpr != null && isNameExpr.isMethod(isNameExpr) == isNameExpr.isFieldAccessExpr) {
            View isVariable = isNameExpr.isMethod(isMethod(), null, this);
            if (isNameExpr.isMethod() == null)
                isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            int isVariable = isNameExpr.isMethod();
            if (isMethod() != null) {
                isMethod().isMethod(isNameExpr);
                isNameExpr += isNameExpr.isFieldAccessExpr + isNameExpr.isFieldAccessExpr;
            }
            this.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr)), this.isMethod());
        }
    }
}
