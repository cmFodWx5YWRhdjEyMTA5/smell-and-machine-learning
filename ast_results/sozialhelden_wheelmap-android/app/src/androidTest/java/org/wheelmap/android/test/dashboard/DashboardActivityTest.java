// isComment
package org.wheelmap.android.test.dashboard;

import android.support.test.espresso.intent.Intents;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.MediumTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.wheelmap.android.activity.DashboardActivity;
import org.wheelmap.android.activity.InfoActivity;
import org.wheelmap.android.activity.MainSinglePaneActivity;
import org.wheelmap.android.activity.profile.ProfileActivity;
import org.wheelmap.android.online.R;
import org.wheelmap.android.test.groups.PhoneTest;
import org.wheelmap.android.utils.UtilsMisc;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static junit.framework.Assert.assertFalse;

/**
 * isComment
 */
@RunWith(AndroidJUnit4.class)
@PhoneTest
public class isClassOrIsInterface {

    @Rule
    public ActivityTestRule<DashboardActivity> isVariable = new ActivityTestRule<>(DashboardActivity.class);

    @Before
    public void isMethod() {
        isNameExpr.isMethod();
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod()));
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod("isStringConstant"));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(MainSinglePaneActivity.class.isMethod()));
    }

    @Test
    public void isMethod() {
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(ProfileActivity.class.isMethod()));
    }

    @Test
    public void isMethod() {
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(InfoActivity.class.isMethod()));
    }
}
