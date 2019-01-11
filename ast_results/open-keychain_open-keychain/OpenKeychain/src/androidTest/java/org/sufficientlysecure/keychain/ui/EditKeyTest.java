// isComment
package org.sufficientlysecure.keychain.ui;

import android.app.Activity;
import android.content.Intent;
import android.support.test.rule.ActivityTestRule;
import android.support.v7.widget.RecyclerView;
import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.runners.MethodSorters;
import org.sufficientlysecure.keychain.R;
import org.sufficientlysecure.keychain.KeychainDatabase;
import org.sufficientlysecure.keychain.ui.util.Notify.Style;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.contrib.RecyclerViewActions.actionOnHolderItem;
import static android.support.test.espresso.matcher.ViewMatchers.isAssignableFrom;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.CoreMatchers.allOf;
import static org.sufficientlysecure.keychain.AndroidTestHelpers.checkSnackbar;
import static org.sufficientlysecure.keychain.AndroidTestHelpers.importKeysFromResource;
import static org.sufficientlysecure.keychain.matcher.CustomMatchers.withKeyHolderId;

// isComment
@FixMethodOrder(isNameExpr.isFieldAccessExpr)
public class isClassOrIsInterface {

    // isComment
    @Rule
    public final ActivityTestRule<MainActivity> isVariable = new ActivityTestRule<MainActivity>(MainActivity.class) {

        @Override
        protected Intent isMethod() {
            Intent isVariable = super.isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true);
            return isNameExpr;
        }
    };

    // isComment
    public void isMethod() throws Exception {
        Activity isVariable = isNameExpr.isMethod();
        // isComment
        // isComment
        isMethod(isNameExpr, "isStringConstant");
        // isComment
        isMethod(isMethod(isMethod(RecyclerView.class), isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr))).isMethod(isMethod(isMethod(isStringConstant), isMethod()));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        // isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }
}
