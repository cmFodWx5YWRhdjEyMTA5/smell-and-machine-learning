// isComment
package com.vrem.wifianalyzer.wifi.accesspoint;

public enum ConnectionViewType {

    COMPLETE(isNameExpr.isFieldAccessExpr), COMPACT(isNameExpr.isFieldAccessExpr), HIDE(null);

    private final AccessPointViewType isVariable;

    isConstructor(AccessPointViewType isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    AccessPointViewType isMethod() {
        return isNameExpr;
    }

    public boolean isMethod() {
        return isNameExpr.isMethod(this);
    }
}
