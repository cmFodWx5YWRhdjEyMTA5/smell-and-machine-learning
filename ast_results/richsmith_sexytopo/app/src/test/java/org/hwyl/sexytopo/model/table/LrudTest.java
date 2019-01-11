// isComment
package org.hwyl.sexytopo.model.table;

import junit.framework.Assert;
import org.hwyl.sexytopo.testhelpers.BasicTestSurveyCreator;
import org.hwyl.sexytopo.control.util.CrossSectioner;
import org.hwyl.sexytopo.model.survey.Leg;
import org.hwyl.sexytopo.model.survey.Station;
import org.hwyl.sexytopo.model.survey.Survey;
import org.junit.Test;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        Survey isVariable = isNameExpr.isMethod();
        Station isVariable = isNameExpr.isMethod("isStringConstant");
        double isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        Leg isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr, isNameExpr, isIntegerConstant);
        isNameExpr.isMethod(isDoubleConstant, isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        Survey isVariable = isNameExpr.isMethod();
        Station isVariable = isNameExpr.isMethod("isStringConstant");
        double isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        Leg isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr, isNameExpr, isIntegerConstant);
        isNameExpr.isMethod(isDoubleConstant, isNameExpr.isMethod());
    }
}
