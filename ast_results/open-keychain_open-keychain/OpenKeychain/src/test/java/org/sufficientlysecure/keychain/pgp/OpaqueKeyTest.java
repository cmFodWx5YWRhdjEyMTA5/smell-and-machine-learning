// isComment
package org.sufficientlysecure.keychain.pgp;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.shadows.ShadowLog;
import org.sufficientlysecure.keychain.KeychainTestRunner;
import org.sufficientlysecure.keychain.operations.results.OperationResult.LogType;
import org.sufficientlysecure.keychain.operations.results.OperationResult.OperationLog;
import org.sufficientlysecure.keychain.support.TestDataUtil;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertArrayEquals;

@SuppressWarnings("isStringConstant")
@RunWith(KeychainTestRunner.class)
public class isClassOrIsInterface {

    @BeforeClass
    public static void isMethod() throws Exception {
        isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
    }

    @Test
    public void isMethod() throws Exception {
        UncachedKeyRing isVariable = isMethod("isStringConstant");
        OperationLog isVariable = new OperationLog();
        isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
    }

    @Test
    public void isMethod() throws Exception {
        UncachedKeyRing isVariable = isMethod("isStringConstant");
        OperationLog isVariable = new OperationLog();
        CanonicalizedKeyRing isVariable = isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
    }

    @Test
    public void isMethod() throws Exception {
        byte[] isVariable = isNameExpr.isMethod(OpaqueKeyTest.class.isMethod("isStringConstant"));
        UncachedKeyRing isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr.isMethod());
    }

    UncachedKeyRing isMethod(String isParameter) throws Exception {
        return isNameExpr.isMethod(OpaqueKeyTest.class.isMethod(isNameExpr)).isMethod();
    }
}
