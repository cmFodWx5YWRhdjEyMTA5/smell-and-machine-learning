// isComment
package cgeo.geocaching.apps.navi;

import cgeo.geocaching.CgeoApplication;
import cgeo.geocaching.R;
import cgeo.geocaching.activity.ActivityMixin;
import cgeo.geocaching.apps.App;
import cgeo.geocaching.apps.cache.WhereYouGoApp;
import cgeo.geocaching.apps.navi.GoogleNavigationApp.GoogleNavigationBikeApp;
import cgeo.geocaching.apps.navi.GoogleNavigationApp.GoogleNavigationDrivingApp;
import cgeo.geocaching.apps.navi.GoogleNavigationApp.GoogleNavigationTransitApp;
import cgeo.geocaching.apps.navi.GoogleNavigationApp.GoogleNavigationWalkingApp;
import cgeo.geocaching.apps.navi.OruxMapsApp.OruxOfflineMapApp;
import cgeo.geocaching.apps.navi.OruxMapsApp.OruxOnlineMapApp;
import cgeo.geocaching.apps.navi.SygicNavigationApp.SygicNavigationDrivingApp;
import cgeo.geocaching.apps.navi.SygicNavigationApp.SygicNavigationWalkingApp;
import cgeo.geocaching.location.Geopoint;
import cgeo.geocaching.models.Geocache;
import cgeo.geocaching.models.Waypoint;
import cgeo.geocaching.settings.Settings;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import java.util.ArrayList;
import java.util.List;

public final class isClassOrIsInterface {

    private isConstructor() {
    // isComment
    }

    public enum NavigationAppsEnum {

