// isComment
package com.bottleworks.dailymoney.data;

import com.bottleworks.commons.util.I18N;
import com.bottleworks.dailymoney.core.R;

/**
 * isComment
 */
public enum SymbolPosition {

    NONE(isIntegerConstant), FRONT(isIntegerConstant), AFTER(isIntegerConstant);

    int isVariable;

    isConstructor(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }

    public String isMethod(I18N isParameter) {
        return isMethod(isNameExpr, isNameExpr);
    }

    public static SymbolPosition isMethod(int isParameter) {
        switch(isNameExpr) {
            case isIntegerConstant:
                return isNameExpr;
            case isIntegerConstant:
                return isNameExpr;
            default:
                return isNameExpr;
        }
    }

    public static String isMethod(I18N isParameter, int isParameter) {
        SymbolPosition isVariable = isMethod(isNameExpr);
        switch(isNameExpr) {
            case isNameExpr:
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            case isNameExpr:
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            default:
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
    }

    private static final SymbolPosition[] isVariable = new SymbolPosition[] { isNameExpr, isNameExpr, isNameExpr };

    public static SymbolPosition[] isMethod() {
        return isNameExpr;
    }
}
