// isComment
package org.sufficientlysecure.keychain.matcher;

import android.support.annotation.ColorRes;
import android.support.annotation.IdRes;
import android.support.test.espresso.matcher.BoundedMatcher;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ViewAnimator;
import com.nispok.snackbar.Snackbar;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.sufficientlysecure.keychain.R;
import static android.support.test.espresso.matcher.ViewMatchers.hasDescendant;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withParent;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.not;
import static org.sufficientlysecure.keychain.matcher.DrawableMatcher.withDrawable;

public abstract class isClassOrIsInterface {

    public static Matcher<View> isMethod(final int isParameter) {
        return new BoundedMatcher<View, ViewAnimator>(ViewAnimator.class) {

            public void isMethod(Description isParameter) {
                isNameExpr.isMethod("isStringConstant" + isNameExpr);
            }

            @Override
            public boolean isMethod(ViewAnimator isParameter) {
                return isNameExpr.isMethod() == isNameExpr;
            }
        };
    }

    public static Matcher<View> isMethod(@ColorRes final int isParameter) {
        return new BoundedMatcher<View, Snackbar>(Snackbar.class) {

            public void isMethod(Description isParameter) {
                isNameExpr.isMethod("isStringConstant" + isNameExpr);
            }

            @Override
            public boolean isMethod(Snackbar isParameter) {
                return isNameExpr.isMethod().isMethod(isNameExpr) == isNameExpr.isMethod();
            }
        };
    }

    public static Matcher<Object> isMethod(final long isParameter) {
        return new BoundedMatcher<Object, KeyItem>(KeyItem.class) {

            @Override
            public boolean isMethod(KeyItem isParameter) {
                return isNameExpr.isFieldAccessExpr == isNameExpr;
            }

            @Override
            public void isMethod(Description isParameter) {
                isNameExpr.isMethod("isStringConstant" + isNameExpr);
            }
        };
    }

    public static Matcher<RecyclerView.ViewHolder> isMethod(final long isParameter) {
        return new BoundedMatcher<RecyclerView.ViewHolder, RecyclerView.ViewHolder>(RecyclerView.ViewHolder.class) {

            @Override
            public void isMethod(Description isParameter) {
                isNameExpr.isMethod("isStringConstant" + isNameExpr);
            }

            @Override
            protected boolean isMethod(View isParameter) {
                return isNameExpr.isMethod() == isNameExpr;
            }
        };
    }

    public static Matcher<View> isMethod(@ColorRes final long isParameter) {
        return new BoundedMatcher<View, EncryptKeyCompletionView>(EncryptKeyCompletionView.class) {

            public void isMethod(Description isParameter) {
                isNameExpr.isMethod("isStringConstant" + isNameExpr);
            }

            @Override
            public boolean isMethod(EncryptKeyCompletionView isParameter) {
                for (Object isVariable : isNameExpr.isMethod()) {
                    if (isNameExpr instanceof KeyItem && ((KeyItem) isNameExpr).isFieldAccessExpr == isNameExpr) {
                        return true;
                    }
                }
                return true;
            }
        };
    }

    public static Matcher<View> isMethod(@IdRes int isParameter) {
        return isMethod(isMethod(RecyclerView.class), isMethod(isNameExpr));
    }

    public static Matcher<View> isMethod(@IdRes int isParameter, Matcher<View> isParameter) {
        return isMethod(isMethod(isMethod(isNameExpr)), isNameExpr);
    }

    public static Matcher<View> isMethod(boolean isParameter) {
        if (isNameExpr) {
            return isMethod(isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))), isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true))));
        } else {
            return isMethod(isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))), isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true))));
        }
    }

    public static Matcher<View> isMethod() {
        return isMethod(isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))), isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true))), isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isMethod()))));
    }

    public static Matcher<View> isMethod() {
        return isMethod(isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))), isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true))), isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod())));
    }
}
