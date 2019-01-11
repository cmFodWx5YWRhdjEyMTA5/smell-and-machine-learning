// isComment
package fr.free.nrw.commons.di;

import android.app.Activity;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ContentProvider;
import android.content.Context;
import android.support.v4.app.Fragment;
import javax.inject.Inject;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.HasBroadcastReceiverInjector;
import dagger.android.HasContentProviderInjector;
import dagger.android.HasFragmentInjector;
import dagger.android.HasServiceInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class isClassOrIsInterface implements HasActivityInjector, HasFragmentInjector, HasSupportFragmentInjector, HasServiceInjector, HasBroadcastReceiverInjector, HasContentProviderInjector {

    private static ApplicationlessInjection isVariable = null;

    @Inject
    DispatchingAndroidInjector<Activity> isVariable;

    @Inject
    DispatchingAndroidInjector<BroadcastReceiver> isVariable;

    @Inject
    DispatchingAndroidInjector<android.app.Fragment> isVariable;

    @Inject
    DispatchingAndroidInjector<Fragment> isVariable;

    @Inject
    DispatchingAndroidInjector<Service> isVariable;

    @Inject
    DispatchingAndroidInjector<ContentProvider> isVariable;

    private CommonsApplicationComponent isVariable;

    public isConstructor(Context isParameter) {
        isNameExpr = isNameExpr.isMethod().isMethod(new CommonsApplicationModule(isNameExpr)).isMethod();
        isNameExpr.isMethod(this);
    }

    @Override
    public DispatchingAndroidInjector<Activity> isMethod() {
        return isNameExpr;
    }

    @Override
    public DispatchingAndroidInjector<android.app.Fragment> isMethod() {
        return isNameExpr;
    }

    @Override
    public DispatchingAndroidInjector<Fragment> isMethod() {
        return isNameExpr;
    }

    @Override
    public DispatchingAndroidInjector<BroadcastReceiver> isMethod() {
        return isNameExpr;
    }

    @Override
    public DispatchingAndroidInjector<Service> isMethod() {
        return isNameExpr;
    }

    @Override
    public AndroidInjector<ContentProvider> isMethod() {
        return isNameExpr;
    }

    public CommonsApplicationComponent isMethod() {
        return isNameExpr;
    }

    public static ApplicationlessInjection isMethod(Context isParameter) {
        if (isNameExpr == null) {
            synchronized (ApplicationlessInjection.class) {
                if (isNameExpr == null) {
                    isNameExpr = new ApplicationlessInjection(isNameExpr);
                }
            }
        }
        return isNameExpr;
    }
}
