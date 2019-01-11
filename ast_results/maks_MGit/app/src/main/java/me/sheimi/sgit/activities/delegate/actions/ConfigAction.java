// isComment
package me.sheimi.sgit.activities.delegate.actions;

import android.app.AlertDialog;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import me.sheimi.sgit.R;
import me.sheimi.sgit.activities.RepoDetailActivity;
import me.sheimi.sgit.database.models.GitConfig;
import me.sheimi.sgit.database.models.Repo;
import me.sheimi.sgit.databinding.DialogRepoConfigBinding;
import me.sheimi.sgit.exception.StopTaskException;
import timber.log.Timber;

/**
 * isComment
 */
public class isClassOrIsInterface extends RepoAction {

    public isConstructor(Repo isParameter, RepoDetailActivity isParameter) {
        super(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod() {
        try {
            DialogRepoConfigBinding isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null, true);
            GitConfig isVariable = new GitConfig(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            AlertDialog.Builder isVariable = new AlertDialog.Builder(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null).isMethod().isMethod();
        } catch (StopTaskException isParameter) {
            // isComment
            isNameExpr.isMethod(isNameExpr);
        }
    }
}
