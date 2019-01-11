// isComment
package com.google.zxing.datamatrix.decoder;

import org.junit.Assert;
import org.junit.Test;

/**
 * isComment
 */
public final class isClassOrIsInterface extends Assert {

    @Test
    public void isMethod() throws Exception {
        // isComment
        byte[] isVariable = { (byte) ('isStringConstant' + isIntegerConstant), (byte) ('isStringConstant' + isIntegerConstant), (byte) ('isStringConstant' + isIntegerConstant), (byte) ('isStringConstant' + isIntegerConstant), (byte) ('isStringConstant' + isIntegerConstant), (byte) ('isStringConstant' + isIntegerConstant) };
        String isVariable = isNameExpr.isMethod(isNameExpr).isMethod();
        isMethod("isStringConstant", isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        byte[] isVariable = { (byte) isIntegerConstant, (byte) (isIntegerConstant + isIntegerConstant), (byte) (isIntegerConstant + isIntegerConstant), (byte) (isIntegerConstant + isIntegerConstant) };
        String isVariable = isNameExpr.isMethod(isNameExpr).isMethod();
        isMethod("isStringConstant", isNameExpr);
    }
}
