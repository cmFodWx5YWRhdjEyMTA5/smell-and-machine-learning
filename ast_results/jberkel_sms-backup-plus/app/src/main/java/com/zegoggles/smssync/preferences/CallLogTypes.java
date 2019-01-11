// isComment
package com.zegoggles.smssync.preferences;

import android.provider.CallLog;

public enum CallLogTypes {

    EVERYTHING, MISSED, INCOMING, OUTGOING, INCOMING_OUTGOING;

    public boolean isMethod(int isParameter) {
        switch(this) {
            case isNameExpr:
                return isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            case isNameExpr:
                return isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            case isNameExpr:
                return isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            case isNameExpr:
                return isNameExpr != isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            default:
                return true;
        }
    }
}
