// isComment
package com.vrem.wifianalyzer.wifi.predicate;

import android.support.annotation.NonNull;
import com.vrem.util.EnumUtils;
import com.vrem.wifianalyzer.settings.Settings;
import com.vrem.wifianalyzer.wifi.band.WiFiBand;
import com.vrem.wifianalyzer.wifi.model.Security;
import com.vrem.wifianalyzer.wifi.model.Strength;
import com.vrem.wifianalyzer.wifi.model.WiFiDetail;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.collections4.PredicateUtils;
import org.apache.commons.collections4.Transformer;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class isClassOrIsInterface implements Predicate<WiFiDetail> {

    private final Predicate<WiFiDetail> isVariable;

    private isConstructor(@NonNull Settings isParameter, @NonNull Set<WiFiBand> isParameter) {
        Predicate<WiFiDetail> isVariable = isMethod(isNameExpr.isMethod());
        Predicate<WiFiDetail> isVariable = isNameExpr.isMethod(WiFiBand.class, isNameExpr, new WiFiBandTransformer());
        Predicate<WiFiDetail> isVariable = isNameExpr.isMethod(Strength.class, isNameExpr.isMethod(), new StrengthTransformer());
        Predicate<WiFiDetail> isVariable = isNameExpr.isMethod(Security.class, isNameExpr.isMethod(), new SecurityTransformer());
        List<Predicate<WiFiDetail>> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, new NoTruePredicate()));
    }

    @NonNull
    public static Predicate<WiFiDetail> isMethod(@NonNull Settings isParameter) {
        return new FilterPredicate(isNameExpr, isNameExpr.isMethod());
    }

    @NonNull
    public static Predicate<WiFiDetail> isMethod(@NonNull Settings isParameter) {
        return new FilterPredicate(isNameExpr, isNameExpr.isMethod(isNameExpr.isMethod()));
    }

    @Override
    public boolean isMethod(WiFiDetail isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @NonNull
    Predicate<WiFiDetail> isMethod() {
        return isNameExpr;
    }

    @NonNull
    private Predicate<WiFiDetail> isMethod(Set<String> isParameter) {
        if (isNameExpr.isMethod()) {
            return isNameExpr.isMethod();
        }
        return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, new SSIDTransformer()));
    }

    private class isClassOrIsInterface implements Transformer<String, Predicate<WiFiDetail>> {

        @Override
        public Predicate<WiFiDetail> isMethod(String isParameter) {
            return new SSIDPredicate(isNameExpr);
        }
    }

    private class isClassOrIsInterface implements Transformer<WiFiBand, Predicate<WiFiDetail>> {

        @Override
        public Predicate<WiFiDetail> isMethod(WiFiBand isParameter) {
            return new WiFiBandPredicate(isNameExpr);
        }
    }

    private class isClassOrIsInterface implements Transformer<Strength, Predicate<WiFiDetail>> {

        @Override
        public Predicate<WiFiDetail> isMethod(Strength isParameter) {
            return new StrengthPredicate(isNameExpr);
        }
    }

    private class isClassOrIsInterface implements Transformer<Security, Predicate<WiFiDetail>> {

        @Override
        public Predicate<WiFiDetail> isMethod(Security isParameter) {
            return new SecurityPredicate(isNameExpr);
        }
    }

    private class isClassOrIsInterface implements Predicate<Predicate<WiFiDetail>> {

        @Override
        public boolean isMethod(Predicate<WiFiDetail> isParameter) {
            return !isNameExpr.isMethod().isMethod(isNameExpr);
        }
    }
}
