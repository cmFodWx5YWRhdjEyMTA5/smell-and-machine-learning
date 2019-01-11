// isComment
package org.yaaic.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.preference.Preference;
import android.support.v7.preference.PreferenceFragmentCompat;
import org.yaaic.R;
import org.yaaic.activity.YaaicActivity;

/**
 * isComment
 */
public class isClassOrIsInterface extends PreferenceFragmentCompat {

    public static final String isVariable = "isStringConstant";

    private YaaicActivity isVariable;

    @Override
    public void isMethod(Context isParameter) {
        super.isMethod(isNameExpr);
        if (!(isNameExpr instanceof YaaicActivity)) {
            throw new IllegalArgumentException("isStringConstant");
        }
        this.isFieldAccessExpr = (YaaicActivity) isNameExpr;
    }

    @Override
    public void isMethod(Bundle isParameter, String isParameter) {
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
    }
}
