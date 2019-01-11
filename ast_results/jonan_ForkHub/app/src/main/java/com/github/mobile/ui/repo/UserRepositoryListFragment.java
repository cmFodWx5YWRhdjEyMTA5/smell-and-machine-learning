// isComment
package com.github.mobile.ui.repo;

import static com.github.mobile.Intents.EXTRA_USER;
import static com.github.mobile.RequestCodes.REPOSITORY_VIEW;
import static com.github.mobile.ResultCodes.RESOURCE_CHANGED;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import com.github.kevinsawicki.wishlist.SingleTypeAdapter;
import com.github.mobile.R;
import com.github.mobile.ui.PagedItemFragment;
import java.util.List;
import org.eclipse.egit.github.core.Repository;
import org.eclipse.egit.github.core.User;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends PagedItemFragment<Repository> {

    protected User isVariable;

    @Override
    public void isMethod(Context isParameter) {
        super.isMethod(isNameExpr);
        isNameExpr = isMethod(isNameExpr);
    }

    @Override
    public void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Override
    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    protected int isMethod(Exception isParameter) {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    protected SingleTypeAdapter<Repository> isMethod(List<Repository> isParameter) {
        return new UserRepositoryListAdapter(isMethod().isMethod(), isNameExpr.isMethod(new Repository[isNameExpr.isMethod()]), isNameExpr);
    }

    @Override
    public void isMethod(int isParameter, int isParameter, Intent isParameter) {
        if (isNameExpr == isNameExpr && isNameExpr == isNameExpr) {
            isMethod();
            return;
        }
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(ListView isParameter, View isParameter, int isParameter, long isParameter) {
        Repository isVariable = (Repository) isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr);
    }
}
