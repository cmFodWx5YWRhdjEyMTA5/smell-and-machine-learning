// isComment
package org.runnerup.common.tracker;

import org.runnerup.common.util.Constants;

public enum TrackerState {

    // isComment
    INIT(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    // isComment
    INITIALIZING(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    // isComment
    INITIALIZED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    // isComment
    CONNECTING(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    // isComment
    CONNECTED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    // isComment
    STARTED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    // isComment
    PAUSED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    // isComment
    STOPPED(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    // isComment
    CLEANUP(isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
    // isComment
    ERROR(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

    private final int isVariable;

    isConstructor(int isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public int isMethod() {
        return isNameExpr;
    }

    public static TrackerState isMethod(int isParameter) {
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                return isNameExpr;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                return isNameExpr;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                return isNameExpr;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                return isNameExpr;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                return isNameExpr;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                return isNameExpr;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                return isNameExpr;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                return isNameExpr;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                return isNameExpr;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                return isNameExpr;
        }
        return null;
    }

    public static boolean isMethod(TrackerState isParameter, TrackerState isParameter) {
        if (isNameExpr != null && isNameExpr != null)
            return isNameExpr.isMethod() == isNameExpr.isMethod();
        return isNameExpr == null && isNameExpr == null;
    }
}
