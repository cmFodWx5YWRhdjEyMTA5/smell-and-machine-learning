// isComment
package com.google.zxing.client.result;

import com.google.zxing.Result;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * isComment
 */
public final class isClassOrIsInterface extends ResultParser {

    private static final Pattern isVariable = isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);

    @Override
    public GeoParsedResult isMethod(Result isParameter) {
        CharSequence isVariable = isMethod(isNameExpr);
        Matcher isVariable = isNameExpr.isMethod(isNameExpr);
        if (!isNameExpr.isMethod()) {
            return null;
        }
        String isVariable = isNameExpr.isMethod(isIntegerConstant);
        double isVariable;
        double isVariable;
        double isVariable;
        try {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant));
            if (isNameExpr > isDoubleConstant || isNameExpr < -isDoubleConstant) {
                return null;
            }
            isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant));
            if (isNameExpr > isDoubleConstant || isNameExpr < -isDoubleConstant) {
                return null;
            }
            if (isNameExpr.isMethod(isIntegerConstant) == null) {
                isNameExpr = isDoubleConstant;
            } else {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant));
                if (isNameExpr < isDoubleConstant) {
                    return null;
                }
            }
        } catch (NumberFormatException isParameter) {
            return null;
        }
        return new GeoParsedResult(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }
}
