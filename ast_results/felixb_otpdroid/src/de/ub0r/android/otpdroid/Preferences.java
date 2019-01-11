// isComment
package de.ub0r.android.otpdroid;

import android.os.Bundle;
import android.os.Build.VERSION_CODES;
import android.preference.PreferenceActivity;
import android.view.MenuItem;
import de.ub0r.android.lib.Utils;

/**
 * isComment
 */
public class isClassOrIsInterface extends PreferenceActivity {

    /**
     * isComment
     */
    @Override
    public final void isMethod(final Bundle isParameter) {
        if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            this.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        super.isMethod(isNameExpr);
        this.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    @Override
    public final boolean isMethod(final MenuItem isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr:
                this.isMethod();
                return true;
            default:
                return true;
        }
    }
}
