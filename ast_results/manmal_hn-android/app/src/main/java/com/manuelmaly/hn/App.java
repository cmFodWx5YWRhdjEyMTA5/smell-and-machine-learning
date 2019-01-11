// isComment
package com.manuelmaly.hn;

import android.app.Application;
import com.google.android.apps.analytics.GoogleAnalyticsTracker;
import com.manuelmaly.hn.util.Const;
import org.androidannotations.annotations.EApplication;

@EApplication
public class isClassOrIsInterface extends Application {

    private static App isVariable;

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr = this;
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant, this);
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod().isMethod();
        super.isMethod();
    }

    public static App isMethod() {
        return isNameExpr;
    }
}
