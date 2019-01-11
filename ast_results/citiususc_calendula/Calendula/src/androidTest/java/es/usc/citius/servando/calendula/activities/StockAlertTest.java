// isComment
package es.usc.citius.servando.calendula.activities;

import android.content.Intent;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.google.ical.values.Frequency;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.sql.SQLException;
import es.usc.citius.servando.calendula.HomePagerActivity;
import es.usc.citius.servando.calendula.R;
import es.usc.citius.servando.calendula.adapters.AlertViewRecyclerAdapter;
import es.usc.citius.servando.calendula.adapters.HomePages;
import es.usc.citius.servando.calendula.database.DB;
import es.usc.citius.servando.calendula.persistence.Medicine;
import es.usc.citius.servando.calendula.persistence.Patient;
import es.usc.citius.servando.calendula.persistence.PatientAlert;
import es.usc.citius.servando.calendula.persistence.Presentation;
import es.usc.citius.servando.calendula.persistence.RepetitionRule;
import es.usc.citius.servando.calendula.persistence.Schedule;
import es.usc.citius.servando.calendula.persistence.alerts.StockRunningOutAlert;
import es.usc.citius.servando.calendula.util.CustomViewActions;
import es.usc.citius.servando.calendula.util.CustomViewMatchers;
import es.usc.citius.servando.calendula.util.PreferenceKeys;
import es.usc.citius.servando.calendula.util.PreferenceUtils;
import es.usc.citius.servando.calendula.util.TestUtils;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class isClassOrIsInterface {

    @Rule
    public final ActivityTestRule<HomePagerActivity> isVariable = new ActivityTestRule<>(HomePagerActivity.class, true, true);

    private static final String isVariable = "isStringConstant";

    @Before
    public void isMethod() throws SQLException {
        // isComment
        isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr).isMethod();
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isMethod(), "isStringConstant").isMethod();
        // isComment
        final Patient isVariable = isNameExpr.isMethod().isMethod();
        Medicine isVariable = new Medicine();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, null));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isDoubleConstant);
        isNameExpr.isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isMethod(), true).isMethod();
        final RepetitionRule isVariable = new RepetitionRule();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isIntegerConstant);
        Schedule isVariable = new Schedule();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isDoubleConstant);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod(new Intent());
        isNameExpr.isMethod(isNameExpr.isMethod());
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isMethod()).isMethod();
    }

    @Test
    public void isMethod() {
        final HomePagerActivity isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(new Runnable() {

            @Override
            public void isMethod() {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod());
            }
        });
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
        isNameExpr.isMethod(isIntegerConstant);
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isNameExpr.isMethod(isIntegerConstant)));
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod()));
    }

    private static Matcher<View> isMethod() {
        return new TypeSafeMatcher<View>() {

            @Override
            public boolean isMethod(final View isParameter) {
                RecyclerView isVariable = (RecyclerView) isNameExpr;
                AlertViewRecyclerAdapter isVariable = (AlertViewRecyclerAdapter) isNameExpr.isMethod();
                final PatientAlert isVariable = isNameExpr.isMethod(isIntegerConstant);
                return isNameExpr instanceof StockRunningOutAlert;
            }

            @Override
            public void isMethod(final Description isParameter) {
                isNameExpr.isMethod("isStringConstant");
            }
        };
    }
}
