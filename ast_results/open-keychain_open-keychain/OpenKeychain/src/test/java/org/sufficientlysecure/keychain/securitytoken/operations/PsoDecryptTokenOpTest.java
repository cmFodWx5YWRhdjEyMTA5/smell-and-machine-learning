// isComment
package org.sufficientlysecure.keychain.securitytoken.operations;

import org.bouncycastle.util.encoders.Hex;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.sufficientlysecure.keychain.KeychainTestRunner;
import org.sufficientlysecure.keychain.securitytoken.CommandApdu;
import org.sufficientlysecure.keychain.securitytoken.OpenPgpCapabilities;
import org.sufficientlysecure.keychain.securitytoken.OpenPgpCommandApduFactory;
import org.sufficientlysecure.keychain.securitytoken.ResponseApdu;
import org.sufficientlysecure.keychain.securitytoken.SecurityTokenConnection;
import org.sufficientlysecure.keychain.securitytoken.operations.PsoDecryptTokenOp;
import static org.junit.Assert.*;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(KeychainTestRunner.class)
public class isClassOrIsInterface {

    private static final byte[] isVariable = isNameExpr.isMethod("isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant");

    private static final int isVariable = isIntegerConstant;

    private SecurityTokenConnection isVariable;

    private OpenPgpCommandApduFactory isVariable;

    private PsoDecryptTokenOp isVariable;

    private CommandApdu isVariable = isMethod(CommandApdu.class);

    @Before
    public void isMethod() throws Exception {
        isNameExpr = isMethod(SecurityTokenConnection.class);
        isNameExpr = isMethod(OpenPgpCommandApduFactory.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        OpenPgpCapabilities isVariable = isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant"));
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        ResponseApdu isVariable = isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod(isMethod(byte[].class), isMethod(isNameExpr))).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
        byte[] isVariable = isNameExpr.isMethod(isNameExpr, null);
        isMethod(isNameExpr.isMethod("isStringConstant"), isNameExpr);
    }
}
