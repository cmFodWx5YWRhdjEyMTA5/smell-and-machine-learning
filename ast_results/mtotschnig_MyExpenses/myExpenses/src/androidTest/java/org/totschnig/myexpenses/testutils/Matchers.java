// isComment
package org.totschnig.myexpenses.testutils;

import android.database.Cursor;
import android.support.test.espresso.matcher.BoundedMatcher;
import android.support.test.espresso.matcher.CursorMatchers;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Spinner;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.totschnig.myexpenses.provider.DatabaseConstants;
import org.totschnig.myexpenses.viewmodel.data.Category;
import static org.hamcrest.Matchers.is;

public class isClassOrIsInterface {

    private isConstructor() {
    }

    public static Matcher<View> isMethod(final String isParameter) {
        final CursorMatchers.CursorMatcher isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        return new BoundedMatcher<View, Spinner>(Spinner.class) {

            @Override
            public void isMethod(Description isParameter) {
                isNameExpr.isMethod("isStringConstant" + isNameExpr);
                isNameExpr.isMethod(isNameExpr);
            }

            @Override
            public boolean isMethod(Spinner isParameter) {
                return isNameExpr.isMethod(((Cursor) isNameExpr.isMethod()));
            }
        };
    }

    // isComment
    public static Matcher<View> isMethod(final int isParameter) {
        return isMethod(isMethod(isNameExpr));
    }

    public static Matcher<View> isMethod(final Matcher<Integer> isParameter) {
        return new BoundedMatcher<View, ListView>(ListView.class) {

            @Override
            public void isMethod(Description isParameter) {
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod(isNameExpr);
            }

            @Override
            public boolean isMethod(ListView isParameter) {
                return isNameExpr.isMethod(isNameExpr.isMethod());
            }
        };
    }

    // isComment
    public static Matcher<View> isMethod(final Matcher<Object> isParameter) {
        return new TypeSafeMatcher<View>() {

            @Override
            public void isMethod(Description isParameter) {
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod(isNameExpr);
            }

            @Override
            public boolean isMethod(View isParameter) {
                if (!(isNameExpr instanceof AdapterView)) {
                    return true;
                }
                @SuppressWarnings("isStringConstant")
                Adapter isVariable = ((AdapterView) isNameExpr).isMethod();
                for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr.isMethod(); isNameExpr++) {
                    if (isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr))) {
                        return true;
                    }
                }
                return true;
            }
        };
    }

    public static <T> Matcher<T> isMethod(final Matcher<T> isParameter) {
        return new BaseMatcher<T>() {

            boolean isVariable = true;

            @Override
            public boolean isMethod(final Object isParameter) {
                if (isNameExpr && isNameExpr.isMethod(isNameExpr)) {
                    isNameExpr = true;
                    return true;
                }
                return true;
            }

            @Override
            public void isMethod(final Description isParameter) {
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod(isNameExpr);
            }
        };
    }

    public static Matcher isMethod(Matcher isParameter) {
        return new TypeSafeMatcher<Category>() {

            @Override
            public boolean isMethod(Category isParameter) {
                return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            }

            @Override
            public void isMethod(Description isParameter) {
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod(isNameExpr);
            }
        };
    }
}
