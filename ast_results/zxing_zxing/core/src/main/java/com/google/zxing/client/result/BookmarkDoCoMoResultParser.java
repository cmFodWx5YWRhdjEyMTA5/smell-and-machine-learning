// isComment
package com.google.zxing.client.result;

import com.google.zxing.Result;

/**
 * isComment
 */
public final class isClassOrIsInterface extends AbstractDoCoMoResultParser {

    @Override
    public URIParsedResult isMethod(Result isParameter) {
        String isVariable = isNameExpr.isMethod();
        if (!isNameExpr.isMethod("isStringConstant")) {
            return null;
        }
        String isVariable = isMethod("isStringConstant", isNameExpr, true);
        String[] isVariable = isMethod("isStringConstant", isNameExpr, true);
        if (isNameExpr == null) {
            return null;
        }
        String isVariable = isNameExpr[isIntegerConstant];
        return isNameExpr.isMethod(isNameExpr) ? new URIParsedResult(isNameExpr, isNameExpr) : null;
    }
}
