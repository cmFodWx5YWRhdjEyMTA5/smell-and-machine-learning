// isComment
package cgeo.geocaching.apps.navi;

import cgeo.geocaching.apps.AbstractApp;
import cgeo.geocaching.location.Geopoint;
import cgeo.geocaching.models.Geocache;
import cgeo.geocaching.models.Waypoint;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

/**
 * isComment
 */
abstract class isClassOrIsInterface extends AbstractApp implements CacheNavigationApp, WaypointNavigationApp, GeopointNavigationApp {

    protected isConstructor(@NonNull final String isParameter, @Nullable final String isParameter) {
        super(isNameExpr, isNameExpr);
    }

    protected isConstructor(@NonNull final String isParameter, @Nullable final String isParameter, @Nullable final String isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(@NonNull final Context isParameter, @NonNull final Geocache isParameter) {
        final Geopoint isVariable = isNameExpr.isMethod();
        // isComment
        assert isNameExpr != null;
        isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(@NonNull final Context isParameter, @NonNull final Waypoint isParameter) {
        final Geopoint isVariable = isNameExpr.isMethod();
        // isComment
        assert isNameExpr != null;
        isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(@NonNull final Geocache isParameter) {
        return isNameExpr.isMethod() != null;
    }

    @Override
    public boolean isMethod(@NonNull final Waypoint isParameter) {
        return isNameExpr.isMethod() != null;
    }

    protected static void isMethod(@NonNull final Intent isParameter, @NonNull final Waypoint isParameter) {
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
    }

    protected static void isMethod(@NonNull final Intent isParameter, @NonNull final Geocache isParameter) {
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod());
    }
}
