// isComment
package com.sensirion.smartgadget.utils;

public enum Interval {

    ONE_SECOND(isIntegerConstant),
    THREE_SECONDS(isIntegerConstant),
    FIVE_SECONDS(isIntegerConstant),
    TEN_SECONDS(isIntegerConstant),
    ONE_MINUTE(isNameExpr.isMethod() * isIntegerConstant),
    FIVE_MINUTES(isNameExpr.isMethod() * isIntegerConstant),
    TEN_MINUTES(isNameExpr.isMethod() * isIntegerConstant),
    ONE_HOUR(isNameExpr.isMethod() * isIntegerConstant),
    THREE_HOURS(isNameExpr.isMethod() * isIntegerConstant),
    SIX_HOURS(isNameExpr.isMethod() * isIntegerConstant),
    ONE_DAY(isNameExpr.isMethod() * isIntegerConstant),
    ONE_WEEK(isNameExpr.isMethod() * isIntegerConstant);

    private final int isVariable;

    isConstructor(final int isParameter) {
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public int isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    public int isMethod() {
        return isNameExpr * isIntegerConstant;
    }
}
