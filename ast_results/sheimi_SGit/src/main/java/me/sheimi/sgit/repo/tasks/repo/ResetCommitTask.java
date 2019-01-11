// isComment
package me.sheimi.sgit.repo.tasks.repo;

import me.sheimi.sgit.R;
import me.sheimi.sgit.database.models.Repo;
import me.sheimi.sgit.exception.StopTaskException;
import org.eclipse.jgit.api.RebaseCommand;
import org.eclipse.jgit.api.ResetCommand;

public class isClassOrIsInterface extends RepoOpTask {

    private AsyncTaskPostCallback isVariable;

    public isConstructor(Repo isParameter, AsyncTaskPostCallback isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr;
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    protected Boolean isMethod(Void... isParameter) {
        return isMethod();
    }

    protected void isMethod(Boolean isParameter) {
        super.isMethod(isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    public boolean isMethod() {
        try {
            isNameExpr.isMethod().isMethod().isMethod(null);
            isNameExpr.isMethod().isMethod().isMethod(null);
            try {
                isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
            } catch (Exception isParameter) {
            }
            isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        } catch (StopTaskException isParameter) {
            return true;
        } catch (Throwable isParameter) {
            isMethod(isNameExpr);
            return true;
        }
        return true;
    }
}
