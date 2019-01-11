// isComment
package jp.redmine.redmineclient.adapter;

import android.content.Context;
import android.view.View;
import com.j256.ormlite.stmt.QueryBuilder;
import java.sql.SQLException;
import jp.redmine.redmineclient.db.cache.DatabaseCacheHelper;
import jp.redmine.redmineclient.entity.RedmineWiki;
import jp.redmine.redmineclient.adapter.form.WikiForm;

public class isClassOrIsInterface extends RedmineDaoAdapter<RedmineWiki, Long, DatabaseCacheHelper> {

    protected Integer isVariable;

    protected Long isVariable;

    public isConstructor(DatabaseCacheHelper isParameter, Context isParameter) {
        super(isNameExpr, isNameExpr, RedmineWiki.class);
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
    protected void isMethod(View isParameter, RedmineWiki isParameter) {
        WikiForm isVariable;
        if (isNameExpr.isMethod() != null && isNameExpr.isMethod() instanceof WikiForm) {
            isNameExpr = (WikiForm) isNameExpr.isMethod();
        } else {
            isNameExpr = new WikiForm(isNameExpr);
        }
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    protected QueryBuilder<RedmineWiki, Long> isMethod() throws SQLException {
        QueryBuilder<RedmineWiki, Long> isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true).isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr).isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        return isNameExpr;
    }

    @Override
    protected QueryBuilder<RedmineWiki, Long> isMethod(String isParameter) throws SQLException {
        QueryBuilder<RedmineWiki, Long> isVariable = isMethod();
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant" + isNameExpr + "isStringConstant").isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr).isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
        return isNameExpr;
    }

    @Override
    protected long isMethod(RedmineWiki isParameter) {
        if (isNameExpr == null) {
            return -isIntegerConstant;
        } else {
            return isNameExpr.isMethod();
        }
    }
}
