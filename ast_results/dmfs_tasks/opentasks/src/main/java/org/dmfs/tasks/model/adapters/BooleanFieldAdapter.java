// isComment
package org.dmfs.tasks.model.adapters;

import android.content.ContentValues;
import android.database.Cursor;
import org.dmfs.tasks.model.ContentSet;
import org.dmfs.tasks.model.OnContentChangeListener;

/**
 * isComment
 */
public final class isClassOrIsInterface extends FieldAdapter<Boolean> {

    /**
     * isComment
     */
    private final String isVariable;

    /**
     * isComment
     */
    private final Boolean isVariable;

    /**
     * isComment
     */
    public isConstructor(String isParameter) {
        if (isNameExpr == null) {
            throw new IllegalArgumentException("isStringConstant");
        }
        isNameExpr = isNameExpr;
        isNameExpr = null;
    }

    /**
     * isComment
     */
    public isConstructor(String isParameter, Boolean isParameter) {
        if (isNameExpr == null) {
            throw new IllegalArgumentException("isStringConstant");
        }
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    @Override
    public Boolean isMethod(ContentSet isParameter) {
        Integer isVariable = isNameExpr.isMethod(isNameExpr);
        return isNameExpr != null && isNameExpr > isIntegerConstant;
    }

    @Override
    public Boolean isMethod(Cursor isParameter) {
        int isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr < isIntegerConstant) {
            throw new IllegalArgumentException("isStringConstant");
        }
        return !isNameExpr.isMethod(isNameExpr) && isNameExpr.isMethod(isNameExpr) > isIntegerConstant;
    }

    @Override
    public Boolean isMethod(ContentSet isParameter) {
        return isNameExpr;
    }

    @Override
    public void isMethod(ContentSet isParameter, Boolean isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr ? isIntegerConstant : isIntegerConstant);
    }

    @Override
    public void isMethod(ContentValues isParameter, Boolean isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr ? isIntegerConstant : isIntegerConstant);
    }

    @Override
    public void isMethod(ContentSet isParameter, OnContentChangeListener isParameter, boolean isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(ContentSet isParameter, OnContentChangeListener isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    public String isMethod() {
        return isNameExpr;
    }
}
