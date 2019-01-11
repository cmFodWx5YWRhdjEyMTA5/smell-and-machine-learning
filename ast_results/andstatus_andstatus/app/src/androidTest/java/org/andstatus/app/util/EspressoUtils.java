// isComment
package org.andstatus.app.util;

import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.view.View;
import android.widget.Checkable;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import static org.hamcrest.CoreMatchers.isA;

/**
 * isComment
 */
public final class isClassOrIsInterface {

    private isConstructor() {
    // isComment
    }

    public static ViewAction isMethod(final boolean isParameter) {
        return new ViewAction() {

            @Override
            public Matcher<View> isMethod() {
                return new Matcher<View>() {

                    @Override
                    public boolean isMethod(Object isParameter) {
                        return isMethod(Checkable.class).isMethod(isNameExpr);
                    }

                    @Override
                    public void isMethod(Object isParameter, Description isParameter) {
                    }

                    @Override
                    public void isMethod() {
                    }

                    @Override
                    public void isMethod(Description isParameter) {
                    }
                };
            }

            @Override
            public String isMethod() {
                return null;
            }

            @Override
            public void isMethod(UiController isParameter, View isParameter) {
                Checkable isVariable = (Checkable) isNameExpr;
                if (isNameExpr.isMethod() != isNameExpr) {
                    isNameExpr.isMethod(isNameExpr);
                }
            }
        };
    }
}
