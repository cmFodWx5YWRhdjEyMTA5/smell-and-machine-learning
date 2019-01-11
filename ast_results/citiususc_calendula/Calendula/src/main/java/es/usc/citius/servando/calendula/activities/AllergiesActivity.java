// isComment
package es.usc.citius.servando.calendula.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.afollestad.materialdialogs.DialogAction;
import com.afollestad.materialdialogs.MaterialDialog;
import com.github.javiersantos.materialstyleddialogs.MaterialStyledDialog;
import com.github.javiersantos.materialstyleddialogs.enums.Style;
import com.mikepenz.community_material_typeface_library.CommunityMaterial;
import com.mikepenz.fastadapter.FastAdapter;
import com.mikepenz.fastadapter.commons.adapters.FastItemAdapter;
import com.mikepenz.fastadapter.items.AbstractItem;
import com.mikepenz.fastadapter.listeners.ClickEventHook;
import com.mikepenz.google_material_typeface_library.GoogleMaterial;
import com.mikepenz.iconics.IconicsDrawable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import es.usc.citius.servando.calendula.CalendulaActivity;
import es.usc.citius.servando.calendula.CalendulaApp;
import es.usc.citius.servando.calendula.R;
import es.usc.citius.servando.calendula.adapters.items.allergylist.AllergyGroupItem;
import es.usc.citius.servando.calendula.adapters.items.allergylist.AllergyGroupSubItem;
import es.usc.citius.servando.calendula.adapters.items.allergylist.AllergyItem;
import es.usc.citius.servando.calendula.allergies.AllergenConversionUtil;
import es.usc.citius.servando.calendula.allergies.AllergenFacade;
import es.usc.citius.servando.calendula.allergies.AllergenGroupWrapper;
import es.usc.citius.servando.calendula.allergies.AllergenVO;
import es.usc.citius.servando.calendula.allergies.AllergyAlertUtil;
import es.usc.citius.servando.calendula.database.DB;
import es.usc.citius.servando.calendula.events.PersistenceEvents;
import es.usc.citius.servando.calendula.persistence.Medicine;
import es.usc.citius.servando.calendula.persistence.Patient;
import es.usc.citius.servando.calendula.persistence.PatientAlert;
import es.usc.citius.servando.calendula.persistence.PatientAllergen;
import es.usc.citius.servando.calendula.persistence.alerts.AllergyPatientAlert;
import es.usc.citius.servando.calendula.persistence.alerts.AllergyPatientAlert.AllergyAlertInfo;
import es.usc.citius.servando.calendula.util.IconUtils;
import es.usc.citius.servando.calendula.util.LogUtil;
import es.usc.citius.servando.calendula.util.PreferenceKeys;
import es.usc.citius.servando.calendula.util.PreferenceUtils;
import es.usc.citius.servando.calendula.util.Snack;
import es.usc.citius.servando.calendula.util.alerts.AlertManager;

@SuppressWarnings("isStringConstant")
public class isClassOrIsInterface extends CalendulaActivity {

    private static final String isVariable = "isStringConstant";

    // isComment
    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected FloatingActionButton isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected RecyclerView isVariable;

    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected TextView isVariable;

    // isComment
    @BindView(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    protected ProgressBar isVariable;

    private int isVariable;

    private FastItemAdapter isVariable;

    private AllergiesStore isVariable;

    @OnClick(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    void isMethod() {
        Intent isVariable = new Intent(this, AllergiesSearchActivity.class);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @Override
    protected void isMethod(int isParameter, int isParameter, Intent isParameter) {
        if (isNameExpr == isNameExpr.isFieldAccessExpr && isNameExpr == isNameExpr.isFieldAccessExpr) {
            final ArrayList<AllergenGroupWrapper> isVariable = isNameExpr.isMethod("isStringConstant");
            new SaveAllergiesTask().isMethod(isNameExpr);
        }
    }

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(new IconicsDrawable(this).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isIntegerConstant).isMethod(isIntegerConstant).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        // isComment
        final Patient isVariable = isNameExpr.isMethod().isMethod(this);
        isNameExpr = isNameExpr.isMethod();
        final String isVariable = isNameExpr.isMethod();
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), isNameExpr);
        isMethod(isNameExpr);
        // isComment
        isNameExpr = new AllergiesStore();
        // isComment
        isMethod();
        isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
        // isComment
        new LoadAllergiesTask().isMethod();
        isMethod();
    }

