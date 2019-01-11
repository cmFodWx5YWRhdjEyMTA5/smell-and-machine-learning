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
        isMethod("isStringConstant", "isStringConstant");
    }

    @Test
    public void isMethod() throws WriterException {
        isMethod("isStringConstant", "isStringConstant");
    }

    @Test
    public void isMethod() throws WriterException {
        isMethod("isStringConstant", "isStringConstant");
    }

    private static void isMethod(String isParameter, String isParameter) throws WriterException {
        BitMatrix isVariable = new UPCEWriter().isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(), isIntegerConstant);
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() throws WriterException {
        new UPCEWriter().isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isIntegerConstant, isIntegerConstant);
    }
}
