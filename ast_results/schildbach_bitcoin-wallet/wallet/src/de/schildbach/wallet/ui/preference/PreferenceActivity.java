// isComment
package de.schildbach.wallet.ui.preference;

import java.util.List;
import de.schildbach.wallet.R;
import android.view.MenuItem;

/**
 * isComment
 */
public final class isClassOrIsInterface extends android.preference.PreferenceActivity {

    @Override
    public void isMethod(final List<Header> isParameter) {
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(final MenuItem isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod();
                return true;
        }
        return super.isMethod(isNameExpr);
    }

    @Override
    protected boolean isMethod(final String isParameter) {
        return SettingsFragment.class.isMethod().isMethod(isNameExpr) || DiagnosticsFragment.class.isMethod().isMethod(isNameExpr) || AboutFragment.class.isMethod().isMethod(isNameExpr);
    }
}
