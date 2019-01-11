// isComment
package com.github.mobile.ui.team;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import com.github.mobile.R;
import com.github.mobile.ui.FragmentPagerAdapter;

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
                return new TeamMembersFragment();
            case isIntegerConstant:
                return new TeamRepositoryListFragment();
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
            default:
                return null;
        }
    }
}
