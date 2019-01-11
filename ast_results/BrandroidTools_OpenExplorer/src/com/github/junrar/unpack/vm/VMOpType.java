// isComment
package com.github.junrar.unpack.vm;

/**
 * isComment
 */
public enum VMOpType {

    VM_OPREG(isIntegerConstant), VM_OPINT(isIntegerConstant), VM_OPREGMEM(isIntegerConstant), VM_OPNONE(isIntegerConstant);

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

    public static VMOpType isMethod(int isParameter) {
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
