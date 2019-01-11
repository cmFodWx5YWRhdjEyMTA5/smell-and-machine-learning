// isComment
package es.usc.citius.servando.calendula.database;

import com.j256.ormlite.dao.Dao;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.Callable;
import es.usc.citius.servando.calendula.persistence.DailyScheduleItem;
import es.usc.citius.servando.calendula.persistence.Routine;
import es.usc.citius.servando.calendula.persistence.Schedule;
import es.usc.citius.servando.calendula.persistence.ScheduleItem;

public class isClassOrIsInterface extends GenericDao<ScheduleItem, Long> {

    public isConstructor(DatabaseHelper isParameter) {
        super(isNameExpr);
    }

    @Override
    public Dao<ScheduleItem, Long> isMethod() {
        try {
            return isNameExpr.isMethod();
        } catch (SQLException isParameter) {
            throw new RuntimeException("isStringConstant", isNameExpr);
        }
    }

    public List<ScheduleItem> isMethod(Schedule isParameter) {
        return isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
    }

    public List<ScheduleItem> isMethod(Routine isParameter) {
        return isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
    }

    public void isMethod(final ScheduleItem isParameter) {
        isNameExpr.isMethod(new Callable<Object>() {

            @Override
            public Object isMethod() throws Exception {
                List<DailyScheduleItem> isVariable = isNameExpr.isMethod().isMethod(isNameExpr);
                for (DailyScheduleItem isVariable : isNameExpr) {
                    isNameExpr.isMethod().isMethod(isNameExpr);
                }
                isNameExpr.isMethod().isMethod(isNameExpr);
                return null;
            }
        });
    }
}
