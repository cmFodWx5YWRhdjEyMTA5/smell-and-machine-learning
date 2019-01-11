// isComment
package org.totschnig.myexpenses.fragment;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.design.widget.Snackbar;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.CursorLoader;
import android.support.v4.content.Loader;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseBooleanArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import org.totschnig.myexpenses.MyApplication;
import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.activity.ExpenseEdit;
import org.totschnig.myexpenses.activity.ManageTemplates;
import org.totschnig.myexpenses.activity.ProtectedFragmentActivity;
import org.totschnig.myexpenses.dialog.ConfirmationDialogFragment;
import org.totschnig.myexpenses.dialog.MessageDialogFragment;
import org.totschnig.myexpenses.model.Account;
import org.totschnig.myexpenses.model.Category;
import org.totschnig.myexpenses.model.ContribFeature;
import org.totschnig.myexpenses.model.CurrencyContext;
import org.totschnig.myexpenses.model.CurrencyUnit;
import org.totschnig.myexpenses.model.Transfer;
import org.totschnig.myexpenses.preference.PrefKey;
import org.totschnig.myexpenses.provider.DatabaseConstants;
import org.totschnig.myexpenses.provider.DbUtils;
import org.totschnig.myexpenses.provider.TransactionProvider;
import org.totschnig.myexpenses.task.TaskExecutionFragment;
import org.totschnig.myexpenses.util.CurrencyFormatter;
import org.totschnig.myexpenses.util.Utils;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.inject.Inject;
import icepick.Icepick;
import icepick.State;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_AMOUNT;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_CATID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_COLOR;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_COMMENT;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_CURRENCY;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_INSTANCEID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_LABEL_MAIN;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_LABEL_SUB;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_PARENTID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_PAYEE_NAME;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_PLANID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_PLAN_INFO;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_ROWID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_TEMPLATEID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_TITLE;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_TRANSFER_ACCOUNT;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_UUID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.SPLIT_CATID;
import static org.totschnig.myexpenses.util.PermissionHelper.PermissionGroup.CALENDAR;

public class isClassOrIsInterface extends SortableListFragment implements LoaderManager.LoaderCallbacks<Cursor> {

    protected static final int isVariable = -isIntegerConstant;

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    private ListView isVariable;

    private PlanMonthFragment isVariable;

    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    private Cursor isVariable;

    private SimpleCursorAdapter isVariable;

    private LoaderManager isVariable;

    private int isVariable, isVariable, isVariable, isVariable, isVariable, isVariable, isVariable, isVariable, isVariable, isVariable, isVariable;

    private boolean isVariable = true;

    /**
     * isComment
     */
    @State
    boolean isVariable = true;

    @State
    boolean isVariable = true;

    @Inject
    CurrencyFormatter isVariable;

