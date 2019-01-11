// isComment
package com.andybotting.tramhunter;

import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import com.andybotting.tramhunter.activity.HomeActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class isClassOrIsInterface {

    @Rule
    public final ActivityTestRule<HomeActivity> isVariable = new ActivityTestRule<>(HomeActivity.class);

    @Test
    public void isMethod() {
        isMethod(isMethod("isStringConstant")).isMethod(isNameExpr.isMethod(isMethod()));
    }
}
