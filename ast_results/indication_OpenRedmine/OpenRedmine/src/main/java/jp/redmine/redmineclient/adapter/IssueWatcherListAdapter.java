// isComment
package jp.redmine.redmineclient.adapter;

import android.content.Context;
import android.view.View;
import com.j256.ormlite.stmt.QueryBuilder;
import com.j256.ormlite.stmt.Where;
import java.sql.SQLException;
import jp.redmine.redmineclient.adapter.form.IMasterRecordForm;
import jp.redmine.redmineclient.db.cache.DatabaseCacheHelper;
import jp.redmine.redmineclient.entity.RedmineWatcher;

public class isClassOrIsInterface extends RedmineDaoAdapter<RedmineWatcher, Long, DatabaseCacheHelper> {

    protected Integer isVariable;

    protected Integer isVariable;

    public isConstructor(DatabaseCacheHelper isParameter, Context isParameter) {
        super(isNameExpr, isNameExpr, RedmineWatcher.class);
    }

    public void isMethod(int isParameter, int isParameter) {
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
    protected void isMethod(View isParameter, RedmineWatcher isParameter) {
        IMasterRecordForm isVariable;
        if (isNameExpr.isMethod() != null && isNameExpr.isMethod() instanceof IMasterRecordForm) {
            isNameExpr = (IMasterRecordForm) isNameExpr.isMethod();
        } else {
            isNameExpr = new IMasterRecordForm(isNameExpr);
        }
        isNameExpr.isMethod(isNameExpr.isMethod());
    }

    @Override
    protected long isMethod(RedmineWatcher isParameter) {
        if (isNameExpr == null) {
            return -isIntegerConstant;
        } else {
            return isNameExpr.isMethod();
        }
    }

    @Override
    protected QueryBuilder<RedmineWatcher, Long> isMethod() throws SQLException {
        QueryBuilder<RedmineWatcher, Long> isVariable = isNameExpr.isMethod();
        Where<RedmineWatcher, Long> isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr).isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
        return isNameExpr;
    }
}
