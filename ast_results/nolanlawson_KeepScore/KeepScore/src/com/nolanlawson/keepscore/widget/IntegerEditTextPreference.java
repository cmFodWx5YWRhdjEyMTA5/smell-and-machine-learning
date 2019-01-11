// isComment
package com.nolanlawson.keepscore.widget;

import android.content.Context;
import android.preference.EditTextPreference;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;

/**
 * isComment
 */
public class isClassOrIsInterface extends EditTextPreference {

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        isMethod();
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        isMethod();
    }

    public isConstructor(Context isParameter) {
        super(isNameExpr);
        isMethod();
    }

    private void isMethod() {
        isMethod().isMethod(isNameExpr.isMethod(true, true));
    }
}
