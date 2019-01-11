// isComment
package com.byagowi.persiancalendar.view.activity;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.byagowi.persiancalendar.R;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.core.AllOf.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class isClassOrIsInterface {

    @Rule
    public ActivityTestRule<MainActivity> isVariable = new ActivityTestRule<>(MainActivity.class);

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

    @Test
    public void isMethod() {
        ViewInteraction isVariable = isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod("isStringConstant"), isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isIntegerConstant)), isIntegerConstant), isMethod()));
        isNameExpr.isMethod(isMethod());
        ViewInteraction isVariable = isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isIntegerConstant)), isIntegerConstant), isMethod()));
        isNameExpr.isMethod(isMethod("isStringConstant"), isMethod());
    }
}
