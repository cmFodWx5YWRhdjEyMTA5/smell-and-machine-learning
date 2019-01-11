// isComment
package es.usc.citius.servando.calendula.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.content.ContextCompat;
import android.support.v4.util.ArrayMap;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.github.javiersantos.materialstyleddialogs.MaterialStyledDialog;
import com.github.javiersantos.materialstyleddialogs.enums.Style;
import com.mikepenz.community_material_typeface_library.CommunityMaterial;
import com.mikepenz.fastadapter.IItem;
import com.mikepenz.fastadapter.ISelectionListener;
import com.mikepenz.fastadapter.commons.adapters.FastItemAdapter;
import com.mikepenz.fastadapter.items.AbstractItem;
import com.mikepenz.fastadapter_extensions.utilities.SubItemUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import es.usc.citius.servando.calendula.CalendulaActivity;
import es.usc.citius.servando.calendula.R;
import es.usc.citius.servando.calendula.adapters.items.allergensearch.AllergenGroupItem;
import es.usc.citius.servando.calendula.adapters.items.allergensearch.AllergenGroupSubItem;
import es.usc.citius.servando.calendula.adapters.items.allergensearch.AllergenItem;
import es.usc.citius.servando.calendula.adapters.items.allergylist.AllergyGroupItem;
import es.usc.citius.servando.calendula.adapters.items.allergylist.AllergyGroupSubItem;
import es.usc.citius.servando.calendula.adapters.items.allergylist.AllergyItem;
import es.usc.citius.servando.calendula.allergies.AllergenConversionUtil;
import es.usc.citius.servando.calendula.allergies.AllergenFacade;
import es.usc.citius.servando.calendula.allergies.AllergenGroupWrapper;
import es.usc.citius.servando.calendula.allergies.AllergenVO;
import es.usc.citius.servando.calendula.database.DB;
import es.usc.citius.servando.calendula.persistence.AllergyGroup;
import es.usc.citius.servando.calendula.settings.CalendulaSettingsActivity;
import es.usc.citius.servando.calendula.util.IconUtils;
import es.usc.citius.servando.calendula.util.KeyboardUtils;
import es.usc.citius.servando.calendula.util.LogUtil;
import es.usc.citius.servando.calendula.util.PreferenceKeys;
import es.usc.citius.servando.calendula.util.PreferenceUtils;
import es.usc.citius.servando.calendula.util.Strings;

@SuppressWarnings("isStringConstant")
public class isClassOrIsInterface extends CalendulaActivity {

    public static final int isVariable = isIntegerConstant;

    private static final String isVariable = "isStringConstant";

    private final ISelectionListener<AbstractItem> isVariable = new AllergySelectionListener();

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected View isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected EditText isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected RecyclerView isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected TextView isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected LinearLayout isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected TextView isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected ProgressBar isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected FloatingActionButton isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected RelativeLayout isVariable;

    private FastItemAdapter<AbstractItem> isVariable;

    private List<AllergyGroup> isVariable;

    private DoSearchTask isVariable = null;

    private List<AllergenVO> isVariable;

    @Override
    public void isMethod() {
        isMethod();
    }

