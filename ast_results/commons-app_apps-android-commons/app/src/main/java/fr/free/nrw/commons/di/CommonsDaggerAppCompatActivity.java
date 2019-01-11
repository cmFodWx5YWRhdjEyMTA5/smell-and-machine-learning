// isComment
package fr.free.nrw.commons.di;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import javax.inject.Inject;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public abstract class isClassOrIsInterface extends AppCompatActivity implements HasSupportFragmentInjector {

    @Inject
    DispatchingAndroidInjector<Fragment> isVariable;

    @Override
    protected void isMethod(@Nullable Bundle isParameter) {
        isMethod();
        super.isMethod(isNameExpr);
    }

    @Override
    public AndroidInjector<Fragment> isMethod() {
        return isNameExpr;
    }

    private void isMethod() {
        ApplicationlessInjection isVariable = isNameExpr.isMethod(isMethod());
        AndroidInjector<Activity> isVariable = isNameExpr.isMethod();
        if (isNameExpr == null) {
            throw new NullPointerException("isStringConstant");
        }
        isNameExpr.isMethod(this);
    }
}
