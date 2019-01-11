// isComment
package org.sufficientlysecure.keychain;

import android.app.Activity;
import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.widget.AdapterView;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.sufficientlysecure.keychain.provider.KeychainDatabase;
import org.sufficientlysecure.keychain.ui.MainActivity;
import org.sufficientlysecure.keychain.ui.util.Notify.Style;
import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;
import static org.sufficientlysecure.keychain.TestHelpers.checkSnackbar;
import static org.sufficientlysecure.keychain.TestHelpers.importKeysFromResource;
import static org.sufficientlysecure.keychain.matcher.CustomMatchers.withKeyItemId;

@FixMethodOrder(isNameExpr.isFieldAccessExpr)
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

    @Test
    public void isMethod() throws Exception {
        Activity isVariable = isNameExpr.isMethod();
        new KeychainDatabase(isNameExpr).isMethod();
        // isComment
        isMethod(isNameExpr, "isStringConstant");
        // isComment
        isMethod(isMethod(isStringConstant)).isMethod(isMethod(isMethod(AdapterView.class), isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)))).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        // isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }
}
