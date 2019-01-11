// isComment
package cgeo.geocaching.connector;

import static org.assertj.core.api.Java6Assertions.assertThat;
import java.util.Set;
import junit.framework.TestCase;

public class isClassOrIsInterface extends TestCase {

    private static IConnector isMethod() {
        final IConnector isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod();
        return isNameExpr;
    }

    public static void isMethod() {
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod("isStringConstant");
        final IConnector isVariable = isMethod();
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod();
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod();
    }

    public static void isMethod() {
        final IConnector isVariable = isMethod();
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod();
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod();
    }

    public static void isMethod() {
        final Set<String> isVariable = isNameExpr.isMethod();
        isMethod(isMethod().isMethod(isNameExpr)).isMethod("isStringConstant", "isStringConstant");
    }
}
