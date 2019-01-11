// isComment
package com.pindroid.activity;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Intent;
import android.support.annotation.NonNull;
import com.pindroid.BuildConfig;
import com.pindroid.Constants;
import com.pindroid.application.PindroidApplication;
import com.pindroid.authenticator.AuthenticatorActivity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowAccountManager;
import org.robolectric.shadows.ShadowApplication;
import org.robolectric.util.ActivityController;
import static org.assertj.core.api.Assertions.assertThat;
import static org.robolectric.Robolectric.buildActivity;
import static org.robolectric.Shadows.shadowOf;

@RunWith(RobolectricTestRunner.class)
@Config(constants = BuildConfig.class, sdk = isIntegerConstant)
public class isClassOrIsInterface {

    private ActivityController<TestActivity> isVariable;

    private ShadowApplication isVariable;

    @Before
    public void isMethod() {
        isNameExpr = isMethod(TestActivity.class);
        isNameExpr = isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod().isMethod().isMethod();
        final Intent isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod().isMethod()).isMethod(AuthenticatorActivity.class.isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod();
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        isNameExpr.isMethod().isMethod();
        final CharSequence isVariable = isNameExpr.isMethod().isMethod().isMethod();
        isMethod(isNameExpr).isMethod("isStringConstant");
    }

    private void isMethod(@NonNull String isParameter) {
        final AccountManager isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        final Account isVariable = new Account(isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant", null);
        ((PindroidApplication) isNameExpr.isFieldAccessExpr).isMethod(isNameExpr);
    }

    public static class isClassOrIsInterface extends FragmentBaseActivity {

        @Override
        protected void isMethod(String isParameter) {
            throw new IllegalStateException("isStringConstant");
        }

        @Override
        protected void isMethod() {
        // isComment
        }
    }
}
