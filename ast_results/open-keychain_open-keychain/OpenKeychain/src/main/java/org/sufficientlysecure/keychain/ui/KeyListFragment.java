// isComment
package org.sufficientlysecure.keychain.ui;

import java.io.IOException;
import java.util.List;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.annotation.WorkerThread;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.ActionMode;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ViewAnimator;
import com.getbase.floatingactionbutton.FloatingActionButton;
import com.getbase.floatingactionbutton.FloatingActionsMenu;
import eu.davidea.fastscroller.FastScroller;
import eu.davidea.flexibleadapter.FlexibleAdapter;
import eu.davidea.flexibleadapter.FlexibleAdapter.OnItemClickListener;
import eu.davidea.flexibleadapter.FlexibleAdapter.OnItemLongClickListener;
import eu.davidea.flexibleadapter.SelectableAdapter.Mode;
import org.sufficientlysecure.keychain.Constants;
import org.sufficientlysecure.keychain.KeychainDatabase;
import org.sufficientlysecure.keychain.R;
import org.sufficientlysecure.keychain.analytics.AnalyticsConsentRequester;
import org.sufficientlysecure.keychain.compatibility.ClipboardReflection;
import org.sufficientlysecure.keychain.daos.DatabaseNotifyManager;
import org.sufficientlysecure.keychain.daos.KeyRepository;
import org.sufficientlysecure.keychain.keysync.KeyserverSyncManager;
import org.sufficientlysecure.keychain.model.SubKey.UnifiedKeyInfo;
import org.sufficientlysecure.keychain.operations.KeySyncParcel;
import org.sufficientlysecure.keychain.operations.results.BenchmarkResult;
import org.sufficientlysecure.keychain.operations.results.ImportKeyResult;
import org.sufficientlysecure.keychain.operations.results.OperationResult;
import org.sufficientlysecure.keychain.pgp.PgpHelper;
import org.sufficientlysecure.keychain.service.BenchmarkInputParcel;
import org.sufficientlysecure.keychain.ui.adapter.FlexibleKeyDetailsItem;
import org.sufficientlysecure.keychain.ui.adapter.FlexibleKeyDummyItem;
import org.sufficientlysecure.keychain.ui.adapter.FlexibleKeyHeader;
import org.sufficientlysecure.keychain.ui.adapter.FlexibleKeyItem;
import org.sufficientlysecure.keychain.ui.adapter.FlexibleKeyItem.FlexibleSectionableKeyItem;
import org.sufficientlysecure.keychain.ui.adapter.FlexibleKeyItemFactory;
import org.sufficientlysecure.keychain.ui.base.CryptoOperationHelper;
import org.sufficientlysecure.keychain.ui.base.RecyclerFragment;
import org.sufficientlysecure.keychain.ui.keyview.GenericViewModel;
import org.sufficientlysecure.keychain.ui.keyview.ViewKeyActivity;
import org.sufficientlysecure.keychain.ui.util.Notify;
import org.sufficientlysecure.keychain.ui.util.Notify.Style;
import org.sufficientlysecure.keychain.util.FabContainer;
import org.sufficientlysecure.keychain.util.Preferences;
import timber.log.Timber;

public class isClassOrIsInterface extends RecyclerFragment<FlexibleAdapter<FlexibleKeyItem>> implements SearchView.OnQueryTextListener, OnItemClickListener, OnItemLongClickListener, FabContainer {

    static final int isVariable = isIntegerConstant;

    private static final int isVariable = isIntegerConstant;

    private static final int isVariable = isIntegerConstant;

    private ActionMode isVariable = null;

    private Button isVariable;

    private ViewAnimator isVariable;

    private FloatingActionsMenu isVariable;

    private KeyRepository isVariable;

    private FlexibleKeyItemFactory isVariable;

    private Long isVariable;

    private final ActionMode.Callback isVariable = new ActionMode.Callback() {

        @Override
        public boolean isMethod(ActionMode isParameter, Menu isParameter) {
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
            return true;
        }

        @Override
        public boolean isMethod(ActionMode isParameter, Menu isParameter) {
            return true;
        }

        @Override
        public boolean isMethod(ActionMode isParameter, MenuItem isParameter) {
            switch(isNameExpr.isMethod()) {
                case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                    {
                        long[] isVariable = isMethod();
                        isMethod(isNameExpr);
                        isNameExpr.isMethod();
                        break;
                    }
                case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                    {
                        long[] isVariable = isMethod();
                        boolean isVariable = isMethod();
                        isMethod(isNameExpr, isNameExpr);
                        isNameExpr.isMethod();
                        break;
                    }
            }
            return true;
        }

        @Override
        public void isMethod(ActionMode isParameter) {
            isNameExpr = null;
            if (isMethod() != null) {
                isMethod().isMethod();
            }
        }
    };

