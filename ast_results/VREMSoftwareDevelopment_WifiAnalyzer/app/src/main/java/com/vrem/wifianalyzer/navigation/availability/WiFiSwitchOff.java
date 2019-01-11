// isComment
package com.vrem.wifianalyzer.navigation.availability;

import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.view.Menu;
import com.vrem.wifianalyzer.MainActivity;
import com.vrem.wifianalyzer.R;
import com.vrem.wifianalyzer.navigation.options.OptionMenu;
import org.apache.commons.lang3.StringUtils;

class isClassOrIsInterface implements NavigationOption {

    @Override
    public void isMethod(@NonNull MainActivity isParameter) {
        isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    private void isMethod(@NonNull MainActivity isParameter) {
        ActionBar isVariable = isNameExpr.isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
    }

    private void isMethod(@NonNull MainActivity isParameter) {
        OptionMenu isVariable = isNameExpr.isMethod();
        if (isNameExpr != null) {
            Menu isVariable = isNameExpr.isMethod();
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(true);
            }
        }
    }
}
