// isComment
package org.dmfs.provider.tasks.model.adapters;

import android.content.ContentValues;
import android.database.Cursor;

/**
 * isComment
 */
public final class isClassOrIsInterface<EntityType> extends SimpleFieldAdapter<Boolean, EntityType> {

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
    public Boolean isMethod(ContentValues isParameter) {
        Integer isVariable = isNameExpr.isMethod(isNameExpr);
        return isNameExpr != null && isNameExpr > isIntegerConstant;
    }

    @Override
    public Boolean isMethod(Cursor isParameter) {
        int isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr < isIntegerConstant) {
            throw new IllegalArgumentException("isStringConstant" + isNameExpr + "isStringConstant");
        }
        return !isNameExpr.isMethod(isNameExpr) && isNameExpr.isMethod(isNameExpr) > isIntegerConstant;
    }

    @Override
    public void isMethod(ContentValues isParameter, Boolean isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr ? isIntegerConstant : isIntegerConstant);
    }
}
