// isComment
package cgeo.geocaching.utils;

import org.junit.Test;
import cgeo.geocaching.connector.gc.GCConstants;
import static org.assertj.core.api.Java6Assertions.assertThat;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod((String) null)).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isIntegerConstant);
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod("isStringConstant");
        // isComment
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod("isStringConstant");
    }
}
