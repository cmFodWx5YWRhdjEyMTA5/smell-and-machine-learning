// isComment
package com.vrem.wifianalyzer.wifi.filter.adapter;

import android.support.annotation.NonNull;
import com.vrem.wifianalyzer.R;
import com.vrem.wifianalyzer.settings.Settings;
import com.vrem.wifianalyzer.wifi.band.WiFiBand;
import java.util.Set;

public class isClassOrIsInterface extends EnumFilterAdapter<WiFiBand> {

    isConstructor(@NonNull Set<WiFiBand> isParameter) {
        super(WiFiBand.class, isNameExpr);
    }

    @Override
    public int isMethod(@NonNull WiFiBand isParameter) {
        return isMethod(isNameExpr) ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod(@NonNull Settings isParameter) {
        isNameExpr.isMethod(isMethod());
    }
}
