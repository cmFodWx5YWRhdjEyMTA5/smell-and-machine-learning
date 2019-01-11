// isComment
package cgeo.geocaching.utils;

import android.app.Activity;
import android.app.ProgressDialog;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<Params, Result> extends AbstractAsyncTaskWithProgress<Params, Integer, Result> {

    private boolean isVariable = true;

    /**
     * isComment
     */
    public isConstructor(final Activity isParameter, final String isParameter, final String isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr, true);
    }

    /**
     * isComment
     */
    public isConstructor(final Activity isParameter, final String isParameter) {
        this(isNameExpr, isNameExpr, null);
    }

    /**
     * isComment
     */
    public isConstructor(final Activity isParameter, final String isParameter, final String isParameter, final boolean isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public isConstructor(final Activity isParameter, final String isParameter, final boolean isParameter) {
        this(isNameExpr, isNameExpr, null, isNameExpr);
    }

    /**
     * isComment
     */
    @Override
    protected final void isMethod() {
        if (isNameExpr != null) {
            if (isNameExpr) {
                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, true, null);
            } else {
                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, null);
            }
        }
        isMethod();
    }

    /**
     * isComment
     */
    @Override
    protected final void isMethod(final Integer... isParameter) {
        final int isVariable = isNameExpr[isIntegerConstant];
        if (isNameExpr != null && isNameExpr >= isIntegerConstant) {
            isNameExpr.isMethod(isNameExpr);
        }
        isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    @SuppressWarnings("isStringConstant")
    @Override
    protected final Result isMethod(final Params... isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
        return isMethod(isNameExpr);
    }
}
