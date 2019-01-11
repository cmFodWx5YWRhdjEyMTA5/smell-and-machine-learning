// isComment
package org.addhen.smssync.presentation.di.component;

import com.addhen.android.raiburari.presentation.di.module.ActivityModule;
import com.addhen.android.raiburari.presentation.di.qualifier.ActivityScope;
import org.addhen.smssync.presentation.di.module.MessageModule;
import org.addhen.smssync.presentation.presenter.message.ListMessagePresenter;
import org.addhen.smssync.presentation.presenter.message.ListPublishedMessagePresenter;
import org.addhen.smssync.presentation.presenter.message.PublishAllMessagesPresenter;
import org.addhen.smssync.presentation.presenter.message.PublishMessagePresenter;
import org.addhen.smssync.presentation.presenter.message.UpdateMessagePresenter;
import org.addhen.smssync.presentation.view.ui.fragment.MessageFragment;
import org.addhen.smssync.presentation.view.ui.fragment.PublishedMessageFragment;
import dagger.Component;

/**
 * isComment
 */
@ActivityScope
@Component(dependencies = AppComponent.class, modules = { ActivityModule.class, MessageModule.class })
public interface isClassOrIsInterface extends AppActivityComponent {

    void isMethod(MessageFragment isParameter);

    void isMethod(PublishedMessageFragment isParameter);

    ListMessagePresenter isMethod();

    ListPublishedMessagePresenter isMethod();

    PublishMessagePresenter isMethod();

    PublishAllMessagesPresenter isMethod();

    UpdateMessagePresenter isMethod();
}
