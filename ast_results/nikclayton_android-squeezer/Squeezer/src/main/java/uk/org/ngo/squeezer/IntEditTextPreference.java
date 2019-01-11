// isComment
package uk.org.ngo.squeezer;

import android.content.Context;
import android.preference.EditTextPreference;
import android.util.AttributeSet;

public class isClassOrIsInterface extends EditTextPreference {

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    protected String isMethod(String isParameter) {
        return isNameExpr.isMethod(isMethod(isIntegerConstant));
    }

    @Override
    protected boolean isMethod(String isParameter) {
        return isMethod(isNameExpr.isMethod(isNameExpr));
    }
}
