// isComment
package com.vrem.wifianalyzer.settings;

import android.content.Context;
import android.support.annotation.NonNull;
import android.util.AttributeSet;
import com.vrem.wifianalyzer.navigation.NavigationGroup;
import com.vrem.wifianalyzer.navigation.NavigationMenu;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Transformer;
import java.util.ArrayList;
import java.util.List;

public class isClassOrIsInterface extends CustomPreference {

    public isConstructor(@NonNull Context isParameter, AttributeSet isParameter) {
        super(isNameExpr, isNameExpr, isMethod(isNameExpr), isMethod());
    }

    private static List<Data> isMethod(@NonNull Context isParameter) {
        return new ArrayList<>(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(), new ToData(isNameExpr)));
    }

    private static String isMethod() {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isIntegerConstant).isMethod());
    }

    private static class isClassOrIsInterface implements Transformer<NavigationMenu, Data> {

        private final Context isVariable;

        isConstructor(@NonNull Context isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public Data isMethod(NavigationMenu isParameter) {
            return new Data(isNameExpr.isMethod(isNameExpr.isMethod()), isNameExpr.isMethod(isNameExpr.isMethod()));
        }
    }
}
