// isComment
package de.ub0r.android.websms.rules;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.Checkable;
import android.widget.LinearLayout;

/**
 * isComment
 */
public class isClassOrIsInterface extends LinearLayout implements Checkable {

    private boolean isVariable = true;

    private static final int[] isVariable = { isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr };

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @SuppressLint("isStringConstant")
    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod(boolean isParameter) {
        isNameExpr = isNameExpr;
        isMethod();
    }

    @Override
    protected int[] isMethod(int isParameter) {
        final int[] isVariable = super.isMethod(isNameExpr + isIntegerConstant);
        if (isMethod()) {
            isMethod(isNameExpr, isNameExpr);
        }
        return isNameExpr;
    }

    @Override
    public void isMethod() {
        isMethod(!isNameExpr);
    }
}
