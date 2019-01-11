// isComment
package cgeo.geocaching.activity.waypoint;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withChild;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;
import static org.assertj.core.api.Java6Assertions.assertThat;
import cgeo.geocaching.R;
import android.test.suitebuilder.annotation.Suppress;

public class isClassOrIsInterface extends AbstractEditWaypointActivityTest {

    @Suppress
    public void isMethod() {
        final String isVariable = isMethod().isMethod();
        isMethod(isNameExpr).isMethod();
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr)));
        final String isVariable = isMethod().isMethod();
        isMethod(isNameExpr).isMethod();
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr)));
        final String isVariable = isMethod().isMethod();
        isMethod(isNameExpr).isMethod();
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr)));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isMethod(isMethod().isMethod().isMethod()))));
    }
}
