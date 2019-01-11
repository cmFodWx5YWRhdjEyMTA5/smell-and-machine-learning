// isComment
package org.addhen.smssync.domain.usecase.message;

import com.addhen.android.raiburari.domain.executor.PostExecutionThread;
import com.addhen.android.raiburari.domain.executor.ThreadExecutor;
import com.addhen.android.raiburari.domain.usecase.Usecase;
import org.addhen.smssync.domain.repository.MessageRepository;
import android.support.annotation.NonNull;
import javax.inject.Inject;
import rx.Observable;

/**
 * isComment
 */
public class isClassOrIsInterface extends Usecase {

    private final MessageRepository isVariable;

    @Inject
    protected isConstructor(@NonNull MessageRepository isParameter, @NonNull ThreadExecutor isParameter, @NonNull PostExecutionThread isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    @Override
    protected Observable isMethod() {
        return isNameExpr.isMethod();
    }
}
