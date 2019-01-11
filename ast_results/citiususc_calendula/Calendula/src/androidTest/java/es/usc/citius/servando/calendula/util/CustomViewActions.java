// isComment
package es.usc.citius.servando.calendula.util;

import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.view.View;
import org.hamcrest.Matcher;

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
                isNameExpr.isMethod();
            }
        };
    }
}
