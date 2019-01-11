// isComment
package com.anysoftkeyboard.ui.settings;

import static androidx.test.core.app.ApplicationProvider.getApplicationContext;
import android.support.annotation.NonNull;
import android.support.v7.preference.ListPreference;
import com.anysoftkeyboard.AnySoftKeyboardRobolectricTestRunner;
import com.anysoftkeyboard.RobolectricFragmentTestCase;
import com.anysoftkeyboard.addons.SupportTest;
import com.anysoftkeyboard.keyboards.KeyboardAddOnAndBuilder;
import com.anysoftkeyboard.keyboards.KeyboardFactory;
import com.menny.android.anysoftkeyboard.AnyApplication;
import com.menny.android.anysoftkeyboard.R;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.util.Scheduler;

@RunWith(AnySoftKeyboardRobolectricTestRunner.class)
public class isClassOrIsInterface extends RobolectricFragmentTestCase<LanguageTweaksFragment> {

    @NonNull
    @Override
    protected LanguageTweaksFragment isMethod() {
        return new LanguageTweaksFragment();
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        final KeyboardFactory isVariable = isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod(isIntegerConstant, true);
        isNameExpr.isMethod(isIntegerConstant, true);
        LanguageTweaksFragment isVariable = isMethod();
        ListPreference isVariable = (ListPreference) isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod().isFieldAccessExpr);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod().isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod(), isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod()[isIntegerConstant]);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod()[isIntegerConstant]);
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod().isMethod(); isNameExpr++) {
            final KeyboardAddOnAndBuilder isVariable = isNameExpr.isMethod().isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isMethod()[isNameExpr + isIntegerConstant].isMethod().isMethod(isNameExpr.isMethod()));
            isNameExpr.isMethod(isNameExpr.isMethod()[isNameExpr + isIntegerConstant].isMethod().isMethod(isNameExpr.isMethod()));
            isNameExpr.isMethod(isNameExpr.isMethod()[isNameExpr + isIntegerConstant], isNameExpr.isMethod());
        }
    }
}
