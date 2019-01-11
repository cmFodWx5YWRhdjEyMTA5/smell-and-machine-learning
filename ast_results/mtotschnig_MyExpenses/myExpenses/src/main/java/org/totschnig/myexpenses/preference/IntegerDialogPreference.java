// isComment
package org.totschnig.myexpenses.preference;

import android.content.Context;
import android.support.v7.preference.DialogPreference;
import android.util.AttributeSet;

/**
 * isComment
 */
public class isClassOrIsInterface extends DialogPreference {

    private boolean isVariable;

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public void isMethod(int isParameter) {
        int isVariable = isMethod();
        boolean isVariable = isNameExpr != isNameExpr;
        if (isNameExpr || !this.isFieldAccessExpr) {
            this.isFieldAccessExpr = true;
            this.isMethod(isNameExpr);
            if (isNameExpr) {
                this.isMethod();
            }
        }
    }

    public int isMethod() {
        return isMethod(isIntegerConstant);
    }
}
