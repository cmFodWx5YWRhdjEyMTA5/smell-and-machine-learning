// isComment
package me.sheimi.sgit.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.AttributeSet;
import me.sheimi.sgit.R;

public class isClassOrIsInterface extends android.preference.Preference {

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
            SharedPreferences isVariable = isMethod().isMethod(isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr);
            String isVariable = isNameExpr.isMethod(isMethod(), "isStringConstant");
            return isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
        } else {
            return isNameExpr;
        }
    }
}
