// isComment
package jp.redmine.redmineclient.db.store;

import java.sql.SQLException;
import jp.redmine.redmineclient.entity.RedmineConnection;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

public class isClassOrIsInterface extends OrmLiteSqliteOpenHelper {

    private static String isVariable = "isStringConstant";

    private static int isVariable = isIntegerConstant;

    public isConstructor(Context isParameter) {
        super(isNameExpr, isNameExpr, null, isNameExpr);
    }

    @Override
    public void isMethod(SQLiteDatabase isParameter, ConnectionSource isParameter) {
        try {
            isNameExpr.isMethod(isNameExpr, RedmineConnection.class);
        } catch (SQLException isParameter) {
            isNameExpr.isMethod("isStringConstant", "isStringConstant", isNameExpr);
        }
    }

    @Override
    public void isMethod(SQLiteDatabase isParameter, ConnectionSource isParameter, int isParameter, int isParameter) {
        switch(isNameExpr) {
            case isIntegerConstant:
                isMethod(isNameExpr, RedmineConnection.class, "isStringConstant", isNameExpr.isFieldAccessExpr);
        }
    }

    private void isMethod(SQLiteDatabase isParameter, Class<?> isParameter, String isParameter, int isParameter) {
        isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant");
    }
}
