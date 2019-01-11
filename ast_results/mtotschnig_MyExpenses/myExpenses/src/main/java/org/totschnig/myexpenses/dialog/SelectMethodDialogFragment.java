// isComment
package org.totschnig.myexpenses.dialog;

import android.net.Uri;
import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.provider.TransactionProvider;
import org.totschnig.myexpenses.provider.filter.Criteria;
import org.totschnig.myexpenses.provider.filter.MethodCriteria;
import org.totschnig.myexpenses.provider.filter.NullCriteria;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_METHODID;

public class isClassOrIsInterface extends SelectFromMappedTableDialogFragment {

    public isConstructor() {
        super(true);
    }

    @Override
    int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    Uri isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    public static SelectMethodDialogFragment isMethod(long isParameter) {
        SelectMethodDialogFragment isVariable = new SelectMethodDialogFragment();
        isMethod(isNameExpr, isNameExpr);
        return isNameExpr;
    }

    @Override
    Criteria isMethod(String isParameter, long... isParameter) {
        return isNameExpr.isFieldAccessExpr == isIntegerConstant && isNameExpr[isIntegerConstant] == -isIntegerConstant ? new NullCriteria(isNameExpr) : new MethodCriteria(isNameExpr, isNameExpr);
    }
}
