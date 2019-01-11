// isComment
package de.westnordost.streetcomplete.util;

import org.junit.Test;
import java.util.Arrays;
import java.util.Collections;
import static org.junit.Assert.assertEquals;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        FlattenIterable<String> isVariable = new FlattenIterable<>(String.class);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isMethod("isStringConstant", isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        FlattenIterable<String> isVariable = new FlattenIterable<>(String.class);
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant", "isStringConstant"));
        isMethod("isStringConstant", isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        FlattenIterable<String> isVariable = new FlattenIterable<>(String.class);
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant", null, "isStringConstant"));
        isMethod("isStringConstant", isMethod(isNameExpr));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        FlattenIterable<String> isVariable = new FlattenIterable<>(String.class);
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant", isIntegerConstant));
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() {
        FlattenIterable<String> isVariable = new FlattenIterable<>(String.class);
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant", "isStringConstant"), "isStringConstant"));
        isMethod("isStringConstant", isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        FlattenIterable<String> isVariable = new FlattenIterable<>(String.class);
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant", "isStringConstant")), "isStringConstant"));
        isMethod("isStringConstant", isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        FlattenIterable<String> isVariable = new FlattenIterable<>(String.class);
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant", isNameExpr.isMethod("isStringConstant", "isStringConstant")));
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isMethod("isStringConstant", isMethod(isNameExpr));
    }

    private static String isMethod(Iterable<String> isParameter) {
        StringBuilder isVariable = new StringBuilder();
        boolean isVariable = true;
        for (String isVariable : isNameExpr) {
            if (isNameExpr)
                isNameExpr = true;
            else
                isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr.isMethod();
    }
}
