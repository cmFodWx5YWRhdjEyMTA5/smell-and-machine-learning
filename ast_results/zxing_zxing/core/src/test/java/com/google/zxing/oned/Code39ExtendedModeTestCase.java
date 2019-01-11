// isComment
package com.google.zxing.oned;

import org.junit.Assert;
import org.junit.Test;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.BitArray;
import com.google.zxing.ChecksumException;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;

/**
 * isComment
 */
public final class isClassOrIsInterface extends Assert {

    @Test
    public void isMethod() throws Exception {
        isMethod("isStringConstant", "isStringConstant");
        isMethod("isStringConstant", "isStringConstant");
        isMethod("isStringConstant", "isStringConstant");
        isMethod("isStringConstant", "isStringConstant");
    }

    private static void isMethod(String isParameter, String isParameter) throws FormatException, ChecksumException, NotFoundException {
        Code39Reader isVariable = new Code39Reader(true, true);
        BitMatrix isVariable = isNameExpr.isMethod(isNameExpr, "isStringConstant", "isStringConstant");
        BitArray isVariable = new BitArray(isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        Result isVariable = isNameExpr.isMethod(isIntegerConstant, isNameExpr, null);
        isMethod(isNameExpr, isNameExpr.isMethod());
    }
}
