// isComment
package org.totschnig.myexpenses.fragment;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.support.v4.graphics.drawable.DrawableCompat;
import android.support.v4.util.LongSparseArray;
import android.text.InputType;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.TextView;
import com.github.lzyzsd.circleprogress.DonutProgress;
import org.apache.commons.lang3.ArrayUtils;
import org.threeten.bp.LocalDateTime;
import org.threeten.bp.ZoneId;
import org.threeten.bp.ZonedDateTime;
import org.threeten.bp.temporal.ChronoUnit;
import org.totschnig.myexpenses.MyApplication;
import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.activity.ExpenseEdit;
import org.totschnig.myexpenses.activity.ManageCategories;
import org.totschnig.myexpenses.activity.MyExpenses;
import org.totschnig.myexpenses.activity.ProtectedFragmentActivity;
import org.totschnig.myexpenses.adapter.TransactionAdapter;
import org.totschnig.myexpenses.dialog.AmountFilterDialog;
import org.totschnig.myexpenses.dialog.ConfirmationDialogFragment;
import org.totschnig.myexpenses.dialog.DateFilterDialog;
import org.totschnig.myexpenses.dialog.SelectCrStatusDialogFragment;
import org.totschnig.myexpenses.dialog.SelectMethodDialogFragment;
import org.totschnig.myexpenses.dialog.SelectPayerDialogFragment;
import org.totschnig.myexpenses.dialog.SelectTransferAccountDialogFragment;
import org.totschnig.myexpenses.dialog.TransactionDetailFragment;
import org.totschnig.myexpenses.model.Account;
import org.totschnig.myexpenses.model.AccountType;
import org.totschnig.myexpenses.model.ContribFeature;
import org.totschnig.myexpenses.model.CurrencyContext;
import org.totschnig.myexpenses.model.Grouping;
import org.totschnig.myexpenses.model.Transaction.CrStatus;
import org.totschnig.myexpenses.model.Transfer;
import org.totschnig.myexpenses.preference.PrefHandler;
import org.totschnig.myexpenses.preference.PrefKey;
import org.totschnig.myexpenses.provider.DatabaseConstants;
import org.totschnig.myexpenses.provider.DbUtils;
import org.totschnig.myexpenses.provider.TransactionProvider;
import org.totschnig.myexpenses.provider.filter.AmountCriteria;
import org.totschnig.myexpenses.provider.filter.CategoryCriteria;
import org.totschnig.myexpenses.provider.filter.CommentCriteria;
import org.totschnig.myexpenses.provider.filter.CrStatusCriteria;
import org.totschnig.myexpenses.provider.filter.Criteria;
import org.totschnig.myexpenses.provider.filter.DateCriteria;
import org.totschnig.myexpenses.provider.filter.MethodCriteria;
import org.totschnig.myexpenses.provider.filter.NullCriteria;
import org.totschnig.myexpenses.provider.filter.PayeeCriteria;
import org.totschnig.myexpenses.provider.filter.TransferCriteria;
import org.totschnig.myexpenses.provider.filter.WhereFilter;
import org.totschnig.myexpenses.task.TaskExecutionFragment;
import org.totschnig.myexpenses.util.AppDirHelper;
import org.totschnig.myexpenses.util.CurrencyFormatter;
import org.totschnig.myexpenses.util.Result;
import org.totschnig.myexpenses.util.Utils;
import org.totschnig.myexpenses.util.crashreporting.CrashHandler;
import org.totschnig.myexpenses.viewmodel.TransactionListViewModel;
import java.util.Locale;
import javax.inject.Inject;
import butterknife.BindView;
import butterknife.ButterKnife;
import eltos.simpledialogfragment.input.SimpleInputDialog;
import se.emilsjolander.stickylistheaders.ExpandableStickyListHeadersListView;
import se.emilsjolander.stickylistheaders.StickyListHeadersAdapter;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView.OnHeaderClickListener;
import static org.totschnig.myexpenses.preference.PrefKey.NEW_SPLIT_TEMPLATE_ENABLED;
import static org.totschnig.myexpenses.provider.DatabaseConstants.HAS_TRANSFERS;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_ACCOUNTID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_AMOUNT;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_CATID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_COMMENT;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_CR_STATUS;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_CURRENCY;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_DATE;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_DAY;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_EXCLUDE_FROM_TOTALS;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_HAS_TRANSFERS;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_LABEL;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_LABEL_MAIN;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_LABEL_SUB;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_MAPPED_CATEGORIES;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_MAPPED_METHODS;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_MAPPED_PAYEES;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_METHODID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_MONTH;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_PARENTID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_PAYEEID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_PAYEE_NAME;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_ROWID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_SECOND_GROUP;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_SUM_EXPENSES;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_SUM_INCOME;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_SUM_TRANSFERS;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_TRANSFER_ACCOUNT;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_TRANSFER_PEER_PARENT;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_WEEK;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_YEAR;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_YEAR_OF_MONTH_START;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_YEAR_OF_WEEK_START;
import static org.totschnig.myexpenses.provider.DatabaseConstants.MAPPED_CATEGORIES;
import static org.totschnig.myexpenses.provider.DatabaseConstants.MAPPED_METHODS;
import static org.totschnig.myexpenses.provider.DatabaseConstants.MAPPED_PAYEES;
import static org.totschnig.myexpenses.provider.DatabaseConstants.SPLIT_CATID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.TABLE_ACCOUNTS;
import static org.totschnig.myexpenses.task.TaskExecutionFragment.KEY_LONG_IDS;
import static org.totschnig.myexpenses.util.ColorUtils.getContrastColor;

