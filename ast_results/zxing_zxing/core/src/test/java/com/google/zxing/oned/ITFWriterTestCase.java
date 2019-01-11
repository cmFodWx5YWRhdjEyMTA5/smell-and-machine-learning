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
        isMethod("isStringConstant", "isStringConstant" + "isStringConstant");
    }

    private static void isMethod(String isParameter, CharSequence isParameter) throws WriterException {
        BitMatrix isVariable = new ITFWriter().isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isIntegerConstant, isIntegerConstant);
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() throws WriterException {
        new ITFWriter().isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isIntegerConstant, isIntegerConstant);
    }
}
