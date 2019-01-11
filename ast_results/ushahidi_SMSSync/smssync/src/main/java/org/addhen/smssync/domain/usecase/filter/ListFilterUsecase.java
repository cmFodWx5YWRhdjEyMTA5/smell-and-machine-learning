// isComment
package org.addhen.smssync.domain.usecase.filter;

import com.addhen.android.raiburari.domain.executor.PostExecutionThread;
import com.addhen.android.raiburari.domain.executor.ThreadExecutor;
import com.addhen.android.raiburari.domain.usecase.Usecase;
import org.addhen.smssync.domain.repository.FilterRepository;
import android.support.annotation.NonNull;
import javax.inject.Inject;
import rx.Observable;

/**
 * isComment
 */
public class isClassOrIsInterface extends Usecase {

    private final FilterRepository isVariable;

    @Inject
    public isConstructor(@NonNull FilterRepository isParameter, ThreadExecutor isParameter, PostExecutionThread isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    @Override
    protected Observable isMethod() {
        return isNameExpr.isMethod();
    }
}
