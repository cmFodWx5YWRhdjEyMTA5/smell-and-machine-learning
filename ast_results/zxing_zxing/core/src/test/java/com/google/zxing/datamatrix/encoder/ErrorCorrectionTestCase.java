// isComment
package com.google.zxing.datamatrix.encoder;

import org.junit.Assert;
import org.junit.Test;

/**
 * isComment
 */
public final class isClassOrIsInterface extends Assert {

    @Test
    public void isMethod() {
        // isComment
        char[] isVariable = { isIntegerConstant, isIntegerConstant, isIntegerConstant };
        SymbolInfo isVariable = isNameExpr.isMethod(isIntegerConstant);
        CharSequence isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
        // isComment
        isNameExpr = new char[] { isIntegerConstant, isIntegerConstant, isIntegerConstant };
        isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
    }
}
