// isComment
package io.github.hidroh.materialistic;

import android.app.SearchManager;
import android.content.Intent;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.annotation.Config;
import org.robolectric.android.controller.ActivityController;
import javax.inject.Inject;
import javax.inject.Named;
import io.github.hidroh.materialistic.data.AlgoliaClient;
import io.github.hidroh.materialistic.data.ItemManager;
import io.github.hidroh.materialistic.test.TestRunner;
import io.github.hidroh.materialistic.test.shadow.ShadowSearchRecentSuggestions;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertTrue;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.robolectric.Shadows.shadowOf;

@Config(shadows = ShadowSearchRecentSuggestions.class)
@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private ActivityController<SearchActivity> isVariable;

    private SearchActivity isVariable;

    @Inject
    @Named(isNameExpr.isFieldAccessExpr)
    ItemManager isVariable;

    @Before
    public void isMethod() {
        isNameExpr.isFieldAccessExpr.isMethod(this);
        isMethod(isNameExpr);
        isNameExpr.isFieldAccessExpr.isMethod();
        isNameExpr = isNameExpr.isMethod(SearchActivity.class);
        isNameExpr = isNameExpr.isMethod();
    }

    @Test
    public void isMethod() {
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isNameExpr = isNameExpr.isMethod(SearchActivity.class, isNameExpr);
        // isComment
        isNameExpr.isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        isMethod(isNameExpr.isFieldAccessExpr).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod().isMethod());
    }

    @Test
    public void isMethod() {
        // isComment
        isNameExpr.isMethod().isMethod().isMethod();
        isMethod(isNameExpr.isFieldAccessExpr).isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod().isMethod());
    }

    @Test
    public void isMethod() {
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isNameExpr = isNameExpr.isMethod(SearchActivity.class, isNameExpr);
        isNameExpr.isMethod().isMethod(null).isMethod().isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod();
        isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isMethod(isNameExpr).isMethod().isMethod(// isComment
        isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isMethod(isNameExpr).isMethod().isMethod(// isComment
        isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod(), isMethod(isNameExpr.isFieldAccessExpr));
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod().isMethod().isMethod();
    }
}
