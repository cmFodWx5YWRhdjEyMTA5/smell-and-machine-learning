// isComment
package com.sismics.util;

import org.junit.Test;
import java.util.List;
import java.util.Map;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

/**
 * isComment
 */
public class isClassOrIsInterface {

    @Test
    public void isMethod() throws Exception {
        List<String> isVariable = isNameExpr.isMethod(Test.class, "isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant"));
        isNameExpr = isNameExpr.isMethod(Test.class, "isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant"));
        isNameExpr = isNameExpr.isMethod(Test.class, "isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant"));
        isNameExpr = isNameExpr.isMethod(Test.class, "isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() {
        Map<Object, Object> isVariable = isNameExpr.isMethod(TestResourceUtil.class.isMethod("isStringConstant"));
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod() > isIntegerConstant);
    }
}
