// isComment
package com.umang.dashnotifier;

import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.preference.PreferenceManager;
import com.google.android.apps.dashclock.api.DashClockExtension;
import com.google.android.apps.dashclock.api.ExtensionData;
import com.umang.dashnotifier.provider.NotificationProvider;

public class isClassOrIsInterface extends DashClockExtension {

    static final String isVariable = "isStringConstant";

    SharedPreferences isVariable;

    PackageManager isVariable;

    String isVariable;

    Cursor isVariable;

    String[] isVariable;

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr = isNameExpr.isMethod(this);
        isNameExpr = isMethod();
        isNameExpr = isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    protected void isMethod(int isParameter) {
        ExtensionData isVariable = isNameExpr.isMethod(this, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr);
    }

    @Override
    protected void isMethod(boolean isParameter) {
        super.isMethod(isNameExpr);
        if (!isNameExpr) {
            isMethod(new String[] { isNameExpr.isFieldAccessExpr.isMethod() });
        }
    }
}
