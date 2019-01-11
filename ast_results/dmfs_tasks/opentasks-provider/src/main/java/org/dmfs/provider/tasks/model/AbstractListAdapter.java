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
public abstract class isClassOrIsInterface implements ListAdapter {

    private final ContentValues isVariable = new ContentValues(isIntegerConstant);

    @Override
    public Uri isMethod(String isParameter) {
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr), isMethod());
    }

    @Override
    public <T> T isMethod(FieldAdapter<T, ListAdapter> isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public <T> void isMethod(FieldAdapter<T, ListAdapter> isParameter, T isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }
}
