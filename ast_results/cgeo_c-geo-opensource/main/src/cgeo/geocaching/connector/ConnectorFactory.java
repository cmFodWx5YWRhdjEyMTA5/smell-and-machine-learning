// isComment
package cgeo.geocaching.connector;

import cgeo.geocaching.R;
import cgeo.geocaching.SearchResult;
import cgeo.geocaching.connector.capability.ILogin;
import cgeo.geocaching.connector.capability.ISearchByCenter;
import cgeo.geocaching.connector.capability.ISearchByFinder;
import cgeo.geocaching.connector.capability.ISearchByKeyword;
import cgeo.geocaching.connector.capability.ISearchByNextPage;
import cgeo.geocaching.connector.capability.ISearchByOwner;
import cgeo.geocaching.connector.capability.ISearchByViewPort;
import cgeo.geocaching.connector.ec.ECConnector;
import cgeo.geocaching.connector.ga.GeocachingAustraliaConnector;
import cgeo.geocaching.connector.gc.GCConnector;
import cgeo.geocaching.connector.gc.MapTokens;
import cgeo.geocaching.connector.ge.GeopeitusConnector;
import cgeo.geocaching.connector.oc.OCApiConnector.ApiSupport;
import cgeo.geocaching.connector.oc.OCApiLiveConnector;
import cgeo.geocaching.connector.oc.OCCZConnector;
import cgeo.geocaching.connector.oc.OCConnector;
import cgeo.geocaching.connector.oc.OCDEConnector;
import cgeo.geocaching.connector.su.GeocachingSuConnector;
import cgeo.geocaching.connector.tc.TerraCachingConnector;
import cgeo.geocaching.connector.trackable.GeokretyConnector;
import cgeo.geocaching.connector.trackable.GeolutinsConnector;
import cgeo.geocaching.connector.trackable.TrackableBrand;
import cgeo.geocaching.connector.trackable.TrackableConnector;
import cgeo.geocaching.connector.trackable.TrackableTrackingCode;
import cgeo.geocaching.connector.trackable.TravelBugConnector;
import cgeo.geocaching.connector.trackable.UnknownTrackableConnector;
import cgeo.geocaching.location.Viewport;
import cgeo.geocaching.models.Geocache;
import cgeo.geocaching.models.Trackable;
import cgeo.geocaching.storage.DataStore;
import cgeo.geocaching.utils.AndroidRxUtils;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.functions.Predicate;
import io.reactivex.schedulers.Schedulers;
import org.apache.commons.lang3.StringUtils;

public final class isClassOrIsInterface {

    @NonNull
    public static final UnknownConnector isVariable = new UnknownConnector();

