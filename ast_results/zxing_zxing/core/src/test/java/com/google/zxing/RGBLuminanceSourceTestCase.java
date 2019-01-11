// isComment
package com.google.zxing;

import org.junit.Assert;
import org.junit.Test;

/**
 * isComment
 */
public final class isClassOrIsInterface extends Assert {

    private static final RGBLuminanceSource isVariable = new RGBLuminanceSource(isIntegerConstant, isIntegerConstant, new int[] { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant });

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod());
        LuminanceSource isVariable = isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(new byte[] { isIntegerConstant }, isNameExpr.isMethod(isIntegerConstant, null));
    }

    @Test
    public void isMethod() {
        isMethod(new byte[] { isIntegerConstant, isIntegerConstant, (byte) isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, isNameExpr.isMethod());
        LuminanceSource isVariable = isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant);
        isMethod(new byte[] { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, isNameExpr.isMethod());
        LuminanceSource isVariable = isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant);
        isMethod(new byte[] { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        isMethod(new byte[] { isIntegerConstant, isIntegerConstant, isIntegerConstant }, isNameExpr.isMethod(isIntegerConstant, new byte[isIntegerConstant]));
    }

    @Test
    public void isMethod() {
        isMethod("isStringConstant", isNameExpr.isMethod());
    }
}
