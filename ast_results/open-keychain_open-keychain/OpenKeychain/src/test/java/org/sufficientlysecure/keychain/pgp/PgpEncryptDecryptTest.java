// isComment
package org.sufficientlysecure.keychain.pgp;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.security.Security;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.apache.tools.ant.util.StringUtils;
import org.bouncycastle.bcpg.BCPGInputStream;
import org.bouncycastle.bcpg.Packet;
import org.bouncycastle.bcpg.PacketTags;
import org.bouncycastle.bcpg.PublicKeyAlgorithmTags;
import org.bouncycastle.bcpg.PublicKeyEncSessionPacket;
import org.bouncycastle.bcpg.SymmetricKeyAlgorithmTags;
import org.bouncycastle.bcpg.sig.KeyFlags;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openintents.openpgp.OpenPgpDecryptionResult;
import org.openintents.openpgp.OpenPgpMetadata;
import org.openintents.openpgp.OpenPgpSignatureResult;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.shadows.ShadowLog;
import org.sufficientlysecure.keychain.KeychainTestRunner;
import org.sufficientlysecure.keychain.operations.results.DecryptVerifyResult;
import org.sufficientlysecure.keychain.operations.results.OperationResult.LogType;
import org.sufficientlysecure.keychain.operations.results.PgpSignEncryptResult;
import org.sufficientlysecure.keychain.pgp.SecurityProblem.InsecureBitStrength;
import org.sufficientlysecure.keychain.pgp.SecurityProblem.InsecureEncryptionAlgorithm;
import org.sufficientlysecure.keychain.pgp.SecurityProblem.MissingMdc;
import org.sufficientlysecure.keychain.daos.KeyWritableRepository;
import org.sufficientlysecure.keychain.service.SaveKeyringParcel;
import org.sufficientlysecure.keychain.service.SaveKeyringParcel.SubkeyChange;
import org.sufficientlysecure.keychain.service.input.CryptoInputParcel;
import org.sufficientlysecure.keychain.service.input.RequiredInputParcel;
import org.sufficientlysecure.keychain.service.input.RequiredInputParcel.RequiredInputType;
import org.sufficientlysecure.keychain.support.KeyringTestingHelper;
import org.sufficientlysecure.keychain.support.KeyringTestingHelper.RawPacket;
import org.sufficientlysecure.keychain.util.InputData;
import org.sufficientlysecure.keychain.util.Passphrase;
import org.sufficientlysecure.keychain.util.TestingUtils;
import static org.hamcrest.core.AnyOf.anyOf;
import static org.hamcrest.core.Is.is;

@SuppressWarnings("isStringConstant")
@RunWith(KeychainTestRunner.class)
public class isClassOrIsInterface {

    static Passphrase isVariable = isNameExpr.isFieldAccessExpr;

    static UncachedKeyRing isVariable, isVariable, isVariable;

    static Passphrase isVariable, isVariable;

    static PrintStream isVariable;

    @BeforeClass
    public static void isMethod() throws Exception {
        isNameExpr.isMethod(new BouncyCastleProvider(), isIntegerConstant);
        isNameExpr = isNameExpr.isFieldAccessExpr;
        // isComment
        /*isComment*/
        isNameExpr = new Passphrase("isStringConstant");
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        /*isComment*/
        isNameExpr = new Passphrase("isStringConstant");
        isNameExpr = isNameExpr.isMethod("isStringConstant");
        /*isComment*/
        isNameExpr = isNameExpr.isMethod("isStringConstant");
    }

    @Before
    public void isMethod() {
        KeyWritableRepository isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        // isComment
        isNameExpr.isFieldAccessExpr = isNameExpr;
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        // isComment
        isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
    }

