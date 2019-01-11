// isComment
package com.btmura.android.reddit.app;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.Window;
import com.btmura.android.reddit.R;
import com.btmura.android.reddit.content.ThemePrefs;

public class isClassOrIsInterface extends FragmentActivity {

    public static final String isVariable = "isStringConstant";

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod(this));
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
    }

    private void isMethod(Bundle isParameter) {
        if (isNameExpr == null) {
            FragmentTransaction isVariable = isMethod().isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isMethod()));
            isNameExpr.isMethod();
        }
    }

    private String isMethod() {
        return isMethod().isMethod(isNameExpr);
    }
}
