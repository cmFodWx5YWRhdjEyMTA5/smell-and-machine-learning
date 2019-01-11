// isComment
package com.google.zxing.client.result;

import com.google.zxing.Result;

/**
 * isComment
 */
public final class isClassOrIsInterface extends ResultParser {

    @Override
    public WifiParsedResult isMethod(Result isParameter) {
        String isVariable = isMethod(isNameExpr);
        if (!isNameExpr.isMethod("isStringConstant")) {
            return null;
        }
        isNameExpr = isNameExpr.isMethod("isStringConstant".isMethod());
        String isVariable = isMethod("isStringConstant", isNameExpr, 'isStringConstant', true);
        if (isNameExpr == null || isNameExpr.isMethod()) {
            return null;
        }
        String isVariable = isMethod("isStringConstant", isNameExpr, 'isStringConstant', true);
        String isVariable = isMethod("isStringConstant", isNameExpr, 'isStringConstant', true);
        if (isNameExpr == null) {
            isNameExpr = "isStringConstant";
        }
        boolean isVariable = isNameExpr.isMethod(isMethod("isStringConstant", isNameExpr, 'isStringConstant', true));
        String isVariable = isMethod("isStringConstant", isNameExpr, 'isStringConstant', true);
        String isVariable = isMethod("isStringConstant", isNameExpr, 'isStringConstant', true);
        String isVariable = isMethod("isStringConstant", isNameExpr, 'isStringConstant', true);
        String isVariable = isMethod("isStringConstant", isNameExpr, 'isStringConstant', true);
        return new WifiParsedResult(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }
}
