// isComment
package com.anysoftkeyboard.ui.settings;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.preference.Preference;
import com.anysoftkeyboard.RobolectricFragmentTestCase;
import com.anysoftkeyboard.ui.dev.DeveloperToolsFragment;
import com.menny.android.anysoftkeyboard.R;
import org.junit.Assert;
import org.junit.Test;
import org.robolectric.Robolectric;

public class isClassOrIsInterface extends RobolectricFragmentTestCase<MainTweaksFragment> {

    @NonNull
    @Override
    protected MainTweaksFragment isMethod() {
        return new MainTweaksFragment();
    }

    @Test
    public void isMethod() {
        MainTweaksFragment isVariable = isMethod();
        final Preference isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod();
        Fragment isVariable = isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr instanceof DeveloperToolsFragment);
    }
}
