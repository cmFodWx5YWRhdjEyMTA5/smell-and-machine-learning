// isComment
package com.github.pockethub.android.ui.search;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import com.github.pockethub.android.R;
import com.github.pockethub.android.ui.FragmentPagerAdapter;

/**
 * isComment
 */
public class isClassOrIsInterface extends FragmentPagerAdapter {

    private final Resources isVariable;

    /**
     * isComment
     */
    public isConstructor(AppCompatActivity isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr.isMethod();
    }

    @Override
    public CharSequence isMethod(int isParameter) {
        switch(isNameExpr) {
            case isIntegerConstant:
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            case isIntegerConstant:
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            default:
                return null;
        }
    }

    @Override
    public Fragment isMethod(int isParameter) {
        switch(isNameExpr) {
            case isIntegerConstant:
                return new SearchRepositoryListFragment();
            case isIntegerConstant:
                return new SearchUserListFragment();
            default:
                return null;
        }
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }
}
