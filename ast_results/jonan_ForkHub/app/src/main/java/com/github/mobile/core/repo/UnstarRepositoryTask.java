// isComment
package com.github.mobile.core.repo;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.github.mobile.R;
import com.github.mobile.ui.ProgressDialogTask;
import com.google.inject.Inject;
import org.eclipse.egit.github.core.IRepositoryIdProvider;
import org.eclipse.egit.github.core.service.StargazerService;

/**
 * isComment
 */
public class isClassOrIsInterface extends ProgressDialogTask<Void> {

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

    /**
     * isComment
     */
    public void isMethod() {
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod();
    }

    @Override
    protected Void isMethod(Account isParameter) throws Exception {
        isNameExpr.isMethod(isNameExpr);
        return null;
    }

    @Override
    protected void isMethod(Exception isParameter) throws RuntimeException {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
    }
}
