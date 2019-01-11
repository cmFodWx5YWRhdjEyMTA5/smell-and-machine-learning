// isComment
package com.owncloud.android.screenshots;

import android.content.Intent;
import com.owncloud.android.R;
import com.owncloud.android.ui.activity.FileDisplayActivity;
import com.owncloud.android.ui.activity.Preferences;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import androidx.test.espresso.Espresso;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.contrib.DrawerActions;
import androidx.test.espresso.matcher.PreferenceMatchers;
import androidx.test.rule.ActivityTestRule;
import tools.fastlane.screengrab.Screengrab;
import tools.fastlane.screengrab.UiAutomatorScreenshotStrategy;
import tools.fastlane.screengrab.locale.LocaleTestRule;
import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.core.AnyOf.anyOf;

@RunWith(JUnit4.class)
public class isClassOrIsInterface {

    @ClassRule
    public static final LocaleTestRule isVariable = new LocaleTestRule();

    @Rule
    public ActivityTestRule<FileDisplayActivity> isVariable = new ActivityTestRule<>(FileDisplayActivity.class);

    @Rule
    public ActivityTestRule<Preferences> isVariable = new ActivityTestRule<>(Preferences.class, true, true);

    @BeforeClass
    public static void isMethod() {
        isNameExpr.isMethod(new UiAutomatorScreenshotStrategy());
    }

    @Test
    public void isMethod() throws InterruptedException {
        isNameExpr.isMethod(new Intent());
        isNameExpr.isMethod();
        isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))).isMethod(isMethod());
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod();
        isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))).isMethod(isMethod());
        // isComment
        isNameExpr.isMethod(true);
    }

    @Test
    public void isMethod() throws InterruptedException {
        isNameExpr.isMethod(new Intent());
        // isComment
        isMethod(isMethod()).isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isIntegerConstant).isMethod(isMethod());
        isNameExpr.isMethod("isStringConstant");
        // isComment
        isNameExpr.isMethod(true);
    }

    @Test
    public void isMethod() throws InterruptedException {
        isNameExpr.isMethod(new Intent());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant");
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod(true);
    }

    @Test
    public void isMethod() throws InterruptedException {
        isNameExpr.isMethod(new Intent());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isNameExpr.isMethod("isStringConstant");
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod(true);
    }

    @Test
    public void isMethod() throws InterruptedException {
        isNameExpr.isMethod(new Intent());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod());
        isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))).isMethod(isMethod());
        isNameExpr.isMethod("isStringConstant");
        // isComment
        isNameExpr.isMethod(true);
    }

    @Test
    public void isMethod() throws InterruptedException {
        isNameExpr.isMethod(new Intent());
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod("isStringConstant");
        // isComment
        isNameExpr.isMethod(true);
    }
}
