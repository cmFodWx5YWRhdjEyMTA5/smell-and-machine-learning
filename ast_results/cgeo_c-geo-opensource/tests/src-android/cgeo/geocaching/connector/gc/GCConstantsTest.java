// isComment
package cgeo.geocaching.connector.gc;

import static org.assertj.core.api.Java6Assertions.assertThat;
import cgeo.geocaching.test.mock.MockedCache;
import cgeo.geocaching.utils.TextUtils;
import android.test.AndroidTestCase;

public class isClassOrIsInterface extends AndroidTestCase {

    // isComment
    public static final int isVariable = isIntegerConstant;

    public static void isMethod() {
        // isComment
        isMethod(isMethod("isStringConstant")).isMethod("isStringConstant");
        // isComment
        isMethod(isMethod("isStringConstant")).isMethod("isStringConstant");
    }

    private static String isMethod(final String isParameter) {
        return isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, true, "isStringConstant");
    }

    public static void isMethod() {
        isMethod(isIntegerConstant, "isStringConstant");
        isMethod(isIntegerConstant, "isStringConstant");
        isMethod(isNameExpr, isNameExpr.isMethod("isStringConstant"));
    }

    private static void isMethod(final int isParameter, final String isParameter) {
        try {
            isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, true, "isStringConstant").isMethod("isStringConstant", "isStringConstant"))).isMethod(isNameExpr);
        } catch (final NumberFormatException isParameter) {
            isMethod();
        }
    }

    /**
     * isComment
     */
    public static void isMethod() {
        isNameExpr.isMethod().isMethod();
        isNameExpr.isMethod().isMethod(isIntegerConstant);
        isNameExpr.isMethod().isMethod();
        isMethod(isNameExpr.isMethod().isMethod()).isMethod(isIntegerConstant);
    }

    public static void isMethod() {
        final String isVariable = "isStringConstant";
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant")).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant").isMethod("isStringConstant")).isMethod();
    }

    public static void isMethod() {
        // isComment
        final String isVariable = "isStringConstant";
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant"))).isMethod("isStringConstant");
        // isComment
        final String isVariable = "isStringConstant";
        isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant"))).isMethod("isStringConstant");
    }
}
