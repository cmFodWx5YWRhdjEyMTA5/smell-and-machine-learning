// isComment
package org.emergent.android.weave;

import android.content.SharedPreferences;
import android.content.res.Resources;

/**
 * isComment
 */
public enum PrefKey {

    // isComment
    allcerts(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    // isComment
    opentab(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    // isComment
    sync_period,
    // isComment
    sync_on_open(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    // isComment
    server_url(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    // isComment
    authAccount,
    // isComment
    password,
    // isComment
    sync_key,
    // isComment
    firstVersionCode,
    // isComment
    lastVersionCode,
    // isComment
    lastSync,
    // isComment
    lastPrefSave;

    private final int isVariable;

    private isConstructor() {
        this(-isIntegerConstant);
    }

    private isConstructor(int isParameter) {
        isNameExpr = isNameExpr;
    }

    public boolean isMethod(SharedPreferences isParameter, Resources isParameter) {
        boolean isVariable = isNameExpr != -isIntegerConstant && isNameExpr.isMethod(isNameExpr);
        return isNameExpr.isMethod(isMethod(), isNameExpr);
    }

    public int isMethod(SharedPreferences isParameter, int isParameter) {
        return isNameExpr.isMethod(isMethod(), isNameExpr);
    }

    public int isMethod(SharedPreferences isParameter, Resources isParameter) {
        int isVariable = isNameExpr == -isIntegerConstant ? isIntegerConstant : isNameExpr.isMethod(isNameExpr);
        return isNameExpr.isMethod(isMethod(), isNameExpr);
    }
}
