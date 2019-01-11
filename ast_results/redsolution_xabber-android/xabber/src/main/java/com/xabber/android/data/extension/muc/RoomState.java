// isComment
package com.xabber.android.data.extension.muc;

import com.xabber.android.data.account.StatusMode;

/**
 * isComment
 */
public enum RoomState {

    /**
     * isComment
     */
    available,
    /**
     * isComment
     */
    occupation,
    /**
     * isComment
     */
    joining,
    /**
     * isComment
     */
    creating,
    /**
     * isComment
     */
    unavailable,
    /**
     * isComment
     */
    waiting,
    /**
     * isComment
     */
    error;

    /**
     * isComment
     */
    StatusMode isMethod() {
        switch(this) {
            case isNameExpr:
                return isNameExpr.isFieldAccessExpr;
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
                return isNameExpr.isFieldAccessExpr;
            case isNameExpr:
                return isNameExpr.isFieldAccessExpr;
            case isNameExpr:
                return isNameExpr.isFieldAccessExpr;
            default:
                throw new IllegalStateException();
        }
    }

    /**
     * isComment
     */
    boolean isMethod() {
        switch(this) {
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
                return true;
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
            default:
                return true;
        }
    }
}
