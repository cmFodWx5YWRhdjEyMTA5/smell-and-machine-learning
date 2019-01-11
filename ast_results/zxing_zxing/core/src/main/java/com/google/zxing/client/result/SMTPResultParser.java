// isComment
package com.google.zxing.client.result;

import com.google.zxing.Result;

/**
 * isComment
 */
public final class isClassOrIsInterface extends ResultParser {

    @Override
    public EmailAddressParsedResult isMethod(Result isParameter) {
        String isVariable = isMethod(isNameExpr);
        if (!(isNameExpr.isMethod("isStringConstant") || isNameExpr.isMethod("isStringConstant"))) {
            return null;
        }
        String isVariable = isNameExpr.isMethod(isIntegerConstant);
        String isVariable = null;
        String isVariable = null;
        int isVariable = isNameExpr.isMethod('isStringConstant');
        if (isNameExpr >= isIntegerConstant) {
            isNameExpr = isNameExpr.isMethod(isNameExpr + isIntegerConstant);
            isNameExpr = isNameExpr.isMethod(isIntegerConstant, isNameExpr);
            isNameExpr = isNameExpr.isMethod('isStringConstant');
            if (isNameExpr >= isIntegerConstant) {
                isNameExpr = isNameExpr.isMethod(isNameExpr + isIntegerConstant);
                isNameExpr = isNameExpr.isMethod(isIntegerConstant, isNameExpr);
            }
        }
        return new EmailAddressParsedResult(new String[] { isNameExpr }, null, null, isNameExpr, isNameExpr);
    }
}
