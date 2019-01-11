// isComment
package org.totschnig.myexpenses.test.espresso;

import android.content.Intent;
import android.content.OperationApplicationException;
import android.os.RemoteException;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import org.junit.After;
import org.junit.Rule;
import org.junit.Test;
import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.activity.AccountEdit;
import org.totschnig.myexpenses.model.Account;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.Assert.assertTrue;

public class isClassOrIsInterface {

    @Rule
    public ActivityTestRule<AccountEdit> isVariable = new ActivityTestRule<>(AccountEdit.class, true, true);

    private static final String isVariable = "isStringConstant";

    @After
    public void isMethod() throws RemoteException, OperationApplicationException {
        final long isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr > -isIntegerConstant) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    @Test
    public void isMethod() {
        Intent isVariable = new Intent(isNameExpr.isMethod().isMethod(), AccountEdit.class);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isNameExpr));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isNameExpr.isMethod().isMethod());
        isMethod(isNameExpr.isMethod(isNameExpr) > -isIntegerConstant);
    }
}
