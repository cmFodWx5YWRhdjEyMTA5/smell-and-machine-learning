// isComment
package com.github.pockethub.android.ui.user;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import com.github.pockethub.android.R;
import com.github.pockethub.android.ui.FragmentPagerAdapter;
import com.github.pockethub.android.ui.repo.UserRepositoryListFragment;

/**
 * isComment
 */
public class isClassOrIsInterface extends FragmentPagerAdapter {

    private final Resources isVariable;

    /**
     * isComment
     */
    public isConstructor(final AppCompatActivity isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr.isMethod();
    }

    @Override
    public Fragment isMethod(final int isParameter) {
        switch(isNameExpr) {
            case isIntegerConstant:
                return new UserCreatedNewsFragment();
            case isIntegerConstant:
                return new UserRepositoryListFragment();
            case isIntegerConstant:
                return new UserFollowersFragment();
            case isIntegerConstant:
                return new UserFollowingFragment();
            default:
                return null;
        }
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public CharSequence isMethod(int isParameter) {
        switch(isNameExpr) {
            case isIntegerConstant:
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            case isIntegerConstant:
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            case isIntegerConstant:
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            case isIntegerConstant:
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            default:
                return null;
        }
    }
}
