// isComment
package cgeo.geocaching.connector.gc;

import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod(new UTFGridPosition(isIntegerConstant, isIntegerConstant)).isMethod();
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        isMethod(new UTFGridPosition(-isIntegerConstant, isIntegerConstant)).isMethod();
    }

    @Test
    public void isMethod() throws Exception {
        isMethod("isStringConstant", isIntegerConstant, isIntegerConstant);
        isMethod("isStringConstant", isIntegerConstant, isIntegerConstant);
        isMethod("isStringConstant", isIntegerConstant, isIntegerConstant);
        isMethod("isStringConstant", isIntegerConstant, isIntegerConstant);
    }

    private static void isMethod(final String isParameter, final int isParameter, final int isParameter) {
        final UTFGridPosition isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
    }
}
