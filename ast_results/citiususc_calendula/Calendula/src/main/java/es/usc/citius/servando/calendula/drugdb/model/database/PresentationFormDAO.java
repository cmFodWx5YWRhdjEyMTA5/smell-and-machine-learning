// isComment
package es.usc.citius.servando.calendula.drugdb.model.database;

import com.j256.ormlite.dao.Dao;
import java.sql.SQLException;
import es.usc.citius.servando.calendula.database.DatabaseHelper;
import es.usc.citius.servando.calendula.database.GenericDao;
import es.usc.citius.servando.calendula.drugdb.model.persistence.PresentationForm;
import es.usc.citius.servando.calendula.util.LogUtil;

/**
 * isComment
 */
public class isClassOrIsInterface extends GenericDao<PresentationForm, Long> {

    private static final String isVariable = "isStringConstant";

    private Dao<PresentationForm, Long> isVariable = null;

    public isConstructor(DatabaseHelper isParameter) {
        super(isNameExpr);
    }

    @Override
    public Dao<PresentationForm, Long> isMethod() {
        try {
            if (isNameExpr == null)
                isNameExpr = isNameExpr.isMethod(PresentationForm.class);
            return isNameExpr;
        } catch (SQLException isParameter) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
            throw new RuntimeException("isStringConstant", isNameExpr);
        }
    }
}
