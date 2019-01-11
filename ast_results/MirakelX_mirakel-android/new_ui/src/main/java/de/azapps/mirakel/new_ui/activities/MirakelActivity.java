// isComment
package de.azapps.mirakel.new_ui.activities;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.afollestad.materialdialogs.AlertDialogWrapper;
import com.google.common.base.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import butterknife.ButterKnife;
import butterknife.InjectView;
import de.azapps.mirakel.settings.custom_views.ChangelogDialog;
import de.azapps.ilovefs.ILoveFS;
import de.azapps.material_elements.ActionBarActivity;
import de.azapps.material_elements.utils.AnimationHelper;
import de.azapps.material_elements.utils.MenuHelper;
import de.azapps.material_elements.utils.ThemeManager;
import de.azapps.mirakel.DefinitionsHelper;
import de.azapps.mirakel.adapter.OnItemClickedListener;
import de.azapps.mirakel.adapter.SimpleModelListAdapter;
import de.azapps.mirakel.analytics.AnalyticsWrapper;
import de.azapps.mirakel.helper.AnalyticsWrapperBase;
import de.azapps.mirakel.helper.Helpers;
import de.azapps.mirakel.helper.MirakelCommonPreferences;
import de.azapps.mirakel.helper.MirakelModelPreferences;
import de.azapps.mirakel.helper.SharingHelper;
import de.azapps.mirakel.helper.TaskHelper;
import de.azapps.mirakel.helper.error.ErrorReporter;
import de.azapps.mirakel.helper.error.ErrorType;
import de.azapps.mirakel.model.generic.ModelBase;
import de.azapps.mirakel.model.account.AccountMirakel;
import de.azapps.mirakel.model.list.ListMirakel;
import de.azapps.mirakel.model.list.ListMirakelInterface;
import de.azapps.mirakel.model.query_builder.MirakelQueryBuilder;
import de.azapps.mirakel.model.semantic.Semantic;
import de.azapps.mirakel.model.task.Task;
import de.azapps.mirakel.model.task.TaskOverview;
import de.azapps.mirakel.new_ui.fragments.ListsFragment;
import de.azapps.mirakel.new_ui.fragments.TaskFragment;
import de.azapps.mirakel.new_ui.fragments.TasksFragment;
import de.azapps.mirakel.new_ui.helper.ListDialogHelpers;
import de.azapps.mirakel.new_ui.search.SearchListMirakel;
import de.azapps.mirakel.new_ui.views.SearchView;
import de.azapps.mirakel.settings.SettingsActivity;
import de.azapps.mirakel.settings.custom_views.Settings;
import de.azapps.mirakelandroid.R;
import de.azapps.tools.Log;
import de.azapps.tools.OptionalUtils;
import static com.google.common.base.Optional.absent;
import static com.google.common.base.Optional.fromNullable;
import static com.google.common.base.Optional.of;
import static de.azapps.tools.OptionalUtils.Procedure;
import static de.azapps.tools.OptionalUtils.withOptional;

public class isClassOrIsInterface extends ActionBarActivity implements OnItemClickedListener<ModelBase>, LockableDrawer {

    private static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    private Optional<DrawerLayout> isVariable = isMethod();

    private Optional<ActionBarDrawerToggle> isVariable = isMethod();

    private TaskFragment isVariable;

    class isClassOrIsInterface {

        @butterknife.Optional
        @InjectView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        ViewFlipper isVariable;

        @InjectView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        @NonNull
        Spinner isVariable;

        @butterknife.Optional
        @InjectView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        @Nullable
        TextView isVariable;

        @InjectView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
        SearchView isVariable;

        private isConstructor(final View isParameter) {
            isNameExpr.isMethod(this, isNameExpr);
        }
    }

    private ActionBarViewHolder isVariable;

    @NonNull
    @InjectView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    Toolbar isVariable;

