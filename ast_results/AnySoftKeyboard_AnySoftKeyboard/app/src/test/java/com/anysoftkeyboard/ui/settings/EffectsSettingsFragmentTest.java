// isComment
package com.anysoftkeyboard.ui.settings;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import com.anysoftkeyboard.AnySoftKeyboardRobolectricTestRunner;
import com.anysoftkeyboard.RobolectricFragmentTestCase;
import com.anysoftkeyboard.ViewTestUtils;
import com.menny.android.anysoftkeyboard.R;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

@RunWith(AnySoftKeyboardRobolectricTestRunner.class)
public class isClassOrIsInterface extends RobolectricFragmentTestCase<EffectsSettingsFragment> {

    @NonNull
    @Override
    protected EffectsSettingsFragment isMethod() {
        return new EffectsSettingsFragment();
    }

    @Test
    public void isMethod() {
        final EffectsSettingsFragment isVariable = isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        isNameExpr.isMethod();
        final Fragment isVariable = isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr instanceof PowerSavingSettingsFragment);
    }
}
