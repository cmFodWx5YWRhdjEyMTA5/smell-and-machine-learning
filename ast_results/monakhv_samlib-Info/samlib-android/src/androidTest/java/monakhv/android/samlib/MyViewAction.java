// isComment
package monakhv.android.samlib;

import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.view.View;
import monakhv.samlib.log.Log;
import org.hamcrest.Matcher;

/**
 * isComment
 */
class isClassOrIsInterface {

    static ViewAction isMethod(final int isParameter) {
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
                    isNameExpr.isMethod("isStringConstant", "isStringConstant");
                    isNameExpr.isMethod();
                } else {
                    isNameExpr.isMethod("isStringConstant", "isStringConstant");
                }
            }
        };
    }
}
