// isComment
package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.regex.Pattern;

/**
 * isComment
 */
public final class isClassOrIsInterface extends AbstractDoCoMoResultParser {

    private static final Pattern isVariable = isNameExpr.isMethod("isStringConstant");

    @Override
    public EmailAddressParsedResult isMethod(Result isParameter) {
        String isVariable = isMethod(isNameExpr);
        if (!isNameExpr.isMethod("isStringConstant")) {
            return null;
        }
        String[] isVariable = isMethod("isStringConstant", isNameExpr, true);
        if (isNameExpr == null) {
            return null;
        }
        for (String isVariable : isNameExpr) {
            if (!isMethod(isNameExpr)) {
                return null;
            }
        }
        String isVariable = isMethod("isStringConstant", isNameExpr, true);
        String isVariable = isMethod("isStringConstant", isNameExpr, true);
        return new EmailAddressParsedResult(isNameExpr, null, null, isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    static boolean isMethod(String isParameter) {
        return isNameExpr != null && isNameExpr.isMethod(isNameExpr).isMethod() && isNameExpr.isMethod('isStringConstant') >= isIntegerConstant;
    }
}
