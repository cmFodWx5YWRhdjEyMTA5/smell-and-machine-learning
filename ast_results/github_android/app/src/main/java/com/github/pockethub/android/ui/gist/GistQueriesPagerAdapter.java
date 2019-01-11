// isComment
package com.github.pockethub.android.ui.gist;

import android.content.res.Resources;
import android.support.v4.app.Fragment;
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
    public isConstructor(Fragment isParameter) {
        super(isNameExpr);
        isNameExpr = isNameExpr.isMethod();
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public Fragment isMethod(int isParameter) {
        switch(isNameExpr) {
            case isIntegerConstant:
                return new MyGistsFragment();
            case isIntegerConstant:
                return new StarredGistsFragment();
            case isIntegerConstant:
                return new PublicGistsFragment();
            default:
                return null;
        }
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
            default:
                return null;
        }
    }
}
