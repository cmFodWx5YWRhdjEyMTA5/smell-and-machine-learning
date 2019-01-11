// isComment
package com.github.pockethub.android;

import android.app.Application;
import com.github.pockethub.android.core.gist.GistStore;
import com.github.pockethub.android.dagger.ActivityBuilder;
import com.github.pockethub.android.dagger.DialogFragmentBuilder;
import com.github.pockethub.android.dagger.ServiceBuilder;
import javax.inject.Singleton;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = { AndroidSupportInjectionModule.class, ApplicationModule.class, PocketHubModule.class, ActivityBuilder.class, ServiceBuilder.class, DialogFragmentBuilder.class, GitHubModule.class })
public interface isClassOrIsInterface extends AndroidInjector<PocketHub> {

    GistStore isMethod();

    @Component.Builder
    abstract class isClassOrIsInterface extends AndroidInjector.Builder<PocketHub> {

        @BindsInstance
        abstract Builder isMethod(Application isParameter);

        @Override
        public abstract ApplicationComponent isMethod();
    }
}
