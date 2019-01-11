// isComment
package es.usc.citius.servando.calendula.activities;

import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.assertion.ViewAssertions;
import android.test.ActivityInstrumentationTestCase2;
import android.view.View;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.joda.time.LocalTime;
import org.junit.Before;
import org.junit.Test;
import es.usc.citius.servando.calendula.CalendulaApp;
import es.usc.citius.servando.calendula.R;
import es.usc.citius.servando.calendula.database.DB;
import es.usc.citius.servando.calendula.fragments.RoutineCreateOrEditFragment;
import es.usc.citius.servando.calendula.persistence.Routine;
import es.usc.citius.servando.calendula.util.TestUtils;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class isClassOrIsInterface extends ActivityInstrumentationTestCase2<RoutinesActivity> {

    private static final String isVariable = "isStringConstant";

    private RoutinesActivity isVariable;

    public isConstructor() {
        super(RoutinesActivity.class);
    }

    @Before
    public void isMethod() throws Exception {
        super.isMethod();
        isNameExpr.isFieldAccessExpr = true;
        isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isMethod().isMethod());
        isNameExpr.isMethod();
        isNameExpr = isMethod();
        isNameExpr.isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        // isComment
        isMethod(isNameExpr.isMethod().isMethod(), isIntegerConstant);
        // isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isNameExpr));
        // isComment
        isNameExpr.isMethod();
        // isComment
        isMethod(isIntegerConstant, isIntegerConstant);
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        // isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isMethod("isStringConstant")));
        // isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        // isComment
        Routine isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod().isMethod());
        isMethod("isStringConstant", isNameExpr);
        isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod());
        isMethod("isStringConstant", new LocalTime(isIntegerConstant, isIntegerConstant), isNameExpr.isMethod());
    }

    private void isMethod(final int isParameter, final int isParameter) {
        isNameExpr.isMethod(new Runnable() {

            @Override
            public void isMethod() {
                RoutineCreateOrEditFragment isVariable = isNameExpr.isFieldAccessExpr;
                isNameExpr.isMethod(isIntegerConstant, isNameExpr, isNameExpr);
            }
        });
    }
}
