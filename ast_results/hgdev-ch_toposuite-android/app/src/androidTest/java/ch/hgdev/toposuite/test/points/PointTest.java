// isComment
package ch.hgdev.toposuite.test.points;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.InstrumentationTestRunner;
import android.test.suitebuilder.annotation.SmallTest;
import junit.framework.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import ch.hgdev.toposuite.points.Point;

/**
 * isComment
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class isClassOrIsInterface extends InstrumentationTestRunner {

    private Context isVariable;

    @Before
    public void isMethod() {
        this.isFieldAccessExpr = isNameExpr.isMethod();
    }

    @Test
    public void isMethod() {
        // isComment
        /*isComment*/
        isNameExpr.isMethod(new Point("isStringConstant", isDoubleConstant, isDoubleConstant, isDoubleConstant, true, true) != null);
    }

    @Test
    public void isMethod() {
        Point isVariable = new Point("isStringConstant", isDoubleConstant, -isDoubleConstant, isDoubleConstant, true, true);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr.isMethod(isDoubleConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(-isDoubleConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isDoubleConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(this.isFieldAccessExpr));
        isNameExpr = new Point("isStringConstant", isDoubleConstant, -isDoubleConstant, isDoubleConstant, true);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(this.isFieldAccessExpr));
    }

    @Test
    public void isMethod() {
        Point isVariable = new Point("isStringConstant", -isDoubleConstant, isDoubleConstant, isDoubleConstant, true, true);
        isNameExpr.isMethod(isDoubleConstant);
        isNameExpr.isMethod(isDoubleConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(isDoubleConstant);
        isNameExpr.isMethod(isDoubleConstant, isNameExpr.isMethod());
        isNameExpr.isMethod(-isDoubleConstant);
        isNameExpr.isMethod(-isDoubleConstant, isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        Point isVariable = new Point("isStringConstant", isDoubleConstant, isDoubleConstant, isDoubleConstant, true, true);
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        isNameExpr = new Point("isStringConstant", isDoubleConstant, isDoubleConstant, isDoubleConstant, true, true);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
    }
}
