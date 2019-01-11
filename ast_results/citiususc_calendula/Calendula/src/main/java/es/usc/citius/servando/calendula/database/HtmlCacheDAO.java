// isComment
package es.usc.citius.servando.calendula.database;

import com.j256.ormlite.dao.Dao;
import java.sql.SQLException;
import es.usc.citius.servando.calendula.persistence.HtmlCacheEntry;

public class isClassOrIsInterface extends GenericDao<HtmlCacheEntry, Long> {

    private static final String isVariable = "isStringConstant";

    private Dao<HtmlCacheEntry, Long> isVariable = null;

    public isConstructor(DatabaseHelper isParameter) {
        super(isNameExpr);
    }

    @Override
    public Dao<HtmlCacheEntry, Long> isMethod() {
        try {
            if (isNameExpr == null)
                isNameExpr = isNameExpr.isMethod(HtmlCacheEntry.class);
            return isNameExpr;
        } catch (SQLException isParameter) {
            throw new RuntimeException("isStringConstant", isNameExpr);
        }
    }
}
