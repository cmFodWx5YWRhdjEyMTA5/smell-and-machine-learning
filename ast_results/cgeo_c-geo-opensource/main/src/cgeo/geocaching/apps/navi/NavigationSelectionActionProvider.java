// isComment
package cgeo.geocaching.apps.navi;

import cgeo.geocaching.apps.navi.NavigationAppFactory.NavigationAppsEnum;
import cgeo.geocaching.models.Geocache;
import cgeo.geocaching.ui.AbstractMenuActionProvider;
import android.content.Context;
import android.support.v4.view.ActionProvider;
import android.support.v4.view.MenuItemCompat;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractMenuActionProvider {

    private Geocache isVariable;

    private final Context isVariable;

    public isConstructor(final Context isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(final Geocache isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public void isMethod(final SubMenu isParameter) {
        isNameExpr.isMethod();
        if (isNameExpr == null || isNameExpr.isMethod() == null) {
            return;
        }
        for (final NavigationAppsEnum isVariable : isNameExpr.isMethod()) {
            if (!(isNameExpr.isFieldAccessExpr instanceof CacheNavigationApp)) {
                continue;
            }
            final CacheNavigationApp isVariable = (CacheNavigationApp) isNameExpr.isFieldAccessExpr;
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isMethod()).isMethod(new OnMenuItemClickListener() {

                    @Override
                    public boolean isMethod(final MenuItem isParameter) {
                        isNameExpr.isMethod(isNameExpr, isNameExpr);
                        return true;
                    }
                });
            }
        }
    }

    public static void isMethod(final MenuItem isParameter, final Geocache isParameter) {
        final ActionProvider isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr instanceof NavigationSelectionActionProvider) {
            final NavigationSelectionActionProvider isVariable = (NavigationSelectionActionProvider) isNameExpr;
            isNameExpr.isMethod(isNameExpr);
        }
    }
}
