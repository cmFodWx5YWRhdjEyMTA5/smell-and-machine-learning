// isComment
package de.ub0r.android.callmeter.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import de.ub0r.android.callmeter.BuildConfig;
import de.ub0r.android.callmeter.R;
import de.ub0r.android.lib.Utils;

/**
 * isComment
 */
public final class isClassOrIsInterface extends AppCompatActivity {

    @Override
    public void isMethod(final Bundle isParameter) {
        isNameExpr.isMethod(this);
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + "isStringConstant" + isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod().isMethod("isStringConstant" + isNameExpr.isFieldAccessExpr);
        isMethod().isMethod(true);
    }

    @Override
    public boolean isMethod(final MenuItem isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod();
                return true;
            default:
                return super.isMethod(isNameExpr);
        }
    }
}
