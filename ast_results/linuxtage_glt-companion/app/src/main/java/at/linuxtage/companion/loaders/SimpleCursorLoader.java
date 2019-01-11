// isComment
package at.linuxtage.companion.loaders;

import android.content.Context;
import android.database.Cursor;
import android.support.v4.content.AsyncTaskLoader;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends AsyncTaskLoader<Cursor> {

    private final ForceLoadContentObserver isVariable;

    private Cursor isVariable;

    /*isComment*/
    @Override
    public Cursor isMethod() {
        Cursor isVariable = isMethod();
        if (isNameExpr != null) {
            // isComment
            isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr;
    }

    /*isComment*/
    @Override
    public void isMethod(Cursor isParameter) {
        if (isMethod()) {
            // isComment
            if (isNameExpr != null) {
                isNameExpr.isMethod();
            }
            return;
        }
        Cursor isVariable = isNameExpr;
        isNameExpr = isNameExpr;
        if (isMethod()) {
            super.isMethod(isNameExpr);
        }
        if (isNameExpr != null && isNameExpr != isNameExpr && !isNameExpr.isMethod()) {
            isNameExpr.isMethod();
        }
    }

    public isConstructor(Context isParameter) {
        super(isNameExpr);
        isNameExpr = new ForceLoadContentObserver();
    }

    /**
     * isComment
     */
    @Override
    protected void isMethod() {
        if (isNameExpr != null) {
            isMethod(isNameExpr);
        }
        if (isMethod() || isNameExpr == null) {
            isMethod();
        }
    }

    /**
     * isComment
     */
    @Override
    protected void isMethod() {
        // isComment
        isMethod();
    }

    @Override
    public void isMethod(Cursor isParameter) {
        if (isNameExpr != null && !isNameExpr.isMethod()) {
            isNameExpr.isMethod();
        }
        // isComment
        isMethod();
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        // isComment
        isMethod();
        if (isNameExpr != null && !isNameExpr.isMethod()) {
            isNameExpr.isMethod();
        }
        isNameExpr = null;
    }

    protected abstract Cursor isMethod();
}
