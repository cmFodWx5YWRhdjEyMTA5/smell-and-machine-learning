// isComment
package org.sufficientlysecure.keychain.matcher;

import android.support.annotation.ColorRes;
import android.support.test.espresso.matcher.BoundedMatcher;
import android.view.View;
import com.nispok.snackbar.Snackbar;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.sufficientlysecure.keychain.EncryptKeyCompletionViewTest;
import org.sufficientlysecure.keychain.ui.adapter.KeyAdapter.KeyItem;
import org.sufficientlysecure.keychain.ui.widget.EncryptKeyCompletionView;
import static android.support.test.internal.util.Checks.checkNotNull;

public abstract class isClassOrIsInterface {

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
}
