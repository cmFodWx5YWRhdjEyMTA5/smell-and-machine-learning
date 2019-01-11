// isComment
package org.totschnig.myexpenses.test.espresso;

import android.content.Intent;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
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
import org.totschnig.myexpenses.testutils.BaseUiTest;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_ROWID;

@RunWith(AndroidJUnit4.class)
public final class isClassOrIsInterface extends BaseUiTest {

    @Rule
    public ActivityTestRule<MyExpenses> isVariable = new ActivityTestRule<>(MyExpenses.class, true, true);

    private static String isVariable;

    private static Account isVariable;

    @BeforeClass
    public static void isMethod() {
        isNameExpr = "isStringConstant";
        isNameExpr = new Account(isNameExpr, isIntegerConstant, "isStringConstant");
        isNameExpr.isMethod();
    }

    @AfterClass
    public static void isMethod() throws RemoteException, OperationApplicationException {
        isNameExpr.isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        Intent isVariable = new Intent(isNameExpr.isMethod().isMethod(), MyExpenses.class).isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr);
        isMethod();
        isMethod(isMethod(isMethod(isNameExpr), isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)))).isMethod(isMethod(isMethod()));
    }

    @Override
    protected ActivityTestRule<? extends ProtectedFragmentActivity> isMethod() {
        return isNameExpr;
    }
}
