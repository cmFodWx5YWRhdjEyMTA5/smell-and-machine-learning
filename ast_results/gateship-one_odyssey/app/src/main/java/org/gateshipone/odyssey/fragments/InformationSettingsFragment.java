// isComment
package org.gateshipone.odyssey.fragments;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.preference.PreferenceFragmentCompat;
import org.gateshipone.odyssey.R;
import org.gateshipone.odyssey.listener.ToolbarAndFABCallback;

public class isClassOrIsInterface extends PreferenceFragmentCompat {

    /**
     * isComment
     */
    private ToolbarAndFABCallback isVariable;

    public static InformationSettingsFragment isMethod() {
        return new InformationSettingsFragment();
    }

    @Override
    public void isMethod(Bundle isParameter, String isParameter) {
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    @Override
    public void isMethod(Context isParameter) {
        super.isMethod(isNameExpr);
        try {
            isNameExpr = (ToolbarAndFABCallback) isNameExpr;
        } catch (ClassCastException isParameter) {
            throw new ClassCastException(isNameExpr.isMethod() + "isStringConstant");
        }
    }

    /**
     * isComment
     */
    @Override
    public void isMethod() {
        super.isMethod();
        if (isNameExpr != null) {
            // isComment
            isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true, true, true);
            // isComment
            isNameExpr.isMethod(null);
        }
    }
}
