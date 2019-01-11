// isComment
package org.dmfs.provider.tasks.model.adapters;

import android.content.ContentValues;
import android.database.Cursor;

/**
 * isComment
 */
public final class isClassOrIsInterface<EntityType> extends SimpleFieldAdapter<Integer, EntityType> {

    /**
     * isComment
     */
    private final String isVariable;

    /**
     * isComment
     */
    public isConstructor(String isParameter) {
        if (isNameExpr == null) {
            throw new IllegalArgumentException("isStringConstant");
        }
        isNameExpr = isNameExpr;
    }

    @Override
    String isMethod() {
        return isNameExpr;
    }

    @Override
    public Integer isMethod(ContentValues isParameter) {
        // isComment
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public Integer isMethod(Cursor isParameter) {
        int isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr < isIntegerConstant) {
            throw new IllegalArgumentException("isStringConstant" + isNameExpr + "isStringConstant");
        }
        return isNameExpr.isMethod(isNameExpr) ? null : isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(ContentValues isParameter, Integer isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        } else {
            isNameExpr.isMethod(isNameExpr);
        }
    }
}
