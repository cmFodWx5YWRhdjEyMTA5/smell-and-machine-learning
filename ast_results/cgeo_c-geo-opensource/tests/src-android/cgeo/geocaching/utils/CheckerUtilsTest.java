// isComment
package cgeo.geocaching.utils;

import junit.framework.TestCase;
import cgeo.geocaching.models.Geocache;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class isClassOrIsInterface extends TestCase {

    public static void isMethod() throws Exception {
        isMethod("isStringConstant", "isStringConstant");
        isMethod("isStringConstant", null);
        isMethod("isStringConstant", "isStringConstant");
        isMethod("isStringConstant", "isStringConstant");
        isMethod("isStringConstant", "isStringConstant");
        isMethod("isStringConstant", "isStringConstant");
        isMethod("isStringConstant", "isStringConstant");
    }

    public static void isMethod() {
        isMethod("isStringConstant", null);
    }

    private static void isMethod(final String isParameter, final String isParameter) {
        final Geocache isVariable = new Geocache();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
    }
}