    // isComment
    // isComment
    private TasksFragment isMethod() {
        return (TasksFragment) isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    private ListsFragment isMethod() {
        return (ListsFragment) isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    // isComment
    // isComment
    @Override
    protected void isMethod(final Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(this);
        isMethod();
        isMethod(isMethod());
        if ((isMethod() != null) && (isMethod().isMethod() != null)) {
            isMethod(isNameExpr);
            isMethod();
        }
        isMethod();
        if (isNameExpr != null) {
            isMethod(isNameExpr);
        }
    }

    @Override
    protected Locale isMethod() {
        return isNameExpr.isMethod(this);
    }

    private void isMethod() {
        // isComment
        if (isNameExpr.isMethod(this)) {
            isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr);
        }
        final ILoveFS isVariable = new ILoveFS(this, "isStringConstant", isNameExpr.isFieldAccessExpr);
        if (isNameExpr.isMethod()) {
            isNameExpr.isFieldAccessExpr = new DialogInterface.OnClickListener() {

                @Override
                public void isMethod(final DialogInterface isParameter, final int isParameter) {
                    final Intent isVariable = new Intent(isNameExpr.this, SettingsActivity.class);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isMethod());
                    isMethod(isNameExpr);
                }
            };
            isNameExpr.isMethod();
        }
    }

    @Override
    protected void isMethod(final Bundle isParameter) {
        super.isMethod(isNameExpr);
        // isComment
        isMethod(isNameExpr, new Procedure<ActionBarDrawerToggle>() {

            @Override
            public void isMethod(final ActionBarDrawerToggle isParameter) {
                isNameExpr.isMethod();
            }
        });
    }

