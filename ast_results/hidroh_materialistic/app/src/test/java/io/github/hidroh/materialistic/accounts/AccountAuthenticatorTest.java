// isComment
package io.github.hidroh.materialistic.accounts;

import android.accounts.AccountAuthenticatorResponse;
import android.accounts.AccountManager;
import android.accounts.NetworkErrorException;
import android.content.Intent;
import android.os.Bundle;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import io.github.hidroh.materialistic.test.TestRunner;
import org.robolectric.RuntimeEnvironment;
import io.github.hidroh.materialistic.BuildConfig;
import io.github.hidroh.materialistic.LoginActivity;
import static org.assertj.android.api.Assertions.assertThat;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;

@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private AccountAuthenticator isVariable;

    @Before
    public void isMethod() {
        isNameExpr = new AccountAuthenticator(isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws NetworkErrorException {
        Bundle isVariable = isNameExpr.isMethod(isMethod(AccountAuthenticatorResponse.class), isNameExpr.isFieldAccessExpr, null, null, null);
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr);
        Intent isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, LoginActivity.class).isMethod(isNameExpr.isFieldAccessExpr, true);
    }

    @Test
    public void isMethod() throws NetworkErrorException {
        isMethod(isNameExpr.isMethod(null, null));
        isMethod(isNameExpr.isMethod(null, null, null));
        isMethod(isNameExpr.isMethod(null, null, null, null));
        isMethod(isNameExpr.isMethod(null));
        isMethod(isNameExpr.isMethod(null, null, null, null));
        isMethod(isNameExpr.isMethod(null, null, null));
    }
}
