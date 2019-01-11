// isComment
package org.wordpress.android.ui.screenshots.support;

import android.support.test.espresso.UiController;
import android.support.test.espresso.ViewAction;
import android.view.View;
import android.widget.EditText;
import org.hamcrest.Matcher;
import static android.text.InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.Matchers.allOf;

public class isClassOrIsInterface implements ViewAction {

    @Override
    public void isMethod(UiController isParameter, View isParameter) {
        if (!(isNameExpr instanceof EditText)) {
            return;
        }
        EditText isVariable = (EditText) isNameExpr;
        // isComment
        isNameExpr.isMethod(isNameExpr);
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        isNameExpr.isMethod();
        isNameExpr.isMethod();
    }

    @Override
    public Matcher<View> isMethod() {
        return isMethod(isMethod(EditText.class));
    }

    @Override
    public String isMethod() {
        return "isStringConstant";
    }
}