    /**
     * isComment
     */
    public boolean isMethod() {
        SharedPreferences isVariable = isNameExpr.isMethod().isMethod();
        boolean isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        if (!isNameExpr) {
            new MaterialStyledDialog.Builder(this).isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant)).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(true).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(true).isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(new MaterialDialog.SingleButtonCallback() {

                @Override
                public void isMethod(@NonNull MaterialDialog isParameter, @NonNull DialogAction isParameter) {
                    Intent isVariable = new Intent(isNameExpr.this, CalendulaSettingsActivity.class);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
                    isMethod();
                    isMethod(isNameExpr);
                }
            }).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(new MaterialDialog.SingleButtonCallback() {

                @Override
                public void isMethod(@NonNull MaterialDialog isParameter, @NonNull DialogAction isParameter) {
                    isNameExpr.isMethod();
                    isMethod();
                }
            }).isMethod();
        }
        return isNameExpr;
    }

    @OnClick(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    void isMethod() {
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant");
    }

    @OnClick(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    void isMethod() {
        isNameExpr.isMethod(true);
        Intent isVariable = new Intent();
        final List<AbstractItem> isVariable = isMethod();
        ArrayList<AllergenGroupWrapper> isVariable = new ArrayList<>();
        for (IItem isVariable : isNameExpr) {
            switch(isNameExpr.isMethod()) {
                case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                    final AllergenGroupSubItem isVariable = (AllergenGroupSubItem) isNameExpr;
                    isNameExpr.isMethod(new AllergenGroupWrapper(isNameExpr.isMethod(), isNameExpr.isMethod().isMethod()));
                    break;
                case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                    final AllergenItem isVariable = (AllergenItem) isNameExpr;
                    isNameExpr.isMethod(new AllergenGroupWrapper(isNameExpr.isMethod()));
                    break;
                default:
                    isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
                    break;
            }
        }
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isMethod();
    }

    @OnClick(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    void isMethod() {
        isMethod(isNameExpr.isFieldAccessExpr);
        isMethod();
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(this);
        int isVariable = isNameExpr.isMethod().isMethod(this).isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
        final boolean isVariable = isMethod();
        if (isNameExpr) {
            isMethod();
        }
    }

    private void isMethod() {
        // isComment
        isNameExpr = isNameExpr.isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod().isMethod(this));
        // isComment
        isMethod();
    }

    private void isMethod() {
        if (isNameExpr.isMethod() > isIntegerConstant) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        } else {
            if (isNameExpr.isMethod().isMethod().isMethod().isMethod() > isIntegerConstant) {
                isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            } else {
                isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            }
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
    }

    private void isMethod() {
        String isVariable = isNameExpr.isMethod().isMethod().isMethod();
        if (isNameExpr.isMethod() >= isIntegerConstant) {
            if (isNameExpr != null)
                isNameExpr.isMethod(true);
            isNameExpr = new DoSearchTask();
            isNameExpr.isMethod(new String[] { isNameExpr });
        }
    }

    private List<AbstractItem> isMethod() {
        final List<AbstractItem> isVariable = new ArrayList<>();
        for (AbstractItem isVariable : isNameExpr.isMethod()) {
            switch(isNameExpr.isMethod()) {
                case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                    if (isNameExpr.isMethod()) {
                        isNameExpr.isMethod(isNameExpr);
                    }
                    break;
                case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                    final List<AllergenGroupSubItem> isVariable = ((AllergenGroupItem) isNameExpr).isMethod();
                    for (AllergenGroupSubItem isVariable : isNameExpr) {
                        if (isNameExpr.isMethod())
                            isNameExpr.isMethod(isNameExpr);
                    }
                    break;
            }
        }
        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod() + "isStringConstant");
        return isNameExpr;
    }

    private void isMethod() {
        isNameExpr.isMethod(new DefaultItemAnimator());
        LinearLayoutManager isVariable = new LinearLayoutManager(this);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr = new FastItemAdapter<>();
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(new AllergenGroupItem.GroupExpandClickEvent());
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(new TextWatcher() {

            @Override
            public void isMethod(CharSequence isParameter, int isParameter, int isParameter, int isParameter) {
            }

            @Override
            public void isMethod(CharSequence isParameter, int isParameter, int isParameter, int isParameter) {
            }

            @Override
            public void isMethod(Editable isParameter) {
                final String isVariable = isNameExpr.isMethod().isMethod();
                if (isNameExpr.isMethod() > isIntegerConstant) {
                    if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    }
                    isMethod();
                } else {
                    if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr)
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    if (isNameExpr.isMethod() > isIntegerConstant) {
                        isNameExpr.isMethod();
                        isNameExpr.isMethod();
                    }
                    new Handler().isMethod(new Runnable() {

                        @Override
                        public void isMethod() {
                            isMethod();
                        }
                    }, isIntegerConstant);
                }
            }
        });
        isNameExpr.isMethod();
        isNameExpr.isMethod(this);
    }

    private String isMethod(AbstractItem isParameter) {
        switch(isNameExpr.isMethod()) {
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                return ((AllergenGroupItem) isNameExpr).isMethod();
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                return ((AllergenGroupSubItem) isNameExpr).isMethod();
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                return ((AllergenItem) isNameExpr).isMethod();
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                return ((AllergyGroupItem) isNameExpr).isMethod();
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                return ((AllergyGroupSubItem) isNameExpr).isMethod();
            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                return ((AllergyItem) isNameExpr).isMethod();
            default:
                throw new RuntimeException("isStringConstant");
        }
    }

    private class isClassOrIsInterface implements ISelectionListener<AbstractItem> {

        @Override
        public void isMethod(AbstractItem isParameter, boolean isParameter) {
            switch(isNameExpr.isMethod()) {
                case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                    AllergenGroupItem isVariable = (AllergenGroupItem) isNameExpr;
                    final int isVariable = isNameExpr.isMethod().isMethod();
                    if (isNameExpr) {
                        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr));
                    } else {
                        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr));
                    }
                    isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, true);
                    break;
                case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                    AllergenGroupItem isVariable = ((AllergenGroupSubItem) isNameExpr).isMethod();
                    final int isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
                    final int isVariable = isNameExpr.isMethod().isMethod();
                    final int isVariable = isNameExpr.isMethod(isNameExpr);
                    if (isNameExpr > isIntegerConstant) {
                        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr));
                        if (!isNameExpr.isMethod()) {
                            isNameExpr.isMethod(true);
                        }
                    } else {
                        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr));
                        if (isNameExpr.isMethod()) {
                            isNameExpr.isMethod(true);
                        }
                    }
                    isNameExpr.isMethod(isNameExpr);
                    break;
            }
            // isComment
            final int isVariable = isMethod().isMethod();
            if (isNameExpr > isIntegerConstant) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr));
                isNameExpr.isMethod(isNameExpr.this);
            } else {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }
        }
    }

    private class isClassOrIsInterface extends AsyncTask<String, Void, List<AbstractItem>> {

        @Override
        protected void isMethod() {
            isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }

        @Override
        protected void isMethod(List<AbstractItem> isParameter) {
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isMethod();
            isNameExpr = null;
        }

        @Override
        protected List<AbstractItem> isMethod(String... isParameter) {
            if (isNameExpr.isFieldAccessExpr != isIntegerConstant) {
                isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isFieldAccessExpr);
                throw new IllegalArgumentException("isStringConstant");
            }
            final String isVariable = isNameExpr[isIntegerConstant];
            final List<AllergenVO> isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null)
                isNameExpr.isMethod(isNameExpr);
            final List<AbstractItem> isVariable = new ArrayList<>();
            final int isVariable = isNameExpr.isMethod(isNameExpr.this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            if (isNameExpr != null && !isNameExpr.isMethod()) {
                // isComment
                final Map<String, Pattern> isVariable = new ArrayMap<>();
                for (AllergyGroup isVariable : isNameExpr) {
                    String isVariable = "isStringConstant" + isNameExpr.isMethod() + "isStringConstant";
                    Pattern isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
                }
                final Map<String, List<AllergenVO>> isVariable = new ArrayMap<>();
                final List<AllergenVO> isVariable = new ArrayList<>();
                for (AllergenVO isVariable : isNameExpr) {
                    for (String isVariable : isNameExpr.isMethod()) {
                        Pattern isVariable = isNameExpr.isMethod(isNameExpr);
                        if (isNameExpr.isMethod(isNameExpr.isMethod()).isMethod()) {
                            if (isNameExpr.isMethod().isMethod(isNameExpr)) {
                                isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr);
                            } else {
                                ArrayList<AllergenVO> isVariable = new ArrayList<>();
                                isNameExpr.isMethod(isNameExpr);
                                isNameExpr.isMethod(isNameExpr, isNameExpr);
                            }
                            isNameExpr.isMethod(isNameExpr);
                            break;
                        }
                    }
                }
                // isComment
                isNameExpr.isMethod(isNameExpr);
                for (String isVariable : isNameExpr.isMethod()) {
                    final List<AllergenVO> isVariable = isNameExpr.isMethod(isNameExpr);
                    if (!isNameExpr.isMethod()) {
                        AllergenGroupItem isVariable = new AllergenGroupItem(isNameExpr, "isStringConstant");
                        List<AllergenGroupSubItem> isVariable = new ArrayList<>();
                        for (AllergenVO isVariable : isNameExpr) {
                            final AllergenGroupSubItem isVariable = new AllergenGroupSubItem(isNameExpr, isNameExpr.this);
                            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr));
                            isNameExpr.isMethod(isNameExpr);
                        }
                        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod()));
                        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr));
                        isNameExpr.isMethod(isNameExpr, new Comparator<AllergenGroupSubItem>() {

                            @Override
                            public int isMethod(AllergenGroupSubItem isParameter, AllergenGroupSubItem isParameter) {
                                return isNameExpr.isMethod().isMethod(isNameExpr.isMethod());
                            }
                        });
                        isNameExpr.isMethod(isNameExpr);
                        isNameExpr.isMethod(isNameExpr);
                    }
                }
            }
            for (AllergenVO isVariable : isNameExpr) {
                final AllergenItem isVariable = new AllergenItem(isNameExpr, isNameExpr.this);
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr));
                isNameExpr.isMethod(isNameExpr);
            }
            isNameExpr.isMethod(isNameExpr, new AllergenSearchComparator(isNameExpr));
            return isNameExpr;
        }
    }

    private class isClassOrIsInterface implements Comparator<AbstractItem> {

        private final String isVariable;

        private isConstructor(final String isParameter) {
            this.isFieldAccessExpr = isNameExpr;
        }

        @Override
        public int isMethod(AbstractItem isParameter, AbstractItem isParameter) {
            final String isVariable = isNameExpr.isMethod();
            final String isVariable = isMethod(isNameExpr).isMethod().isMethod();
            boolean isVariable = isNameExpr.isMethod(isNameExpr);
            final String isVariable = isMethod(isNameExpr).isMethod().isMethod();
            boolean isVariable = isNameExpr.isMethod().isMethod().isMethod(isNameExpr);
            if (isNameExpr && !isNameExpr) {
                return -isIntegerConstant;
            } else if (isNameExpr && !isNameExpr) {
                return isIntegerConstant;
            } else if (isNameExpr) {
                // isComment
                int isVariable = isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isMethod());
                int isVariable = isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isMethod());
                if (isNameExpr == isNameExpr) {
                    // isComment
                    final int isVariable = isNameExpr.isMethod();
                    final int isVariable = isNameExpr.isMethod();
                    final int isVariable = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                    if (isNameExpr == isNameExpr && isNameExpr != isNameExpr) {
                        return -isIntegerConstant;
                    } else if (isNameExpr != isNameExpr && isNameExpr == isNameExpr) {
                        return isIntegerConstant;
                    } else {
                        return isNameExpr.isMethod(isNameExpr);
                    }
                } else {
                    return isNameExpr < isNameExpr ? -isIntegerConstant : isIntegerConstant;
                }
            } else {
                return isNameExpr.isMethod(isNameExpr);
            }
        }
    }
}
