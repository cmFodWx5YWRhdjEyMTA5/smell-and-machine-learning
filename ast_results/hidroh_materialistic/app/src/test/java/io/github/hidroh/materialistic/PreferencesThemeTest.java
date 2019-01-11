// isComment
package io.github.hidroh.materialistic;

import android.app.Activity;
import android.preference.PreferenceManager;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import io.github.hidroh.materialistic.test.TestRunner;
import static org.assertj.core.api.Assertions.assertThat;
import static org.robolectric.Shadows.shadowOf;

@RunWith(TestRunner.class)
public class isClassOrIsInterface {

    private Activity isVariable;

    @Before
    public void isMethod() {
        isNameExpr = isNameExpr.isMethod(Activity.class);
    }

    @Test
    public void isMethod() {
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr, true, true);
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr).isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), "isStringConstant").isMethod();
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr, true, true);
        isMethod(isMethod(isNameExpr).isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }
}
