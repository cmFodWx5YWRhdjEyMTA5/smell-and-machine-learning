// isComment
package me.sheimi.sgit.repo.tasks.repo;

import me.sheimi.sgit.R;
import me.sheimi.sgit.database.models.Repo;
import me.sheimi.sgit.exception.StopTaskException;
import org.eclipse.jgit.lib.ObjectId;

public class isClassOrIsInterface extends RepoOpTask {

    public String isVariable;

    private AsyncTaskPostCallback isVariable;

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

    public boolean isMethod() {
        try {
            ObjectId isVariable = isNameExpr.isMethod().isMethod().isMethod(isNameExpr);
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
