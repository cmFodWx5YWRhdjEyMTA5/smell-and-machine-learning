// isComment
package menion.android.whereyougo.gui;

import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;
import cz.matejcik.openwig.Engine;
import menion.android.whereyougo.R;
import menion.android.whereyougo.openwig.WUI;
import menion.android.whereyougo.utils.Logger;

public class isClassOrIsInterface extends AsyncTask<Void, Void, Void> {

    protected static final String isVariable = "isStringConstant";

    protected ProgressDialog isVariable;

    protected Context isVariable;

    public isConstructor(Context isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected void isMethod() {
        isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod(isNameExpr, null, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
    }

    @Override
    protected Void isMethod(Void... isParameter) {
        // isComment
        try {
            while (isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod(isIntegerConstant);
            }
        } catch (InterruptedException isParameter) {
        }
        return null;
    }

    @Override
    protected void isMethod(Void isParameter) {
        try {
            if (isNameExpr != null) {
                isNameExpr.isMethod();
                isNameExpr = null;
            }
        } catch (Exception isParameter) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod());
        }
    }
}
