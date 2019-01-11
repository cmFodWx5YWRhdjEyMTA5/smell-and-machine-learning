// isComment
package org.wordpress.android;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.yarolegovich.wellsql.WellSql;
import com.yarolegovich.wellsql.WellTableManager;
import com.yarolegovich.wellsql.core.TableClass;
import org.wordpress.android.fluxc.model.AccountModel;
import org.wordpress.android.fluxc.model.PostModel;
import org.wordpress.android.fluxc.model.SiteModel;
import org.wordpress.android.fluxc.persistence.WellSqlConfig;

public class isClassOrIsInterface extends WellSqlConfig {

    private static final Class[] isVariable = { AccountModel.class, SiteModel.class, PostModel.class };

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public void isMethod(SQLiteDatabase isParameter, WellTableManager isParameter) {
        for (Class isVariable : isNameExpr) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    /**
     * isComment
     */
    public void isMethod() {
        SQLiteDatabase isVariable = isNameExpr.isMethod();
        for (Class isVariable : isNameExpr) {
            TableClass isVariable = isMethod(isNameExpr);
            isNameExpr.isMethod("isStringConstant" + isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
    }
}
