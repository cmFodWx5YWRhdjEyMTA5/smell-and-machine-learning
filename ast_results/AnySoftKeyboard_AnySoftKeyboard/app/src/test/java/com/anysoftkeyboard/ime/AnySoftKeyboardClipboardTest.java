// isComment
package com.anysoftkeyboard.ime;

import static androidx.test.core.app.ApplicationProvider.getApplicationContext;
import android.annotation.TargetApi;
import android.app.AlertDialog;
import android.app.Service;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Build;
import android.view.KeyEvent;
import android.widget.Toast;
import com.anysoftkeyboard.AnySoftKeyboardBaseTest;
import com.anysoftkeyboard.AnySoftKeyboardRobolectricTestRunner;
import com.anysoftkeyboard.TestInputConnection;
import com.anysoftkeyboard.api.KeyCodes;
import com.anysoftkeyboard.test.SharedPrefsHelper;
import com.menny.android.anysoftkeyboard.R;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import org.robolectric.Shadows;
import org.robolectric.shadows.ShadowAlertDialog;
import org.robolectric.shadows.ShadowToast;

@RunWith(AnySoftKeyboardRobolectricTestRunner.class)
public class isClassOrIsInterface extends AnySoftKeyboardBaseTest {

    @Test
    public void isMethod() {
        TestInputConnection isVariable = (TestInputConnection) isNameExpr.isMethod();
        final String isVariable = "isStringConstant";
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isIntegerConstant).isMethod());
    }

    @Test
    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public void isMethod() {
        TestInputConnection isVariable = (TestInputConnection) isNameExpr.isMethod();
        final String isVariable = "isStringConstant";
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isNameExpr.isMethod("isStringConstant".isMethod(), "isStringConstant".isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
        ClipboardManager isVariable = (ClipboardManager) isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        // isComment
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod().isMethod());
    }

    @Test
    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public void isMethod() {
        TestInputConnection isVariable = (TestInputConnection) isNameExpr.isMethod();
        final String isVariable = "isStringConstant";
        final String isVariable = "isStringConstant";
        final String isVariable = "isStringConstant";
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isNameExpr.isMethod("isStringConstant".isMethod(), "isStringConstant".isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isIntegerConstant).isMethod());
        ClipboardManager isVariable = (ClipboardManager) isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        // isComment
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod().isMethod());
    }

    @Test
    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public void isMethod() {
        TestInputConnection isVariable = (TestInputConnection) isNameExpr.isMethod();
        ClipboardManager isVariable = (ClipboardManager) isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        final String isVariable = "isStringConstant";
        isNameExpr.isMethod(new ClipData("isStringConstant", new String[] { "isStringConstant" }, new ClipData.Item(isNameExpr)));
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod() - isIntegerConstant), isNameExpr.isMethod());
    }

    @Test
    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public void isMethod() {
        TestInputConnection isVariable = (TestInputConnection) isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        TestInputConnection isVariable = (TestInputConnection) isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant", isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
    }

    @Test
    public void isMethod() {
        TestInputConnection isVariable = (TestInputConnection) isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant", isIntegerConstant);
        isNameExpr.isMethod("isStringConstant".isMethod(), "isStringConstant".isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
    }

    @Test
    public void isMethod() {
        TestInputConnection isVariable = (TestInputConnection) isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant", isIntegerConstant);
        isNameExpr.isMethod("isStringConstant".isMethod(), "isStringConstant".isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod('isStringConstant');
        // isComment
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant".isMethod(), isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
    }

    @Test
    public void isMethod() {
        TestInputConnection isVariable = (TestInputConnection) isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant", isIntegerConstant);
        isNameExpr.isMethod("isStringConstant".isMethod(), "isStringConstant".isMethod());
        // isComment
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
    }

    @Test
    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public void isMethod() {
        TestInputConnection isVariable = (TestInputConnection) isNameExpr.isMethod();
        final String isVariable = "isStringConstant";
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isNameExpr.isMethod("isStringConstant".isMethod(), "isStringConstant".isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        final Toast isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod());
    }

    @Test
    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public void isMethod() {
        TestInputConnection isVariable = (TestInputConnection) isNameExpr.isMethod();
        final String isVariable = "isStringConstant";
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isNameExpr.isMethod("isStringConstant".isMethod(), "isStringConstant".isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isIntegerConstant, "isStringConstant".isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        final AlertDialog isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        final ShadowAlertDialog isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod().isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod().isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod().isMethod(isIntegerConstant).isMethod());
    }

    @Test
    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public void isMethod() {
        ClipboardManager isVariable = (ClipboardManager) isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(new ClipData("isStringConstant", new String[isIntegerConstant], new ClipData.Item("isStringConstant")));
        isNameExpr.isMethod(new ClipData("isStringConstant", new String[isIntegerConstant], new ClipData.Item("isStringConstant")));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        AlertDialog isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod().isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod().isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod().isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod().isMethod(isIntegerConstant, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod().isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod().isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod().isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod().isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod();
        for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) {
            isNameExpr.isMethod(new ClipData("isStringConstant" + isNameExpr, new String[isIntegerConstant], new ClipData.Item("isStringConstant" + isNameExpr)));
        }
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod().isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod().isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod().isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod().isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod().isMethod(isIntegerConstant).isMethod());
    }

    @Test
    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public void isMethod() {
        ClipboardManager isVariable = (ClipboardManager) isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(new ClipData("isStringConstant", new String[isIntegerConstant], new ClipData.Item("isStringConstant")));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isNameExpr.isMethod(new ClipData("isStringConstant", new String[isIntegerConstant], new ClipData.Item("isStringConstant")));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        AlertDialog isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod().isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod().isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        isNameExpr.isMethod(new ClipData("isStringConstant", new String[isIntegerConstant], new ClipData.Item("isStringConstant")));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod().isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod().isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod().isMethod(isIntegerConstant).isMethod());
    }

    @Test
    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public void isMethod() {
        TestInputConnection isVariable = (TestInputConnection) isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        ArgumentCaptor<KeyEvent> isVariable = isNameExpr.isMethod(KeyEvent.class);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isIntegerConstant)).isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod());
    }

    @Test
    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public void isMethod() {
        TestInputConnection isVariable = (TestInputConnection) isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        ArgumentCaptor<KeyEvent> isVariable = isNameExpr.isMethod(KeyEvent.class);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isIntegerConstant)).isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod());
    }
}
