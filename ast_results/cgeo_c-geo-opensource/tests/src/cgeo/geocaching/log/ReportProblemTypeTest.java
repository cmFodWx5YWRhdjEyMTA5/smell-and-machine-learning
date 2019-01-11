// isComment
package cgeo.geocaching.log;

import static org.assertj.core.api.Java6Assertions.assertThat;
import cgeo.geocaching.enumerations.CacheType;
import org.junit.Test;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr)).isMethod(true);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr)).isMethod(true);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr)).isMethod(true);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr)).isMethod(true);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr)).isMethod(true);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr)).isMethod(true);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr)).isMethod(true);
    }
}
