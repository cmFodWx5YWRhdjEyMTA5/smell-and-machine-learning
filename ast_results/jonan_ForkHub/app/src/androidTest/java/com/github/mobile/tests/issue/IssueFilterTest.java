// isComment
package com.github.mobile.tests.issue;

import android.test.AndroidTestCase;
import com.github.mobile.core.issue.IssueFilter;
import org.eclipse.egit.github.core.Milestone;
import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.User;

/**
 * isComment
 */
public class isClassOrIsInterface extends AndroidTestCase {

    /**
     * isComment
     */
    public void isMethod() {
        Repository isVariable = new Repository().isMethod(isIntegerConstant);
        IssueFilter isVariable = new IssueFilter(isNameExpr);
        isMethod(isNameExpr.isMethod(null));
        isMethod(isNameExpr.isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(isNameExpr));
        IssueFilter isVariable = new IssueFilter(isNameExpr);
        isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        User isVariable = new User().isMethod(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isNameExpr.isMethod(true);
        isMethod(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod(true);
        isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        Milestone isVariable = new Milestone().isMethod(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
    }
}
