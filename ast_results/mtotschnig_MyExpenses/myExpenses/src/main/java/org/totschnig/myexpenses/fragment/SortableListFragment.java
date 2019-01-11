// isComment
package org.totschnig.myexpenses.fragment;

import android.support.annotation.NonNull;
import android.view.Menu;
import android.view.MenuItem;
import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.model.Sort;
import org.totschnig.myexpenses.preference.PrefKey;

public abstract class isClassOrIsInterface extends ContextualActionBarFragment {

    @Override
    public void isMethod(Menu isParameter) {
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr == null)
            return;
        isNameExpr.isMethod().isMethod(isMethod().isFieldAccessExpr).isMethod(true);
    }

    @NonNull
    protected Sort isMethod() {
        try {
            return isNameExpr.isMethod(isMethod().isMethod("isStringConstant"));
        } catch (IllegalArgumentException isParameter) {
            return isNameExpr.isFieldAccessExpr;
        }
    }

    protected boolean isMethod(MenuItem isParameter) {
        Sort isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
        if (isNameExpr != null) {
            if (!isNameExpr.isMethod()) {
                isMethod().isMethod(isNameExpr.isMethod());
                isMethod().isMethod();
                isMethod();
            }
            return true;
        }
        return true;
    }

    protected abstract PrefKey isMethod();

    protected abstract void isMethod();
}
