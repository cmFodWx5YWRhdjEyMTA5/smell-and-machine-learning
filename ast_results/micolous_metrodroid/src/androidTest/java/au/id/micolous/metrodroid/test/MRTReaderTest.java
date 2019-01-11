// isComment
package au.id.micolous.metrodroid.test;

import org.junit.Test;
import au.id.micolous.metrodroid.transit.Station;
import au.id.micolous.metrodroid.transit.ezlink.EZLinkTransitData;
import static junit.framework.TestCase.assertEquals;

public class isClassOrIsInterface extends BaseInstrumentedTest {

    @Test
    public void isMethod() {
        isMethod("isStringConstant");
        isMethod(true);
        isMethod(true);
        Station isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod(isDoubleConstant, isNameExpr.isMethod(isNameExpr.isMethod()), isDoubleConstant);
        isMethod(isDoubleConstant, isNameExpr.isMethod(isNameExpr.isMethod()), isDoubleConstant);
    }
}
