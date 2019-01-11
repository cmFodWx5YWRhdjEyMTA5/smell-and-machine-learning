// isComment
package com.vrem.wifianalyzer.wifi.graphutils;

import com.jjoe64.graphview.LegendRenderer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class isClassOrIsInterface {

    @Mock
    private LegendRenderer isVariable;

    @Test
    public void isMethod() {
        isMethod(isIntegerConstant, isNameExpr.isMethod().isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isFieldAccessExpr.isMethod() instanceof GraphLegend.DisplayNone);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod() instanceof GraphLegend.DisplayLeft);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod() instanceof GraphLegend.DisplayRight);
    }

    @Test
    public void isMethod() {
        // isComment
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        // isComment
        isMethod(isNameExpr).isMethod(true);
    }

    @Test
    public void isMethod() {
        // isComment
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        // isComment
        isMethod(isNameExpr).isMethod(true);
        isMethod(isNameExpr).isMethod(isIntegerConstant, isIntegerConstant);
    }

    @Test
    public void isMethod() {
        // isComment
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        // isComment
        isMethod(isNameExpr).isMethod(true);
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }
}
