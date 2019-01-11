// isComment
package org.addhen.smssync.presentation.di.component;

import com.addhen.android.raiburari.presentation.di.module.ActivityModule;
import com.addhen.android.raiburari.presentation.di.qualifier.ActivityScope;
import org.addhen.smssync.domain.usecase.filter.DeleteFilterUsecase;
import org.addhen.smssync.presentation.di.module.FilterModule;
import org.addhen.smssync.presentation.presenter.filter.AddFilterPresenter;
import org.addhen.smssync.presentation.presenter.filter.ListFilterPresenter;
import org.addhen.smssync.presentation.presenter.webservice.UpdateWebServiceKeywordsPresenter;
import org.addhen.smssync.presentation.view.ui.fragment.AddPhoneNumberFilterFragment;
import org.addhen.smssync.presentation.view.ui.fragment.FilterFragment;
import dagger.Component;

/**
 * isComment
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = { ActivityModule.class, FilterModule.class })
public interface isClassOrIsInterface extends AppActivityComponent {

    void isMethod(FilterFragment isParameter);

    void isMethod(AddPhoneNumberFilterFragment isParameter);

    ListFilterPresenter isMethod();

    AddFilterPresenter isMethod();

    DeleteFilterUsecase isMethod();

    UpdateWebServiceKeywordsPresenter isMethod();
}
