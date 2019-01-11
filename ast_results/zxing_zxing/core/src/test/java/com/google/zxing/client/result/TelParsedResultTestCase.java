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
        isMethod("isStringConstant", "isStringConstant", null);
        isMethod("isStringConstant", "isStringConstant", null);
    }

    private static void isMethod(String isParameter, String isParameter, String isParameter) {
        Result isVariable = new Result(isNameExpr, null, null, isNameExpr.isFieldAccessExpr);
        ParsedResult isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        TelParsedResult isVariable = (TelParsedResult) isNameExpr;
        isMethod(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod());
        isMethod("isStringConstant" + isNameExpr, isNameExpr.isMethod());
    }
}
