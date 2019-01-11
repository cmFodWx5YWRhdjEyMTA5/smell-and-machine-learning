// isComment
package com.vrem.wifianalyzer.navigation;

import android.support.annotation.NonNull;
import android.view.MenuItem;
import com.vrem.wifianalyzer.MainActivity;
import com.vrem.wifianalyzer.R;
import com.vrem.wifianalyzer.navigation.availability.NavigationOption;
import com.vrem.wifianalyzer.navigation.availability.NavigationOptionFactory;
import com.vrem.wifianalyzer.navigation.items.NavigationItem;
import com.vrem.wifianalyzer.navigation.items.NavigationItemFactory;
import org.apache.commons.collections4.Closure;
import org.apache.commons.collections4.IterableUtils;
import java.util.List;

public enum NavigationMenu {

    ACCESS_POINTS(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    CHANNEL_RATING(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    CHANNEL_GRAPH(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    TIME_GRAPH(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    EXPORT(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    CHANNEL_AVAILABLE(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    VENDORS(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    SETTINGS(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr),
    ABOUT(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);

    private final int isVariable;

    private final int isVariable;

    private final List<NavigationOption> isVariable;

    private final NavigationItem isVariable;

    isConstructor(int isParameter, int isParameter, @NonNull NavigationItem isParameter, @NonNull List<NavigationOption> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    isConstructor(int isParameter, int isParameter, @NonNull NavigationItem isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    public int isMethod() {
        return isNameExpr;
    }

    public void isMethod(@NonNull MainActivity isParameter, @NonNull MenuItem isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr, this);
    }

    public void isMethod(@NonNull MainActivity isParameter) {
        isNameExpr.isMethod(isNameExpr, new ActivateClosure(isNameExpr));
    }

    public boolean isMethod() {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    public boolean isMethod() {
        return isNameExpr.isMethod();
    }

    int isMethod() {
        return isNameExpr;
    }

    @NonNull
    NavigationItem isMethod() {
        return isNameExpr;
    }

    @NonNull
    List<NavigationOption> isMethod() {
        return isNameExpr;
    }

    private class isClassOrIsInterface implements Closure<NavigationOption> {

        private final MainActivity isVariable;

        private isConstructor(@NonNull MainActivity isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public void isMethod(NavigationOption isParameter) {
            isNameExpr.isMethod(isNameExpr);
        }
    }
}
