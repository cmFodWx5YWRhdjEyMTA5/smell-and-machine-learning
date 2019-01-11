// isComment
package com.btmura.android.reddit.content;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v4.content.AsyncTaskLoader;
import android.util.Log;
import com.btmura.android.reddit.content.CaptchaLoader.CaptchaResult;
import com.btmura.android.reddit.net.RedditApi;
import java.io.IOException;

public class isClassOrIsInterface extends AsyncTaskLoader<CaptchaResult> {

    public static final String isVariable = "isStringConstant";

    public static class isClassOrIsInterface {

        public String isVariable;

        public Bitmap isVariable;
    }

    private final String isVariable;

    private CaptchaResult isVariable;

    public isConstructor(Context isParameter, String isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public CaptchaResult isMethod() {
        try {
            CaptchaResult isVariable = new CaptchaResult();
            isNameExpr.isFieldAccessExpr = isNameExpr;
            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod(isNameExpr);
            return isNameExpr;
        } catch (IOException isParameter) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr);
            return null;
        }
    }

    @Override
    public void isMethod(CaptchaResult isParameter) {
        if (isMethod()) {
            isNameExpr.isFieldAccessExpr.isMethod();
            return;
        }
        CaptchaResult isVariable = isNameExpr;
        isNameExpr = isNameExpr;
        if (isMethod()) {
            super.isMethod(isNameExpr);
        }
        if (isNameExpr != null && isNameExpr != isNameExpr && !isNameExpr.isFieldAccessExpr.isMethod()) {
            isNameExpr.isFieldAccessExpr.isMethod();
        }
    }

    @Override
    protected void isMethod() {
        if (isNameExpr != null) {
            isMethod(isNameExpr);
        }
        if (isMethod() || isNameExpr == null) {
            isMethod();
        }
    }

    @Override
    protected void isMethod() {
        isMethod();
    }

    @Override
    public void isMethod(CaptchaResult isParameter) {
        if (isNameExpr != null && !isNameExpr.isFieldAccessExpr.isMethod()) {
            isNameExpr.isFieldAccessExpr.isMethod();
        }
    }

    @Override
    protected void isMethod() {
        super.isMethod();
        isMethod();
        if (isNameExpr != null && !isNameExpr.isFieldAccessExpr.isMethod()) {
            isNameExpr.isFieldAccessExpr.isMethod();
        }
        isNameExpr = null;
    }
}