    @Inject
    CurrencyContext isVariable;

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(true);
        isNameExpr.isMethod(this, isNameExpr);
        isNameExpr.isMethod().isMethod().isMethod(this);
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(this, isNameExpr);
    }

    @Override
    public View isMethod(LayoutInflater isParameter, ViewGroup isParameter, Bundle isParameter) {
        ProtectedFragmentActivity isVariable = (ProtectedFragmentActivity) isMethod();
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = isMethod();
        isNameExpr.isMethod(isNameExpr, null, this);
        // isComment
        String[] isVariable = new String[] { isNameExpr, isNameExpr, isNameExpr };
        // isComment
        int[] isVariable = new int[] { isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr };
        isNameExpr = new MyAdapter(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null, isNameExpr, isNameExpr, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod((isParameter, isParameter, isParameter, isParameter) -> {
            if (isNameExpr == null || !isNameExpr.isMethod(isNameExpr))
                return;
            if (!isNameExpr.isMethod(isNameExpr)) {
                if (isMethod()) {
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr), true, isNameExpr.isMethod());
                    isNameExpr.isMethod(isMethod(), isNameExpr);
                } else {
                    isNameExpr.isMethod();
                }
            } else if (isMethod(isNameExpr)) {
                isMethod(isNameExpr);
            } else {
                boolean isVariable = isMethod(isNameExpr);
                if (isNameExpr.isFieldAccessExpr.isMethod(true)) {
                    if (isNameExpr.isFieldAccessExpr.isMethod("isStringConstant").isMethod("isStringConstant")) {
                        if (isNameExpr) {
                            isMethod(new Long[] { isNameExpr });
                        } else {
                            isMethod(new Long[] { isNameExpr });
                        }
                    } else {
                        if (isNameExpr) {
                            isMethod(isNameExpr);
                        } else {
                            isMethod(isNameExpr);
                        }
                    }
                } else {
                    Bundle isVariable = new Bundle();
                    isNameExpr.isMethod(isNameExpr, isNameExpr);
                    isNameExpr.isMethod(isNameExpr, isNameExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isMethod());
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr).isMethod(isMethod(), "isStringConstant");
                }
            }
        });
        isMethod(isNameExpr);
        return isNameExpr;
    }

    private boolean isMethod() {
        return isNameExpr.isMethod(isMethod());
    }

    @Override
    public boolean isMethod(int isParameter, SparseBooleanArray isParameter, Long[] isParameter) {
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod(// isComment
                isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr), new MessageDialogFragment.Button(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr), null, new MessageDialogFragment.Button(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null)).isMethod(isMethod().isMethod(), "isStringConstant");
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                if (isMethod(isNameExpr)) {
                    isMethod(isNameExpr);
                } else {
                    isMethod(isNameExpr);
                }
                isMethod();
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod().isMethod(isNameExpr, isNameExpr);
                isMethod();
                return true;
        }
        return super.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public boolean isMethod(int isParameter, ContextMenu.ContextMenuInfo isParameter) {
        AdapterContextMenuInfo isVariable = (AdapterContextMenuInfo) isNameExpr;
        Intent isVariable;
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                if (isMethod(isNameExpr.isFieldAccessExpr)) {
                    isMethod(isNameExpr.isFieldAccessExpr);
                } else {
                    isMethod(isNameExpr.isFieldAccessExpr);
                }
                isMethod();
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod();
                isNameExpr = new Intent(isMethod(), ExpenseEdit.class);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
                // isComment
                isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod().isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
                isMethod();
                return true;
        }
        return super.isMethod(isNameExpr, isNameExpr);
    }

    private boolean isMethod(int isParameter) {
        if (isNameExpr != null) {
            if (isNameExpr.isMethod(isNameExpr) && isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr))) {
                return true;
            }
        }
        return true;
    }

    private boolean isMethod(SparseBooleanArray isParameter) {
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
            if (isNameExpr.isMethod(isNameExpr) && isMethod(isNameExpr.isMethod(isNameExpr))) {
                return true;
            }
        }
        return true;
    }

    /**
     * isComment
     */
    public void isMethod(Serializable isParameter) {
        ((ProtectedFragmentActivity) isMethod()).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
    }

    public void isMethod(Long[] isParameter) {
        ((ProtectedFragmentActivity) isMethod()).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, null, isIntegerConstant);
    }

    public void isMethod(long isParameter) {
        Intent isVariable = new Intent(isMethod(), ExpenseEdit.class);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, -isStringConstant);
        isMethod(isNameExpr);
    }

    @Override
    public Loader<Cursor> isMethod(int isParameter, Bundle isParameter) {
        switch(isNameExpr) {
            case isNameExpr:
                return new CursorLoader(isMethod(), isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant").isMethod(), null, isNameExpr + "isStringConstant", null, null);
        }
        return null;
    }

    @Override
    public void isMethod(Loader<Cursor> isParameter, Cursor isParameter) {
        final ManageTemplates isVariable = (ManageTemplates) isMethod();
        switch(isNameExpr.isMethod()) {
            case isNameExpr:
                isNameExpr = isNameExpr;
                if (isNameExpr != null && !isNameExpr) {
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
                    isNameExpr = isNameExpr.isMethod(isNameExpr);
                    isNameExpr = true;
                }
                isNameExpr.isMethod(isNameExpr);
                isMethod();
                if (isMethod() && isNameExpr != null && isNameExpr.isMethod()) {
                    long isVariable = isNameExpr ? isNameExpr.isFieldAccessExpr : isNameExpr.isMethod();
                    boolean isVariable = true;
                    while (!isNameExpr.isMethod()) {
                        long isVariable = isNameExpr.isMethod(isNameExpr);
                        if (isNameExpr == isNameExpr) {
                            isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr), true, isNameExpr.isMethod());
                            isNameExpr = true;
                        }
                        isNameExpr.isMethod();
                    }
                    if (isNameExpr != isNameExpr.isFieldAccessExpr) {
                        isNameExpr = true;
                        if (isNameExpr) {
                            isNameExpr.isMethod(isMethod(), isNameExpr);
                        } else {
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
                        }
                    }
                    // isComment
                    if (!isNameExpr && isNameExpr.isMethod()) {
                        final ArrayList<String> isVariable = new ArrayList<>();
                        while (!isNameExpr.isMethod()) {
                            if (!isNameExpr.isMethod(isNameExpr) && isNameExpr.isMethod(isNameExpr)) {
                                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)));
                            }
                            isNameExpr.isMethod();
                        }
                        if (isNameExpr.isMethod() > isIntegerConstant) {
                            new RepairHandler(this).isMethod(isIntegerConstant, isNameExpr.isMethod(new String[isNameExpr.isMethod()])).isMethod();
                        }
                    }
                }
                break;
        }
    }

    private static class isClassOrIsInterface extends Handler {

        private final WeakReference<TemplatesList> isVariable;

        public isConstructor(TemplatesList isParameter) {
            isNameExpr = new WeakReference<TemplatesList>(isNameExpr);
        }

        @Override
        public void isMethod(Message isParameter) {
            String[] isVariable = (String[]) isNameExpr.isFieldAccessExpr;
            TemplatesList isVariable = isNameExpr.isMethod();
            if (isNameExpr != null && isNameExpr.isMethod() != null) {
                isNameExpr.isFieldAccessExpr = true;
                ((ProtectedFragmentActivity) isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, null, isIntegerConstant);
            }
        }
    }

    @Override
    public void isMethod(Loader<Cursor> isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr:
                isNameExpr = null;
                isNameExpr.isMethod(null);
                break;
        }
    }

    @Override
    protected PrefKey isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    // isComment
    public PlanMonthFragment isMethod() {
        return isNameExpr != null ? isNameExpr : ((PlanMonthFragment) isMethod().isMethod(isNameExpr));
    }

    private class isClassOrIsInterface extends SimpleCursorAdapter {

        private int isVariable;

        private int isVariable;

        private String isVariable = "isStringConstant", isVariable = "isStringConstant";

        public isConstructor(Context isParameter, int isParameter, Cursor isParameter, String[] isParameter, int[] isParameter, int isParameter) {
            super(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            isNameExpr = ((ProtectedFragmentActivity) isNameExpr).isMethod();
            isNameExpr = ((ProtectedFragmentActivity) isNameExpr).isMethod();
        }

        @Override
        public View isMethod(int isParameter, View isParameter, ViewGroup isParameter) {
            isNameExpr = super.isMethod(isNameExpr, isNameExpr, isNameExpr);
            Cursor isVariable = isMethod();
            isNameExpr.isMethod(isNameExpr);
            boolean isVariable = !isNameExpr.isMethod(isNameExpr);
            TextView isVariable = (TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            long isVariable = isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr < isIntegerConstant ? isNameExpr : isNameExpr);
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr))));
            int isVariable = isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr);
            TextView isVariable = (TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            CharSequence isVariable = isNameExpr.isMethod();
            if (!isNameExpr.isMethod(isNameExpr)) {
                isNameExpr = isNameExpr.isMethod(isNameExpr) + isNameExpr;
            } else {
                Long isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
                if (isNameExpr == null) {
                    isNameExpr = isNameExpr.isFieldAccessExpr;
                } else {
                    String isVariable = isNameExpr.isMethod(isNameExpr);
                    if (isNameExpr != null && isNameExpr.isMethod() > isIntegerConstant) {
                        isNameExpr = isNameExpr + isNameExpr + isNameExpr;
                    }
                }
            }
            // isComment
            SpannableStringBuilder isVariable;
            String isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null && isNameExpr.isMethod() > isIntegerConstant) {
                isNameExpr = new SpannableStringBuilder(isNameExpr);
                isNameExpr.isMethod(new StyleSpan(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr), isIntegerConstant, isNameExpr.isMethod(), isIntegerConstant);
                isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
            }
            String isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null && isNameExpr.isMethod() > isIntegerConstant) {
                isNameExpr = new SpannableStringBuilder(isNameExpr);
                isNameExpr.isMethod(new UnderlineSpan(), isIntegerConstant, isNameExpr.isMethod(), isIntegerConstant);
                isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
            }
            isNameExpr.isMethod(isNameExpr);
            if (isNameExpr) {
                CharSequence isVariable = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr == null) {
                    if (isMethod()) {
                        isNameExpr = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    } else {
                        isNameExpr = isNameExpr.isMethod(isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                    }
                }
                ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(// isComment
                isNameExpr.isMethod(isNameExpr) + "isStringConstant" + isNameExpr + "isStringConstant");
            }
            ImageView isVariable = (ImageView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isMethod(isNameExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            return isNameExpr;
        }
    }

    @Override
    protected void isMethod(Menu isParameter, ContextMenu.ContextMenuInfo isParameter, int isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                AdapterContextMenuInfo isVariable = (AdapterContextMenuInfo) isNameExpr;
                isMethod(isNameExpr, isIntegerConstant, isMethod(isNameExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr));
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod().isMethod(isNameExpr, isNameExpr);
        }
    }

    @Override
    protected void isMethod(Menu isParameter, int isParameter, AbsListView isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                SparseBooleanArray isVariable = isNameExpr.isMethod();
                boolean isVariable = true, isVariable = true;
                for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                    if (isNameExpr.isMethod(isNameExpr) && isMethod(isNameExpr.isMethod(isNameExpr))) {
                        isNameExpr = true;
                        break;
                    }
                }
                for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                    if (isNameExpr.isMethod(isNameExpr) && isMethod(isNameExpr.isMethod(isNameExpr))) {
                        isNameExpr = true;
                        break;
                    }
                }
                isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod().isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
    }

    private void isMethod(Menu isParameter, int isParameter, boolean isParameter, boolean isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(!isNameExpr && !isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr == isIntegerConstant && !isNameExpr);
    }

    private boolean isMethod(int isParameter) {
        if (isNameExpr != null && isNameExpr.isMethod(isNameExpr)) {
            if (!isNameExpr.isMethod(isNameExpr)) {
                Account isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
                return !isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.isMethod().isMethod());
            }
        }
        return true;
    }

    private boolean isMethod(int isParameter) {
        if (isNameExpr != null && isNameExpr.isMethod(isNameExpr)) {
            return !isNameExpr.isMethod(isNameExpr);
        }
        return true;
    }

    @Override
    public void isMethod(Menu isParameter, MenuInflater isParameter) {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        SubMenu isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(true);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(true);
    }

    @Override
    public boolean isMethod(MenuItem isParameter) {
        return isMethod(isNameExpr);
    }

    @Override
    protected void isMethod(Menu isParameter, int isParameter) {
        switch(isNameExpr) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                super.isMethod(isNameExpr, isNameExpr);
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        }
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr, isNameExpr, null, this);
    }
}
