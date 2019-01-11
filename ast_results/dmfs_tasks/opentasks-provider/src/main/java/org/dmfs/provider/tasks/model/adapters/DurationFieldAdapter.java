// isComment
package org.dmfs.provider.tasks.model.adapters;

import android.content.ContentValues;
import android.database.Cursor;
import org.dmfs.rfc5545.Duration;

/**
 * isComment
 */
public final class isClassOrIsInterface<EntityType> extends SimpleFieldAdapter<Duration, EntityType> {

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
    public Duration isMethod(ContentValues isParameter) {
        String isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr == null) {
            return null;
        }
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public Duration isMethod(Cursor isParameter) {
        int isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr < isIntegerConstant) {
            throw new IllegalArgumentException("isStringConstant" + isNameExpr + "isStringConstant");
        }
        if (isNameExpr.isMethod(isNameExpr)) {
            return null;
        }
        return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Override
    public void isMethod(ContentValues isParameter, Duration isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        } else {
            isNameExpr.isMethod(isNameExpr);
        }
    }
}
