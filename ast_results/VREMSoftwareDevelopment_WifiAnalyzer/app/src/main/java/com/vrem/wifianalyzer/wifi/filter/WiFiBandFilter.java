// isComment
package com.vrem.wifianalyzer.wifi.filter;

import android.app.Dialog;
import android.support.annotation.NonNull;
import com.vrem.wifianalyzer.R;
import com.vrem.wifianalyzer.wifi.band.WiFiBand;
import com.vrem.wifianalyzer.wifi.filter.adapter.WiFiBandAdapter;
import java.util.HashMap;
import java.util.Map;

class isClassOrIsInterface extends EnumFilter<WiFiBand, WiFiBandAdapter> {

    static final Map<WiFiBand, Integer> isVariable = new HashMap<>();

    static {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    isConstructor(@NonNull WiFiBandAdapter isParameter, @NonNull Dialog isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }
}
