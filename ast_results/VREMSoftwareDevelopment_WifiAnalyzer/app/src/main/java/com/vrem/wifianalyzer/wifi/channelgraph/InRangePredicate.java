// isComment
package com.vrem.wifianalyzer.wifi.channelgraph;

import android.support.annotation.NonNull;
import android.support.v4.util.Pair;
import com.vrem.wifianalyzer.wifi.band.WiFiChannel;
import com.vrem.wifianalyzer.wifi.model.WiFiDetail;
import org.apache.commons.collections4.Predicate;

class isClassOrIsInterface implements Predicate<WiFiDetail> {

    private final Pair<WiFiChannel, WiFiChannel> isVariable;

    isConstructor(@NonNull Pair<WiFiChannel, WiFiChannel> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public boolean isMethod(WiFiDetail isParameter) {
        int isVariable = isNameExpr.isMethod().isMethod();
        return isNameExpr >= isNameExpr.isFieldAccessExpr.isMethod() && isNameExpr <= isNameExpr.isFieldAccessExpr.isMethod();
    }
}
