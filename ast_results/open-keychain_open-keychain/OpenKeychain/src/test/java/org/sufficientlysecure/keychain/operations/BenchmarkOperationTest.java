// isComment
package org.sufficientlysecure.keychain.operations;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.shadows.ShadowLog;
import org.sufficientlysecure.keychain.KeychainTestRunner;
import org.sufficientlysecure.keychain.daos.KeyWritableRepository;
import org.sufficientlysecure.keychain.service.BenchmarkInputParcel;
import java.io.PrintStream;
import java.security.Security;

@RunWith(KeychainTestRunner.class)
public class isClassOrIsInterface {

    static PrintStream isVariable;

    @BeforeClass
    public static void isMethod() throws Exception {
        isNameExpr.isMethod(new BouncyCastleProvider(), isIntegerConstant);
        isNameExpr = isNameExpr.isFieldAccessExpr;
        isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
    }

    @Test
    public void isMethod() throws Exception {
        BenchmarkOperation isVariable = new BenchmarkOperation(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), null);
        isNameExpr.isMethod(isNameExpr.isMethod(), null);
    }
}
