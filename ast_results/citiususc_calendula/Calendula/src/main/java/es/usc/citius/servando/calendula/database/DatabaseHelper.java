// isComment
package es.usc.citius.servando.calendula.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.misc.TransactionManager;
import com.j256.ormlite.stmt.UpdateBuilder;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import org.joda.time.LocalDate;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.Callable;
import es.usc.citius.servando.calendula.R;
import es.usc.citius.servando.calendula.database.migrationHelpers.DrugModelMigrationHelper;
import es.usc.citius.servando.calendula.database.migrationHelpers.LocalDateMigrationHelper;
import es.usc.citius.servando.calendula.drugdb.model.persistence.ActiveIngredient;
import es.usc.citius.servando.calendula.drugdb.model.persistence.ContentUnit;
import es.usc.citius.servando.calendula.drugdb.model.persistence.Excipient;
import es.usc.citius.servando.calendula.drugdb.model.persistence.HomogeneousGroup;
import es.usc.citius.servando.calendula.drugdb.model.persistence.PackageType;
import es.usc.citius.servando.calendula.drugdb.model.persistence.Prescription;
import es.usc.citius.servando.calendula.drugdb.model.persistence.PrescriptionActiveIngredient;
import es.usc.citius.servando.calendula.drugdb.model.persistence.PrescriptionExcipient;
import es.usc.citius.servando.calendula.drugdb.model.persistence.PresentationForm;
import es.usc.citius.servando.calendula.persistence.AllergyGroup;
import es.usc.citius.servando.calendula.persistence.DailyScheduleItem;
import es.usc.citius.servando.calendula.persistence.HtmlCacheEntry;
import es.usc.citius.servando.calendula.persistence.Medicine;
import es.usc.citius.servando.calendula.persistence.Patient;
import es.usc.citius.servando.calendula.persistence.PatientAlert;
import es.usc.citius.servando.calendula.persistence.PatientAllergen;
import es.usc.citius.servando.calendula.persistence.PickupInfo;
import es.usc.citius.servando.calendula.persistence.RepetitionRule;
import es.usc.citius.servando.calendula.persistence.Routine;
import es.usc.citius.servando.calendula.persistence.Schedule;
import es.usc.citius.servando.calendula.persistence.ScheduleItem;
import es.usc.citius.servando.calendula.util.LogUtil;

/**
 * isComment
 */
public class isClassOrIsInterface extends OrmLiteSqliteOpenHelper {

    // isComment
    public static final int isVariable = isIntegerConstant;

    private static final String isVariable = "isStringConstant";

    // isComment
    private static final String isVariable = isNameExpr.isFieldAccessExpr;

    // isComment
    public Class<?>[] isVariable = new Class<?>[] { Routine.class, Medicine.class, Schedule.class, ScheduleItem.class, DailyScheduleItem.class, // isComment
    PickupInfo.class, // isComment
    Patient.class, // isComment
    HtmlCacheEntry.class, // isComment
    ActiveIngredient.class, ContentUnit.class, Excipient.class, HomogeneousGroup.class, PackageType.class, Prescription.class, PresentationForm.class, PrescriptionActiveIngredient.class, PrescriptionExcipient.class, PatientAllergen.class, PatientAlert.class, AllergyGroup.class };

    // isComment
    private Dao<Medicine, Long> isVariable = null;

    // isComment
    private Dao<Routine, Long> isVariable = null;

    // isComment
    private Dao<Schedule, Long> isVariable = null;

    // isComment
    private Dao<ScheduleItem, Long> isVariable = null;

    // isComment
    private Dao<DailyScheduleItem, Long> isVariable = null;

    // isComment
    private Dao<Prescription, Long> isVariable = null;

    // isComment
    private Dao<HomogeneousGroup, Long> isVariable = null;

    // isComment
    private Dao<PickupInfo, Long> isVariable = null;

    // isComment
    private Dao<Patient, Long> isVariable = null;