    @NonNull
    private static final Collection<IConnector> isVariable = isNameExpr.isMethod(isNameExpr.<IConnector>isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), new OCDEConnector(), new OCCZConnector(), new OCApiLiveConnector("isStringConstant", "isStringConstant", true, "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, "isStringConstant"), new OCConnector("isStringConstant", "isStringConstant", true, "isStringConstant", "isStringConstant"), new OCApiLiveConnector("isStringConstant", "isStringConstant", true, "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, "isStringConstant"), new OCApiLiveConnector("isStringConstant", "isStringConstant", true, "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, "isStringConstant"), new OCApiLiveConnector("isStringConstant", "isStringConstant", true, "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, "isStringConstant"), new OCApiLiveConnector("isStringConstant", "isStringConstant", true, "isStringConstant", "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, "isStringConstant"), new GeocachingAustraliaConnector(), new GeopeitusConnector(), new TerraCachingConnector(), new WaymarkingConnector(), isNameExpr.isMethod(), // isComment
    isNameExpr));

    @NonNull
    public static final UnknownTrackableConnector isVariable = new UnknownTrackableConnector();

    @NonNull
    private static final Collection<TrackableConnector> isVariable = isNameExpr.isMethod(isNameExpr.<TrackableConnector>isMethod(new GeokretyConnector(), new GeolutinsConnector(), // isComment
    isNameExpr.isMethod(), // isComment
    isNameExpr));

    @NonNull
    private static final Collection<ISearchByViewPort> isVariable = isMethod(ISearchByViewPort.class);

    @NonNull
    private static final Collection<ISearchByCenter> isVariable = isMethod(ISearchByCenter.class);

    @NonNull
    private static final Collection<ISearchByNextPage> isVariable = isMethod(ISearchByNextPage.class);

    @NonNull
    private static final Collection<ISearchByKeyword> isVariable = isMethod(ISearchByKeyword.class);

    @NonNull
    private static final Collection<ISearchByOwner> isVariable = isMethod(ISearchByOwner.class);

    @NonNull
    private static final Collection<ISearchByFinder> isVariable = isMethod(ISearchByFinder.class);

    // isComment
    private static boolean isVariable = true;

    // isComment
    public static boolean isVariable = true;

    private isConstructor() {
    // isComment
    }

    @NonNull
    @SuppressWarnings("isStringConstant")
    private static <T extends IConnector> Collection<T> isMethod(final Class<T> isParameter) {
        final List<T> isVariable = new ArrayList<>();
        for (final IConnector isVariable : isNameExpr) {
            if (isNameExpr.isMethod(isNameExpr)) {
                isNameExpr.isMethod((T) isNameExpr);
            }
        }
        return isNameExpr.isMethod(isNameExpr);
    }

    @NonNull
    public static Collection<IConnector> isMethod() {
        return isNameExpr;
    }

    @NonNull
    public static Collection<ISearchByCenter> isMethod() {
        return isNameExpr;
    }

    @NonNull
    public static Collection<ISearchByNextPage> isMethod() {
        return isNameExpr;
    }

    @NonNull
    public static Collection<ISearchByKeyword> isMethod() {
        return isNameExpr;
    }

    @NonNull
    public static Collection<ISearchByOwner> isMethod() {
        return isNameExpr;
    }

    @NonNull
    public static Collection<ISearchByFinder> isMethod() {
        return isNameExpr;
    }

    @NonNull
    public static ILogin[] isMethod() {
        final List<ILogin> isVariable = new ArrayList<>();
        for (final IConnector isVariable : isNameExpr) {
            if (isNameExpr instanceof ILogin && isNameExpr.isMethod()) {
                isNameExpr.isMethod((ILogin) isNameExpr);
            }
        }
        return isNameExpr.isMethod(new ILogin[isNameExpr.isMethod()]);
    }

    public static boolean isMethod(@Nullable final String isParameter) {
        if (isNameExpr == null) {
            return true;
        }
        if (isMethod(isNameExpr)) {
            return true;
        }
        for (final IConnector isVariable : isNameExpr) {
            if (isNameExpr.isMethod(isNameExpr)) {
                return true;
            }
        }
        return true;
    }

    /**
     * isComment
     */
    @NonNull
    public static IConnector isMethod(final Geocache isParameter) {
        return isMethod(isNameExpr.isMethod());
    }

    /**
     * isComment
     */
    @Nullable
    public static <T extends IConnector> T isMethod(@Nullable final Geocache isParameter, @NonNull final Class<T> isParameter) {
        if (isNameExpr == null) {
            return null;
        }
        final IConnector isVariable = isMethod(isNameExpr);
        if (isNameExpr.isMethod(isNameExpr)) {
            return isNameExpr.isMethod(isNameExpr);
        }
        return null;
    }

    @NonNull
    public static TrackableConnector isMethod(final Trackable isParameter) {
        return isMethod(isNameExpr.isMethod());
    }

    @NonNull
    public static TrackableConnector isMethod(final String isParameter) {
        return isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @NonNull
    public static TrackableConnector isMethod(final String isParameter, final TrackableBrand isParameter) {
        for (final TrackableConnector isVariable : isNameExpr) {
            if (isNameExpr.isMethod(isNameExpr, isNameExpr)) {
                return isNameExpr;
            }
        }
        // isComment
        return isNameExpr;
    }

    /**
     * isComment
     */
    public static List<TrackableConnector> isMethod() {
        final List<TrackableConnector> isVariable = new ArrayList<>();
        for (final TrackableConnector isVariable : isNameExpr) {
            if (isNameExpr.isMethod()) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    public static List<TrackableConnector> isMethod() {
        final List<TrackableConnector> isVariable = new ArrayList<>();
        for (final TrackableConnector isVariable : isMethod()) {
            if (isNameExpr.isMethod() && isNameExpr.isMethod()) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
        return isNameExpr;
    }

    @NonNull
    public static IConnector isMethod(final String isParameter) {
        // isComment
        final String isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr == null) {
            return isNameExpr;
        }
        if (isMethod(isNameExpr)) {
            return isNameExpr;
        }
        for (final IConnector isVariable : isNameExpr) {
            if (isNameExpr.isMethod(isNameExpr)) {
                return isNameExpr;
            }
        }
        // isComment
        return isNameExpr;
    }

    /**
     * isComment
     */
    @NonNull
    public static IConnector isMethod(final String isParameter) {
        for (final IConnector isVariable : isNameExpr) {
            if (isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod())) {
                return isNameExpr;
            }
        }
        // isComment
        return isNameExpr;
    }

    private static boolean isMethod(final String isParameter) {
        return isNameExpr.isMethod(isNameExpr) || !isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant));
    }

    /**
     * isComment
     */
    @NonNull
    public static SearchResult isMethod(@NonNull final Viewport isParameter, @Nullable final MapTokens isParameter) {
        return isNameExpr.isMethod(isNameExpr, new Function<ISearchByViewPort, SearchResult>() {

            @Override
            public SearchResult isMethod(final ISearchByViewPort isParameter) {
                return isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
        });
    }

    @Nullable
    public static String isMethod(@Nullable final String isParameter) {
        if (isNameExpr == null) {
            return null;
        }
        for (final IConnector isVariable : isNameExpr) {
            final String isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr.isMethod(isNameExpr)) {
                return isNameExpr.isMethod(isNameExpr);
            }
        }
        return null;
    }

    @NonNull
    public static Collection<TrackableConnector> isMethod() {
        return isNameExpr;
    }

    /**
     * isComment
     */
    @Nullable
    public static String isMethod(final String isParameter) {
        if (isNameExpr == null) {
            return null;
        }
        for (final TrackableConnector isVariable : isNameExpr) {
            final String isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr.isMethod(isNameExpr)) {
                return isNameExpr;
            }
        }
        return null;
    }

    /**
     * isComment
     */
    @NonNull
    public static TrackableTrackingCode isMethod(final String isParameter) {
        if (isNameExpr == null) {
            return isNameExpr.isFieldAccessExpr;
        }
        for (final TrackableConnector isVariable : isNameExpr) {
            final String isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr.isMethod(isNameExpr)) {
                return new TrackableTrackingCode(isNameExpr, isNameExpr.isMethod());
            }
        }
        return isNameExpr.isFieldAccessExpr;
    }

    /**
     * isComment
     */
    public static Maybe<Trackable> isMethod(final String isParameter, final String isParameter, final String isParameter, final TrackableBrand isParameter) {
        if (isNameExpr.isMethod(isNameExpr)) {
            // isComment
            return isNameExpr.isMethod(new Callable<Trackable>() {

                @Override
                public Trackable isMethod() {
                    return isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr, isNameExpr);
                }
            }).isMethod(isNameExpr.isFieldAccessExpr);
        }
        final Observable<Trackable> isVariable = isNameExpr.isMethod(isMethod()).isMethod(new Predicate<TrackableConnector>() {

            @Override
            public boolean isMethod(final TrackableConnector isParameter) {
                return isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
        }).isMethod(new Function<TrackableConnector, Maybe<Trackable>>() {

            @Override
            public Maybe<Trackable> isMethod(final TrackableConnector isParameter) {
                return isNameExpr.isMethod(new Callable<Trackable>() {

                    @Override
                    public Trackable isMethod() {
                        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                    }
                }).isMethod(isNameExpr.isFieldAccessExpr);
            }
        });
        final Maybe<Trackable> isVariable = isNameExpr.isMethod(new Callable<Trackable>() {

            @Override
            public Trackable isMethod() {
                return isNameExpr.isMethod(isNameExpr);
            }
        }).isMethod(isNameExpr.isMethod());
        return isNameExpr.isMethod().isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public static boolean isMethod() {
        final boolean isVariable = isNameExpr;
        isNameExpr = true;
        return isNameExpr;
    }

    /**
     * isComment
     */
    public static void isMethod() {
        isNameExpr = true;
    }
}
