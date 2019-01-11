// isComment
package org.andstatus.app;

import android.content.Intent;
import android.net.Uri;
import org.andstatus.app.service.MyService;
import org.andstatus.app.service.MyServiceManager;

public enum MyAction {

    /**
     * isComment
     */
    EXECUTE_COMMAND("isStringConstant"),
    /**
     * isComment
     */
    SERVICE_STATE("isStringConstant"),
    VIEW_CONVERSATION("isStringConstant"),
    VIEW_FOLLOWERS("isStringConstant"),
    VIEW_ACTORS("isStringConstant"),
    BOOT_COMPLETED("isStringConstant"),
    ACTION_SHUTDOWN("isStringConstant"),
    SYNC("isStringConstant"),
    UNKNOWN("isStringConstant");

    private final String isVariable;

    isConstructor(String isParameter) {
        this.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant") ? isNameExpr : isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr;
    }

    public Intent isMethod() {
        return new Intent(isMethod());
    }

    public Intent isMethod(Uri isParameter) {
        return new Intent(isMethod(), isNameExpr);
    }

    public static MyAction isMethod(Intent isParameter) {
        String isVariable = isNameExpr == null ? "isStringConstant" : isNameExpr.isMethod();
        for (MyAction isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                return isNameExpr;
            }
        }
        return isNameExpr;
    }

    public String isMethod() {
        return isNameExpr;
    }
}
