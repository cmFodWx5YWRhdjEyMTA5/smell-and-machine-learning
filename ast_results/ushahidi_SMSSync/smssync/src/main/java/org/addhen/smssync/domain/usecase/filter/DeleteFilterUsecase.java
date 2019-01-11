// isComment
package org.addhen.smssync.domain.usecase.filter;

import com.addhen.android.raiburari.domain.executor.PostExecutionThread;
import com.addhen.android.raiburari.domain.executor.ThreadExecutor;
import com.addhen.android.raiburari.domain.usecase.Usecase;
import org.addhen.smssync.domain.repository.FilterRepository;
import javax.inject.Inject;
import rx.Observable;

/**
 * isComment
 */
public class isClassOrIsInterface extends Usecase {

    private final FilterRepository isVariable;

    private Long isVariable;

    @Inject
    protected isConstructor(FilterRepository isParameter, ThreadExecutor isParameter, PostExecutionThread isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    public void isMethod(Long isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    protected Observable isMethod() {
        if (isNameExpr == null) {
            throw new RuntimeException("isStringConstant");
        }
        return isNameExpr.isMethod(isNameExpr);
    }
}
