// isComment
package com.llamacorp.equate.test;

import android.content.Context;
import android.content.res.Resources;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.runner.AndroidJUnit4;
import android.view.Gravity;
import com.llamacorp.equate.R;
import com.llamacorp.equate.ResourceArrayParser;
import com.llamacorp.equate.test.IdlingResource.ViewPagerIdlingResource;
import com.llamacorp.equate.view.CalcActivity;
import com.llamacorp.equate.view.IdlingResource.SimpleIdlingResource;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.util.ArrayList;
import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.Espresso.registerIdlingResources;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.contrib.DrawerActions.open;
import static android.support.test.espresso.contrib.DrawerMatchers.isClosed;
import static android.support.test.espresso.matcher.ViewMatchers.isChecked;
import static android.support.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withContentDescription;
import static android.support.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.llamacorp.equate.test.EspressoTestUtils.assertExpressionEquals;
import static com.llamacorp.equate.test.EspressoTestUtils.checkUnitButtonVisible;
import static com.llamacorp.equate.test.EspressoTestUtils.checkUnitButtonVisibleWithArrow;
import static com.llamacorp.equate.test.EspressoTestUtils.clickButtons;
import static com.llamacorp.equate.test.EspressoTestUtils.clickPrevAnswer;
import static com.llamacorp.equate.test.EspressoTestUtils.clickUnit;
import static com.llamacorp.equate.test.EspressoTestUtils.getPagerIdle;
import static com.llamacorp.equate.test.EspressoTestUtils.longClickUnit;
import static com.llamacorp.equate.test.EspressoTestUtils.resetCalculator;
import static com.llamacorp.equate.test.EspressoTestUtils.selectUnitTypeDirect;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.hasToString;
import static org.hamcrest.Matchers.is;

@RunWith(AndroidJUnit4.class)
public class isClassOrIsInterface {

    private ViewPagerIdlingResource isVariable;

    private SimpleIdlingResource isVariable;

    @Rule
    public MyActivityTestRule<CalcActivity> isVariable = new MyActivityTestRule<>(CalcActivity.class);

    @Before
    public void isMethod() {
        isNameExpr = isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod().isMethod();
        isMethod(isNameExpr, isNameExpr);
    }

    @After
    public void isMethod() {
        if (isNameExpr != null)
            isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null)
            isNameExpr.isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        isMethod("isStringConstant");
        // isComment
        isMethod(new ArrayList<String>());
        // isComment
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        // isComment
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        // isComment
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        // isComment
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        // isComment
        // isComment
        // isComment
        // isComment
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        // isComment
        isMethod("isStringConstant");
        // isComment
        isMethod("isStringConstant");
        ArrayList<String> isVariable = new ArrayList<>();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        // isComment
        isMethod(isNameExpr);
        // isComment
        isMethod(isNameExpr);
        // isComment
        // isComment
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        isMethod();
        isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr);
        // isComment
        ArrayList<String> isVariable = new ArrayList<>();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        // isComment
        isMethod(isNameExpr);
        // isComment
        isNameExpr.isMethod(isNameExpr);
        // isComment
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        isMethod();
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        // isComment
        isMethod(isMethod(isMethod(isMethod("isStringConstant")), isMethod())).isMethod(isMethod("isStringConstant"));
        isMethod(isMethod(isMethod(isMethod("isStringConstant")), isMethod())).isMethod(isMethod(isMethod("isStringConstant")));
        // isComment
        isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod("isStringConstant"))).isMethod(isMethod());
        isMethod("isStringConstant");
        // isComment
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        // isComment
        isMethod("isStringConstant");
        isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod("isStringConstant"), isMethod())).isMethod(isMethod());
        // isComment
        isMethod(isMethod(isMethod(isMethod("isStringConstant")), isMethod())).isMethod(isMethod("isStringConstant"));
        // isComment
        isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod("isStringConstant"))).isMethod(isMethod());
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        // isComment
        isMethod(isMethod(isMethod(isMethod("isStringConstant")), isMethod())).isMethod(isMethod("isStringConstant"));
        // isComment
        isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod("isStringConstant"))).isMethod(isMethod());
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod("isStringConstant"))).isMethod(isMethod());
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod("isStringConstant"))).isMethod(isMethod());
        // isComment
        // isComment
        isMethod("isStringConstant");
        isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod("isStringConstant"))).isMethod(isMethod());
    }

    private void isMethod(String isParameter) {
        // isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(// isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr))).isMethod(// isComment
        isMethod());
        isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod("isStringConstant"), isMethod())).isMethod(isMethod());
        isMethod(isMethod(isMethod(isMethod("isStringConstant")), isMethod())).isMethod(isMethod(isNameExpr));
    }

    private void isMethod(ArrayList<String> isParameter) {
        Context isVariable = isNameExpr.isMethod();
        Resources isVariable = isNameExpr.isMethod();
        ArrayList<String> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        ArrayList<String> isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        // isComment
        for (String isVariable : isNameExpr) {
            isMethod(isMethod(isMethod(isNameExpr), isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)))).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
        }
        if (isNameExpr.isMethod() == isIntegerConstant)
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
        else {
            // isComment
            for (String isVariable : isNameExpr) {
                isMethod(isMethod(isMethod(isNameExpr), isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)))).isMethod(isMethod());
            }
        }
    }

    private void isMethod(ArrayList<String> isParameter) {
        // isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(// isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr))).isMethod(// isComment
        isMethod());
        // isComment
        isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod("isStringConstant"), isMethod())).isMethod(isMethod());
        // isComment
        isMethod(isMethod(isMethod("isStringConstant"), isMethod())).isMethod(isMethod());
        // isComment
        for (String isVariable : isNameExpr) {
            isMethod(isMethod(isNameExpr)).isMethod(isMethod(isMethod())).isMethod(isMethod());
        }
        // isComment
        // isComment
        // isComment
        // isComment
        isMethod(isMethod(isMethod("isStringConstant"), isMethod())).isMethod(isMethod());
        // isComment
        isMethod(isMethod(isMethod("isStringConstant"), isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)))), isMethod())).isMethod(isMethod());
    }
}
