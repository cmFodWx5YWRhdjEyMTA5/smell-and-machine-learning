// isComment
package monakhv.android.samlib.dagger.module;

import dagger.Module;
import dagger.Provides;
import monakhv.android.samlib.dagger.DatabaseScope;
import monakhv.android.samlib.data.DataExportImport;
import monakhv.android.samlib.data.SettingsHelper;
import monakhv.android.samlib.data.backup.AuthorStatePrefs;
import monakhv.android.samlib.service.SpecialAuthorService;
import monakhv.android.samlib.sql.DatabaseHelper;
import monakhv.android.samlib.tasks.AddAuthorRestore;
import monakhv.samlib.db.AuthorController;
import monakhv.samlib.http.HttpClientController;
import monakhv.samlib.service.GuiEventBus;
import monakhv.samlib.service.SamlibOperation;
import monakhv.samlib.service.AuthorUpdateService;

/**
 * isComment
 */
@Module
public class isClassOrIsInterface {

    private final DatabaseHelper isVariable;

    public isConstructor(DatabaseHelper isParameter) {
        isNameExpr = isNameExpr;
    }

    @Provides
    @DatabaseScope
    AuthorController isMethod() {
        return new AuthorController(isNameExpr);
    }

    @Provides
    @DatabaseScope
    SamlibOperation isMethod(AuthorController isParameter, SettingsHelper isParameter, HttpClientController isParameter, GuiEventBus isParameter) {
        return new SamlibOperation(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Provides
    @DatabaseScope
    AuthorUpdateService isMethod(AuthorController isParameter, SettingsHelper isParameter, HttpClientController isParameter, GuiEventBus isParameter) {
        return new AuthorUpdateService(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Provides
    @DatabaseScope
    SpecialAuthorService isMethod(AuthorController isParameter, SettingsHelper isParameter, HttpClientController isParameter, GuiEventBus isParameter, DataExportImport isParameter) {
        return new SpecialAuthorService(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Provides
    @DatabaseScope
    AddAuthorRestore isMethod(SettingsHelper isParameter, HttpClientController isParameter, AuthorController isParameter) {
        return new AddAuthorRestore(isNameExpr, isNameExpr, isNameExpr);
    }

    @Provides
    @DatabaseScope
    AuthorStatePrefs isMethod(SettingsHelper isParameter, AuthorController isParameter, AddAuthorRestore isParameter) {
        return new AuthorStatePrefs(isNameExpr, isNameExpr, isNameExpr);
    }
}
