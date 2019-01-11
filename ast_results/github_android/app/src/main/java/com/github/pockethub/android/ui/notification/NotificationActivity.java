// isComment
package com.github.pockethub.android.ui.notification;

import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.MenuItem;
import com.github.pockethub.android.R;
import com.github.pockethub.android.ui.TabPagerActivity;

public class isClassOrIsInterface extends TabPagerActivity<NotificationPagerAdapter> {

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        ActionBar isVariable = isMethod();
        isNameExpr.isMethod(true);
        isMethod();
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod();
                return true;
            default:
                return super.isMethod(isNameExpr);
        }
    }

    @Override
    protected NotificationPagerAdapter isMethod() {
        return new NotificationPagerAdapter(this);
    }
}
