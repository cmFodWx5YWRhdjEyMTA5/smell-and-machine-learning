// isComment
package fr.free.nrw.commons.di;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import javax.inject.Inject;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;

public abstract class isClassOrIsInterface extends Fragment implements HasSupportFragmentInjector {

    @Inject
    DispatchingAndroidInjector<Fragment> isVariable;

    @Override
    public void isMethod(Context isParameter) {
        isMethod();
        super.isMethod(isNameExpr);
    }

    @Override
    public AndroidInjector<Fragment> isMethod() {
        return isNameExpr;
    }

    public void isMethod() {
        HasSupportFragmentInjector isVariable = isMethod();
        AndroidInjector<Fragment> isVariable = isNameExpr.isMethod();
        if (isNameExpr == null) {
            throw new NullPointerException(isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod()));
        }
        isNameExpr.isMethod(this);
    }

    private HasSupportFragmentInjector isMethod() {
        Fragment isVariable = this;
        while ((isNameExpr = isNameExpr.isMethod()) != null) {
            if (isNameExpr instanceof HasSupportFragmentInjector) {
                return (HasSupportFragmentInjector) isNameExpr;
            }
        }
        Activity isVariable = isMethod();
        if (isNameExpr instanceof HasSupportFragmentInjector) {
            return (HasSupportFragmentInjector) isNameExpr;
        }
        ApplicationlessInjection isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
        if (isNameExpr != null) {
            return isNameExpr;
        }
        throw new IllegalArgumentException(isNameExpr.isMethod("isStringConstant", isMethod().isMethod()));
    }
}
