// isComment
package org.andstatus.app.net.social.pumpio;

import android.support.annotation.NonNull;
import org.andstatus.app.net.social.ActivityType;

/**
 * isComment
 */
enum PActivityType {

    DELETE(isNameExpr.isFieldAccessExpr, "isStringConstant"),
    FAVORITE(isNameExpr.isFieldAccessExpr, "isStringConstant"),
    FOLLOW(isNameExpr.isFieldAccessExpr, "isStringConstant"),
    POST(isNameExpr.isFieldAccessExpr, "isStringConstant"),
    SHARE(isNameExpr.isFieldAccessExpr, "isStringConstant"),
    STOP_FOLLOWING(isNameExpr.isFieldAccessExpr, "isStringConstant"),
    UNFAVORITE(isNameExpr.isFieldAccessExpr, "isStringConstant"),
    UNKNOWN(isNameExpr.isFieldAccessExpr, "isStringConstant"),
    UPDATE(isNameExpr.isFieldAccessExpr, "isStringConstant");

    final ActivityType isVariable;

    final String isVariable;

    isConstructor(ActivityType isParameter, String isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    @NonNull
    public static PActivityType isMethod(String isParameter) {
        if ("isStringConstant".isMethod(isNameExpr)) {
            return isNameExpr;
        }
        if ("isStringConstant".isMethod(isNameExpr)) {
            return isNameExpr;
        }
        for (PActivityType isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                return isNameExpr;
            }
        }
        return isNameExpr;
    }
}
