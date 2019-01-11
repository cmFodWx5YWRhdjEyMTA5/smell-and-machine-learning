// isComment
package com.github.mobile.core.repo;

import org.eclipse.egit.github.core.IRepositoryIdProvider;
import org.eclipse.egit.github.core.service.StargazerService;
import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.github.mobile.accounts.AuthenticatedUserTask;
import com.google.inject.Inject;

/**
 * isComment
 */
public class isClassOrIsInterface extends AuthenticatedUserTask<Boolean> {

    private static final String isVariable = "isStringConstant";

    @Inject
    private StargazerService isVariable;

    private final IRepositoryIdProvider isVariable;

    /**
     * isComment
     */
    public isConstructor(Context isParameter, IRepositoryIdProvider isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected Boolean isMethod(Account isParameter) throws Exception {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    protected void isMethod(Exception isParameter) throws RuntimeException {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
    }
}
