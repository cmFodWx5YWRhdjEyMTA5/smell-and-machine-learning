// isComment
package es.usc.citius.servando.calendula.database;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;
import java.sql.SQLException;
import java.util.List;
import es.usc.citius.servando.calendula.persistence.Medicine;
import es.usc.citius.servando.calendula.persistence.Patient;
import es.usc.citius.servando.calendula.persistence.PatientAlert;
import es.usc.citius.servando.calendula.util.LogUtil;

public class isClassOrIsInterface extends GenericDao<PatientAlert, Long> {

    private static final String isVariable = "isStringConstant";

    private Dao<PatientAlert, Long> isVariable = null;

    public isConstructor(DatabaseHelper isParameter) {
        super(isNameExpr);
    }

    @Override
    public Dao<PatientAlert, Long> isMethod() {
        try {
            if (isNameExpr == null)
                isNameExpr = isNameExpr.isMethod(PatientAlert.class);
            return isNameExpr;
        } catch (SQLException isParameter) {
            throw new RuntimeException("isStringConstant", isNameExpr);
        }
    }

    public List<PatientAlert> isMethod(Medicine isParameter, int isParameter) {
        try {
            final PreparedQuery<PatientAlert> isVariable = isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr).isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr).isMethod();
            return isNameExpr.isMethod(isNameExpr);
        } catch (SQLException isParameter) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
            throw new RuntimeException("isStringConstant", isNameExpr);
        }
    }

    public List<PatientAlert> isMethod(Medicine isParameter) {
        try {
            final QueryBuilder<PatientAlert, Long> isVariable = isNameExpr.isMethod();
            final Where<PatientAlert, Long> isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
            return isNameExpr.isMethod(isNameExpr.isMethod());
        } catch (SQLException isParameter) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
            throw new RuntimeException("isStringConstant", isNameExpr);
        }
    }

    public List<PatientAlert> isMethod(Patient isParameter, Medicine isParameter, String isParameter) {
        try {
            final PreparedQuery<PatientAlert> isVariable = this.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr).isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr).isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr).isMethod();
            return isMethod(isNameExpr);
        } catch (SQLException isParameter) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
            return null;
        }
    }

    public List<PatientAlert> isMethod(Medicine isParameter, String isParameter) {
        try {
            final PreparedQuery<PatientAlert> isVariable = isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr).isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr).isMethod();
            return isNameExpr.isMethod(isNameExpr);
        } catch (SQLException isParameter) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
            throw new RuntimeException("isStringConstant", isNameExpr);
        }
    }
}
