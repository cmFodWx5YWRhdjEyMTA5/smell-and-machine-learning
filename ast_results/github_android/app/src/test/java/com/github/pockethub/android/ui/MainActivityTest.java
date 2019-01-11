// isComment
package com.github.pockethub.android.ui;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import android.accounts.Account;
import android.accounts.AccountManager;
import android.content.Context;
import android.os.Build;
import android.view.MenuItem;
import com.github.pockethub.android.AccountManagerShadow;
import com.github.pockethub.android.R;
import com.github.pockethub.android.ui.gist.GistsPagerFragment;
import com.github.pockethub.android.ui.issue.FilterListFragment;
import com.github.pockethub.android.ui.issue.IssueDashboardPagerFragment;
import com.github.pockethub.android.ui.user.HomePagerFragment;
import com.meisolsson.githubsdk.model.User;
import java.util.ArrayList;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import org.robolectric.annotation.Implementation;
import org.robolectric.annotation.Implements;
import org.robolectric.shadows.ShadowAccountManager;

@RunWith(RobolectricTestRunner.class)
@Config(shadows = AccountManagerShadow.class)
public class isClassOrIsInterface {

    private MainActivity isVariable;

    private ArgumentCaptor<Account> isVariable;

    @Before
    public void isMethod() {
        isNameExpr = isNameExpr.isMethod(MainActivity.class).isMethod().isMethod();
        List<User> isVariable = new ArrayList<>();
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod(Account.class);
    }

    private MenuItem isMethod(int isParameter, String isParameter) {
        MenuItem isVariable = isMethod(MenuItem.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        return isNameExpr;
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"));
        String isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(HomePagerFragment.class, isNameExpr);
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"));
        isMethod(GistsPagerFragment.class, "isStringConstant");
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"));
        isMethod(IssueDashboardPagerFragment.class, "isStringConstant");
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"));
        isMethod(FilterListFragment.class, "isStringConstant");
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant"));
        if (isNameExpr.isFieldAccessExpr.isFieldAccessExpr >= isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            isMethod(isNameExpr.isFieldAccessExpr, isMethod(isIntegerConstant)).isMethod(isNameExpr.isMethod(), isMethod(isNameExpr), isMethod(), isMethod());
        } else {
            isMethod(isNameExpr.isFieldAccessExpr, isMethod(isIntegerConstant)).isMethod(isNameExpr.isMethod(), isMethod(), isMethod());
        }
        List<Account> isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(isIntegerConstant), isMethod(isMethod(isNameExpr.isFieldAccessExpr[isIntegerConstant])));
        isMethod(isNameExpr.isMethod(isIntegerConstant), isMethod(isMethod(isNameExpr.isFieldAccessExpr[isIntegerConstant])));
    }

    private void isMethod(Class isParameter, String isParameter) {
        isMethod(isNameExpr.isFieldAccessExpr, isMethod(isMethod(isNameExpr)));
        isMethod(isNameExpr.isMethod().isMethod().isMethod(), isMethod(isMethod(isNameExpr)));
    }
}
