// isComment
package ch.hgdev.toposuite.test.calculation;

import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.SmallTest;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import ch.hgdev.toposuite.calculation.AxisImplantation;
import ch.hgdev.toposuite.calculation.CalculationException;
import ch.hgdev.toposuite.calculation.Measure;
import ch.hgdev.toposuite.points.Point;
import ch.hgdev.toposuite.test.testutils.CalculationTestRunner;
import ch.hgdev.toposuite.utils.MathUtils;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class isClassOrIsInterface extends CalculationTestRunner {

    @Before
    public void isMethod() {
        super.isMethod();
    }

    @Test
    public void isMethod() {
        Point isVariable = new Point("isStringConstant", isDoubleConstant, isDoubleConstant, isNameExpr.isFieldAccessExpr, true, true);
        Point isVariable = new Point("isStringConstant", isDoubleConstant, isDoubleConstant, isNameExpr.isFieldAccessExpr, true, true);
        Point isVariable = new Point("isStringConstant", isDoubleConstant, isDoubleConstant, isNameExpr.isFieldAccessExpr, true, true);
        double isVariable = isDoubleConstant;
        AxisImplantation isVariable = new AxisImplantation(true);
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod().isMethod(new Measure(null, isDoubleConstant, isDoubleConstant, isDoubleConstant, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, "isStringConstant"));
        try {
            isNameExpr.isMethod();
        } catch (CalculationException isParameter) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        AxisImplantation.Result isVariable = isNameExpr.isMethod().isMethod(isIntegerConstant);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", this.isFieldAccessExpr.isMethod(isNameExpr.isMethod()));
        isNameExpr.isMethod("isStringConstant", this.isFieldAccessExpr.isMethod(isNameExpr.isMethod()));
        isNameExpr.isMethod("isStringConstant", this.isFieldAccessExpr.isMethod(isNameExpr.isMethod()));
        isNameExpr.isMethod("isStringConstant", this.isFieldAccessExpr.isMethod(isNameExpr.isMethod()));
    }
}
