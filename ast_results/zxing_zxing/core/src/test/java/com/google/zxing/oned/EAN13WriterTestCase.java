// isComment
package com.google.zxing.oned;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.BitMatrixTestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * isComment
 */
public final class isClassOrIsInterface extends Assert {

    @Test
    public void isMethod() throws WriterException {
        String isVariable = "isStringConstant";
        BitMatrix isVariable = new EAN13Writer().isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(), isIntegerConstant);
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
    }

    @Test
    public void isMethod() throws WriterException {
        String isVariable = "isStringConstant";
        BitMatrix isVariable = new EAN13Writer().isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(), isIntegerConstant);
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() throws WriterException {
        new EAN13Writer().isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isIntegerConstant, isIntegerConstant);
    }
}
