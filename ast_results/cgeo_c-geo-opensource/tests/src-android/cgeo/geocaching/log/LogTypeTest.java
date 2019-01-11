// isComment
package cgeo.geocaching.log;

import static org.assertj.core.api.Java6Assertions.assertThat;
import junit.framework.TestCase;

public class isClassOrIsInterface extends TestCase {

    public static void isMethod() {
        isMethod(isNameExpr.isMethod(isIntegerConstant)).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod(isIntegerConstant)).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod(isIntegerConstant)).isMethod(isNameExpr.isFieldAccessExpr);
    }

    public static void isMethod() {
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod(null)).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr.isFieldAccessExpr);
    }

    public static void isMethod() {
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr.isFieldAccessExpr);
    }
}
