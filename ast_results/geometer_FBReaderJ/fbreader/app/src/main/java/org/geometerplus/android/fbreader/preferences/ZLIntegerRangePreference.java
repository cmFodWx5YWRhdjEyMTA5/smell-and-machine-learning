// isComment
package org.geometerplus.android.fbreader.preferences;

import android.content.Context;
import android.preference.ListPreference;
import org.geometerplus.zlibrary.core.resources.ZLResource;
import org.geometerplus.zlibrary.core.options.ZLIntegerRangeOption;

class isClassOrIsInterface extends ListPreference {

    private final ZLIntegerRangeOption isVariable;

    isConstructor(Context isParameter, ZLResource isParameter, ZLIntegerRangeOption isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr;
        isMethod(isNameExpr.isMethod());
        String[] isVariable = new String[isNameExpr.isFieldAccessExpr - isNameExpr.isFieldAccessExpr + isIntegerConstant];
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isFieldAccessExpr; ++isNameExpr) {
            isNameExpr[isNameExpr] = ((Integer) (isNameExpr + isNameExpr.isFieldAccessExpr)).isMethod();
        }
        isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod() - isNameExpr.isFieldAccessExpr);
        isMethod(isMethod());
    }

    @Override
    protected void isMethod(boolean isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr) {
            final String isVariable = isMethod();
            isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr + isMethod(isNameExpr));
        }
    }
}
