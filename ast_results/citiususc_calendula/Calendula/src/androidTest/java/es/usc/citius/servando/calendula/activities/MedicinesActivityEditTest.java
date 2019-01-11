// isComment
package es.usc.citius.servando.calendula.activities;

import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.test.ActivityInstrumentationTestCase2;
import org.junit.Before;
import org.junit.Test;
import es.usc.citius.servando.calendula.CalendulaApp;
import es.usc.citius.servando.calendula.R;
import es.usc.citius.servando.calendula.database.DB;
import es.usc.citius.servando.calendula.persistence.Medicine;
import es.usc.citius.servando.calendula.persistence.Presentation;
import es.usc.citius.servando.calendula.util.TestUtils;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withTagValue;

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
        Medicine isVariable = new Medicine(isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod();
        // isComment
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isMethod(isNameExpr);
        isNameExpr = isMethod();
        isNameExpr.isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod().isMethod().isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod(isIntegerConstant);
        // isComment
        isMethod(isMethod(new PresentationTagMatcher(isNameExpr.isFieldAccessExpr))).isMethod(isMethod());
        isNameExpr.isMethod(isIntegerConstant);
        // isComment
        isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isMethod());
        // isComment
        Medicine isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod());
        isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
    }
}
