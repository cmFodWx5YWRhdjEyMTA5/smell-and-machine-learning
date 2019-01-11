// isComment
package org.xbmc.kore.testhelpers.action;

import android.graphics.Rect;
import android.support.test.espresso.PerformException;
import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.espresso.util.HumanReadables;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import org.hamcrest.Matcher;
import org.xbmc.kore.utils.LogUtils;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayingAtLeast;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static android.support.test.espresso.matcher.ViewMatchers.withEffectiveVisibility;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.anyOf;

/**
 * isComment
 */
public class isClassOrIsInterface implements ViewAction {

    private static final String isVariable = isNameExpr.isMethod(NestedScrollTo.class);

    @Override
    public Matcher<View> isMethod() {
        return isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isMethod(isMethod(NestedScrollView.class))));
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public void isMethod(UiController isParameter, View isParameter) {
        if (isMethod(isIntegerConstant).isMethod(isNameExpr)) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
            return;
        }
        Rect isVariable = new Rect();
        isNameExpr.isMethod(isNameExpr);
        if (!isNameExpr.isMethod(isNameExpr, true)) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
        }
        isNameExpr.isMethod();
        if (!isMethod(isIntegerConstant).isMethod(isNameExpr)) {
            throw new PerformException.Builder().isMethod(this.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(new RuntimeException("isStringConstant")).isMethod();
        }
    }
}
