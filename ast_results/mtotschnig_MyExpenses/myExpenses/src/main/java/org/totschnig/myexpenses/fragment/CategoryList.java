// isComment
package org.totschnig.myexpenses.fragment;

import android.app.Activity;
import android.app.SearchManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.view.MenuItemCompat;
import android.text.TextUtils;
import android.util.SparseBooleanArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.ExpandableListContextMenuInfo;
import android.widget.SearchView;
import android.widget.TextView;
import com.squareup.sqlbrite3.BriteContentResolver;
import com.squareup.sqlbrite3.QueryObservable;
import com.squareup.sqlbrite3.SqlBrite;
import org.apache.commons.lang3.ArrayUtils;
import org.totschnig.myexpenses.MyApplication;
import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.activity.CategoryActivity;
import org.totschnig.myexpenses.activity.ProtectedFragmentActivity;
import org.totschnig.myexpenses.adapter.CategoryTreeAdapter;
import org.totschnig.myexpenses.adapter.CategoryTreeBaseAdapter;
import org.totschnig.myexpenses.dialog.MessageDialogFragment;
import org.totschnig.myexpenses.dialog.SelectMainCategoryDialogFragment;
import org.totschnig.myexpenses.preference.PrefKey;
import org.totschnig.myexpenses.provider.DatabaseConstants;
import org.totschnig.myexpenses.provider.TransactionProvider;
import org.totschnig.myexpenses.task.TaskExecutionFragment;
import org.totschnig.myexpenses.util.CurrencyFormatter;
import org.totschnig.myexpenses.util.Utils;
import org.totschnig.myexpenses.viewmodel.data.Category;
import java.util.ArrayList;
import java.util.Arrays;
import javax.inject.Inject;
import butterknife.BindView;
import butterknife.ButterKnife;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import timber.log.Timber;
import static android.app.Activity.RESULT_FIRST_USER;
import static android.app.Activity.RESULT_OK;
import static org.totschnig.myexpenses.activity.ManageCategories.ACTION_MANAGE;
import static org.totschnig.myexpenses.activity.ManageCategories.ACTION_SELECT_FILTER;
import static org.totschnig.myexpenses.activity.ManageCategories.ACTION_SELECT_MAPPING;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_CATID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_COLOR;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_LABEL;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_LABEL_NORMALIZED;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_PARENTID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_ROWID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.TABLE_CATEGORIES;
import static org.totschnig.myexpenses.provider.DatabaseConstants.TABLE_TEMPLATES;
import static org.totschnig.myexpenses.provider.DatabaseConstants.TABLE_TRANSACTIONS;

public class isClassOrIsInterface extends SortableListFragment {

    public static final String isVariable = "isStringConstant";

    protected BriteContentResolver isVariable;

    private Disposable isVariable;

    protected static final String isVariable = isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";

    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    protected CategoryTreeBaseAdapter isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    ExpandableListView isVariable;

    @Nullable
    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    TextView isVariable;

    @Nullable
    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    TextView isVariable;

    @Nullable
    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    View isVariable;

    protected boolean isVariable = true;

    protected int isVariable = -isIntegerConstant;

    String isVariable;

