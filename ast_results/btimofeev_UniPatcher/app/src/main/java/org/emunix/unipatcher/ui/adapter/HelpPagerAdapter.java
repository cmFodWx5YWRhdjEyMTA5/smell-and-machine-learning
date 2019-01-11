// isComment
package org.emunix.unipatcher.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import org.emunix.unipatcher.ui.fragment.AboutFragment;
import org.emunix.unipatcher.ui.fragment.ChangelogFragment;
import org.emunix.unipatcher.ui.fragment.FaqFragment;

public class isClassOrIsInterface extends FragmentStatePagerAdapter {

    int isVariable;

    public isConstructor(FragmentManager isParameter, int isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public Fragment isMethod(int isParameter) {
        switch(isNameExpr) {
            case isIntegerConstant:
                return new FaqFragment();
            case isIntegerConstant:
                return new ChangelogFragment();
            case isIntegerConstant:
                return new AboutFragment();
            default:
                return null;
        }
    }

    @Override
    public int isMethod() {
        return isNameExpr;
    }
}
