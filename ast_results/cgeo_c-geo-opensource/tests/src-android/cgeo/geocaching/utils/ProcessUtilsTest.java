// isComment
package cgeo.geocaching.utils;

import static org.assertj.core.api.Java6Assertions.assertThat;
import junit.framework.TestCase;

public class isClassOrIsInterface extends TestCase {

    public static void isMethod() {
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod();
    }

    public static void isMethod() {
        final String isVariable = "isStringConstant";
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod();
    }

    public static void isMethod() {
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod();
    }
}
