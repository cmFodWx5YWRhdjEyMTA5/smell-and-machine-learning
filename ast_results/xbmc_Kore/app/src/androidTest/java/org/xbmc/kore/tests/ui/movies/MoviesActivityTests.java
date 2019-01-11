// isComment
package org.xbmc.kore.tests.ui.movies;

import android.content.Context;
import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.widget.TextView;
import org.junit.Rule;
import org.junit.Test;
import org.xbmc.kore.R;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.testhelpers.EspressoTestUtils;
import org.xbmc.kore.tests.ui.AbstractTestClass;
import org.xbmc.kore.ui.sections.video.MoviesActivity;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.instanceOf;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.xbmc.kore.testhelpers.EspressoTestUtils.clickRecyclerViewItem;
import static org.xbmc.kore.testhelpers.EspressoTestUtils.rotateDevice;
import static org.xbmc.kore.testhelpers.EspressoTestUtils.selectListItemPressBackAndCheckActionbarTitle;

public class isClassOrIsInterface extends AbstractTestClass<MoviesActivity> {

    @Rule
    public ActivityTestRule<MoviesActivity> isVariable = new ActivityTestRule<>(MoviesActivity.class);

    @Override
    protected ActivityTestRule<MoviesActivity> isMethod() {
        return isNameExpr;
    }

    @Override
    protected void isMethod(Context isParameter) {
    }

    @Override
    protected void isMethod(HostInfo isParameter) {
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        isMethod(isMethod(isMethod(TextView.class), isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)))).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant");
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, "isStringConstant", isMethod());
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        isMethod(isMethod().isMethod());
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isMethod().isMethod());
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isMethod(isMethod().isMethod());
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isMethod());
        isMethod(isMethod().isMethod());
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() {
        isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isMethod());
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod() instanceof MoviesActivity);
        isMethod(((MoviesActivity) isNameExpr.isMethod()).isMethod());
    }
}
