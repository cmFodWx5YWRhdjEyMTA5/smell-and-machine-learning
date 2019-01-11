// isComment
package com.anysoftkeyboard.ime;

import com.anysoftkeyboard.AnySoftKeyboardBaseTest;
import com.anysoftkeyboard.AnySoftKeyboardRobolectricTestRunner;
import com.anysoftkeyboard.ViewTestUtils;
import com.anysoftkeyboard.powersave.PowerSavingTest;
import com.anysoftkeyboard.test.SharedPrefsHelper;
import com.anysoftkeyboard.theme.KeyboardTheme;
import com.menny.android.anysoftkeyboard.R;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

@RunWith(AnySoftKeyboardRobolectricTestRunner.class)
public class isClassOrIsInterface extends AnySoftKeyboardBaseTest {

    @Test
    public void isMethod() {
        isNameExpr.isMethod(true);
        isNameExpr.isMethod("isStringConstant");
        isMethod();
        isNameExpr.isMethod("isStringConstant");
        isMethod();
        isNameExpr.isMethod("isStringConstant");
        isMethod();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(true);
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant", "isStringConstant", "isStringConstant");
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant", "isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
        isNameExpr.isMethod(true);
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant", "isStringConstant", "isStringConstant");
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant");
        isNameExpr.isMethod(true);
        isMethod();
        isNameExpr.isMethod("isStringConstant");
        isMethod();
        isNameExpr.isMethod("isStringConstant");
        isMethod();
        isNameExpr.isMethod("isStringConstant");
        isMethod();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(true);
        isNameExpr.isMethod("isStringConstant");
        isMethod();
        isNameExpr.isMethod("isStringConstant");
        isMethod();
        isNameExpr.isMethod("isStringConstant");
        isMethod();
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant");
        isNameExpr.isMethod(true);
        isMethod();
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant", "isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(true);
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant", "isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(true);
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant", "isStringConstant", "isStringConstant");
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod()).isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()).isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", true);
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod()).isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", true);
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()).isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant");
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(true);
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(true);
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant");
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        ArgumentCaptor<KeyboardTheme> isVariable = isNameExpr.isMethod(KeyboardTheme.class);
        final InputViewBinder isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod());
        isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod());
    }

    @Test
    public void isMethod() {
        // isComment
        InputViewBinder isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
    }
}
