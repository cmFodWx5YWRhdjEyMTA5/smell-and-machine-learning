// isComment
package org.andstatus.app.data.converter;

import org.andstatus.app.account.MyAccountConverter;
import org.andstatus.app.data.DbUtils;

class isClassOrIsInterface extends ConvertOneStep {

    @Override
    protected void isMethod() {
        isNameExpr = isIntegerConstant;
        boolean isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr) == isNameExpr;
        if (isNameExpr) {
            isNameExpr = "isStringConstant";
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
    }
}
