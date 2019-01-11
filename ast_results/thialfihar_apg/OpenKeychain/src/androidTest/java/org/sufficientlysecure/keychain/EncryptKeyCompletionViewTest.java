// isComment
package org.sufficientlysecure.keychain;

import android.app.Activity;
import android.content.Intent;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.RootMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.KeyEvent;
import android.widget.AdapterView;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.sufficientlysecure.keychain.ui.EncryptTextActivity;
import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.hasDescendant;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.CoreMatchers.allOf;
import static org.sufficientlysecure.keychain.TestHelpers.importKeysFromResource;
import static org.sufficientlysecure.keychain.actions.CustomActions.tokenEncryptViewAddToken;
import static org.sufficientlysecure.keychain.matcher.CustomMatchers.withKeyItemId;
import static org.sufficientlysecure.keychain.matcher.CustomMatchers.withKeyToken;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class isClassOrIsInterface {

    @Rule
    public final ActivityTestRule<EncryptTextActivity> isVariable = new ActivityTestRule<>(EncryptTextActivity.class);

    @Test
    public void isMethod() throws Exception {
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new long[] { isStringConstant });
        Activity isVariable = isNameExpr.isMethod(isNameExpr);
        // isComment
        isMethod(isNameExpr, "isStringConstant");
        // isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isStringConstant)));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        // isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod("isStringConstant"));
        isMethod(isMethod(isStringConstant)).isMethod(isNameExpr.isMethod()).isMethod(isMethod(isMethod(AdapterView.class), isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)))).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isStringConstant)));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        // isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isStringConstant));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isStringConstant)));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
    }
}
