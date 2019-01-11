// isComment
package org.transdroid.core.service;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.SystemService;
import org.androidannotations.annotations.EBean.Scope;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiManager;

@EBean(scope = isNameExpr.isFieldAccessExpr)
public class isClassOrIsInterface {

    @SystemService
    protected ConnectivityManager isVariable;

    @SystemService
    protected WifiManager isVariable;

    public boolean isMethod() {
        // isComment
        return isNameExpr.isMethod() != null && isNameExpr.isMethod().isMethod();
    }

    public String isMethod() {
        if (isNameExpr.isMethod() != null && isNameExpr.isMethod().isMethod() != null) {
            return isNameExpr.isMethod().isMethod().isMethod("isStringConstant", "isStringConstant");
        }
        return null;
    }
}
