// isComment
package org.dmfs.tasks.model.adapters;

import android.content.ContentValues;
import android.database.Cursor;
import org.dmfs.tasks.model.ContentSet;
import org.dmfs.tasks.model.OnContentChangeListener;

/**
 * isComment
 */
public class isClassOrIsInterface extends FieldAdapter<Integer> {

    /**
     * isComment
     */
    private final String isVariable;

    /**
     * isComment
     */
    private final Integer isVariable;

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
    public isConstructor(String isParameter, Integer isParameter) {
        if (isNameExpr == null) {
            throw new IllegalArgumentException("isStringConstant");
        }
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    @Override
    public Integer isMethod(ContentSet isParameter) {
        // isComment
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public Integer isMethod(Cursor isParameter) {
        int isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr < isIntegerConstant) {
            throw new IllegalArgumentException("isStringConstant");
        }
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public Integer isMethod(ContentSet isParameter) {
        return isNameExpr;
    }

    @Override
    public void isMethod(ContentSet isParameter, Integer isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(ContentValues isParameter, Integer isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(ContentSet isParameter, OnContentChangeListener isParameter, boolean isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(ContentSet isParameter, OnContentChangeListener isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }
}
