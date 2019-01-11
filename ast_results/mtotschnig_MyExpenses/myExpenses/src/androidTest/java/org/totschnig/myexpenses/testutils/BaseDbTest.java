// isComment
package org.totschnig.myexpenses.testutils;

import android.database.sqlite.SQLiteDatabase;
import android.test.ProviderTestCase2;
import android.test.mock.MockContentResolver;
import org.totschnig.myexpenses.provider.TransactionProvider;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_ROWID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.SPLIT_CATID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.TABLE_ACCOUNTS;
import static org.totschnig.myexpenses.provider.DatabaseConstants.TABLE_CATEGORIES;
import static org.totschnig.myexpenses.provider.DatabaseConstants.TABLE_PAYEES;

public class isClassOrIsInterface extends ProviderTestCase2<TransactionProvider> {

    // isComment
    protected SQLiteDatabase isVariable;

    // isComment
    protected MockContentResolver isVariable;

    public isConstructor() {
        super(TransactionProvider.class, isNameExpr.isFieldAccessExpr);
    }

    @Override
    protected void isMethod() throws Exception {
        super.isMethod();
        isNameExpr = isMethod();
        isNameExpr = isMethod().isMethod().isMethod();
    }

    @Override
    protected void isMethod() throws Exception {
        super.isMethod();
        isNameExpr.isMethod(isNameExpr, null, null);
        isNameExpr.isMethod(isNameExpr, null, null);
        isNameExpr.isMethod(isNameExpr, isNameExpr + "isStringConstant", new String[] { isNameExpr.isMethod(isNameExpr) });
    }
}
