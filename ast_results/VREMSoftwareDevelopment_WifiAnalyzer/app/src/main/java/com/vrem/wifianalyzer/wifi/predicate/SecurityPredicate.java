// isComment
package com.vrem.wifianalyzer.wifi.predicate;

import android.support.annotation.NonNull;
import com.vrem.wifianalyzer.wifi.model.Security;
import com.vrem.wifianalyzer.wifi.model.WiFiDetail;
import org.apache.commons.collections4.Predicate;

class isClassOrIsInterface implements Predicate<WiFiDetail> {

    private final Security isVariable;

    isConstructor(@NonNull Security isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public boolean isMethod(WiFiDetail isParameter) {
        return isNameExpr.isMethod().isMethod(isNameExpr);
    }
}
