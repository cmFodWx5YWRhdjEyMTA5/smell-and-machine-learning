// isComment
package jp.redmine.redmineclient.adapter;

import android.view.View;
import java.sql.SQLException;
import jp.redmine.redmineclient.db.cache.DatabaseCacheHelper;
import jp.redmine.redmineclient.db.cache.RedmineVersionModel;
import jp.redmine.redmineclient.entity.RedmineProjectVersion;
import jp.redmine.redmineclient.adapter.form.IMasterRecordForm;

public class isClassOrIsInterface extends RedmineBaseAdapter<RedmineProjectVersion> {

    private RedmineVersionModel isVariable;

    protected Integer isVariable;

    protected Long isVariable;

    public isConstructor(DatabaseCacheHelper isParameter) {
        super();
        isNameExpr = new RedmineVersionModel(isNameExpr);
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
    protected void isMethod(View isParameter, RedmineProjectVersion isParameter) {
        IMasterRecordForm isVariable;
        if (isNameExpr.isMethod() != null && isNameExpr.isMethod() instanceof IMasterRecordForm) {
            isNameExpr = (IMasterRecordForm) isNameExpr.isMethod();
        } else {
            isNameExpr = new IMasterRecordForm(isNameExpr);
        }
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    protected int isMethod() throws SQLException {
        return (int) isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    protected RedmineProjectVersion isMethod(int isParameter) throws SQLException {
        return isNameExpr.isMethod(isNameExpr, isNameExpr, (long) isNameExpr, isStringConstant);
    }

    @Override
    protected long isMethod(RedmineProjectVersion isParameter) {
        if (isNameExpr == null) {
            return -isIntegerConstant;
        } else {
            return isNameExpr.isMethod();
        }
    }
}
