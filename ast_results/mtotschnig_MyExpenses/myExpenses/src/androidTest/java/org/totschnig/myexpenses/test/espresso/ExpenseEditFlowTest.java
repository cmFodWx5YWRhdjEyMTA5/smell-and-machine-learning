// isComment
package org.totschnig.myexpenses.test.espresso;

import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.activity.ExpenseEdit;
import org.totschnig.myexpenses.model.Account;
import org.totschnig.myexpenses.model.AccountType;
import org.totschnig.myexpenses.model.CurrencyUnit;
import org.totschnig.myexpenses.model.PaymentMethod;
import java.util.Currency;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.TestCase.assertTrue;

public class isClassOrIsInterface {

    @Rule
    public ActivityTestRule<ExpenseEdit> isVariable = new ActivityTestRule<>(ExpenseEdit.class);

    private static String isVariable = "isStringConstant";

    private static Account isVariable;

    private static CurrencyUnit isVariable = isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));

    private static PaymentMethod isVariable;

    @BeforeClass
    public static void isMethod() {
        isNameExpr = new Account(isNameExpr, isNameExpr, isIntegerConstant, "isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod());
        isNameExpr = new PaymentMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod());
    }

    @AfterClass
    public static void isMethod() throws RemoteException, OperationApplicationException {
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isNameExpr.isMethod(isIntegerConstant)));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isNameExpr.isMethod();
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isNameExpr.isMethod().isMethod());
    }
}
