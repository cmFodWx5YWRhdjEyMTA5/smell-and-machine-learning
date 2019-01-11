// isComment
package com.asksven.betterbatterystats;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowManager;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class isClassOrIsInterface {

    @Rule
    public ActivityTestRule<StatsActivity> isVariable = new ActivityTestRule<>(StatsActivity.class);

    @Before
    public void isMethod() {
        final StatsActivity isVariable = isNameExpr.isMethod();
        Runnable isVariable = new Runnable() {

            public void isMethod() {
                isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            }
        };
        isNameExpr.isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        ViewInteraction isVariable = isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod("isStringConstant"), isMethod()));
        isNameExpr.isMethod(isMethod());
        ViewInteraction isVariable = isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod("isStringConstant"), isMethod(isMethod(isMethod(isMethod("isStringConstant")), isMethod(isMethod(isMethod("isStringConstant")))), isIntegerConstant), isMethod()));
        isNameExpr.isMethod(isMethod());
        ViewInteraction isVariable = isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod("isStringConstant"), isMethod(isMethod(isMethod(isMethod("isStringConstant")), isMethod(isMethod(isMethod("isStringConstant")))), isIntegerConstant), isMethod()));
        isNameExpr.isMethod(isMethod());
        ViewInteraction isVariable = isMethod(isMethod(isMethod(isMethod("isStringConstant")), isMethod()));
        isNameExpr.isMethod(isMethod());
        ViewInteraction isVariable = isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod("isStringConstant"), isMethod()));
        isNameExpr.isMethod(isMethod());
    }

    private static Matcher<View> isMethod(final Matcher<View> isParameter, final int isParameter) {
        return new TypeSafeMatcher<View>() {

            @Override
            public void isMethod(Description isParameter) {
                isNameExpr.isMethod("isStringConstant" + isNameExpr + "isStringConstant");
                isNameExpr.isMethod(isNameExpr);
            }

            @Override
            public boolean isMethod(View isParameter) {
                ViewParent isVariable = isNameExpr.isMethod();
                return isNameExpr instanceof ViewGroup && isNameExpr.isMethod(isNameExpr) && isNameExpr.isMethod(((ViewGroup) isNameExpr).isMethod(isNameExpr));
            }
        };
    }
}
