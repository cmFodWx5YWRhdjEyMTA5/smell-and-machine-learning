// isComment
package org.totschnig.myexpenses.test.provider;

import org.totschnig.myexpenses.model.AccountType;
import org.totschnig.myexpenses.provider.DatabaseConstants;
import org.totschnig.myexpenses.provider.TransactionProvider;
import org.totschnig.myexpenses.testutils.BaseDbTest;

public class isClassOrIsInterface extends BaseDbTest {

    private final CurrencyInfo isVariable = new CurrencyInfo("isStringConstant", "isStringConstant");

    private final AccountInfo isVariable = new AccountInfo("isStringConstant", isNameExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr);

    public void isMethod() {
        try {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod("isStringConstant").isMethod(), null, null);
            isMethod("isStringConstant");
        } catch (IllegalArgumentException isParameter) {
            isNameExpr.isMethod();
        }
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, null, isNameExpr.isMethod());
        int isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr).isMethod(), null, null);
        isMethod(isIntegerConstant, isNameExpr);
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, null, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, null, isNameExpr.isMethod());
        int isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr).isMethod(), null, null);
        isMethod(isIntegerConstant, isNameExpr);
    }
}
