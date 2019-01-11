// isComment
package org.totschnig.myexpenses.test.espresso;

import android.content.Intent;
import android.content.OperationApplicationException;
import android.database.Cursor;
import android.os.RemoteException;
import android.support.test.espresso.matcher.CursorMatchers;
import android.support.test.filters.FlakyTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.activity.MyExpenses;
import org.totschnig.myexpenses.activity.ProtectedFragmentActivity;
import org.totschnig.myexpenses.model.Account;
import org.totschnig.myexpenses.model.AccountType;
import org.totschnig.myexpenses.model.ContribFeature;
import org.totschnig.myexpenses.model.CurrencyUnit;
import org.totschnig.myexpenses.model.Money;
import org.totschnig.myexpenses.model.Transaction;
import org.totschnig.myexpenses.provider.DatabaseConstants;
import org.totschnig.myexpenses.testutils.BaseUiTest;
import java.util.Currency;
import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.longClick;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasDescendant;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.Matchers.both;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_ROWID;
import static org.totschnig.myexpenses.testutils.Matchers.withAdaptedData;

@RunWith(AndroidJUnit4.class)
public final class isClassOrIsInterface extends BaseUiTest {

    @Rule
    public ActivityTestRule<MyExpenses> isVariable = new ActivityTestRule<>(MyExpenses.class, true, true);

    private Account isVariable;

    @Before
    public void isMethod() {
        isNameExpr = new Account("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")), isIntegerConstant, "isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        Transaction isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(new Money(isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")), -isStringConstant));
        isNameExpr.isMethod();
        int isVariable = isIntegerConstant;
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) {
            isNameExpr.isMethod();
        }
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr);
    }

    @After
    public void isMethod() throws RemoteException, OperationApplicationException {
        isNameExpr.isMethod(isNameExpr.isMethod());
    }

    @Test
    @FlakyTest
    public void isMethod() {
        int isVariable = isMethod().isMethod();
        isMethod(isMethod(isMethod(Cursor.class))).isMethod(isMethod()).isMethod(isIntegerConstant).isMethod(isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod().isMethod()).isMethod(isNameExpr + isIntegerConstant);
    }

    @Test
    @FlakyTest
    public void isMethod() {
        int isVariable = isMethod().isMethod();
        isMethod(isMethod(isMethod(Cursor.class))).isMethod(isMethod()).isMethod(// isComment
        isIntegerConstant).isMethod(isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod().isMethod()).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        isMethod();
        String isVariable = "isStringConstant";
        isMethod(isMethod(isMethod(Cursor.class))).isMethod(isMethod()).isMethod(isIntegerConstant).isMethod(isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isMethod(isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)))).isMethod(isMethod(isMethod()));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isNameExpr));
        isMethod();
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        // isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isMethod(isNameExpr))).isMethod(isMethod(isMethod()));
    }

    @Test
    public void isMethod() {
        int isVariable = isMethod().isMethod();
        isMethod(isMethod(isMethod(Cursor.class))).isMethod(isMethod()).isMethod(isIntegerConstant).isMethod(isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod().isMethod()).isMethod(isNameExpr - isIntegerConstant);
    }

    @Test
    public void isMethod() {
        int isVariable = isMethod().isMethod();
        isMethod(isMethod(isMethod(Cursor.class))).isMethod(isMethod()).isMethod(// isComment
        isIntegerConstant).isMethod(isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isMethod(Cursor.class))).isMethod(isMethod()).isMethod(isIntegerConstant).isMethod(isMethod(isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod()))));
        isMethod(isMethod().isMethod()).isMethod(isNameExpr);
        isMethod(isMethod(isMethod(Cursor.class))).isMethod(isMethod()).isMethod(// isComment
        isIntegerConstant).isMethod(isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isMethod()).isMethod(isMethod(isMethod(isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant")))));
        isMethod(isMethod().isMethod()).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        int isVariable = isMethod().isMethod();
        isMethod(isMethod(isMethod(Cursor.class))).isMethod(isMethod()).isMethod(isIntegerConstant).isMethod(isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod().isMethod()).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws InterruptedException {
        isMethod();
        isMethod(isMethod(isMethod(Cursor.class))).isMethod(isMethod()).isMethod(isIntegerConstant).isMethod(isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod()));
    // isComment
    /*isComment*/
    }

    @Override
    protected ActivityTestRule<? extends ProtectedFragmentActivity> isMethod() {
        return isNameExpr;
    }
}
