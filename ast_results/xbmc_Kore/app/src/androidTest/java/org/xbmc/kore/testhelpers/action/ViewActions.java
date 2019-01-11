// isComment
package org.xbmc.kore.testhelpers.action;

import android.support.test.espresso.PerformException;
import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.action.MotionEvents;
import android.support.test.espresso.action.Press;
import android.support.test.espresso.action.ScrollToAction;
import android.support.test.espresso.util.HumanReadables;
import android.support.test.espresso.util.TreeIterables;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.SeekBar;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import java.util.concurrent.TimeoutException;
import static android.support.test.espresso.action.ViewActions.actionWithAssertions;
import static android.support.test.espresso.matcher.ViewMatchers.isRoot;

public final class isClassOrIsInterface {

    /**
     * isComment
     */
    public static ViewAction isMethod() {
        return isMethod(new ClearFocus());
    }

    /**
     * isComment
     */
    public static ViewAction isMethod() {
        return isMethod(new NestedScrollTo());
    }

    public interface isClassOrIsInterface {

        boolean isMethod(View isParameter);
    }

    /**
     * isComment
     */
    public static ViewAction isMethod(final int isParameter, final CheckStatus isParameter, final long isParameter) {
        return new ViewAction() {

            @Override
            public Matcher<View> isMethod() {
                return isMethod();
            }

            @Override
            public String isMethod() {
                return "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
            }

            @Override
            public void isMethod(UiController isParameter, View isParameter) {
                isNameExpr.isMethod();
                final long isVariable = isNameExpr.isMethod() + isNameExpr;
                do {
                    for (View isVariable : isNameExpr.isMethod(isNameExpr)) {
                        if (isNameExpr.isMethod() == isNameExpr) {
                            if (isNameExpr.isMethod(isNameExpr)) {
                                return;
                            }
                        }
                    }
                    isNameExpr.isMethod(isIntegerConstant);
                } while (isNameExpr.isMethod() < isNameExpr);
                throw new PerformException.Builder().isMethod(this.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(new TimeoutException()).isMethod();
            }
        };
    }

    public static ViewAction isMethod(final int isParameter) {
        return new ViewAction() {

            @Override
            public Matcher<View> isMethod() {
                return new TypeSafeMatcher<View>() {

                    @Override
                    protected boolean isMethod(View isParameter) {
                        return isNameExpr instanceof SeekBar;
                    }

                    @Override
                    public void isMethod(Description isParameter) {
                        isNameExpr.isMethod("isStringConstant");
                    }
                };
            }

            @Override
            public String isMethod() {
                return "isStringConstant" + isNameExpr;
            }

            @Override
            public void isMethod(UiController isParameter, View isParameter) {
                SeekBar isVariable = (SeekBar) isNameExpr;
                int[] isVariable = { isIntegerConstant, isIntegerConstant };
                isNameExpr.isMethod(isNameExpr);
                float[] isVariable = { isNameExpr[isIntegerConstant], isNameExpr[isIntegerConstant] };
                MotionEvents.DownResultHolder isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr.isMethod());
                while (isNameExpr.isMethod() < isNameExpr) {
                    isNameExpr[isIntegerConstant]++;
                    isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr);
                    isNameExpr.isMethod(isIntegerConstant);
                }
                isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr);
            }
        };
    }

    public static ViewAction isMethod(final int isParameter) {
        return new ViewAction() {

            @Override
            public Matcher<View> isMethod() {
                return new TypeSafeMatcher<View>() {

                    @Override
                    protected boolean isMethod(View isParameter) {
                        return isNameExpr instanceof ViewPager;
                    }

                    @Override
                    public void isMethod(Description isParameter) {
                        isNameExpr.isMethod("isStringConstant");
                    }
                };
            }

            @Override
            public String isMethod() {
                return null;
            }

            @Override
            public void isMethod(UiController isParameter, View isParameter) {
                ViewPager isVariable = (ViewPager) isNameExpr;
                String isVariable = isNameExpr.isMethod().isMethod(isNameExpr);
                PagerAdapter isVariable = isNameExpr.isMethod();
                for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                    if (isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr))) {
                        isNameExpr.isMethod(isNameExpr);
                        return;
                    }
                }
            }
        };
    }
}
