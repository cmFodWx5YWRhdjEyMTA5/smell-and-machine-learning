// isComment
package it.sasabz.android.sasabus.ui.departure;

import android.annotation.SuppressLint;
import android.app.DatePickerDialog;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v4.util.Pair;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.view.ContextThemeWrapper;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.format.DateUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.animation.DecelerateInterpolator;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.TimePicker;
import com.davale.sasabus.core.model.Departure;
import com.davale.sasabus.core.realm.BusStopRealmHelper;
import com.davale.sasabus.core.realm.model.BusStop;
import com.davale.sasabus.core.util.AnimUtils;
import com.davale.sasabus.core.vdv.DepartureMonitor;
import com.davale.sasabus.core.vdv.model.VdvDeparture;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import io.realm.Realm;
import io.realm.RealmResults;
import it.sasabz.android.sasabus.Config;
import it.sasabz.android.sasabus.R;
import it.sasabz.android.sasabus.beacon.BeaconHandler;
import it.sasabz.android.sasabus.beacon.busstop.BusStopBeaconHandler;
import it.sasabz.android.sasabus.data.network.NetUtils;
import it.sasabz.android.sasabus.data.network.RestClient;
import it.sasabz.android.sasabus.data.network.rest.api.RealtimeApi;
import it.sasabz.android.sasabus.data.network.rest.model.RealtimeBus;
import it.sasabz.android.sasabus.data.network.rest.response.RealtimeResponse;
import it.sasabz.android.sasabus.data.realm.UserRealmHelper;
import it.sasabz.android.sasabus.ui.BaseActivity;
import it.sasabz.android.sasabus.ui.widget.RecyclerItemDivider;
import it.sasabz.android.sasabus.util.MapUtils;
import it.sasabz.android.sasabus.util.Utils;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;
import timber.log.Timber;

public class isClassOrIsInterface extends BaseActivity implements View.OnClickListener, View.OnTouchListener, DatePickerDialog.OnDateSetListener, TimePickerDialog.OnTimeSetListener {

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final int isVariable = isIntegerConstant;

    private static final double isVariable = isDoubleConstant;

    private static final int isVariable = isIntegerConstant;

    private static final int isVariable = isIntegerConstant;

    private static final int isVariable = isIntegerConstant;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    ImageView isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    TextView isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    ImageView isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    ImageView isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    SwipeRefreshLayout isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    RecyclerView isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    ScrollView isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    TextView isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    FloatingActionButton isVariable;

    private ArrayList<Departure> isVariable;

    private DeparturesAdapter isVariable;

    @Nullable
    private BusStop isVariable;

    private Calendar isVariable;

    /**
     * isComment
     */
    private float isVariable;

    private float isVariable;

    private boolean isVariable;

    private int isVariable = isNameExpr;

    private final long isVariable = isNameExpr.isMethod();

