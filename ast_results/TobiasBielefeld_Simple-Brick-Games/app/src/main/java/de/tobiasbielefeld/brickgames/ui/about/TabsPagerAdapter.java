// isComment
package de.tobiasbielefeld.brickgames.ui.about;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class isClassOrIsInterface extends FragmentPagerAdapter {

    public isConstructor(FragmentManager isParameter) {
        super(isNameExpr);
    }

    @Override
    public android.support.v4.app.Fragment isMethod(int isParameter) {
        switch(isNameExpr) {
            case isIntegerConstant:
                return new InformationFragment();
            case isIntegerConstant:
                return new LicenseFragment();
            case isIntegerConstant:
                return new ChangeLogFragment();
        }
        return null;
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }
}
