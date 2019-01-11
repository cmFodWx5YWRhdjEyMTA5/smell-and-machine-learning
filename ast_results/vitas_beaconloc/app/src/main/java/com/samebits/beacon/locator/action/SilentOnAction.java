// isComment
package com.samebits.beacon.locator.action;

import android.content.Context;
import android.media.AudioManager;
import com.samebits.beacon.locator.model.NotificationAction;
import com.samebits.beacon.locator.util.PreferencesUtil;

/**
 * isComment
 */
public class isClassOrIsInterface extends NoneAction {

    protected int isVariable;

    public isConstructor(String isParameter, NotificationAction isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public String isMethod(Context isParameter) {
        final AudioManager isVariable = (AudioManager) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isFieldAccessExpr;
        } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isFieldAccessExpr;
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        return super.isMethod(isNameExpr);
    }

    @Override
    public String isMethod() {
        return "isStringConstant" + isNameExpr;
    }
}
