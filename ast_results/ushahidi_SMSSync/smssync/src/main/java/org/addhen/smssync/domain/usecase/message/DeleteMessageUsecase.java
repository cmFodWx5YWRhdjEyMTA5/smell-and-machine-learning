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

    private String isVariable;

    /**
     * isComment
     */
    @Inject
    protected isConstructor(@NonNull MessageRepository isParameter, @NonNull ThreadExecutor isParameter, @NonNull PostExecutionThread isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(String isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    protected Observable<Integer> isMethod() {
        if (isNameExpr == null) {
            throw new RuntimeException("isStringConstant");
        }
        return isNameExpr.isMethod(isNameExpr);
    }
}
