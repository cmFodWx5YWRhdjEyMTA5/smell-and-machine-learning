// isComment
package monakhv.android.samlib.dagger.component;

import dagger.Component;
import javax.inject.Singleton;
import monakhv.android.samlib.SamlibApplication;
import monakhv.android.samlib.dagger.module.ApiModule;
import monakhv.android.samlib.dagger.module.ApplicationModule;
import monakhv.android.samlib.dagger.module.DatabaseModule;
import monakhv.android.samlib.receiver.AutoStartUp;
import monakhv.android.samlib.receiver.UpdateReceiver;
import monakhv.samlib.http.HttpClientController;
import monakhv.samlib.service.GuiEventBus;
import monakhv.samlib.service.AuthorSearchService;
import monakhv.samlib.service.BookDownloadService;

/**
 * isComment
 */
@Component(modules = { ApplicationModule.class, ApiModule.class })
@Singleton
public interface isClassOrIsInterface {

    void isMethod(SamlibApplication isParameter);

    void isMethod(AutoStartUp isParameter);

    void isMethod(UpdateReceiver isParameter);

    GuiEventBus isMethod();

    HttpClientController isMethod();

    DatabaseComponent isMethod(DatabaseModule isParameter);

    AuthorSearchService isMethod();

    BookDownloadService isMethod();
}
