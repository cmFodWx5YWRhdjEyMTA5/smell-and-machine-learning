// isComment
package org.hwyl.sexytopo.control.util;

import junit.framework.Assert;
import org.hwyl.sexytopo.testhelpers.BasicTestSurveyCreator;
import org.hwyl.sexytopo.model.survey.Station;
import org.hwyl.sexytopo.model.survey.Survey;
import org.junit.Test;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        Survey isVariable = isNameExpr.isMethod();
        Station isVariable = isNameExpr.isMethod("isStringConstant");
        double isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isDoubleConstant, isNameExpr);
    }

    @Test
    public void isMethod() {
        Survey isVariable = isNameExpr.isMethod();
        Station isVariable = isNameExpr.isMethod("isStringConstant");
        double isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isDoubleConstant, isNameExpr);
    }
}
