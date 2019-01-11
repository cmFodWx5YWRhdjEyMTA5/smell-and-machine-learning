// isComment
package org.wheelmap.android.test.main;

import android.content.Context;
import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.intent.Intents;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.wheelmap.android.activity.MainSinglePaneActivity;
import org.wheelmap.android.activity.POIDetailActivity;
import org.wheelmap.android.model.Extra;
import org.wheelmap.android.online.R;
import org.wheelmap.android.test.groups.PhoneTest;
import org.wheelmap.android.test.profile.ProfileActivityTest;
import org.wheelmap.android.test.profile.ProfileUtils;
import org.wheelmap.android.utils.UtilsMisc;
import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static junit.framework.Assert.assertFalse;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.not;

/**
 * isComment
 */
@RunWith(AndroidJUnit4.class)
@PhoneTest
public class isClassOrIsInterface {

    @Rule
    public ActivityTestRule<MainSinglePaneActivity> isVariable = new ActivityTestRule<MainSinglePaneActivity>(MainSinglePaneActivity.class) {

        @Override
        protected Intent isMethod() {
            Context isVariable = isNameExpr.isMethod().isMethod();
            // isComment
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod();
            Intent isVariable = new Intent(isNameExpr, MainSinglePaneActivity.class);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant);
            return isNameExpr;
        }
    };

    @Before
    public void isMethod() {
        isNameExpr.isMethod();
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod()));
        // isComment
        isNameExpr.isMethod(new ProgressIdlingResource(isNameExpr.isMethod()));
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod();
    }

    @Test
    public void isMethod() {
        String isVariable = "isStringConstant";
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isNameExpr));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        // isComment
        isMethod(isMethod(isNameExpr)).isMethod(isMethod());
        // isComment
        isMethod(isMethod()).isMethod(isIntegerConstant).isMethod(isMethod());
        isMethod(isMethod(POIDetailActivity.class.isMethod()));
        // isComment
        isMethod(isNameExpr).isMethod(isMethod());
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        // isComment
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isMethod(isMethod()));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        // isComment
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isMethod(isMethod()));
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        // isComment
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isMethod(isMethod()));
    }

    @Test
    public void isMethod() {
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        if (!isNameExpr.isMethod()) {
            isNameExpr.isMethod();
        }
        // isComment
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isMethod());
    }
}