    private final Realm isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(this);
        isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(() -> {
            if (isNameExpr == null) {
                isNameExpr.isMethod(true);
            } else {
                isMethod(isNameExpr.isMethod());
            }
        });
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            int isVariable = isNameExpr.isMethod(isNameExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr);
            isMethod(isNameExpr);
        } else {
            isNameExpr = new ArrayList<>();
        }
        isNameExpr = new DeparturesAdapter(this, isNameExpr);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(new RecyclerItemDivider(this));
        isNameExpr.isMethod(new LinearLayoutManager(this));
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(this);
        isNameExpr = isNameExpr.isMethod();
        if (isNameExpr == null) {
            isMethod(isMethod());
        } else {
            int isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            if (isNameExpr != isNameExpr.isFieldAccessExpr) {
                isMethod();
            }
        }
    }

    @Override
    protected void isMethod(int isParameter, int isParameter, Intent isParameter) {
        if (isNameExpr == isNameExpr) {
            if (isNameExpr == isNameExpr) {
                int isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, -isIntegerConstant);
                isNameExpr = isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod("isStringConstant", isNameExpr);
                isNameExpr = isNameExpr;
                isNameExpr.isMethod();
                isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
                isMethod(isNameExpr);
            }
        } else {
            super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
    }

    @Override
    protected int isMethod() {
        return isNameExpr;
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isNameExpr.isMethod();
    }

    @SuppressLint("isStringConstant")
    @Override
    public void isMethod(View isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                int[] isVariable = new int[isIntegerConstant];
                isNameExpr.isMethod(isNameExpr);
                Intent isVariable = new Intent(this, DepartureSearchActivity.class);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                isMethod(isNameExpr, isNameExpr);
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr = new int[isIntegerConstant];
                isNameExpr.isMethod(isNameExpr);
                isNameExpr = new Intent(this, DepartureSearchActivity.class);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
                isMethod(isNameExpr, isNameExpr);
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                Context isVariable = this;
                if (isNameExpr.isMethod()) {
                    isNameExpr = new ContextThemeWrapper(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
                }
                DatePickerDialog isVariable = new DatePickerDialog(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, this, isIntegerConstant, isIntegerConstant, isIntegerConstant);
                isNameExpr.isMethod().isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, null, (DialogInterface.OnClickListener) null);
                isNameExpr.isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), null);
                isNameExpr.isMethod();
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                if (isNameExpr == null) {
                    return;
                }
                if (isNameExpr) {
                    isNameExpr.isMethod(isNameExpr.isMethod());
                    isNameExpr.isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(this)), isNameExpr.isFieldAccessExpr).isMethod();
                    isMethod(true);
                    isNameExpr = true;
                } else {
                    isNameExpr.isMethod(isNameExpr.isMethod());
                    isNameExpr.isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(this)), isNameExpr.isFieldAccessExpr).isMethod();
                    isMethod(true);
                    isNameExpr = true;
                }
                break;
        }
    }

    @Override
    public boolean isMethod(View isParameter, MotionEvent isParameter) {
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            isNameExpr = isNameExpr.isMethod();
            isNameExpr = isNameExpr.isMethod();
        }
        return true;
    }

    @Override
    protected void isMethod(Intent isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    @Override
    public void isMethod(DatePicker isParameter, int isParameter, int isParameter, int isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr);
        TimePickerDialog isVariable = new TimePickerDialog(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, this, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), true);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod(TimePicker isParameter, int isParameter, int isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr, isNameExpr);
        if (isNameExpr != null) {
            isMethod(isNameExpr.isMethod());
        }
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        }
    }

    private void isMethod(Intent isParameter) {
        // isComment
        if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            int isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant);
            isNameExpr.isMethod("isStringConstant", isNameExpr);
            isMethod(isNameExpr);
            return;
        }
        if (isNameExpr.isFieldAccessExpr) {
            // isComment
            // isComment
            isNameExpr.isMethod("isStringConstant");
            Pair<Integer, it.sasabz.android.sasabus.data.model.BusStop> isVariable = isNameExpr.isMethod(this).isMethod();
            if (isNameExpr != null) {
                isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr.isMethod());
                isNameExpr = isNameExpr;
                isMethod(isNameExpr.isFieldAccessExpr.isMethod());
                return;
            }
        }
        Location isVariable = isNameExpr.isMethod(this);
        if (isNameExpr != null) {
            // isComment
            isNameExpr.isMethod("isStringConstant", isNameExpr);
            long isVariable = -isNameExpr.isMethod();
            double isVariable = isNameExpr.isMethod() + isNameExpr;
            double isVariable = isNameExpr.isMethod() + isNameExpr;
            double isVariable = isNameExpr.isMethod() - isNameExpr;
            double isVariable = isNameExpr.isMethod() - isNameExpr;
            RealmResults<BusStop> isVariable = isNameExpr.isMethod(BusStop.class).isMethod("isStringConstant", (float) isNameExpr, (float) isNameExpr).isMethod("isStringConstant", (float) isNameExpr, (float) isNameExpr).isMethod();
            if (!isNameExpr.isMethod()) {
                List<BusStop> isVariable = new ArrayList<>(new LinkedHashSet<>(isNameExpr));
                isNameExpr.isMethod(isNameExpr, (isParameter, isParameter) -> {
                    float isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), (float) isNameExpr.isMethod(), (float) isNameExpr.isMethod());
                    float isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), (float) isNameExpr.isMethod(), (float) isNameExpr.isMethod());
                    return (int) (isNameExpr - isNameExpr);
                });
                isNameExpr.isMethod("isStringConstant", isNameExpr + isNameExpr.isMethod());
                isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
                isNameExpr = isNameExpr;
                isMethod(isNameExpr.isMethod(isIntegerConstant).isMethod());
                return;
            } else {
                isNameExpr.isMethod("isStringConstant");
            }
        }
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isMethod();
    }

    private void isMethod(int isParameter) {
        isMethod(isNameExpr);
        if (isNameExpr == null) {
            return;
        }
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod(isMethod()).isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod()).isMethod(new Observer<List<Departure>>() {

            @Override
            public void isMethod() {
            }

            @Override
            public void isMethod(Throwable isParameter) {
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod();
                isNameExpr.isMethod();
                isNameExpr.isMethod(true);
                isMethod();
            }

            @Override
            public void isMethod(List<Departure> isParameter) {
                isNameExpr.isMethod(true);
                isNameExpr.isMethod();
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod();
                if (isNameExpr.isMethod()) {
                    isMethod();
                    return;
                }
                if (isNameExpr.isMethod(isNameExpr.this) && isNameExpr.isMethod(isNameExpr.isMethod())) {
                    isMethod();
                } else {
                    for (Departure isVariable : isNameExpr) {
                        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                        }
                    }
                }
            }
        });
    }

    private void isMethod(int isParameter) {
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr == null) {
            isNameExpr.isMethod("isStringConstant", isNameExpr);
        }
        switch(isNameExpr) {
            case isNameExpr:
                isNameExpr.isMethod(null);
                break;
            case isNameExpr:
                isNameExpr.isMethod(isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                break;
            case isNameExpr:
                isNameExpr.isMethod(isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                break;
            default:
                isNameExpr.isMethod("isStringConstant", isNameExpr);
        }
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod(isIntegerConstant).isMethod(new DecelerateInterpolator()).isMethod();
        // isComment
        if (isNameExpr != null) {
            isNameExpr.isMethod('isStringConstant' + isNameExpr.isMethod(this) + "isStringConstant" + isNameExpr.isMethod(this));
            isNameExpr.isMethod(isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        }
    }

    private void isMethod() {
        RealtimeApi isVariable = isNameExpr.isFieldAccessExpr.isMethod().isMethod(RealtimeApi.class);
        isNameExpr.isMethod().isMethod(isMethod()).isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod()).isMethod(new Observer<RealtimeResponse>() {

            @Override
            public void isMethod() {
            }

            @Override
            public void isMethod(Throwable isParameter) {
                isNameExpr.isMethod(isNameExpr);
                for (Departure isVariable : isNameExpr) {
                    if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    }
                }
                if (!isNameExpr.isMethod()) {
                    isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
                }
            }

            @Override
            public void isMethod(RealtimeResponse isParameter) {
                for (RealtimeBus isVariable : isNameExpr.isFieldAccessExpr) {
                    for (Departure isVariable : isNameExpr) {
                        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                            break;
                        }
                    }
                }
                for (Departure isVariable : isNameExpr) {
                    if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    }
                }
                if (!isNameExpr.isMethod()) {
                    isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod());
                }
            }
        });
    }

    private void isMethod(boolean isParameter) {
        if (isNameExpr) {
            isNameExpr.isMethod(isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        } else {
            isNameExpr.isMethod(isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        }
    }

    private void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    private void isMethod() {
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, true);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    private Observable<List<Departure>> isMethod(int isParameter) {
        return isNameExpr.isMethod(() -> {
            List<Departure> isVariable = new ArrayList<>();
            Collection<VdvDeparture> isVariable = new DepartureMonitor(isNameExpr.this).isMethod(isNameExpr).isMethod(isNameExpr.isMethod()).isMethod();
            for (VdvDeparture isVariable : isNameExpr) {
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod()));
            }
            return isNameExpr;
        });
    }

    public static Intent isMethod(Context isParameter, int isParameter) {
        Intent isVariable = new Intent(isNameExpr, DepartureActivity.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        return isNameExpr;
    }
}
