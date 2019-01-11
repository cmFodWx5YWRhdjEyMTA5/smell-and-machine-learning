// isComment
package com.github.pockethub.android.ui;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.github.pockethub.android.ui.base.BaseFragment;

public abstract class isClassOrIsInterface extends BaseFragment implements ViewPager.OnPageChangeListener {

    /**
     * isComment
     */
    protected abstract FragmentProvider isMethod();

    /**
     * isComment
     */
    protected Fragment isMethod() {
        FragmentProvider isVariable = isMethod();
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        } else {
            return null;
        }
    }

    @Override
    public boolean isMethod(final MenuItem isParameter) {
        Fragment isVariable = isMethod();
        if (isNameExpr != null) {
            return isNameExpr.isMethod(isNameExpr);
        }
        return super.isMethod(isNameExpr);
    }

    @Override
    public void isMethod(Menu isParameter, MenuInflater isParameter) {
        Fragment isVariable = isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, isMethod().isMethod());
        }
        super.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(int isParameter, float isParameter, int isParameter) {
    // isComment
    }

    @Override
    public void isMethod(int isParameter) {
    // isComment
    }

    @Override
    public void isMethod(int isParameter) {
    // isComment
    }
}
