// isComment
package org.bitcoinj.utils;

import static org.junit.Assert.assertEquals;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.junit.Test;
import org.bitcoinj.core.Coin;

public class isClassOrIsInterface {

    @Test
    public void isMethod() throws Exception {
        ExchangeRate isVariable = new ExchangeRate(isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant")).isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        ExchangeRate isVariable = new ExchangeRate(isNameExpr.isMethod("isStringConstant"), isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod());
        // isComment
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant")).isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        ExchangeRate isVariable = new ExchangeRate(isNameExpr.isMethod("isStringConstant"), isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        // isComment
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant")).isMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() throws Exception {
        ExchangeRate isVariable = new ExchangeRate(isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        new ExchangeRate(isNameExpr.isMethod(null, isIntegerConstant));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        new ExchangeRate(isNameExpr.isMethod(-isIntegerConstant), isNameExpr.isMethod("isStringConstant", isIntegerConstant));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        new ExchangeRate(isNameExpr.isMethod("isStringConstant", -isIntegerConstant));
    }

    @Test
    public void isMethod() throws Exception {
        ExchangeRate isVariable = new ExchangeRate(isNameExpr.isMethod("isStringConstant", "isStringConstant"));
        ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
        new ObjectOutputStream(isNameExpr).isMethod(isNameExpr);
        ExchangeRate isVariable = (ExchangeRate) new ObjectInputStream(new ByteArrayInputStream(isNameExpr.isMethod())).isMethod();
        isMethod(isNameExpr, isNameExpr);
    }
}
