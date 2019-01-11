// isComment
package com.github.junrar.unpack.ppm;

/**
 * isComment
 */
public enum BlockTypes {

    BLOCK_LZ(isIntegerConstant), BLOCK_PPM(isIntegerConstant);

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

    public static BlockTypes isMethod(int isParameter) {
        if (isNameExpr.isMethod(isNameExpr)) {
            return isNameExpr;
        }
        if (isNameExpr.isMethod(isNameExpr)) {
            return isNameExpr;
        }
        return null;
    }
}
