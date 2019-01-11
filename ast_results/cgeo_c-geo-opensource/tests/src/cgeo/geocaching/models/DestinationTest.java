// isComment
package cgeo.geocaching.models;

import org.junit.Before;
import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;
import cgeo.geocaching.location.Geopoint;

public class isClassOrIsInterface {

    private Destination isVariable = null;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = new Destination(isIntegerConstant, isIntegerConstant, new Geopoint(isDoubleConstant, isDoubleConstant));
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod().isMethod()).isMethod(isDoubleConstant);
        isMethod(isNameExpr.isMethod().isMethod()).isMethod(isDoubleConstant);
    }
}
