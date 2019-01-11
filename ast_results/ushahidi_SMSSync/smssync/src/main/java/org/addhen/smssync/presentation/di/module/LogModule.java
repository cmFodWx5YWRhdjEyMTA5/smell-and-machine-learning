// isComment
package org.addhen.smssync.presentation.di.module;

import com.addhen.android.raiburari.domain.usecase.Usecase;
import com.addhen.android.raiburari.presentation.di.qualifier.ActivityScope;
import org.addhen.smssync.domain.usecase.log.DeleteLogUsecase;
import org.addhen.smssync.domain.usecase.log.ListLogUsecase;
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
    Usecase isMethod(ListLogUsecase isParameter) {
        return isNameExpr;
    }

    @Provides
    @ActivityScope
    @Named("isStringConstant")
    Usecase isMethod(DeleteLogUsecase isParameter) {
        return isNameExpr;
    }
}
