// isComment
package ch.hgdev.toposuite.test.calculation;

import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.SmallTest;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import ch.hgdev.toposuite.calculation.CalculationException;
import ch.hgdev.toposuite.calculation.LimitDisplacement;
import ch.hgdev.toposuite.points.Point;
import ch.hgdev.toposuite.test.testutils.CalculationTestRunner;

@RunWith(AndroidJUnit4.class)
@SmallTest
public class isClassOrIsInterface extends CalculationTestRunner {

    @Before
    public void isMethod() {
        super.isMethod();
    }

    @Test
    public void isMethod() {
        Point isVariable = new Point("isStringConstant", isDoubleConstant, isDoubleConstant, isDoubleConstant, true, true);
        Point isVariable = new Point("isStringConstant", isDoubleConstant, isDoubleConstant, isDoubleConstant, true, true);
        Point isVariable = new Point("isStringConstant", isDoubleConstant, isDoubleConstant, isDoubleConstant, true, true);
        Point isVariable = new Point("isStringConstant", isDoubleConstant, isDoubleConstant, isDoubleConstant, true, true);
        double isVariable = isDoubleConstant;
        LimitDisplacement isVariable = new LimitDisplacement(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, "isStringConstant", "isStringConstant", true);
        try {
            isNameExpr.isMethod();
        } catch (CalculationException isParameter) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        isNameExpr.isMethod("isStringConstant", this.isFieldAccessExpr.isMethod(isNameExpr.isMethod().isMethod()));
        isNameExpr.isMethod("isStringConstant", this.isFieldAccessExpr.isMethod(isNameExpr.isMethod().isMethod()));
        isNameExpr.isMethod("isStringConstant", this.isFieldAccessExpr.isMethod(isNameExpr.isMethod().isMethod()));
        isNameExpr.isMethod("isStringConstant", this.isFieldAccessExpr.isMethod(isNameExpr.isMethod().isMethod()));
        isNameExpr.isMethod("isStringConstant", this.isFieldAccessExpr.isMethod(isNameExpr.isMethod()));
        isNameExpr.isMethod("isStringConstant", this.isFieldAccessExpr.isMethod(isNameExpr.isMethod()));
        isNameExpr.isMethod("isStringConstant", this.isFieldAccessExpr.isMethod(isNameExpr.isMethod()));
    }
}
