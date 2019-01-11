// isComment
package com.vrem.wifianalyzer.wifi.band;

import android.support.annotation.NonNull;
import android.support.v4.util.Pair;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class isClassOrIsInterface extends WiFiChannels {

    private static final Pair<Integer, Integer> isVariable = new Pair<>(isIntegerConstant, isIntegerConstant);

    private static final List<Pair<WiFiChannel, WiFiChannel>> isVariable = isNameExpr.isMethod(new Pair<>(new WiFiChannel(isIntegerConstant, isIntegerConstant), new WiFiChannel(isIntegerConstant, isIntegerConstant)), new Pair<>(new WiFiChannel(isIntegerConstant, isIntegerConstant), new WiFiChannel(isIntegerConstant, isIntegerConstant)));

    private static final Pair<WiFiChannel, WiFiChannel> isVariable = new Pair<>(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isMethod() - isIntegerConstant).isFieldAccessExpr);

    isConstructor() {
        super(isNameExpr, isNameExpr);
    }

    @Override
    @NonNull
    public List<Pair<WiFiChannel, WiFiChannel>> isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    @NonNull
    public Pair<WiFiChannel, WiFiChannel> isMethod(String isParameter) {
        return isNameExpr;
    }

    @Override
    @NonNull
    public List<WiFiChannel> isMethod(String isParameter) {
        return isMethod(isNameExpr.isMethod(isNameExpr).isMethod());
    }

    @Override
    public boolean isMethod(String isParameter, int isParameter) {
        return isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr);
    }

    @Override
    @NonNull
    public WiFiChannel isMethod(int isParameter, @NonNull Pair<WiFiChannel, WiFiChannel> isParameter) {
        return isMethod(isNameExpr) ? isMethod(isNameExpr, isNameExpr) : isNameExpr.isFieldAccessExpr;
    }
}
