// isComment
package es.usc.citius.servando.calendula.database;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.QueryBuilder;
import java.sql.SQLException;
import java.util.List;
import es.usc.citius.servando.calendula.persistence.AllergyGroup;
import es.usc.citius.servando.calendula.util.LogUtil;

public class isClassOrIsInterface extends GenericDao<AllergyGroup, Long> {

    private static final String isVariable = "isStringConstant";

    private Dao<AllergyGroup, Long> isVariable = null;

    public isConstructor(DatabaseHelper isParameter) {
        super(isNameExpr);
    }

    @Override
    public Dao<AllergyGroup, Long> isMethod() {
        try {
            if (isNameExpr == null)
                isNameExpr = isNameExpr.isMethod(AllergyGroup.class);
            return isNameExpr;
        } catch (SQLException isParameter) {
            throw new RuntimeException("isStringConstant", isNameExpr);
        }
    }

    public List<AllergyGroup> isMethod() {
        final QueryBuilder<AllergyGroup, Long> isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
        try {
            return isNameExpr.isMethod(isNameExpr.isMethod());
        } catch (SQLException isParameter) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
            throw new RuntimeException("isStringConstant", isNameExpr);
        }
    }
}
