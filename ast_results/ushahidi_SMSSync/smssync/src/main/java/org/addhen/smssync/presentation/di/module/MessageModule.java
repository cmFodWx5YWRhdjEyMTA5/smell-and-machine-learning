// isComment
package org.addhen.smssync.presentation.di.module;

import com.addhen.android.raiburari.domain.usecase.Usecase;
import com.addhen.android.raiburari.presentation.di.qualifier.ActivityScope;
import org.addhen.smssync.domain.usecase.message.DeleteMessageUsecase;
import org.addhen.smssync.domain.usecase.message.ImportMessagesUsecase;
import org.addhen.smssync.domain.usecase.message.ListMessageUsecase;
import org.addhen.smssync.domain.usecase.message.ListPublishedMessageUsecase;
import org.addhen.smssync.domain.usecase.message.PublishAllMessagesUsecase;
import org.addhen.smssync.domain.usecase.message.PublishMessageUsecase;
import org.addhen.smssync.domain.usecase.message.UpdateMessageUsecase;
import javax.inject.Named;
import dagger.Module;
import dagger.Provides;

/**
 * isComment
 */
@Module
public class isClassOrIsInterface {

    @Provides
    @ActivityScope
    @Named("isStringConstant")
    Usecase isMethod(ListMessageUsecase isParameter) {
        return isNameExpr;
    }

    @Provides
    @ActivityScope
    @Named("isStringConstant")
    ListPublishedMessageUsecase isMethod(ListPublishedMessageUsecase isParameter) {
        return isNameExpr;
    }

    @Provides
    @ActivityScope
    @Named("isStringConstant")
    PublishMessageUsecase isMethod(PublishMessageUsecase isParameter) {
        return isNameExpr;
    }

    @Provides
    @ActivityScope
    @Named("isStringConstant")
    Usecase isMethod(PublishAllMessagesUsecase isParameter) {
        return isNameExpr;
    }

    @Provides
    @ActivityScope
    @Named("isStringConstant")
    DeleteMessageUsecase isMethod(DeleteMessageUsecase isParameter) {
        return isNameExpr;
    }

    @Provides
    @ActivityScope
    @Named("isStringConstant")
    Usecase isMethod(ImportMessagesUsecase isParameter) {
        return isNameExpr;
    }

    @Provides
    @ActivityScope
    @Named("isStringConstant")
    UpdateMessageUsecase isMethod(UpdateMessageUsecase isParameter) {
        return isNameExpr;
    }
}
