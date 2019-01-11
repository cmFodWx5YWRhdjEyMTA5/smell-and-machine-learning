// isComment
package org.addhen.smssync.presentation.di.component;

import com.addhen.android.raiburari.presentation.di.component.ApplicationComponent;
import com.addhen.android.raiburari.presentation.di.module.ActivityModule;
import com.addhen.android.raiburari.presentation.di.qualifier.ActivityScope;
import org.addhen.smssync.presentation.view.ui.activity.MainActivity;
import org.addhen.smssync.presentation.view.ui.navigation.Launcher;
import dagger.Component;

@ActivityScope
@Component(dependencies = ApplicationComponent.class, modules = { ActivityModule.class })
public interface isClassOrIsInterface {

    void isMethod(MainActivity isParameter);

    Launcher isMethod();
}