    private void isMethod() {
        final SharedPreferences isVariable = isNameExpr.isMethod().isMethod();
        if (!isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(), true)) {
            new MaterialStyledDialog.Builder(this).isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant)).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(true).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(true).isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(new MaterialDialog.SingleButtonCallback() {

                @Override
                public void isMethod(@NonNull MaterialDialog isParameter, @NonNull DialogAction isParameter) {
                    isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isMethod(), true).isMethod();
                    isNameExpr.isMethod();
                }
            }).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(new MaterialDialog.SingleButtonCallback() {

                @Override
                public void isMethod(@NonNull MaterialDialog isParameter, @NonNull DialogAction isParameter) {
                    isNameExpr.isMethod();
                    isMethod();
                }
            }).isMethod();
        }
    }

    private boolean isMethod(final AllergenVO isParameter) {
        final List<Medicine> isVariable = isNameExpr.isMethod(this, isNameExpr);
        if (!isNameExpr.isMethod()) {
            isNameExpr.isMethod(new Callable<Object>() {

                @Override
                public Object isMethod() throws Exception {
                    for (Medicine isVariable : isNameExpr) {
                        // isComment
                        final List<PatientAlert> isVariable = isNameExpr.isMethod(isNameExpr);
                        if (isNameExpr.isMethod() > isIntegerConstant) {
                            if (isNameExpr.isMethod() == isIntegerConstant) {
                                AllergyPatientAlert isVariable = (AllergyPatientAlert) isNameExpr.isMethod(isIntegerConstant).isMethod();
                                final AllergyAlertInfo isVariable = isNameExpr.isMethod();
                                isNameExpr.isMethod().isMethod(isNameExpr);
                                isNameExpr.isMethod(isNameExpr);
                                isNameExpr.isMethod().isMethod(isNameExpr);
                            } else {
                                isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
                            }
                        } else {
                            isNameExpr.isMethod(new AllergyPatientAlert(isNameExpr, new ArrayList<AllergenVO>() {

                                {
                                    isMethod(isNameExpr);
                                }
                            }));
                        }
                    }
                    return null;
                }
            });
        }
        return !isNameExpr.isMethod();
    }

    private void isMethod() {
        if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr) {
            if (!isNameExpr.isMethod())
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        } else if (isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
    }

    private List<AbstractItem> isMethod() {
        final List<PatientAllergen> isVariable = new ArrayList<>(isNameExpr.isMethod());
        List<AbstractItem> isVariable = new ArrayList<>(isNameExpr.isMethod());
        List<PatientAllergen> isVariable = new ArrayList<>();
        Map<String, List<AllergyGroupSubItem>> isVariable = new HashMap<>();
        for (PatientAllergen isVariable : isNameExpr) {
            final String isVariable = isNameExpr.isMethod();
            if (isNameExpr != null && !isNameExpr.isMethod()) {
                if (!isNameExpr.isMethod().isMethod(isNameExpr)) {
                    isNameExpr.isMethod(isNameExpr, new ArrayList<AllergyGroupSubItem>());
                }
                isNameExpr.isMethod(isNameExpr).isMethod(new AllergyGroupSubItem(isNameExpr, this));
                isNameExpr.isMethod(isNameExpr);
            }
        }
        isNameExpr.isMethod(isNameExpr);
        for (String isVariable : isNameExpr.isMethod()) {
            AllergyGroupItem isVariable = new AllergyGroupItem(isNameExpr, this);
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
            isNameExpr.isMethod(isNameExpr);
        }
        for (PatientAllergen isVariable : isNameExpr) {
            isNameExpr.isMethod(new AllergyItem(isNameExpr, this));
        }
        return isNameExpr;
    }

    private void isMethod(boolean isParameter) {
        final int isVariable = isNameExpr ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        if (!isNameExpr)
            isMethod();
    }

    private void isMethod() {
        LinearLayoutManager isVariable = new LinearLayoutManager(this);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr = new FastItemAdapter<>();
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(new ClickEventHook<AbstractItem>() {

            @Override
            public void isMethod(View isParameter, int isParameter, FastAdapter isParameter, AbstractItem isParameter) {
                isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant");
                switch(isNameExpr.isMethod()) {
                    case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                        // isComment
                        switch(isNameExpr.isMethod()) {
                            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                                isMethod((AllergyGroupItem) isNameExpr);
                                break;
                            case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                                isMethod((AllergyItem) isNameExpr);
                                break;
                            default:
                                isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
                                break;
                        }
                        break;
                    case isNameExpr.isFieldAccessExpr.isFieldAccessExpr:
                        AllergyGroupItem isVariable = (AllergyGroupItem) isNameExpr;
                        boolean isVariable = !isNameExpr.isMethod();
                        float isVariable = isNameExpr ? isIntegerConstant : isIntegerConstant;
                        isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr);
                        if (isNameExpr)
                            isNameExpr.isMethod(isNameExpr);
                        else
                            isNameExpr.isMethod(isNameExpr);
                        break;
                    default:
                        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
                        break;
                }
            }

            @Nullable
            @Override
            public List<View> isMethod(@NonNull RecyclerView.ViewHolder isParameter) {
                List<View> isVariable = new ArrayList<>();
                if (isNameExpr instanceof AllergyGroupItem.ViewHolder) {
                    AllergyGroupItem.ViewHolder isVariable = (AllergyGroupItem.ViewHolder) isNameExpr;
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    return isNameExpr;
                } else if (isNameExpr instanceof AllergyItem.ViewHolder) {
                    isNameExpr.isMethod(((AllergyItem.ViewHolder) isNameExpr).isFieldAccessExpr);
                    return isNameExpr;
                }
                return null;
            }
        });
        isNameExpr.isMethod(isNameExpr);
    }

    private void isMethod(final AllergyItem isParameter) {
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod()), new MaterialDialog.SingleButtonCallback() {

            @Override
            public void isMethod(@NonNull MaterialDialog isParameter, @NonNull DialogAction isParameter) {
                new DeleteAllergyTask().isMethod(isNameExpr);
                isNameExpr.isMethod();
            }
        }, new MaterialDialog.SingleButtonCallback() {

            @Override
            public void isMethod(@NonNull MaterialDialog isParameter, @NonNull DialogAction isParameter) {
                isNameExpr.isMethod();
            }
        });
    }

    private void isMethod(final AllergyGroupItem isParameter) {
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod()), new MaterialDialog.SingleButtonCallback() {

            @Override
            public void isMethod(@NonNull MaterialDialog isParameter, @NonNull DialogAction isParameter) {
                new DeleteAllergyGroupTask().isMethod(isNameExpr);
                isNameExpr.isMethod();
            }
        }, new MaterialDialog.SingleButtonCallback() {

            @Override
            public void isMethod(@NonNull MaterialDialog isParameter, @NonNull DialogAction isParameter) {
                isNameExpr.isMethod();
            }
        });
    }

    private void isMethod(String isParameter, MaterialDialog.SingleButtonCallback isParameter, MaterialDialog.SingleButtonCallback isParameter) {
        new MaterialStyledDialog.Builder(this).isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant)).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(true).isMethod(isNameExpr).isMethod(true).isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr).isMethod(isNameExpr).isMethod();
    }

    private void isMethod() {
        new MaterialStyledDialog.Builder(this).isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isIntegerConstant)).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(true).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(true).isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(new MaterialDialog.SingleButtonCallback() {

            @Override
            public void isMethod(@NonNull MaterialDialog isParameter, @NonNull DialogAction isParameter) {
                isNameExpr.isMethod();
            }
        }).isMethod();
    }

    public enum SaveResult {

        OK, ERROR, ALLERGY
    }

    public class isClassOrIsInterface {

        private List<PatientAllergen> isVariable;

        private Context isVariable;

        public isConstructor() {
        }

        public int isMethod(PatientAllergen isParameter, boolean isParameter) {
            try {
                int isVariable = isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod().isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr);
                if (isNameExpr) {
                    isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr);
                }
                return isNameExpr;
            } catch (SQLException isParameter) {
                isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr, isNameExpr);
                return -isIntegerConstant;
            }
        }

        public int isMethod(final List<PatientAllergen> isParameter) {
            final int isVariable = (int) isNameExpr.isMethod(new Callable<Integer>() {

                @Override
                public Integer isMethod() throws Exception {
                    int isVariable = isIntegerConstant;
                    for (PatientAllergen isVariable : isNameExpr) {
                        isNameExpr = isMethod(isNameExpr, true);
                        if (isNameExpr == -isIntegerConstant)
                            break;
                    }
                    return isNameExpr;
                }
            });
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr);
            return isNameExpr;
        }

        public List<PatientAllergen> isMethod() {
            return isNameExpr;
        }

        public List<AllergenVO> isMethod() {
            return isNameExpr.isMethod(isNameExpr);
        }

        public boolean isMethod() {
            return isNameExpr.isMethod();
        }

        public void isMethod(Context isParameter) {
            isNameExpr = isNameExpr;
            isMethod();
        }

        public void isMethod() {
            isNameExpr = isNameExpr.isMethod().isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr, new Comparator<PatientAllergen>() {

                @Override
                public int isMethod(PatientAllergen isParameter, PatientAllergen isParameter) {
                    return isNameExpr.isMethod().isMethod(isNameExpr.isMethod());
                }
            });
        }

        public SaveResult isMethod(PatientAllergen isParameter) {
            int isVariable;
            try {
                isNameExpr = isNameExpr.isMethod().isMethod(isNameExpr);
            } catch (SQLException isParameter) {
                isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
                return isNameExpr.isFieldAccessExpr;
            }
            isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
            if (isNameExpr == isIntegerConstant) {
                final boolean isVariable = isMethod(new AllergenVO(isNameExpr));
                isNameExpr.isMethod(isNameExpr);
                if (isNameExpr)
                    return isNameExpr.isFieldAccessExpr;
                return isNameExpr.isFieldAccessExpr;
            }
            return isNameExpr.isFieldAccessExpr;
        }

        public SaveResult isMethod(final Collection<PatientAllergen> isParameter) {
            return (SaveResult) isNameExpr.isMethod(new Callable<SaveResult>() {

                @Override
                public SaveResult isMethod() throws Exception {
                    SaveResult isVariable = isNameExpr.isFieldAccessExpr;
                    for (PatientAllergen isVariable : isNameExpr) {
                        final SaveResult isVariable = isMethod(isNameExpr);
                        if (isNameExpr == isNameExpr.isFieldAccessExpr && isNameExpr != isNameExpr.isFieldAccessExpr)
                            isNameExpr = isNameExpr.isFieldAccessExpr;
                        if (isNameExpr == isNameExpr.isFieldAccessExpr)
                            isNameExpr = isNameExpr.isFieldAccessExpr;
                    }
                    return isNameExpr;
                }
            });
        }
    }

    private class isClassOrIsInterface extends AsyncTask<AllergyGroupItem, Void, Integer> {

        @Override
        protected Integer isMethod(AllergyGroupItem... isParameter) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod(isNameExpr) + "isStringConstant");
            if (isNameExpr.isFieldAccessExpr != isIntegerConstant) {
                isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isFieldAccessExpr);
                throw new IllegalArgumentException("isStringConstant");
            }
            int isVariable = isNameExpr.isMethod(isNameExpr[isIntegerConstant]);
            final List<AllergyGroupSubItem> isVariable = isNameExpr[isIntegerConstant].isMethod();
            final List<PatientAllergen> isVariable = new ArrayList<>(isNameExpr.isMethod());
            for (AllergyGroupSubItem isVariable : isNameExpr) {
                isNameExpr.isMethod(isNameExpr.isMethod());
            }
            int isVariable = isNameExpr.isMethod(isNameExpr);
            return isNameExpr >= -isIntegerConstant ? isNameExpr : isNameExpr;
        }

        @Override
        protected void isMethod() {
            super.isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }

        @Override
        protected void isMethod(Integer isParameter) {
            if (isNameExpr >= isIntegerConstant) {
                isNameExpr.isMethod();
                isMethod();
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr);
            } else {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.this);
            }
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            new Handler().isMethod(new Runnable() {

                @Override
                public void isMethod() {
                    isMethod();
                }
            }, isIntegerConstant);
            isMethod(true);
        }
    }

    private class isClassOrIsInterface extends AsyncTask<AllergyItem, Void, Integer> {

        @Override
        protected void isMethod() {
            super.isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }

        @Override
        protected void isMethod(Integer isParameter) {
            if (isNameExpr >= isIntegerConstant) {
                isNameExpr.isMethod();
                isMethod();
                isNameExpr.isMethod(isNameExpr);
            } else {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.this);
            }
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            new Handler().isMethod(new Runnable() {

                @Override
                public void isMethod() {
                    isMethod();
                }
            }, isIntegerConstant);
            isMethod(true);
        }

        @Override
        protected Integer isMethod(AllergyItem... isParameter) {
            if (isNameExpr.isFieldAccessExpr != isIntegerConstant) {
                isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isFieldAccessExpr);
                throw new IllegalArgumentException("isStringConstant");
            }
            int isVariable = isNameExpr.isMethod(isNameExpr[isIntegerConstant]);
            isNameExpr.isMethod(isNameExpr[isIntegerConstant].isMethod(), true);
            return isNameExpr;
        }
    }

    private class isClassOrIsInterface extends AsyncTask<Void, Void, List<AbstractItem>> {

        @Override
        protected void isMethod() {
            super.isMethod();
            isMethod(true);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }

        @Override
        protected void isMethod(List<AbstractItem> isParameter) {
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isMethod();
            isMethod(true);
        }

        @Override
        protected List<AbstractItem> isMethod(Void... isParameter) {
            isNameExpr.isMethod(isNameExpr.this);
            return isMethod();
        }
    }

    private class isClassOrIsInterface extends AsyncTask<Collection<AllergenGroupWrapper>, Void, SaveAllergiesTask.Result> {

        @SafeVarargs
        @Override
        protected final Result isMethod(Collection<AllergenGroupWrapper>... isParameter) {
            if (isNameExpr.isFieldAccessExpr != isIntegerConstant) {
                isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isFieldAccessExpr);
                throw new IllegalArgumentException("isStringConstant");
            }
            final Collection<AllergenGroupWrapper> isVariable = isNameExpr[isIntegerConstant];
            Collection<PatientAllergen> isVariable = new ArrayList<>(isNameExpr.isMethod());
            Patient isVariable = isNameExpr.isMethod().isMethod(isNameExpr.this);
            for (AllergenGroupWrapper isVariable : isNameExpr) {
                if (isNameExpr.isMethod() != null)
                    isNameExpr.isMethod(new PatientAllergen(isNameExpr.isMethod(), isNameExpr, isNameExpr.isMethod()));
                else
                    isNameExpr.isMethod(new PatientAllergen(isNameExpr.isMethod(), isNameExpr));
            }
            final SaveResult isVariable = isNameExpr.isMethod(isNameExpr);
            return new Result(isNameExpr == isNameExpr.isFieldAccessExpr || isNameExpr == isNameExpr.isFieldAccessExpr, isNameExpr == isNameExpr.isFieldAccessExpr, isMethod());
        }

        @Override
        protected void isMethod(Result isParameter) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            if (isNameExpr.isFieldAccessExpr) {
                if (!isNameExpr.isFieldAccessExpr.isMethod()) {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod();
                }
                if (isNameExpr.isFieldAccessExpr)
                    isMethod();
                isMethod(true);
                isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.this);
            } else {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.this);
            }
        }

        @Override
        protected void isMethod() {
            super.isMethod();
            isMethod(true);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }

        class isClassOrIsInterface {

            final boolean isVariable;

            final boolean isVariable;

            final List<AbstractItem> isVariable;

            public isConstructor(boolean isParameter, boolean isParameter, List<AbstractItem> isParameter) {
                this.isFieldAccessExpr = isNameExpr;
                this.isFieldAccessExpr = isNameExpr;
                this.isFieldAccessExpr = isNameExpr;
            }
        }
    }
}
