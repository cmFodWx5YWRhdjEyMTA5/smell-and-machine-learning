// isComment
package me.sheimi.sgit.preference;

import android.content.Context;
import android.util.AttributeSet;

public class isClassOrIsInterface extends android.preference.EditTextPreference {

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
    public CharSequence isMethod() {
        CharSequence isVariable = super.isMethod();
        if (isNameExpr != null) {
            return isNameExpr.isMethod(isNameExpr.isMethod(), isMethod());
        } else {
            return isNameExpr;
        }
    }
}
