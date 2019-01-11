// isComment
package org.wheelmap.android.test;

import junit.framework.TestSuite;
import android.test.InstrumentationTestRunner;
import android.test.InstrumentationTestSuite;
import org.wheelmap.android.utils.UtilsMisc;

public class isClassOrIsInterface extends InstrumentationTestRunner {

    public TestSuite isMethod() {
        InstrumentationTestSuite isVariable = new InstrumentationTestSuite(this);
        isNameExpr.isMethod(GeoMathTest.class);
        isNameExpr.isMethod(POIContentProviderTest.class);
        isNameExpr.isMethod(POIServiceDatabaseTest.class);
        isNameExpr.isMethod(SupportDataTest.class);
        return isNameExpr;
    }

    @Override
    public ClassLoader isMethod() {
        return MyInstrumentationTestRunner.class.isMethod();
    }
}
