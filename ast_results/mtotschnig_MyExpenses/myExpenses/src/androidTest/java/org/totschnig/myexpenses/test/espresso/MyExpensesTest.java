// isComment
package org.totschnig.myexpenses.test.espresso;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.Context;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.contrib.DrawerActions;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.espresso.matcher.CursorMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v4.view.ViewPager;
import android.widget.AdapterView;
import android.widget.Button;
import org.junit.After;
import org.junit.Assume;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.activity.AccountEdit;
import org.totschnig.myexpenses.activity.ExpenseEdit;
import org.totschnig.myexpenses.activity.ManageTemplates;
import org.totschnig.myexpenses.activity.MyExpenses;
import org.totschnig.myexpenses.activity.MyPreferenceActivity;
import org.totschnig.myexpenses.activity.ProtectedFragmentActivity;
import org.totschnig.myexpenses.model.Account;
import org.totschnig.myexpenses.model.AccountType;
import org.totschnig.myexpenses.model.CurrencyUnit;
import org.totschnig.myexpenses.preference.PrefKey;
import org.totschnig.myexpenses.provider.DatabaseConstants;
import org.totschnig.myexpenses.testutils.BaseUiTest;
import org.totschnig.myexpenses.ui.FragmentPagerAdapter;
import org.totschnig.myexpenses.util.DistribHelper;
import java.util.Currency;
import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.longClick;
import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.Intents.intending;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasExtraWithKey;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertTrue;
import static org.totschnig.myexpenses.activity.MyExpenses.KEY_SEQUENCE_COUNT;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_ROWID;
import static org.totschnig.myexpenses.testutils.Espresso.openActionBarOverflowOrOptionsMenu;

@RunWith(AndroidJUnit4.class)
public final class isClassOrIsInterface extends BaseUiTest {

    private Account isVariable;

    @Rule
    public final IntentsTestRule<MyExpenses> isVariable = new IntentsTestRule<>(MyExpenses.class, true, true);

    @Before
    public void isMethod() {
        isNameExpr = new Account("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")), isIntegerConstant, "isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr);
    }

    @After
    public void isMethod() throws RemoteException, OperationApplicationException {
        isNameExpr.isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        MyExpenses isVariable = isNameExpr.isMethod();
        isMethod(isMethod(isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)))).isMethod(isMethod(isMethod()));
        FragmentPagerAdapter isVariable = (FragmentPagerAdapter) ((ViewPager) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isMethod(isNameExpr != null);
        isMethod(isNameExpr.isMethod(), isIntegerConstant);
    }

    @Test
    public void isMethod() {
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(ExpenseEdit.class.isMethod()));
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(!isNameExpr.isMethod());
        isNameExpr.isFieldAccessExpr.isMethod();
        isMethod(isNameExpr.isFieldAccessExpr + isIntegerConstant);
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod()));
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)))).isMethod(isMethod(isMethod()));
        isMethod(isMethod(isMethod(Button.class), isMethod(isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr))))).isMethod(isMethod(isMethod()));
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(MyPreferenceActivity.class.isMethod()));
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    private void isMethod(int isParameter, int isParameter, int isParameter) {
        isMethod(isNameExpr, isNameExpr);
        isMethod(isMethod(isNameExpr)).isMethod(isMethod(isMethod()));
        isMethod(isMethod(isMethod(Button.class), isMethod(isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr))))).isMethod(isMethod());
    }

    @Test
    public void isMethod() {
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isMethod(AccountEdit.class.isMethod()), isMethod(isMethod(isNameExpr.isFieldAccessExpr))));
    }

    @Test
    public void isMethod() {
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod());
        isMethod(isMethod()).isMethod(isMethod(isMethod(AdapterView.class), isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), isMethod())).isMethod(isIntegerConstant).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isMethod(AccountEdit.class.isMethod()), isMethod(isNameExpr.isFieldAccessExpr)));
    }

    @Test
    public void isMethod() {
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod());
        isMethod(isMethod()).isMethod(isMethod(isMethod(AdapterView.class), isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), isMethod())).isMethod(isIntegerConstant).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
    }

    @Test
    public void isMethod() {
        // isComment
        Account isVariable = new Account("isStringConstant", isIntegerConstant, "isStringConstant");
        isNameExpr.isMethod();
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod())).isMethod(isMethod(isMethod(AdapterView.class), isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), isMethod())).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod()));
        isMethod(isMethod(isMethod(Button.class), isMethod(isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))))).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod()));
    }

    @Test
    public void isMethod() throws RemoteException, OperationApplicationException {
        // isComment
        Account isVariable = new Account("isStringConstant", isIntegerConstant, "isStringConstant");
        isNameExpr.isMethod();
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod())).isMethod(isMethod(isMethod(AdapterView.class), isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), isMethod())).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod()));
        isMethod(isMethod(isMethod(Button.class), isMethod(isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr))))).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod()));
        isNameExpr.isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws RemoteException, OperationApplicationException {
        Context isVariable = isNameExpr.isMethod();
        String isVariable = "isStringConstant";
        String isVariable = "isStringConstant";
        Account isVariable = new Account(isNameExpr, isIntegerConstant, "isStringConstant");
        isNameExpr.isMethod();
        Account isVariable = new Account(isNameExpr, isIntegerConstant, "isStringConstant");
        isNameExpr.isMethod();
        // isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod())).isMethod(isMethod(isMethod(AdapterView.class), isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), isMethod())).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr))).isMethod(isMethod(isMethod()));
        isMethod(isMethod(isMethod(Button.class), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr))).isMethod(isMethod());
        // isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod())).isMethod(isMethod(isMethod(AdapterView.class), isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), isMethod())).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr))).isMethod(isMethod(isMethod()));
        isMethod(isMethod(isMethod(Button.class), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr))).isMethod(isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod()));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(ManageTemplates.class.isMethod()));
    }

    private void isMethod(long isParameter) {
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr);
        Instrumentation.ActivityResult isVariable = new Instrumentation.ActivityResult(isNameExpr.isFieldAccessExpr, isNameExpr);
        // isComment
        isMethod(isMethod(ExpenseEdit.class.isMethod())).isMethod(isNameExpr);
    }

    @Override
    protected ActivityTestRule<? extends ProtectedFragmentActivity> isMethod() {
        return isNameExpr;
    }
}
