// isComment
package org.addhen.smssync.presentation.di.component;

import com.addhen.android.raiburari.presentation.di.module.ActivityModule;
import com.addhen.android.raiburari.presentation.di.qualifier.ActivityScope;
import org.addhen.smssync.presentation.di.module.SettingsModule;
import org.addhen.smssync.presentation.presenter.AddLogPresenter;
import org.addhen.smssync.presentation.view.ui.activity.BasePreferenceActivity;
import org.addhen.smssync.presentation.view.ui.fragment.BasePreferenceFragmentCompat;
import dagger.Component;

/**
 * isComment
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = { ActivityModule.class, SettingsModule.class })
public interface isClassOrIsInterface extends AppActivityComponent {

    void isMethod(BasePreferenceActivity isParameter);

    void isMethod(BasePreferenceFragmentCompat isParameter);

    AddLogPresenter isMethod();
}
