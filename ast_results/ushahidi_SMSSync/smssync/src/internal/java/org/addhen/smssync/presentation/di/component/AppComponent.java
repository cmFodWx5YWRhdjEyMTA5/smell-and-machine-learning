// isComment
package org.addhen.smssync.presentation.di.component;

import com.addhen.android.raiburari.presentation.di.component.ApplicationComponent;
import com.addhen.android.raiburari.presentation.di.module.ApplicationModule;
import org.addhen.smssync.data.PrefsFactory;
import org.addhen.smssync.data.cache.FileManager;
import org.addhen.smssync.data.message.PostMessage;
import org.addhen.smssync.data.message.ProcessMessageResult;
import org.addhen.smssync.data.message.TweetMessage;
import org.addhen.smssync.data.net.AppHttpClient;
import org.addhen.smssync.data.twitter.TwitterClient;
import org.addhen.smssync.domain.repository.FilterRepository;
import org.addhen.smssync.domain.repository.LogRepository;
import org.addhen.smssync.domain.repository.MessageRepository;
import org.addhen.smssync.domain.repository.WebServiceRepository;
import org.addhen.smssync.presentation.App;
import org.addhen.smssync.presentation.di.module.AppModule;
import org.addhen.smssync.presentation.di.module.InternalAppModule;
import org.addhen.smssync.presentation.presenter.AlertPresenter;
import org.addhen.smssync.presentation.presenter.DebugPresenter;
import javax.inject.Singleton;
import dagger.Component;

/**
 * isComment
 */
@Singleton
@Component(modules = { AppModule.class, InternalAppModule.class })
public interface isClassOrIsInterface extends ApplicationComponent {

    FilterRepository isMethod();

    MessageRepository isMethod();

    WebServiceRepository isMethod();

    LogRepository isMethod();

    FileManager isMethod();

    PrefsFactory isMethod();

    AppHttpClient isMethod();

    TwitterClient isMethod();

    PostMessage isMethod();

    ProcessMessageResult isMethod();

    TweetMessage isMethod();

    DebugPresenter isMethod();

    AlertPresenter isMethod();

    final class isClassOrIsInterface {

        private isConstructor() {
        }

        // isComment
        public static AppComponent isMethod(App isParameter) {
            return isNameExpr.isMethod().isMethod(new ApplicationModule(isNameExpr)).isMethod(new AppModule(isNameExpr)).isMethod();
        }
    }
}
