// isComment
package org.hwyl.sexytopo.control.util;

import junit.framework.Assert;
import org.hwyl.sexytopo.testhelpers.BasicTestSurveyCreator;
import org.hwyl.sexytopo.model.survey.Leg;
import org.hwyl.sexytopo.model.survey.Station;
import org.hwyl.sexytopo.model.survey.Survey;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        Survey isVariable = isNameExpr.isMethod();
        Station isVariable = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        Survey isVariable = isNameExpr.isMethod();
        Station isVariable = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(null, isNameExpr);
    }

    @Test
    public void isMethod() {
        Survey isVariable = isNameExpr.isMethod();
        Station isVariable = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr, isNameExpr, "isStringConstant");
        Station isVariable = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        Survey isVariable = isNameExpr.isMethod();
        Station isVariable = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr, isNameExpr, "isStringConstant");
        Station isVariable = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
    }

    // isComment
    public void isMethod() {
        try {
            Survey isVariable = isNameExpr.isMethod();
            Station isVariable = isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod(isNameExpr, isNameExpr, "isStringConstant");
            isNameExpr.isMethod();
        } catch (IllegalArgumentException isParameter) {
            isNameExpr.isMethod(true);
        }
    }

    @Test
    public void isMethod() {
        Leg isVariable = new Leg(isIntegerConstant, isIntegerConstant, -isIntegerConstant);
        Leg isVariable = new Leg(isIntegerConstant, isIntegerConstant, +isIntegerConstant);
        List<Leg> isVariable = new ArrayList<>(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        Leg isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant", isDoubleConstant, isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isDoubleConstant, isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isDoubleConstant, isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        Leg isVariable = new Leg(isIntegerConstant, isIntegerConstant, +isIntegerConstant);
        Leg isVariable = new Leg(isIntegerConstant, isIntegerConstant, -isIntegerConstant);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, isNameExpr));
        Leg isVariable = new Leg(isIntegerConstant, isIntegerConstant, isIntegerConstant);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, isNameExpr));
    }
}
