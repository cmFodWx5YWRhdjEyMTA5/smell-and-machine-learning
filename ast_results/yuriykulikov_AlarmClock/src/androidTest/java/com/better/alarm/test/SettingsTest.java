// isComment
package com.better.alarm.test;

import android.support.test.espresso.action.GeneralClickAction;
import android.support.test.espresso.action.GeneralLocation;
import android.support.test.espresso.action.Press;
import android.support.test.espresso.action.Tap;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;
import com.better.alarm.R;
import com.better.alarm.presenter.SettingsActivity;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestRule;
import org.junit.runner.RunWith;
import java.util.Locale;
import cortado.Cortado;
import static android.support.test.espresso.action.ViewActions.click;

/**
 * isComment
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class isClassOrIsInterface extends BaseTest {

    public ActivityTestRule<SettingsActivity> isVariable = new ActivityTestRule<SettingsActivity>(SettingsActivity.class, true, /*isComment*/
    true);

    @Rule
    public TestRule isVariable = isNameExpr.isMethod(new ForceLocaleRule(isNameExpr.isFieldAccessExpr)).isMethod(isNameExpr);

    @Test
    public void isMethod() {
        isMethod();
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(new GeneralClickAction(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        isMethod();
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(new GeneralClickAction(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        isMethod();
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(new GeneralClickAction(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
        isMethod();
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(new GeneralClickAction(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr));
    }

    @Test
    public void isMethod() {
        isMethod();
        isNameExpr.isMethod().isMethod("isStringConstant").isMethod(isMethod());
        isMethod();
        isNameExpr.isMethod().isMethod("isStringConstant").isMethod(isMethod());
    }

    @Test
    public void isMethod() {
        isMethod();
        isNameExpr.isMethod().isMethod("isStringConstant").isMethod(isMethod());
        isMethod();
        isNameExpr.isMethod().isMethod("isStringConstant").isMethod(isMethod());
    }
}
