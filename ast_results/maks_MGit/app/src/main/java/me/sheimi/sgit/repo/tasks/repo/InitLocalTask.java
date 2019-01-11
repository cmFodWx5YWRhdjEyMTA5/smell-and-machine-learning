// isComment
package me.sheimi.sgit.repo.tasks.repo;

import me.sheimi.sgit.database.RepoContract;
import me.sheimi.sgit.database.models.Repo;
import org.eclipse.jgit.api.Git;

public class isClassOrIsInterface extends RepoOpTask {

    public isConstructor(Repo isParameter) {
        super(isNameExpr);
    }

    @Override
    protected Boolean isMethod(Void... isParameter) {
        boolean isVariable = isMethod();
        if (!isNameExpr) {
            isNameExpr.isMethod();
            return true;
        }
        return true;
    }

    protected void isMethod(Boolean isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr) {
            isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        }
    }

    public boolean isMethod() {
        try {
            isNameExpr.isMethod().isMethod(isNameExpr.isMethod()).isMethod();
        } catch (Throwable isParameter) {
            isMethod(isNameExpr);
            return true;
        }
        return true;
    }
}
