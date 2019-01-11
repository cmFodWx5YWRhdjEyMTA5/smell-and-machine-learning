// isComment
package es.usc.citius.servando.calendula.database;

import android.content.Context;
import com.j256.ormlite.dao.Dao;
import java.sql.SQLException;
import java.util.List;
import es.usc.citius.servando.calendula.persistence.Patient;
import es.usc.citius.servando.calendula.persistence.PatientAllergen;

public class isClassOrIsInterface extends GenericDao<PatientAllergen, Long> {

    private static final String isVariable = "isStringConstant";

    private Dao<PatientAllergen, Long> isVariable = null;

    public isConstructor(DatabaseHelper isParameter) {
        super(isNameExpr);
    }

    @Override
    public Dao<PatientAllergen, Long> isMethod() {
        try {
            if (isNameExpr == null)
                isNameExpr = isNameExpr.isMethod(PatientAllergen.class);
            return isNameExpr;
        } catch (SQLException isParameter) {
            throw new RuntimeException("isStringConstant", isNameExpr);
        }
    }

    public List<PatientAllergen> isMethod(Context isParameter) {
        return isMethod(isNameExpr.isMethod().isMethod(isNameExpr));
    }

    public List<PatientAllergen> isMethod(Patient isParameter) {
        return isMethod(isNameExpr.isMethod());
    }

    public List<PatientAllergen> isMethod(Long isParameter) {
        try {
            return isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr).isMethod();
        } catch (SQLException isParameter) {
            throw new RuntimeException("isStringConstant", isNameExpr);
        }
    }
}
