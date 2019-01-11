// isComment
package org.bitcoinj.core;

import java.math.BigInteger;
import java.util.Date;
import org.junit.Test;
import static org.junit.Assert.*;

public class isClassOrIsInterface {

    @Test
    public void isMethod() {
        isMethod(new byte[] { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, isNameExpr.isMethod(new byte[] { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }));
    }

    @Test
    public void isMethod() {
        isMethod(new byte[] { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, isNameExpr.isMethod(new byte[] { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, -isIntegerConstant));
        isMethod(new byte[] { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, isNameExpr.isMethod(new byte[] { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, isIntegerConstant));
        isMethod(new byte[isIntegerConstant], isNameExpr.isMethod(new byte[] { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, isIntegerConstant));
        isMethod(new byte[isIntegerConstant], isNameExpr.isMethod(new byte[isIntegerConstant], isIntegerConstant));
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant));
        isMethod(isIntegerConstant, isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant));
        isMethod(isIntegerConstant, isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant));
        isMethod(-isIntegerConstant, isNameExpr.isMethod(-isIntegerConstant, -isIntegerConstant, isIntegerConstant, isIntegerConstant, -isIntegerConstant));
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(new BigInteger("isStringConstant", isIntegerConstant), isNameExpr.isMethod(isStringConstant));
        isMethod(new BigInteger("isStringConstant", isIntegerConstant), isNameExpr.isMethod(isIntegerConstant));
        isMethod(isStringConstant, isNameExpr.isMethod(new BigInteger("isStringConstant", isIntegerConstant)));
        isMethod(isStringConstant, isNameExpr.isMethod(new BigInteger("isStringConstant", isIntegerConstant)));
    }

    @Test
    public void isMethod() {
        isMethod("isStringConstant", isNameExpr.isMethod(isStringConstant));
        isMethod("isStringConstant", isNameExpr.isMethod(new Date(isStringConstant)));
    }
}
