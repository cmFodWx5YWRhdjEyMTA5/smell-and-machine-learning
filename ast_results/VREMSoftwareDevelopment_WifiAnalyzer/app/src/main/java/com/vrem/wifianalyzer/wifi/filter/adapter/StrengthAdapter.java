// isComment
package com.vrem.wifianalyzer.wifi.filter.adapter;

import android.support.annotation.NonNull;
import com.vrem.wifianalyzer.settings.Settings;
import com.vrem.wifianalyzer.wifi.model.Strength;
import java.util.Set;

public class isClassOrIsInterface extends EnumFilterAdapter<Strength> {

    isConstructor(@NonNull Set<Strength> isParameter) {
        super(Strength.class, isNameExpr);
    }

    @Override
    public int isMethod(@NonNull Strength isParameter) {
        return isMethod(isNameExpr) ? isNameExpr.isMethod() : isNameExpr.isMethod();
    }

    @Override
    public void isMethod(@NonNull Settings isParameter) {
        isNameExpr.isMethod(isMethod());
    }
}
