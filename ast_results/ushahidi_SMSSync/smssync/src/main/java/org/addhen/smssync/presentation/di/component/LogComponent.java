// isComment
package org.addhen.smssync.presentation.di.component;

import com.addhen.android.raiburari.presentation.di.module.ActivityModule;
import com.addhen.android.raiburari.presentation.di.qualifier.ActivityScope;
import org.addhen.smssync.presentation.di.module.LogModule;
import org.addhen.smssync.presentation.presenter.DeleteLogPresenter;
import org.addhen.smssync.presentation.presenter.ListLogPresenter;
import org.addhen.smssync.presentation.view.ui.fragment.LogFragment;
import dagger.Component;

/**
 * isComment
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = { ActivityModule.class, LogModule.class })
public interface isClassOrIsInterface extends AppActivityComponent {

    void isMethod(LogFragment isParameter);

    ListLogPresenter isMethod();

    DeleteLogPresenter isMethod();
}