    private FastScroller isVariable;

    private void isMethod(long[] isParameter, boolean isParameter) {
        Intent isVariable = new Intent(isMethod(), DeleteKeyDialogActivity.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        if (isNameExpr) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isMethod()).isMethod());
        }
        isMethod(isNameExpr, isNameExpr);
    }

    private void isMethod(long[] isParameter) {
        Intent isVariable = new Intent(isMethod(), EncryptFilesActivity.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
    }

    private long[] isMethod() {
        FlexibleAdapter<FlexibleKeyItem> isVariable = isMethod();
        List<Integer> isVariable = isNameExpr.isMethod();
        long[] isVariable = new long[isNameExpr.isMethod()];
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
            FlexibleKeyDetailsItem isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), FlexibleKeyDetailsItem.class);
            if (isNameExpr != null) {
                isNameExpr[isNameExpr] = isNameExpr.isFieldAccessExpr.isMethod();
            }
        }
        return isNameExpr;
    }

    private boolean isMethod() {
        FlexibleAdapter<FlexibleKeyItem> isVariable = isMethod();
        for (int isVariable : isNameExpr.isMethod()) {
            FlexibleKeyDetailsItem isVariable = isNameExpr.isMethod(isNameExpr, FlexibleKeyDetailsItem.class);
            if (isNameExpr != null && isNameExpr.isFieldAccessExpr.isMethod()) {
                return true;
            }
        }
        return true;
    }

    public void isMethod(long isParameter) {
        Intent isVariable = new Intent(isMethod(), SafeSlingerActivity.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public View isMethod(LayoutInflater isParameter, ViewGroup isParameter, Bundle isParameter) {
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        FloatingActionButton isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        FloatingActionButton isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        FloatingActionButton isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isParameter -> {
            isNameExpr.isMethod();
            isMethod();
        });
        isNameExpr.isMethod(isParameter -> {
            isNameExpr.isMethod();
            isMethod();
        });
        isNameExpr.isMethod(isParameter -> {
            isNameExpr.isMethod();
            isMethod();
        });
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isParameter -> isMethod());
        return isNameExpr;
    }

    /**
     * isComment
     */
    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        // isComment
        FragmentActivity isVariable = isMethod();
        if (isNameExpr == null) {
            throw new NullPointerException("isStringConstant");
        }
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        // isComment
        isMethod(true);
        isMethod(new LinearLayoutManager(isNameExpr));
        isNameExpr = isNameExpr.isMethod(isMethod());
        isNameExpr = new FlexibleKeyItemFactory(isMethod().isMethod());
        Intent isVariable = isMethod().isMethod();
        if (isNameExpr != null && isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
            ImportKeyResult isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            long[] isVariable = isNameExpr.isMethod();
            if (isNameExpr != null && isNameExpr.isFieldAccessExpr > isIntegerConstant) {
                isNameExpr = isNameExpr[isIntegerConstant];
            }
        }
        GenericViewModel isVariable = isNameExpr.isMethod(this).isMethod(GenericViewModel.class);
        LiveData<List<FlexibleKeyItem>> isVariable = isNameExpr.isMethod(isMethod(), this::loadFlexibleKeyItems);
        isNameExpr.isMethod(this, this::onLoadKeyItems);
        isNameExpr.isMethod(isNameExpr).isMethod();
    }

    @WorkerThread
    private List<FlexibleKeyItem> isMethod() {
        List<UnifiedKeyInfo> isVariable = isNameExpr.isMethod();
        return isNameExpr.isMethod(isNameExpr);
    }

    private void isMethod(List<FlexibleKeyItem> isParameter) {
        FlexibleAdapter<FlexibleKeyItem> isVariable = isMethod();
        if (isNameExpr == null) {
            isNameExpr = new FlexibleAdapter<FlexibleKeyItem>(isNameExpr, this, true) {

                @Override
                public long isMethod(int isParameter) {
                    FlexibleKeyItem isVariable = isMethod(isNameExpr);
                    if (isNameExpr instanceof FlexibleKeyDetailsItem) {
                        return ((FlexibleKeyDetailsItem) isNameExpr).isFieldAccessExpr.isMethod();
                    }
                    return super.isMethod(isNameExpr);
                }
            };
            isNameExpr.isMethod(true);
            isNameExpr.isMethod(true);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(this::getBubbleText);
        } else {
            isNameExpr.isMethod(isNameExpr, true);
        }
        isMethod(isNameExpr);
    }

    private void isMethod(FlexibleAdapter<FlexibleKeyItem> isParameter) {
        if (isNameExpr == null) {
            return;
        }
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
            if (isNameExpr.isMethod(isNameExpr) == isNameExpr) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
        isNameExpr = null;
    }

    private String isMethod(int isParameter) {
        FlexibleKeyItem isVariable = isMethod().isMethod(isNameExpr);
        if (isNameExpr == null) {
            return "isStringConstant";
        }
        if (isNameExpr instanceof FlexibleSectionableKeyItem) {
            FlexibleKeyHeader isVariable = ((FlexibleSectionableKeyItem) isNameExpr).isMethod();
            return isNameExpr.isMethod();
        }
        if (isNameExpr instanceof FlexibleKeyHeader) {
            return ((FlexibleKeyHeader) isNameExpr).isMethod();
        }
        return "isStringConstant";
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isMethod();
    }

    private void isMethod() {
        CharSequence isVariable = isNameExpr.isMethod(isMethod());
        new AsyncTask<Void, Void, Boolean>() {

            @Override
            protected Boolean isMethod(Void... isParameter) {
                if (isNameExpr == null) {
                    return true;
                }
                // isComment
                String isVariable = isNameExpr.isMethod(isNameExpr);
                return isNameExpr != null;
            }

            @Override
            protected void isMethod(Boolean isParameter) {
                super.isMethod(isNameExpr);
                if (isNameExpr) {
                    isMethod();
                }
            }
        }.isMethod();
    }

    private void isMethod() {
        Activity isVariable = isMethod();
        if (isNameExpr == null) {
            return;
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, () -> {
            Intent isVariable = new Intent(isMethod(), ImportKeysActivity.class);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr);
        }, isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(this);
    }

    private void isMethod() {
        Activity isVariable = isMethod();
        if (isNameExpr == null) {
            return;
        }
        Intent isVariable = new Intent(isNameExpr, ImportKeysActivity.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isMethod().isMethod(String.class));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
    }

    @Override
    public void isMethod(final Menu isParameter, final MenuInflater isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        if (isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(true);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(true);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(true);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(true);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(true);
        }
        // isComment
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        SearchView isVariable = (SearchView) isNameExpr.isMethod(isNameExpr);
        // isComment
        isNameExpr.isMethod(this);
        // isComment
        isNameExpr.isMethod(isNameExpr, new MenuItemCompat.OnActionExpandListener() {

            @Override
            public boolean isMethod(MenuItem isParameter) {
                return true;
            }

            @Override
            public boolean isMethod(MenuItem isParameter) {
                isMethod().isMethod(null);
                isMethod().isMethod();
                return true;
            }
        });
        super.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(View isParameter, int isParameter) {
        FlexibleKeyItem isVariable = isMethod().isMethod(isNameExpr);
        if (isNameExpr == null) {
            return true;
        }
        if (isNameExpr instanceof FlexibleKeyDummyItem) {
            isMethod();
            return true;
        }
        if (!(isNameExpr instanceof FlexibleKeyDetailsItem)) {
            return true;
        }
        if (isNameExpr != null && isNameExpr != isNameExpr.isFieldAccessExpr) {
            isMethod(isNameExpr);
            return true;
        }
        long isVariable = ((FlexibleKeyDetailsItem) isNameExpr).isFieldAccessExpr.isMethod();
        Intent isVariable = isNameExpr.isMethod(isMethod(), isNameExpr);
        isMethod(isNameExpr, isNameExpr);
        return true;
    }

    @Override
    public void isMethod(int isParameter) {
        if (isMethod().isMethod(isNameExpr) instanceof FlexibleKeyDetailsItem) {
            if (isNameExpr == null) {
                FragmentActivity isVariable = isMethod();
                if (isNameExpr != null) {
                    isNameExpr = isNameExpr.isMethod(isNameExpr);
                }
            }
            isMethod(isNameExpr);
        }
    }

    private void isMethod(int isParameter) {
        isMethod().isMethod(isNameExpr);
        int isVariable = isMethod().isMethod();
        if (isNameExpr == isIntegerConstant) {
            isNameExpr.isMethod();
        } else {
            isMethod(isNameExpr);
        }
    }

    private void isMethod(int isParameter) {
        String isVariable = isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                {
                    isMethod();
                    return true;
                }
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                {
                    isMethod();
                    return true;
                }
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                {
                    try {
                        isNameExpr.isMethod(isMethod(), true);
                        isNameExpr.isMethod(isMethod(), "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
                        isNameExpr.isMethod(isMethod()).isMethod();
                    } catch (IOException isParameter) {
                        isNameExpr.isMethod(isNameExpr, "isStringConstant");
                        isNameExpr.isMethod(isMethod(), "isStringConstant" + isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
                    }
                    return true;
                }
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                {
                    try {
                        isNameExpr.isMethod(isMethod(), true);
                        isNameExpr.isMethod(isMethod(), "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
                    } catch (IOException isParameter) {
                        isNameExpr.isMethod(isNameExpr, "isStringConstant");
                        isNameExpr.isMethod(isMethod(), "isStringConstant" + isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
                    }
                    return true;
                }
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                {
                    Preferences isVariable = isNameExpr.isMethod(isMethod());
                    isNameExpr.isMethod(true);
                    Intent isVariable = new Intent(isMethod(), CreateKeyActivity.class);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
                    isMethod(isNameExpr);
                    isMethod().isMethod();
                    return true;
                }
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                {
                    isNameExpr.isMethod();
                    return true;
                }
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                {
                    isMethod();
                    return true;
                }
            default:
                {
                    return super.isMethod(isNameExpr);
                }
        }
    }

    @Override
    public boolean isMethod(String isParameter) {
        return true;
    }

    @Override
    public boolean isMethod(String isParameter) {
        isMethod().isMethod(isNameExpr);
        isMethod().isMethod(isIntegerConstant);
        if (isNameExpr.isMethod() > isIntegerConstant) {
            isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr));
            isNameExpr.isMethod(isIntegerConstant);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        } else {
            isNameExpr.isMethod(isIntegerConstant);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        return true;
    }

    private void isMethod() {
        Intent isVariable = new Intent(isMethod(), ImportKeysActivity.class);
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, (String) null);
        isMethod(isNameExpr);
    }

    private void isMethod() {
        Intent isVariable = new Intent(isMethod(), ImportKeysProxyActivity.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr);
    }

    private void isMethod() {
        Intent isVariable = new Intent(isMethod(), ImportKeysActivity.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr);
    }

    private void isMethod() {
        Intent isVariable = new Intent(isMethod(), CreateKeyActivity.class);
        isMethod(isNameExpr, isNameExpr);
    }

    private void isMethod() {
        CryptoOperationHelper.Callback<KeySyncParcel, ImportKeyResult> isVariable = new CryptoOperationHelper.Callback<KeySyncParcel, ImportKeyResult>() {

            @Override
            public KeySyncParcel isMethod() {
                return isNameExpr.isMethod();
            }

            @Override
            public void isMethod(ImportKeyResult isParameter) {
                isNameExpr.isMethod(isMethod()).isMethod();
            }

            @Override
            public void isMethod() {
            }

            @Override
            public void isMethod(ImportKeyResult isParameter) {
                isNameExpr.isMethod(isMethod()).isMethod();
            }

            @Override
            public boolean isMethod(String isParameter, int isParameter, int isParameter) {
                return true;
            }
        };
        CryptoOperationHelper isVariable = new CryptoOperationHelper<>(isIntegerConstant, this, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod();
    }

    private void isMethod() {
        CryptoOperationHelper.Callback<BenchmarkInputParcel, BenchmarkResult> isVariable = new CryptoOperationHelper.Callback<BenchmarkInputParcel, BenchmarkResult>() {

            @Override
            public BenchmarkInputParcel isMethod() {
                // isComment
                return isNameExpr.isMethod();
            }

            @Override
            public void isMethod(BenchmarkResult isParameter) {
                isNameExpr.isMethod(isMethod()).isMethod();
            }

            @Override
            public void isMethod() {
            }

            @Override
            public void isMethod(BenchmarkResult isParameter) {
                isNameExpr.isMethod(isMethod()).isMethod();
            }

            @Override
            public boolean isMethod(String isParameter, int isParameter, int isParameter) {
                return true;
            }
        };
        CryptoOperationHelper isVariable = new CryptoOperationHelper<>(isIntegerConstant, this, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod(int isParameter, int isParameter, Intent isParameter) {
        switch(isNameExpr) {
            case isNameExpr:
                {
                    if (isNameExpr != null) {
                        isNameExpr.isMethod();
                    }
                    if (isNameExpr != null && isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                        OperationResult isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                        isNameExpr.isMethod(isMethod()).isMethod();
                    } else {
                        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
                    }
                    break;
                }
            case isNameExpr:
                {
                    // isComment
                    if (isNameExpr != null && isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                        OperationResult isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                        isNameExpr.isMethod(isMethod()).isMethod();
                    } else {
                        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
                    }
                    break;
                }
            case isNameExpr:
                {
                    if (isNameExpr != null && isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                        OperationResult isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                        isNameExpr.isMethod(isMethod()).isMethod();
                    } else {
                        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
                    }
                    break;
                }
        }
    }

    @Override
    public void isMethod(int isParameter) {
        ObjectAnimator isVariable = isNameExpr.isMethod(isNameExpr, "isStringConstant", isIntegerConstant, -isNameExpr);
        // isComment
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod() {
        ObjectAnimator isVariable = isNameExpr.isMethod(isNameExpr, "isStringConstant", isIntegerConstant);
        // isComment
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod();
    }
}
