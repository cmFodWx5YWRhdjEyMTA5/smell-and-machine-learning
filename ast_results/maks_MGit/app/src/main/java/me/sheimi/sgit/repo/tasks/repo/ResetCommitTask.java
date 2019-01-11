// isComment
package me.sheimi.sgit.repo.tasks.repo;

import org.eclipse.jgit.api.RebaseCommand;
import org.eclipse.jgit.api.ResetCommand;
import org.eclipse.jgit.api.errors.WrongRepositoryStateException;
import me.sheimi.sgit.R;
import me.sheimi.sgit.database.models.Repo;
import me.sheimi.sgit.exception.StopTaskException;
import timber.log.Timber;

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
                // isComment
                isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
            } catch (WrongRepositoryStateException isParameter) {
                // isComment
                isNameExpr.isMethod(isNameExpr, "isStringConstant");
            } catch (Exception isParameter) {
                isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                return true;
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
