// isComment
package org.sufficientlysecure.keychain;

import android.content.Intent;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.sufficientlysecure.keychain.ui.MainActivity;
import org.sufficientlysecure.keychain.ui.util.Notify.Style;
import static android.support.test.InstrumentationRegistry.getInstrumentation;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.contrib.DrawerActions.openDrawer;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.not;
import static org.sufficientlysecure.keychain.TestHelpers.checkSnackbar;
import static org.sufficientlysecure.keychain.TestHelpers.randomString;
import static org.sufficientlysecure.keychain.matcher.DrawableMatcher.withDrawable;

@FixMethodOrder(isNameExpr.isFieldAccessExpr)
@RunWith(AndroidJUnit4.class)
@LargeTest
public class isClassOrIsInterface {

    public static final String isVariable = isMethod(isIntegerConstant, isIntegerConstant);

    @Rule
    public final ActivityTestRule<MainActivity> isVariable = new ActivityTestRule<MainActivity>(MainActivity.class) {

        @Override
        protected Intent isMethod() {
            Intent isVariable = super.isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
            return isNameExpr;
        }
    };

    @Test
    public void isMethod() throws Exception {
        MainActivity isVariable = isNameExpr.isMethod();
        String isVariable = isMethod(isIntegerConstant, isIntegerConstant);
        // isComment
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        {
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isNameExpr));
            isMethod(isMethod().isMethod());
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isNameExpr));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
            isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isNameExpr));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr)));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
            isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        // isComment
        isMethod();
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        {
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isNameExpr));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr)));
            // isComment
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isMethod())));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
        }
    }
}