public class isClassOrIsInterface extends ContextualActionBarFragment implements LoaderManager.LoaderCallbacks<Cursor>, OnHeaderClickListener {

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    private WhereFilter isVariable = isNameExpr.isMethod();

    private static final int isVariable = isIntegerConstant;

    private static final int isVariable = isIntegerConstant;

    private static final int isVariable = isIntegerConstant;

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant", isVariable = "isStringConstant";

    private MyGroupedAdapter isVariable;

    private boolean isVariable;

    private boolean isVariable;

    private boolean isVariable;

    private boolean isVariable;

    private boolean isVariable;

    private boolean isVariable;

    private Cursor isVariable;

    private Parcelable isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    ExpandableStickyListHeadersListView isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    TextView isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    ViewGroup isVariable;

    private LoaderManager isVariable;

    /**
     * isComment
     */
    private LongSparseArray<Long[]> isVariable = new LongSparseArray<>();

    /**
     * isComment
     */
    private SparseBooleanArray isVariable;

    private int isVariable, isVariable, isVariable, isVariable, isVariable, isVariable, isVariable, isVariable, isVariable, isVariable;

    private boolean isVariable = true;

    // isComment
    private Account isVariable;

    private TransactionListViewModel isVariable;

    @Inject
    CurrencyFormatter isVariable;

    @Inject
    PrefHandler isVariable;

    @Inject
    CurrencyContext isVariable;

    public static Fragment isMethod(long isParameter) {
        TransactionList isVariable = new TransactionList();
        Bundle isVariable = new Bundle();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr;
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(true);
        isNameExpr = isNameExpr.isMethod(this).isMethod(TransactionListViewModel.class);
        isNameExpr.isMethod().isMethod(this, isParameter -> {
            isNameExpr = isNameExpr;
            isMethod();
            isMethod();
            isNameExpr.isMethod(isNameExpr, isNameExpr, null, isNameExpr.this);
            isNameExpr.isMethod(isNameExpr, isNameExpr, null, isNameExpr.this);
        });
        isNameExpr.isMethod(isMethod().isMethod(isNameExpr));
        isNameExpr.isMethod().isMethod().isMethod(this);
        isNameExpr = (isNameExpr != null);
    }

    @Override
    public void isMethod(@Nullable Bundle isParameter) {
        super.isMethod(isNameExpr);
    }

