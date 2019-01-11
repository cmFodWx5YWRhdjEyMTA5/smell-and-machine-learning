// isComment
package org.musicbrainz.picard.barcodescanner.tasks;

import android.os.AsyncTask;

public abstract class isClassOrIsInterface<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> {

    private Boolean isVariable = true;

    private TaskCallback<Result> isVariable;

    public TaskCallback<Result> isMethod() {
        return isNameExpr;
    }

    public void isMethod(TaskCallback<Result> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    private TaskCallback<Exception> isVariable;

    public TaskCallback<Exception> isMethod() {
        return isNameExpr;
    }

    public void isMethod(TaskCallback<Exception> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected void isMethod(Result isParameter) {
        if (isNameExpr != null && !isNameExpr) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    /*isComment*/
    protected void isMethod(Exception isParameter) {
        if (isNameExpr != null) {
            isNameExpr = true;
            isNameExpr.isMethod(isNameExpr);
        }
    }
}
