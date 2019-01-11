// isComment
package org.addhen.smssync.presentation.di.module;

import org.addhen.smssync.data.repository.FilterDataRepository;
import org.addhen.smssync.data.repository.LogDataRepository;
import org.addhen.smssync.data.repository.MessageDataRepository;
import org.addhen.smssync.data.repository.WebServiceDataRepository;
import org.addhen.smssync.domain.repository.FilterRepository;
import org.addhen.smssync.domain.repository.LogRepository;
import org.addhen.smssync.domain.repository.MessageRepository;
import org.addhen.smssync.domain.repository.WebServiceRepository;
import javax.inject.Singleton;
import dagger.Module;
import dagger.Provides;

/**
 * isComment
 */
@Module
public class isClassOrIsInterface {

    @Provides
    @Singleton
    MessageRepository isMethod(MessageDataRepository isParameter) {
        return isNameExpr;
    }

    @Provides
    @Singleton
    WebServiceRepository isMethod(WebServiceDataRepository isParameter) {
        return isNameExpr;
    }

    @Provides
    @Singleton
    FilterRepository isMethod(FilterDataRepository isParameter) {
        return isNameExpr;
    }

    @Provides
    @Singleton
    LogRepository isMethod(LogDataRepository isParameter) {
        return isNameExpr;
    }
}
