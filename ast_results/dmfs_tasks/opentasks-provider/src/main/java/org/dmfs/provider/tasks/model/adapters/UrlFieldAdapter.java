// isComment
package org.dmfs.provider.tasks.model.adapters;

import android.content.ContentValues;
import android.database.Cursor;
import java.net.URI;
import java.net.URL;

/**
 * isComment
 */
public final class isClassOrIsInterface<EntityType> extends SimpleFieldAdapter<URI, EntityType> {

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
    public URI isMethod(ContentValues isParameter) {
        return isNameExpr.isMethod(isNameExpr) == null ? null : isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Override
    public URI isMethod(Cursor isParameter) {
        int isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr < isIntegerConstant) {
            throw new IllegalArgumentException("isStringConstant" + isNameExpr + "isStringConstant");
        }
        return isNameExpr.isMethod(isNameExpr) ? null : isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Override
    public void isMethod(ContentValues isParameter, URI isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        } else {
            isNameExpr.isMethod(isNameExpr);
        }
    }
}