    private void isMethod() {
        if (isNameExpr != null) {
            Context isVariable = isMethod();
            if (isNameExpr == null) {
                isNameExpr = new MyGroupedAdapter(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null, isIntegerConstant);
            } else {
                isNameExpr.isMethod(isNameExpr);
            }
            if (isNameExpr.isMethod() == null) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
    }

    private void isMethod() {
        isNameExpr.isMethod();
        isMethod();
    }

    private void isMethod() {
        if (isNameExpr == null) {
            // isComment
            isNameExpr = isMethod();
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr, null, this);
    }

    @Override
    public View isMethod(@NonNull LayoutInflater isParameter, ViewGroup isParameter, Bundle isParameter) {
        final MyExpenses isVariable = (MyExpenses) isMethod();
        isNameExpr = isMethod();
        // isComment
        if (isNameExpr != null) {
            isNameExpr = new WhereFilter(isNameExpr.isMethod(isNameExpr));
        } else {
            isMethod();
        }
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        isNameExpr.isMethod(this, isNameExpr);
        isMethod();
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod((isParameter, isParameter, isParameter, isParameter) -> {
            FragmentManager isVariable = isNameExpr.isMethod();
            DialogFragment isVariable = (DialogFragment) isNameExpr.isMethod(TransactionDetailFragment.class.isMethod());
            if (isNameExpr == null) {
                FragmentTransaction isVariable = isNameExpr.isMethod();
                isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr, TransactionDetailFragment.class.isMethod());
            }
        });
        isMethod(isNameExpr.isMethod());
        return isNameExpr;
    }

    protected void isMethod(boolean isParameter) {
        isNameExpr.isMethod(isNameExpr, null, this);
        isNameExpr.isMethod(isNameExpr, null, this);
        if (isNameExpr) {
            isMethod().isMethod();
        }
    }

