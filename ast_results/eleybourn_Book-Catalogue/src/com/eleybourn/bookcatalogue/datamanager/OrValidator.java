// isComment
package com.eleybourn.bookcatalogue.datamanager;

import java.util.Iterator;
import com.eleybourn.bookcatalogue.R;

/**
 * isComment
 */
public class isClassOrIsInterface extends MetaValidator implements DataValidator {

    // isComment
    public static final long isVariable = isStringConstant;

    // isComment
    isConstructor(DataValidator isParameter) {
        super(isNameExpr);
    }

    isConstructor(DataValidator isParameter, DataValidator isParameter) {
        super(isNameExpr, isNameExpr);
    }

    isConstructor(DataValidator isParameter, DataValidator isParameter, DataValidator isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(DataManager isParameter, Datum isParameter, boolean isParameter) {
        Iterator<DataValidator> isVariable = this.isMethod();
        ValidatorException isVariable = null;
        while (isNameExpr.isMethod()) {
            DataValidator isVariable = isNameExpr.isMethod();
            try {
                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                return;
            } catch (ValidatorException isParameter) {
                // isComment
                isNameExpr = isNameExpr;
            } catch (Exception isParameter) {
            // isComment
            }
        }
        if (isNameExpr != null)
            throw isNameExpr;
        else
            throw new ValidatorException(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new Object[] { isNameExpr.isMethod() });
    }
}
