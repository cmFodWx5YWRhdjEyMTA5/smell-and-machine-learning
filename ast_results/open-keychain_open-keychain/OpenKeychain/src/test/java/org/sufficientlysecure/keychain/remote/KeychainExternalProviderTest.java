// isComment
package org.sufficientlysecure.keychain.remote;

import java.security.AccessControlException;
import java.util.Collections;
import java.util.Date;
import android.content.ContentResolver;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.database.Cursor;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.shadows.ShadowBinder;
import org.robolectric.shadows.ShadowLog;
import org.robolectric.shadows.ShadowPackageManager;
import org.sufficientlysecure.keychain.KeychainTestRunner;
import org.sufficientlysecure.keychain.daos.ApiAppDao;
import org.sufficientlysecure.keychain.daos.AutocryptPeerDao;
import org.sufficientlysecure.keychain.daos.KeyWritableRepository;
import org.sufficientlysecure.keychain.model.ApiApp;
import org.sufficientlysecure.keychain.model.AutocryptPeer.GossipOrigin;
import org.sufficientlysecure.keychain.operations.CertifyOperation;
import org.sufficientlysecure.keychain.operations.results.CertifyResult;
import org.sufficientlysecure.keychain.operations.results.SaveKeyringResult;
import org.sufficientlysecure.keychain.pgp.UncachedKeyRing;
import org.sufficientlysecure.keychain.provider.KeyRepositorySaveTest;
import org.sufficientlysecure.keychain.provider.KeychainExternalContract;
import org.sufficientlysecure.keychain.provider.KeychainExternalContract.AutocryptStatus;
import org.sufficientlysecure.keychain.service.CertifyActionsParcel;
import org.sufficientlysecure.keychain.service.CertifyActionsParcel.CertifyAction;
import org.sufficientlysecure.keychain.service.input.CryptoInputParcel;
import org.sufficientlysecure.keychain.util.ProgressScaler;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.robolectric.Shadows.shadowOf;

@SuppressWarnings("isStringConstant")
@RunWith(KeychainTestRunner.class)
public class isClassOrIsInterface {

    static final String isVariable = "isStringConstant";

    static final byte[] isVariable = new byte[] { isIntegerConstant, isIntegerConstant, isIntegerConstant };

    static final String isVariable = "isStringConstant";

    static final String isVariable = "isStringConstant";

    static final long isVariable = isStringConstant;

    static final long isVariable = isStringConstant;

    public static final String isVariable = "isStringConstant";

    public static final int isVariable = isIntegerConstant;

    KeyWritableRepository isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);

    ContentResolver isVariable = isNameExpr.isFieldAccessExpr.isMethod();

    ApiPermissionHelper isVariable;

    ApiAppDao isVariable;

    AutocryptPeerDao isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
        ShadowPackageManager isVariable = isMethod(isNameExpr.isFieldAccessExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        PackageInfo isVariable = new PackageInfo();
        isNameExpr.isFieldAccessExpr = new Signature[] { new Signature(isNameExpr) };
        isNameExpr.isFieldAccessExpr = isNameExpr;
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr = new ApiPermissionHelper(isNameExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr));
    }

    @Test(expected = AccessControlException.class)
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new String[] { isNameExpr.isFieldAccessExpr }, null, new String[] {}, null);
    }

    @Test(expected = AccessControlException.class)
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, new byte[] { isIntegerConstant, isIntegerConstant, isIntegerConstant }));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new String[] { isNameExpr.isFieldAccessExpr }, null, new String[] {}, null);
    }

    @Test
    public void isMethod() throws Exception {
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr, "isStringConstant", new Date());
        isNameExpr.isMethod(isNameExpr, isNameExpr, new Date(), isNameExpr, true);
        Cursor isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new String[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr }, null, new String[] { isNameExpr }, null);
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isMethod(isIntegerConstant));
        isMethod(null, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr, "isStringConstant", new Date());
        isNameExpr.isMethod(isNameExpr, isNameExpr, new Date(), isNameExpr, true);
        Cursor isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new String[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr }, null, new String[] { isNameExpr }, null);
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isMethod(isIntegerConstant));
        isMethod(null, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr, "isStringConstant", new Date());
        isNameExpr.isMethod(isNameExpr, isNameExpr, new Date(), isNameExpr, true);
        isMethod(isNameExpr, isNameExpr, isNameExpr);
        Cursor isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new String[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr }, null, new String[] { isNameExpr }, null);
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant));
        isMethod(null, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        Cursor isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new String[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr }, null, new String[] { isNameExpr }, null);
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant));
        isMethod(null, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr, "isStringConstant", new Date());
        isNameExpr.isMethod(isNameExpr, "isStringConstant", new Date(), isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        Cursor isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new String[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr }, null, new String[] { isNameExpr }, null);
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant));
        isMethod(null, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr, "isStringConstant", new Date());
        isNameExpr.isMethod(isNameExpr, isNameExpr, new Date(), isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr, isNameExpr);
        Cursor isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new String[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr }, null, new String[] { isNameExpr }, null);
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant));
        isMethod(null, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isMethod());
    }

    /*isComment*/
    @Test
    public void isMethod() throws Exception {
        isMethod("isStringConstant");
        isMethod("isStringConstant");
        isMethod(isNameExpr, isNameExpr, isNameExpr);
        Cursor isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new String[] { isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr }, null, new String[] { isNameExpr }, null);
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isMethod());
    }

    @Test(expected = AccessControlException.class)
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod("isStringConstant").isMethod(), new String[] { isNameExpr.isFieldAccessExpr }, null, new String[] {}, null);
    }

    private void isMethod(long isParameter, long isParameter, String isParameter) {
        CertifyActionsParcel.Builder isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr)));
        CertifyOperation isVariable = new CertifyOperation(isNameExpr.isFieldAccessExpr, isNameExpr, new ProgressScaler(), null);
        CertifyResult isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod());
    }

    private void isMethod(String isParameter) throws Exception {
        UncachedKeyRing isVariable = isMethod(isNameExpr);
        SaveKeyringResult isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
    }

    private void isMethod(String isParameter) throws Exception {
        UncachedKeyRing isVariable = isMethod(isNameExpr);
        SaveKeyringResult isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
    }

    UncachedKeyRing isMethod(String isParameter) throws Exception {
        return isNameExpr.isMethod(KeyRepositorySaveTest.class.isMethod(isNameExpr)).isMethod();
    }
}
