// isComment
package io.gresse.hugo.anecdote;

import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.view.View;
import org.hamcrest.Matcher;

/**
 * isComment
 */
public class isClassOrIsInterface {

    public static ViewAction isMethod(final int isParameter) {
        return new ViewAction() {

            @Override
            public Matcher<View> isMethod() {
                return null;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public void isMethod(UiController isParameter, View isParameter) {
                View isVariable = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr != null) {
                    isNameExpr.isMethod();
                }
            }
        };
    }

    public static ViewAction isMethod(final int isParameter) {
        return new ViewAction() {

            @Override
            public Matcher<View> isMethod() {
                return null;
            }

            @Override
            public String isMethod() {
                return "isStringConstant";
            }

            @Override
            public void isMethod(UiController isParameter, View isParameter) {
                View isVariable = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr != null) {
                    isNameExpr.isMethod();
                }
            }
        };
    }
}
