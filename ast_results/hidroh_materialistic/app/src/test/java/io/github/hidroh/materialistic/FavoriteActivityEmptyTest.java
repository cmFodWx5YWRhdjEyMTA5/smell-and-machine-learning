// isComment
package io.github.hidroh.materialistic;

import android.app.SearchManager;
import android.content.Intent;
import android.view.View;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.android.controller.ActivityController;
import javax.inject.Inject;
import io.github.hidroh.materialistic.data.FavoriteManager;
import io.github.hidroh.materialistic.data.LocalItemManager;
import io.github.hidroh.materialistic.test.TestRunner;
import static junit.framework.Assert.assertNull;
import static org.assertj.android.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.robolectric.Shadows.shadowOf;

@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private ActivityController<FavoriteActivity> isVariable;

    private FavoriteActivity isVariable;

    @Inject
    FavoriteManager isVariable;

    @Captor
    ArgumentCaptor<LocalItemManager.Observer> isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isMethod(this);
        isNameExpr.isFieldAccessExpr.isMethod(this);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isNameExpr = isNameExpr.isMethod(FavoriteActivity.class);
        isNameExpr = isNameExpr.isMethod().isMethod().isMethod().isMethod().isMethod();
        isMethod(isNameExpr, isMethod()).isMethod(isNameExpr.isMethod(), isMethod());
        isNameExpr.isMethod().isMethod();
    }

    @Test
    public void isMethod() {
        isMethod((View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod((View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod();
        isMethod((View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isMethod(isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
    }

    @Test
    public void isMethod() {
        isMethod((View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
        isMethod(isNameExpr);
        isNameExpr.isMethod(new Intent().isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant"));
        isMethod(isNameExpr, isMethod()).isMethod(isNameExpr.isMethod(), isMethod());
        isNameExpr.isMethod().isMethod();
        isMethod((View) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod();
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod().isMethod().isMethod();
    }
}
