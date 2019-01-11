// isComment
package org.wordpress.android.widgets;

import android.content.Context;
import android.preference.EditTextPreference;
import android.util.AttributeSet;

public class isClassOrIsInterface extends EditTextPreference {

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    protected void isMethod(boolean isParameter) {
        super.isMethod(isNameExpr);
        if (!isNameExpr) {
            isMethod(null);
        }
    }
}
