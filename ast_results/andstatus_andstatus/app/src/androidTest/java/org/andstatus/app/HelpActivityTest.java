// isComment
package org.andstatus.app;

import android.app.Activity;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.v4.view.ViewPager;
import org.andstatus.app.context.ActivityTest;
import org.andstatus.app.context.MyContextHolder;
import org.andstatus.app.context.MySettingsActivity;
import org.andstatus.app.context.TestSuite;
import org.andstatus.app.data.DbUtils;
import org.junit.After;
import org.junit.Test;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class isClassOrIsInterface extends ActivityTest<HelpActivity> {

    @Override
    protected Class<HelpActivity> isMethod() {
        return HelpActivity.class;
    }

    @Override
    protected Intent isMethod() {
        isNameExpr.isMethod(this);
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        return isNameExpr;
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
    }

    @Test
    public void isMethod() throws Throwable {
        ViewPager isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isNameExpr != null);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isIntegerConstant);
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isMethod(isNameExpr.isMethod().isFieldAccessExpr))));
        isNameExpr.isMethod("isStringConstant", isIntegerConstant);
        ActivityTestHelper<HelpActivity> isVariable = new ActivityTestHelper<>(isNameExpr.isMethod(), MySettingsActivity.class);
        // isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        Activity isVariable = isNameExpr.isMethod("isStringConstant", isIntegerConstant);
        isNameExpr.isMethod("isStringConstant", isIntegerConstant);
        isNameExpr.isMethod();
    }
}
