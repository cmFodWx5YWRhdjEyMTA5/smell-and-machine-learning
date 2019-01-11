// isComment
package com.vrem.wifianalyzer.navigation.options;

import android.support.annotation.NonNull;
import com.vrem.util.EnumUtils;
import com.vrem.wifianalyzer.R;
import org.apache.commons.collections4.Predicate;

enum OptionAction {

    NO_ACTION(-isIntegerConstant, new NoAction()), SCANNER(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new ScannerAction()), FILTER(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new FilterAction()), WIFI_BAND(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new WiFiBandAction());

    private final int isVariable;

    private final Action isVariable;

    isConstructor(int isParameter, @NonNull Action isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @NonNull
    public static OptionAction isMethod(int isParameter) {
        return isNameExpr.isMethod(OptionAction.class, new ActionPredicate(isNameExpr), isNameExpr);
    }

    int isMethod() {
        return isNameExpr;
    }

    @NonNull
    Action isMethod() {
        return isNameExpr;
    }

    private static class isClassOrIsInterface implements Predicate<OptionAction> {

        private final int isVariable;

        private isConstructor(int isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public boolean isMethod(OptionAction isParameter) {
            return isNameExpr == isNameExpr.isFieldAccessExpr;
        }
    }

    static class isClassOrIsInterface implements Action {

        @Override
        public void isMethod() {
        // isComment
        }
    }
}
