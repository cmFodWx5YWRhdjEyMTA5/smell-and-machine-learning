// isComment
package com.github.andlyticsproject.util;

import android.os.AsyncTask;

public abstract class isClassOrIsInterface<Params, Progress, Result, Parent> extends AsyncTask<Params, Progress, Result> {

    protected Parent isVariable;

    public isConstructor(Parent isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public void isMethod(Parent isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public DetachableAsyncTask<Params, Progress, Result, Parent> isMethod() {
        isNameExpr = null;
        return this;
    }

    Parent isMethod() {
        return isNameExpr;
    }
}
