// isComment
package com.fsck.k9.activity.misc;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.AsyncTask;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<Params, Progress, Result> extends AsyncTask<Params, Progress, Result> implements NonConfigurationInstance {

    protected Activity isVariable;

    protected Context isVariable;

    protected ProgressDialog isVariable;

    protected isConstructor(Activity isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    @Override
    public void isMethod(Activity isParameter) {
        isNameExpr = isNameExpr;
        isMethod();
    }

    /**
     * isComment
     */
    @Override
    public boolean isMethod() {
        boolean isVariable = true;
        if (isNameExpr != null) {
            isMethod();
            isNameExpr = true;
        }
        isNameExpr = null;
        return isNameExpr;
    }

    /**
     * isComment
     */
    protected abstract void isMethod();

    protected void isMethod() {
        isNameExpr.isMethod();
        isNameExpr = null;
    }

    /**
     * isComment
     */
    @Override
    protected void isMethod() {
        isMethod();
    }
}
