// isComment
package org.addhen.smssync.presentation.di.module;

import com.addhen.android.raiburari.domain.usecase.Usecase;
import com.addhen.android.raiburari.presentation.di.qualifier.ActivityScope;
import org.addhen.smssync.domain.usecase.filter.AddFilterUsecase;
import org.addhen.smssync.domain.usecase.filter.DeleteFilterUsecase;
import org.addhen.smssync.domain.usecase.filter.ListFilterUsecase;
import org.addhen.smssync.domain.usecase.webservice.GetActiveWebServiceUsecase;
import org.addhen.smssync.domain.usecase.webservice.UpdateWebServiceUsecase;
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
    Usecase isMethod(ListFilterUsecase isParameter) {
        return isNameExpr;
    }

    @Provides
    @ActivityScope
    @Named("isStringConstant")
    AddFilterUsecase isMethod(AddFilterUsecase isParameter) {
        return isNameExpr;
    }

    @Provides
    @ActivityScope
    @Named("isStringConstant")
    Usecase isMethod(GetActiveWebServiceUsecase isParameter) {
        return isNameExpr;
    }

    @Provides
    @ActivityScope
    @Named("isStringConstant")
    DeleteFilterUsecase isMethod(DeleteFilterUsecase isParameter) {
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
}
