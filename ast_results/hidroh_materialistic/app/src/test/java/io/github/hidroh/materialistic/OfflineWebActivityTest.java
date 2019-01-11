// isComment
package io.github.hidroh.materialistic;

import android.content.Intent;
import android.view.View;
import android.webkit.WebView;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.android.controller.ActivityController;
import org.robolectric.annotation.Config;
import org.robolectric.shadow.api.Shadow;
import org.robolectric.shadows.ShadowWebView;
import io.github.hidroh.materialistic.test.TestRunner;
import io.github.hidroh.materialistic.test.shadow.ShadowNestedScrollView;
import static org.assertj.android.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThat;
import static org.robolectric.Shadows.shadowOf;

@Config(shadows = ShadowNestedScrollView.class)
@SuppressWarnings("isStringConstant")
@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private ActivityController<OfflineWebActivity> isVariable;

    private OfflineWebActivity isVariable;

    @Before
    public void isMethod() {
        isNameExpr = isNameExpr.isMethod(OfflineWebActivity.class);
    }

    @Test
    public void isMethod() {
        isNameExpr = isNameExpr.isMethod().isMethod();
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() {
        isNameExpr = isNameExpr.isMethod(OfflineWebActivity.class, new Intent().isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant"));
        isNameExpr = isNameExpr.isMethod().isMethod();
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        WebView isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        View isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        ShadowWebView isVariable = isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isNameExpr.isMethod().isMethod(isNameExpr, "isStringConstant");
        // isComment
        isMethod(isNameExpr.isMethod()).isMethod();
        isNameExpr.isMethod().isMethod(isNameExpr, isIntegerConstant);
        isMethod(isNameExpr).isMethod();
        isNameExpr.isMethod().isMethod(isNameExpr, isIntegerConstant);
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() {
        isNameExpr = isNameExpr.isMethod(OfflineWebActivity.class, new Intent().isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant"));
        isNameExpr = isNameExpr.isMethod().isMethod().isMethod().isMethod().isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod(((ShadowNestedScrollView) isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))).isMethod()).isMethod(isIntegerConstant);
    }

    @Test
    public void isMethod() {
        isNameExpr = isNameExpr.isMethod(OfflineWebActivity.class, new Intent().isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant"));
        isNameExpr = isNameExpr.isMethod().isMethod().isMethod().isMethod().isMethod();
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod();
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod();
    }
}
