// isComment
package com.google.zxing.client.result;

import com.google.zxing.Result;

/**
 * isComment
 */
public final class isClassOrIsInterface extends ResultParser {

    @Override
    public TelParsedResult isMethod(Result isParameter) {
        String isVariable = isMethod(isNameExpr);
        if (!isNameExpr.isMethod("isStringConstant") && !isNameExpr.isMethod("isStringConstant")) {
            return null;
        }
        // isComment
        String isVariable = isNameExpr.isMethod("isStringConstant") ? "isStringConstant" + isNameExpr.isMethod(isIntegerConstant) : isNameExpr;
        // isComment
        int isVariable = isNameExpr.isMethod('isStringConstant', isIntegerConstant);
        String isVariable = isNameExpr < isIntegerConstant ? isNameExpr.isMethod(isIntegerConstant) : isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        return new TelParsedResult(isNameExpr, isNameExpr, null);
    }
}
