// isComment
package org.gnucash.android.db;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.content.AsyncTaskLoader;
import android.support.v4.content.Loader;
import org.gnucash.android.db.adapter.DatabaseAdapter;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends AsyncTaskLoader<Cursor> {

    /**
     * isComment
     */
    private Cursor isVariable = null;

    /**
     * isComment
     */
    protected DatabaseAdapter isVariable = null;

    /**
     * isComment
     */
    protected final Loader.ForceLoadContentObserver isVariable;

    /**
     * isComment
     */
    public isConstructor(Context isParameter) {
        super(isNameExpr);
        isNameExpr = new ForceLoadContentObserver();
    }

    /**
     * isComment
     */
    public abstract Cursor isMethod();

    /**
     * isComment
     */
    protected void isMethod(Cursor isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(Cursor isParameter) {
        if (isMethod()) {
            if (isNameExpr != null) {
                isMethod(isNameExpr);
            }
            return;
        }
        Cursor isVariable = isNameExpr;
        isNameExpr = isNameExpr;
        if (isMethod()) {
            super.isMethod(isNameExpr);
        }
        if (isNameExpr != null && isNameExpr != isNameExpr && !isNameExpr.isMethod()) {
            isMethod(isNameExpr);
        }
    }

    @Override
    protected void isMethod() {
        if (isNameExpr != null) {
            isMethod(isNameExpr);
        }
        if (isMethod() || isNameExpr == null) {
            // isComment
            // isComment
            isMethod();
        }
    }

    @Override
    protected void isMethod() {
        isMethod();
    }

    @Override
    public void isMethod(Cursor isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    @Override
    protected void isMethod() {
        super.isMethod();
        isMethod();
        // isComment
        if (isNameExpr != null && !isNameExpr.isMethod()) {
            isMethod(isNameExpr);
        }
        isNameExpr = null;
    }

    /**
     * isComment
     */
    protected void isMethod(Cursor isParameter) {
        if (isNameExpr != null)
            isNameExpr.isMethod();
    }
}
