// isComment
package com.google.zxing.client.result;

import com.google.zxing.Result;

/**
 * isComment
 */
public final class isClassOrIsInterface extends ResultParser {

    @Override
    public URIParsedResult isMethod(Result isParameter) {
        String isVariable = isMethod(isNameExpr);
        if (!isNameExpr.isMethod("isStringConstant") && !isNameExpr.isMethod("isStringConstant")) {
            return null;
        }
        int isVariable = isNameExpr.isMethod('isStringConstant', isIntegerConstant);
        if (isNameExpr < isIntegerConstant) {
            return null;
        }
        String isVariable = isNameExpr <= isIntegerConstant ? null : isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        String isVariable = isNameExpr.isMethod(isNameExpr + isIntegerConstant);
        return new URIParsedResult(isNameExpr, isNameExpr);
    }
}
