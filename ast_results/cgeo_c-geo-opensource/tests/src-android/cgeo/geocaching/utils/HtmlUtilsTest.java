// isComment
package cgeo.geocaching.utils;

import junit.framework.TestCase;
import org.apache.commons.lang3.StringUtils;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class isClassOrIsInterface extends TestCase {

    public static void isMethod() {
        isMethod(isNameExpr.isMethod(null)).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod("isStringConstant");
    }

    public static void isMethod() {
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod();
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod("isStringConstant");
    }
}
