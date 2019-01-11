// isComment
package com.github.mobile.ui.gist;

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
    public isConstructor(AppCompatActivity isParameter) {
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
