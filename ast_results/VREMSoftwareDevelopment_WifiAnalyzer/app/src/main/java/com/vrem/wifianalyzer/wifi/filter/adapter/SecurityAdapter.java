// isComment
package com.vrem.wifianalyzer.wifi.filter.adapter;

import android.support.annotation.NonNull;
import com.vrem.wifianalyzer.R;
import com.vrem.wifianalyzer.settings.Settings;
import com.vrem.wifianalyzer.wifi.model.Security;
import java.util.Set;

public class isClassOrIsInterface extends EnumFilterAdapter<Security> {

    isConstructor(@NonNull Set<Security> isParameter) {
        super(Security.class, isNameExpr);
    }

    @Override
    public int isMethod(@NonNull Security isParameter) {
        return isMethod(isNameExpr) ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod(@NonNull Settings isParameter) {
        isNameExpr.isMethod(isMethod());
    }
}
