// isComment
package org.andstatus.app.data.converter;

import org.andstatus.app.data.DbUtils;

class isClassOrIsInterface extends ConvertOneStep {

    @Override
    protected void isMethod() {
        isNameExpr = isIntegerConstant;
        isNameExpr = "isStringConstant";
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr = "isStringConstant";
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }
}
