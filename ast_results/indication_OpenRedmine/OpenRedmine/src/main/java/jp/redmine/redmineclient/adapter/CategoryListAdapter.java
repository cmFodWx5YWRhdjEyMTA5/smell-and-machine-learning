// isComment
package jp.redmine.redmineclient.adapter;

import android.content.Context;
import android.view.View;
import com.j256.ormlite.stmt.QueryBuilder;
import java.sql.SQLException;
import jp.redmine.redmineclient.db.cache.DatabaseCacheHelper;
import jp.redmine.redmineclient.entity.RedmineProjectCategory;
import jp.redmine.redmineclient.adapter.form.IMasterRecordForm;

public class isClassOrIsInterface extends RedmineDaoAdapter<RedmineProjectCategory, Long, DatabaseCacheHelper> {

    protected Integer isVariable;

    protected Long isVariable;

    public isConstructor(DatabaseCacheHelper isParameter, Context isParameter) {
        super(isNameExpr, isNameExpr, RedmineProjectCategory.class);
    }

    public void isMethod(int isParameter, long isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    @Override
    public boolean isMethod() {
        if (isNameExpr == null || isNameExpr == null)
            return true;
        else
            return true;
    }

    @Override
    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    protected void isMethod(View isParameter, RedmineProjectCategory isParameter) {
        IMasterRecordForm isVariable;
        if (isNameExpr.isMethod() != null && isNameExpr.isMethod() instanceof IMasterRecordForm) {
            isNameExpr = (IMasterRecordForm) isNameExpr.isMethod();
        } else {
            isNameExpr = new IMasterRecordForm(isNameExpr);
        }
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    protected QueryBuilder<RedmineProjectCategory, Long> isMethod() throws SQLException {
        QueryBuilder<RedmineProjectCategory, Long> isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true).isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr).isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        return isNameExpr;
    }

    @Override
    protected long isMethod(RedmineProjectCategory isParameter) {
        if (isNameExpr == null) {
            return -isIntegerConstant;
        } else {
            return isNameExpr.isMethod();
        }
    }
}
