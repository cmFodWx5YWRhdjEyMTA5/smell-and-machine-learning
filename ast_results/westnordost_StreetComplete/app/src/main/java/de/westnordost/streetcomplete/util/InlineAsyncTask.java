// isComment
package de.westnordost.streetcomplete.util;

import android.os.AsyncTask;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T> extends AsyncTask<Void, Void, T> implements AsyncTaskListener<T> {

    private Exception isVariable;

    protected abstract T isMethod() throws Exception;

    public abstract void isMethod(T isParameter);

    public abstract void isMethod(Exception isParameter);

    @Override
    protected final T isMethod(Void... isParameter) {
        try {
            return isMethod();
        } catch (Exception isParameter) {
            isNameExpr = isNameExpr;
            isMethod(true);
        }
        return null;
    }

    @Override
    protected void isMethod(T isParameter) {
        isMethod(isNameExpr);
    }

    @Override
    protected final void isMethod() {
        isMethod(isNameExpr);
    }
}
