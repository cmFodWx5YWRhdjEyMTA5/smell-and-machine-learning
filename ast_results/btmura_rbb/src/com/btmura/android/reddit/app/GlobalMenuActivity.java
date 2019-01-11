// isComment
package com.btmura.android.reddit.app;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.view.KeyEvent;

abstract class isClassOrIsInterface extends FragmentActivity {

    @Override
    public boolean isMethod(int isParameter, @NonNull KeyEvent isParameter) {
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr:
                GlobalMenuFragment isVariable = isMethod();
                if (isNameExpr != null) {
                    isNameExpr.isMethod();
                    return true;
                }
            default:
                return super.isMethod(isNameExpr, isNameExpr);
        }
    }

    private GlobalMenuFragment isMethod() {
        return (GlobalMenuFragment) isMethod().isMethod(isNameExpr.isFieldAccessExpr);
    }
}
