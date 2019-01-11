// isComment
package com.veniosg.dir.test.actor.action;

import android.widget.EditText;
import com.veniosg.dir.R;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.clearText;
import static android.support.test.espresso.action.ViewActions.pressImeActionButton;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.equalTo;

public class isClassOrIsInterface {

    public void isMethod(String isParameter) {
        isMethod(isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), isMethod(isMethod(EditText.class.isMethod())), isMethod())).isMethod(isMethod(isNameExpr));
    }

    public void isMethod(String isParameter) {
        isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod())).isMethod(isMethod(isNameExpr));
    }

    public void isMethod(String isParameter) {
        isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod())).isMethod(isMethod(isNameExpr));
    }

    public void isMethod() {
        isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod())).isMethod(isMethod());
    }

    public void isMethod() {
        isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod())).isMethod(isMethod());
    }
}
