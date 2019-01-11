// isComment
package de.geeksfactory.opacclient.apis;

import org.junit.Test;
import java.util.Arrays;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        assert isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), new String[] { "isStringConstant", "isStringConstant" });
        assert isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), new String[] { "isStringConstant", "isStringConstant" });
        assert isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), new String[] { "isStringConstant", null });
        assert isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), new String[] { "isStringConstant", null });
        assert isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), new String[] { "isStringConstant", null });
        // isComment
        assert isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), new String[] { "isStringConstant", "isStringConstant" });
        assert isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), new String[] { "isStringConstant", null });
        // isComment
        assert isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), new String[] { "isStringConstant", null });
        assert isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), new String[] { "isStringConstant", "isStringConstant" });
        // isComment
        assert isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), new String[] { "isStringConstant", "isStringConstant" });
        assert isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), new String[] { "isStringConstant", null });
    }
}