    @Inject
    CurrencyFormatter isVariable;

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(true);
        isNameExpr.isMethod().isMethod().isMethod(this);
        isNameExpr = new SqlBrite.Builder().isMethod().isMethod(isMethod().isMethod(), isNameExpr.isMethod());
    }

    @Override
    public View isMethod(@NonNull LayoutInflater isParameter, ViewGroup isParameter, Bundle isParameter) {
        final ProtectedFragmentActivity isVariable = (ProtectedFragmentActivity) isMethod();
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        isNameExpr.isMethod(this, isNameExpr);
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        }
        final View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr = new CategoryTreeAdapter(isNameExpr, isNameExpr, null, isMethod(), true, isMethod().isMethod(isNameExpr));
        isNameExpr.isMethod(isNameExpr);
        isMethod();
        isMethod(isNameExpr);
        return isNameExpr;
    }

    @Override
    public void isMethod() {
        super.isMethod();
        isMethod();
    }

    protected void isMethod() {
    }

    protected void isMethod() {
        isMethod();
        isNameExpr = isMethod().isMethod(isParameter -> {
            final Cursor isVariable = isNameExpr.isMethod();
            if (isMethod() != null) {
                isMethod().isMethod(() -> {
                    isNameExpr.isMethod(isNameExpr);
                    isMethod();
                });
            }
        });
    }

    protected QueryObservable isMethod() {
        String isVariable = null;
        String[] isVariable;
        String isVariable = isNameExpr;
        String[] isVariable = new String[] { isNameExpr, isNameExpr, isNameExpr, isNameExpr, // isComment
        "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr, "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr };
        boolean isVariable = !isNameExpr.isMethod(isNameExpr);
        if (isNameExpr) {
            String isVariable = isNameExpr + "isStringConstant";
            isNameExpr = new String[] { "isStringConstant" + isNameExpr + "isStringConstant", "isStringConstant" + isNameExpr + "isStringConstant" };
            isNameExpr = isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
        } else {
            isNameExpr = null;
        }
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr, isNameExpr, null, true);
    }

    private void isMethod() {
        if (isNameExpr != null && !isNameExpr.isMethod()) {
            isNameExpr.isMethod();
        }
    }

    @Override
    public boolean isMethod(int isParameter, SparseBooleanArray isParameter, Long[] isParameter) {
        ProtectedFragmentActivity isVariable = (ProtectedFragmentActivity) isMethod();
        ArrayList<Long> isVariable;
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                {
                    int isVariable = isIntegerConstant, isVariable = isIntegerConstant, isVariable = isIntegerConstant;
                    isNameExpr = new ArrayList<>();
                    for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                        Category isVariable;
                        if (isNameExpr.isMethod(isNameExpr)) {
                            boolean isVariable = true;
                            int isVariable = isNameExpr.isMethod(isNameExpr);
                            long isVariable = isNameExpr.isMethod(isNameExpr);
                            int isVariable = isNameExpr.isMethod(isNameExpr);
                            int isVariable = isNameExpr.isMethod(isNameExpr), isVariable = isNameExpr.isMethod(isNameExpr);
                            if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                                isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
                            } else {
                                isNameExpr = isNameExpr.isMethod(isNameExpr);
                            }
                            Bundle isVariable = isNameExpr.isMethod().isMethod();
                            if ((isNameExpr != null && isNameExpr.isMethod(isNameExpr) == isNameExpr.isFieldAccessExpr) || isNameExpr.isFieldAccessExpr) {
                                isNameExpr++;
                                isNameExpr = true;
                            } else if (isNameExpr.isFieldAccessExpr) {
                                isNameExpr++;
                                isNameExpr = true;
                            }
                            if (isNameExpr) {
                                if (isNameExpr == isNameExpr.isFieldAccessExpr && isNameExpr.isMethod()) {
                                    isNameExpr++;
                                }
                                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                            }
                        }
                    }
                    if (!isNameExpr.isMethod()) {
                        Long[] isVariable = isNameExpr.isMethod(new Long[isNameExpr.isMethod()]);
                        if (isNameExpr > isIntegerConstant) {
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr), new MessageDialogFragment.Button(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr), null, new MessageDialogFragment.Button(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null)).isMethod(isNameExpr.isMethod(), "isStringConstant");
                        } else {
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
                        }
                    }
                    if (isNameExpr > isIntegerConstant || isNameExpr > isIntegerConstant) {
                        String isVariable = "isStringConstant";
                        if (isNameExpr > isIntegerConstant) {
                            isNameExpr += isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
                        }
                        if (isNameExpr > isIntegerConstant) {
                            isNameExpr += isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
                        }
                        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
                    }
                    return true;
                }
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                {
                    if (isNameExpr.isFieldAccessExpr == isIntegerConstant || isNameExpr.isMethod(isNameExpr).isMethod(-isStringConstant) == -isIntegerConstant) {
                        ArrayList<String> isVariable = new ArrayList<>();
                        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                            Category isVariable;
                            if (isNameExpr.isMethod(isNameExpr)) {
                                int isVariable = isNameExpr.isMethod(isNameExpr);
                                long isVariable = isNameExpr.isMethod(isNameExpr);
                                int isVariable = isNameExpr.isMethod(isNameExpr);
                                int isVariable = isNameExpr.isMethod(isNameExpr), isVariable = isNameExpr.isMethod(isNameExpr);
                                if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                                    isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
                                } else {
                                    isNameExpr = isNameExpr.isMethod(isNameExpr);
                                }
                                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                            }
                        }
                        Intent isVariable = new Intent();
                        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
                        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod("isStringConstant", isNameExpr));
                        isNameExpr.isMethod(isNameExpr, isNameExpr);
                        isNameExpr.isMethod();
                    } else {
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
                    }
                    return true;
                }
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                final Long[] isVariable;
                final boolean isVariable = isNameExpr == isNameExpr.isFieldAccessExpr;
                if (isNameExpr) {
                    isNameExpr = isNameExpr;
                } else {
                    isNameExpr = new ArrayList<>();
                    for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                        if (isNameExpr.isMethod(isNameExpr)) {
                            int isVariable = isNameExpr.isMethod(isNameExpr);
                            long isVariable = isNameExpr.isMethod(isNameExpr);
                            int isVariable = isNameExpr.isMethod(isNameExpr);
                            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr).isFieldAccessExpr);
                        }
                    }
                    isNameExpr = isNameExpr.isMethod(new Long[isNameExpr.isMethod()]);
                }
                Bundle isVariable = new Bundle(isIntegerConstant);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, !isNameExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr));
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr));
                isNameExpr.isMethod(isNameExpr).isMethod(isMethod(), "isStringConstant");
                return true;
        }
        return true;
    }

    @Override
    public boolean isMethod(int isParameter, ContextMenu.ContextMenuInfo isParameter) {
        CategoryActivity isVariable = (CategoryActivity) isMethod();
        String isVariable = isMethod();
        ExpandableListContextMenuInfo isVariable = (ExpandableListContextMenuInfo) isNameExpr;
        int isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        Category isVariable;
        boolean isVariable;
        int isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
            isNameExpr = true;
        } else {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
            isNameExpr = true;
        }
        String isVariable = isNameExpr.isFieldAccessExpr;
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod(isNameExpr);
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                if (!isNameExpr && isNameExpr.isMethod(isNameExpr)) {
                    isNameExpr = isNameExpr.isMethod(isNameExpr).isFieldAccessExpr + isNameExpr.isFieldAccessExpr + isNameExpr;
                }
                isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
                isMethod();
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                return true;
        }
        return super.isMethod(isNameExpr, isNameExpr);
    }

    protected PrefKey isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public void isMethod(Menu isParameter, MenuInflater isParameter) {
        if (isMethod() == null)
            return;
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        SearchManager isVariable = (SearchManager) isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        SearchView isVariable = (SearchView) isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(isMethod().isMethod()));
        // isComment
        isNameExpr.isMethod(new SearchView.OnQueryTextListener() {

            @Override
            public boolean isMethod(String isParameter) {
                return true;
            }

            @Override
            public boolean isMethod(String isParameter) {
                if (isNameExpr.isMethod(isNameExpr)) {
                    isNameExpr = "isStringConstant";
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                } else {
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
                    // isComment
                    // isComment
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                }
                isMethod();
                isMethod();
                return true;
            }
        });
    }

    @Override
    public void isMethod(Menu isParameter) {
        super.isMethod(isNameExpr);
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null && isNameExpr != null) {
            SearchView isVariable = (SearchView) isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr, true);
            isNameExpr.isMethod(true);
            isNameExpr.isMethod();
        }
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        return isMethod(isNameExpr);
    }

    public void isMethod() {
        int isVariable = isNameExpr.isMethod();
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) isNameExpr.isMethod(isNameExpr);
    }

    /*isComment*/
    @Override
    public boolean isMethod(ExpandableListView isParameter, View isParameter, int isParameter, int isParameter, long isParameter) {
        if (super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr))
            return true;
        if (isMethod() == null) {
            return true;
        }
        String isVariable = isMethod();
        if (isNameExpr.isMethod(isNameExpr)) {
            return true;
        }
        String isVariable = ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod().isMethod();
        if (isNameExpr.isMethod(isNameExpr)) {
            isNameExpr = isNameExpr.isMethod(isNameExpr).isFieldAccessExpr + isNameExpr.isFieldAccessExpr + isNameExpr;
        }
        isMethod(isNameExpr, isNameExpr, true);
        return true;
    }

    @Override
    public boolean isMethod(ExpandableListView isParameter, View isParameter, int isParameter, long isParameter) {
        if (super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr))
            return true;
        if (isMethod() == null) {
            return true;
        }
        String isVariable = isMethod();
        if (isNameExpr.isMethod(isNameExpr) || isNameExpr.isMethod(isNameExpr).isMethod()) {
            return true;
        }
        String isVariable = ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod().isMethod();
        isMethod(isNameExpr, isNameExpr, true);
        return true;
    }

    protected void isMethod(long isParameter, String isParameter, boolean isParameter) {
        Activity isVariable = isMethod();
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod();
    }

    public void isMethod() {
        // isComment
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
        isNameExpr = -isIntegerConstant;
        isMethod();
    }

    @Override
    public void isMethod(@NonNull Bundle isParameter) {
        super.isMethod(isNameExpr);
        if (!isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isMethod("isStringConstant", isNameExpr);
        }
    }

    @Override
    protected void isMethod(Menu isParameter, ContextMenu.ContextMenuInfo isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        boolean isVariable = true;
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            ExpandableListContextMenuInfo isVariable = (ExpandableListContextMenuInfo) isNameExpr;
            int isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr = isMethod(isNameExpr);
        }
        isMethod(isNameExpr, isNameExpr);
    }

    @Override
    protected void isMethod(Menu isParameter, int isParameter, AbsListView isParameter) {
        boolean isVariable = true;
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            SparseBooleanArray isVariable = isNameExpr.isMethod();
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                if (isNameExpr.isMethod(isNameExpr)) {
                    int isVariable = isNameExpr.isMethod(isNameExpr);
                    long isVariable = isNameExpr.isMethod(isNameExpr);
                    int isVariable = isNameExpr.isMethod(isNameExpr);
                    if (isMethod(isNameExpr)) {
                        isNameExpr = true;
                        break;
                    }
                }
            }
        }
        isMethod(isNameExpr, isNameExpr);
    }

    private boolean isMethod(int isParameter) {
        return isNameExpr != -isIntegerConstant && isNameExpr.isMethod(isNameExpr).isMethod();
    }

    protected void isMethod(Menu isParameter, boolean isParameter) {
        String isVariable = isMethod();
        final boolean isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr);
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr, !isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), !isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), (isNameExpr || isNameExpr));
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), !isMethod());
    }

    protected void isMethod(MenuItem isParameter, boolean isParameter) {
        if (isNameExpr) {
            isNameExpr.isMethod(true);
        }
    }

    public void isMethod(boolean isParameter) {
        isNameExpr = isNameExpr;
        isMethod();
    }

    private boolean isMethod() {
        return isMethod().isMethod(isNameExpr);
    }

    private String isMethod() {
        return ((CategoryActivity) isMethod()).isMethod();
    }
}
