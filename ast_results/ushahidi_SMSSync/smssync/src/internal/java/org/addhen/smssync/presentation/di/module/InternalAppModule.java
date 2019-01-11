// isComment
package org.addhen.smssync.presentation.di.module;

import org.addhen.smssync.data.repository.InternalFilterDataRepository;
import org.addhen.smssync.data.repository.InternalLogDataRepository;
import org.addhen.smssync.data.repository.InternalMessageDataRepository;
import org.addhen.smssync.data.repository.InternalWebServiceDataRepository;
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
    MessageRepository isMethod(InternalMessageDataRepository isParameter) {
        return isNameExpr;
    }

    @Provides
    @Singleton
    WebServiceRepository isMethod(InternalWebServiceDataRepository isParameter) {
        return isNameExpr;
    }

    @Provides
    @Singleton
    LogRepository isMethod(InternalLogDataRepository isParameter) {
        return isNameExpr;
    }

    @Provides
    @Singleton
    FilterRepository isMethod(InternalFilterDataRepository isParameter) {
        return isNameExpr;
    }
}
