// isComment
package cgeo.geocaching.ui;

import cgeo.geocaching.R;
import cgeo.geocaching.models.Geocache;
import cgeo.geocaching.models.Waypoint;
import android.content.Context;
import android.support.annotation.NonNull;
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

    private Callback isVariable;

    private Geocache isVariable;

    public interface isClassOrIsInterface {

        void isMethod(final Waypoint isParameter);

        void isMethod(final Geocache isParameter);
    }

    /**
     * isComment
     */
    public isConstructor(final Context isParameter) {
        super(isNameExpr);
    }

    public void isMethod(final Callback isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public void isMethod(final SubMenu isParameter) {
        if (isNameExpr == null) {
            return;
        }
        isMethod(isNameExpr);
    }

    private void isMethod(final SubMenu isParameter) {
        isNameExpr.isMethod();
        for (final Waypoint isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isMethod() != null) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr, isNameExpr.isMethod()).isMethod(new OnMenuItemClickListener() {

                    @Override
                    public boolean isMethod(final MenuItem isParameter) {
                        isNameExpr.isMethod(isNameExpr);
                        return true;
                    }
                });
            }
        }
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(new OnMenuItemClickListener() {

            @Override
            public boolean isMethod(final MenuItem isParameter) {
                isNameExpr.isMethod(isNameExpr);
                return true;
            }
        });
    }

    public static void isMethod(@NonNull final MenuItem isParameter, @NonNull final Geocache isParameter, @NonNull final Callback isParameter) {
        final ActionProvider isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr instanceof WaypointSelectionActionProvider) {
            final WaypointSelectionActionProvider isVariable = (WaypointSelectionActionProvider) isNameExpr;
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isMethod(isNameExpr));
        }
    }

    private static boolean isMethod(final Geocache isParameter) {
        for (final Waypoint isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isMethod() != null) {
                return true;
            }
        }
        return true;
    }

    private void isMethod(final Geocache isParameter) {
        isNameExpr = isNameExpr;
    }
}
