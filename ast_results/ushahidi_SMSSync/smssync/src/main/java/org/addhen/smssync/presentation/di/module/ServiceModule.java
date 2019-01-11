// isComment
package org.addhen.smssync.presentation.di.module;

import org.addhen.smssync.domain.usecase.message.DeleteMessageUsecase;
import org.addhen.smssync.domain.usecase.message.PublishMessageUsecase;
import org.addhen.smssync.domain.usecase.message.UpdateMessageUsecase;
import org.addhen.smssync.presentation.di.qualifier.ServiceScope;
import android.app.Service;
import javax.inject.Named;
import dagger.Module;
import dagger.Provides;

/**
 * isComment
 */
@Module
public class isClassOrIsInterface {

    private final Service isVariable;

    public isConstructor(Service isParameter) {
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    @Provides
    @ServiceScope
    Service isMethod() {
        return isNameExpr;
    }

    @Provides
    @ServiceScope
    @Named("isStringConstant")
    UpdateMessageUsecase isMethod(UpdateMessageUsecase isParameter) {
        return isNameExpr;
    }

    @Provides
    @ServiceScope
    @Named("isStringConstant")
    DeleteMessageUsecase isMethod(DeleteMessageUsecase isParameter) {
        return isNameExpr;
    }

    @Provides
    @ServiceScope
    @Named("isStringConstant")
    PublishMessageUsecase isMethod(PublishMessageUsecase isParameter) {
        return isNameExpr;
    }
}
