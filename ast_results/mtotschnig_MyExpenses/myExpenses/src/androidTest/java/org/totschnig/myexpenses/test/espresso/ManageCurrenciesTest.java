// isComment
package org.totschnig.myexpenses.test.espresso;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.support.test.rule.ActivityTestRule;
import org.junit.Rule;
import org.junit.Test;
import org.totschnig.myexpenses.MyApplication;
import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.activity.ManageCurrencies;
import org.totschnig.myexpenses.activity.ProtectedFragmentActivity;
import org.totschnig.myexpenses.di.AppComponent;
import org.totschnig.myexpenses.model.Account;
import org.totschnig.myexpenses.model.AccountType;
import org.totschnig.myexpenses.model.CurrencyContext;
import org.totschnig.myexpenses.model.CurrencyUnit;
import org.totschnig.myexpenses.model.Money;
import org.totschnig.myexpenses.model.Transaction;
import org.totschnig.myexpenses.testutils.BaseUiTest;
import org.totschnig.myexpenses.viewmodel.data.Currency;
import java.math.BigDecimal;
import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static junit.framework.Assert.assertEquals;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class isClassOrIsInterface extends BaseUiTest {

    private static final String isVariable = "isStringConstant";

    @Rule
    public ActivityTestRule<ManageCurrencies> isVariable = new ActivityTestRule<>(ManageCurrencies.class);

    @Test
    public void isMethod() throws RemoteException, OperationApplicationException {
        isMethod(true);
    }

    @Test
    public void isMethod() throws RemoteException, OperationApplicationException {
        isMethod(true);
    }

    private void isMethod(boolean isParameter) throws RemoteException, OperationApplicationException {
        final AppComponent isVariable = ((MyApplication) isNameExpr.isMethod().isMethod()).isMethod();
        CurrencyContext isVariable = isNameExpr.isMethod();
        final CurrencyUnit isVariable = isNameExpr.isMethod(isNameExpr);
        Account isVariable = new Account("isStringConstant", isNameExpr, isStringConstant, "isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isMethod();
        try {
            Transaction isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod(new Money(isNameExpr, -isStringConstant));
            isNameExpr.isMethod();
            Money isVariable = isNameExpr.isMethod();
            isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod(new BigDecimal(isIntegerConstant)));
            final Currency isVariable = isNameExpr.isMethod(isNameExpr);
            isMethod(isMethod(isNameExpr)).isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod("isStringConstant"), isMethod());
            if (isNameExpr) {
                isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
            }
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
            isMethod(isMethod(isMethod(isMethod(isNameExpr.isMethod()), isMethod("isStringConstant")))).isMethod(isMethod(isMethod()));
            Money isVariable = isNameExpr.isMethod(isNameExpr.isMethod()).isMethod();
            if (isNameExpr) {
                isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod(isNameExpr.isMethod()));
                isMethod(isNameExpr.isMethod() * isIntegerConstant, isNameExpr.isMethod().isMethod());
            } else {
                isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod(new BigDecimal(isIntegerConstant)).isMethod(isNameExpr.isMethod()));
                isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
            }
        } finally {
            isNameExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        }
    }

    @Override
    protected ActivityTestRule<? extends ProtectedFragmentActivity> isMethod() {
        return isNameExpr;
    }

    @Override
    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr;
    }
}
