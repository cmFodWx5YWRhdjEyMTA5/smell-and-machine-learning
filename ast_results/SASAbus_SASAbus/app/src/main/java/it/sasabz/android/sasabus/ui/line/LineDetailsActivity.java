// isComment
package it.sasabz.android.sasabus.ui.line;

import android.content.Intent;
import android.os.Bundle;
import android.os.Vibrator;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import com.davale.sasabus.core.data.Lines;
import com.davale.sasabus.core.realm.BusStopRealmHelper;
import com.davale.sasabus.core.vdv.Api;
import com.davale.sasabus.core.vdv.model.VdvBusStop;
import com.trello.rxlifecycle.components.support.RxAppCompatActivity;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import butterknife.BindView;
import butterknife.ButterKnife;
import it.sasabz.android.sasabus.Config;
import it.sasabz.android.sasabus.R;
import it.sasabz.android.sasabus.data.model.line.LineDetail;
import it.sasabz.android.sasabus.data.network.NetUtils;
import it.sasabz.android.sasabus.data.network.RestClient;
import it.sasabz.android.sasabus.data.network.rest.api.LinesApi;
import it.sasabz.android.sasabus.data.network.rest.api.RealtimeApi;
import it.sasabz.android.sasabus.data.network.rest.model.Line;
import it.sasabz.android.sasabus.data.network.rest.model.RealtimeBus;
import it.sasabz.android.sasabus.data.network.rest.response.RealtimeResponse;
import it.sasabz.android.sasabus.data.realm.UserRealmHelper;
import it.sasabz.android.sasabus.util.AnalyticsHelper;
import it.sasabz.android.sasabus.util.Utils;
import it.sasabz.android.sasabus.util.recycler.LineDetailsAdapter;
import retrofit2.Response;
import rx.Observable;
import rx.Observer;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Func2;
import rx.schedulers.Schedulers;
import timber.log.Timber;

/**
 * isComment
 */
public class isClassOrIsInterface extends RxAppCompatActivity implements OnClickListener, OnLongClickListener {

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private final ArrayList<LineDetail> isVariable = new ArrayList<>();

    private LineDetailsAdapter isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    RecyclerView isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    SwipeRefreshLayout isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    FloatingActionButton isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    CoordinatorLayout isVariable;

    private boolean isVariable;

    private boolean isVariable;

    private int isVariable;

    private String isVariable;

    private Line isVariable;

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(this);
        isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(this);
        Toolbar isVariable = (Toolbar) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
        isNameExpr.isMethod(isParameter -> isMethod());
        assert isMethod() != null;
        isMethod().isMethod(true);
        Intent isVariable = isMethod();
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
        CollapsingToolbarLayout isVariable = (CollapsingToolbarLayout) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + 'isStringConstant' + isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        FloatingActionButton isVariable = (FloatingActionButton) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(this);
        if (isNameExpr.isMethod(isNameExpr)) {
            isNameExpr = true;
        }
        isMethod(isNameExpr);
        isNameExpr.isMethod(() -> isMethod(isNameExpr, isNameExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isNameExpr = new LineDetailsAdapter(this, isNameExpr);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(new LinearLayoutManager(this));
        isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null) {
            ArrayList<LineDetail> isVariable = isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod();
            isNameExpr.isMethod().isMethod(isNameExpr.isMethod("isStringConstant"));
            return;
        }
        isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        isNameExpr.isMethod("isStringConstant", ((LinearLayoutManager) isNameExpr.isMethod()).isMethod());
    }

