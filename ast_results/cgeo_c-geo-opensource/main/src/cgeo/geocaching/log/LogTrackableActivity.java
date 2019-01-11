// isComment
package cgeo.geocaching.log;

import cgeo.geocaching.Intents;
import cgeo.geocaching.R;
import cgeo.geocaching.activity.Keyboard;
import cgeo.geocaching.connector.ConnectorFactory;
import cgeo.geocaching.connector.LogResult;
import cgeo.geocaching.connector.trackable.AbstractTrackableLoggingManager;
import cgeo.geocaching.connector.trackable.TrackableBrand;
import cgeo.geocaching.connector.trackable.TrackableConnector;
import cgeo.geocaching.connector.trackable.TrackableTrackingCode;
import cgeo.geocaching.enumerations.LoadFlags;
import cgeo.geocaching.enumerations.Loaders;
import cgeo.geocaching.enumerations.StatusCode;
import cgeo.geocaching.location.Geopoint;
import cgeo.geocaching.log.LogTemplateProvider.LogContext;
import cgeo.geocaching.log.LogTemplateProvider.LogTemplate;
import cgeo.geocaching.models.Geocache;
import cgeo.geocaching.models.Trackable;
import cgeo.geocaching.network.AndroidBeam;
import cgeo.geocaching.search.AutoCompleteAdapter;
import cgeo.geocaching.settings.Settings;
import cgeo.geocaching.settings.SettingsActivity;
import cgeo.geocaching.storage.DataStore;
import cgeo.geocaching.twitter.Twitter;
import cgeo.geocaching.ui.dialog.CoordinatesInputDialog;
import cgeo.geocaching.ui.dialog.CoordinatesInputDialog.CoordinateUpdate;
import cgeo.geocaching.ui.dialog.DateDialog;
import cgeo.geocaching.ui.dialog.DateDialog.DateDialogParent;
import cgeo.geocaching.ui.dialog.Dialogs;
import cgeo.geocaching.ui.dialog.TimeDialog;
import cgeo.geocaching.ui.dialog.TimeDialog.TimeDialogParent;
import cgeo.geocaching.utils.AndroidRxUtils;
import cgeo.geocaching.utils.AsyncTaskWithProgress;
import cgeo.geocaching.utils.Formatter;
import cgeo.geocaching.utils.Log;
import cgeo.geocaching.utils.functions.Func1;
import android.R.layout;
import android.R.string;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

public class isClassOrIsInterface extends AbstractLoggingActivity implements DateDialogParent, TimeDialogParent, CoordinateUpdate, LoaderManager.LoaderCallbacks<List<LogTypeTrackable>> {

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected Button isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected Button isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected Button isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected AutoCompleteTextView isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected Button isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected EditText isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected EditText isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected CheckBox isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected LinearLayout isVariable;

    private final CompositeDisposable isVariable = new CompositeDisposable();

    private List<LogTypeTrackable> isVariable = new ArrayList<>();

    private String isVariable = null;

    private Geopoint isVariable;

    private Geocache isVariable = new Geocache();

    /**
     * isComment
     */
    private boolean isVariable = true;

    private Calendar isVariable = isNameExpr.isMethod();

    private LogTypeTrackable isVariable = isNameExpr.isMethod(isNameExpr.isMethod());

    private Trackable isVariable;

    private TrackableBrand isVariable;

    String isVariable;

    TrackableConnector isVariable;

    private AbstractTrackableLoggingManager isVariable;

    /**
     * isComment
     */
    public static final int isVariable = isIntegerConstant;

    public static final int isVariable = isIntegerConstant;

    @Override
    public Loader<List<LogTypeTrackable>> isMethod(final int isParameter, final Bundle isParameter) {
        isMethod(true);
        if (isNameExpr == isNameExpr.isFieldAccessExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        return isNameExpr;
    }

    @Override
    public void isMethod(final Loader<List<LogTypeTrackable>> isParameter, final List<LogTypeTrackable> isParameter) {
        if (isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr);
        }
        if (isNameExpr != null && !isNameExpr.isMethod(isNameExpr) && !isNameExpr.isMethod()) {
            isMethod(isNameExpr.isMethod(isIntegerConstant));
            isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        }
        // isComment
        isNameExpr = isNameExpr.isMethod();
        isMethod(true);
    }

