// isComment
package org.hwyl.sexytopo.control.util;

import junit.framework.Assert;
import org.hwyl.sexytopo.model.graph.Coord2D;
import org.hwyl.sexytopo.model.graph.Line;
import org.hwyl.sexytopo.model.graph.Projection2D;
import org.hwyl.sexytopo.model.graph.Space;
import org.hwyl.sexytopo.model.survey.Leg;
import org.hwyl.sexytopo.model.survey.Station;
import org.hwyl.sexytopo.model.survey.Survey;
import org.hwyl.sexytopo.testhelpers.BasicTestSurveyCreator;
import org.junit.Test;
import java.util.Map;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        Survey isVariable = isNameExpr.isMethod();
        Space<Coord2D> isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        Map<Station, Coord2D> isVariable = isNameExpr.isMethod();
        Station isVariable = isNameExpr.isMethod("isStringConstant");
        Coord2D isVariable = isNameExpr.isMethod(isNameExpr);
        Coord2D isVariable = new Coord2D(isIntegerConstant, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() {
        Survey isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod("isStringConstant").isMethod();
        Space<Coord2D> isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        Map<Station, Coord2D> isVariable = isNameExpr.isMethod();
        Station isVariable = isNameExpr.isMethod("isStringConstant");
        Coord2D isVariable = isNameExpr.isMethod(isNameExpr);
        Coord2D isVariable = new Coord2D(-isIntegerConstant, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() {
        Survey isVariable = isNameExpr.isMethod();
        Space<Coord2D> isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        Map<Station, Coord2D> isVariable = isNameExpr.isMethod();
        Station isVariable = isNameExpr.isMethod("isStringConstant");
        Coord2D isVariable = isNameExpr.isMethod(isNameExpr);
        Coord2D isVariable = new Coord2D(isIntegerConstant, -isIntegerConstant);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() {
        Survey isVariable = isNameExpr.isMethod();
        Space<Coord2D> isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        Map<Station, Coord2D> isVariable = isNameExpr.isMethod();
        Map<Leg, Line<Coord2D>> isVariable = isNameExpr.isMethod();
        Station isVariable = isNameExpr.isMethod("isStringConstant");
        Coord2D isVariable = isNameExpr.isMethod(isNameExpr);
        Coord2D isVariable = new Coord2D(isIntegerConstant, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        Leg isVariable = isNameExpr.isMethod().isMethod(isIntegerConstant);
        Line isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr = new Coord2D(isIntegerConstant, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        Leg isVariable = isNameExpr.isMethod().isMethod(isIntegerConstant);
        Line isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr = new Coord2D(isIntegerConstant, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
    }
}
