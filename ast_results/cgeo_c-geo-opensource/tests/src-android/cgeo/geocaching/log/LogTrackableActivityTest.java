// isComment
package cgeo.geocaching.log;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.doesNotExist;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.isDisplayed;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;
import cgeo.geocaching.R;
import android.test.suitebuilder.annotation.Suppress;

// isComment
@Suppress
public class isClassOrIsInterface extends AbstractLogTrackableActivityTest {

    public void isMethod() throws Exception {
        isMethod();
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))).isMethod(isMethod(isMethod()));
    }

    public void isMethod() throws Exception {
        isMethod();
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))).isMethod(isMethod());
    }
}
