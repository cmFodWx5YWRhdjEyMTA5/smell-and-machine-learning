// isComment
package com.vlille.checker.ui.async;

import android.os.AsyncTask;
import com.vlille.checker.R;
import com.vlille.checker.db.DBUpdater;
import com.vlille.checker.ui.HomeActivity;

/**
 * isComment
 */
public class isClassOrIsInterface extends AsyncTask<Void, Void, Boolean> {

    private HomeActivity isVariable;

    private AsyncTaskResultListener isVariable;

    public isConstructor(HomeActivity isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
    }

    @Override
    protected Boolean isMethod(Void... isParameter) {
        return new DBUpdater().isMethod();
    }

    @Override
    protected void isMethod(Boolean isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        int isVariable = isNameExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        isNameExpr.isMethod(isNameExpr);
    }

    public void isMethod(AsyncTaskResultListener isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }
}
