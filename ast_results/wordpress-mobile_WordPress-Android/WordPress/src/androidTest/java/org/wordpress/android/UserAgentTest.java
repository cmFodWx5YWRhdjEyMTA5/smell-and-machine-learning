// isComment
package org.wordpress.android;

import junit.framework.TestCase;

public class isClassOrIsInterface extends TestCase {

    /**
     * isComment
     */
    private static final String isVariable = "isStringConstant";

    public void isMethod() {
        String isVariable = isNameExpr.isMethod();
        isMethod("isStringConstant", isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod() > isIntegerConstant);
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
    }

    public void isMethod() {
        String isVariable = isNameExpr.isMethod();
        isMethod("isStringConstant", isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod() > isIntegerConstant);
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
        String isVariable = isNameExpr.isMethod();
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
    }
}
