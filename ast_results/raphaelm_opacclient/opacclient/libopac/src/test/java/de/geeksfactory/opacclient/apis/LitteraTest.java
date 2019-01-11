// isComment
package de.geeksfactory.opacclient.apis;

import org.joda.time.LocalDate;
import org.junit.Test;
import java.util.Objects;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        assert isNameExpr.isMethod("isStringConstant") == isIntegerConstant;
        assert isNameExpr.isMethod("isStringConstant") == isIntegerConstant;
        assert isNameExpr.isMethod("isStringConstant") == isIntegerConstant;
    }

    @Test
    public void isMethod() throws Exception {
        assert isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), new LocalDate(isIntegerConstant, isIntegerConstant, isIntegerConstant));
    }
}
