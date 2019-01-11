// isComment
package org.bitcoinj.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.junit.Test;
import org.bitcoinj.params.MainNetParams;
import org.bitcoinj.params.TestNet3Params;

public class isClassOrIsInterface {

    private static final MainNetParams isVariable = isNameExpr.isMethod();

    private static final TestNet3Params isVariable = isNameExpr.isMethod();

    @Test
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
    }

    @Test(expected = WrongNetworkException.class)
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        DumpedPrivateKey isVariable = new DumpedPrivateKey(isNameExpr, new ECKey().isMethod(), true);
        ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
        new ObjectOutputStream(isNameExpr).isMethod(isNameExpr);
        DumpedPrivateKey isVariable = (DumpedPrivateKey) new ObjectInputStream(new ByteArrayInputStream(isNameExpr.isMethod())).isMethod();
        isMethod(isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        DumpedPrivateKey isVariable = new DumpedPrivateKey(isNameExpr, new ECKey().isMethod(), true);
        // isComment
        DumpedPrivateKey isVariable = (DumpedPrivateKey) isNameExpr.isMethod();
        isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        String isVariable = "isStringConstant";
        isMethod(isNameExpr, isNameExpr.isMethod(null, isNameExpr).isMethod());
    }
}
