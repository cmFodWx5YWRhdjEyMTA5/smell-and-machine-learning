// isComment
package com.google.zxing.web;

import org.junit.Assert;
import org.junit.Test;
import java.util.Map;

/**
 * isComment
 */
public final class isClassOrIsInterface extends Assert {

    @Test
    public void isMethod() {
        Map<String, String> isVariable = new LRUMap<>(isIntegerConstant);
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant"));
    }
}