    @Override
    public void isMethod() {
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod().isMethod();
        }
        super.isMethod();
    }

    @Override
    public boolean isMethod(int isParameter, SparseBooleanArray isParameter, Long[] isParameter) {
        MyExpenses isVariable = (MyExpenses) isMethod();
        FragmentManager isVariable = isMethod();
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                {
                    boolean isVariable = true, isVariable = true;
                    for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                        if (isNameExpr.isMethod(isNameExpr)) {
                            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
                            CrStatus isVariable;
                            try {
                                isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
                            } catch (IllegalArgumentException isParameter) {
                                isNameExpr = isNameExpr.isFieldAccessExpr;
                            }
                            if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                                isNameExpr = true;
                            }
                            if (isNameExpr != isNameExpr.isFieldAccessExpr) {
                                isNameExpr = true;
                            }
                            if (isNameExpr && isNameExpr)
                                break;
                        }
                    }
                    String isVariable = isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
                    if (isNameExpr) {
                        isNameExpr += "isStringConstant" + isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    }
                    Bundle isVariable = new Bundle();
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    if (isNameExpr) {
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    }
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr));
                    isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr, "isStringConstant");
                    return true;
                }
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr));
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                {
                    Bundle isVariable = new Bundle();
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
                    isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr, "isStringConstant");
                    return true;
                }
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, null, isIntegerConstant);
                break;
        }
        return super.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(int isParameter, ContextMenu.ContextMenuInfo isParameter) {
        AdapterContextMenuInfo isVariable = (AdapterContextMenuInfo) isNameExpr;
        MyExpenses isVariable = (MyExpenses) isMethod();
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                if (isNameExpr.isMethod(isNameExpr, isNameExpr) != null) {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
                } else {
                    Intent isVariable = new Intent(isNameExpr, ExpenseEdit.class);
                    isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
                    if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
                    }
                    isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
                }
                // isComment
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                if (isMethod(isNameExpr.isFieldAccessExpr) && !isNameExpr.isMethod(isNameExpr, true)) {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, null);
                    return true;
                }
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                String isVariable = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr.isMethod(isNameExpr))
                    isNameExpr = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr.isMethod(isNameExpr))
                    isNameExpr = isNameExpr.isMethod(isNameExpr);
                Bundle isVariable = new Bundle();
                isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(true).isMethod(isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr).isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod().isMethod(this, isNameExpr);
                return true;
        }
        return super.isMethod(isNameExpr, isNameExpr);
    }

    @NonNull
    @Override
    public Loader<Cursor> isMethod(int isParameter, Bundle isParameter) {
        CursorLoader isVariable = null;
        String isVariable;
        String[] isVariable;
        if (isNameExpr.isMethod()) {
            isNameExpr = "isStringConstant";
            isNameExpr = null;
        } else if (isNameExpr.isMethod()) {
            isNameExpr = isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
            isNameExpr = new String[] { isNameExpr.isMethod().isMethod() };
        } else {
            isNameExpr = isNameExpr + "isStringConstant";
            isNameExpr = new String[] { isNameExpr.isMethod(isNameExpr.isMethod()) };
        }
        switch(isNameExpr) {
            case isNameExpr:
                if (!isNameExpr.isMethod()) {
                    String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    if (!isNameExpr.isMethod("isStringConstant")) {
                        if (!isNameExpr.isMethod(isNameExpr)) {
                            isNameExpr += "isStringConstant";
                        }
                        isNameExpr += isNameExpr;
                        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(true));
                    }
                }
                if (!isNameExpr.isMethod(isNameExpr)) {
                    isNameExpr += "isStringConstant";
                }
                isNameExpr += isNameExpr + "isStringConstant";
                isNameExpr = new CursorLoader(isMethod(), isNameExpr.isMethod(true), isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr + "isStringConstant" + isNameExpr.isMethod().isMethod());
                break;
            // isComment
            case isNameExpr:
                isNameExpr = new CursorLoader(isMethod(), isNameExpr.isFieldAccessExpr, new String[] { isNameExpr, isNameExpr, isNameExpr, isNameExpr }, isNameExpr, isNameExpr, null);
                break;
            case isNameExpr:
                isNameExpr = null;
                isNameExpr = null;
                Builder isVariable = isNameExpr.isFieldAccessExpr.isMethod();
                if (!isNameExpr.isMethod()) {
                    // isComment
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    if (!isNameExpr.isMethod("isStringConstant")) {
                        isNameExpr = isNameExpr.isMethod(true);
                    }
                }
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod().isMethod());
                if (!isNameExpr.isMethod()) {
                    if (isNameExpr.isMethod()) {
                        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod().isMethod());
                    } else {
                        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isMethod()));
                    }
                }
                isNameExpr = new CursorLoader(isMethod(), isNameExpr.isMethod(), null, isNameExpr, isNameExpr, null);
                break;
        }
        return isNameExpr;
    }

    @Override
    public void isMethod(@NonNull Loader<Cursor> isParameter, Cursor isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr:
                isNameExpr = isNameExpr;
                isNameExpr = isNameExpr.isMethod() > isIntegerConstant;
                if (!isNameExpr) {
                    isNameExpr = isNameExpr.isMethod(isNameExpr);
                    isNameExpr = isNameExpr.isMethod(isNameExpr);
                    isNameExpr = isNameExpr.isMethod(isNameExpr);
                    isNameExpr = isNameExpr.isMethod(isNameExpr);
                    isNameExpr = isNameExpr.isMethod(isNameExpr);
                    isNameExpr = isNameExpr.isMethod(isNameExpr);
                    isNameExpr = isNameExpr.isMethod(isNameExpr);
                    isNameExpr = isNameExpr.isMethod(isNameExpr);
                    isNameExpr = isNameExpr.isMethod(isNameExpr);
                    isNameExpr = isNameExpr.isMethod(isNameExpr);
                    isNameExpr = true;
                }
                isNameExpr.isMethod(isNameExpr);
                if (isNameExpr.isMethod() > isIntegerConstant) {
                    if (isNameExpr) {
                        if (isNameExpr != null) {
                            isNameExpr.isMethod(() -> {
                                isNameExpr.isMethod().isMethod(isNameExpr);
                                isNameExpr = null;
                            });
                        }
                    } else {
                        isNameExpr = true;
                        if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true)) {
                            isNameExpr.isMethod(() -> isNameExpr.isMethod(isMethod(isNameExpr)));
                        }
                    }
                }
                isMethod();
                break;
            case isNameExpr:
                isNameExpr.isMethod();
                isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)) > isIntegerConstant;
                isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)) > isIntegerConstant;
                isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)) > isIntegerConstant;
                isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)) > isIntegerConstant;
                isMethod().isMethod();
                break;
            case isNameExpr:
                int isVariable = isNameExpr.isMethod(isNameExpr);
                int isVariable = isNameExpr.isMethod(isNameExpr);
                int isVariable = isNameExpr.isMethod(isNameExpr);
                int isVariable = isNameExpr.isMethod(isNameExpr);
                int isVariable = isNameExpr.isMethod(isNameExpr);
                int isVariable = isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod();
                if (isNameExpr.isMethod()) {
                    long isVariable = isNameExpr.isFieldAccessExpr.isMethod();
                    do {
                        long isVariable = isNameExpr.isMethod(isNameExpr);
                        long isVariable = isNameExpr.isMethod(isNameExpr);
                        long isVariable = isNameExpr.isMethod(isNameExpr);
                        long isVariable = isNameExpr + isNameExpr + isNameExpr;
                        long isVariable = isNameExpr + isNameExpr;
                        long isVariable = isNameExpr.isMethod(isNameExpr);
                        isNameExpr.isMethod(isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr)), new Long[] { isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr });
                        isNameExpr = isNameExpr;
                    } while (isNameExpr.isMethod());
                }
                // isComment
                if (isNameExpr != null)
                    isNameExpr.isMethod();
        }
    }

    private int isMethod(Cursor isParameter) {
        int isVariable = isNameExpr.isMethod(isNameExpr);
        switch(isNameExpr.isMethod()) {
            case isNameExpr:
                long isVariable = isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod()).isMethod();
                if (isNameExpr.isMethod()) {
                    do {
                        if (isNameExpr.isMethod(isNameExpr) <= isNameExpr) {
                            return isNameExpr.isMethod() ? isNameExpr.isMethod() : isNameExpr.isMethod() + isIntegerConstant;
                        }
                    } while (isNameExpr.isMethod());
                }
                break;
            case isNameExpr:
                long isVariable = isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr).isMethod(isIntegerConstant), isNameExpr.isMethod()).isMethod();
                if (isNameExpr.isMethod()) {
                    do {
                        if (isNameExpr.isMethod(isNameExpr) < isNameExpr) {
                            return isNameExpr.isMethod();
                        }
                    } while (isNameExpr.isMethod());
                }
        }
        return isIntegerConstant;
    }

    private long isMethod(int isParameter, int isParameter) {
        if (isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr)) {
            return isIntegerConstant;
        }
        return isNameExpr * isIntegerConstant + isNameExpr;
    }

    @Override
    public void isMethod(@NonNull Loader<Cursor> isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr:
                isNameExpr = null;
                isNameExpr.isMethod(null);
                isNameExpr = true;
                break;
            case isNameExpr:
                isNameExpr = true;
                isNameExpr = true;
                isNameExpr = true;
                break;
        }
    }

    public boolean isMethod() {
        return !isNameExpr.isMethod();
    }

    public boolean isMethod() {
        return isNameExpr;
    }

    public boolean isMethod() {
        return isNameExpr;
    }

    private class isClassOrIsInterface extends TransactionAdapter implements StickyListHeadersAdapter {

        private LayoutInflater isVariable;

        private isConstructor(Context isParameter, int isParameter, Cursor isParameter, int isParameter) {
            super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            isNameExpr = isNameExpr.isMethod(isMethod());
        }

        @Override
        public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
            HeaderViewHolder isVariable;
            if (isNameExpr == null) {
                final int isVariable = !isNameExpr.isMethod() || isNameExpr.isMethod() == null || !isNameExpr.isFieldAccessExpr.isMethod(isNameExpr) ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, true);
                isNameExpr = new HeaderViewHolder(isNameExpr);
                isNameExpr.isMethod(isNameExpr);
            } else {
                isNameExpr = (HeaderViewHolder) isNameExpr.isMethod();
            }
            Cursor isVariable = isMethod();
            isNameExpr.isMethod(isNameExpr);
            isMethod(isNameExpr, isMethod(isNameExpr));
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod().isMethod(isMethod(), isNameExpr.isMethod(isMethod()), isMethod(isNameExpr), isNameExpr));
            return isNameExpr;
        }

        @SuppressLint("isStringConstant")
        private void isMethod(HeaderViewHolder isParameter, long isParameter) {
            Long[] isVariable = isNameExpr != null ? isNameExpr.isMethod(isNameExpr) : null;
            if (isNameExpr != null) {
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + isNameExpr.isMethod(isNameExpr[isIntegerConstant], isNameExpr.isMethod()));
                final Long isVariable = -isNameExpr[isIntegerConstant];
                isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod()));
                isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr.isMethod(isNameExpr[isIntegerConstant], isNameExpr.isMethod()));
                String isVariable = isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr[isIntegerConstant]) > -isIntegerConstant ? "isStringConstant" : "isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr[isIntegerConstant]), isNameExpr.isMethod()));
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr[isIntegerConstant]), isNameExpr.isMethod());
                isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod() && !isNameExpr.isMethod() ? isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr[isIntegerConstant], isNameExpr.isMethod()), isNameExpr, isNameExpr.isMethod(isNameExpr[isIntegerConstant], isNameExpr.isMethod())) : isNameExpr);
                if (isNameExpr.isFieldAccessExpr != null) {
                    long isVariable = isNameExpr.isMethod().isMethod();
                    int isVariable = isNameExpr > isNameExpr || isNameExpr == isIntegerConstant ? isIntegerConstant : isNameExpr.isMethod(isNameExpr * isDoubleConstant / isNameExpr);
                    isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
                    isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(isNameExpr));
                    isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr.isFieldAccessExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr));
                }
            }
        }

        @Override
        public long isMethod(int isParameter) {
            Cursor isVariable = isMethod();
            isNameExpr.isMethod(isNameExpr);
            return isMethod(isNameExpr.isMethod(isMethod()), isMethod(isNameExpr));
        }

        private int isMethod(Cursor isParameter) {
            switch(isNameExpr.isMethod()) {
                case isNameExpr:
                    return isNameExpr.isMethod(isNameExpr);
                case isNameExpr:
                    return isNameExpr.isMethod(isNameExpr);
                case isNameExpr:
                    return isNameExpr.isMethod(isNameExpr);
                default:
                    return isIntegerConstant;
            }
        }

        private int isMethod() {
            switch(isNameExpr.isMethod()) {
                case isNameExpr:
                    return isNameExpr;
                case isNameExpr:
                    return isNameExpr;
                default:
                    return isNameExpr;
            }
        }
    }

    class isClassOrIsInterface {

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        TextView isVariable;

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        TextView isVariable;

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        TextView isVariable;

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        TextView isVariable;

        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        TextView isVariable;

        @Nullable
        @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        DonutProgress isVariable;

        isConstructor(View isParameter) {
            isNameExpr.isMethod(this, isNameExpr);
        }
    }

    @Override
    public void isMethod(StickyListHeadersListView isParameter, View isParameter, int isParameter, long isParameter, boolean isParameter) {
        if (isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isMethod(isNameExpr);
        } else {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    @Override
    public boolean isMethod(StickyListHeadersListView isParameter, View isParameter, int isParameter, long isParameter, boolean isParameter) {
        MyExpenses isVariable = (MyExpenses) isMethod();
        if (isNameExpr != null && isNameExpr.isMethod(isNameExpr)[isIntegerConstant] > isIntegerConstant) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        } else {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        }
        return true;
    }

    @Override
    protected void isMethod(Menu isParameter, ContextMenuInfo isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        AdapterContextMenuInfo isVariable = (AdapterContextMenuInfo) isNameExpr;
        final boolean isVariable = isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr, isMethod(isNameExpr.isFieldAccessExpr), !isNameExpr, isIntegerConstant);
    }

    @Override
    protected void isMethod(Menu isParameter, int isParameter, AbsListView isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        SparseBooleanArray isVariable = isNameExpr.isMethod();
        boolean isVariable = true, isVariable = true, isVariable = true;
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
            if (isNameExpr.isMethod(isNameExpr))
                if (isMethod(isNameExpr.isMethod(isNameExpr))) {
                    isNameExpr = true;
                } else {
                    isNameExpr = true;
                }
            if (isMethod(isNameExpr.isMethod(isNameExpr))) {
                isNameExpr = true;
                break;
            }
        }
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
            if (isNameExpr.isMethod(isNameExpr))
                if (isMethod(isNameExpr.isMethod(isNameExpr))) {
                    isNameExpr = true;
                    break;
                }
        }
        isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    private boolean isMethod(int isParameter) {
        if (isNameExpr != null) {
            if (isNameExpr.isMethod(isNameExpr) && isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr))) {
                return true;
            }
        }
        return true;
    }

    private boolean isMethod(int isParameter) {
        if (isNameExpr != null) {
            if (isNameExpr.isMethod(isNameExpr)) {
                CrStatus isVariable;
                try {
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
                } catch (IllegalArgumentException isParameter) {
                    isNameExpr = isNameExpr.isFieldAccessExpr;
                }
                if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                    return true;
                }
            }
        }
        return true;
    }

    private void isMethod(Menu isParameter, boolean isParameter, boolean isParameter, boolean isParameter, int isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr == isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(!isNameExpr && !isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(!isNameExpr && !isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr == isIntegerConstant && !isNameExpr);
    }

    @SuppressLint("isStringConstant")
    public void isMethod() {
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod().isMethod().isMethod();
            isNameExpr.isMethod();
        }
    }

    public void isMethod() {
        if (isNameExpr != null) {
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                if (isNameExpr.isMethod(isNameExpr)) {
                    isNameExpr.isMethod().isMethod(isNameExpr.isMethod(isNameExpr), true);
                }
            }
        }
        isNameExpr = null;
    }

    public void isMethod(Integer isParameter, Criteria isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isMethod();
    }

    protected void isMethod() {
        isMethod(true);
        isMethod();
    }

    /**
     * isComment
     */
    public boolean isMethod(Integer isParameter) {
        Criteria isVariable = isNameExpr.isMethod(isNameExpr);
        boolean isVariable = isNameExpr != null;
        if (isNameExpr) {
            isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr));
            isNameExpr.isMethod(isNameExpr);
            isMethod();
        }
        return isNameExpr;
    }

    private String isMethod(String isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr, isNameExpr, isMethod().isMethod(isNameExpr));
    }

    public void isMethod() {
        for (int isVariable = isIntegerConstant, isVariable = isMethod().isMethod(); isNameExpr < isNameExpr; isNameExpr++) {
            isNameExpr.isMethod(isMethod(isMethod().isMethod(isNameExpr).isFieldAccessExpr));
        }
        isNameExpr.isMethod();
        isMethod();
    }

    @Override
    public void isMethod(Menu isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr == null || isMethod() == null) {
            // isComment
            return;
        }
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            Drawable isVariable = isNameExpr.isMethod();
            if (isNameExpr == null) {
                isNameExpr.isMethod("isStringConstant");
            }
            isNameExpr.isMethod(isNameExpr.isMethod() ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(!isNameExpr.isMethod());
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod() ? null : isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
            }
            if (!isNameExpr.isMethod()) {
                isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
            }
            isMethod().isMethod(isNameExpr.isMethod(isMethod()));
            SubMenu isVariable = isNameExpr.isMethod();
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                MenuItem isVariable = isNameExpr.isMethod(isNameExpr);
                boolean isVariable = true;
                switch(isNameExpr.isMethod()) {
                    case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                        isNameExpr = isNameExpr;
                        break;
                    case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                        isNameExpr = !isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr);
                        break;
                    case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                        isNameExpr = isNameExpr;
                        break;
                    case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                        isNameExpr = isNameExpr;
                        break;
                    case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                        isNameExpr = isNameExpr;
                        break;
                }
                Criteria isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
                isNameExpr.isMethod(isNameExpr, isNameExpr || isNameExpr != null);
                if (isNameExpr != null) {
                    isNameExpr.isMethod(true);
                    isNameExpr.isMethod(isNameExpr.isMethod(isMethod()));
                }
            }
        } else {
            isNameExpr.isMethod("isStringConstant");
        }
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            SubMenu isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        }
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            SubMenu isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        }
        MenuItem isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod() != isNameExpr.isFieldAccessExpr);
        }
    }

    @Override
    public void isMethod(@NonNull Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        int isVariable = isNameExpr.isMethod();
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                if (!isMethod(isNameExpr)) {
                    Intent isVariable = new Intent(isMethod(), ManageCategories.class);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
                }
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                if (!isMethod(isNameExpr)) {
                    isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isMethod().isMethod(), "isStringConstant");
                }
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                if (!isMethod(isNameExpr)) {
                    isNameExpr.isMethod().isMethod(isMethod().isMethod(), "isStringConstant");
                }
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                if (!isMethod(isNameExpr)) {
                    isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod().isMethod(this, isNameExpr);
                }
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                if (!isMethod(isNameExpr)) {
                    isNameExpr.isMethod().isMethod(isMethod().isMethod(), "isStringConstant");
                }
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                if (!isMethod(isNameExpr)) {
                    isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isMethod().isMethod(), "isStringConstant");
                }
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                if (!isMethod(isNameExpr)) {
                    isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isMethod().isMethod(), "isStringConstant");
                }
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                if (!isMethod(isNameExpr)) {
                    isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isMethod().isMethod(), "isStringConstant");
                }
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                MyExpenses isVariable = (MyExpenses) isMethod();
                Result isVariable = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr) {
                    if (isNameExpr.isMethod()) {
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, null);
                    } else {
                        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr.isFieldAccessExpr);
                    }
                } else {
                    isNameExpr.isMethod();
                }
                return true;
            default:
                return super.isMethod(isNameExpr);
        }
    }

    public SparseArray<Criteria> isMethod() {
        return isNameExpr.isMethod();
    }

    private void isMethod() {
        String isVariable = isNameExpr.isMethod(isMethod(isNameExpr), null);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr));
        }
        isNameExpr = isNameExpr.isMethod(isMethod(isNameExpr), null);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr));
        }
        isNameExpr = isNameExpr.isMethod(isMethod(isNameExpr), null);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr));
        }
        isNameExpr = isNameExpr.isMethod(isMethod(isNameExpr), null);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr));
        }
        isNameExpr = isNameExpr.isMethod(isMethod(isNameExpr), null);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr));
        }
        isNameExpr = isNameExpr.isMethod(isMethod(isNameExpr), null);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr));
        }
        isNameExpr = isNameExpr.isMethod(isMethod(isNameExpr), null);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr));
        }
        isNameExpr = isNameExpr.isMethod(isMethod(isNameExpr), null);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr));
        }
    }

    @Override
    public void isMethod(int isParameter, int isParameter, Intent isParameter) {
        if (isNameExpr == isNameExpr.isFieldAccessExpr && isNameExpr != isNameExpr.isFieldAccessExpr) {
            String isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                long isVariable = isNameExpr.isMethod(isNameExpr, isIntegerConstant);
                isMethod(isNameExpr, isNameExpr);
            }
            if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                long[] isVariable = isNameExpr.isMethod(isNameExpr);
                isMethod(isNameExpr, isNameExpr);
            }
        }
    }

    private void isMethod(String isParameter, long... isParameter) {
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr == isIntegerConstant && isNameExpr[isIntegerConstant] == -isIntegerConstant ? new NullCriteria(isNameExpr) : new CategoryCriteria(isNameExpr, isNameExpr));
    }
}
