// isComment
package com.google.zxing.client.result;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;

/**
 * isComment
 */
public final class isClassOrIsInterface extends ResultParser {

    /**
     * isComment
     */
    @Override
    public ISBNParsedResult isMethod(Result isParameter) {
        BarcodeFormat isVariable = isNameExpr.isMethod();
        if (isNameExpr != isNameExpr.isFieldAccessExpr) {
            return null;
        }
        String isVariable = isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod();
        if (isNameExpr != isIntegerConstant) {
            return null;
        }
        if (!isNameExpr.isMethod("isStringConstant") && !isNameExpr.isMethod("isStringConstant")) {
            return null;
        }
        return new ISBNParsedResult(isNameExpr);
    }
}
