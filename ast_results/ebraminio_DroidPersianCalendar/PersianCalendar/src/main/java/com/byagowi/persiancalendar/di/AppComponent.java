// isComment
package com.byagowi.persiancalendar.di;

import com.byagowi.persiancalendar.MainApplication;
import com.byagowi.persiancalendar.di.modules.AppModule;
import javax.inject.Singleton;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = { AndroidSupportInjectionModule.class, AppModule.class })
public interface isClassOrIsInterface extends AndroidInjector<MainApplication> {

    @Component.Builder
    abstract class isClassOrIsInterface extends AndroidInjector.Builder<MainApplication> {
    }
}
