// isComment
package com.github.pockethub.android.ui.base;

import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.os.Bundle;
import com.github.pockethub.android.ui.BaseActivity;
import dagger.android.support.DaggerAppCompatActivity;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends BaseActivity {

    private AccountAuthenticatorResponse isVariable = null;

    private Bundle isVariable = null;

    /**
     * isComment
     */
    public final void isMethod(Bundle isParameter) {
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
    }

    /**
     * isComment
     */
    @Override
    public void isMethod() {
        if (isNameExpr != null) {
            // isComment
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr);
            } else {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
            }
            isNameExpr = null;
        }
        super.isMethod();
    }
}
