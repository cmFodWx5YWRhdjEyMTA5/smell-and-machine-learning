// isComment
package io.github.hidroh.materialistic;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.EditText;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowAlertDialog;
import org.robolectric.shadows.ShadowToast;
import org.robolectric.android.controller.ActivityController;
import java.io.IOException;
import javax.inject.Inject;
import io.github.hidroh.materialistic.accounts.UserServices;
import io.github.hidroh.materialistic.test.TestRunner;
import io.github.hidroh.materialistic.test.shadow.ShadowWebView;
import static org.assertj.android.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.robolectric.Shadows.shadowOf;

@Config(shadows = ShadowWebView.class)
@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private ActivityController<SubmitActivity> isVariable;

    private SubmitActivity isVariable;

    @Inject
    UserServices isVariable;

    @Captor
    ArgumentCaptor<UserServices.Callback> isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
        isNameExpr.isFieldAccessExpr.isMethod(this);
        isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod(SubmitActivity.class);
        isNameExpr = isNameExpr.isMethod().isMethod().isMethod().isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
        AlertDialog isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        ((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        ((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(null);
        ((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod(isNameExpr, isMethod()).isMethod(isMethod(Context.class), isMethod(), isMethod(), isMethod(), isMethod(UserServices.Callback.class));
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() {
        ((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        ((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        AlertDialog isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isNameExpr).isMethod());
    }

    @Test
    public void isMethod() {
        ((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        ((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        AlertDialog isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isNameExpr).isMethod());
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        ((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        ((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod("isStringConstant"), isMethod("isStringConstant"), isMethod(true), isNameExpr.isMethod());
        Uri isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant");
        UserServices.Exception isVariable = new UserServices.Exception(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isFieldAccessExpr = isNameExpr;
        isNameExpr.isMethod().isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        ((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        ((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod("isStringConstant"), isMethod("isStringConstant"), isMethod(true), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(true);
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr, LoginActivity.class);
    }

    @Test
    public void isMethod() {
        ((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        ((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod("isStringConstant"), isMethod("isStringConstant"), isMethod(true), isNameExpr.isMethod());
        isNameExpr.isMethod().isMethod(true);
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr, NewActivity.class);
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() {
        ((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        ((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod("isStringConstant"), isMethod("isStringConstant"), isMethod(true), isNameExpr.isMethod());
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr).isMethod();
        isNameExpr.isMethod().isMethod(new IOException());
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        ((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        ((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod("isStringConstant"), isMethod("isStringConstant"), isMethod(true), isNameExpr.isMethod());
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr).isMethod();
        isNameExpr.isMethod().isMethod(true);
        isMethod(isMethod(isNameExpr).isMethod());
    }

    @Test
    public void isMethod() {
        ((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        ((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr).isMethod(isMethod(Context.class), isMethod("isStringConstant"), isMethod("isStringConstant"), isMethod(true), isNameExpr.isMethod());
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr).isMethod();
        isNameExpr.isMethod().isMethod(true);
        isMethod(isMethod(isNameExpr).isMethod());
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod(SubmitActivity.class, new Intent().isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant"));
        isNameExpr = isNameExpr.isMethod().isMethod().isMethod().isMethod().isMethod();
        isMethod((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod();
        isMethod((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
        isMethod((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod(SubmitActivity.class, new Intent().isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant"));
        isNameExpr = isNameExpr.isMethod().isMethod().isMethod().isMethod().isMethod();
        isMethod((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isMethod((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod(SubmitActivity.class, new Intent().isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant"));
        isNameExpr = isNameExpr.isMethod().isMethod().isMethod().isMethod().isMethod();
        isMethod((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isMethod((EditText) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod(SubmitActivity.class, new Intent().isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant"));
        isNameExpr = isNameExpr.isMethod().isMethod().isMethod().isMethod().isMethod();
        isMethod("isStringConstant", isNameExpr.isMethod());
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod().isMethod().isMethod();
    }
}
