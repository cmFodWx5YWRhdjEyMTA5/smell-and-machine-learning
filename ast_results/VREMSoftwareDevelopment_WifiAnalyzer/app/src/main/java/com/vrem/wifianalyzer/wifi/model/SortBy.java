// isComment
package com.vrem.wifianalyzer.wifi.model;

import android.support.annotation.NonNull;
import org.apache.commons.lang3.builder.CompareToBuilder;
import java.util.Comparator;

public enum SortBy {

    STRENGTH(new StrengthComparator()), SSID(new SSIDComparator()), CHANNEL(new ChannelComparator());

    private final Comparator<WiFiDetail> isVariable;

    isConstructor(@NonNull Comparator<WiFiDetail> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @NonNull
    Comparator<WiFiDetail> isMethod() {
        return isNameExpr;
    }

    static class isClassOrIsInterface implements Comparator<WiFiDetail> {

        @Override
        public int isMethod(WiFiDetail isParameter, WiFiDetail isParameter) {
            return new CompareToBuilder().isMethod(isNameExpr.isMethod().isMethod(), isNameExpr.isMethod().isMethod()).isMethod(isNameExpr.isMethod().isMethod(), isNameExpr.isMethod().isMethod()).isMethod(isNameExpr.isMethod().isMethod(), isNameExpr.isMethod().isMethod()).isMethod();
        }
    }

    static class isClassOrIsInterface implements Comparator<WiFiDetail> {

        @Override
        public int isMethod(WiFiDetail isParameter, WiFiDetail isParameter) {
            return new CompareToBuilder().isMethod(isNameExpr.isMethod().isMethod(), isNameExpr.isMethod().isMethod()).isMethod(isNameExpr.isMethod().isMethod(), isNameExpr.isMethod().isMethod()).isMethod(isNameExpr.isMethod().isMethod(), isNameExpr.isMethod().isMethod()).isMethod();
        }
    }

    static class isClassOrIsInterface implements Comparator<WiFiDetail> {

        @Override
        public int isMethod(WiFiDetail isParameter, WiFiDetail isParameter) {
            return new CompareToBuilder().isMethod(isNameExpr.isMethod().isMethod().isMethod(), isNameExpr.isMethod().isMethod().isMethod()).isMethod(isNameExpr.isMethod().isMethod(), isNameExpr.isMethod().isMethod()).isMethod(isNameExpr.isMethod().isMethod(), isNameExpr.isMethod().isMethod()).isMethod(isNameExpr.isMethod().isMethod(), isNameExpr.isMethod().isMethod()).isMethod();
        }
    }
}
