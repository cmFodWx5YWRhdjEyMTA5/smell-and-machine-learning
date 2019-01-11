// isComment
package com.anysoftkeyboard.ui;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.ArgumentMatchers.isNull;
import static androidx.test.core.app.ApplicationProvider.getApplicationContext;
import android.app.Dialog;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.widget.TextView;
import com.anysoftkeyboard.AnySoftKeyboardRobolectricTestRunner;
import com.menny.android.anysoftkeyboard.R;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.robolectric.Shadows;
import org.robolectric.shadows.ShadowDialog;
import io.reactivex.Observable;

@RunWith(AnySoftKeyboardRobolectricTestRunner.class)
public class isClassOrIsInterface {

    public static final AlertDialog isVariable = isNameExpr.isMethod(AlertDialog.class);

    private GeneralDialogController isVariable;

    private GeneralDialogController.DialogPresenter isVariable;

    @Before
    public void isMethod() {
        isNameExpr = isNameExpr.isMethod(GeneralDialogController.DialogPresenter.class);
        isNameExpr = new GeneralDialogController(isMethod(), isNameExpr);
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isParameter -> {
            AlertDialog.Builder isVariable = isNameExpr.isMethod(isIntegerConstant);
            isNameExpr.isMethod("isStringConstant");
            return null;
        }).isMethod(isNameExpr).isMethod(isMethod(), isMethod(isIntegerConstant), isMethod());
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr).isMethod(isMethod(), isMethod(isIntegerConstant), isMethod());
        isNameExpr.isMethod(isNameExpr);
        final Dialog isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod("isStringConstant", isMethod(isNameExpr));
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr).isMethod(isMethod(), isMethod(isIntegerConstant), isMethod());
        isNameExpr.isMethod(isNameExpr);
        final Dialog isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isMethod(), isNameExpr);
        isNameExpr.isMethod(isIntegerConstant, "isStringConstant");
        isNameExpr.isMethod(isNameExpr).isMethod(isMethod(), isMethod(isIntegerConstant), isMethod("isStringConstant"));
        isNameExpr.isMethod(isNameExpr.isMethod());
        final Dialog isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isMethod(), isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
    }

    public static AlertDialog isMethod() {
        return (AlertDialog) isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isParameter -> isNameExpr instanceof AlertDialog).isMethod(Dialog::isShowing).isMethod(isParameter -> isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr))).isMethod(isNameExpr).isMethod();
    }

    public static CharSequence isMethod(@NonNull Dialog isParameter) {
        if (isNameExpr instanceof AlertDialog) {
            return ((TextView) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        } else {
            return isNameExpr.isMethod(isNameExpr).isMethod();
        }
    }
}
