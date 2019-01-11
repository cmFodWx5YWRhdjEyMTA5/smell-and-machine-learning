// isComment
package openfoodfacts.github.scrachx.openfood.dagger.component;

import dagger.Subcomponent;
import openfoodfacts.github.scrachx.openfood.dagger.ActivityScope;
import openfoodfacts.github.scrachx.openfood.dagger.module.ActivityModule;
import openfoodfacts.github.scrachx.openfood.views.BaseActivity;

@Subcomponent(modules = { ActivityModule.class })
@ActivityScope
public interface isClassOrIsInterface {

    FragmentComponent isMethod();

    void isMethod(BaseActivity isParameter);
}
