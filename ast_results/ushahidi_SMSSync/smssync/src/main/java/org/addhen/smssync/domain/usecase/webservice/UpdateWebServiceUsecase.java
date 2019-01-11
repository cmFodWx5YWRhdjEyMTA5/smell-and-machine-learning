// isComment
package org.addhen.smssync.domain.usecase.webservice;

import com.addhen.android.raiburari.domain.executor.PostExecutionThread;
import com.addhen.android.raiburari.domain.executor.ThreadExecutor;
import com.addhen.android.raiburari.domain.usecase.Usecase;
import org.addhen.smssync.domain.entity.WebServiceEntity;
import org.addhen.smssync.domain.repository.WebServiceRepository;
import javax.inject.Inject;
import rx.Observable;

/**
 * isComment
 */
public class isClassOrIsInterface extends Usecase {

    private final WebServiceRepository isVariable;

    private WebServiceEntity isVariable;

    /**
     * isComment
     */
    @Inject
    protected isConstructor(WebServiceRepository isParameter, ThreadExecutor isParameter, PostExecutionThread isParameter) {
        super(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(WebServiceEntity isParameter) {
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
