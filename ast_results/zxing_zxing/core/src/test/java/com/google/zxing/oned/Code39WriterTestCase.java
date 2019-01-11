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
        isMethod("isStringConstant", "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant");
        // isComment
        isMethod("isStringConstant", "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant");
        isMethod("isStringConstant", "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant");
        isMethod("isStringConstant", "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant");
        isMethod("isStringConstant", "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant");
    }

    private static void isMethod(String isParameter, CharSequence isParameter) throws WriterException {
        BitMatrix isVariable = new Code39Writer().isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isIntegerConstant, isIntegerConstant);
        isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod(isNameExpr));
    }
}
