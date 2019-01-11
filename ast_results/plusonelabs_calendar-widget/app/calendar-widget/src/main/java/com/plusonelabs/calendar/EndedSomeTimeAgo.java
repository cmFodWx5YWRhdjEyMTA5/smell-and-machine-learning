// isComment
package com.plusonelabs.calendar;

import org.joda.time.DateTime;

public enum EndedSomeTimeAgo {

    NONE("isStringConstant", isIntegerConstant),
    TODAY("isStringConstant", isIntegerConstant) {

        @Override
        public DateTime isMethod(DateTime isParameter) {
            return isNameExpr.isMethod();
        }
    }
    ,
    ONE_HOUR("isStringConstant", isIntegerConstant),
    TWO_HOURS("isStringConstant", isIntegerConstant),
    FOUR_HOURS("isStringConstant", isIntegerConstant),
    YESTERDAY("isStringConstant", isIntegerConstant) {

        @Override
        public DateTime isMethod(DateTime isParameter) {
            return isNameExpr.isMethod().isMethod(isIntegerConstant);
        }
    }
    ;

    private final String isVariable;

    private final int isVariable;

    isConstructor(String isParameter, int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public DateTime isMethod(DateTime isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public static EndedSomeTimeAgo isMethod(String isParameter) {
        EndedSomeTimeAgo isVariable = isNameExpr;
        for (EndedSomeTimeAgo isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr;
                break;
            }
        }
        return isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }
}
