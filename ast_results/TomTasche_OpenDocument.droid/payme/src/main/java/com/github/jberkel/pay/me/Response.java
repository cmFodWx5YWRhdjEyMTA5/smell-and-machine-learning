// isComment
package com.github.jberkel.pay.me;

public enum Response {

    // isComment
    OK(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"),
    USER_CANCELED(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"),
    BILLING_UNAVAILABLE(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"),
    ITEM_UNAVAILABLE(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"),
    DEVELOPER_ERROR(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"),
    ERROR(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"),
    ITEM_ALREADY_OWNED(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"),
    ITEM_NOT_OWNED(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"),
    // isComment
    IABHELPER_REMOTE_EXCEPTION(-isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"),
    IABHELPER_BAD_RESPONSE(-isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"),
    IABHELPER_VERIFICATION_FAILED(-isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"),
    IABHELPER_SEND_INTENT_FAILED(-isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"),
    IABHELPER_UNKNOWN_PURCHASE_RESPONSE(-isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"),
    IABHELPER_MISSING_TOKEN(-isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"),
    IABHELPER_UNKNOWN_ERROR(-isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"),
    IABHELPER_SUBSCRIPTIONS_NOT_AVAILABLE(-isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"),
    IABHELPER_INVALID_CONSUMPTION(-isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"),
    IABHELPER_DISPOSED(-isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant");

    /**
     * isComment
     */
    public final int isVariable;

    /**
     * isComment
     */
    public final int isVariable;

    /**
     * isComment
     */
    public final String isVariable;

    isConstructor(int isParameter, int isParameter, String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public static Response isMethod(int isParameter) {
        for (Response isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isFieldAccessExpr == isNameExpr)
                return isNameExpr;
        }
        return isNameExpr;
    }

    public static String isMethod(int isParameter) {
        return isMethod(isNameExpr).isFieldAccessExpr;
    }
}
