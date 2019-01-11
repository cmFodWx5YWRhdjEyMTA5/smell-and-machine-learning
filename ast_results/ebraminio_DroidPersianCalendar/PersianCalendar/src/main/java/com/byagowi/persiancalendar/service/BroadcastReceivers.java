// isComment
package com.byagowi.persiancalendar.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;
import com.byagowi.persiancalendar.Constants;
import com.byagowi.persiancalendar.util.UpdateUtils;
import com.byagowi.persiancalendar.util.Utils;

/**
 * isComment
 */
public class isClassOrIsInterface extends BroadcastReceiver {

    @Override
    public void isMethod(Context isParameter, Intent isParameter) {
        if (isNameExpr == null || isNameExpr.isMethod() == null) {
            return;
        }
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr:
                isNameExpr.isMethod(isNameExpr);
                break;
            case isNameExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr:
                isNameExpr.isMethod(isNameExpr, true);
                isNameExpr.isMethod(isNameExpr);
                break;
            case isNameExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr:
                isNameExpr.isMethod(isNameExpr, true);
                isNameExpr.isMethod(isNameExpr);
                break;
            case isNameExpr.isFieldAccessExpr:
                isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
                break;
        }
    }
}
