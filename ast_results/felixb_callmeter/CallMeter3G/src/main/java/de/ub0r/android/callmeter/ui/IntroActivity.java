// isComment
package de.ub0r.android.callmeter.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import de.ub0r.android.callmeter.R;
import de.ub0r.android.callmeter.ui.prefs.Preferences;
import de.ub0r.android.lib.Utils;

/**
 * isComment
 */
public final class isClassOrIsInterface extends AppCompatActivity implements OnClickListener {

    /**
     * isComment
     */
    @Override
    public void isMethod(final Bundle isParameter) {
        isMethod(isNameExpr.isMethod(this));
        isNameExpr.isMethod(this);
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod().isMethod(true);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(this);
    }

    /**
     * isComment
     */
    @Override
    public void isMethod(final View isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod();
                break;
            default:
                break;
        }
    }

    /**
     * isComment
     */
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
