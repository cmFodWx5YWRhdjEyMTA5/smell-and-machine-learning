// isComment
package org.sufficientlysecure.keychain.operations;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PrintStream;
import java.security.Security;
import java.util.Arrays;
import java.util.Iterator;
import android.app.Application;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import org.bouncycastle.bcpg.sig.KeyFlags;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.shadows.ShadowLog;
import org.sufficientlysecure.keychain.KeychainTestRunner;
import org.sufficientlysecure.keychain.operations.results.DecryptVerifyResult;
import org.sufficientlysecure.keychain.operations.results.ExportResult;
import org.sufficientlysecure.keychain.operations.results.OperationResult.LogType;
import org.sufficientlysecure.keychain.operations.results.OperationResult.OperationLog;
import org.sufficientlysecure.keychain.operations.results.PgpEditKeyResult;
import org.sufficientlysecure.keychain.pgp.PgpDecryptVerifyInputParcel;
import org.sufficientlysecure.keychain.pgp.PgpDecryptVerifyOperation;
import org.sufficientlysecure.keychain.pgp.PgpKeyOperation;
import org.sufficientlysecure.keychain.pgp.UncachedKeyRing;
import org.sufficientlysecure.keychain.pgp.UncachedKeyRing.IteratorWithIOThrow;
import org.sufficientlysecure.keychain.pgp.WrappedSignature;
import org.sufficientlysecure.keychain.daos.KeyWritableRepository;
import org.sufficientlysecure.keychain.provider.TemporaryFileProvider;
import org.sufficientlysecure.keychain.service.BackupKeyringParcel;
import org.sufficientlysecure.keychain.service.ChangeUnlockParcel;
import org.sufficientlysecure.keychain.service.SaveKeyringParcel;
import org.sufficientlysecure.keychain.service.SaveKeyringParcel.Algorithm;
import org.sufficientlysecure.keychain.service.SaveKeyringParcel.SubkeyAdd;
import org.sufficientlysecure.keychain.service.input.CryptoInputParcel;
import org.sufficientlysecure.keychain.ui.util.KeyFormattingUtils;
import org.sufficientlysecure.keychain.util.Passphrase;
import org.sufficientlysecure.keychain.util.TestingUtils;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(KeychainTestRunner.class)
public class isClassOrIsInterface {

    static Passphrase isVariable = isNameExpr.isFieldAccessExpr;

    static UncachedKeyRing isVariable, isVariable;

    static PrintStream isVariable;

