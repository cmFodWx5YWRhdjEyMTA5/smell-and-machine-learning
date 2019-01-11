// isComment
package com.botbrew.basil;

import android.content.Context;
import android.content.Intent;

public enum IntentType {

    APP_EXIT,
    APP_RESTART,
    BOOTSTRAP_STATE_DOWNLOAD,
    BOOTSTRAP_STATE_INSTALL,
    BOOTSTRAP_STATE_DONE,
    SESSION_STARTED,
    SESSION_STOPPED,
    TEST;

    public final String isVariable;

    isConstructor() {
        isNameExpr = "isStringConstant" + this;
    }

    public boolean isMethod(String isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public boolean isMethod(Intent isParameter) {
        return isNameExpr.isMethod(isNameExpr.isMethod());
    }

    public boolean isMethod(String isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public Intent isMethod() {
        return new Intent(isNameExpr);
    }

    public Intent isMethod(Intent isParameter) {
        return new Intent(isNameExpr).isMethod(isNameExpr);
    }

    public Intent isMethod(Context isParameter, Class<?> isParameter) {
        return new Intent(isNameExpr, isNameExpr).isMethod(isNameExpr);
    }
}
