// isComment
package org.bitcoinj.core;

import junit.framework.TestCase;
import org.junit.Test;

public class isClassOrIsInterface extends TestCase {

    @Test
    public void isMethod() throws Exception {
        // isComment
        VarInt isVariable = new VarInt(isIntegerConstant);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod().isFieldAccessExpr);
        isMethod(isIntegerConstant, new VarInt(isNameExpr.isMethod(), isIntegerConstant).isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        VarInt isVariable = new VarInt(isIntegerConstant);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod().isFieldAccessExpr);
        isMethod(isIntegerConstant, new VarInt(isNameExpr.isMethod(), isIntegerConstant).isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws Exception {
        VarInt isVariable = new VarInt(isStringConstant);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod().isFieldAccessExpr);
        isMethod(isStringConstant, new VarInt(isNameExpr.isMethod(), isIntegerConstant).isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws Exception {
        VarInt isVariable = new VarInt(isStringConstant);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod().isFieldAccessExpr);
        byte[] isVariable = isNameExpr.isMethod();
        isMethod(isStringConstant, isStringConstant & new VarInt(isNameExpr, isIntegerConstant).isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws Exception {
        VarInt isVariable = new VarInt(isStringConstant);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod().isFieldAccessExpr);
        byte[] isVariable = isNameExpr.isMethod();
        isMethod(isStringConstant, isStringConstant & new VarInt(isNameExpr, isIntegerConstant).isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws Exception {
        VarInt isVariable = new VarInt(isStringConstant);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod(isIntegerConstant, isNameExpr.isMethod().isFieldAccessExpr);
        byte[] isVariable = isNameExpr.isMethod();
        isMethod(isStringConstant, new VarInt(isNameExpr, isIntegerConstant).isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        isMethod(isNameExpr.isMethod(-isIntegerConstant), new VarInt(-isIntegerConstant).isMethod().isFieldAccessExpr);
    }
}
