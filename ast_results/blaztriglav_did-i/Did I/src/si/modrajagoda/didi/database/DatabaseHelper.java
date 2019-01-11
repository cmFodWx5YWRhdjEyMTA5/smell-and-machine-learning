// isComment
package si.modrajagoda.didi.database;

import java.sql.SQLException;
import si.modrajagoda.didi.R;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class isClassOrIsInterface extends OrmLiteSqliteOpenHelper {

    private static final String isVariable = "isStringConstant";

    private static final int isVariable = isIntegerConstant;

    // isComment
    private Dao<Habit, Integer> isVariable;

    private Dao<Day, Integer> isVariable;

    // isComment
    public isConstructor(Context isParameter) {
        super(isNameExpr, isNameExpr, null, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    public void isMethod(SQLiteDatabase isParameter, ConnectionSource isParameter) {
        try {
            isNameExpr.isMethod(isNameExpr, Habit.class);
            isNameExpr.isMethod(isNameExpr, Day.class);
        } catch (SQLException isParameter) {
            isNameExpr.isMethod(DatabaseHelper.class.isMethod(), "isStringConstant", isNameExpr);
        }
    }

    @Override
    public void isMethod(SQLiteDatabase isParameter, ConnectionSource isParameter, int isParameter, int isParameter) {
        try {
            isNameExpr.isMethod(isNameExpr, Habit.class, true);
            isNameExpr.isMethod(isNameExpr, Day.class, true);
            isMethod(isNameExpr, isNameExpr);
        } catch (SQLException isParameter) {
            isNameExpr.isMethod(DatabaseHelper.class.isMethod(), "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr, isNameExpr);
        }
    }

    /**
     * isComment
     */
    @SuppressWarnings("isStringConstant")
    public Dao<Habit, Integer> isMethod() throws SQLException {
        if (isNameExpr == null) {
            isNameExpr = (Dao<Habit, Integer>) isMethod(Habit.class);
        }
        return (Dao<Habit, Integer>) isNameExpr;
    }

    @SuppressWarnings("isStringConstant")
    public Dao<Day, Integer> isMethod() throws SQLException {
        if (isNameExpr == null) {
            isNameExpr = (Dao<Day, Integer>) isMethod(Day.class);
        }
        return (Dao<Day, Integer>) isNameExpr;
    }

    /**
     * isComment
     */
    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr = null;
        isNameExpr = null;
    }
}
