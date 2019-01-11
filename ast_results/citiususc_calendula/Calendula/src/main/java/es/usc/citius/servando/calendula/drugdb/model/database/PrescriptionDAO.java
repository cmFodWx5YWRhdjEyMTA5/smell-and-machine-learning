// isComment
package es.usc.citius.servando.calendula.drugdb.model.database;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;
import java.sql.SQLException;
import java.util.List;
import es.usc.citius.servando.calendula.database.DatabaseHelper;
import es.usc.citius.servando.calendula.database.GenericDao;
import es.usc.citius.servando.calendula.drugdb.model.persistence.Prescription;
import es.usc.citius.servando.calendula.util.LogUtil;

/**
 * isComment
 */
public class isClassOrIsInterface extends GenericDao<Prescription, Long> {

    private static final String isVariable = "isStringConstant";

    private Dao<Prescription, Long> isVariable = null;

    public isConstructor(DatabaseHelper isParameter) {
        super(isNameExpr);
    }

    @Override
    public Dao<Prescription, Long> isMethod() {
        try {
            if (isNameExpr == null)
                isNameExpr = isNameExpr.isMethod(Prescription.class);
            return isNameExpr;
        } catch (SQLException isParameter) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
            throw new RuntimeException("isStringConstant", isNameExpr);
        }
    }

    public boolean isMethod() {
        return isMethod() <= isIntegerConstant;
    }

    /**
     * isComment
     */
    public List<Prescription> isMethod(final String isParameter, final int isParameter) {
        try {
            isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
            QueryBuilder<Prescription, Long> isVariable = isNameExpr.isMethod();
            Where isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant" + isNameExpr + "isStringConstant"), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr + "isStringConstant"));
            isNameExpr.isMethod("isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr + "isStringConstant");
            isNameExpr.isMethod((long) isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            return isNameExpr.isMethod();
        } catch (SQLException isParameter) {
            throw new RuntimeException(isNameExpr);
        }
    }

    public Prescription isMethod(final String isParameter) {
        return isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
    }
}
