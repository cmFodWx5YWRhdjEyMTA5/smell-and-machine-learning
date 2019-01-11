// isComment
package io.gresse.hugo.anecdote;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import junit.framework.Assert;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import io.gresse.hugo.anecdote.storage.SpStorage;
import tools.fastlane.screengrab.Screengrab;
import tools.fastlane.screengrab.locale.LocaleTestRule;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

@RunWith(JUnit4.class)
public class isClassOrIsInterface {

    @ClassRule
    public static final LocaleTestRule isVariable = new LocaleTestRule();

    @Rule
    public ActivityTestRule<MainActivity> isVariable = new ActivityTestRule<MainActivity>(MainActivity.class) {

        @SuppressLint("isStringConstant")
        @Override
        protected void isMethod() {
            SharedPreferences isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            SharedPreferences.Editor isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod();
            isNameExpr.isMethod();
            super.isMethod();
        }
    };

    @Test
    public void isMethod() throws InterruptedException {
        isNameExpr.isMethod("isStringConstant");
        // isComment
        isNameExpr.isMethod(isIntegerConstant);
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod("isStringConstant");
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod("isStringConstant");
        // isComment
        // isComment
        // isComment
        isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))).isMethod(isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod("isStringConstant");
        // isComment
        isNameExpr.isMethod(isIntegerConstant, isIntegerConstant);
    }
}
