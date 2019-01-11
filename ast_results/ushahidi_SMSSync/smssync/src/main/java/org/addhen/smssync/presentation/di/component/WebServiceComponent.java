// isComment
package org.addhen.smssync.presentation.di.component;

import com.addhen.android.raiburari.presentation.di.module.ActivityModule;
import com.addhen.android.raiburari.presentation.di.qualifier.ActivityScope;
import org.addhen.smssync.presentation.di.module.WebServiceModule;
import org.addhen.smssync.presentation.presenter.webservice.AddWebServicePresenter;
import org.addhen.smssync.presentation.presenter.webservice.DeleteWebServicePresenter;
import org.addhen.smssync.presentation.presenter.webservice.ListWebServicePresenter;
import org.addhen.smssync.presentation.presenter.webservice.UpdateWebServiceKeywordsPresenter;
import org.addhen.smssync.presentation.presenter.webservice.UpdateWebServicePresenter;
import org.addhen.smssync.presentation.view.ui.activity.AddWebServiceActivity;
import org.addhen.smssync.presentation.view.ui.activity.ListWebServiceActivity;
import org.addhen.smssync.presentation.view.ui.activity.UpdateWebServiceActivity;
import org.addhen.smssync.presentation.view.ui.fragment.AddKeywordFragment;
import org.addhen.smssync.presentation.view.ui.fragment.AddWebServiceFragment;
import org.addhen.smssync.presentation.view.ui.fragment.ListWebServiceFragment;
import org.addhen.smssync.presentation.view.ui.fragment.UpdateWebServiceFragment;
import dagger.Component;

/**
 * isComment
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = { ActivityModule.class, WebServiceModule.class })
public interface isClassOrIsInterface extends AppActivityComponent {

    /**
     * isComment
     */
    void isMethod(AddWebServiceActivity isParameter);

    /**
     * isComment
     */
    void isMethod(AddWebServiceFragment isParameter);

    /**
     * isComment
     */
    void isMethod(ListWebServiceActivity isParameter);

    /**
     * isComment
     */
    void isMethod(UpdateWebServiceActivity isParameter);

    /**
     * isComment
     */
    void isMethod(ListWebServiceFragment isParameter);

    /**
     * isComment
     */
    void isMethod(UpdateWebServiceFragment isParameter);

    /**
     * isComment
     */
    void isMethod(AddKeywordFragment isParameter);

    /**
     * isComment
     */
    UpdateWebServicePresenter isMethod();

    /**
     * isComment
     */
    UpdateWebServiceKeywordsPresenter isMethod();

    /**
     * isComment
     */
    ListWebServicePresenter isMethod();

    /**
     * isComment
     */
    DeleteWebServicePresenter isMethod();

    /**
     * isComment
     */
    AddWebServicePresenter isMethod();
}
