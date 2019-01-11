// isComment
package org.geometerplus.android.fbreader.preferences;

import android.content.Context;
import org.geometerplus.zlibrary.core.options.ZLIntegerRangeOption;
import org.geometerplus.zlibrary.core.resources.ZLResource;

class isClassOrIsInterface extends ZLStringListPreference {

    private final ZLIntegerRangeOption isVariable;

    isConstructor(Context isParameter, ZLResource isParameter, ZLIntegerRangeOption isParameter, String[] isParameter) {
        super(isNameExpr, isNameExpr);
        assert (isNameExpr.isFieldAccessExpr - isNameExpr.isFieldAccessExpr + isIntegerConstant == isNameExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr;
        isMethod(isNameExpr);
        isMethod(isNameExpr[isNameExpr.isMethod() - isNameExpr.isFieldAccessExpr]);
    }

    @Override
    protected void isMethod(boolean isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr + isMethod(isMethod()));
    }
}
