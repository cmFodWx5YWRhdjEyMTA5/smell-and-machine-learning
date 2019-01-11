// isComment
package com.github.junrar.unpack.vm;

/**
 * isComment
 */
public enum VMStandardFilters {

    VMSF_NONE((int) isIntegerConstant),
    VMSF_E8((int) isIntegerConstant),
    VMSF_E8E9((int) isIntegerConstant),
    VMSF_ITANIUM((int) isIntegerConstant),
    VMSF_RGB((int) isIntegerConstant),
    VMSF_AUDIO((int) isIntegerConstant),
    VMSF_DELTA((int) isIntegerConstant),
    VMSF_UPCASE((int) isIntegerConstant);

    private int isVariable;

    private isConstructor(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }

    public boolean isMethod(int isParameter) {
        return this.isFieldAccessExpr == isNameExpr;
    }

    public static VMStandardFilters isMethod(int isParameter) {
        if (isNameExpr.isMethod(isNameExpr)) {
            return isNameExpr;
        }
        if (isNameExpr.isMethod(isNameExpr)) {
            return isNameExpr;
        }
        if (isNameExpr.isMethod(isNameExpr)) {
            return isNameExpr;
        }
        if (isNameExpr.isMethod(isNameExpr)) {
            return isNameExpr;
        }
        if (isNameExpr.isMethod(isNameExpr)) {
            return isNameExpr;
        }
        if (isNameExpr.isMethod(isNameExpr)) {
            return isNameExpr;
        }
        if (isNameExpr.isMethod(isNameExpr)) {
            return isNameExpr;
        }
        return null;
    }
}
