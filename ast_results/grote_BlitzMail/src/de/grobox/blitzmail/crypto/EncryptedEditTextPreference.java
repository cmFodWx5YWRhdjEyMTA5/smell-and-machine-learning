// isComment
package de.grobox.blitzmail.crypto;

import android.content.Context;
import android.preference.EditTextPreference;
import android.util.AttributeSet;

public class isClassOrIsInterface extends EditTextPreference {

    private Crypto isVariable;

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = new Crypto(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = new Crypto(isNameExpr);
    }

    public isConstructor(Context isParameter) {
        super(isNameExpr);
        isNameExpr = new Crypto(isNameExpr);
    }

    @Override
    public String isMethod() {
        String isVariable = super.isMethod();
        if (isNameExpr == null) {
            return null;
        } else {
            try {
                return isNameExpr.isMethod(isNameExpr);
            } catch (Exception isParameter) {
                return null;
            }
        }
    }

    @Override
    protected void isMethod(boolean isParameter, Object isParameter) {
        super.isMethod(isNameExpr ? isMethod(null) : (String) isNameExpr);
    }

    @Override
    public void isMethod(String isParameter) {
        if (isNameExpr == null) {
            super.isMethod(null);
            return;
        }
        super.isMethod(isNameExpr.isMethod(isNameExpr));
    }
}
