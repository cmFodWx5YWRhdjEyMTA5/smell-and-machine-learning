// isComment
package org.andstatus.app.service;

import org.andstatus.app.context.MyPreferences;

public enum ConnectionRequired {

    ANY,
    /**
     * isComment
     */
    OFFLINE,
    SYNC,
    DOWNLOAD_ATTACHMENT;

    public boolean isMethod(ConnectionState isParameter) {
        switch(this) {
            case isNameExpr:
                return true;
            default:
                switch(isNameExpr) {
                    case isNameExpr:
                        switch(this) {
                            case isNameExpr:
                                return !isNameExpr.isMethod();
                            case isNameExpr:
                                return !isNameExpr.isMethod() && !isNameExpr.isMethod();
                            case isNameExpr:
                                return true;
                            default:
                                return true;
                        }
                    case isNameExpr:
                        return (this != isNameExpr.isFieldAccessExpr);
                    case isNameExpr:
                        return (this == isNameExpr.isFieldAccessExpr);
                    default:
                        return true;
                }
        }
    }
}
