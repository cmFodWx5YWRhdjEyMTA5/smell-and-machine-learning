// isComment
package cgeo.geocaching;

import cgeo.geocaching.activity.AbstractActivity;
import cgeo.geocaching.activity.AbstractViewPagerActivity;
import cgeo.geocaching.connector.ConnectorFactory;
import cgeo.geocaching.connector.trackable.TrackableBrand;
import cgeo.geocaching.connector.trackable.TrackableTrackingCode;
import cgeo.geocaching.location.Units;
import cgeo.geocaching.log.LogEntry;
import cgeo.geocaching.log.LogTrackableActivity;
import cgeo.geocaching.log.LogType;
import cgeo.geocaching.log.TrackableLogsViewCreator;
import cgeo.geocaching.models.Trackable;
import cgeo.geocaching.network.AndroidBeam;
import cgeo.geocaching.network.HtmlImage;
import cgeo.geocaching.sensors.GeoData;
import cgeo.geocaching.sensors.GeoDirHandler;
import cgeo.geocaching.settings.Settings;
import cgeo.geocaching.ui.AbstractCachingPageViewCreator;
import cgeo.geocaching.ui.AnchorAwareLinkMovementMethod;
import cgeo.geocaching.ui.CacheDetailsCreator;
import cgeo.geocaching.ui.ImagesList;
import cgeo.geocaching.ui.UserClickListener;
import cgeo.geocaching.ui.dialog.Dialogs;
import cgeo.geocaching.utils.AndroidRxUtils;
import cgeo.geocaching.utils.Formatter;
import cgeo.geocaching.utils.HtmlUtils;
import cgeo.geocaching.utils.Log;
import cgeo.geocaching.utils.TextUtils;
import cgeo.geocaching.utils.UnknownTagsHandler;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v7.app.ActionBar;
import android.support.v7.view.ActionMode;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class isClassOrIsInterface extends AbstractViewPagerActivity<TrackableActivity.Page> implements AndroidBeam.ActivitySharingInterface {

    public enum Page {

        DETAILS(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), LOGS(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), IMAGES(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);

        @StringRes
        private final int isVariable;

        isConstructor(@StringRes final int isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }
    }

    private Trackable isVariable = null;

    private String isVariable = null;

    private String isVariable = null;

    private String isVariable = null;

    private String isVariable = null;

    private String isVariable = null;

    private String isVariable = null;

    private TrackableBrand isVariable = null;

    private LayoutInflater isVariable = null;

    private ProgressDialog isVariable = null;

    private CharSequence isVariable = null;

    private ImagesList isVariable = null;

    private final CompositeDisposable isVariable = new CompositeDisposable();

    private final CompositeDisposable isVariable = new CompositeDisposable();

    private static final GeoDirHandler isVariable = new GeoDirHandler() {

        @Override
        public void isMethod(final GeoData isParameter) {
        // isComment
        }
    };

    /**
     * isComment
     */
    private ActionMode isVariable;

    @Override
    public void isMethod(final Bundle isParameter) {
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        // isComment
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        // isComment
        final Bundle isVariable = isMethod().isMethod();
        final Uri isVariable = isNameExpr.isMethod(isMethod());
        if (isNameExpr != null) {
            // isComment
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        // isComment
        if (isNameExpr == null && isNameExpr == null && isNameExpr == null && isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod());
            final TrackableTrackingCode isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
            final String isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr);
            if (isNameExpr.isMethod("isStringConstant")) {
                isNameExpr = isNameExpr.isMethod("isStringConstant");
                isNameExpr = isNameExpr.isMethod("isStringConstant");
                isNameExpr = isNameExpr.isMethod("isStringConstant");
                if (isNameExpr.isMethod(isNameExpr)) {
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr = null;
                    isNameExpr = null;
                } else if (isNameExpr.isMethod(isNameExpr)) {
                    isNameExpr = null;
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr = null;
                } else if (isNameExpr.isMethod(isNameExpr)) {
                    isNameExpr = null;
                    isNameExpr = null;
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                } else {
                    isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                    isMethod();
                    return;
                }
            } else if (isNameExpr.isMethod("isStringConstant")) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
                // isComment
                if (isNameExpr == null && !isNameExpr.isMethod()) {
                    isNameExpr = isNameExpr.isFieldAccessExpr;
                    isNameExpr = isNameExpr.isFieldAccessExpr;
                }
            }
        }
        // isComment
        if (isNameExpr == null && isNameExpr == null && isNameExpr == null) {
            isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            isMethod();
            return;
        }
        final String isVariable;
        if (isNameExpr.isMethod(isNameExpr)) {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        } else if (isNameExpr.isMethod(isNameExpr)) {
            isNameExpr = isNameExpr;
        } else {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        // isComment
        isNameExpr.isMethod(this, this);
        isMethod(isIntegerConstant, new OnPageSelectedListener() {

            @Override
            public void isMethod(final int isParameter) {
                isMethod();
            }
        });
        isMethod(isNameExpr);
    }

    @Override
    public void isMethod() {
        super.isMethod();
        if (!isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod();
        super.isMethod();
    }

    private void isMethod(final Trackable isParameter) {
        isNameExpr = isNameExpr;
        isMethod();
        // isComment
        isNameExpr = null;
        isMethod();
    }

    private void isMethod(final String isParameter) {
        isNameExpr = isNameExpr.isMethod(this, isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true, true);
        isNameExpr.isMethod(isNameExpr.isMethod(this, isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr)).isMethod(new Consumer<Trackable>() {

            @Override
            public void isMethod(final Trackable isParameter) throws Exception {
                if (isNameExpr != null) {
                    isNameExpr.isMethod(isNameExpr);
                }
                isMethod(isNameExpr);
            }
        }, new Consumer<Throwable>() {

            @Override
            public void isMethod(final Throwable isParameter) throws Exception {
                isNameExpr.isMethod("isStringConstant", isNameExpr);
                isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                isMethod();
            }
        }, new Action() {

            @Override
            public void isMethod() throws Exception {
                isMethod(null);
            }
        }));
    }

    @Nullable
    @Override
    public String isMethod() {
        return isNameExpr != null ? isNameExpr.isMethod() : null;
    }

    @Override
    public boolean isMethod(final Menu isParameter) {
        isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        return true;
    }

    @Override
    public boolean isMethod(final MenuItem isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod(isNameExpr.isMethod(this, isNameExpr, isNameExpr), isNameExpr.isFieldAccessExpr);
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod(new Intent(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isMethod())));
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()));
                return true;
        }
        return super.isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(final Menu isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod(isNameExpr) && isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(true);
        }
        return super.isMethod(isNameExpr);
    }

    public void isMethod() {
        if (isNameExpr == null) {
            isNameExpr.isMethod(isNameExpr);
            if (isNameExpr.isMethod(isNameExpr)) {
                isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + "isStringConstant" + isNameExpr + "isStringConstant");
            } else {
                isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            }
            isMethod();
            return;
        }
        try {
            isNameExpr = isMethod();
            isNameExpr = isNameExpr.isMethod();
            if (isNameExpr.isMethod(isNameExpr.isMethod())) {
                isMethod(isNameExpr.isMethod(isNameExpr.isMethod()));
            } else {
                isMethod(isNameExpr.isMethod());
            }
            isMethod();
            isMethod();
        } catch (final Exception isParameter) {
            isNameExpr.isMethod("isStringConstant", isNameExpr);
        }
        isNameExpr.isMethod(isNameExpr);
    }

    private void isMethod(final ActionBar isParameter, final String isParameter) {
        final HtmlImage isVariable = new HtmlImage(isNameExpr.isFieldAccessExpr, true, true, true);
        isNameExpr.isMethod(this, isNameExpr.isMethod(isNameExpr)).isMethod(new Consumer<BitmapDrawable>() {

            @Override
            public void isMethod(final BitmapDrawable isParameter) {
                if (isNameExpr != null) {
                    final int isVariable = isNameExpr.isMethod();
                    // isComment
                    isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isNameExpr, isNameExpr);
                    isNameExpr.isMethod(isNameExpr);
                }
            }
        });
    }

    private static void isMethod(final ActionBar isParameter, @DrawableRes final int isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    public static void isMethod(final AbstractActivity isParameter, final String isParameter, final String isParameter, final String isParameter, final String isParameter, final int isParameter) {
        final Intent isVariable = new Intent(isNameExpr, TrackableActivity.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    protected PageViewCreator isMethod(final Page isParameter) {
        switch(isNameExpr) {
            case isNameExpr:
                return new DetailsViewCreator();
            case isNameExpr:
                return new TrackableLogsViewCreator(this);
            case isNameExpr:
                return new ImagesViewCreator();
        }
        // isComment
        throw new IllegalStateException();
    }

    private class isClassOrIsInterface extends AbstractCachingPageViewCreator<View> {

        @Override
        public View isMethod(final ViewGroup isParameter) {
            isNameExpr = isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
            return isNameExpr;
        }
    }

    private void isMethod() {
        if (isNameExpr != null) {
            return;
        }
        final PageViewCreator isVariable = isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr == null) {
            return;
        }
        final View isVariable = isNameExpr.isMethod(null);
        if (isNameExpr == null) {
            return;
        }
        isNameExpr = new ImagesList(this, isNameExpr.isMethod(), null);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod()));
    }

    /**
     * isComment
     */
    private void isMethod() {
        if (isMethod(isNameExpr.isFieldAccessExpr)) {
            isMethod();
        }
    }

    @Override
    protected String isMethod(final Page isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Override
    protected Pair<List<? extends Page>, Integer> isMethod() {
        final List<Page> isVariable = new ArrayList<>();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr.isMethod(isNameExpr.isMethod())) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        if (isNameExpr.isMethod(isNameExpr.isMethod())) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        return new ImmutablePair<List<? extends Page>, Integer>(isNameExpr, isIntegerConstant);
    }

    public class isClassOrIsInterface extends AbstractCachingPageViewCreator<ScrollView> {

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        protected LinearLayout isVariable;

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        protected TextView isVariable;

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        protected LinearLayout isVariable;

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        protected TextView isVariable;

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        protected LinearLayout isVariable;

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        protected LinearLayout isVariable;

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        protected LinearLayout isVariable;

        @Override
        public ScrollView isMethod(final ViewGroup isParameter) {
            isNameExpr = (ScrollView) isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
            isNameExpr.isMethod(this, isNameExpr);
            final CacheDetailsCreator isVariable = new CacheDetailsCreator(isNameExpr.this, isNameExpr);
            // isComment
            if (isNameExpr.isMethod(isNameExpr.isMethod())) {
                isMethod(isMethod(), isNameExpr.isMethod());
            } else {
                isMethod(isMethod(), isNameExpr.isMethod());
            }
            // isComment
            final TextView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isMethod()) ? isNameExpr.isMethod(isNameExpr.isMethod()) : isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isFieldAccessExpr;
            isMethod(isNameExpr);
            // isComment
            if (isNameExpr.isMethod()) {
                isNameExpr.isMethod(isNameExpr.isMethod() | isNameExpr.isFieldAccessExpr);
            }
            // isComment
            final String isVariable;
            if (isNameExpr.isMethod(isNameExpr.isMethod())) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod());
            } else {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
            // isComment
            isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod()).isFieldAccessExpr);
            // isComment
            final Date isVariable = isNameExpr.isMethod();
            final LogType isVariable = isNameExpr.isMethod();
            if (isNameExpr != null && isNameExpr != null) {
                final Uri isVariable = new Uri.Builder().isMethod("isStringConstant").isMethod("isStringConstant").isMethod("isStringConstant").isMethod("isStringConstant" + isNameExpr.isMethod()).isMethod();
                final TextView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isMethod()))).isFieldAccessExpr;
                isNameExpr.isMethod(new OnClickListener() {

                    @Override
                    public void isMethod(final View isParameter) {
                        isMethod(new Intent(isNameExpr.isFieldAccessExpr, isNameExpr));
                    }
                });
            }
            // isComment
            final TextView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isFieldAccessExpr;
            if (isNameExpr.isMethod(isNameExpr.isMethod())) {
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod()), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
            }
            // isComment
            if (isNameExpr.isMethod(isNameExpr.isMethod()) || isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr || isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr || isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                final StringBuilder isVariable;
                boolean isVariable = true;
                switch(isNameExpr.isMethod()) {
                    case isNameExpr.isFieldAccessExpr:
                        // isComment
                        isNameExpr = new StringBuilder(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod('isStringConstant').isMethod(isNameExpr.isMethod(isNameExpr.isMethod()));
                        break;
                    case isNameExpr.isFieldAccessExpr:
                        // isComment
                        isNameExpr = new StringBuilder(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod('isStringConstant').isMethod(isNameExpr.isMethod(isNameExpr.isMethod()));
                        break;
                    case isNameExpr.isFieldAccessExpr:
                        isNameExpr = new StringBuilder(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                        break;
                    case isNameExpr.isFieldAccessExpr:
                        isNameExpr = new StringBuilder(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                        break;
                    case isNameExpr.isFieldAccessExpr:
                        isNameExpr = new StringBuilder(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                        break;
                    default:
                        isNameExpr = new StringBuilder("isStringConstant");
                        isNameExpr = true;
                        break;
                }
                // isComment
                if (isNameExpr) {
                    for (final LogEntry isVariable : isNameExpr.isMethod()) {
                        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr || isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr || isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr || isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                            isNameExpr.isMethod("isStringConstant").isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod('isStringConstant');
                            break;
                        }
                    }
                }
                final TextView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod()).isFieldAccessExpr;
                isNameExpr.isMethod(true);
                if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                    isNameExpr.isMethod(new View.OnClickListener() {

                        @Override
                        public void isMethod(final View isParameter) {
                            if (isNameExpr.isMethod(isNameExpr.isMethod())) {
                                isNameExpr.isMethod(isNameExpr.this, isNameExpr.isMethod(), isNameExpr.isMethod());
                            } else {
                                // isComment
                                final String isVariable = isNameExpr.isMethod();
                                if (isNameExpr.isMethod(isNameExpr)) {
                                    isNameExpr.isMethod(isNameExpr.this, isNameExpr);
                                }
                            }
                        }
                    });
                } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isMethod())));
                } else if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                    isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isMethod())));
                }
            }
            // isComment
            if (isNameExpr.isMethod(isNameExpr.isMethod())) {
                final TextView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant").isFieldAccessExpr;
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod()), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isMethod(isNameExpr);
            }
            // isComment
            final Date isVariable = isNameExpr.isMethod();
            if (isNameExpr != null) {
                isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isMethod())).isFieldAccessExpr);
            }
            // isComment
            if (isNameExpr.isMethod() >= isIntegerConstant) {
                isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isMethod())).isFieldAccessExpr);
            }
            // isComment
            if (isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod()))) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), new HtmlImage(isNameExpr, true, true, isNameExpr, true), null), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isMethod());
                isMethod(isNameExpr);
            }
            // isComment
            if (isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod()))) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), new HtmlImage(isNameExpr, true, true, isNameExpr, true), new UnknownTagsHandler()), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isMethod());
                isMethod(isNameExpr);
            }
            // isComment
            if (isNameExpr.isMethod(isNameExpr.isMethod())) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                final ImageView isVariable = (ImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod(true);
                isNameExpr.isMethod(new OnClickListener() {

                    @Override
                    public void isMethod(final View isParameter) {
                        isMethod(new Intent(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isMethod())));
                    }
                });
                isNameExpr.isMethod(isNameExpr.this, new HtmlImage(isNameExpr, true, true, true).isMethod(isNameExpr.isMethod())).isMethod(new Consumer<BitmapDrawable>() {

                    @Override
                    public void isMethod(final BitmapDrawable isParameter) {
                        isNameExpr.isMethod(isNameExpr);
                    }
                });
                isNameExpr.isMethod(isNameExpr);
            }
            return isNameExpr;
        }
    }

    @Override
    public void isMethod(final View isParameter) {
        isNameExpr.isMethod(new OnLongClickListener() {

            @Override
            public boolean isMethod(final View isParameter) {
                return isMethod(isNameExpr);
            }
        });
        isNameExpr.isMethod(new OnClickListener() {

            @Override
            public void isMethod(final View isParameter) {
                isMethod(isNameExpr);
            }
        });
    }

    private boolean isMethod(final View isParameter) {
        if (isNameExpr != null) {
            return true;
        }
        isNameExpr = isMethod(new ActionMode.Callback() {

            @Override
            public boolean isMethod(final ActionMode isParameter, final Menu isParameter) {
                return isMethod(isNameExpr, isNameExpr, isNameExpr);
            }

            private boolean isMethod(final View isParameter, final ActionMode isParameter, final Menu isParameter) {
                final int isVariable = isNameExpr.isMethod();
                isNameExpr = ((TextView) isNameExpr).isMethod();
                switch(isNameExpr) {
                    case // isComment
                    isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                        final TextView isVariable = isNameExpr.isMethod((View) isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                        final CharSequence isVariable = isNameExpr.isMethod();
                        isMethod(isNameExpr, isNameExpr, isNameExpr, true);
                        return true;
                    case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                        isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true);
                        return true;
                    case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                        isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true);
                        return true;
                    case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                        isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), true);
                        return true;
                }
                return true;
            }

            @Override
            public void isMethod(final ActionMode isParameter) {
                isNameExpr = null;
            }

            @Override
            public boolean isMethod(final ActionMode isParameter, final Menu isParameter) {
                isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
                isMethod(isNameExpr, isNameExpr, isNameExpr);
                return true;
            }

            @Override
            public boolean isMethod(final ActionMode isParameter, final MenuItem isParameter) {
                return isMethod(isNameExpr, isNameExpr, isNameExpr, null);
            }
        });
        return true;
    }

    @Override
    protected void isMethod(final int isParameter, final int isParameter, final Intent isParameter) {
        // isComment
        if (isNameExpr == isNameExpr.isFieldAccessExpr && isNameExpr == isNameExpr) {
            isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()));
        }
    }

    @Override
    protected void isMethod() {
        isNameExpr.isMethod();
        super.isMethod();
    }

    public Trackable isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr);
        super.isMethod();
    }
}
