// isComment
package com.wangdaye.mysplash.user.presenter.activity;

import android.text.TextUtils;
import android.widget.Toast;
import com.wangdaye.mysplash.R;
import com.wangdaye.mysplash.common.i.presenter.ToolbarPresenter;
import com.wangdaye.mysplash.common.basic.activity.MysplashActivity;
import com.wangdaye.mysplash.common.utils.ShareUtils;
import com.wangdaye.mysplash.common.utils.helper.IntentHelper;
import com.wangdaye.mysplash.user.view.activity.UserActivity;

public class isClassOrIsInterface implements ToolbarPresenter {

    @Override
    public void isMethod(MysplashActivity isParameter) {
        isNameExpr.isMethod(true);
    }

    @Override
    public void isMethod(MysplashActivity isParameter) {
    // isComment
    }

    @Override
    public boolean isMethod(MysplashActivity isParameter, int isParameter) {
        UserActivity isVariable = (UserActivity) isNameExpr;
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                String isVariable = isNameExpr.isMethod();
                if (!isNameExpr.isMethod(isNameExpr)) {
                    isNameExpr.isMethod(isNameExpr, isNameExpr);
                } else {
                    isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr).isMethod();
                }
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod(isNameExpr.isMethod());
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod();
                break;
        }
        return true;
    }
}
