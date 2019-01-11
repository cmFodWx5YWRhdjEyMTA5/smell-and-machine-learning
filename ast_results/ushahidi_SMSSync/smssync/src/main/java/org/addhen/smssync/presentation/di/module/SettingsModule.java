// isComment
package org.addhen.smssync.presentation.di.module;

import com.addhen.android.raiburari.presentation.di.qualifier.ActivityScope;
import org.addhen.smssync.domain.usecase.log.AddLogUsecase;
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
    AddLogUsecase isMethod(AddLogUsecase isParameter) {
        return isNameExpr;
    }
}
