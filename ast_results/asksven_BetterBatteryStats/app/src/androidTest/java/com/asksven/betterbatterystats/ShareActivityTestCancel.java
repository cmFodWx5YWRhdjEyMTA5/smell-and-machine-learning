// isComment
package com.asksven.betterbatterystats;

import android.support.test.espresso.ViewInteraction;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import android.view.WindowManager;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static org.hamcrest.Matchers.allOf;

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
        // isComment
        try {
            isNameExpr.isMethod(isIntegerConstant);
        } catch (InterruptedException isParameter) {
            isNameExpr.isMethod();
        }
        ViewInteraction isVariable = isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod("isStringConstant"), isMethod()));
        isNameExpr.isMethod(isMethod());
        // isComment
        try {
            isNameExpr.isMethod(isIntegerConstant);
        } catch (InterruptedException isParameter) {
            isNameExpr.isMethod();
        }
        ViewInteraction isVariable = isMethod(isMethod("isStringConstant"));
        isNameExpr.isMethod(isMethod());
    }
}
