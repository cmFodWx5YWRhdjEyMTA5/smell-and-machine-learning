// isComment
package com.anysoftkeyboard.ui.settings;

import android.support.annotation.NonNull;
import com.anysoftkeyboard.AnySoftKeyboardRobolectricTestRunner;
import com.anysoftkeyboard.ViewTestUtils;
import com.menny.android.anysoftkeyboard.R;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AnySoftKeyboardRobolectricTestRunner.class)
public class isClassOrIsInterface extends BaseSettingsFragmentTest<LanguageSettingsFragment> {

    @NonNull
    @Override
    protected LanguageSettingsFragment isMethod() {
        return new LanguageSettingsFragment();
    }

    @Test
    public void isMethod() {
        final LanguageSettingsFragment isVariable = isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr) instanceof KeyboardAddOnBrowserFragment);
    }

    @Test
    public void isMethod() {
        final LanguageSettingsFragment isVariable = isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr) instanceof DictionariesFragment);
    }

    @Test
    public void isMethod() {
        final LanguageSettingsFragment isVariable = isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr) instanceof AdditionalLanguageSettingsFragment);
    }
}
