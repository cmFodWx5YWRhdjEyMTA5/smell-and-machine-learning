// isComment
package com.gunshippenguin.openflood;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.longClick;
import static android.support.test.espresso.action.ViewActions.replaceText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class isClassOrIsInterface {

    @Rule
    public ActivityTestRule<GameActivity> isVariable = new ActivityTestRule<>(GameActivity.class);

    @Test
    public void isMethod() {
        // isComment
        ViewInteraction isVariable = isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod()));
        // isComment
        isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod(isMethod());
        // isComment
        isNameExpr.isMethod(isMethod());
        // isComment
        ViewInteraction isVariable = isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod("isStringConstant"), isMethod()));
        isNameExpr.isMethod(isMethod());
        // isComment
        isNameExpr.isMethod(isMethod());
        // isComment
        ViewInteraction isVariable = isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod()));
        isNameExpr.isMethod(isMethod("isStringConstant"), isMethod());
        // isComment
        ViewInteraction isVariable = isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod("isStringConstant"), isMethod()));
        isNameExpr.isMethod(isMethod());
    }
}
