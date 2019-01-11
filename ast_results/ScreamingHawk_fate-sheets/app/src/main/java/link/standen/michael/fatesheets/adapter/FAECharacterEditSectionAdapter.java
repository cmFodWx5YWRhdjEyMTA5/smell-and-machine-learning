// isComment
package link.standen.michael.fatesheets.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import link.standen.michael.fatesheets.R;
import link.standen.michael.fatesheets.fragment.CharacterEditAspectsFragment;
import link.standen.michael.fatesheets.fragment.CharacterEditDescriptionFragment;
import link.standen.michael.fatesheets.fragment.FAECharacterEditApproachesFragment;
import link.standen.michael.fatesheets.fragment.FAECharacterEditStressFragment;
import link.standen.michael.fatesheets.fragment.FAECharacterEditStuntsFragment;

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
        // isComment
        switch(isNameExpr) {
            case isIntegerConstant:
                return new CharacterEditDescriptionFragment();
            case isIntegerConstant:
                return new CharacterEditAspectsFragment();
            case isIntegerConstant:
                return new FAECharacterEditApproachesFragment();
            case isIntegerConstant:
                return new FAECharacterEditStuntsFragment();
            case isIntegerConstant:
                return new FAECharacterEditStressFragment();
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
                return isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            case isIntegerConstant:
                return isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            case isIntegerConstant:
                return isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            case isIntegerConstant:
                return isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            case isIntegerConstant:
                return isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        return null;
    }
}
