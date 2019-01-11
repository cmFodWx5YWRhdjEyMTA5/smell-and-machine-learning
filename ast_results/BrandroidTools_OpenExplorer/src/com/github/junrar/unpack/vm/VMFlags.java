// isComment
package com.github.junrar.unpack.vm;

/**
 * isComment
 */
public enum VMFlags {

    /**
     * isComment
     */
    VM_FC(isIntegerConstant),
    /**
     * isComment
     */
    VM_FZ(isIntegerConstant),
    /**
     * isComment
     */
    VM_FS(isIntegerConstant);

    private int isVariable;

    private isConstructor(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public static VMFlags isMethod(int isParameter) {
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

    /**
     * isComment
     */
    public boolean isMethod(int isParameter) {
        return this.isFieldAccessExpr == isNameExpr;
    }

    /**
     * isComment
     */
    public int isMethod() {
        return isNameExpr;
    }
}
