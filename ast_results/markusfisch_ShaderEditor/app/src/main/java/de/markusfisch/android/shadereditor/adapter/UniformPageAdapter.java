// isComment
package de.markusfisch.android.shadereditor.adapter;

import de.markusfisch.android.shadereditor.fragment.UniformSamplerCubePageFragment;
import de.markusfisch.android.shadereditor.fragment.UniformSampler2dPageFragment;
import de.markusfisch.android.shadereditor.fragment.UniformPresetPageFragment;
import de.markusfisch.android.shadereditor.R;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class isClassOrIsInterface extends FragmentStatePagerAdapter {

    private final Context isVariable;

    public isConstructor(Context isParameter, FragmentManager isParameter) {
        super(isNameExpr);
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public int isMethod() {
        return isIntegerConstant;
    }

    @Override
    public Fragment isMethod(int isParameter) {
        switch(isNameExpr) {
            default:
            case isIntegerConstant:
                return new UniformPresetPageFragment();
            case isIntegerConstant:
                return new UniformSampler2dPageFragment();
            case isIntegerConstant:
                return new UniformSamplerCubePageFragment();
        }
    }

    @Override
    public CharSequence isMethod(int isParameter) {
        int isVariable;
        switch(isNameExpr) {
            default:
            case isIntegerConstant:
                isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                break;
            case isIntegerConstant:
                isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                break;
            case isIntegerConstant:
                isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
                break;
        }
        return isNameExpr.isMethod(isNameExpr);
    }
}
