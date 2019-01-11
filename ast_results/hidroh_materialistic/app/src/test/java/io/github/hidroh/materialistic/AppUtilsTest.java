// isComment
package io.github.hidroh.materialistic;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.LocalBroadcastManager;
import android.text.format.DateUtils;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.android.controller.ActivityController;
import org.robolectric.shadows.ShadowAccountManager;
import org.robolectric.shadows.ShadowAlertDialog;
import org.robolectric.shadows.ShadowApplication;
import org.robolectric.shadows.ShadowNetworkInfo;
import javax.inject.Inject;
import io.github.hidroh.materialistic.data.HackerNewsClient;
import io.github.hidroh.materialistic.data.TestHnItem;
import io.github.hidroh.materialistic.test.TestListActivity;
import io.github.hidroh.materialistic.test.TestRunner;
import io.github.hidroh.materialistic.widget.PopupMenu;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static org.assertj.android.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.robolectric.Shadows.shadowOf;
import static org.robolectric.shadows.support.v4.Shadows.shadowOf;

@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    @Inject
    AlertDialogBuilder isVariable;

    private Activity isVariable;

    @Before
    public void isMethod() {
        isNameExpr = isNameExpr.isMethod(Activity.class).isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(new Intent(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod("isStringConstant")));
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        TextView isVariable = new TextView(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod("isStringConstant"));
        MotionEvent isVariable = isMethod(MotionEvent.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isDoubleConstant);
        isMethod(isMethod(isNameExpr).isMethod().isMethod(isNameExpr, isNameExpr));
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isDoubleConstant);
        isMethod(isMethod(isNameExpr).isMethod().isMethod(isNameExpr, isNameExpr));
        isMethod(isNameExpr.isMethod().isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(new Intent(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod("isStringConstant")));
        TextView isVariable = new TextView(new ContextThemeWrapper(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod("isStringConstant"));
        MotionEvent isVariable = isMethod(MotionEvent.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isDoubleConstant);
        isMethod(isMethod(isNameExpr).isMethod().isMethod(isNameExpr, isNameExpr));
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isDoubleConstant);
        isMethod(isMethod(isNameExpr).isMethod().isMethod(isNameExpr, isNameExpr));
        isMethod(isNameExpr.isMethod().isMethod());
    }

    @Test
    public void isMethod() {
        Activity isVariable = isNameExpr.isMethod(Activity.class);
        float isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new int[] { isNameExpr.isFieldAccessExpr.isFieldAccessExpr }).isMethod(isIntegerConstant, isIntegerConstant);
        float isVariable = isNameExpr.isMethod().isMethod(new int[] { isNameExpr.isFieldAccessExpr.isFieldAccessExpr }).isMethod(isIntegerConstant, isIntegerConstant);
        isMethod(isNameExpr).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod() + isNameExpr.isFieldAccessExpr));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod()));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod() - isIntegerConstant * isNameExpr.isFieldAccessExpr - isIntegerConstant * isNameExpr.isFieldAccessExpr));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod() - isNameExpr.isFieldAccessExpr - isNameExpr.isFieldAccessExpr));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod() - isNameExpr.isFieldAccessExpr + isNameExpr.isFieldAccessExpr));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod() - isNameExpr.isFieldAccessExpr - isNameExpr.isFieldAccessExpr));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod() - isIntegerConstant * isNameExpr.isFieldAccessExpr - isNameExpr.isFieldAccessExpr));
    }

    @Test
    public void isMethod() {
        isMethod((ConnectivityManager) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod(null);
        isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        isMethod((ConnectivityManager) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(null, isIntegerConstant, isIntegerConstant, true, true));
        isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        isMethod((ConnectivityManager) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(null, isNameExpr.isFieldAccessExpr, isIntegerConstant, true, true));
        isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        isMethod((ConnectivityManager) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(null, isNameExpr.isFieldAccessExpr, isIntegerConstant, true, true));
        isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(new Account("isStringConstant", isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(new Account("isStringConstant", isNameExpr.isFieldAccessExpr));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr, isMethod(PopupMenu.class), new View(isNameExpr), new TestHnItem(isIntegerConstant));
        isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, isMethod(PopupMenu.class), new View(isNameExpr), new TestHnItem(isIntegerConstant) {

            @Override
            public String isMethod() {
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
            }
        });
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        ActivityController<TestListActivity> isVariable = isNameExpr.isMethod(TestListActivity.class);
        TestListActivity isVariable = isNameExpr.isMethod().isMethod().isMethod().isMethod();
        isNameExpr.isMethod(isNameExpr, isMethod(PopupMenu.class), new View(isNameExpr), new TestHnItem(isIntegerConstant), null);
        isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, isMethod(PopupMenu.class), new View(isNameExpr), new TestHnItem(isIntegerConstant) {

            @Override
            public String isMethod() {
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
            }
        }, null);
        isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod();
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr, null);
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr, LoginActivity.class);
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(new Account("isStringConstant", isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr, null);
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr, LoginActivity.class);
    }

    @Test
    public void isMethod() {
        isNameExpr.isFieldAccessExpr.isMethod(this);
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(new Account("isStringConstant", isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        TextView isVariable = new TextView(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        isMethod(isNameExpr).isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        isMethod(isNameExpr).isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        isMethod(isNameExpr).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        isMethod((ConnectivityManager) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod(null);
        isNameExpr.isMethod(isNameExpr, new TestHnItem(isStringConstant) {

            @Override
            public String isMethod() {
                return "isStringConstant";
            }
        }, "isStringConstant", null);
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr, OfflineWebActivity.class).isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
    }

    @Test
    public void isMethod() {
        ActivityController<TestListActivity> isVariable = isNameExpr.isMethod(TestListActivity.class);
        TestListActivity isVariable = isNameExpr.isMethod().isMethod().isMethod().isMethod();
        FloatingActionButton isVariable = new FloatingActionButton(isNameExpr);
        isNameExpr.isMethod(isNameExpr, null, true);
        isNameExpr.isMethod();
        isMethod(isMethod(isNameExpr.isMethod(isNameExpr)).isMethod()).isMethod();
        isNameExpr.isMethod();
    }

    @Test
    public void isMethod() {
        AppBarLayout isVariable = isMethod(AppBarLayout.class);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        Navigable isVariable = isMethod(Navigable.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(true), isMethod());
        isMethod(isNameExpr, isMethod()).isMethod(isMethod());
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isFieldAccessExpr));
    }
}
