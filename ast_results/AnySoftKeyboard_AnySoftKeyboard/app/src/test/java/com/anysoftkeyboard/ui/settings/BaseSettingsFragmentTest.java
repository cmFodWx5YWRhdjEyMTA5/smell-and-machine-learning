// isComment
package com.anysoftkeyboard.ui.settings;

import static androidx.test.core.app.ApplicationProvider.getApplicationContext;
import android.content.res.Configuration;
import android.support.v4.app.Fragment;
import android.widget.LinearLayout;
import com.anysoftkeyboard.AnySoftKeyboardRobolectricTestRunner;
import com.anysoftkeyboard.RobolectricFragmentTestCase;
import com.menny.android.anysoftkeyboard.R;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.annotation.Config;

@RunWith(AnySoftKeyboardRobolectricTestRunner.class)
public abstract class isClassOrIsInterface<T extends Fragment> extends RobolectricFragmentTestCase<T> {

    @Config(qualifiers = "isStringConstant")
    @Test
    public void isMethod() {
        isMethod().isMethod().isMethod().isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
        final T isVariable = isMethod();
        final LinearLayout isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isDoubleConstant);
    }

    @Test
    public void isMethod() {
        isMethod().isMethod().isMethod().isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
        final T isVariable = isMethod();
        final LinearLayout isVariable = (LinearLayout) isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
    }
}
