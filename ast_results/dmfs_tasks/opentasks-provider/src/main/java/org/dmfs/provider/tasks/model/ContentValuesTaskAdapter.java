// isComment
package org.dmfs.provider.tasks.model;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import org.dmfs.provider.tasks.TaskDatabaseHelper;
import org.dmfs.provider.tasks.model.adapters.FieldAdapter;
import org.dmfs.tasks.contract.TaskContract;

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractTaskAdapter {

    private long isVariable;

    private final ContentValues isVariable;

    public isConstructor(ContentValues isParameter) {
        this(-isStringConstant, isNameExpr);
    }

    public isConstructor(long isParameter, ContentValues isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    @Override
    public long isMethod() {
        return isNameExpr;
    }

    @Override
    public <T> T isMethod(FieldAdapter<T, TaskAdapter> isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public <T> T isMethod(FieldAdapter<T, TaskAdapter> isParameter) {
        return null;
    }

    @Override
    public boolean isMethod(FieldAdapter<?, TaskAdapter> isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public boolean isMethod() {
        return isNameExpr.isMethod() > isIntegerConstant;
    }

    @Override
    public <T> void isMethod(FieldAdapter<T, TaskAdapter> isParameter, T isParameter) throws IllegalStateException {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(FieldAdapter<?, TaskAdapter> isParameter) throws IllegalStateException {
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public int isMethod(SQLiteDatabase isParameter) {
        if (isNameExpr.isMethod() == isIntegerConstant) {
            return isIntegerConstant;
        }
        if (isNameExpr < isIntegerConstant) {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null, isNameExpr);
            return isNameExpr > isIntegerConstant ? isIntegerConstant : isIntegerConstant;
        } else {
            return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr, null);
        }
    }

    @Override
    public TaskAdapter isMethod() {
        return new ContentValuesTaskAdapter(new ContentValues(isNameExpr));
    }
}
