// isComment
package com.github.mobile.tests.commit;

import android.test.AndroidTestCase;
import com.github.mobile.core.commit.CommitUtils;
import java.util.Date;
import org.eclipse.egit.github.core.Commit;
import org.eclipse.egit.github.core.CommitFile;
import org.eclipse.egit.github.core.CommitUser;
import org.eclipse.egit.github.core.RepositoryCommit;
import org.eclipse.egit.github.core.User;

/**
 * isComment
 */
public class isClassOrIsInterface extends AndroidTestCase {

    /**
     * isComment
     */
    public void isMethod() {
        isMethod(isNameExpr.isMethod((Commit) null));
        isMethod(isNameExpr.isMethod((RepositoryCommit) null));
        isMethod(isNameExpr.isMethod((String) null));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod(new Commit().isMethod("isStringConstant")));
        isMethod("isStringConstant", isNameExpr.isMethod(new RepositoryCommit().isMethod("isStringConstant")));
    }

    /**
     * isComment
     */
    public void isMethod() {
        isMethod(isNameExpr.isMethod((String) null));
        isMethod(isNameExpr.isMethod((CommitFile) null));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod(new CommitFile().isMethod("isStringConstant")));
    }

    /**
     * isComment
     */
    public void isMethod() {
        isMethod(isNameExpr.isMethod(null));
        isMethod(isNameExpr.isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant"));
    }

    /**
     * isComment
     */
    public void isMethod() {
        RepositoryCommit isVariable = new RepositoryCommit();
        isMethod(isNameExpr.isMethod(isNameExpr));
        Commit isVariable = new Commit();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr));
        CommitUser isVariable = new CommitUser();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod("isStringConstant");
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod(new User().isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
    }

    /**
     * isComment
     */
    public void isMethod() {
        RepositoryCommit isVariable = new RepositoryCommit();
        isMethod(isNameExpr.isMethod(isNameExpr));
        Commit isVariable = new Commit();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr));
        CommitUser isVariable = new CommitUser();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod("isStringConstant");
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod(new User().isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
    }

    /**
     * isComment
     */
    public void isMethod() {
        RepositoryCommit isVariable = new RepositoryCommit();
        isMethod(isNameExpr.isMethod(isNameExpr));
        Commit isVariable = new Commit();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr));
        CommitUser isVariable = new CommitUser();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod(new Date(isIntegerConstant));
        isMethod(new Date(isIntegerConstant), isNameExpr.isMethod(isNameExpr));
    }

    /**
     * isComment
     */
    public void isMethod() {
        RepositoryCommit isVariable = new RepositoryCommit();
        isMethod(isNameExpr.isMethod(isNameExpr));
        Commit isVariable = new Commit();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr));
        CommitUser isVariable = new CommitUser();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod(new Date(isIntegerConstant));
        isMethod(new Date(isIntegerConstant), isNameExpr.isMethod(isNameExpr));
    }
}
