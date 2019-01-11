// isComment
package cgeo.geocaching;

import cgeo.geocaching.activity.AbstractActionBarActivity;
import cgeo.geocaching.activity.INavigationSource;
import cgeo.geocaching.apps.navi.NavigationAppFactory;
import cgeo.geocaching.location.DistanceParser;
import cgeo.geocaching.location.Geopoint;
import cgeo.geocaching.location.GeopointFormatter;
import cgeo.geocaching.models.Destination;
import cgeo.geocaching.sensors.GeoData;
import cgeo.geocaching.sensors.GeoDirHandler;
import cgeo.geocaching.sensors.Sensors;
import cgeo.geocaching.settings.Settings;
import cgeo.geocaching.storage.DataStore;
import cgeo.geocaching.ui.AbstractViewHolder;
import cgeo.geocaching.ui.NavigationActionProvider;
import cgeo.geocaching.ui.dialog.CoordinatesInputDialog;
import cgeo.geocaching.ui.dialog.Dialogs;
import cgeo.geocaching.utils.AndroidRxUtils;
import cgeo.geocaching.utils.Formatter;
import cgeo.geocaching.utils.Log;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.MenuItemCompat;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.schedulers.Schedulers;
import org.apache.commons.lang3.StringUtils;

public class isClassOrIsInterface extends AbstractActionBarActivity implements CoordinatesInputDialog.CoordinateUpdate, INavigationSource {

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected ListView isVariable;

    // isComment
    @Nullable
    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected Button isVariable;

    @Nullable
    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected Button isVariable;

    @Nullable
    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected EditText isVariable;

    @Nullable
    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected Spinner isVariable;

    @Nullable
    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected Button isVariable;

    @Nullable
    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected EditText isVariable;

    private boolean isVariable = true;

    private List<Destination> isVariable;

    private DestinationHistoryAdapter isVariable;

    private TextView isVariable;

    private static final int isVariable = isIntegerConstant;

    private static final int isVariable = isIntegerConstant;

    private static final int isVariable = isIntegerConstant;

    private int isVariable;

    private String isVariable = isNameExpr.isFieldAccessExpr;

    protected static class isClassOrIsInterface extends AbstractViewHolder {

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        protected TextView isVariable;

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        protected TextView isVariable;

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        protected TextView isVariable;

        public isConstructor(final View isParameter) {
            super(isNameExpr);
        }
    }

    private static class isClassOrIsInterface extends ArrayAdapter<Destination> {

        private LayoutInflater isVariable = null;

        isConstructor(final Context isParameter, final List<Destination> isParameter) {
            super(isNameExpr, isIntegerConstant, isNameExpr);
        }

        @Override
        public View isMethod(final int isParameter, final View isParameter, final ViewGroup isParameter) {
            View isVariable = isNameExpr;
            final ViewHolder isVariable;
            if (isNameExpr == null) {
                isNameExpr = isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
                isNameExpr = new ViewHolder(isNameExpr);
            } else {
                isNameExpr = (ViewHolder) isNameExpr.isMethod();
            }
            isMethod(isNameExpr, isMethod(isNameExpr));
            return isNameExpr;
        }