    @Override
    public void isMethod(final Loader<List<LogTypeTrackable>> isParameter) {
    // isComment
    }

    @Override
    public void isMethod(final Bundle isParameter) {
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(this);
        // isComment
        final Bundle isVariable = isMethod().isMethod();
        final Uri isVariable = isNameExpr.isMethod(isMethod());
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            // isComment
            if (isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr))) {
                final Geocache isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr);
                if (isNameExpr != null) {
                    isNameExpr = isNameExpr;
                }
            }
            // isComment
            if (isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr))) {
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
        }
        // isComment
        if (isNameExpr == null && isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod());
        }
        // isComment
        if (isNameExpr == null && isNameExpr != null) {
            final TrackableTrackingCode isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
            if (!isNameExpr.isMethod()) {
                isNameExpr = isNameExpr.isFieldAccessExpr;
                isNameExpr = isNameExpr.isFieldAccessExpr;
            }
        }
        // isComment
        if (isNameExpr == null) {
            isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            isMethod();
            return;
        }
        isMethod();
    }

    private void isMethod() {
        isMethod(true);
        // isComment
        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod(this);
        if (isNameExpr == null) {
            isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            isMethod();
        }
        // isComment
        isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(this, isNameExpr.isMethod(isNameExpr, null, null, isNameExpr)).isMethod().isMethod(new Consumer<Trackable>() {

            @Override
            public void isMethod(final Trackable isParameter) {
                if (isNameExpr != null) {
                    isNameExpr.isMethod(isNameExpr);
                }
                isMethod(isNameExpr);
            }
        }, new Consumer<Throwable>() {

            @Override
            public void isMethod(final Throwable isParameter) throws Exception {
                isNameExpr.isMethod("isStringConstant" + isNameExpr, isNameExpr);
                isMethod(true);
                if (isNameExpr.isMethod(isNameExpr)) {
                    isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + 'isStringConstant' + isNameExpr + 'isStringConstant');
                } else {
                    isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                }
                isMethod(isNameExpr);
                isMethod();
            }
        }));
    }

    private void isMethod(@NonNull final Trackable isParameter) {
        isNameExpr = isNameExpr;
        // isComment
        isMethod().isMethod(isNameExpr.isMethod(), null, isNameExpr.this).isMethod();
        isMethod();
    }

    private void isMethod() {
        // isComment
        if (!isNameExpr.isMethod()) {
            isMethod(true);
            isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            isMethod();
            return;
        }
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + "isStringConstant" + isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()));
        // isComment
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        }
        isMethod();
        // isComment
        isMethod();
        isMethod(true);
        isMethod();
    }

    @Override
    protected void isMethod() {
        if (isNameExpr.isMethod(isNameExpr.isMethod())) {
            new Keyboard(this).isMethod(isNameExpr);
        } else {
            super.isMethod();
        }
    }

    @Override
    public void isMethod(final Configuration isParameter) {
        super.isMethod(isNameExpr);
        isMethod();
    }

    @Override
    public void isMethod(final ContextMenu isParameter, final View isParameter, final ContextMenu.ContextMenuInfo isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        final int isVariable = isNameExpr.isMethod();
        if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            for (final LogTypeTrackable isVariable : isNameExpr) {
                isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isMethod());
            }
        }
    }

    @Override
    public boolean isMethod(final MenuItem isParameter) {
        final int isVariable = isNameExpr.isMethod();
        final int isVariable = isNameExpr.isMethod();
        if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
            isMethod(isNameExpr.isMethod(isNameExpr));
            return true;
        }
        return true;
    }

    private void isMethod() {
        isMethod(isNameExpr);
        isNameExpr.isMethod(new View.OnClickListener() {

            @Override
            public void isMethod(final View isParameter) {
                isMethod(isNameExpr);
            }
        });
        isMethod(isNameExpr);
        isNameExpr.isMethod(new DateListener());
        isMethod(isNameExpr);
        // isComment
        if (isNameExpr.isMethod()) {
            isNameExpr.isMethod(new TimeListener());
            isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        } else {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        // isComment
        if (isNameExpr.isMethod()) {
            isNameExpr.isMethod(new LoadGeocacheListener());
            isNameExpr.isMethod(isNameExpr.isMethod());
            isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod(new CoordinatesListener());
        }
        isMethod();
        if (isNameExpr.isMethod(isNameExpr)) {
            isNameExpr = isNameExpr.isMethod();
        }
        isMethod(isNameExpr);
        isMethod();
    }

    /**
     * isComment
     */
    private void isMethod() {
        isNameExpr.isMethod(new AutoCompleteAdapter(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr, new Func1<String, String[]>() {

            @Override
            public String[] isMethod(final String isParameter) {
                return isNameExpr.isMethod(isNameExpr);
            }
        }));
    }

    @Override
    public void isMethod(final Calendar isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod().isMethod()));
    }

    @Override
    public void isMethod(final Calendar isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod().isMethod()));
    }

    public void isMethod(final LogTypeTrackable isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr.isMethod(isNameExpr.isMethod());
        // isComment
        if (isNameExpr != isNameExpr.isFieldAccessExpr || isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            // isComment
            if (isNameExpr.isMethod(isNameExpr.isMethod())) {
                isNameExpr.isMethod();
            }
        } else {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        // isComment
        if (isNameExpr.isMethod(isNameExpr) && isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            // isComment
            if (isNameExpr.isMethod(isNameExpr.isMethod())) {
                isNameExpr.isMethod();
            }
        } else {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
    }

    private void isMethod() {
        isNameExpr.isMethod(true);
        if (isNameExpr.isMethod() && isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        } else {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
    }

    @Override
    public void isMethod(final Geopoint isParameter) {
        if (isNameExpr == null) {
            return;
        }
        isNameExpr = isNameExpr;
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    private class isClassOrIsInterface implements View.OnClickListener {

        @Override
        public void isMethod(final View isParameter) {
            final DateDialog isVariable = isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(true);
            isNameExpr.isMethod(isMethod(), "isStringConstant");
        }
    }

    private class isClassOrIsInterface implements View.OnClickListener {

        @Override
        public void isMethod(final View isParameter) {
            final TimeDialog isVariable = isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(true);
            isNameExpr.isMethod(isMethod(), "isStringConstant");
        }
    }

    private class isClassOrIsInterface implements View.OnClickListener {

        @Override
        public void isMethod(final View isParameter) {
            final CoordinatesInputDialog isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
            isNameExpr.isMethod(true);
            isNameExpr.isMethod(isMethod(), "isStringConstant");
        }
    }

    // isComment
    private class isClassOrIsInterface implements OnFocusChangeListener {

        @Override
        public void isMethod(final View isParameter, final boolean isParameter) {
            if (!isNameExpr && isNameExpr.isMethod(isNameExpr.isMethod())) {
                final Geocache isVariable = isNameExpr.isMethod(isNameExpr.isMethod().isMethod(), isNameExpr.isFieldAccessExpr);
                if (isNameExpr == null) {
                    isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
                } else {
                    isNameExpr = isNameExpr;
                    isMethod(isNameExpr.isMethod());
                }
            }
        }
    }

    private class isClassOrIsInterface extends AsyncTaskWithProgress<String, StatusCode> {

        isConstructor(final Activity isParameter, final String isParameter) {
            super(isNameExpr, null, isNameExpr, true);
        }

        @Override
        protected StatusCode isMethod(final String[] isParameter) {
            final String isVariable = isNameExpr[isIntegerConstant];
            try {
                // isComment
                final TrackableLog isVariable = new TrackableLog(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isIntegerConstant, isIntegerConstant, isNameExpr.isMethod());
                isNameExpr.isMethod(isNameExpr);
                // isComment
                final LogResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
                // isComment
                if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                    isMethod(isNameExpr);
                    if (isNameExpr.isMethod() && isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                        // isComment
                        final LogEntry isVariable = new LogEntry.Builder().isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr).isMethod();
                        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
                    }
                }
                // isComment
                if (isNameExpr.isMethod(isNameExpr.isMethod())) {
                    isMethod(isNameExpr.isMethod());
                }
                // isComment
                return isNameExpr.isMethod();
            } catch (final RuntimeException isParameter) {
                isNameExpr.isMethod("isStringConstant", isNameExpr);
            }
            return isNameExpr.isFieldAccessExpr;
        }

        @Override
        protected void isMethod(final StatusCode isParameter) {
            if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                isMethod();
            } else if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                // isComment
                isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                isMethod();
            } else {
                isMethod(isNameExpr.isMethod(isNameExpr));
            }
        }

        /**
         * isComment
         */
        private void isMethod(final String isParameter) {
            // isComment
            final LogEntry isVariable = new LogEntry.Builder().isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr).isMethod();
            final List<LogEntry> isVariable = new ArrayList<>(isNameExpr.isMethod());
            isNameExpr.isMethod(isIntegerConstant, isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        }
    }

    public static Intent isMethod(final Context isParameter, final Trackable isParameter) {
        final Intent isVariable = new Intent(isNameExpr, LogTrackableActivity.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        return isNameExpr;
    }

    public static Intent isMethod(final Context isParameter, final Trackable isParameter, final String isParameter) {
        final Intent isVariable = isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        return isNameExpr;
    }

    @Override
    protected LogContext isMethod() {
        return new LogContext(isNameExpr, null);
    }

    @Override
    public boolean isMethod(final MenuItem isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                if (isNameExpr.isMethod()) {
                    isMethod();
                } else {
                    // isComment
                    isNameExpr.isMethod(this, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod(), isNameExpr.isMethod()), new OnClickListener() {

                        @Override
                        public void isMethod(final DialogInterface isParameter, final int isParameter) {
                            if (isNameExpr.isMethod() > isIntegerConstant) {
                                isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.this);
                            } else {
                                isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                            }
                        }
                    });
                }
                return true;
            default:
                break;
        }
        return super.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    private void isMethod() {
        // isComment
        if (!isNameExpr) {
            isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            return;
        }
        // isComment
        if (isNameExpr.isMethod() && isNameExpr.isMethod().isMethod().isMethod()) {
            isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            return;
        }
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        // isComment
        if (isNameExpr.isMethod() && isNameExpr.isMethod(isNameExpr) && isNameExpr == null) {
            isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            return;
        }
        // isComment
        if (isNameExpr.isMethod(isNameExpr) && isNameExpr.isMethod() && isNameExpr.isMethod() && isNameExpr.isMethod().isMethod().isMethod() && isNameExpr.isMethod() < isNameExpr) {
            new LogTrackableWithoutGeocodeBuilder().isMethod(this).isMethod();
        } else {
            isMethod();
        }
    }

    /**
     * isComment
     */
    private void isMethod() {
        new Poster(this, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
    }

    @Override
    public boolean isMethod(final Menu isParameter) {
        final boolean isVariable = super.isMethod(isNameExpr);
        for (final LogTemplate isVariable : isNameExpr.isMethod()) {
            if (isNameExpr.isMethod().isMethod("isStringConstant")) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod().isMethod(isNameExpr.isMethod());
            }
        }
        return isNameExpr;
    }

    @Override
    protected String isMethod() {
        return isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    public class isClassOrIsInterface {

        private CheckBox isVariable;

        public AlertDialog isMethod(final Activity isParameter) {
            final AlertDialog.Builder isVariable = new AlertDialog.Builder(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            final View isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr = (CheckBox) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            final int isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr + isIntegerConstant);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new DialogInterface.OnClickListener() {

                @Override
                public void isMethod(final DialogInterface isParameter, final int isParameter) {
                    isMethod();
                    isNameExpr.isMethod();
                }
            });
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new DialogInterface.OnClickListener() {

                @Override
                public void isMethod(final DialogInterface isParameter, final int isParameter) {
                    isMethod();
                    isNameExpr.isMethod();
                    // isComment
                    isMethod();
                }
            });
            return isNameExpr.isMethod();
        }

        /**
         * isComment
         */
        private void isMethod() {
            if (isNameExpr.isMethod()) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
    }
}
