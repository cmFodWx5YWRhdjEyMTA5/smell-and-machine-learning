// isComment
package com.ubergeek42.cats;

import java.math.BigInteger;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public final class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod("isStringConstant", isNameExpr.isMethod(null));
    }

    @Test
    public void isMethod() {
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() {
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() {
        isMethod("isStringConstant", isNameExpr.isMethod(new BigInteger("isStringConstant")));
    }

    @Test
    public void isMethod() {
        byte isVariable = (byte) isIntegerConstant;
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
        Byte isVariable = isNameExpr;
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        byte[] isVariable = { (byte) isIntegerConstant, (byte) isIntegerConstant, (byte) isIntegerConstant, (byte) isIntegerConstant, (byte) isIntegerConstant };
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
        Byte[] isVariable = { (byte) isIntegerConstant, (byte) isIntegerConstant, null, (byte) isIntegerConstant, (byte) isIntegerConstant };
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        short[] isVariable = { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant };
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
        Short[] isVariable = { isIntegerConstant, isIntegerConstant, null, isIntegerConstant, isIntegerConstant };
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        char[] isVariable = { 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant', 'isStringConstant' };
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
        Character[] isVariable = { 'isStringConstant', 'isStringConstant', null, 'isStringConstant', 'isStringConstant' };
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        int[] isVariable = { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant };
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
        Integer[] isVariable = { isIntegerConstant, isIntegerConstant, null, isIntegerConstant, isIntegerConstant };
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        long[] isVariable = { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant };
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
        Long[] isVariable = { isStringConstant, isStringConstant, null, isStringConstant, isStringConstant };
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        float[] isVariable = { isDoubleConstant, isDoubleConstant, isDoubleConstant, isDoubleConstant, isDoubleConstant };
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
        Float[] isVariable = { isDoubleConstant, isDoubleConstant, null, isDoubleConstant, isDoubleConstant };
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        double[] isVariable = { isDoubleConstant, isDoubleConstant, isDoubleConstant, isDoubleConstant, isDoubleConstant };
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
        Double[] isVariable = { isDoubleConstant, isDoubleConstant, null, isDoubleConstant, isDoubleConstant };
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        boolean[] isVariable = { true, true, true, true, true };
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
        Boolean[] isVariable = { true, true, null, true, true };
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        Object[] isVariable = { isIntegerConstant, true, "isStringConstant", isDoubleConstant, null, new BigInteger("isStringConstant") };
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        Object[] isVariable = { isIntegerConstant, true, "isStringConstant", new Object[] { isDoubleConstant, "isStringConstant" } };
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        Object[] isVariable = { isIntegerConstant, isIntegerConstant, isIntegerConstant, null };
        isNameExpr[isIntegerConstant] = isNameExpr;
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
    }
}
