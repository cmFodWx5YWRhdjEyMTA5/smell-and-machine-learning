// isComment
package cri.sanity.pref;

import android.content.Context;
import android.content.Intent;
import android.preference.Preference;
import android.preference.Preference.OnPreferenceClickListener;
import android.util.AttributeSet;
import cri.sanity.screen.FilterActivity;
import cri.sanity.*;

public final class isClassOrIsInterface extends Preference implements OnPreferenceClickListener {

    private CharSequence isVariable;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
        isMethod();
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
        isMethod();
    }

    public isConstructor(Context isParameter, AttributeSet isParameter, int isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        isMethod();
    }

    private void isMethod() {
        CharSequence isVariable = isMethod();
        if (isNameExpr == null || isNameExpr.isMethod() <= isIntegerConstant)
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = isMethod();
        if (isNameExpr == null || isNameExpr.isMethod() <= isIntegerConstant)
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod();
        isMethod(true);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(this);
    }

    public final String isMethod() {
        final String isVariable = isMethod();
        return isNameExpr.isMethod(isNameExpr.isMethod('isStringConstant') + isIntegerConstant);
    }

    public final String isMethod() {
        return "isStringConstant" + isMethod();
    }

    public final void isMethod() {
        isMethod(isNameExpr + "isStringConstant" + isNameExpr.isMethod(isNameExpr.isMethod(isMethod()) ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + 'isStringConstant');
    }

    public final void isMethod(boolean isParameter) {
        isNameExpr.isMethod(isMethod(), isNameExpr);
        isMethod();
    }

    @Override
    public boolean isMethod(Preference isParameter) {
        final String isVariable = isMethod();
        if (isNameExpr.isMethod(isNameExpr))
            return true;
        String isVariable = null;
        try {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
        } catch (Exception isParameter) {
            try {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr + "isStringConstant"));
            } catch (Exception isParameter) {
            }
        }
        Intent isVariable = new Intent(isNameExpr.isMethod(), FilterActivity.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isFieldAccessExpr = this;
        isMethod().isMethod(isNameExpr);
        return true;
    }
}