    @Override
    public void isMethod(final Configuration isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr, new Procedure<ActionBarDrawerToggle>() {

            @Override
            public void isMethod(final ActionBarDrawerToggle isParameter) {
                isNameExpr.isMethod(isNameExpr);
            }
        });
    }

    @Override
    protected void isMethod(final Intent isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    /*isComment*/
    @Override
    public boolean isMethod(final Menu isParameter) {
        isNameExpr.isMethod();
        final int isVariable;
        if (isNameExpr.isMethod()) {
            // isComment
            final boolean isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr);
            if (isNameExpr) {
                isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
                isNameExpr = isIntegerConstant;
            } else {
                isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
                isNameExpr = isIntegerConstant;
            }
        } else {
            isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
            isNameExpr = isIntegerConstant;
        }
        if ((isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) != null) && (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) != null)) {
            // isComment
            boolean isVariable = isMethod() != null && isMethod().isMethod() instanceof SearchListMirakel;
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(!isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr);
        }
        if ((isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) != null) && !isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(true);
        }
        isNameExpr.isMethod(this, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isIntegerConstant, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        return true;
    }

    @Override
    public boolean isMethod(final MenuItem isParameter) {
        // isComment
        if (isNameExpr.isMethod()) {
            // isComment
            if (isNameExpr.isMethod().isMethod(isNameExpr)) {
                return true;
            }
        }
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                final Intent isVariable = new Intent(this, SettingsActivity.class);
                isMethod(isNameExpr);
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod().isMethod(isNameExpr.isMethod());
                return true;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isNameExpr.isMethod(this, isMethod().isMethod());
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod().isMethod();
                isMethod();
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                isMethod().isMethod(isMethod().isMethod());
                isMethod();
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                ListMirakelInterface isVariable = isMethod().isMethod();
                if (isNameExpr instanceof ListMirakel) {
                    isNameExpr.isMethod(this, (ListMirakel) isNameExpr, new Helpers.ExecInterface() {

                        @Override
                        public void isMethod() {
                            isMethod().isMethod();
                        }
                    }, null);
                } else {
                    throw new IllegalArgumentException("isStringConstant");
                }
                break;
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                Bundle isVariable = new Bundle();
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
                final List<AccountMirakel> isVariable = new MirakelQueryBuilder(this).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod()).isMethod(AccountMirakel.class);
                for (final AccountMirakel isVariable : isNameExpr) {
                    isMethod().isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr, isNameExpr);
                }
        }
        return super.isMethod(isNameExpr);
    }

    // isComment
    // isComment
    private void isMethod(final ListMirakel isParameter) {
        final FragmentManager isVariable = isMethod();
        final FragmentTransaction isVariable = isNameExpr.isMethod();
        final TasksFragment isVariable = isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod();
    }

    private synchronized void isMethod(@Nullable final Intent isParameter) {
        if ((isNameExpr == null) || (isNameExpr.isMethod() == null)) {
            return;
        }
        if (!isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr)) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod());
        }
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr:
                final Optional<Task> isVariable = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr.isMethod()) {
                    isMethod(isNameExpr.isMethod().isMethod());
                    isMethod(isNameExpr.isMethod());
                }
                break;
            case isNameExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr:
                isMethod(isNameExpr);
                break;
            case isNameExpr.isFieldAccessExpr:
            case isNameExpr.isFieldAccessExpr:
                if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                    isMethod((ListMirakel) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
                } else {
                    isNameExpr.isMethod(isNameExpr, "isStringConstant");
                }
                break;
            case isNameExpr.isFieldAccessExpr:
                if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                    isMethod((ListMirakel) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
                    isMethod().isMethod();
                } else {
                    isNameExpr.isMethod(isNameExpr, "isStringConstant");
                }
                break;
            case isNameExpr.isFieldAccessExpr:
                // isComment
                break;
        }
        if (isMethod().isMethod() == null) {
            isMethod(isNameExpr.isMethod());
        }
    }

    private void isMethod(@NonNull final Intent isParameter) {
        String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        // isComment
        if ((isNameExpr.isMethod() != null) && isNameExpr.isMethod().isMethod("isStringConstant") && !isNameExpr.isMethod()) {
            isNameExpr = isNameExpr;
            isNameExpr = "isStringConstant";
        }
        if (!"isStringConstant".isMethod(isNameExpr.isMethod()) && (isNameExpr == null)) {
            isNameExpr = isNameExpr.isMethod();
        }
        if (isNameExpr == null) {
            isNameExpr = "isStringConstant";
        }
        final Optional<ListMirakel> isVariable = isNameExpr.isMethod();
        if (isNameExpr.isMethod()) {
            final Task isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, true);
            isMethod(isNameExpr, isNameExpr);
        } else {
            final Task isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, true);
            final AlertDialogWrapper.Builder isVariable = new AlertDialogWrapper.Builder(this);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            final List<String> isVariable = new ArrayList<>();
            final List<Long> isVariable = new ArrayList<>();
            final int isVariable = isIntegerConstant;
            for (final ListMirakel isVariable : isNameExpr.isMethod()) {
                if (isNameExpr.isMethod() > isIntegerConstant) {
                    isNameExpr.isMethod(isNameExpr.isMethod());
                    isNameExpr.isMethod(isNameExpr.isMethod());
                }
            }
            isNameExpr.isMethod(isNameExpr.isMethod(new String[isNameExpr.isMethod()]), isNameExpr, new DialogInterface.OnClickListener() {

                @Override
                public void isMethod(final DialogInterface isParameter, final int isParameter) {
                    final Optional<ListMirakel> isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
                    if (isNameExpr.isMethod()) {
                        try {
                            isNameExpr.isMethod(isNameExpr.isMethod());
                            final Task isVariable = isNameExpr.isMethod();
                            isMethod(isNameExpr, new OptionalUtils.Procedure<ListMirakel>() {

                                @Override
                                public void isMethod(final ListMirakel isParameter) {
                                    isMethod(isNameExpr, isNameExpr);
                                    isNameExpr.isMethod();
                                }
                            });
                            isMethod(isNameExpr.isMethod());
                        } catch (DefinitionsHelper.NoSuchListException isParameter) {
                            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                        }
                    }
                }
            });
            isNameExpr.isMethod().isMethod();
        }
    }

    private void isMethod(@NonNull final Task isParameter, @NonNull final Intent isParameter) {
        final String isVariable = isNameExpr.isMethod();
        final String isVariable = isNameExpr.isMethod();
        if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr) && (isNameExpr != null)) {
            final Uri isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(this, isNameExpr);
        } else if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr) && (isNameExpr != null)) {
            final List<Uri> isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            for (final Uri isVariable : isNameExpr) {
                isNameExpr.isMethod(this, isNameExpr);
            }
        }
    }

    private void isMethod() {
        // isComment
        isNameExpr = isMethod((DrawerLayout) isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr, new Procedure<DrawerLayout>() {

            @Override
            public void isMethod(final DrawerLayout isParameter) {
                final ActionBarDrawerToggle isVariable = new DrawerToggle(isNameExpr);
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
                isNameExpr.this.isFieldAccessExpr = isMethod(isNameExpr);
            }
        });
    }

    @Override
    public void isMethod() {
        isMethod(isNameExpr, new Procedure<DrawerLayout>() {

            @Override
            public void isMethod(final DrawerLayout isParameter) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
        });
    }

    @Override
    public void isMethod() {
        isMethod(isNameExpr, new Procedure<DrawerLayout>() {

            @Override
            public void isMethod(final DrawerLayout isParameter) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
        });
    }

    public enum ActionBarState {

        NORMAL(isIntegerConstant), SWITCHER(isIntegerConstant), EMPTY(isIntegerConstant);

        private final int isVariable;

        isConstructor(final int isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        public int isMethod() {
            return isNameExpr;
        }
    }

    public void isMethod(final ActionBarState isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod());
            if ((isNameExpr == isNameExpr.isFieldAccessExpr) && (isNameExpr.isFieldAccessExpr != null)) {
                isNameExpr.isFieldAccessExpr.isMethod(isMethod().isMethod().isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
        }
    }

    @Override
    public void isMethod() {
        super.isMethod();
        if (isNameExpr.isFieldAccessExpr != null) {
            ((SimpleModelListAdapter<AccountMirakel>) isNameExpr.isFieldAccessExpr.isMethod()).isMethod(null);
        }
    }

    private void isMethod() {
        isMethod(null);
        final View isVariable = isNameExpr.isMethod(this).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, true);
        isNameExpr = new ActionBarViewHolder(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        final Cursor isVariable = isNameExpr.isMethod();
        final SimpleModelListAdapter<AccountMirakel> isVariable = new SimpleModelListAdapter<>(this, isNameExpr, isIntegerConstant, AccountMirakel.class, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        isNameExpr.isFieldAccessExpr.isMethod(new AdapterView.OnItemSelectedListener() {

            @Override
            public void isMethod(final AdapterView<?> isParameter, final View isParameter, final int isParameter, final long isParameter) {
                final AccountMirakel isVariable = isNameExpr.isMethod(isNameExpr);
                isMethod().isMethod(isMethod(isNameExpr));
            }

            @Override
            public void isMethod(final AdapterView<?> isParameter) {
            // isComment
            }
        });
        if (isNameExpr.isFieldAccessExpr != null) {
            isNameExpr.isFieldAccessExpr.isMethod(isMethod().isMethod().isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
    }

    @Override
    public void isMethod(@NonNull final ModelBase isParameter) {
        if (isNameExpr instanceof Task) {
            isMethod((Task) isNameExpr);
        } else if (isNameExpr instanceof TaskOverview) {
            final Optional<Task> isVariable = ((TaskOverview) isNameExpr).isMethod();
            if (isNameExpr.isMethod()) {
                isMethod(isNameExpr.isMethod());
            } else {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
        } else if (isNameExpr instanceof ListMirakel) {
            isMethod((ListMirakel) isNameExpr);
        } else {
            throw new IllegalArgumentException("isStringConstant" + isNameExpr.isMethod().isMethod());
        }
    }

    @Override
    public void isMethod(final int isParameter, final int isParameter, final Intent isParameter) {
        if ((isNameExpr == isNameExpr.isFieldAccessExpr || isNameExpr == isNameExpr.isFieldAccessExpr) && (isNameExpr == isNameExpr.isFieldAccessExpr)) {
            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
    }

    private void isMethod(ListMirakel isParameter) {
        isMethod(isNameExpr);
        isMethod(isNameExpr, new Procedure<DrawerLayout>() {

            @Override
            public void isMethod(final DrawerLayout isParameter) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
        });
    }

    private void isMethod(final Task isParameter) {
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isMethod(), isNameExpr);
    }

    public void isMethod(final int isParameter) {
        final FloatingActionButton isVariable = isMethod().isFieldAccessExpr;
        isNameExpr.isMethod(this, isNameExpr, isNameExpr);
    }

    public void isMethod(final int isParameter) {
        final FloatingActionButton isVariable = isMethod().isFieldAccessExpr;
        isNameExpr.isMethod(this, isNameExpr, isNameExpr);
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = (TaskFragment) isMethod().isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(this);
        }
    }

    private class isClassOrIsInterface extends ActionBarDrawerToggle {

        public isConstructor(DrawerLayout isParameter) {
            super(isNameExpr.this, isNameExpr, isNameExpr.this.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }

        /**
         * isComment
         */
        @Override
        public void isMethod(final View isParameter) {
            super.isMethod(isNameExpr);
            isNameExpr.isMethod(isMethod());
            // isComment
            isMethod();
            isMethod().isMethod();
            isMethod(isNameExpr.isFieldAccessExpr);
            isMethod();
        }

        /**
         * isComment
         */
        @Override
        public void isMethod(final View isParameter) {
            super.isMethod(isNameExpr);
            isNameExpr.isMethod(isMethod());
            // isComment
            isMethod();
            isMethod(isNameExpr.isFieldAccessExpr);
            isMethod();
        }
    }
}
