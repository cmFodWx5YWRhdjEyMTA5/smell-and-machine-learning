// isComment
package com.byagowi.persiancalendar;

import com.byagowi.persiancalendar.di.DaggerAppComponent;
import com.byagowi.persiancalendar.util.Utils;
import dagger.android.AndroidInjector;
import dagger.android.support.DaggerApplication;

public class isClassOrIsInterface extends DaggerApplication {

    @Override
    public void isMethod() {
        super.isMethod();
        isNameExpr.isMethod(this);
        isNameExpr.isMethod(isMethod());
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> isMethod() {
        return isNameExpr.isMethod().isMethod(this);
    }
}
