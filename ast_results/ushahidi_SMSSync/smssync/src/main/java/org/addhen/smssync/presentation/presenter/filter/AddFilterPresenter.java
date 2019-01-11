// isComment
package org.addhen.smssync.presentation.presenter.filter;

import com.addhen.android.raiburari.domain.exception.DefaultErrorHandler;
import com.addhen.android.raiburari.domain.exception.ErrorHandler;
import com.addhen.android.raiburari.domain.usecase.DefaultSubscriber;
import com.addhen.android.raiburari.presentation.di.qualifier.ActivityScope;
import com.addhen.android.raiburari.presentation.presenter.Presenter;
import org.addhen.smssync.domain.usecase.filter.AddFilterUsecase;
import org.addhen.smssync.presentation.exception.ErrorMessageFactory;
import org.addhen.smssync.presentation.model.FilterModel;
import org.addhen.smssync.presentation.model.mapper.FilterModelDataMapper;
import org.addhen.smssync.presentation.view.filter.AddFilterView;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * isComment
 */
@ActivityScope
public class isClassOrIsInterface implements Presenter {

    private final AddFilterUsecase isVariable;

    private final FilterModelDataMapper isVariable;

    private AddFilterView isVariable;

    @Inject
    public isConstructor(@Named("isStringConstant") AddFilterUsecase isParameter, FilterModelDataMapper isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    public void isMethod(AddFilterView isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public void isMethod() {
    // isComment
    }

    @Override
    public void isMethod() {
    // isComment
    }

    @Override
    public void isMethod() {
        isNameExpr.isMethod();
    }

    public void isMethod(FilterModel isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod(new DefaultSubscriber<Long>() {

            @Override
            public void isMethod() {
            // isComment
            }

            @Override
            public void isMethod(Long isParameter) {
                isNameExpr.isMethod(isNameExpr);
            }

            @Override
            public void isMethod(Throwable isParameter) {
                isMethod(new DefaultErrorHandler((Exception) isNameExpr));
            }
        });
    }

    private void isMethod(ErrorHandler isParameter) {
        String isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr);
    }
}
