// isComment
package org.bitcoinj.utils;

import static org.bitcoinj.utils.Fiat.parseFiat;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod(isNameExpr.isMethod("isStringConstant", isIntegerConstant), isMethod("isStringConstant", "isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant", isIntegerConstant), isMethod("isStringConstant", "isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant", isIntegerConstant), isMethod("isStringConstant", "isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant", -isIntegerConstant), isMethod("isStringConstant", "isStringConstant"));
    }

    @Test
    public void isMethod() {
        isMethod(isIntegerConstant, isNameExpr.isMethod("isStringConstant", "isStringConstant").isFieldAccessExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod("isStringConstant", "isStringConstant").isFieldAccessExpr);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
    }

    @Test
    public void isMethod() {
        isMethod(isIntegerConstant, isNameExpr.isMethod("isStringConstant", "isStringConstant").isFieldAccessExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod("isStringConstant", "isStringConstant").isFieldAccessExpr);
    }

    @Test
    public void isMethod() {
        isMethod("isStringConstant", isMethod("isStringConstant", "isStringConstant").isMethod());
        isMethod("isStringConstant", isMethod("isStringConstant", "isStringConstant").isMethod());
        isMethod("isStringConstant", isMethod("isStringConstant", "isStringConstant").isMethod());
        isMethod("isStringConstant", isMethod("isStringConstant", "isStringConstant").isMethod());
    }

    @Test
    public void isMethod() {
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant", isIntegerConstant).isMethod());
        isMethod("isStringConstant", isMethod("isStringConstant", "isStringConstant").isMethod());
        isMethod("isStringConstant", isMethod("isStringConstant", "isStringConstant").isMethod());
        isMethod("isStringConstant", isMethod("isStringConstant", "isStringConstant").isMethod());
        isMethod("isStringConstant", isMethod("isStringConstant", "isStringConstant").isMethod());
        isMethod("isStringConstant", isMethod("isStringConstant", "isStringConstant").isMethod());
        isMethod("isStringConstant", isMethod("isStringConstant", "isStringConstant").isMethod());
        // isComment
        isMethod("isStringConstant", isMethod("isStringConstant", "isStringConstant").isMethod());
        isMethod("isStringConstant", isMethod("isStringConstant", "isStringConstant").isMethod());
        isMethod("isStringConstant", isMethod("isStringConstant", "isStringConstant").isMethod());
        isMethod("isStringConstant", isMethod("isStringConstant", "isStringConstant").isMethod());
    }
}