        /**
         * isComment
         */
        COMPASS(new CompassApp(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        /**
         * isComment
         */
        RADAR(new RadarApp(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        /**
         * isComment
         */
        INTERNAL_MAP(new InternalMap(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        /**
         * isComment
         */
        STATIC_MAP(new StaticMapApp(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        /**
         * isComment
         */
        DOWNLOAD_STATIC_MAPS(new DownloadStaticMapsApp(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        /**
         * isComment
         */
        LOCUS(new LocusApp(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        /**
         * isComment
         */
        RMAPS(new RMapsApp(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        /**
         * isComment
         */
        GOOGLE_MAPS(new GoogleMapsApp(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        /**
         * isComment
         */
        GOOGLE_NAVIGATION(new GoogleNavigationDrivingApp(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        /**
         * isComment
         */
        GOOGLE_STREETVIEW(new StreetviewApp(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        /**
         * isComment
         */
        ORUX_MAPS(new OruxOnlineMapApp(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        /**
         * isComment
         */
        ORUX_MAPS_OFFLINE(new OruxOfflineMapApp(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        /**
         * isComment
         */
        SYGIC_WALKING(new SygicNavigationWalkingApp(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        /**
         * isComment
         */
        SYGIC_DRIVING(new SygicNavigationDrivingApp(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        /**
         * isComment
         */
        OSM_AND(new OsmAndApp(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        /**
         * isComment
         */
        GOOGLE_NAVIGATION_WALK(new GoogleNavigationWalkingApp(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        /**
         * isComment
         */
        GOOGLE_NAVIGATION_BIKE(new GoogleNavigationBikeApp(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        /**
         * isComment
         */
        GOOGLE_NAVIGATION_TRANSIT(new GoogleNavigationTransitApp(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        /**
         * isComment
         */
        GOOGLE_MAPS_DIRECTIONS(new GoogleMapsDirectionApp(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        WHERE_YOU_GO(new WhereYouGoApp(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        PEBBLE(new PebbleApp(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr),
        MAPSWITHME(new MapsMeApp(), isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

        isConstructor(final App isParameter, final int isParameter, final int isParameter) {
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
            this.isFieldAccessExpr = isNameExpr;
            if (isNameExpr == isIntegerConstant || isNameExpr == -isIntegerConstant) {
                throw new IllegalStateException("isStringConstant");
            }
        }

        /**
         * isComment
         */
        public final App isVariable;

        /**
         * isComment
         */
        public final int isVariable;

        /**
         * isComment
         */
        public final int isVariable;

        /*isComment*/
        @Override
        public String isMethod() {
            return isNameExpr.isMethod();
        }
    }

    /**
     * isComment
     */
    public static void isMethod(final Activity isParameter, final Geocache isParameter, final Waypoint isParameter, final Geopoint isParameter) {
        isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, true, true);
    }

    /**
     * isComment
     */
    public static void isMethod(final Activity isParameter, final Geocache isParameter, final Waypoint isParameter, final Geopoint isParameter, final boolean isParameter, final boolean isParameter) {
        final List<NavigationAppsEnum> isVariable = new ArrayList<>();
        final int isVariable = isNameExpr.isMethod();
        for (final NavigationAppsEnum isVariable : isMethod()) {
            if ((isNameExpr || !(isNameExpr.isFieldAccessExpr instanceof InternalMap)) && (isNameExpr || isNameExpr != isNameExpr.isFieldAccessExpr)) {
                boolean isVariable = true;
                if (isNameExpr != null && isNameExpr.isFieldAccessExpr instanceof CacheNavigationApp && isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                    isNameExpr = true;
                }
                if (isNameExpr != null && isNameExpr.isFieldAccessExpr instanceof WaypointNavigationApp && ((WaypointNavigationApp) isNameExpr.isFieldAccessExpr).isMethod(isNameExpr)) {
                    isNameExpr = true;
                }
                if (isNameExpr != null && isNameExpr.isFieldAccessExpr instanceof GeopointNavigationApp) {
                    isNameExpr = true;
                }
                if (isNameExpr) {
                    isNameExpr.isMethod(isNameExpr);
                }
            }
        }
        if (isNameExpr.isMethod() == isIntegerConstant) {
            isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr);
            return;
        }
        /*isComment*/
        final ArrayAdapter<NavigationAppsEnum> isVariable = new ArrayAdapter<>(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        final AlertDialog.Builder isVariable = new AlertDialog.Builder(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, new DialogInterface.OnClickListener() {

            @Override
            public void isMethod(final DialogInterface isParameter, final int isParameter) {
                final NavigationAppsEnum isVariable = isNameExpr.isMethod(isNameExpr);
                isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
            }
        });
        final AlertDialog isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    @NonNull
    static List<NavigationAppsEnum> isMethod() {
        final List<NavigationAppsEnum> isVariable = new ArrayList<>();
        for (final NavigationAppsEnum isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isFieldAccessExpr.isMethod()) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    @NonNull
    static List<NavigationAppsEnum> isMethod() {
        final List<NavigationAppsEnum> isVariable = new ArrayList<>();
        for (final NavigationAppsEnum isVariable : isMethod()) {
            if (isNameExpr.isMethod(isNameExpr)) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    @NonNull
    public static List<NavigationAppsEnum> isMethod() {
        final List<NavigationAppsEnum> isVariable = new ArrayList<>();
        for (final NavigationAppsEnum isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isFieldAccessExpr.isMethod() && isNameExpr.isFieldAccessExpr.isMethod()) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    public static boolean isMethod(final MenuItem isParameter, final Activity isParameter, final Geocache isParameter) {
        final App isVariable = isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr, isNameExpr);
        return isNameExpr != null;
    }

    private static void isMethod(final Activity isParameter, final Geocache isParameter, @Nullable final App isParameter) {
        if (isNameExpr instanceof CacheNavigationApp) {
            final CacheNavigationApp isVariable = (CacheNavigationApp) isNameExpr;
            if (isNameExpr.isMethod() != null) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
        }
    }

    private static void isMethod(final Activity isParameter, final Waypoint isParameter, @Nullable final App isParameter) {
        if (isNameExpr instanceof WaypointNavigationApp) {
            final WaypointNavigationApp isVariable = (WaypointNavigationApp) isNameExpr;
            if (isNameExpr.isMethod() != null) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
        }
    }

    private static void isMethod(final Activity isParameter, final Geopoint isParameter, final App isParameter) {
        if (isNameExpr instanceof GeopointNavigationApp) {
            final GeopointNavigationApp isVariable = (GeopointNavigationApp) isNameExpr;
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
        }
    }

    @Nullable
    private static App isMethod(final MenuItem isParameter) {
        final int isVariable = isNameExpr.isMethod();
        for (final NavigationAppsEnum isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isFieldAccessExpr == isNameExpr) {
                return isNameExpr.isFieldAccessExpr;
            }
        }
        return null;
    }

    /**
     * isComment
     */
    public static void isMethod(final int isParameter, final Activity isParameter, final Geocache isParameter) {
        if (isNameExpr == null || isNameExpr.isMethod() == null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            return;
        }
        isMethod(isNameExpr, isNameExpr, isMethod(isNameExpr));
    }

    @NonNull
    private static App isMethod(final int isParameter) {
        if (isNameExpr == isIntegerConstant) {
            return isMethod(isNameExpr.isMethod());
        }
        return isMethod(isNameExpr.isMethod());
    }

    /**
     * isComment
     */
    public static void isMethod(final int isParameter, final Activity isParameter, final Waypoint isParameter) {
        if (isNameExpr == null || isNameExpr.isMethod() == null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            return;
        }
        isMethod(isNameExpr, isNameExpr, isMethod(isNameExpr));
    }

    /**
     * isComment
     */
    public static void isMethod(final int isParameter, final Activity isParameter, final Geopoint isParameter) {
        if (isNameExpr == null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            return;
        }
        isMethod(isNameExpr, isNameExpr, isMethod(isNameExpr));
    }

    /**
     * isComment
     */
    @NonNull
    public static App isMethod() {
        return isMethod(isIntegerConstant);
    }

    @NonNull
    private static App isMethod(final int isParameter) {
        final List<NavigationAppsEnum> isVariable = isMethod();
        for (final NavigationAppsEnum isVariable : isNameExpr) {
            if (isNameExpr.isFieldAccessExpr == isNameExpr) {
                return isNameExpr.isFieldAccessExpr;
            }
        }
        // isComment
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    private static void isMethod(final Activity isParameter, final Geocache isParameter, final Waypoint isParameter, final Geopoint isParameter, final App isParameter) {
        if (isNameExpr != null) {
            isMethod(isNameExpr, isNameExpr, isNameExpr);
        } else if (isNameExpr != null) {
            isMethod(isNameExpr, isNameExpr, isNameExpr);
        } else {
            isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
    }
}
