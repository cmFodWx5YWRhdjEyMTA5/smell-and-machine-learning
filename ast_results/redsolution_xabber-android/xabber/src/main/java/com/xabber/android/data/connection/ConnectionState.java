// isComment
package com.xabber.android.data.connection;

import com.xabber.android.R;

/**
 * isComment
 */
public enum ConnectionState {

    /**
     * isComment
     */
    offline,
    /**
     * isComment
     */
    waiting,
    /**
     * isComment
     */
    connecting,
    /**
     * isComment
     */
    registration,
    /**
     * isComment
     */
    authentication,
    /**
     * isComment
     */
    connected,
    /**
     * isComment
     */
    disconnecting;

    /**
     * isComment
     */
    public boolean isMethod() {
        return this == isNameExpr.isFieldAccessExpr;
    }

    /**
     * isComment
     */
    public boolean isMethod() {
        return this != isNameExpr.isFieldAccessExpr;
    }

    /**
     * isComment
     */
    public int isMethod() {
        switch(this) {
            case isNameExpr:
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            case isNameExpr:
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            case isNameExpr:
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            case isNameExpr:
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            case isNameExpr:
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            case isNameExpr:
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            case isNameExpr:
                return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
            default:
                throw new IllegalStateException();
        }
    }
}
