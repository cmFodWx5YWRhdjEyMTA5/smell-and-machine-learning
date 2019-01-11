// isComment
package com.veniosg.dir.test.actor.assertion;

import android.support.annotation.IdRes;
import com.veniosg.dir.R;
import com.veniosg.dir.android.ui.widget.PathItemView;
import com.veniosg.dir.mvvm.model.FileHolder;
import java.io.File;
import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withClassName;
import static android.support.test.espresso.matcher.ViewMatchers.withHint;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static com.veniosg.dir.test.matcher.FileHolderHasName.hasName;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;

public class isClassOrIsInterface {

    public void isMethod(File isParameter) {
        isMethod(isNameExpr.isMethod());
    }

    public void isMethod(String isParameter) {
        isMethod(isMethod(isMethod(isMethod(FileHolder.class)), isMethod(isNameExpr))).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)))).isMethod(isMethod(isMethod()));
    }

    public void isMethod(File isParameter) {
        String isVariable = isNameExpr.isMethod();
        isMethod(isMethod(isMethod(isMethod(isMethod(PathItemView.class.isMethod()))), isMethod(isNameExpr))).isMethod(isMethod(isMethod()));
    }

    public void isMethod(String isParameter) {
        isMethod(isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), isMethod(isNameExpr))).isMethod(isMethod(isMethod()));
    }

    public void isMethod(File isParameter) {
        isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isNameExpr.isMethod()))).isMethod(isMethod(isMethod()));
    }

    public void isMethod(File isParameter) {
        String isVariable = "isStringConstant" + isNameExpr.isMethod();
        isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isNameExpr))).isMethod(isMethod(isMethod()));
    }

    public void isMethod() {
        isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod("isStringConstant"))).isMethod(isMethod(isMethod()));
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    private void isMethod(@IdRes int isParameter) {
        isMethod(isMethod(isNameExpr)).isMethod(isMethod(isMethod()));
    }
}
