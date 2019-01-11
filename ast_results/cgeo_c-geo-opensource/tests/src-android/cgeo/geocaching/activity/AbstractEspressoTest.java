// isComment
package cgeo.geocaching.activity;

import static com.google.android.apps.common.testing.ui.espresso.Espresso.onData;
import static com.google.android.apps.common.testing.ui.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static com.google.android.apps.common.testing.ui.espresso.action.ViewActions.click;
import static org.hamcrest.Matchers.hasToString;
import static org.hamcrest.Matchers.startsWith;
import android.app.Activity;
import android.support.annotation.StringRes;
import android.test.ActivityInstrumentationTestCase2;

public abstract class isClassOrIsInterface<T extends Activity> extends ActivityInstrumentationTestCase2<T> {

    public isConstructor(final Class<T> isParameter) {
        super(isNameExpr);
    }

    protected final void isMethod(final int isParameter) {
        isMethod(isMethod(isMethod(isMethod(isNameExpr)))).isMethod(isMethod());
    }

    protected final void isMethod() {
        isMethod(isMethod().isMethod());
    }

    protected final String isMethod(@StringRes final int isParameter) {
        return isMethod().isMethod(isNameExpr);
    }
}
