// isComment
package org.addhen.smssync.presentation.di.component;

import org.addhen.smssync.presentation.di.module.ServiceModule;
import org.addhen.smssync.presentation.di.qualifier.ServiceScope;
import org.addhen.smssync.presentation.presenter.message.DeleteMessagePresenter;
import org.addhen.smssync.presentation.presenter.message.PublishMessagePresenter;
import org.addhen.smssync.presentation.presenter.message.UpdateMessagePresenter;
import org.addhen.smssync.presentation.service.AutoSyncScheduledService;
import org.addhen.smssync.presentation.service.BaseWakefulIntentService;
import org.addhen.smssync.presentation.service.CheckTaskService;
import org.addhen.smssync.presentation.service.DeleteMessageService;
import org.addhen.smssync.presentation.service.MessageResultsService;
import org.addhen.smssync.presentation.service.SmsReceiverService;
import org.addhen.smssync.presentation.service.SyncPendingMessagesService;
import org.addhen.smssync.presentation.service.UpdateMessageService;
import dagger.Component;

@ServiceScope
@Component(dependencies = { AppComponent.class }, modules = { ServiceModule.class })
public interface isClassOrIsInterface {

    void isMethod(SmsReceiverService isParameter);

    void isMethod(BaseWakefulIntentService isParameter);

    void isMethod(CheckTaskService isParameter);

    void isMethod(DeleteMessageService isParameter);

    void isMethod(MessageResultsService isParameter);

    void isMethod(UpdateMessageService isParameter);

    void isMethod(SyncPendingMessagesService isParameter);

    void isMethod(AutoSyncScheduledService isParameter);

    UpdateMessagePresenter isMethod();

    DeleteMessagePresenter isMethod();

    PublishMessagePresenter isMethod();
}
