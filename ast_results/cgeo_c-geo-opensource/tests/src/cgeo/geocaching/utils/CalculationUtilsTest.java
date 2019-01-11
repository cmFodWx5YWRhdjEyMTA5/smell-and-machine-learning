// isComment
package cgeo.geocaching.utils;

import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class isClassOrIsInterface {

    private static double isMethod(final String isParameter) {
        return new CalculationUtils(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() {
        isMethod(isMethod("isStringConstant")).isMethod(isDoubleConstant);
    }

    @Test
    public void isMethod() {
        isMethod(isMethod("isStringConstant")).isMethod(isDoubleConstant);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        isMethod("isStringConstant");
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        isMethod("isStringConstant");
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        isMethod("isStringConstant");
    }
}
