// isComment
package monakhv.android.samlib.dagger.module;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import monakhv.android.samlib.data.DataExportImport;
import monakhv.android.samlib.data.Logger;
import monakhv.android.samlib.data.SettingsHelper;
import monakhv.samlib.http.HttpClientController;
import monakhv.samlib.service.AuthorSearchService;
import monakhv.samlib.service.GuiEventBus;
import monakhv.samlib.service.BookDownloadService;
import javax.inject.Singleton;

/**
 * isComment
 */
@Module
public class isClassOrIsInterface {

    @Provides
    @Singleton
    SettingsHelper isMethod(Context isParameter) {
        return new SettingsHelper(isNameExpr);
    }

    @Provides
    @Singleton
    Logger isMethod(SettingsHelper isParameter) {
        return new Logger(isNameExpr);
    }

    @Provides
    @Singleton
    HttpClientController isMethod(SettingsHelper isParameter) {
        return new HttpClientController(isNameExpr);
    }

    @Provides
    @Singleton
    DataExportImport isMethod(SettingsHelper isParameter) {
        return new DataExportImport(isNameExpr);
    }

    @Provides
    @Singleton
    public GuiEventBus isMethod() {
        return new GuiEventBus();
    }

    @Provides
    @Singleton
    public AuthorSearchService isMethod(HttpClientController isParameter, SettingsHelper isParameter) {
        return new AuthorSearchService(isNameExpr, isNameExpr);
    }

    @Provides
    @Singleton
    BookDownloadService isMethod(SettingsHelper isParameter, HttpClientController isParameter) {
        return new BookDownloadService(isNameExpr, isNameExpr);
    }
}
