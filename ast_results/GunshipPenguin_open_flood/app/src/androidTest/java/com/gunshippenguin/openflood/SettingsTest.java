// isComment
package com.gunshippenguin.openflood;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.View;
import android.view.ViewGroup;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class isClassOrIsInterface {

    private static Matcher<View> isMethod(final Matcher<View> isParameter, final int isParameter) {
        return new TypeSafeMatcher<View>() {

            @Override
            public void isMethod(Description isParameter) {
                isNameExpr.isMethod("isStringConstant" + isNameExpr + "isStringConstant");
            }

            @Override
            public boolean isMethod(View isParameter) {
                if (!(isNameExpr.isMethod() instanceof ViewGroup)) {
                    return isNameExpr.isMethod(isNameExpr.isMethod());
                }
                ViewGroup isVariable = (ViewGroup) isNameExpr.isMethod();
                return isNameExpr.isMethod(isNameExpr.isMethod()) && isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr);
            }
        };
    }

    private static void isMethod(int isParameter) {
        ViewInteraction isVariable = isMethod(isMethod(isMethod(isMethod("isStringConstant")), isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), isMethod(), isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr)));
        isNameExpr.isMethod(isMethod());
    }

    @Rule
    public ActivityTestRule<GameActivity> isVariable = new ActivityTestRule<>(GameActivity.class);

    @Test
    public void isMethod() {
        // isComment
        isMethod(isIntegerConstant);
        isMethod(isIntegerConstant);
        isMethod(isIntegerConstant);
        isMethod(isIntegerConstant);
        isMethod(isIntegerConstant);
        isMethod(isIntegerConstant);
        // isComment
        ViewInteraction isVariable = isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod()));
        isNameExpr.isMethod(isMethod());
        // isComment
        ViewInteraction isVariable = isMethod(isMethod(isMethod("isStringConstant"), isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), isMethod()));
        isNameExpr.isMethod(isMethod());
        // isComment
        ViewInteraction isVariable = isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod("isStringConstant"), isMethod()));
        isNameExpr.isMethod(isMethod());
        // isComment
        isMethod(isIntegerConstant);
        isMethod(isIntegerConstant);
        isMethod(isIntegerConstant);
        isMethod(isIntegerConstant);
        isMethod(isIntegerConstant);
        isMethod(isIntegerConstant);
        isMethod(isIntegerConstant);
        isMethod(isIntegerConstant);
        // isComment
        isNameExpr.isMethod(isMethod());
        // isComment
        ViewInteraction isVariable = isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod()));
        isNameExpr.isMethod(isMethod());
        // isComment
        ViewInteraction isVariable = isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod()));
        isNameExpr.isMethod(isMethod());
        // isComment
        ViewInteraction isVariable = isMethod(isMethod(isMethod("isStringConstant"), isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), isMethod()));
        isNameExpr.isMethod(isMethod());
        // isComment
        isNameExpr.isMethod(isMethod());
        // isComment
        isMethod(isIntegerConstant);
        isMethod(isIntegerConstant);
        isMethod(isIntegerConstant);
        isMethod(isIntegerConstant);
        isMethod(isIntegerConstant);
        isMethod(isIntegerConstant);
        isMethod(isIntegerConstant);
        isMethod(isIntegerConstant);
    }
}
