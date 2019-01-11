// isComment
package com.eleybourn.bookcatalogue.datamanager;

import com.eleybourn.bookcatalogue.R;

/**
 * isComment
 */
public class isClassOrIsInterface extends DefaultFieldValidator {

    isConstructor() {
        super();
    }

    isConstructor(String isParameter) {
        super(isNameExpr);
    }

    @Override
    public void isMethod(DataManager isParameter, Datum isParameter, boolean isParameter) {
        if (!isNameExpr.isMethod()) {
            // isComment
            return;
        }
        if (isNameExpr)
            return;
        // isComment
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        try {
            Float isVariable;
            Object isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr instanceof Float) {
                isNameExpr = (Float) isNameExpr;
            } else if (isNameExpr instanceof Double) {
                isNameExpr = ((Double) isNameExpr).isMethod();
            } else if (isNameExpr instanceof Integer) {
                isNameExpr = ((Integer) isNameExpr).isMethod();
            } else {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod());
            }
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            return;
        } catch (Exception isParameter) {
            throw new ValidatorException(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new Object[] { isNameExpr.isMethod() });
        }
    }
}
