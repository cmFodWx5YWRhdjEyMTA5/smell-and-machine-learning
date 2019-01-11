// isComment
// isComment
package org.secuso.privacyfriendlysudoku.controller.qqwing;

import java.util.Locale;

public enum Symmetry {

    NONE,
    ROTATE90,
    ROTATE180,
    MIRROR,
    FLIP,
    RANDOM;

    public static Symmetry isMethod(String isParameter) {
        if (isNameExpr == null)
            return null;
        try {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            return isMethod(isNameExpr);
        } catch (IllegalArgumentException isParameter) {
            return null;
        }
    }

    public String isMethod() {
        String isVariable = isMethod();
        return isNameExpr.isMethod(isIntegerConstant, isIntegerConstant) + isNameExpr.isMethod(isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr);
    }
}
