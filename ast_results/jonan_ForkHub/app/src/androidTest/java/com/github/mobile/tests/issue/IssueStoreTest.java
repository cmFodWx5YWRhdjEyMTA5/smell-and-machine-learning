// isComment
package com.github.mobile.tests.issue;

import android.test.AndroidTestCase;
import com.github.mobile.core.issue.IssueStore;
import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.RepositoryIssue;
import org.eclipse.egit.github.core.User;
import org.eclipse.egit.github.core.service.IssueService;
import org.eclipse.egit.github.core.service.PullRequestService;

/**
 * isComment
 */
public class isClassOrIsInterface extends AndroidTestCase {

    /**
     * isComment
     */
    public void isMethod() {
        IssueStore isVariable = new IssueStore(new IssueService(), new PullRequestService());
        Repository isVariable = new Repository();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(new User().isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant));
        RepositoryIssue isVariable = new RepositoryIssue();
        isNameExpr.isMethod(isNameExpr).isMethod(isIntegerConstant).isMethod("isStringConstant");
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr, isIntegerConstant));
        RepositoryIssue isVariable = new RepositoryIssue();
        isNameExpr.isMethod(isNameExpr).isMethod(isIntegerConstant).isMethod("isStringConstant");
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr, isIntegerConstant));
    }
}