    @Test
    public void isMethod() {
        String isVariable = "isStringConstant";
        byte[] isVariable;
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr.isMethod());
            PgpSignEncryptOperation isVariable = new PgpSignEncryptOperation(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), null);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpSignEncryptData.Builder isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            PgpSignEncryptResult isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(new Date()), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr = isNameExpr.isMethod();
        }
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpDecryptVerifyOperation isVariable = new PgpDecryptVerifyOperation(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), null);
            PgpDecryptVerifyInputParcel isVariable = isNameExpr.isMethod().isMethod(true).isMethod();
            DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
            CryptoInputParcel isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod().isMethod());
            OpenPgpMetadata isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isFieldAccessExpr, isNameExpr.isMethod());
        }
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpDecryptVerifyOperation isVariable = new PgpDecryptVerifyOperation(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), null);
            PgpDecryptVerifyInputParcel isVariable = isNameExpr.isMethod().isMethod(true).isMethod();
            DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(new Passphrase(new String(isNameExpr.isMethod()) + "isStringConstant")), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        }
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpDecryptVerifyOperation isVariable = new PgpDecryptVerifyOperation(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), null);
            PgpDecryptVerifyInputParcel isVariable = isNameExpr.isMethod().isMethod(true).isMethod();
            DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        }
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpDecryptVerifyOperation isVariable = new PgpDecryptVerifyOperation(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), null);
            PgpDecryptVerifyInputParcel isVariable = isNameExpr.isMethod().isMethod();
            DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() {
        String isVariable = "isStringConstant";
        byte[] isVariable;
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr.isMethod());
            PgpSignEncryptOperation isVariable = new PgpSignEncryptOperation(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), null);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpSignEncryptData.Builder isVariable = isNameExpr.isMethod();
            // isComment
            isNameExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant));
            isNameExpr.isMethod(true);
            isNameExpr.isMethod(true);
            PgpSignEncryptResult isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(isNameExpr), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr = isNameExpr.isMethod();
        }
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpDecryptVerifyOperation isVariable = isMethod(null, null, null);
            PgpDecryptVerifyInputParcel isVariable = isNameExpr.isMethod().isMethod();
            DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
            OpenPgpMetadata isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isFieldAccessExpr, isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() {
        String isVariable = "isStringConstant";
        byte[] isVariable;
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr.isMethod());
            PgpSignEncryptOperation isVariable = new PgpSignEncryptOperation(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), null);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpSignEncryptData.Builder isVariable = isNameExpr.isMethod();
            // isComment
            isNameExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant));
            isNameExpr.isMethod(true);
            isNameExpr.isMethod(true);
            isNameExpr.isMethod(true);
            PgpSignEncryptResult isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(isNameExpr), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr = isNameExpr.isMethod();
        }
        isNameExpr.isMethod("isStringConstant", new String(isNameExpr).isMethod("isStringConstant", "isStringConstant").isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant", "isStringConstant")));
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpDecryptVerifyOperation isVariable = isMethod(null, null, null);
            PgpDecryptVerifyInputParcel isVariable = isNameExpr.isMethod().isMethod();
            DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", new String(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant").isMethod(isNameExpr.isMethod("isStringConstant", "isStringConstant").isMethod("isStringConstant", "isStringConstant")));
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
            OpenPgpMetadata isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isFieldAccessExpr, isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() {
        String isVariable = "isStringConstant";
        byte[] isVariable;
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr.isMethod());
            PgpSignEncryptOperation isVariable = new PgpSignEncryptOperation(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), null);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpSignEncryptData.Builder isVariable = isNameExpr.isMethod();
            // isComment
            isNameExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant));
            isNameExpr.isMethod(true);
            PgpSignEncryptResult isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(isNameExpr), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr = isNameExpr.isMethod();
        }
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr.isMethod());
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpDecryptVerifyOperation isVariable = isMethod(null, null, null);
            PgpDecryptVerifyInputParcel isVariable = isNameExpr.isMethod().isMethod(isNameExpr).isMethod();
            DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
        // isComment
        // isComment
        // isComment
        // isComment
        }
    }

    @Test
    public void isMethod() {
        String isVariable = "isStringConstant";
        byte[] isVariable;
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr.isMethod());
            PgpSignEncryptOperation isVariable = new PgpSignEncryptOperation(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), null);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpSignEncryptData.Builder isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(new long[] { isNameExpr.isMethod() });
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            PgpSignEncryptResult isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(new Date()), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr = isNameExpr.isMethod();
        }
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpDecryptVerifyOperation isVariable = isMethod(null, null, null);
            PgpDecryptVerifyInputParcel isVariable = isNameExpr.isMethod().isMethod();
            DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
            CryptoInputParcel isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod().isMethod());
            OpenPgpMetadata isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isFieldAccessExpr, isNameExpr.isMethod());
        }
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpDecryptVerifyOperation isVariable = isMethod(isNameExpr, isNameExpr.isMethod(), null);
            PgpDecryptVerifyInputParcel isVariable = isNameExpr.isMethod().isMethod();
            DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr, isNameExpr);
            CryptoInputParcel isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod().isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
        }
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpDecryptVerifyOperation isVariable = isMethod(null, isNameExpr.isMethod(), null);
            PgpDecryptVerifyInputParcel isVariable = isNameExpr.isMethod().isMethod();
            DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isFieldAccessExpr);
        }
    }

    @Test
    public void isMethod() throws Exception {
        String isVariable = "isStringConstant";
        byte[] isVariable;
        long isVariable;
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr.isMethod());
            PgpSignEncryptOperation isVariable = new PgpSignEncryptOperation(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), null);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpSignEncryptData.Builder isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(new long[] { isNameExpr.isMethod() });
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            PgpSignEncryptResult isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(new Date()), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr = isNameExpr.isMethod();
            Iterator<RawPacket> isVariable = isNameExpr.isMethod(isNameExpr);
            RawPacket isVariable = isNameExpr.isMethod(), isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isFieldAccessExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            Packet isVariable;
            isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof PublicKeyEncSessionPacket);
            isNameExpr = ((PublicKeyEncSessionPacket) isNameExpr).isMethod();
            isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof PublicKeyEncSessionPacket);
            long isVariable = ((PublicKeyEncSessionPacket) isNameExpr).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, isIntegerConstant), isMethod(isMethod(isNameExpr), isMethod(isNameExpr)));
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, isIntegerConstant), isMethod(isMethod(isNameExpr), isMethod(isNameExpr)));
        }
        {
            // isComment
            SaveKeyringParcel.Builder isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
            UncachedKeyRing isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr, new ArrayList<RawPacket>(), new ArrayList<RawPacket>(), isNameExpr.isMethod(new Date(), isNameExpr));
            KeyWritableRepository isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr);
            PgpDecryptVerifyOperation isVariable = new PgpDecryptVerifyOperation(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), null);
            PgpDecryptVerifyInputParcel isVariable = isNameExpr.isMethod().isMethod(isNameExpr).isMethod();
            DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr));
        }
        {
            // isComment
            SaveKeyringParcel.Builder isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, null));
            UncachedKeyRing isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr, new ArrayList<RawPacket>(), new ArrayList<RawPacket>(), isNameExpr.isMethod(new Date(), isNameExpr));
            KeyWritableRepository isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr);
            PgpDecryptVerifyOperation isVariable = new PgpDecryptVerifyOperation(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), null);
            PgpDecryptVerifyInputParcel isVariable = isNameExpr.isMethod().isMethod(isNameExpr).isMethod();
            DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    @Test
    public void isMethod() throws Exception {
        String isVariable = "isStringConstant";
        {
            // isComment
            SaveKeyringParcel.Builder isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant));
            UncachedKeyRing isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr, new ArrayList<RawPacket>(), new ArrayList<RawPacket>(), isNameExpr.isMethod(new Date(), isNameExpr));
            KeyWritableRepository isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr);
        }
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr.isMethod());
            PgpSignEncryptOperation isVariable = new PgpSignEncryptOperation(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), null);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpSignEncryptData.Builder isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(new long[] { isNameExpr.isMethod() });
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            PgpSignEncryptResult isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(new Date()), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            byte[] isVariable = isNameExpr.isMethod();
            Iterator<RawPacket> isVariable = isNameExpr.isMethod(isNameExpr);
            RawPacket isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isFieldAccessExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            Packet isVariable;
            isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof PublicKeyEncSessionPacket);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr, isIntegerConstant), ((PublicKeyEncSessionPacket) isNameExpr).isMethod());
        }
    }

    @Test
    public void isMethod() {
        String isVariable = "isStringConstant";
        byte[] isVariable;
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr.isMethod());
            PgpSignEncryptOperation isVariable = new PgpSignEncryptOperation(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), null);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpSignEncryptData.Builder isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(new long[] { isNameExpr.isMethod(), isNameExpr.isMethod() });
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            PgpSignEncryptResult isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(new Date()), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr = isNameExpr.isMethod();
        }
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpDecryptVerifyOperation isVariable = isMethod(isNameExpr, isNameExpr.isMethod(), null);
            PgpDecryptVerifyInputParcel isVariable = isNameExpr.isMethod().isMethod();
            DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
            OpenPgpMetadata isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isFieldAccessExpr, isNameExpr.isMethod());
        }
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            // isComment
            ArrayList<Long> isVariable = new ArrayList<>();
            isNameExpr.isMethod(isNameExpr.isMethod());
            // isComment
            PgpDecryptVerifyOperation isVariable = isMethod(isNameExpr, isNameExpr.isMethod(), null);
            PgpDecryptVerifyInputParcel isVariable = isNameExpr.isMethod().isMethod(isNameExpr).isMethod();
            DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr));
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
        }
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            // isComment
            PgpDecryptVerifyOperation isVariable = isMethod(isNameExpr, isNameExpr.isMethod(), null);
            PgpDecryptVerifyInputParcel isVariable = isNameExpr.isMethod().isMethod(new ArrayList<Long>()).isMethod();
            DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        }
        {
            // isComment
            // isComment
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod());
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpDecryptVerifyOperation isVariable = isMethod(isNameExpr, isNameExpr.isMethod(), null);
            PgpDecryptVerifyInputParcel isVariable = isNameExpr.isMethod().isMethod();
            DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
        }
    }

    @Test
    public void isMethod() {
        String isVariable = "isStringConstant";
        byte[] isVariable;
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr.isMethod());
            PgpSignEncryptOperation isVariable = new PgpSignEncryptOperation(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), null);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpSignEncryptData.Builder isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(new long[] { isNameExpr.isMethod(), isNameExpr.isMethod() });
            isNameExpr.isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isIntegerConstant));
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            PgpSignEncryptResult isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(new Date(), isNameExpr), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr = isNameExpr.isMethod();
        }
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpDecryptVerifyOperation isVariable = isMethod(isNameExpr, isNameExpr.isMethod(), null);
            PgpDecryptVerifyInputParcel isVariable = isNameExpr.isMethod().isMethod();
            DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
            OpenPgpMetadata isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isFieldAccessExpr, isNameExpr.isMethod());
        }
        {
            // isComment
            // isComment
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod());
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpDecryptVerifyOperation isVariable = isMethod(isNameExpr, isNameExpr.isMethod(), null);
            PgpDecryptVerifyInputParcel isVariable = isNameExpr.isMethod().isMethod();
            DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
        }
    }

    @Test
    public void isMethod() throws Exception {
        String isVariable = "isStringConstant";
        byte[] isVariable = isNameExpr.isMethod("isStringConstant");
        {
            // isComment
            isNameExpr.isMethod(isNameExpr, new String(isNameExpr, "isStringConstant"));
            isNameExpr.isMethod(isNameExpr, new String(isNameExpr, "isStringConstant"));
        }
        byte[] isVariable;
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr);
            PgpSignEncryptOperation isVariable = new PgpSignEncryptOperation(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), null);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpSignEncryptData.Builder isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(new long[] { isNameExpr.isMethod() });
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            // isComment
            isNameExpr.isMethod(true);
            isNameExpr.isMethod("isStringConstant");
            PgpSignEncryptResult isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(new Date()), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr = isNameExpr.isMethod();
        }
        {
            // isComment
            ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
            ByteArrayInputStream isVariable = new ByteArrayInputStream(isNameExpr);
            InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
            PgpDecryptVerifyOperation isVariable = isMethod(null, null, null);
            PgpDecryptVerifyInputParcel isVariable = isNameExpr.isMethod().isMethod();
            DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr);
            isNameExpr.isMethod("isStringConstant", "isStringConstant", isNameExpr.isMethod().isMethod());
            isNameExpr.isMethod("isStringConstant", new String(isNameExpr.isMethod(), isNameExpr.isMethod().isMethod()), isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
        }
    }

    @Test
    public void isMethod() throws Exception {
        InputStream isVariable = isMethod("isStringConstant");
        String isVariable = "isStringConstant";
        ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
        InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
        PgpDecryptVerifyOperation isVariable = isMethod(null, null, null);
        PgpDecryptVerifyInputParcel isVariable = isNameExpr.isMethod().isMethod();
        DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
        InsecureEncryptionAlgorithm isVariable = (InsecureEncryptionAlgorithm) isNameExpr.isMethod().isFieldAccessExpr;
        isNameExpr.isMethod((isNameExpr).isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
    }

    public void isMethod() throws Exception {
        InputStream isVariable = isMethod("isStringConstant");
        String isVariable = "isStringConstant";
        ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
        InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
        PgpDecryptVerifyOperation isVariable = isMethod(null, null, null);
        PgpDecryptVerifyInputParcel isVariable = isNameExpr.isMethod().isMethod();
        DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod().isFieldAccessExpr instanceof MissingMdc);
    }

    public void isMethod() throws Exception {
        InputStream isVariable = isMethod("isStringConstant");
        String isVariable = "isStringConstant";
        ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
        InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
        PgpDecryptVerifyOperation isVariable = isMethod(null, null, null);
        PgpDecryptVerifyInputParcel isVariable = isNameExpr.isMethod().isMethod();
        DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
        InsecureBitStrength isVariable = (InsecureBitStrength) isNameExpr.isMethod().isFieldAccessExpr;
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws Exception {
        InputStream isVariable = isMethod("isStringConstant");
        ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
        InputData isVariable = new InputData(isNameExpr, isNameExpr.isMethod());
        PgpDecryptVerifyOperation isVariable = isMethod(null, null, null);
        PgpDecryptVerifyInputParcel isVariable = isNameExpr.isMethod().isMethod();
        DecryptVerifyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr, isNameExpr);
        RequiredInputParcel isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod().isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()[isIntegerConstant]);
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()[isIntegerConstant]);
        isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()[isIntegerConstant]);
    }

    private PgpDecryptVerifyOperation isMethod(final Passphrase isParameter, final Long isParameter, final Long isParameter) {
        return new PgpDecryptVerifyOperation(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr), null) {

            @Override
            public Passphrase isMethod(long isParameter, long isParameter) throws NoSecretKeyException {
                if (isNameExpr != null) {
                    isNameExpr.isMethod("isStringConstant", (long) isNameExpr, isNameExpr);
                }
                if (isNameExpr != null) {
                    isNameExpr.isMethod("isStringConstant", (long) isNameExpr, isNameExpr);
                }
                if (isNameExpr == null) {
                    return null;
                }
                return isNameExpr;
            }
        };
    }

    private static InputStream isMethod(String isParameter) {
        return PgpEncryptDecryptTest.class.isMethod(isNameExpr);
    }
}
