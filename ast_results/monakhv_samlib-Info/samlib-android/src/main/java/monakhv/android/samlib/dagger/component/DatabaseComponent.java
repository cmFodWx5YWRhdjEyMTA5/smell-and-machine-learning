// isComment
package monakhv.android.samlib.dagger.component;

import dagger.Subcomponent;
import monakhv.android.samlib.dagger.DatabaseScope;
import monakhv.android.samlib.dagger.module.DatabaseModule;
import monakhv.android.samlib.dagger.module.ServiceModule;
import monakhv.android.samlib.data.backup.AuthorStatePrefs;
import monakhv.android.samlib.service.SpecialAuthorService;
import monakhv.samlib.db.AuthorController;
import monakhv.samlib.service.SamlibOperation;
import monakhv.samlib.service.AuthorUpdateService;

/**
 * isComment
 */
@DatabaseScope
@Subcomponent(modules = { DatabaseModule.class })
public interface isClassOrIsInterface {

    ServiceComponent isMethod(ServiceModule isParameter);

    AuthorController isMethod();

    SamlibOperation isMethod();

    AuthorUpdateService isMethod();

    AuthorStatePrefs isMethod();

    SpecialAuthorService isMethod();
}
