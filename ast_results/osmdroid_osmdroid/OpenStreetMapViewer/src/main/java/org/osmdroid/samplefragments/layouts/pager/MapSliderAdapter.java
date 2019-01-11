// isComment
package org.osmdroid.samplefragments.layouts.pager;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class isClassOrIsInterface extends FragmentStatePagerAdapter {

    public isConstructor(FragmentManager isParameter) {
        super(isNameExpr);
    }

    @Override
    public Fragment isMethod(int isParameter) {
        switch(isNameExpr) {
            case isIntegerConstant:
                return new SimpleTextFragment();
            case isIntegerConstant:
                return new MapFragment();
            case isIntegerConstant:
                return new WebviewFragment();
        }
        return null;
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }
}
