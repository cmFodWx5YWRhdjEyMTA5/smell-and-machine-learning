// isComment
package com.github.pockethub.android.tests.issue;

import com.meisolsson.githubsdk.model.Repository;
import com.github.pockethub.android.core.issue.IssueFilter;
import com.github.pockethub.android.tests.ActivityTest;
import com.github.pockethub.android.ui.issue.EditIssuesFilterActivity;
import com.github.pockethub.android.util.InfoUtils;

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
        Repository isVariable = isNameExpr.isMethod("isStringConstant", "isStringConstant");
        IssueFilter isVariable = new IssueFilter(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr));
    }
}
