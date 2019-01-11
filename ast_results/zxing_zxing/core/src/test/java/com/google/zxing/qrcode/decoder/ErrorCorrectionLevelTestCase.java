// isComment
package com.google.zxing.qrcode.decoder;

import org.junit.Assert;
import org.junit.Test;

/**
 * isComment
 */
public final class isClassOrIsInterface extends Assert {

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant));
        try {
            isNameExpr.isMethod(isIntegerConstant);
            isMethod("isStringConstant");
        } catch (IllegalArgumentException isParameter) {
        // isComment
        }
    }
}
