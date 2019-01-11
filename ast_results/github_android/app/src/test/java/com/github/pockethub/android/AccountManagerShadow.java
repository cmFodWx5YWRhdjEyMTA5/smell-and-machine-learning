// isComment
package com.github.pockethub.android;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import org.mockito.Mockito;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import org.robolectric.shadows.ShadowAccountManager;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@Implements(AccountManager.class)
public class isClassOrIsInterface extends ShadowAccountManager {

    public static AccountManager isVariable = isNameExpr.isMethod(AccountManager.class);

    public static Account[] isVariable;

    static {
        String isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        Account isVariable = new Account("isStringConstant", isNameExpr);
        Account isVariable = new Account("isStringConstant", isNameExpr);
        isNameExpr = new Account[] { isNameExpr, isNameExpr };
        isNameExpr = isMethod(AccountManager.class);
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
    }

    @Implementation
    public static AccountManager isMethod(Context isParameter) {
        return isNameExpr;
    }
}
