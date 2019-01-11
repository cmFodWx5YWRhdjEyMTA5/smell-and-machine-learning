// isComment
package org.totschnig.myexpenses.test.espresso;

import android.content.Intent;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.rule.ActivityTestRule;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.activity.ExpenseEdit;
import org.totschnig.myexpenses.activity.ManageTemplates;
import org.totschnig.myexpenses.activity.ProtectedFragmentActivity;
import org.totschnig.myexpenses.model.Account;
import org.totschnig.myexpenses.model.AccountType;
import org.totschnig.myexpenses.model.CurrencyUnit;
import org.totschnig.myexpenses.model.Money;
import org.totschnig.myexpenses.model.Template;
import org.totschnig.myexpenses.model.Transaction;
import org.totschnig.myexpenses.preference.PrefKey;
import org.totschnig.myexpenses.testutils.BaseUiTest;
import java.util.Currency;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.assertj.core.api.Assertions.assertThat;
import static org.totschnig.myexpenses.contract.TransactionsContract.Transactions.TYPE_TRANSACTION;

// isComment
public class isClassOrIsInterface extends BaseUiTest {

    @Rule
    public IntentsTestRule<ManageTemplates> isVariable = new IntentsTestRule<>(ManageTemplates.class, true, true);

    private static Template isVariable;

    private static Account isVariable;

    @Before
    public void isMethod() {
        isNameExpr = new Account("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")), isIntegerConstant, "isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isNameExpr = new Template(isNameExpr, isNameExpr, null);
        isNameExpr.isMethod(new Money(isNameExpr.isMethod(), -isStringConstant));
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod())).isMethod(isIntegerConstant);
        Intent isVariable = new Intent(isNameExpr.isMethod().isMethod(), ManageTemplates.class);
        isNameExpr.isMethod(isNameExpr);
    }

    @After
    public void isMethod() throws RemoteException, OperationApplicationException {
        isNameExpr.isMethod(isNameExpr.isMethod());
    }

    private void isMethod() {
        isMethod(isMethod(ExpenseEdit.class.isMethod()));
    }

    private void isMethod() {
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod())).isMethod(isIntegerConstant);
    }

    @Test
    public void isMethod() {
        isMethod();
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod();
    }

    @Test
    public void isMethod() throws InterruptedException {
        isMethod();
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod();
    }

    @Test
    public void isMethod() {
        isNameExpr.isFieldAccessExpr.isMethod(true);
        isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
        isMethod();
        isMethod();
        isNameExpr.isFieldAccessExpr.isMethod();
        isNameExpr.isFieldAccessExpr.isMethod();
    }

    @Test
    public void isMethod() {
        isNameExpr.isFieldAccessExpr.isMethod(true);
        isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
        isMethod();
        isMethod();
        isNameExpr.isFieldAccessExpr.isMethod();
        isNameExpr.isFieldAccessExpr.isMethod();
    }

    @Override
    protected ActivityTestRule<? extends ProtectedFragmentActivity> isMethod() {
        return isNameExpr;
    }
}
