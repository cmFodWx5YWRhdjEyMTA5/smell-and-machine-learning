// isComment
package io.github.hidroh.materialistic.data;

import android.app.Service;
import android.content.Intent;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.android.controller.ServiceController;
import org.robolectric.annotation.Config;
import io.github.hidroh.materialistic.test.TestRunner;
import io.github.hidroh.materialistic.test.shadow.ShadowWebView;
import static org.assertj.core.api.Assertions.assertThat;
import static org.robolectric.Shadows.shadowOf;

@Config(shadows = ShadowWebView.class)
@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private ServiceController<WebCacheService> isVariable;

    private WebCacheService isVariable;

    @Before
    public void isMethod() {
        isNameExpr = isNameExpr.isMethod(WebCacheService.class);
        isNameExpr = isNameExpr.isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        isNameExpr = isNameExpr.isMethod(WebCacheService.class, new Intent().isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant"));
        isNameExpr.isFieldAccessExpr = null;
        isNameExpr.isMethod(isIntegerConstant, isIntegerConstant);
        isNameExpr = isNameExpr.isMethod().isMethod();
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(null, isNameExpr.isFieldAccessExpr, isIntegerConstant);
        isMethod(isMethod(isNameExpr).isMethod()).isMethod();
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod();
    }
}
