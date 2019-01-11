// isComment
package org.dmfs.provider.tasks.model;

import android.content.ContentUris;
import android.content.ContentValues;
import android.net.Uri;
import org.dmfs.provider.tasks.model.adapters.FieldAdapter;
import org.dmfs.tasks.contract.TaskContract;

/**
 * isComment
 */
public abstract class isClassOrIsInterface implements TaskAdapter {

    private final ContentValues isVariable = new ContentValues(isIntegerConstant);

    @Override
    public Uri isMethod(String isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr), isMethod());
    }

    @Override
    public boolean isMethod() {
        return isMethod(isNameExpr) != null || isMethod(isNameExpr).isMethod().isMethod();
    }

    @Override
    public boolean isMethod() {
        return isMethod(isNameExpr) || isMethod(isNameExpr) || isMethod(isNameExpr) || isMethod(isNameExpr) || isMethod(isNameExpr) || isMethod(isNameExpr);
    }

    @Override
    public <T> T isMethod(FieldAdapter<T, TaskAdapter> isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public <T> void isMethod(FieldAdapter<T, TaskAdapter> isParameter, T isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }
}
