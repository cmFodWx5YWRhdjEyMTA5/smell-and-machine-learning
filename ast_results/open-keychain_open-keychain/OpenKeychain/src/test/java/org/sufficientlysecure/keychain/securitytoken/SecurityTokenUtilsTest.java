// isComment
package org.sufficientlysecure.keychain.securitytoken;

import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.robolectric.shadows.ShadowLog;
import org.sufficientlysecure.keychain.KeychainTestRunner;
import org.sufficientlysecure.keychain.securitytoken.usb.UsbTransportException;
import org.sufficientlysecure.keychain.securitytoken.SecurityTokenInfo.TokenType;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.interfaces.RSAPrivateCrtKey;

@RunWith(KeychainTestRunner.class)
public class isClassOrIsInterface extends Mockito {

    @Before
    public void isMethod() {
        isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        isNameExpr.isMethod(new byte[] { isIntegerConstant }, isNameExpr.isMethod(isIntegerConstant));
        isNameExpr.isMethod(new byte[] { isIntegerConstant }, isNameExpr.isMethod(isIntegerConstant));
        isNameExpr.isMethod(new byte[] { isIntegerConstant }, isNameExpr.isMethod(isIntegerConstant));
        // isComment
        isNameExpr.isMethod(new byte[] { (byte) isIntegerConstant, (byte) isIntegerConstant }, isNameExpr.isMethod(isIntegerConstant));
        isNameExpr.isMethod(new byte[] { (byte) isIntegerConstant, (byte) isIntegerConstant }, isNameExpr.isMethod(isIntegerConstant));
        // isComment
        isNameExpr.isMethod(new byte[] { (byte) isIntegerConstant, (byte) isIntegerConstant, isIntegerConstant }, isNameExpr.isMethod(isIntegerConstant));
        isNameExpr.isMethod(new byte[] { (byte) isIntegerConstant, (byte) isIntegerConstant, (byte) isIntegerConstant }, isNameExpr.isMethod(isIntegerConstant));
        // isComment
        isNameExpr.isMethod(new byte[] { (byte) isIntegerConstant, (byte) isIntegerConstant, (byte) isIntegerConstant, (byte) isIntegerConstant }, isNameExpr.isMethod(isIntegerConstant));
        isNameExpr.isMethod(new byte[] { (byte) isIntegerConstant, (byte) isIntegerConstant, (byte) isIntegerConstant, (byte) isIntegerConstant }, isNameExpr.isMethod(isIntegerConstant));
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() throws Exception {
        isNameExpr.isMethod(-isIntegerConstant);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isIntegerConstant * isIntegerConstant * isIntegerConstant);
    }

    @Test
    public void isMethod() {
        ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
        isNameExpr.isMethod(isNameExpr, new BigInteger("isStringConstant"), isIntegerConstant);
        isNameExpr.isMethod(new byte[isIntegerConstant], isNameExpr.isMethod());
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr, new BigInteger("isStringConstant"), isIntegerConstant);
        isNameExpr.isMethod(new byte[isIntegerConstant], isNameExpr.isMethod());
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr, new BigInteger("isStringConstant"), isIntegerConstant);
        isNameExpr.isMethod(new byte[] { isIntegerConstant, isIntegerConstant, isIntegerConstant }, isNameExpr.isMethod());
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr, new BigInteger("isStringConstant"), isIntegerConstant);
        isNameExpr.isMethod(new byte[] { (byte) isIntegerConstant }, isNameExpr.isMethod());
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr, new BigInteger("isStringConstant"), isIntegerConstant);
        isNameExpr.isMethod(new byte[] { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, isNameExpr.isMethod());
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr, new BigInteger("isStringConstant"), isIntegerConstant);
        isNameExpr.isMethod(new byte[] { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, isNameExpr.isMethod());
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
        isNameExpr.isMethod(isNameExpr, new BigInteger("isStringConstant"), isIntegerConstant);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
        isNameExpr.isMethod(isNameExpr, new BigInteger("isStringConstant"), isIntegerConstant);
    }

    @Test(expected = IllegalArgumentException.class)
    public void isMethod() {
        ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
        isNameExpr.isMethod(isNameExpr, new BigInteger("isStringConstant"), isIntegerConstant);
    }

    @Test
    public void isMethod() throws Exception {
        RSAPrivateCrtKey isVariable = isMethod(RSAPrivateCrtKey.class);
        byte[] isVariable = new byte[isIntegerConstant];
        isNameExpr.isMethod(isNameExpr, (byte) isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(new BigInteger(isNameExpr));
        isNameExpr.isMethod(isNameExpr, (byte) isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(new BigInteger(isNameExpr));
        BigInteger isVariable = new BigInteger("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(// isComment
        "isStringConstant" + // isComment
        "isStringConstant" + // isComment
        "isStringConstant" + // isComment
        "isStringConstant" + // isComment
        "isStringConstant" + // isComment
        "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant"), isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, new RSAKeyFormat(isIntegerConstant, isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
    }

    @Test
    public void isMethod() throws UsbTransportException {
        CardCapabilities isVariable;
        // isComment
        isNameExpr = new CardCapabilities(isNameExpr.isMethod("isStringConstant"), isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(), true);
        isNameExpr.isMethod(isNameExpr.isMethod(), true);
        isNameExpr.isMethod(isNameExpr.isMethod(), true);
        // isComment
        isNameExpr = new CardCapabilities(isNameExpr.isMethod("isStringConstant"), isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(), true);
        isNameExpr.isMethod(isNameExpr.isMethod(), true);
        isNameExpr.isMethod(isNameExpr.isMethod(), true);
        // isComment
        isNameExpr = new CardCapabilities(isNameExpr.isMethod("isStringConstant"), isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(), true);
        isNameExpr.isMethod(isNameExpr.isMethod(), true);
        isNameExpr.isMethod(isNameExpr.isMethod(), true);
        // isComment
        isNameExpr = new CardCapabilities(isNameExpr.isMethod("isStringConstant"), isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(), true);
        isNameExpr.isMethod(isNameExpr.isMethod(), true);
        isNameExpr.isMethod(isNameExpr.isMethod(), true);
        // isComment
        isNameExpr = new CardCapabilities(isNameExpr.isMethod("isStringConstant"), isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(), true);
        isNameExpr.isMethod(isNameExpr.isMethod(), true);
        isNameExpr.isMethod(isNameExpr.isMethod(), true);
        // isComment
        isNameExpr = new CardCapabilities(isNameExpr.isMethod("isStringConstant"), isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(), true);
        isNameExpr.isMethod(isNameExpr.isMethod(), true);
        isNameExpr.isMethod(isNameExpr.isMethod(), true);
    }

    @Test
    public void isMethod() throws IOException {
        byte[] isVariable;
        // isComment
        isNameExpr = isNameExpr.isMethod("isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant");
        OpenPgpCapabilities isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(), true);
    }
}
