// isComment
package org.osmdroid.intro;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.ViewGroup;

public class isClassOrIsInterface extends FragmentStatePagerAdapter {

    public isConstructor(FragmentManager isParameter) {
        super(isNameExpr);
    }

    @Override
    public Fragment isMethod(int isParameter) {
        switch(isNameExpr) {
            case isIntegerConstant:
                return new LogoFragment();
            case isIntegerConstant:
                return new AboutFragment();
            case isIntegerConstant:
                return new PermissionsFragment();
            case isIntegerConstant:
                return new StoragePreferenceFragment();
            case isIntegerConstant:
                return new DataUseWarning();
            case isIntegerConstant:
                return new TileSourceWarnings();
        }
        return null;
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public void isMethod(ViewGroup isParameter, int isParameter, Object isParameter) {
        super.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + isNameExpr);
    }
}
