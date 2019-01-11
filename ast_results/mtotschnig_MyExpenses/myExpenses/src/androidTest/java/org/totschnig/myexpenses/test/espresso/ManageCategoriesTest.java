// isComment
package org.totschnig.myexpenses.test.espresso;

import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.Test;
import org.totschnig.myexpenses.MyApplication;
import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.activity.ManageCategories;
import org.totschnig.myexpenses.activity.ProtectedFragmentActivity;
import org.totschnig.myexpenses.model.Category;
import org.totschnig.myexpenses.testutils.BaseUiTest;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.assertj.core.api.Assertions.assertThat;
import static org.totschnig.myexpenses.testutils.Espresso.openActionBarOverflowOrOptionsMenu;

public class isClassOrIsInterface extends BaseUiTest {

    @Rule
    public ActivityTestRule<ManageCategories> isVariable = new ActivityTestRule<>(ManageCategories.class);

    @AfterClass
    public static void isMethod() {
        isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr, null, null);
    }

    @Test
    public void isMethod() {
        isMethod(isMethod().isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod().isMethod()).isMethod(isIntegerConstant);
    }

    @Override
    protected ActivityTestRule<? extends ProtectedFragmentActivity> isMethod() {
        return isNameExpr;
    }
}
