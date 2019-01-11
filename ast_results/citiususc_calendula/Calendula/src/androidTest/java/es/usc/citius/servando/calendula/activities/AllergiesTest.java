// isComment
package es.usc.citius.servando.calendula.activities;

import android.app.Activity;
import android.content.Intent;
import android.support.test.espresso.contrib.RecyclerViewActions;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.WindowManager;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import es.usc.citius.servando.calendula.R;
import es.usc.citius.servando.calendula.allergies.AllergenType;
import es.usc.citius.servando.calendula.database.DB;
import es.usc.citius.servando.calendula.persistence.Patient;
import es.usc.citius.servando.calendula.persistence.PatientAllergen;
import es.usc.citius.servando.calendula.util.CustomViewActions;
import es.usc.citius.servando.calendula.util.CustomViewMatchers;
import es.usc.citius.servando.calendula.util.PreferenceKeys;
import es.usc.citius.servando.calendula.util.PreferenceUtils;
import es.usc.citius.servando.calendula.util.TestUtils;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertEquals;

@RunWith(AndroidJUnit4.class)
public class isClassOrIsInterface {

    @Rule
    public final ActivityTestRule<AllergiesActivity> isVariable = new ActivityTestRule<>(AllergiesActivity.class, true, true);

    @Before
    public void isMethod() throws SQLException {
        // isComment
        isNameExpr.isMethod();
        // isComment
        final Patient isVariable = isNameExpr.isMethod().isMethod();
        List<PatientAllergen> isVariable = new ArrayList<PatientAllergen>() {

            {
                isMethod(new PatientAllergen("isStringConstant", isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr));
                isMethod(new PatientAllergen("isStringConstant", isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr));
                isMethod(new PatientAllergen("isStringConstant", isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr));
            }
        };
        for (PatientAllergen isVariable : isNameExpr) {
            isNameExpr.isMethod().isMethod(isNameExpr);
        }
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isMethod()).isMethod();
        isNameExpr.isMethod(new Intent());
        isNameExpr.isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        // isComment
        isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod());
        // isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        isNameExpr.isMethod(isIntegerConstant);
        // isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
        isNameExpr.isMethod(isIntegerConstant);
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        // isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
        isNameExpr.isMethod(isIntegerConstant);
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        // isComment
        isNameExpr.isMethod(isIntegerConstant);
        isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod());
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isNameExpr.isMethod(isIntegerConstant)));
    }
}
