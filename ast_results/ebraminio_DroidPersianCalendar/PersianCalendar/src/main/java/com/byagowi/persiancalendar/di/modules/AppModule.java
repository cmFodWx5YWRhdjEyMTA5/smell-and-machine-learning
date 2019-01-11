// isComment
package com.byagowi.persiancalendar.di.modules;

import com.byagowi.persiancalendar.di.scopes.PerActivity;
import com.byagowi.persiancalendar.view.activity.MainActivity;
import dagger.Module;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;

@Module(includes = AndroidInjectionModule.class)
public abstract class isClassOrIsInterface {

    @PerActivity
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity isMethod();
}
