// isComment
package com.gimranov.zandy.app;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.gimranov.zandy.app.data.Database;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.InstrumentationRegistry.getTargetContext;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class isClassOrIsInterface {

    @Rule
    public ActivityTestRule<MainActivity> isVariable = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void isMethod() {
        SharedPreferences isVariable = isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod().isMethod("isStringConstant", isNameExpr.isFieldAccessExpr).isMethod("isStringConstant", isNameExpr.isFieldAccessExpr).isMethod();
    }

    @After
    public void isMethod() {
        SharedPreferences isVariable = isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod().isMethod().isMethod();
    }

    @Before
    @After
    public void isMethod() {
        Database isVariable = new Database(isMethod());
        isNameExpr.isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isMethod());
        ViewInteraction isVariable = isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isMethod(isMethod(isMethod("isStringConstant")), isIntegerConstant), isIntegerConstant), isMethod()));
        isNameExpr.isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isMethod(isNameExpr.isMethod().isMethod().isMethod())))).isMethod(isMethod(isMethod()));
        ViewInteraction isVariable = isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr), isIntegerConstant)), isIntegerConstant), isMethod()));
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
