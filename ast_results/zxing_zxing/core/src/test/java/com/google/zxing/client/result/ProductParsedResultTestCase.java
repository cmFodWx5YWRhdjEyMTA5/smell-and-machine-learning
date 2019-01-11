// isComment
package com.google.zxing.client.result;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import org.junit.Assert;
import org.junit.Test;

/**
 * isComment
 */
public final class isClassOrIsInterface extends Assert {

    @Test
    public void isMethod() {
        isMethod("isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr);
    }

    private static void isMethod(String isParameter, String isParameter, BarcodeFormat isParameter) {
        Result isVariable = new Result(isNameExpr, null, null, isNameExpr);
        ParsedResult isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        ProductParsedResult isVariable = (ProductParsedResult) isNameExpr;
        isMethod(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod());
    }
}
