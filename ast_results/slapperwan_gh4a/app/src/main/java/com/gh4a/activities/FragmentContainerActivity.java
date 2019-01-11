// isComment
package com.gh4a.activities;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import com.gh4a.BaseActivity;
import com.gh4a.R;
import com.gh4a.fragment.LoadingFragmentBase;
import com.gh4a.widget.SwipeRefreshLayout;

public abstract class isClassOrIsInterface extends BaseActivity {

    private Fragment isVariable;

    @Override
    protected void isMethod(Bundle isParameter) {
        super.isMethod(isNameExpr);
        final FragmentManager isVariable = isMethod();
        if (isNameExpr == null) {
            isNameExpr = isMethod();
            isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr).isMethod();
        } else {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        if (isNameExpr instanceof SwipeRefreshLayout.ChildScrollDelegate) {
            isMethod((SwipeRefreshLayout.ChildScrollDelegate) isNameExpr);
        }
    }

    protected abstract Fragment isMethod();

    protected Fragment isMethod() {
        return isNameExpr;
    }

    @Override
    public void isMethod() {
        super.isMethod();
        if (isNameExpr instanceof RefreshableChild) {
            ((RefreshableChild) isNameExpr).isMethod();
        }
    }

    @Override
    public void isMethod() {
        if (isNameExpr instanceof LoadingFragmentBase && ((LoadingFragmentBase) isNameExpr).isMethod()) {
            return;
        }
        super.isMethod();
    }
}
