// isComment
package org.totschnig.myexpenses.test.espresso;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.support.test.espresso.matcher.CursorMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.activity.MyExpenses;
import org.totschnig.myexpenses.activity.ProtectedFragmentActivity;
import org.totschnig.myexpenses.model.Account;
import org.totschnig.myexpenses.model.AccountType;
import org.totschnig.myexpenses.model.Category;
import org.totschnig.myexpenses.model.CurrencyUnit;
import org.totschnig.myexpenses.model.Money;
import org.totschnig.myexpenses.model.Transaction;
import org.totschnig.myexpenses.provider.DatabaseConstants;
import org.totschnig.myexpenses.testutils.BaseUiTest;
import org.totschnig.myexpenses.testutils.Matchers;
import java.util.Currency;
import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.isPlatformPopup;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.totschnig.myexpenses.testutils.Matchers.withCategoryLabel;

@RunWith(AndroidJUnit4.class)
public final class isClassOrIsInterface extends BaseUiTest {

    @Rule
    public ActivityTestRule<MyExpenses> isVariable = new ActivityTestRule<>(MyExpenses.class);

    private static String isVariable;

    private static String isVariable;

    private static Account isVariable;

    @BeforeClass
    public static void isMethod() {
        isNameExpr = "isStringConstant";
        isNameExpr = "isStringConstant";
        final CurrencyUnit isVariable = isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        isNameExpr = new Account("isStringConstant", isNameExpr, isIntegerConstant, "isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        long isVariable = isNameExpr.isMethod(isStringConstant, isNameExpr, null);
        long isVariable = isNameExpr.isMethod(isStringConstant, isNameExpr, null);
        Transaction isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(new Money(isNameExpr, -isStringConstant));
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod();
    }

    @AfterClass
    public static void isMethod() throws RemoteException, OperationApplicationException {
        isNameExpr.isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        isMethod();
        isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isMethod(isNameExpr))).isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isNameExpr);
        isMethod(isNameExpr);
        // isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isNameExpr)).isMethod(isMethod()).isMethod(isMethod());
        isMethod(isNameExpr);
    }

    private void isMethod(String isParameter) {
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr)).isMethod(isMethod()).isMethod(isMethod(isMethod()));
    }

    private void isMethod(String isParameter) {
        isMethod(isMethod()).isMethod(isMethod(isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr)))));
    }

    @Override
    protected ActivityTestRule<? extends ProtectedFragmentActivity> isMethod() {
        return isNameExpr;
    }
}
