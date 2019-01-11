// isComment
package org.xbmc.kore.testhelpers.action;

import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.view.View;
import org.hamcrest.Matcher;
import static org.hamcrest.Matchers.allOf;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;

public class isClassOrIsInterface implements ViewAction {

    @Override
    public Matcher<View> isMethod() {
        return isMethod(isMethod(), isMethod(View.class));
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public void isMethod(UiController isParameter, View isParameter) {
        isNameExpr.isMethod();
    }
}
