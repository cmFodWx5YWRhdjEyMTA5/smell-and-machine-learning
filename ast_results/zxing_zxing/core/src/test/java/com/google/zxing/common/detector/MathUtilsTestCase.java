// isComment
package com.google.zxing.common.detector;

import org.junit.Assert;
import org.junit.Test;

/**
 * isComment
 */
public final class isClassOrIsInterface extends Assert {

    private static final float isVariable = isDoubleConstant;

    @Test
    public void isMethod() {
        isMethod(-isIntegerConstant, isNameExpr.isMethod(-isDoubleConstant));
        isMethod(isIntegerConstant, isNameExpr.isMethod(isDoubleConstant));
        isMethod(isIntegerConstant, isNameExpr.isMethod(isDoubleConstant));
        isMethod(isIntegerConstant, isNameExpr.isMethod(isDoubleConstant));
        isMethod(isIntegerConstant, isNameExpr.isMethod(isDoubleConstant));
        isMethod(isIntegerConstant, isNameExpr.isMethod(isDoubleConstant));
        isMethod(-isIntegerConstant, isNameExpr.isMethod(-isDoubleConstant));
        isMethod(-isIntegerConstant, isNameExpr.isMethod(-isDoubleConstant));
        // isComment
        isMethod(-isIntegerConstant, isNameExpr.isMethod(-isDoubleConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
    }

    @Test
    public void isMethod() {
        isMethod((float) isNameExpr.isMethod(isDoubleConstant), isNameExpr.isMethod(isDoubleConstant, isDoubleConstant, isDoubleConstant, isDoubleConstant), isNameExpr);
        isMethod(isDoubleConstant, isNameExpr.isMethod(isDoubleConstant, isDoubleConstant, isDoubleConstant, isDoubleConstant), isNameExpr);
        isMethod((float) isNameExpr.isMethod(isDoubleConstant), isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant), isNameExpr);
        isMethod(isDoubleConstant, isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant), isNameExpr);
    }

    @Test
    public void isMethod() {
        isMethod(isIntegerConstant, isNameExpr.isMethod(new int[] {}));
        isMethod(isIntegerConstant, isNameExpr.isMethod(new int[] { isIntegerConstant }));
        isMethod(isIntegerConstant, isNameExpr.isMethod(new int[] { isIntegerConstant, isIntegerConstant }));
        isMethod(isIntegerConstant, isNameExpr.isMethod(new int[] { -isIntegerConstant, isIntegerConstant }));
    }
}
