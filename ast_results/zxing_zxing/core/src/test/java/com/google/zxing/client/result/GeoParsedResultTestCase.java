// isComment
package com.google.zxing.client.result;

import java.util.Locale;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import org.junit.Assert;
import org.junit.Test;

/**
 * isComment
 */
public final class isClassOrIsInterface extends Assert {

    private static final double isVariable = isDoubleConstant;

    @Test
    public void isMethod() {
        isMethod("isStringConstant", isDoubleConstant, isDoubleConstant, isDoubleConstant, null, "isStringConstant");
        isMethod("isStringConstant", isDoubleConstant, -isDoubleConstant, isDoubleConstant, null, null);
        isMethod("isStringConstant", -isDoubleConstant, isDoubleConstant, isDoubleConstant, null, null);
        isMethod("isStringConstant", -isDoubleConstant, isDoubleConstant, isDoubleConstant, "isStringConstant", null);
        isMethod("isStringConstant", -isDoubleConstant, isDoubleConstant, isDoubleConstant, "isStringConstant", null);
    }

    private static void isMethod(String isParameter, double isParameter, double isParameter, double isParameter, String isParameter, String isParameter) {
        Result isVariable = new Result(isNameExpr, null, null, isNameExpr.isFieldAccessExpr);
        ParsedResult isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        GeoParsedResult isVariable = (GeoParsedResult) isNameExpr;
        isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr);
        isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr);
        isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr);
        isMethod(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr == null ? isNameExpr.isMethod(isNameExpr.isFieldAccessExpr) : isNameExpr, isNameExpr.isMethod());
    }
}