    @BeforeClass
    public static void isMethod() throws Exception {
        isNameExpr.isMethod(new BouncyCastleProvider(), isIntegerConstant);
        isNameExpr = isNameExpr.isFieldAccessExpr;
        // isComment
        PgpKeyOperation isVariable = new PgpKeyOperation(null);
        {
            SaveKeyringParcel.Builder isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isStringConstant));
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isStringConstant));
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isStringConstant));
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
            PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
            isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr = isNameExpr.isMethod();
        }
        {
            SaveKeyringParcel.Builder isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isStringConstant));
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isStringConstant));
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isStringConstant));
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod(isNameExpr.isMethod(new Passphrase("isStringConstant")));
            PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
            isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr = isNameExpr.isMethod();
            isNameExpr = isNameExpr.isMethod(isNameExpr, "isStringConstant");
        }
    }

    @Before
    public void isMethod() {
        KeyWritableRepository isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        // isComment
        isNameExpr.isFieldAccessExpr = isNameExpr;
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        // isComment
        isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
    }

    @Test
    public void isMethod() throws Exception {
        BackupOperation isVariable = new BackupOperation(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), null);
        // isComment
        isMethod("isStringConstant", isMethod(isNameExpr));
        ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
        boolean isVariable = isNameExpr.isMethod(new OperationLog(), null, true, true, isNameExpr, null);
        isMethod("isStringConstant", isNameExpr);
        IteratorWithIOThrow<UncachedKeyRing> isVariable = isNameExpr.isMethod(new ByteArrayInputStream(isNameExpr.isMethod()));
        {
            isMethod("isStringConstant", isNameExpr.isMethod());
            UncachedKeyRing isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr.isMethod());
            isMethod("isStringConstant", isNameExpr.isMethod());
            isMethod("isStringConstant", isMethod(isNameExpr));
        }
        {
            isMethod("isStringConstant", isNameExpr.isMethod());
            UncachedKeyRing isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr.isMethod());
            isMethod("isStringConstant", isNameExpr.isMethod());
            isMethod("isStringConstant", isMethod(isNameExpr));
        }
        isNameExpr = new ByteArrayOutputStream();
        isNameExpr = isNameExpr.isMethod(new OperationLog(), null, true, true, isNameExpr, null);
        isMethod("isStringConstant", isNameExpr);
        isNameExpr = isNameExpr.isMethod(new ByteArrayInputStream(isNameExpr.isMethod()));
        {
            isMethod("isStringConstant", isNameExpr.isMethod());
            UncachedKeyRing isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr.isMethod());
            isMethod("isStringConstant", isNameExpr.isMethod());
            isMethod("isStringConstant", isMethod(isNameExpr));
            isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr = isNameExpr.isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr.isMethod());
            isMethod("isStringConstant", isNameExpr.isMethod());
            isMethod("isStringConstant", isMethod(isNameExpr));
        }
        {
            isMethod("isStringConstant", isNameExpr.isMethod());
            UncachedKeyRing isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr.isMethod());
            isMethod("isStringConstant", isNameExpr.isMethod());
            isMethod("isStringConstant", isMethod(isNameExpr));
            isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr = isNameExpr.isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr.isMethod());
            isMethod("isStringConstant", isNameExpr.isMethod());
            isMethod("isStringConstant", isMethod(isNameExpr));
        }
    }

    @Test
    public void isMethod() throws Exception {
        BackupOperation isVariable = new BackupOperation(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), null);
        ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
        boolean isVariable = isNameExpr.isMethod(new OperationLog(), new long[] { isNameExpr.isMethod() }, true, true, isNameExpr, isNameExpr.isMethod("isStringConstant"));
        isMethod(isNameExpr);
        String isVariable = new String(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() throws Exception {
        ContentResolver isVariable = isMethod(ContentResolver.class);
        Uri isVariable = isNameExpr.isMethod("isStringConstant");
        ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
        Application isVariable = isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        BackupOperation isVariable = new BackupOperation(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), null);
        BackupKeyringParcel isVariable = isNameExpr.isMethod(new long[] { isNameExpr.isMethod() }, true, true, true, isNameExpr);
        ExportResult isVariable = isNameExpr.isMethod(isNameExpr, null);
        isMethod(isNameExpr).isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", "isStringConstant".isMethod(), isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", "isStringConstant".isMethod(), isNameExpr.isMethod());
        {
            IteratorWithIOThrow<UncachedKeyRing> isVariable = isNameExpr.isMethod(new ByteArrayInputStream(isNameExpr.isMethod()));
            isMethod("isStringConstant", isNameExpr.isMethod());
            UncachedKeyRing isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr.isMethod());
            isMethod("isStringConstant", isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() throws Exception {
        Application isVariable;
        ContentResolver isVariable = isMethod(ContentResolver.class);
        Uri isVariable, isVariable;
        ByteArrayOutputStream isVariable;
        {
            isNameExpr = isNameExpr.isMethod("isStringConstant");
            PipedInputStream isVariable = new PipedInputStream(isIntegerConstant);
            PipedOutputStream isVariable = new PipedOutputStream(isNameExpr);
            isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
            isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
            isMethod(isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr), isMethod(ContentValues.class))).isMethod(isNameExpr);
            isNameExpr = isNameExpr.isMethod("isStringConstant");
            isNameExpr = new ByteArrayOutputStream();
            isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
            isNameExpr = isMethod(isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        }
        Passphrase isVariable = new Passphrase("isStringConstant");
        {
            // isComment
            BackupOperation isVariable = new BackupOperation(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), null);
            BackupKeyringParcel isVariable = isNameExpr.isMethod(new long[] { isNameExpr.isMethod() }, true, true, true, isNameExpr);
            CryptoInputParcel isVariable = isNameExpr.isMethod(isNameExpr);
            ExportResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
            isMethod(isNameExpr).isMethod(isNameExpr);
            isMethod(isNameExpr).isMethod(isNameExpr);
            isMethod(isNameExpr).isMethod(isNameExpr);
            isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", "isStringConstant".isMethod(), isNameExpr.isMethod());
        }
        {
            PgpDecryptVerifyOperation isVariable = new PgpDecryptVerifyOperation(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), null);
            PgpDecryptVerifyInputParcel isVariable = isNameExpr.isMethod().isMethod(true).isMethod(isNameExpr.isMethod()).isMethod();
            {
                DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
                isMethod("isStringConstant", isNameExpr.isMethod());
                isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr));
            }
            {
                DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(new Passphrase("isStringConstant")));
                isMethod("isStringConstant", isNameExpr.isMethod());
                isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr));
            }
            DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
            isMethod("isStringConstant", isNameExpr.isMethod());
            isMethod("isStringConstant", "isStringConstant" + isNameExpr.isMethod(isNameExpr.isMethod()) + "isStringConstant", isNameExpr.isMethod().isMethod());
            isMethod("isStringConstant", "isStringConstant", isNameExpr.isMethod().isMethod());
            isNameExpr.isMethod("isStringConstant", "isStringConstant".isMethod(), isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", "isStringConstant".isMethod(), isNameExpr.isMethod());
            {
                IteratorWithIOThrow<UncachedKeyRing> isVariable = isNameExpr.isMethod(new ByteArrayInputStream(isNameExpr.isMethod()));
                isMethod("isStringConstant", isNameExpr.isMethod());
                UncachedKeyRing isVariable = isNameExpr.isMethod();
                isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr.isMethod());
                isMethod("isStringConstant", isNameExpr.isMethod());
            }
        }
    }

    /**
     * isComment
     */
    private boolean isMethod(UncachedKeyRing isParameter) {
        Iterator<WrappedSignature> isVariable = isNameExpr.isMethod().isMethod();
        while (isNameExpr.isMethod()) {
            if (isNameExpr.isMethod().isMethod()) {
                return true;
            }
        }
        return true;
    }
}
