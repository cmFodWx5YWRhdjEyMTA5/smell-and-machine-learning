// isComment
package jp.redmine.redmineclient.adapter;

import java.sql.SQLException;
import jp.redmine.redmineclient.db.store.DatabaseHelper;
import jp.redmine.redmineclient.entity.RedmineConnection;
import jp.redmine.redmineclient.adapter.form.ConnectionForm;
import android.content.Context;
import android.view.View;
import com.j256.ormlite.stmt.QueryBuilder;

public class isClassOrIsInterface extends RedmineDaoAdapter<RedmineConnection, Integer, DatabaseHelper> {

    private static final String isVariable = ConnectionListAdapter.class.isMethod();

    public isConstructor(DatabaseHelper isParameter, Context isParameter) {
        super(isNameExpr, isNameExpr, RedmineConnection.class);
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    protected void isMethod(View isParameter, RedmineConnection isParameter) {
        ConnectionForm isVariable;
        if (isNameExpr.isMethod() != null && isNameExpr.isMethod() instanceof ConnectionForm) {
            isNameExpr = (ConnectionForm) isNameExpr.isMethod();
        } else {
            isNameExpr = new ConnectionForm(isNameExpr);
        }
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    protected QueryBuilder<RedmineConnection, Integer> isMethod() throws SQLException {
        QueryBuilder<RedmineConnection, Integer> isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
        return isNameExpr;
    }

    @Override
    protected long isMethod(RedmineConnection isParameter) {
        if (isNameExpr == null) {
            return -isIntegerConstant;
        } else {
            return isNameExpr.isMethod();
        }
    }
}
