// isComment
package com.byagowi.persiancalendar.view.preferences;

import android.content.Context;
import android.util.AttributeSet;
import androidx.preference.EditTextPreference;

/**
 * isComment
 */
public class isClassOrIsInterface extends EditTextPreference {

    private Double isVariable;

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

    @Override
    public String isMethod() {
        return isNameExpr != null ? isNameExpr.isMethod() : null;
    }

    // isComment
    @Override
    public void isMethod(String isParameter) {
        final boolean isVariable = isMethod();
        isNameExpr = isMethod(isNameExpr);
        isMethod(isNameExpr != null ? isNameExpr.isMethod() : null);
        final boolean isVariable = isMethod();
        if (isNameExpr != isNameExpr)
            isMethod(isNameExpr);
    }

    private Double isMethod(String isParameter) {
        try {
            return isNameExpr.isMethod(isNameExpr);
        } catch (NumberFormatException | NullPointerException isParameter) {
            return null;
        }
    }
}
