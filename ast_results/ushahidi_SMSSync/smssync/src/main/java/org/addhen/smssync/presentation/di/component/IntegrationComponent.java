// isComment
package org.addhen.smssync.presentation.di.component;

import com.addhen.android.raiburari.presentation.di.module.ActivityModule;
import com.addhen.android.raiburari.presentation.di.qualifier.ActivityScope;
import org.addhen.smssync.presentation.di.module.IntegrationModule;
import org.addhen.smssync.presentation.presenter.integration.IntegrationPresenter;
import org.addhen.smssync.presentation.view.ui.fragment.IntegrationFragment;
import dagger.Component;

/**
 * isComment
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = { ActivityModule.class, IntegrationModule.class })
public interface isClassOrIsInterface extends AppActivityComponent {

    void isMethod(IntegrationFragment isParameter);

    IntegrationPresenter isMethod();
}
