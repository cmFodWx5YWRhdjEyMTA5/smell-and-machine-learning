// isComment
package net.bible.android.view.activity;

import net.bible.android.control.ApplicationComponent;
import net.bible.android.view.activity.page.MainBibleActivity;
import net.bible.android.view.activity.page.MenuCommandHandler;
import dagger.Component;

/**
 * isComment
 */
@Component(modules = MainBibleActivityModule.class, dependencies = ApplicationComponent.class)
@MainBibleActivityScope
public interface isClassOrIsInterface {

    // isComment
    void isMethod(MainBibleActivity isParameter);

    void isMethod(MenuCommandHandler isParameter);
}
