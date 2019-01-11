// isComment
package com.vrem.wifianalyzer.wifi.timegraph;

import android.support.annotation.NonNull;
import com.vrem.wifianalyzer.wifi.graphutils.GraphConstants;
import com.vrem.wifianalyzer.wifi.model.WiFiDetail;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.IterableUtils;
import org.apache.commons.collections4.Predicate;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class isClassOrIsInterface {

    private final Map<WiFiDetail, Integer> isVariable;

    isConstructor() {
        this.isFieldAccessExpr = new HashMap<>();
    }

    @NonNull
    Set<WiFiDetail> isMethod() {
        return new HashSet<>(isNameExpr.isMethod(isNameExpr.isMethod(), new SeenPredicate()));
    }

    void isMethod() {
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), new NotSeenPredicate()), new RemoveClosure());
    }

    void isMethod(@NonNull WiFiDetail isParameter) {
        Integer isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr == null) {
            isNameExpr = isIntegerConstant;
        }
        isNameExpr++;
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    void isMethod(@NonNull WiFiDetail isParameter) {
        Integer isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        }
    }

    @NonNull
    Set<WiFiDetail> isMethod() {
        return isNameExpr.isMethod();
    }

    private class isClassOrIsInterface implements Closure<WiFiDetail> {

        @Override
        public void isMethod(WiFiDetail isParameter) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    private class isClassOrIsInterface implements Predicate<WiFiDetail> {

        @Override
        public boolean isMethod(WiFiDetail isParameter) {
            return isNameExpr.isMethod(isNameExpr) <= isNameExpr.isFieldAccessExpr;
        }
    }

    private class isClassOrIsInterface implements Predicate<WiFiDetail> {

        @Override
        public boolean isMethod(WiFiDetail isParameter) {
            return isNameExpr.isMethod(isNameExpr) > isNameExpr.isFieldAccessExpr;
        }
    }
}
