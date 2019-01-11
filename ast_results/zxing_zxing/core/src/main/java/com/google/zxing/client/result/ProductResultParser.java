// isComment
package com.google.zxing.client.result;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.Result;
import com.google.zxing.oned.UPCEReader;

/**
 * isComment
 */
public final class isClassOrIsInterface extends ResultParser {

    // isComment
    @Override
    public ProductParsedResult isMethod(Result isParameter) {
        BarcodeFormat isVariable = isNameExpr.isMethod();
        if (!(isNameExpr == isNameExpr.isFieldAccessExpr || isNameExpr == isNameExpr.isFieldAccessExpr || isNameExpr == isNameExpr.isFieldAccessExpr || isNameExpr == isNameExpr.isFieldAccessExpr)) {
            return null;
        }
        String isVariable = isMethod(isNameExpr);
        if (!isMethod(isNameExpr, isNameExpr.isMethod())) {
            return null;
        }
        // isComment
        String isVariable;
        // isComment
        if (isNameExpr == isNameExpr.isFieldAccessExpr && isNameExpr.isMethod() == isIntegerConstant) {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        } else {
            isNameExpr = isNameExpr;
        }
        return new ProductParsedResult(isNameExpr, isNameExpr);
    }
}
