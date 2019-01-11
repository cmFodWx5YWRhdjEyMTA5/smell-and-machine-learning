// isComment
package com.github.pockethub.android;

import android.util.Log;
import com.bugsnag.android.Bugsnag;
import net.danlew.android.joda.JodaTimeAndroid;
import javax.inject.Inject;
import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

public class isClassOrIsInterface extends DaggerApplication {

    private ApplicationComponent isVariable;

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(this);
        isNameExpr.isMethod("isStringConstant");
    }

    @Inject
    void isMethod() {
        isNameExpr.isMethod("isStringConstant", "isStringConstant" + PocketHub.class.isMethod());
    }

    public ApplicationComponent isMethod() {
        return isNameExpr;
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> isMethod() {
        isNameExpr = (ApplicationComponent) isNameExpr.isMethod().isMethod(this).isMethod(this);
        return isNameExpr;
    }
}
