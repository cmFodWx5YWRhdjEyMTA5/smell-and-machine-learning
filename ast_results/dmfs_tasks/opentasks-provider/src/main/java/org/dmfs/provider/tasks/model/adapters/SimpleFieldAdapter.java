// isComment
package org.dmfs.provider.tasks.model.adapters;

import android.content.ContentValues;
import android.database.Cursor;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<FieldType, EntityType> implements FieldAdapter<FieldType, EntityType> {

    /**
     * isComment
     */
    abstract String isMethod();

    @Override
    public boolean isMethod(ContentValues isParameter) {
        return isNameExpr.isMethod(isMethod()) != null;
    }

    @Override
    public boolean isMethod(ContentValues isParameter) {
        return isNameExpr.isMethod(isMethod());
    }

    @Override
    public boolean isMethod(Cursor isParameter) {
        int isVariable = isNameExpr.isMethod(isMethod());
        if (isNameExpr < isIntegerConstant) {
            throw new IllegalArgumentException("isStringConstant" + isMethod() + "isStringConstant");
        }
        return !isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public FieldType isMethod(Cursor isParameter, ContentValues isParameter) {
        return isNameExpr.isMethod(isMethod()) ? isMethod(isNameExpr) : isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(Cursor isParameter, ContentValues isParameter) {
        return isMethod(isNameExpr) || isMethod(isNameExpr);
    }

    @Override
    public void isMethod(ContentValues isParameter) {
        isNameExpr.isMethod(isMethod());
    }

    @Override
    public void isMethod(Cursor isParameter, ContentValues isParameter) {
        isMethod(isNameExpr, isMethod(isNameExpr));
    }

    @Override
    public void isMethod(ContentValues isParameter, ContentValues isParameter) {
        isMethod(isNameExpr, isMethod(isNameExpr));
    }
}
