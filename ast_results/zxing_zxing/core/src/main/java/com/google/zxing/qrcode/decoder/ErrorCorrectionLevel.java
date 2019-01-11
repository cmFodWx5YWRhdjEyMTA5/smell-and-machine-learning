// isComment
package com.google.zxing.qrcode.decoder;

/**
 * isComment
 */
public enum ErrorCorrectionLevel {

    /**
     * isComment
     */
    L(isIntegerConstant),
    /**
     * isComment
     */
    M(isIntegerConstant),
    /**
     * isComment
     */
    Q(isIntegerConstant),
    /**
     * isComment
     */
    H(isIntegerConstant);

    private static final ErrorCorrectionLevel[] isVariable = { isNameExpr, isNameExpr, isNameExpr, isNameExpr };

    private final int isVariable;

    isConstructor(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public static ErrorCorrectionLevel isMethod(int isParameter) {
        if (isNameExpr < isIntegerConstant || isNameExpr >= isNameExpr.isFieldAccessExpr) {
            throw new IllegalArgumentException();
        }
        return isNameExpr[isNameExpr];
    }
}
