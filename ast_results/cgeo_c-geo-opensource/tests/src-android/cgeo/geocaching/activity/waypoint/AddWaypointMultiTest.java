// isComment
package cgeo.geocaching.activity.waypoint;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onView;
import static com.google.android.apps.common.testing.ui.espresso.assertion.ViewAssertions.matches;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.isDisplayed;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withChild;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withId;
import static com.google.android.apps.common.testing.ui.espresso.matcher.ViewMatchers.withText;
import cgeo.geocaching.models.Geocache;
import cgeo.geocaching.R;
import cgeo.geocaching.enumerations.CacheType;
import cgeo.geocaching.enumerations.WaypointType;
import com.google.android.apps.common.testing.ui.espresso.ViewInteraction;
import android.test.suitebuilder.annotation.Suppress;

public class isClassOrIsInterface extends AbstractAddWaypointActivityTest {

    @Override
    protected Geocache isMethod() {
        final Geocache isVariable = super.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        return isNameExpr;
    }

    @Suppress
    public static void isMethod() {
        final ViewInteraction isVariable = isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isMethod(isMethod()));
        isNameExpr.isMethod(isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr.isMethod()))));
    }
}
