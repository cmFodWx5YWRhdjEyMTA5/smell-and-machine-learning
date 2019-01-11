// isComment
package es.usc.citius.servando.calendula.activities;

import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.action.ViewActions;
import android.test.ActivityInstrumentationTestCase2;
import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;
import org.junit.Before;
import org.junit.Test;
import es.usc.citius.servando.calendula.CalendulaApp;
import es.usc.citius.servando.calendula.R;
import es.usc.citius.servando.calendula.database.DB;
import es.usc.citius.servando.calendula.persistence.Medicine;
import es.usc.citius.servando.calendula.persistence.Presentation;
import es.usc.citius.servando.calendula.util.PreferenceKeys;
import es.usc.citius.servando.calendula.util.PreferenceUtils;
import es.usc.citius.servando.calendula.util.TestUtils;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withTagValue;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class isClassOrIsInterface extends ActivityInstrumentationTestCase2<MedicinesActivity> {

    public static final String isVariable = "isStringConstant";

    private MedicinesActivity isVariable;

    public isConstructor() {
        super(MedicinesActivity.class);
    }

    @Before
    public void isMethod() throws Exception {
        super.isMethod();
        isNameExpr.isFieldAccessExpr = true;
        isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isMethod().isMethod());
        isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isMethod()).isMethod();
        isNameExpr = isMethod();
        isNameExpr.isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod().isMethod(), isIntegerConstant);
        // isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        // isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod(isNameExpr), isNameExpr.isMethod());
        // isComment
        isNameExpr.isMethod();
        // isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        // isComment
        isMethod(isMethod(new PresentationTagMatcher(isNameExpr.isFieldAccessExpr))).isMethod(isMethod());
        // isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        Medicine isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
    }
}
