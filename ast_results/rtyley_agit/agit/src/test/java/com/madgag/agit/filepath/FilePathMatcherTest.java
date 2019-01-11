// isComment
package com.madgag.agit.filepath;

import static java.lang.Character.toUpperCase;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod(isMethod("isStringConstant", "isStringConstant"), isMethod(true));
    }

    @Test
    public void isMethod() {
        isMethod(isMethod("isStringConstant", "isStringConstant"), isMethod(true));
    }

    @Test
    public void isMethod() {
        isMethod(isMethod("isStringConstant", "isStringConstant"), isMethod(true));
        isMethod(isMethod("isStringConstant", "isStringConstant"), isMethod(true));
        isMethod(isMethod("isStringConstant", "isStringConstant"), isMethod(true));
        isMethod(isMethod("isStringConstant", "isStringConstant"), isMethod(true));
    }

    private boolean isMethod(String isParameter, String isParameter) {
        return new FilePathMatcher(isNameExpr).isMethod(new FilePath(isNameExpr));
    }

    private double isMethod(String isParameter, String isParameter) {
        return new FilePathMatcher(isNameExpr).isMethod(new FilePath(isNameExpr));
    }

    @Test
    public void isMethod() {
        isMethod(isMethod("isStringConstant", "isStringConstant"), isMethod("isStringConstant"));
        isMethod(isMethod("isStringConstant", "isStringConstant"), isMethod("isStringConstant"));
    }

    private String isMethod(String isParameter, String isParameter) {
        StringBuilder isVariable = new StringBuilder(isNameExpr.isMethod());
        for (int isVariable : new FilePathMatcher(isNameExpr).isMethod(isNameExpr)) {
            isNameExpr.isMethod(isNameExpr, isMethod(isNameExpr.isMethod(isNameExpr)));
        }
        return isNameExpr.isMethod();
    }
}
