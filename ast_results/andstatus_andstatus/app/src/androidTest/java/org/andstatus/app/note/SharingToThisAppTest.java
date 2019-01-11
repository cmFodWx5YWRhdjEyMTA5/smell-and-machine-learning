// isComment
package org.andstatus.app.note;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        String isVariable = "isStringConstant";
        String isVariable = isNameExpr + "isStringConstant";
        String isVariable = "isStringConstant";
        String isVariable = "isStringConstant";
        isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, true);
        isMethod(isNameExpr, "isStringConstant", isNameExpr, isNameExpr, true);
        isMethod("isStringConstant", "isStringConstant", isNameExpr, "isStringConstant", true);
        isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr, true);
        isMethod(isNameExpr, isNameExpr, isNameExpr, "isStringConstant", true);
        isMethod(isNameExpr, "isStringConstant", isNameExpr, isNameExpr, true);
        isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr, true);
        isMethod(isNameExpr, isNameExpr, "isStringConstant", isNameExpr, true);
    }

    private void isMethod(String isParameter, String isParameter, String isParameter, String isParameter, boolean isParameter) {
        String isVariable = isNameExpr + isNameExpr + isNameExpr;
        isMethod(isNameExpr + isNameExpr, isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr.isMethod(isNameExpr + isNameExpr).isMethod(), isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)));
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr, isNameExpr));
    }
}
