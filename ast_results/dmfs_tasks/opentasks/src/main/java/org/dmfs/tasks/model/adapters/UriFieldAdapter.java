// isComment
package org.dmfs.tasks.model.adapters;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import org.dmfs.tasks.model.ContentSet;
import org.dmfs.tasks.model.OnContentChangeListener;
import org.dmfs.tasks.utils.ValidatingUri;
import java.net.URISyntaxException;

/**
 * isComment
 */
public final class isClassOrIsInterface extends FieldAdapter<Uri> {

    private final String isVariable;

    private final Uri isVariable;

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
    public isConstructor(String isParameter, Uri isParameter) {
        if (isNameExpr == null) {
            throw new IllegalArgumentException("isStringConstant");
        }
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    @Override
    public Uri isMethod(ContentSet isParameter) {
        try {
            return new ValidatingUri(isNameExpr.isMethod(isNameExpr)).isMethod();
        } catch (URISyntaxException isParameter) {
            return null;
        }
    }

    @Override
    public Uri isMethod(Cursor isParameter) {
        int isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr < isIntegerConstant) {
            throw new IllegalArgumentException("isStringConstant");
        }
        try {
            return new ValidatingUri(isNameExpr.isMethod(isNameExpr)).isMethod();
        } catch (URISyntaxException isParameter) {
            return null;
        }
    }

    @Override
    public Uri isMethod(ContentSet isParameter) {
        return isNameExpr;
    }

    @Override
    public void isMethod(ContentSet isParameter, Uri isParameter) {
        if (isNameExpr == null) {
            isNameExpr.isMethod(isNameExpr, (String) null);
        } else {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        }
    }

    @Override
    public void isMethod(ContentValues isParameter, Uri isParameter) {
        if (isNameExpr == null) {
            isNameExpr.isMethod(isNameExpr);
        } else {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        }
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
