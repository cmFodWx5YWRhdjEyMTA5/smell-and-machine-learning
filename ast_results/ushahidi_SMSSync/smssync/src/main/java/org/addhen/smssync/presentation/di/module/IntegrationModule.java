// isComment
package org.addhen.smssync.presentation.di.module;

import com.addhen.android.raiburari.domain.usecase.Usecase;
import com.addhen.android.raiburari.presentation.di.qualifier.ActivityScope;
import org.addhen.smssync.domain.usecase.webservice.GetActiveWebServiceUsecase;
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
    Usecase isMethod(GetActiveWebServiceUsecase isParameter) {
        return isNameExpr;
    }
}
