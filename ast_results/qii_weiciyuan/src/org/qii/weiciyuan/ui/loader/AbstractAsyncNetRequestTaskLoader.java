// isComment
package org.qii.weiciyuan.ui.loader;

import org.qii.weiciyuan.bean.android.AsyncTaskLoaderResult;
import org.qii.weiciyuan.support.error.WeiboException;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.content.AsyncTaskLoader;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T> extends AsyncTaskLoader<AsyncTaskLoaderResult<T>> {

    private AsyncTaskLoaderResult<T> isVariable;

    private Bundle isVariable;

    public isConstructor(Context isParameter) {
        super(isNameExpr);
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        if (isNameExpr == null) {
            isMethod();
        } else {
            isMethod(isNameExpr);
        }
    }

    @Override
    public AsyncTaskLoaderResult<T> isMethod() {
        T isVariable = null;
        WeiboException isVariable = null;
        try {
            isNameExpr = isMethod();
        } catch (WeiboException isParameter) {
            isNameExpr = isNameExpr;
        }
        isNameExpr = new AsyncTaskLoaderResult<T>();
        isNameExpr.isFieldAccessExpr = isNameExpr;
        isNameExpr.isFieldAccessExpr = isNameExpr;
        isNameExpr.isFieldAccessExpr = this.isFieldAccessExpr;
        return isNameExpr;
    }

    protected abstract T isMethod() throws WeiboException;

    public void isMethod(Bundle isParameter) {
        if (isNameExpr != null) {
            throw new IllegalArgumentException("isStringConstant");
        }
        this.isFieldAccessExpr = isNameExpr;
    }
}
