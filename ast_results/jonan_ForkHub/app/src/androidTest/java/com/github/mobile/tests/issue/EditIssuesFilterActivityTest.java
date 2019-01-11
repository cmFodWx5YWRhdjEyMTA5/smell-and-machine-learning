// isComment
package com.github.mobile.tests.issue;

import com.github.mobile.core.issue.IssueFilter;
import com.github.mobile.tests.ActivityTest;
import com.github.mobile.ui.issue.EditIssuesFilterActivity;
import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.User;

/**
 * isComment
 */
public class isClassOrIsInterface extends ActivityTest<EditIssuesFilterActivity> {

    /**
     * isComment
     */
    public isConstructor() {
        super(EditIssuesFilterActivity.class);
    }

    @Override
    protected void isMethod() throws Exception {
        super.isMethod();
        Repository isVariable = new Repository();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(new User().isMethod("isStringConstant"));
        IssueFilter isVariable = new IssueFilter(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr));
    }
}
