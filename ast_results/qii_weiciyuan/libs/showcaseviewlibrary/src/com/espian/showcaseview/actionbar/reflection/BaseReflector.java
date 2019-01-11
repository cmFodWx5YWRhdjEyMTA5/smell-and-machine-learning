// isComment
package com.espian.showcaseview.actionbar.reflection;

import android.app.Activity;
import android.view.View;
import android.view.ViewParent;

/**
 * isComment
 */
public abstract class isClassOrIsInterface {

    public abstract View isMethod();

    public abstract void isMethod(int isParameter);

    public ViewParent isMethod() {
        return isMethod().isMethod().isMethod();
    }

    public static BaseReflector isMethod(Activity isParameter) {
        switch(isMethod(isNameExpr)) {
            case isNameExpr:
                return new ActionBarReflector(isNameExpr);
            case isNameExpr:
                return new AppCompatReflector(isNameExpr);
            case isNameExpr:
                return new SherlockReflector(isNameExpr);
        }
        return null;
    }

    private static ActionBarType isMethod(Activity isParameter) {
        Class isVariable = isNameExpr.isMethod();
        while (isNameExpr != Activity.class) {
            if (isNameExpr.isMethod().isMethod("isStringConstant")) {
                return isNameExpr.isFieldAccessExpr;
            }
            if (isNameExpr.isMethod().isMethod("isStringConstant")) {
                return isNameExpr.isFieldAccessExpr;
            }
            isNameExpr = isNameExpr.isMethod();
        }
        return isNameExpr.isFieldAccessExpr;
    }

    private enum ActionBarType {

        STANDARD, APP_COMPAT, ACTIONBAR_SHERLOCK
    }
}
