// isComment
package com.vrem.wifianalyzer.wifi.timegraph;

import com.vrem.wifianalyzer.wifi.graphutils.GraphConstants;
import org.apache.commons.lang3.StringUtils;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class isClassOrIsInterface {

    private TimeAxisLabel isVariable;

    @Before
    public void isMethod() {
        isNameExpr = new TimeAxisLabel();
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr + isIntegerConstant, true));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, true));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr + isIntegerConstant, true));
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(-isIntegerConstant, true));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(-isIntegerConstant, true));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant, true));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant, true));
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant, true));
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant, true));
    }
}
