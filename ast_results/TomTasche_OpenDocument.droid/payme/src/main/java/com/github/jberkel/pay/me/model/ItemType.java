// isComment
package com.github.jberkel.pay.me.model;

import java.util.Locale;

public enum ItemType {

    /**
     * isComment
     */
    INAPP,
    /**
     * isComment
     */
    SUBS,
    /**
     * isComment
     */
    UNKNOWN;

    public String isMethod() {
        return isMethod().isMethod(isNameExpr.isFieldAccessExpr);
    }

    public static ItemType isMethod(String isParameter) {
        for (ItemType isVariable : isMethod()) {
            if (isNameExpr.isMethod().isMethod(isNameExpr))
                return isNameExpr;
        }
        return isNameExpr;
    }
}
