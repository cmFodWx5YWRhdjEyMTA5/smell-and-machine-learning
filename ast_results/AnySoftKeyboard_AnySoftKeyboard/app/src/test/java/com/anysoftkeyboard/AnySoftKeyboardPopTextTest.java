// isComment
package com.anysoftkeyboard;

import com.anysoftkeyboard.api.KeyCodes;
import com.anysoftkeyboard.keyboards.views.AnyKeyboardViewWithExtraDraw;
import com.anysoftkeyboard.keyboards.views.extradraw.ExtraDraw;
import com.anysoftkeyboard.keyboards.views.extradraw.PopTextExtraDraw;
import com.anysoftkeyboard.test.SharedPrefsHelper;
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
        TestInputConnection isVariable = (TestInputConnection) isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant", "isStringConstant", "isStringConstant");
        // isComment
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod("isStringConstant");
        // isComment
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant");
        isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod();
    }

    @Test
    public void isMethod() {
        TestInputConnection isVariable = (TestInputConnection) isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant", "isStringConstant", "isStringConstant");
        // isComment
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        ArgumentCaptor<ExtraDraw> isVariable = isNameExpr.isMethod(ExtraDraw.class);
        isNameExpr.isMethod(((AnyKeyboardViewWithExtraDraw) isNameExpr.isMethod())).isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod() instanceof PopTextExtraDraw.PopOut);
        PopTextExtraDraw isVariable = (PopTextExtraDraw) isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isMethod(ExtraDraw.class);
        isNameExpr.isMethod(((AnyKeyboardViewWithExtraDraw) isNameExpr.isMethod())).isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod() instanceof PopTextExtraDraw.PopIn);
        isNameExpr.isMethod("isStringConstant", ((PopTextExtraDraw) isNameExpr.isMethod()).isMethod().isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant");
        TestInputConnection isVariable = (TestInputConnection) isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant", "isStringConstant", "isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        ArgumentCaptor<ExtraDraw> isVariable = isNameExpr.isMethod(ExtraDraw.class);
        isNameExpr.isMethod(((AnyKeyboardViewWithExtraDraw) isNameExpr.isMethod()), isNameExpr.isMethod(isIntegerConstant)).isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod());
        for (ExtraDraw isVariable : isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr instanceof PopTextExtraDraw.PopOut);
        }
        isNameExpr.isMethod("isStringConstant", ((PopTextExtraDraw) isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod().isMethod());
        isNameExpr.isMethod("isStringConstant", ((PopTextExtraDraw) isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod().isMethod());
        isNameExpr.isMethod("isStringConstant", ((PopTextExtraDraw) isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod().isMethod());
        isNameExpr.isMethod("isStringConstant", ((PopTextExtraDraw) isNameExpr.isMethod().isMethod(isIntegerConstant)).isMethod().isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant");
        TestInputConnection isVariable = (TestInputConnection) isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant", "isStringConstant", "isStringConstant");
        // isComment
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod("isStringConstant");
        // isComment
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant");
        isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant");
        isNameExpr.isMethod();
        // isComment
        isMethod();
        isMethod();
        TestInputConnection isVariable = (TestInputConnection) isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant", "isStringConstant", "isStringConstant");
        // isComment
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod("isStringConstant");
        // isComment
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant");
        isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant", "isStringConstant", "isStringConstant");
        isMethod();
        isNameExpr.isMethod(isIntegerConstant, "isStringConstant");
        isMethod();
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant");
        TestInputConnection isVariable = (TestInputConnection) isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant", "isStringConstant", "isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod();
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant");
        TestInputConnection isVariable = (TestInputConnection) isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant");
        isMethod(true, "isStringConstant", "isStringConstant", "isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod();
    }

    private void isMethod() {
        isNameExpr.isMethod(((AnyKeyboardViewWithExtraDraw) isNameExpr.isMethod()), isNameExpr.isMethod()).isMethod(isNameExpr.isMethod());
    }

    private void isMethod(String isParameter) {
        ArgumentCaptor<ExtraDraw> isVariable = isNameExpr.isMethod(ExtraDraw.class);
        isNameExpr.isMethod(((AnyKeyboardViewWithExtraDraw) isNameExpr.isMethod())).isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod() instanceof PopTextExtraDraw.PopOut);
        isNameExpr.isMethod(isNameExpr, ((PopTextExtraDraw) isNameExpr.isMethod()).isMethod().isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
    }
}
