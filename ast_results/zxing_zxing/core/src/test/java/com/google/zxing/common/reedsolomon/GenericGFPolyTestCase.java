// isComment
package com.google.zxing.common.reedsolomon;

import org.junit.Assert;
import org.junit.Test;

/**
 * isComment
 */
public final class isClassOrIsInterface extends Assert {

    private static final GenericGF isVariable = isNameExpr.isFieldAccessExpr;

    @Test
    public void isMethod() {
        isMethod("isStringConstant", isNameExpr.isMethod().isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant, -isIntegerConstant).isMethod());
        GenericGFPoly isVariable = new GenericGFPoly(isNameExpr, new int[] { isIntegerConstant, isIntegerConstant, -isIntegerConstant, isIntegerConstant, isIntegerConstant });
        isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr = new GenericGFPoly(isNameExpr, new int[] { isIntegerConstant });
        isMethod("isStringConstant", isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(isIntegerConstant, isIntegerConstant));
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(isIntegerConstant, isIntegerConstant).isMethod(isIntegerConstant));
    }

    @Test
    public void isMethod() {
        isMethod(isIntegerConstant, isNameExpr.isMethod(isIntegerConstant, isIntegerConstant).isMethod(isIntegerConstant));
    }
}