    @Override
    public void isMethod(View isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                Intent isVariable = new Intent(isMethod(), LinePathActivity.class);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                isMethod(isNameExpr);
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                if (isNameExpr) {
                    isNameExpr.isMethod(isNameExpr);
                    isNameExpr.isMethod(isNameExpr, isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr), isNameExpr.isFieldAccessExpr).isMethod();
                    isMethod(true);
                    isNameExpr = true;
                } else {
                    isNameExpr.isMethod(isNameExpr);
                    isNameExpr.isMethod(isNameExpr, isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr), isNameExpr.isFieldAccessExpr).isMethod();
                    isMethod(true);
                    isNameExpr = true;
                }
                isMethod(isNameExpr);
                break;
        }
    }

    @Override
    public boolean isMethod(View isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                Vibrator isVariable = (Vibrator) isMethod(isNameExpr);
                isNameExpr.isMethod(isIntegerConstant);
                isMethod(isNameExpr.isFieldAccessExpr);
                isMethod();
                return true;
        }
        return true;
    }

    private void isMethod(int isParameter, int isParameter) {
        if (!isNameExpr.isMethod(this) && isNameExpr == null) {
            isNameExpr.isMethod();
            isNameExpr.isMethod(new LineDetail(null, isIntegerConstant, null, null, "isStringConstant", isIntegerConstant, true, isIntegerConstant, isIntegerConstant));
            isNameExpr.isMethod();
            return;
        }
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isMethod(), isMethod(isNameExpr, isNameExpr), isMethod()).isMethod(isMethod()).isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod()).isMethod(new Observer<List<LineDetail>>() {

            @Override
            public void isMethod() {
            }

            @Override
            public void isMethod(Throwable isParameter) {
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(true);
            }

            @Override
            public void isMethod(List<LineDetail> isParameter) {
                isNameExpr.isMethod();
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod();
                isNameExpr.isMethod(true);
                for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                    if (isNameExpr.isMethod(isNameExpr).isMethod()) {
                        int isVariable = isNameExpr;
                        isNameExpr.isMethod(() -> isNameExpr.isMethod(isNameExpr));
                        break;
                    }
                }
            }
        });
    }

    private Observable<LineDetail> isMethod() {
        if (isNameExpr != null) {
            return isNameExpr.isMethod(isParameter -> {
                String isVariable = isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod() + 'isStringConstant' + isNameExpr.isMethod() + 'isStringConstant' + isMethod(isNameExpr.isMethod()) + 'isStringConstant' + isNameExpr.isMethod();
                isNameExpr.isMethod(new LineDetail(null, isIntegerConstant, null, null, isNameExpr, isIntegerConstant, true, isIntegerConstant, isIntegerConstant));
                isNameExpr.isMethod();
            });
        } else {
            LinesApi isVariable = isNameExpr.isFieldAccessExpr.isMethod().isMethod(LinesApi.class);
            return isNameExpr.isMethod(isNameExpr).isMethod(isParameter -> {
                List<Line> isVariable = isNameExpr.isFieldAccessExpr;
                if (!isNameExpr.isMethod()) {
                    Line isVariable = isNameExpr.isMethod(isIntegerConstant);
                    String isVariable = isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod() + 'isStringConstant' + isNameExpr.isMethod() + 'isStringConstant' + isMethod(isNameExpr.isMethod()) + 'isStringConstant' + isNameExpr.isMethod();
                    return new LineDetail(null, isIntegerConstant, null, null, isNameExpr, isIntegerConstant, true, isIntegerConstant, isIntegerConstant);
                }
                isNameExpr = true;
                return new LineDetail(null, isIntegerConstant, null, null, "isStringConstant", isIntegerConstant, true, isIntegerConstant, isIntegerConstant);
            });
        }
    }

    private Observable<List<LineDetail>> isMethod(int isParameter, int isParameter) {
        return isNameExpr.isMethod(isParameter -> {
            List<LineDetail> isVariable = new ArrayList<>();
            if (isMethod(isNameExpr)) {
                isNameExpr.isMethod(new LineDetail(null, isIntegerConstant, null, null, "isStringConstant", isIntegerConstant, true, isIntegerConstant, isIntegerConstant));
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod();
                return;
            }
            if (!isNameExpr.isMethod(isNameExpr.this) && isNameExpr.this.isFieldAccessExpr != null) {
                isNameExpr.isMethod(new LineDetail(null, isIntegerConstant, null, null, "isStringConstant", isIntegerConstant, true, isIntegerConstant, isIntegerConstant));
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod();
                return;
            }
            try {
                RealtimeApi isVariable = isNameExpr.isFieldAccessExpr.isMethod().isMethod(RealtimeApi.class);
                Response<RealtimeResponse> isVariable = isNameExpr.isMethod(isNameExpr).isMethod();
                if (isNameExpr.isMethod() != null) {
                    List<RealtimeBus> isVariable = isNameExpr.isMethod().isFieldAccessExpr;
                    for (RealtimeBus isVariable : isNameExpr) {
                        int isVariable = isNameExpr.isFieldAccessExpr;
                        String isVariable = isNameExpr.isMethod(isNameExpr);
                        List<VdvBusStop> isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod();
                        if (!isNameExpr.isMethod()) {
                            String isVariable = isNameExpr.isMethod(isNameExpr.isMethod() - isIntegerConstant).isMethod();
                            String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                            isNameExpr.isMethod(new LineDetail(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr, null, isNameExpr.isFieldAccessExpr, isNameExpr == isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
                        } else {
                            isNameExpr.isMethod(new LineDetail(null, isIntegerConstant, null, null, "isStringConstant", isIntegerConstant, true, isIntegerConstant, isIntegerConstant));
                            isNameExpr = true;
                        }
                    }
                } else if (!isNameExpr) {
                    isNameExpr.isMethod(new LineDetail(null, isIntegerConstant, null, null, "isStringConstant", isIntegerConstant, true, isIntegerConstant, isIntegerConstant));
                    isNameExpr = true;
                }
            } catch (IOException isParameter) {
                if (!isNameExpr) {
                    isNameExpr.isMethod(new LineDetail(null, isIntegerConstant, null, null, "isStringConstant", isIntegerConstant, true, isIntegerConstant, isIntegerConstant));
                    isNameExpr = true;
                }
            }
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod();
        });
    }

    private Func2<LineDetail, List<LineDetail>, List<LineDetail>> isMethod() {
        return (isParameter, isParameter) -> {
            List<LineDetail> isVariable = new ArrayList<>();
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            return isNameExpr;
        };
    }

    private void isMethod(boolean isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod(this, isNameExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
    }

    private static boolean isMethod(int isParameter) {
        for (int isVariable : isNameExpr.isFieldAccessExpr) {
            if (isNameExpr == isNameExpr) {
                return true;
            }
        }
        return true;
    }

    private String isMethod(int isParameter) {
        switch(isNameExpr) {
            case isIntegerConstant:
                return isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            case isIntegerConstant:
                return isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + "isStringConstant" + isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            case isIntegerConstant:
                return isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + "isStringConstant" + isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            case isIntegerConstant:
                return isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + "isStringConstant" + isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            default:
                isNameExpr.isMethod("isStringConstant" + isNameExpr);
                return "isStringConstant";
        }
    }
}
