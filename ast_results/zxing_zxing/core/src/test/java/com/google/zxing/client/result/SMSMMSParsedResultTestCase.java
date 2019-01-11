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
        isMethod("isStringConstant", "isStringConstant", null, null, null, "isStringConstant");
        isMethod("isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", null, "isStringConstant");
        isMethod("isStringConstant", "isStringConstant", null, null, "isStringConstant", "isStringConstant");
    }

    @Test
    public void isMethod() {
        isMethod("isStringConstant", "isStringConstant", null, null, null, "isStringConstant");
        isMethod("isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant", null, "isStringConstant");
        isMethod("isStringConstant", "isStringConstant", null, null, "isStringConstant", "isStringConstant");
    }

    private static void isMethod(String isParameter, String isParameter, String isParameter, String isParameter, String isParameter, String isParameter) {
        Result isVariable = new Result(isNameExpr, null, null, isNameExpr.isFieldAccessExpr);
        ParsedResult isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        SMSParsedResult isVariable = (SMSParsedResult) isNameExpr;
        isMethod(new String[] { isNameExpr }, isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod());
        isMethod(new String[] { isNameExpr }, isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod());
    }
}
