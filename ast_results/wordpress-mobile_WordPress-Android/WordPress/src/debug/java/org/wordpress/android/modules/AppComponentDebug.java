// isComment
package org.wordpress.android.modules;

import android.app.Application;
import org.wordpress.android.fluxc.module.DebugOkHttpClientModule;
import org.wordpress.android.fluxc.module.ReleaseBaseModule;
import org.wordpress.android.fluxc.module.ReleaseNetworkModule;
import org.wordpress.android.fluxc.module.ReleaseToolsModule;
import org.wordpress.android.login.di.LoginFragmentModule;
import org.wordpress.android.login.di.LoginServiceModule;
import javax.inject.Singleton;
import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = { ApplicationModule.class, AppConfigModule.class, ReleaseBaseModule.class, DebugOkHttpClientModule.class, InterceptorModule.class, ReleaseNetworkModule.class, LegacyModule.class, ReleaseToolsModule.class, AndroidSupportInjectionModule.class, ViewModelModule.class, // isComment
LoginAnalyticsModule.class, LoginFragmentModule.class, LoginServiceModule.class, SupportModule.class, ThreadModule.class })
public interface isClassOrIsInterface extends AppComponent {

    @Component.Builder
    interface isClassOrIsInterface extends AppComponent.Builder {

        @Override
        @BindsInstance
        AppComponentDebug.Builder isMethod(Application isParameter);
    }
}
