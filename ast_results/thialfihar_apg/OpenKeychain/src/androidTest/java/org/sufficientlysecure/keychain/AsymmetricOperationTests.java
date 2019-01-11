// isComment
package org.sufficientlysecure.keychain;

import android.app.Activity;
import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.widget.AdapterView;
import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.sufficientlysecure.keychain.service.PassphraseCacheService;
import org.sufficientlysecure.keychain.ui.MainActivity;
import org.sufficientlysecure.keychain.ui.util.Notify.Style;
import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.pressBack;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.contrib.DrawerActions.openDrawer;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.not;
import static org.sufficientlysecure.keychain.TestHelpers.checkSnackbar;
import static org.sufficientlysecure.keychain.TestHelpers.importKeysFromResource;
import static org.sufficientlysecure.keychain.TestHelpers.randomString;
import static org.sufficientlysecure.keychain.actions.CustomActions.tokenEncryptViewAddToken;
import static org.sufficientlysecure.keychain.matcher.CustomMatchers.withKeyItemId;
import static org.sufficientlysecure.keychain.matcher.DrawableMatcher.withDrawable;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class isClassOrIsInterface {

    @Rule
    public final ActivityTestRule<MainActivity> isVariable = new ActivityTestRule<MainActivity>(MainActivity.class) {

        @Override
        protected Intent isMethod() {
            Intent isVariable = super.isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
            return isNameExpr;
        }
    };

    @Before
    public void isMethod() throws Exception {
        Activity isVariable = isNameExpr.isMethod();
        // isComment
        isMethod(isNameExpr, "isStringConstant");
        // isComment
        isNameExpr.isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        String isVariable = isMethod(isIntegerConstant, isIntegerConstant);
        {
            // isComment
            // isComment
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isStringConstant));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isNameExpr));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        }
        // isComment
        isMethod();
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        {
            // isComment
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod("isStringConstant"));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr)));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isMethod())));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
        }
    }

    @Test
    public void isMethod() throws Exception {
        String isVariable = isMethod(isIntegerConstant, isIntegerConstant);
        {
            // isComment
            // isComment
            isMethod(isMethod(isStringConstant)).isMethod(isMethod(isMethod(AdapterView.class), isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)))).isMethod(isMethod());
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isNameExpr));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        }
        // isComment
        isMethod();
        isMethod();
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        {
            // isComment
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod("isStringConstant"));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr)));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isMethod())));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
        }
        isMethod();
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        {
            // isComment
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr)));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isMethod())));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
        }
    }

    @Test
    public void isMethod() throws Exception {
        String isVariable = isMethod(isIntegerConstant, isIntegerConstant);
        // isComment
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        {
            // isComment
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
            isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            // isComment
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
            isMethod(isMethod(isStringConstant)).isMethod(isMethod(AdapterView.class)).isMethod(isMethod());
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isNameExpr));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod("isStringConstant"));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
            isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        // isComment
        isMethod();
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        {
            // isComment
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(// isComment
            isMethod(isNameExpr.isMethod(isNameExpr))));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod()));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
        }
    }
}
