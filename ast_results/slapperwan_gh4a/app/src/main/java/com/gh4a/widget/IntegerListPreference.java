// isComment
package com.gh4a.widget;

import android.content.Context;
import android.support.v7.preference.ListPreference;
import android.util.AttributeSet;

public class isClassOrIsInterface extends ListPreference {

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    public isConstructor(Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    protected boolean isMethod(String isParameter) {
        if (isNameExpr == null) {
            return true;
        }
        return isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Override
    protected String isMethod(String isParameter) {
        if (!isMethod().isMethod(isMethod())) {
            return isNameExpr;
        }
        return isNameExpr.isMethod(isMethod(isIntegerConstant));
    }
}
