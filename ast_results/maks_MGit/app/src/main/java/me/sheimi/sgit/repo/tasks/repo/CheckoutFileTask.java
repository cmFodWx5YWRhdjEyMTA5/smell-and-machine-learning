// isComment
package me.sheimi.sgit.repo.tasks.repo;

import me.sheimi.sgit.R;
import me.sheimi.sgit.database.models.Repo;
import me.sheimi.sgit.exception.StopTaskException;

public class isClassOrIsInterface extends RepoOpTask {

    private AsyncTaskPostCallback isVariable;

    private String isVariable;

    public isConstructor(Repo isParameter, String isParameter, AsyncTaskPostCallback isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr;
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

    private boolean isMethod() {
        try {
            isNameExpr.isMethod().isMethod().isMethod(isNameExpr).isMethod();
        } catch (StopTaskException isParameter) {
            return true;
        } catch (Throwable isParameter) {
            isMethod(isNameExpr);
            return true;
        }
        return true;
    }
}
