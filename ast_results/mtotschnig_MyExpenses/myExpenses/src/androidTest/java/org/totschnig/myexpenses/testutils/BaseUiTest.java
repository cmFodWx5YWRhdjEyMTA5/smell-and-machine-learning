// isComment
package org.totschnig.myexpenses.testutils;

import android.os.Build;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.NoMatchingViewException;
import android.support.test.rule.ActivityTestRule;
import android.support.v4.app.Fragment;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import org.hamcrest.Matcher;
import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.activity.ProtectedFragmentActivity;
import org.totschnig.myexpenses.model.ContribFeature;
import org.totschnig.myexpenses.util.Utils;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;
import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.scrollTo;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.totschnig.myexpenses.testutils.Espresso.openActionBarOverflowOrOptionsMenu;

public abstract class isClassOrIsInterface {

    protected void isMethod() {
        isMethod(isIntegerConstant);
    }

    protected void isMethod(Matcher<Object> isParameter) {
        isMethod();
        isMethod(isNameExpr).isMethod(isMethod()).isMethod(isIntegerConstant).isMethod(isMethod());
    }

    private void isMethod(int isParameter) {
        isMethod();
        isMethod(isMethod()).isMethod(isMethod(AdapterView.class)).isMethod(isNameExpr).isMethod(isMethod());
    }

    /**
     * isComment
     */
    protected void isMethod(int isParameter, int isParameter) {
        try {
            isMethod(isMethod(isNameExpr)).isMethod(isMethod());
        } catch (NoMatchingViewException isParameter) {
            isMethod(isNameExpr.isMethod());
            isMethod(isMethod(isNameExpr)).isMethod(isMethod());
        }
    }

    protected Matcher<View> isMethod() {
        return isMethod(isMethod(AdapterView.class), isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)), isMethod());
    }

    /**
     * isComment
     */
    protected void isMethod(int isParameter, int isParameter) {
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) ? isMethod(isNameExpr) : isMethod(isNameExpr)).isMethod(isMethod());
    }

    protected void isMethod(ContribFeature isParameter) throws InterruptedException {
        if (!isNameExpr.isMethod()) {
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod()));
            // isComment
            isNameExpr.isMethod(isIntegerConstant);
            isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod()).isMethod(isMethod());
        }
    }

    protected abstract ActivityTestRule<? extends ProtectedFragmentActivity> isMethod();

    private ViewGroup isMethod() {
        Fragment isVariable = isMethod().isMethod().isMethod();
        if (isNameExpr == null)
            return null;
        return (ViewGroup) isNameExpr.isMethod().isMethod(isMethod());
    }

    protected int isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    private Adapter isMethod() {
        ViewGroup isVariable = isMethod();
        if (isNameExpr == null)
            return null;
        if (isNameExpr instanceof StickyListHeadersListView) {
            return ((StickyListHeadersListView) isNameExpr).isMethod();
        }
        if (isNameExpr instanceof ListView) {
            return ((ListView) isNameExpr).isMethod();
        }
        return null;
    }

    protected Adapter isMethod() {
        while (true) {
            Adapter isVariable = isMethod();
            try {
                isNameExpr.isMethod(isIntegerConstant);
            } catch (InterruptedException isParameter) {
            }
            if (isNameExpr != null) {
                return isNameExpr;
            }
        }
    }
}
