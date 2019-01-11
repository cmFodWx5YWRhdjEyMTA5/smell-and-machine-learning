// isComment
package com.anysoftkeyboard.ui.settings;

import android.os.Build;
import android.support.annotation.NonNull;
import android.support.v7.preference.Preference;
import com.anysoftkeyboard.AnySoftKeyboardRobolectricTestRunner;
import com.anysoftkeyboard.RobolectricFragmentTestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;

@RunWith(AnySoftKeyboardRobolectricTestRunner.class)
public class isClassOrIsInterface extends RobolectricFragmentTestCase<QuickTextSettingsFragment> {

    @Test
    @Config(sdk = isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public void isMethod() {
        final Preference isVariable = isMethod().isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
    }

    @Test
    @Config(sdk = isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public void isMethod() {
        final Preference isVariable = isMethod().isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
    }

    @NonNull
    @Override
    protected QuickTextSettingsFragment isMethod() {
        return new QuickTextSettingsFragment();
    }
}
