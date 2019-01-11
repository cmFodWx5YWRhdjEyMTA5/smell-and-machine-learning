// isComment
package de.schildbach.wallet.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/**
 * isComment
 */
public class isClassOrIsInterface {

    @Test
    public void isMethod() throws Exception {
        final String isVariable = "isStringConstant";
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)));
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr.isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() throws Exception {
        final String isVariable = "isStringConstant";
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
        final String isVariable = "isStringConstant";
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
    }
}
