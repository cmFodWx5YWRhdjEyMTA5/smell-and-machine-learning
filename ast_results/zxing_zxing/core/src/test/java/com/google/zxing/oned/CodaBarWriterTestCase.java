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
        isMethod("isStringConstant", "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant");
    }

    @Test
    public void isMethod() throws WriterException {
        isMethod("isStringConstant", "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant");
    }

    @Test
    public void isMethod() throws WriterException {
        isMethod(isMethod("isStringConstant"), isMethod("isStringConstant"));
    }

    private static void isMethod(String isParameter, CharSequence isParameter) throws WriterException {
        BitMatrix isVariable = isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
    }

    private static BitMatrix isMethod(String isParameter) throws WriterException {
        return new CodaBarWriter().isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isIntegerConstant, isIntegerConstant);
    }
}