    private final Context isVariable;

    public isConstructor(Context isParameter) {
        super(isNameExpr, isNameExpr, null, isNameExpr);
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    @Override
    public void isMethod(SQLiteDatabase isParameter, ConnectionSource isParameter) {
        try {
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
            for (Class<?> isVariable : isNameExpr) {
                isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod());
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
        } catch (SQLException isParameter) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
            throw new RuntimeException(isNameExpr);
        }
    }

    /**
     * isComment
     */
    @Override
    public void isMethod(SQLiteDatabase isParameter, ConnectionSource isParameter, int isParameter, int isParameter) {
        try {
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
            isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr);
            if (isNameExpr < isIntegerConstant) {
                isNameExpr = isIntegerConstant;
            }
            switch(isNameExpr + isIntegerConstant) {
                case isIntegerConstant:
                    // isComment
                    isMethod();
                case isIntegerConstant:
                    isMethod().isMethod("isStringConstant");
                    // isComment
                    isMethod().isMethod("isStringConstant");
                    // isComment
                    isNameExpr.isMethod(isMethod(), new Callable<Void>() {

                        @Override
                        public Void isMethod() throws Exception {
                            // isComment
                            List<Schedule> isVariable = isMethod().isMethod();
                            for (Schedule isVariable : isNameExpr) {
                                isNameExpr.isMethod(true);
                                isNameExpr.isMethod();
                            }
                            return null;
                        }
                    });
                    // isComment
                    // isComment
                    isNameExpr.isMethod(isNameExpr, HomogeneousGroup.class);
                    isNameExpr.isMethod(isNameExpr, PickupInfo.class);
                case isIntegerConstant:
                    isNameExpr.isMethod(isNameExpr, Patient.class);
                    isMethod();
                case isIntegerConstant:
                    isNameExpr.isMethod(isNameExpr, HtmlCacheEntry.class);
                case isIntegerConstant:
                    // isComment
                    isNameExpr.isMethod(isNameExpr, HtmlCacheEntry.class, true);
                    isNameExpr.isMethod(isNameExpr, HtmlCacheEntry.class);
                    isNameExpr.isMethod(this);
                case isIntegerConstant:
                    isNameExpr.isMethod(isNameExpr, isNameExpr);
                    isMethod().isMethod("isStringConstant");
                    isMethod().isMethod("isStringConstant");
                    isNameExpr.isMethod(isNameExpr, PatientAllergen.class);
                    isNameExpr.isMethod(isNameExpr, AllergyGroup.class);
                    isMethod().isMethod("isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant");
                    isNameExpr.isMethod(isNameExpr, PatientAlert.class);
                    // isComment
                    isMethod().isMethod("isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant");
            }
        } catch (Exception isParameter) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
            try {
                isNameExpr.isMethod(isNameExpr, "isStringConstant");
                isMethod();
            } catch (Exception isParameter) {
                throw new RuntimeException(isNameExpr);
            }
        }
    }

    /**
     * isComment
     */
    public Dao<Medicine, Long> isMethod() throws SQLException {
        if (isNameExpr == null) {
            isNameExpr = isMethod(Medicine.class);
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    public Dao<Routine, Long> isMethod() throws SQLException {
        if (isNameExpr == null) {
            isNameExpr = isMethod(Routine.class);
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    public Dao<Schedule, Long> isMethod() throws SQLException {
        if (isNameExpr == null) {
            isNameExpr = isMethod(Schedule.class);
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    public Dao<ScheduleItem, Long> isMethod() throws SQLException {
        if (isNameExpr == null) {
            isNameExpr = isMethod(ScheduleItem.class);
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    public Dao<DailyScheduleItem, Long> isMethod() throws SQLException {
        if (isNameExpr == null) {
            isNameExpr = isMethod(DailyScheduleItem.class);
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    public Dao<Prescription, Long> isMethod() throws SQLException {
        if (isNameExpr == null) {
            isNameExpr = isMethod(Prescription.class);
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    public Dao<HomogeneousGroup, Long> isMethod() throws SQLException {
        if (isNameExpr == null) {
            isNameExpr = isMethod(HomogeneousGroup.class);
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    public Dao<PickupInfo, Long> isMethod() throws SQLException {
        if (isNameExpr == null) {
            isNameExpr = isMethod(PickupInfo.class);
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    public Dao<Patient, Long> isMethod() throws SQLException {
        if (isNameExpr == null) {
            isNameExpr = isMethod(Patient.class);
        }
        return isNameExpr;
    }

    @Override
    public void isMethod(SQLiteDatabase isParameter, int isParameter, int isParameter) {
    }

    public void isMethod() {
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        for (Class<?> isVariable : isNameExpr) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod());
            try {
                isNameExpr.isMethod(isNameExpr, isNameExpr, true);
            } catch (SQLException isParameter) {
                // isComment
                isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod());
            }
        }
        try {
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
            for (Class<?> isVariable : isNameExpr) {
                isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod());
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
            isMethod();
        } catch (SQLException isParameter) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
            throw new RuntimeException(isNameExpr);
        }
    }

    /**
     * isComment
     */
    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr = null;
        isNameExpr = null;
        isNameExpr = null;
        isNameExpr = null;
        isNameExpr = null;
        isNameExpr = null;
        isNameExpr = null;
        isNameExpr = null;
        isNameExpr = null;
    }

    /**
     * isComment
     */
    public Patient isMethod() throws SQLException {
        // isComment
        Patient isVariable = new Patient();
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod(true);
        isMethod().isMethod(isNameExpr);
        return isNameExpr;
    }

    /**
     * isComment
     */
    private void isMethod() throws SQLException {
        // isComment
        isMethod().isMethod("isStringConstant");
        isMethod().isMethod("isStringConstant");
        isMethod().isMethod("isStringConstant");
        isMethod().isMethod("isStringConstant");
        isMethod().isMethod("isStringConstant");
        Patient isVariable = isMethod();
        // isComment
        // isComment
        UpdateBuilder<Routine, Long> isVariable = isMethod().isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isNameExpr.isMethod();
        // isComment
        UpdateBuilder<Schedule, Long> isVariable = isMethod().isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isNameExpr.isMethod();
        // isComment
        UpdateBuilder<Medicine, Long> isVariable = isMethod().isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isNameExpr.isMethod();
        // isComment
        UpdateBuilder<DailyScheduleItem, Long> isVariable = isMethod().isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isNameExpr.isMethod();
        // isComment
        String isVariable = isNameExpr.isMethod().isMethod("isStringConstant");
        String isVariable = "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr + "isStringConstant";
        isMethod().isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    private void isMethod() throws SQLException {
        isMethod().isMethod("isStringConstant");
        isMethod().isMethod("isStringConstant");
        isMethod().isMethod("isStringConstant");
        isMethod().isMethod("isStringConstant");
        isMethod().isMethod("isStringConstant");
        isMethod().isMethod("isStringConstant");
        isMethod().isMethod("isStringConstant");
        isMethod().isMethod("isStringConstant");
        // isComment
        isNameExpr.isMethod(isMethod(), new Callable<Void>() {

            @Override
            public Void isMethod() throws Exception {
                // isComment
                List<Schedule> isVariable = isMethod().isMethod();
                isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod() + "isStringConstant");
                for (Schedule isVariable : isNameExpr) {
                    if (isNameExpr.isMethod() == null) {
                        isNameExpr.isMethod(new RepetitionRule(isNameExpr.isFieldAccessExpr));
                    }
                    isNameExpr.isMethod(isNameExpr.isMethod());
                    if (isNameExpr.isMethod()) {
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    } else {
                        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    }
                    isNameExpr.isMethod(isNameExpr.isMethod());
                    isNameExpr.isMethod();
                }
                return null;
            }
        });
    }
}
