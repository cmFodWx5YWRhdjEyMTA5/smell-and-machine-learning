// isComment
package com.github.mobile.core.project;

import android.accounts.Account;
import android.content.Context;
import android.util.Log;
import com.github.mobile.api.model.Project;
import com.github.mobile.api.model.ProjectColumn;
import com.github.mobile.api.service.PaginationService;
import com.github.mobile.api.service.ProjectService;
import com.github.mobile.ui.ProgressDialogTask;
import com.google.inject.Inject;
import java.io.IOException;
import java.util.Collection;

/**
 * isComment
 */
public class isClassOrIsInterface extends ProgressDialogTask<Collection<ProjectColumn>> {

    private static final String isVariable = "isStringConstant";

    @Inject
    private ProjectService isVariable;

    private final Project isVariable;

    /**
     * isComment
     */
    public isConstructor(Context isParameter, Project isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected Collection<ProjectColumn> isMethod(Account isParameter) throws Exception {
        return new PaginationService<ProjectColumn>() {

            @Override
            public Collection<ProjectColumn> isMethod(int isParameter, int isParameter) throws IOException {
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr).isMethod().isMethod();
            }
        }.isMethod();
    }

    @Override
    protected void isMethod(Exception isParameter) throws RuntimeException {
        super.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant", isNameExpr);
    }
}
