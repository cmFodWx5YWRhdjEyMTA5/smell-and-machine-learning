// isComment
package damo.three.ie.ui;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import damo.three.ie.R;
import damo.three.ie.fragment.AboutFragment;
import damo.three.ie.fragment.ChangeLogFragment;

/**
 * isComment
 */
public class isClassOrIsInterface extends FragmentPagerAdapter {

    private final Context isVariable;

    public isConstructor(FragmentManager isParameter, Context isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public Fragment isMethod(int isParameter) {
        switch(isNameExpr) {
            case isIntegerConstant:
                return new AboutFragment();
            case isIntegerConstant:
                return new ChangeLogFragment();
        }
        return null;
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
        }
        return null;
    }
}
