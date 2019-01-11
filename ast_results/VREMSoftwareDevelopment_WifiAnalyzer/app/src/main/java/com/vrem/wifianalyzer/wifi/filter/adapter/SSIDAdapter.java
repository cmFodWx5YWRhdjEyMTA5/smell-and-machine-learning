// isComment
package com.vrem.wifianalyzer.wifi.filter.adapter;

import android.support.annotation.NonNull;
import com.vrem.wifianalyzer.settings.Settings;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.lang3.StringUtils;
import java.util.HashSet;
import java.util.Set;

public class isClassOrIsInterface extends BasicFilterAdapter<String> {

    isConstructor(@NonNull Set<String> isParameter) {
        super(isNameExpr);
    }

    @Override
    public void isMethod(@NonNull Set<String> isParameter) {
        super.isMethod(new HashSet<>(isNameExpr.isMethod(isNameExpr, new SSIDPredicate())));
    }

    @Override
    public boolean isMethod() {
        return !isMethod().isMethod();
    }

    @Override
    public void isMethod() {
        isMethod(new HashSet<>());
    }

    @Override
    public void isMethod(@NonNull Settings isParameter) {
        isNameExpr.isMethod(isMethod());
    }

    private class isClassOrIsInterface implements Predicate<String> {

        @Override
        public boolean isMethod(String isParameter) {
            return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        }
    }
}
