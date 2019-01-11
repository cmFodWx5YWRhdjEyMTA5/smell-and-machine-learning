// isComment
package org.andstatus.app.notification;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import org.andstatus.app.context.MyPreferences;
import org.andstatus.app.util.SharedPreferencesUtil;
import org.andstatus.app.util.StringUtils;

/**
 * isComment
 */
public enum NotificationMethodType {

    NOTIFICATION_AREA(isIntegerConstant, "isStringConstant", true), VIBRATION(isIntegerConstant, "isStringConstant", true), SOUND(isIntegerConstant, isNameExpr.isFieldAccessExpr, true), EMPTY(isIntegerConstant, "isStringConstant", true);

    public final long isVariable;

    public final String isVariable;

    final boolean isVariable;

    isConstructor(long isParameter, String isParameter, boolean isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    public boolean isMethod() {
        if (isNameExpr.isMethod(isNameExpr))
            return true;
        switch(this) {
            case isNameExpr:
                return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, "isStringConstant"));
            default:
                return isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
    }

    @NonNull
    public String isMethod() {
        switch(this) {
            case isNameExpr:
                return isNameExpr.isMethod(isNameExpr, "isStringConstant");
            default:
                return "isStringConstant";
        }
    }

    void isMethod(boolean isParameter) {
        if (isNameExpr.isMethod(isNameExpr))
            isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    @NonNull
    public static NotificationMethodType isMethod(long isParameter) {
        for (NotificationMethodType isVariable : isMethod()) {
            if (isNameExpr.isFieldAccessExpr == isNameExpr) {
                return isNameExpr;
            }
        }
        return isNameExpr;
    }

    public boolean isMethod() {
        return this == isNameExpr;
    }
}
