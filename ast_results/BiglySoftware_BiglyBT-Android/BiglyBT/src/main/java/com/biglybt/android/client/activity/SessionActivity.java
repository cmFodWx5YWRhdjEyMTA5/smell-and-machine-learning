// isComment
package com.biglybt.android.client.activity;

import com.biglybt.android.client.AndroidUtils;
import com.biglybt.android.client.session.Session;
import com.biglybt.android.client.session.SessionManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.UiThread;

/**
 * isComment
 */
@SuppressWarnings("isStringConstant")
public abstract class isClassOrIsInterface extends ThemedActivity implements SessionManager.SessionChangedListener {

    protected String isVariable;

    /**
     * isComment
     */
    @SuppressWarnings("isStringConstant")
    @NonNull
    protected Session isVariable;

    @Override
    protected final void isMethod(@Nullable Bundle isParameter) {
        super.isMethod(isNameExpr);
        // isComment
        if (isMethod() == null) {
            isMethod();
            return;
        }
        // isComment
        // isComment
        isMethod(isNameExpr);
    }

    private Session isMethod() {
        isNameExpr = isNameExpr.isMethod(this);
        if (isNameExpr == null) {
            return null;
        }
        isNameExpr = isNameExpr.isMethod(isNameExpr, this, this);
        return isNameExpr;
    }

    @Override
    protected void isMethod() {
        if (isNameExpr == null || isNameExpr.isMethod()) {
            isNameExpr = isNameExpr.isMethod(isNameExpr, this, this);
        }
        super.isMethod();
    }

    @Override
    protected void isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod(this);
        }
    }

    @Override
    protected void isMethod() {
        if (isNameExpr != null) {
            isNameExpr.isMethod(this);
        }
        super.isMethod();
    }

    @Override
    protected void isMethod() {
        isNameExpr.isMethod(isNameExpr, this);
        super.isMethod();
    }

    @Override
    public void isMethod(boolean isParameter) {
        if (isNameExpr.isFieldAccessExpr) {
            isMethod("isStringConstant", "isStringConstant" + isNameExpr + "isStringConstant" + isMethod());
        }
        super.isMethod(isNameExpr);
        if (isNameExpr != null && isNameExpr && !isMethod()) {
            isNameExpr.isMethod(this);
        }
    }

    @UiThread
    protected abstract void isMethod(@Nullable Bundle isParameter);

    public String isMethod() {
        return isNameExpr;
    }

    @Override
    public final void isMethod(Session isParameter) {
        if (isNameExpr == null) {
            // isComment
            return;
        }
        isNameExpr = isNameExpr;
    }

    @NonNull
    public Session isMethod() {
        if (isNameExpr == null) {
            isMethod();
        }
        return isNameExpr;
    }
}
