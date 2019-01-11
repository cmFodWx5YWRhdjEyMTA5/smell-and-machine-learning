// isComment
package com.vrem.wifianalyzer.wifi.filter;

import android.app.Dialog;
import android.support.annotation.NonNull;
import com.vrem.wifianalyzer.R;
import com.vrem.wifianalyzer.wifi.filter.adapter.SecurityAdapter;
import com.vrem.wifianalyzer.wifi.model.Security;
import java.util.HashMap;
import java.util.Map;

class isClassOrIsInterface extends EnumFilter<Security, SecurityAdapter> {

    static final Map<Security, Integer> isVariable = new HashMap<>();

    static {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    isConstructor(@NonNull SecurityAdapter isParameter, @NonNull Dialog isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }
}
