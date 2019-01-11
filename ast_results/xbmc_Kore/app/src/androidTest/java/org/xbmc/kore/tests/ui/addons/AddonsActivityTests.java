// isComment
package org.xbmc.kore.tests.ui.addons;

import android.content.Context;
import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.view.View;
import android.widget.TextView;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.xbmc.kore.R;
import org.xbmc.kore.host.HostInfo;
import org.xbmc.kore.testhelpers.EspressoTestUtils;
import org.xbmc.kore.testhelpers.action.ViewActions;
import org.xbmc.kore.tests.ui.AbstractTestClass;
import org.xbmc.kore.ui.sections.addon.AddonsActivity;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isRoot;
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

/**
 * isComment
 */
public class isClassOrIsInterface extends AbstractTestClass<AddonsActivity> {

    @Rule
    public ActivityTestRule<AddonsActivity> isVariable = new ActivityTestRule<>(AddonsActivity.class);

    @Override
    protected ActivityTestRule<AddonsActivity> isMethod() {
        return isNameExpr;
    }

    @Override
    protected void isMethod(Context isParameter) {
    }

    @Override
    protected void isMethod(HostInfo isParameter) {
    }

    @Before
    public void isMethod() throws Throwable {
        super.isMethod();
        isMethod(isMethod()).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, new ViewActions.CheckStatus() {

            @Override
            public boolean isMethod(View isParameter) {
                return isNameExpr.isMethod();
            }
        }, isIntegerConstant));
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
        isMethod(isNameExpr.isMethod() instanceof AddonsActivity);
        isMethod(((AddonsActivity) isNameExpr.isMethod()).isMethod());
    }
}