        private static void isMethod(final ViewHolder isParameter, final Destination isParameter) {
            final String isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            final String isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod()));
        }

        private LayoutInflater isMethod() {
            if (isNameExpr == null) {
                isNameExpr = isNameExpr.isMethod(isMethod());
            }
            return isNameExpr;
        }
    }

    @Override
    public void isMethod(final Bundle isParameter) {
        super.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(this);
        isMethod();
        isMethod();
    }

    private void isMethod() {
        final View isVariable = isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        isNameExpr.isMethod(isNameExpr, null, true);
        // isComment
        isNameExpr.isMethod(this);
        if (isMethod().isMethod()) {
            isNameExpr.isMethod(isMethod(), null, true);
        }
        isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod(new OnItemClickListener() {

            @Override
            public void isMethod(final AdapterView<?> isParameter, final View isParameter, final int isParameter, final long isParameter) {
                final Object isVariable = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr instanceof Destination) {
                    isMethod(((Destination) isNameExpr).isMethod());
                }
            }
        });
        isNameExpr.isMethod(new OnCreateContextMenuListener() {

            @Override
            public void isMethod(final ContextMenu isParameter, final View isParameter, final ContextMenuInfo isParameter) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
        });
    }

    @Override
    public boolean isMethod(final MenuItem isParameter) {
        final AdapterView.AdapterContextMenuInfo isVariable = (AdapterView.AdapterContextMenuInfo) isNameExpr.isMethod();
        final int isVariable = isNameExpr != null ? isNameExpr.isFieldAccessExpr : isNameExpr;
        final Object isVariable = isNameExpr.isMethod(isNameExpr);
        switch(isNameExpr.isMethod()) {
            case isNameExpr:
                isNameExpr = isNameExpr;
                if (isNameExpr instanceof Destination) {
                    isNameExpr.isMethod(this, null, null, ((Destination) isNameExpr).isMethod());
                    return true;
                }
                break;
            case isNameExpr:
                if (isNameExpr instanceof Destination) {
                    isMethod((Destination) isNameExpr);
                }
                return true;
            case isNameExpr:
                if (isNameExpr instanceof Destination) {
                    final Geopoint isVariable = ((Destination) isNameExpr).isMethod();
                    isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                    isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                }
                return true;
            default:
        }
        return super.isMethod(isNameExpr);
    }

    private TextView isMethod() {
        if (isNameExpr == null) {
            isNameExpr = (TextView) isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        return isNameExpr;
    }

    private DestinationHistoryAdapter isMethod() {
        if (isNameExpr == null) {
            isNameExpr = new DestinationHistoryAdapter(this, isMethod());
        }
        return isNameExpr;
    }

    private List<Destination> isMethod() {
        if (isNameExpr == null) {
            // isComment
            isNameExpr = isNameExpr.isMethod();
        }
        return isNameExpr;
    }

    @Override
    public void isMethod(final Configuration isParameter) {
        super.isMethod(isNameExpr);
        isMethod();
    }

    @Override
    public void isMethod() {
        super.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod();
    }

    private void isMethod() {
        isMethod().isMethod(new CoordDialogListener());
        isMethod().isMethod(new CoordDialogListener());
        final Geopoint isVariable = isNameExpr.isMethod();
        if (isNameExpr != null) {
            isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        }
        isMethod().isMethod(new CurrentListener());
        isMethod().isMethod();
        isMethod(isMethod());
        isMethod();
    }

    private void isMethod() {
        if (isNameExpr.isMethod(isNameExpr)) {
            if (isNameExpr.isMethod()) {
                // isComment
                isMethod().isMethod(isIntegerConstant);
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)[isIntegerConstant];
            } else {
                // isComment
                isMethod().isMethod(isIntegerConstant);
                isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)[isIntegerConstant];
            }
        }
        isMethod().isMethod(new ChangeDistanceUnit(this));
    }

    private class isClassOrIsInterface implements View.OnClickListener {

        @Override
        public void isMethod(final View isParameter) {
            Geopoint isVariable = null;
            if (isMethod().isMethod().isMethod() > isIntegerConstant && isMethod().isMethod().isMethod() > isIntegerConstant) {
                isNameExpr = new Geopoint(isMethod().isMethod().isMethod() + "isStringConstant" + isMethod().isMethod().isMethod());
            }
            final CoordinatesInputDialog isVariable = isNameExpr.isMethod(null, isNameExpr);
            isNameExpr.isMethod(true);
            isNameExpr.isMethod(isMethod(), "isStringConstant");
        }
    }

    @Override
    public void isMethod(final Geopoint isParameter) {
        isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr = true;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    private static class isClassOrIsInterface implements OnItemSelectedListener {

        private isConstructor(final NavigateAnyPointActivity isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        private final NavigateAnyPointActivity isVariable;

        @Override
        public void isMethod(final AdapterView<?> isParameter, final View isParameter, final int isParameter, final long isParameter) {
            isNameExpr.isFieldAccessExpr = (String) isNameExpr.isMethod(isNameExpr);
        }

        @Override
        public void isMethod(final AdapterView<?> isParameter) {
        }
    }

    @Override
    public boolean isMethod(final Menu isParameter) {
        isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        final MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        final NavigationActionProvider isVariable = (NavigationActionProvider) isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(this);
        }
        return true;
    }

    @Override
    public boolean isMethod(final Menu isParameter) {
        super.isMethod(isNameExpr);
        try {
            final boolean isVariable = isMethod() != null;
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(!isMethod().isMethod());
        } catch (final RuntimeException isParameter) {
        // isComment
        }
        return true;
    }

    @Override
    public boolean isMethod(final MenuItem isParameter) {
        final int isVariable = isNameExpr.isMethod();
        final Geopoint isVariable = isMethod();
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod(isNameExpr);
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod(isNameExpr);
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod();
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod(this, null, null, isNameExpr);
                return true;
        }
        return super.isMethod(isNameExpr);
    }

    private Geopoint isMethod() {
        final Geopoint isVariable = isMethod();
        isMethod(isNameExpr);
        return isNameExpr;
    }

    private void isMethod(@Nullable final Geopoint isParameter) {
        if (isNameExpr == null) {
            return;
        }
        // isComment
        final Destination isVariable = new Destination(isNameExpr);
        if (!isMethod().isMethod(isNameExpr)) {
            isMethod().isMethod(isIntegerConstant, isNameExpr);
            isNameExpr.isMethod(isNameExpr.isMethod(), new Runnable() {

                @Override
                public void isMethod() {
                    // isComment
                    isNameExpr.isMethod(isNameExpr);
                }
            }, new Runnable() {

                @Override
                public void isMethod() {
                    // isComment
                    isNameExpr.isMethod(isMethod());
                    isNameExpr.isMethod();
                }
            });
        }
    }

    private void isMethod(final Destination isParameter) {
        if (isMethod().isMethod(isNameExpr)) {
            isMethod().isMethod(isNameExpr);
            // isComment
            isNameExpr.isMethod(isNameExpr);
            if (isMethod().isMethod() && isNameExpr.isMethod() == isIntegerConstant) {
                isNameExpr.isMethod(isMethod());
            }
            isMethod().isMethod();
            isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        }
    }

    private void isMethod() {
        if (!isMethod().isMethod()) {
            isMethod().isMethod();
            // isComment
            isNameExpr.isMethod();
            if (isNameExpr.isMethod() == isIntegerConstant) {
                isNameExpr.isMethod(isMethod());
            }
            isMethod().isMethod();
            isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        }
    }

    private void isMethod(final Geopoint isParameter) {
        if (isNameExpr == null) {
            isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            return;
        }
        isNameExpr.isMethod(isIntegerConstant, this, isNameExpr);
    }

    private void isMethod(final Geopoint isParameter) {
        if (isNameExpr == null) {
            isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            return;
        }
        isNameExpr.isMethod(this, isNameExpr, null);
        isMethod();
    }

    private final GeoDirHandler isVariable = new GeoDirHandler() {

        @Override
        public void isMethod(final GeoData isParameter) {
            try {
                isMethod().isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                isMethod().isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            } catch (final RuntimeException isParameter) {
                isNameExpr.isMethod("isStringConstant", isNameExpr);
            }
        }
    };

    private class isClassOrIsInterface implements View.OnClickListener {

        @Override
        public void isMethod(final View isParameter) {
            final Geopoint isVariable = isNameExpr.isMethod().isMethod().isMethod();
            isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            isNameExpr = true;
        }
    }

    private Geopoint isMethod() {
        final String isVariable = isMethod().isMethod().isMethod();
        // isComment
        final String isVariable = isMethod().isMethod().isMethod() + isNameExpr;
        final String isVariable = isMethod().isMethod().isMethod();
        final String isVariable = isMethod().isMethod().isMethod();
        if (isNameExpr.isMethod(isNameExpr) && isNameExpr.isMethod(isNameExpr) && isNameExpr.isMethod(isNameExpr) && isNameExpr.isMethod(isNameExpr)) {
            isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            return null;
        }
        // isComment
        Geopoint isVariable;
        if (isNameExpr.isMethod(isNameExpr) && isNameExpr.isMethod(isNameExpr)) {
            try {
                isNameExpr = new Geopoint(isNameExpr, isNameExpr);
            } catch (final Geopoint.ParseException isParameter) {
                isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
                return null;
            }
        } else {
            isNameExpr = isNameExpr.isMethod().isMethod().isMethod();
        }
        // isComment
        if (isNameExpr.isMethod(isNameExpr) && isNameExpr.isMethod(isNameExpr)) {
            // isComment
            final double isVariable;
            try {
                isNameExpr = isNameExpr.isMethod(isNameExpr);
            } catch (final NumberFormatException isParameter) {
                isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                return null;
            }
            final double isVariable;
            try {
                isNameExpr = isNameExpr.isMethod(isNameExpr, !isNameExpr.isMethod());
            } catch (final NumberFormatException isParameter) {
                isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                return null;
            }
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        isMethod(isNameExpr);
        return isNameExpr;
    }

    private void isMethod(final Geopoint isParameter) {
        if (!isNameExpr) {
            return;
        }
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod() {
        isMethod(isMethod());
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod(isIntegerConstant, this, isMethod());
    }

    private Button isMethod() {
        return isNameExpr;
    }

    private Button isMethod() {
        return isNameExpr;
    }

    private EditText isMethod() {
        return isNameExpr;
    }

    private Spinner isMethod() {
        return isNameExpr;
    }

    private Button isMethod() {
        return isNameExpr;
    }

    private EditText isMethod() {
        return isNameExpr;
    }
}
