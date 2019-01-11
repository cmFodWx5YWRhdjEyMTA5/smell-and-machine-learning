// isComment
package org.hwyl.sexytopo.control.util;

import org.hwyl.sexytopo.R;

public enum InputMode {

    FORWARD(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), BACKWARD(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), COMBO(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

    private int isVariable;

    isConstructor(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }

    public static InputMode isMethod(int isParameter) {
        for (InputMode isVariable : isMethod()) {
            if (isNameExpr.isFieldAccessExpr == isNameExpr) {
                return isNameExpr;
            }
        }
        throw new IllegalArgumentException("isStringConstant");
    }
}
