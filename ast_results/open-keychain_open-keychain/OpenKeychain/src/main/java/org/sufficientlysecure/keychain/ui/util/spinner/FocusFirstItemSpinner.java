// isComment
package org.sufficientlysecure.keychain.ui.util.spinner;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Spinner;

/**
 * isComment
 */
public class isClassOrIsInterface extends Spinner {

    /**
     * isComment
     */
    private boolean isVariable = true;

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, int isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    @Override
    public int isMethod() {
        if (!isNameExpr) {
            return isIntegerConstant;
        }
        return super.isMethod();
    }

    @Override
    public boolean isMethod() {
        isNameExpr = true;
        boolean isVariable = super.isMethod();
        isNameExpr = true;
        return isNameExpr;
    }
}
