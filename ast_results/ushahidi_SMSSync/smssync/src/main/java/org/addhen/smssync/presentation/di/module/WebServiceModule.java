// isComment
package org.addhen.smssync.presentation.di.module;

import com.addhen.android.raiburari.presentation.di.qualifier.ActivityScope;
import org.addhen.smssync.domain.usecase.webservice.AddWebServiceUsecase;
import org.addhen.smssync.domain.usecase.webservice.DeleteWebServiceUsecase;
import org.addhen.smssync.domain.usecase.webservice.ListWebServiceUsecase;
import org.addhen.smssync.domain.usecase.webservice.TestWebServiceUsecase;
import org.addhen.smssync.domain.usecase.webservice.UpdateWebServiceUsecase;
import javax.inject.Named;
import dagger.Module;
import dagger.Provides;

/**
 * isComment
 */
@Module
public class isClassOrIsInterface {

    /**
     * isComment
     */
    @Provides
    @ActivityScope
    @Named("isStringConstant")
    AddWebServiceUsecase isMethod(AddWebServiceUsecase isParameter) {
        return isNameExpr;
    }

    /**
     * isComment
     */
    @Provides
    @ActivityScope
    @Named("isStringConstant")
    DeleteWebServiceUsecase isMethod(DeleteWebServiceUsecase isParameter) {
        return isNameExpr;
    }

    /**
     * isComment
     */
    @Provides
    @ActivityScope
    @Named("isStringConstant")
    ListWebServiceUsecase isMethod(ListWebServiceUsecase isParameter) {
        return isNameExpr;
    }

    /**
     * isComment
     */
    @Provides
    @ActivityScope
    @Named("isStringConstant")
    UpdateWebServiceUsecase isMethod(UpdateWebServiceUsecase isParameter) {
        return isNameExpr;
    }

    @Provides
    @ActivityScope
    @Named("isStringConstant")
    TestWebServiceUsecase isMethod(TestWebServiceUsecase isParameter) {
        return isNameExpr;
    }
}
