// isComment
package net.tjado.passwdsafe.test;

import android.os.Environment;
import android.support.test.espresso.DataInteraction;
import android.support.test.espresso.intent.rule.IntentsTestRule;
import android.support.test.espresso.matcher.BoundedMatcher;
import android.support.test.runner.AndroidJUnit4;
import android.view.Gravity;
import net.tjado.passwdsafe.BuildConfig;
import net.tjado.passwdsafe.FileListActivity;
import net.tjado.passwdsafe.R;
import junit.framework.Assert;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.io.File;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import static android.support.test.espresso.Espresso.onData;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.contrib.DrawerActions.open;
import static android.support.test.espresso.contrib.DrawerMatchers.isClosed;
import static android.support.test.espresso.contrib.NavigationViewActions.navigateTo;
import static android.support.test.espresso.intent.Checks.checkNotNull;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasAction;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasData;
import static android.support.test.espresso.intent.matcher.IntentMatchers.toPackage;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static net.tjado.passwdsafe.test.util.TestUtils.withAdaptedData;
import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasEntry;
import static org.hamcrest.Matchers.hasToString;
import static org.hamcrest.Matchers.instanceOf;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

/**
 * isComment
 */
@RunWith(AndroidJUnit4.class)
public class isClassOrIsInterface {

    public static final File isVariable = isNameExpr.isMethod();

    @Rule
    public IntentsTestRule<FileListActivity> isVariable = new IntentsTestRule<>(FileListActivity.class);

    @Test
    public void isMethod() {
        isMethod();
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod("isStringConstant").isMethod(isMethod(isMethod()));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isMethod("isStringConstant"))));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isMethod(isMethod("isStringConstant")))));
    }

    @Test
    public void isMethod() {
        isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(new File("isStringConstant")) || isNameExpr.isMethod(new File("isStringConstant")));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isMethod())));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isMethod().isMethod())));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isMethod())));
    }

    @Test
    public void isMethod() throws MalformedURLException {
        isMethod();
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isMethod(isMethod(isMethod(isMethod("isStringConstant")), isMethod("isStringConstant"), isMethod("isStringConstant" + isNameExpr.isMethod())));
    }

    @Test
    public void isMethod() {
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr))).isMethod(isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr + "isStringConstant")));
    }

    /**
     * isComment
     */
    private static DataInteraction isMethod(@SuppressWarnings("isStringConstant") String isParameter) {
        return isMethod(isMethod(isMethod(isMethod(HashMap.class)), isMethod(isNameExpr))).isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr));
    }

    /**
     * isComment
     */
    private static Matcher<Object> isMethod(String isParameter) {
        // isComment
        // isComment
        isMethod(isNameExpr);
        return isMethod(isMethod(isNameExpr));
    }

    /**
     * isComment
     */
    private static Matcher<Object> isMethod(final Matcher<String> isParameter) {
        // isComment
        // isComment
        isMethod(isNameExpr);
        return new BoundedMatcher<Object, Map>(Map.class) {

            @Override
            public boolean isMethod(Map isParameter) {
                return isMethod(isMethod("isStringConstant"), isMethod(isNameExpr)).isMethod(isNameExpr);
            }

            @Override
            public void isMethod(Description isParameter) {
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod(isNameExpr);
            }
        };
    }

    /**
     * isComment
     */
    private void isMethod() {
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod(isNameExpr.isFieldAccessExpr)));
    }
}
