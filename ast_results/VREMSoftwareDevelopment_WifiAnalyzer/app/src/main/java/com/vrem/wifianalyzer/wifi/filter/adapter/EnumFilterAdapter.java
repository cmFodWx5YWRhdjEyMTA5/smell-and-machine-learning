// isComment
package com.vrem.wifianalyzer.wifi.filter.adapter;

import android.support.annotation.NonNull;
import com.vrem.util.EnumUtils;
import java.util.Set;

public abstract class isClassOrIsInterface<T extends Enum> extends BasicFilterAdapter<T> {

    private final Class<T> isVariable;

    isConstructor(@NonNull Class<T> isParameter, @NonNull Set<T> isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public boolean isMethod() {
        return isMethod().isMethod() != isNameExpr.isMethod(isNameExpr).isMethod();
    }

    public boolean isMethod(@NonNull T isParameter) {
        boolean isVariable = true;
        if (isMethod(isNameExpr)) {
            if (isMethod().isMethod() > isIntegerConstant) {
                isNameExpr = isMethod().isMethod(isNameExpr);
            }
        } else {
            isNameExpr = isMethod().isMethod(isNameExpr);
        }
        return isNameExpr;
    }

    @Override
    public void isMethod() {
        isMethod(isNameExpr.isMethod(isNameExpr));
    }

    public abstract int isMethod(@NonNull T isParameter);

    boolean isMethod(@NonNull T isParameter) {
        return isMethod().isMethod(isNameExpr);
    }
}
