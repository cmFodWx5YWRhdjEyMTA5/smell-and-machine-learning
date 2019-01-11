// isComment
package com.anysoftkeyboard.base.utils;

import com.anysoftkeyboard.AnySoftKeyboardPlainTestRunner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AnySoftKeyboardPlainTestRunner.class)
public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        final OptionalCompat<Object> isVariable = isNameExpr.isMethod(null);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(new Object()), isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(null), isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(null).isMethod(), isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        final OptionalCompat<Integer> isVariable = isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant), isNameExpr.isMethod(isIntegerConstant));
        isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant), isNameExpr.isMethod(isIntegerConstant));
        isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant), isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(new Object()), isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(null), isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant), isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant).isMethod(), isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant).isMethod(), isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant").isMethod(), isNameExpr.isMethod());
    }
}
