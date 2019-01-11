// isComment
package org.sufficientlysecure.keychain.pgp;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.Security;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import junit.framework.AssertionFailedError;
import org.bouncycastle.bcpg.BCPGInputStream;
import org.bouncycastle.bcpg.HashAlgorithmTags;
import org.bouncycastle.bcpg.Packet;
import org.bouncycastle.bcpg.PacketTags;
import org.bouncycastle.bcpg.S2K;
import org.bouncycastle.bcpg.SecretKeyPacket;
import org.bouncycastle.bcpg.SecretSubkeyPacket;
import org.bouncycastle.bcpg.SignaturePacket;
import org.bouncycastle.bcpg.UserAttributePacket;
import org.bouncycastle.bcpg.UserAttributeSubpacket;
import org.bouncycastle.bcpg.UserIDPacket;
import org.bouncycastle.bcpg.sig.KeyFlags;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.openpgp.PGPSecretKey;
import org.bouncycastle.openpgp.PGPSecretKeyRing;
import org.bouncycastle.openpgp.PGPSignature;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.shadows.ShadowLog;
import org.sufficientlysecure.keychain.KeychainTestRunner;
import org.sufficientlysecure.keychain.operations.results.OperationResult.LogType;
import org.sufficientlysecure.keychain.operations.results.OperationResult.OperationLog;
import org.sufficientlysecure.keychain.operations.results.PgpEditKeyResult;
import org.sufficientlysecure.keychain.pgp.CanonicalizedKeyRing.VerificationStatus;
import org.sufficientlysecure.keychain.service.ChangeUnlockParcel;
import org.sufficientlysecure.keychain.service.SaveKeyringParcel;
import org.sufficientlysecure.keychain.service.SaveKeyringParcel.Algorithm;
import org.sufficientlysecure.keychain.service.SaveKeyringParcel.SubkeyAdd;
import org.sufficientlysecure.keychain.service.SaveKeyringParcel.SubkeyChange;
import org.sufficientlysecure.keychain.service.input.CryptoInputParcel;
import org.sufficientlysecure.keychain.service.input.RequiredInputParcel.RequiredInputType;
import org.sufficientlysecure.keychain.support.KeyringBuilder;
import org.sufficientlysecure.keychain.support.KeyringTestingHelper;
import org.sufficientlysecure.keychain.support.KeyringTestingHelper.RawPacket;
import org.sufficientlysecure.keychain.support.TestDataUtil;
import org.sufficientlysecure.keychain.util.Passphrase;
import org.sufficientlysecure.keychain.util.ProgressScaler;
import org.sufficientlysecure.keychain.util.TestingUtils;
import static org.bouncycastle.bcpg.sig.KeyFlags.CERTIFY_OTHER;
import static org.bouncycastle.bcpg.sig.KeyFlags.SIGN_DATA;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.sufficientlysecure.keychain.operations.results.OperationResult.LogType.MSG_MF_ERROR_FINGERPRINT;
import static org.sufficientlysecure.keychain.service.SaveKeyringParcel.Algorithm.ECDSA;
import static org.sufficientlysecure.keychain.service.SaveKeyringParcel.Algorithm.RSA;
import static org.sufficientlysecure.keychain.service.SaveKeyringParcel.Curve.NIST_P256;
import static org.sufficientlysecure.keychain.service.SaveKeyringParcel.SubkeyAdd.createSubkeyAdd;
import static org.sufficientlysecure.keychain.service.SaveKeyringParcel.SubkeyChange.createFlagsOrExpiryChange;
import static org.sufficientlysecure.keychain.service.SaveKeyringParcel.SubkeyChange.createRecertifyChange;
import static org.sufficientlysecure.keychain.service.SaveKeyringParcel.SubkeyChange.createStripChange;
import static org.sufficientlysecure.keychain.service.SaveKeyringParcel.buildChangeKeyringParcel;

@RunWith(KeychainTestRunner.class)
public class isClassOrIsInterface {

    static UncachedKeyRing isVariable;

    static final Passphrase isVariable = isNameExpr.isFieldAccessExpr;

    UncachedKeyRing isVariable;

    PgpKeyOperation isVariable;

    SaveKeyringParcel.Builder isVariable;

    ArrayList<RawPacket> isVariable = new ArrayList<>();

    ArrayList<RawPacket> isVariable = new ArrayList<>();

    static CryptoInputParcel isVariable;

    @BeforeClass
    public static void isMethod() throws Exception {
        isNameExpr.isMethod(new BouncyCastleProvider(), isIntegerConstant);
        isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
        SaveKeyringParcel.Builder isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isStringConstant));
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isStringConstant));
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isStringConstant));
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        {
            int isVariable = isIntegerConstant;
            byte[] isVariable = new byte[] { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant };
            WrappedUserAttribute isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        }
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        PgpKeyOperation isVariable = new PgpKeyOperation(null);
        PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod(new OperationLog(), isIntegerConstant).isMethod();
        // isComment
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr = isNameExpr.isMethod(new Date(), isNameExpr);
    }

    @Before
    public void isMethod() throws Exception {
        // isComment
        isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
        isNameExpr = isNameExpr;
        // isComment
        isNameExpr = new PgpKeyOperation(new ProgressScaler(null, isIntegerConstant, isIntegerConstant, isIntegerConstant));
        isMethod();
    }

    private void isMethod() {
        isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
    }

    @Test
    public void isMethod() {
        {
            isMethod();
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new Random().isMethod(isIntegerConstant) + isIntegerConstant, null, isNameExpr.isFieldAccessExpr, isStringConstant));
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
            isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        }
        {
            isMethod();
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant, null, isNameExpr.isFieldAccessExpr, isStringConstant));
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
            isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        }
        {
            isMethod();
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, null));
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
            isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        }
        {
            isMethod();
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isStringConstant));
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
            isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        }
        {
            isMethod();
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isStringConstant));
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
            isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        }
        {
            isMethod();
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
            isMethod("isStringConstant", isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        }
    }

    @Test
    public void isMethod() throws Exception {
        SaveKeyringParcel.Builder isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isStringConstant));
        isNameExpr.isMethod("isStringConstant");
        PgpKeyOperation isVariable = new PgpKeyOperation(null);
        PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
        PGPSecretKey isVariable = ((PGPSecretKeyRing) isNameExpr.isMethod().isFieldAccessExpr).isMethod();
        isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        SaveKeyringParcel.Builder isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isStringConstant));
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr.isMethod(new Passphrase("isStringConstant")));
        PgpKeyOperation isVariable = new PgpKeyOperation(null);
        PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
        PGPSecretKey isVariable = ((PGPSecretKeyRing) isNameExpr.isMethod().isFieldAccessExpr).isMethod();
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
        isMethod(-isIntegerConstant, isNameExpr.isMethod().isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
    }

    @Test
    public // isComment
    void isMethod() throws Exception {
        SaveKeyringParcel.Builder isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr, isStringConstant));
        isNameExpr.isMethod("isStringConstant");
        isNameExpr = isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod(isNameExpr.isMethod()).isMethod());
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr, (long) isNameExpr.isMethod().isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        // isComment
        // isComment
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod().isMethod());
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod().isMethod().isMethod());
        ArrayList<WrappedUserAttribute> isVariable = isNameExpr.isMethod().isMethod();
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod(isIntegerConstant).isMethod());
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod(isIntegerConstant).isMethod().isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", new byte[] { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, isNameExpr.isMethod(isIntegerConstant).isMethod()[isIntegerConstant]);
        List<UncachedPublicKey> isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod().isMethod(new Date(new Date().isMethod() - isIntegerConstant * isIntegerConstant)));
        isMethod("isStringConstant", isNameExpr.isMethod().isMethod());
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, (long) isNameExpr.isMethod(isIntegerConstant).isMethod());
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, (long) isNameExpr.isMethod(isIntegerConstant).isMethod());
        ArrayList<WrappedSignature> isVariable = isNameExpr.isMethod(isIntegerConstant).isMethod().isMethod().isMethod();
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant).isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod(), isNameExpr.isMethod(isIntegerConstant).isMethod());
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, (long) isNameExpr.isMethod(isIntegerConstant).isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        {
            SaveKeyringParcel.Builder isVariable = isNameExpr.isMethod(isNameExpr.isMethod() - isIntegerConstant, isNameExpr.isMethod());
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        }
        {
            byte[] isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod().isFieldAccessExpr);
            isNameExpr[isIntegerConstant] += isIntegerConstant;
            SaveKeyringParcel.Builder isVariable = isMethod(isNameExpr.isMethod(), isNameExpr);
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(), isNameExpr);
        }
        {
            SaveKeyringParcel.Builder isVariable = isMethod(isNameExpr.isMethod(), null);
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(), isNameExpr);
        }
        {
            Passphrase isVariable = new Passphrase();
            isNameExpr.isMethod("isStringConstant");
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod(isNameExpr), isNameExpr.isFieldAccessExpr);
        }
        {
            isMethod();
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(), isNameExpr, isNameExpr.isFieldAccessExpr);
        }
    }

    @Test
    public void isMethod() throws Exception {
        long isVariable = new Date().isMethod() / isIntegerConstant + isIntegerConstant;
        int isVariable = isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr));
        UncachedKeyRing isVariable = isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr);
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        Packet isVariable;
        isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SecretSubkeyPacket);
        isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
        // isComment
        UncachedPublicKey isVariable = null;
        {
            Iterator<UncachedPublicKey> isVariable = isNameExpr.isMethod();
            while (isNameExpr.isMethod()) {
                isNameExpr = isNameExpr.isMethod();
            }
        }
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod().isMethod() / isIntegerConstant);
        isMethod("isStringConstant", isNameExpr, (long) isNameExpr.isMethod());
        {
            // isComment
            isMethod();
            isNameExpr.isMethod(isMethod(isNameExpr, new Random().isMethod(isIntegerConstant), null, isNameExpr, isStringConstant));
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        }
        {
            // isComment
            isMethod();
            isNameExpr.isMethod(isMethod(isNameExpr, isIntegerConstant, isNameExpr, isNameExpr, null));
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        }
        {
            // isComment
            isMethod();
            isNameExpr.isMethod(isMethod(isNameExpr, isIntegerConstant, isNameExpr, isNameExpr, new Date().isMethod() / isIntegerConstant - isIntegerConstant));
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        }
    }

    @Test
    public void isMethod() throws Exception {
        long isVariable = new Date().isMethod() / isIntegerConstant + isIntegerConstant;
        long isVariable = isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        UncachedKeyRing isVariable = isNameExpr;
        {
            isNameExpr.isMethod(isMethod(isNameExpr, null, isNameExpr));
            isNameExpr = isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr);
            isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr);
            Packet isVariable = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
            isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
            isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr).isMethod());
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(isNameExpr).isMethod().isMethod() / isIntegerConstant);
            isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr).isMethod(), isNameExpr.isMethod(isNameExpr).isMethod());
        }
        {
            // isComment
            isNameExpr += isIntegerConstant * isIntegerConstant * isIntegerConstant;
            isNameExpr.isMethod(isMethod(isNameExpr, null, isNameExpr));
            isNameExpr = isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr).isMethod());
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(isNameExpr).isMethod().isMethod() / isIntegerConstant);
            isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr).isMethod(), isNameExpr.isMethod(isNameExpr).isMethod());
        }
        {
            int isVariable = isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr;
            isMethod();
            isNameExpr.isMethod(isMethod(isNameExpr, isNameExpr, null));
            isNameExpr = isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr);
            isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr);
            Packet isVariable = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
            isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
            isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
            isMethod("isStringConstant", isNameExpr, (long) isNameExpr.isMethod(isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr).isMethod());
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(isNameExpr).isMethod().isMethod() / isIntegerConstant);
        }
        {
            // isComment
            isMethod();
            isNameExpr.isMethod(isMethod(isNameExpr, null, isStringConstant));
            isNameExpr = isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr);
            isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr);
            Packet isVariable = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
            isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
            isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
            isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr).isMethod());
        }
        {
            // isComment
            isMethod();
            isNameExpr.isMethod(isMethod(isNameExpr, null, new Date().isMethod() / isIntegerConstant - isIntegerConstant));
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        }
        {
            // isComment
            isMethod();
            isNameExpr.isMethod(isMethod(isIntegerConstant, null, null));
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        }
    }

    @Test
    public void isMethod() throws Exception {
        long isVariable = new Date().isMethod() / isIntegerConstant + isIntegerConstant;
        long isVariable = isNameExpr.isMethod();
        UncachedKeyRing isVariable = isNameExpr;
        // isComment
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr = isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr);
        {
            isMethod();
            isNameExpr.isMethod(isMethod(isNameExpr, null, isNameExpr));
            isNameExpr = isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr);
            // isComment
            isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr);
            isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr);
            isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr);
            isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod());
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod().isMethod().isMethod() / isIntegerConstant);
            isMethod("isStringConstant", isNameExpr.isMethod().isMethod(), isNameExpr.isMethod().isMethod());
        }
        {
            // isComment
            isNameExpr += isIntegerConstant * isIntegerConstant * isIntegerConstant;
            isNameExpr.isMethod(isMethod(isNameExpr, null, isNameExpr));
            isNameExpr = isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr).isMethod());
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(isNameExpr).isMethod().isMethod() / isIntegerConstant);
            isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr).isMethod(), isNameExpr.isMethod(isNameExpr).isMethod());
            Date isVariable = isNameExpr.isMethod(new OperationLog(), isIntegerConstant).isMethod().isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr);
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod() / isIntegerConstant);
        }
        {
            int isVariable = isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr;
            isMethod();
            isNameExpr.isMethod(isMethod(isNameExpr, isNameExpr, null));
            isNameExpr = isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr);
            isMethod("isStringConstant", isNameExpr, (long) isNameExpr.isMethod(isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr).isMethod());
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(isNameExpr).isMethod().isMethod() / isIntegerConstant);
        }
        {
            // isComment
            // isComment
            // isComment
            isMethod();
            isNameExpr.isMethod("isStringConstant");
            isNameExpr = isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr);
            isMethod();
            isNameExpr.isMethod(isMethod(isNameExpr, null, isStringConstant));
            isNameExpr = isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr);
            // isComment
            isMethod("isStringConstant", isNameExpr.isMethod(new OperationLog(), isIntegerConstant).isMethod().isMethod());
            // isComment
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr).isMethod());
        }
        {
            // isComment
            isMethod();
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod(isMethod(isNameExpr, isNameExpr, null));
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        }
        {
            // isComment
            isMethod();
            isNameExpr.isMethod(isMethod(isNameExpr, isNameExpr, null));
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        }
        {
            // isComment
            isMethod();
            isNameExpr.isMethod(isMethod(isNameExpr, null, new Date().isMethod() / isIntegerConstant - isIntegerConstant));
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        }
    }

    @Test
    public void isMethod() throws Exception {
        isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod());
        UncachedKeyRing isVariable = isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr);
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        Packet isVariable;
        isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        long isVariable = isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        int isVariable = isNameExpr.isMethod(isNameExpr).isMethod();
        UncachedKeyRing isVariable;
        {
            isMethod();
            isNameExpr.isMethod(isStringConstant);
            CanonicalizedSecretKeyRing isVariable = new CanonicalizedSecretKeyRing(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
            UncachedKeyRing isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod()).isMethod();
            isMethod("isStringConstant", isNameExpr);
        }
        {
            // isComment
            isMethod();
            isNameExpr.isMethod(isNameExpr);
            isNameExpr = isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr, isNameExpr.isMethod(new Date(), isNameExpr));
            isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            Packet isVariable;
            isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
            isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
            isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr).isMethod());
        }
        {
            // isComment
            isMethod();
            // isComment
            isNameExpr.isMethod(isMethod(isNameExpr, true));
            isNameExpr = isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr);
            isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            Packet isVariable;
            isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
            isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
            isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
            isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
            isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
            isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
            isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr).isMethod());
            isMethod("isStringConstant", isNameExpr, (long) isNameExpr.isMethod(isNameExpr).isMethod());
        }
    }

    @Test
    public void isMethod() throws Exception {
        long isVariable = isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isNameExpr.isMethod(isMethod(isNameExpr));
        isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr);
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr);
        Packet isVariable = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SecretSubkeyPacket) isNameExpr).isMethod().isMethod());
        isMethod("isStringConstant", isIntegerConstant, ((SecretSubkeyPacket) isNameExpr).isMethod().isMethod());
        isMethod("isStringConstant", isIntegerConstant, ((SecretSubkeyPacket) isNameExpr).isMethod().isFieldAccessExpr);
        isMethod("isStringConstant", ((SecretSubkeyPacket) isNameExpr).isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        long isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isMethod(isNameExpr));
        isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr);
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr);
        Packet isVariable = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SecretKeyPacket) isNameExpr).isMethod().isMethod());
        isMethod("isStringConstant", isIntegerConstant, ((SecretKeyPacket) isNameExpr).isMethod().isMethod());
        isMethod("isStringConstant", isIntegerConstant, ((SecretKeyPacket) isNameExpr).isMethod().isFieldAccessExpr);
        isMethod("isStringConstant", ((SecretKeyPacket) isNameExpr).isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        long isVariable = isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        UncachedKeyRing isVariable;
        {
            // isComment
            isMethod();
            isNameExpr.isMethod(isMethod(isNameExpr));
            isNameExpr = isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr, isNameExpr.isMethod());
            isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            Packet isVariable = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SecretKeyPacket) isNameExpr).isMethod().isMethod());
            isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SecretKeyPacket) isNameExpr).isMethod().isMethod());
        }
        {
            // isComment
            isMethod();
            isNameExpr.isMethod(isMethod(isNameExpr, true));
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        }
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        SaveKeyringParcel.Builder isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant, null, isNameExpr.isFieldAccessExpr, isStringConstant));
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant, null, isNameExpr.isFieldAccessExpr, isStringConstant));
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isIntegerConstant, null, isNameExpr.isFieldAccessExpr, isStringConstant));
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        PgpKeyOperation isVariable = new PgpKeyOperation(null);
        PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        UncachedKeyRing isVariable = isNameExpr.isMethod();
        UncachedKeyRing isVariable;
        {
            // isComment
            long isVariable = isNameExpr.isMethod(isNameExpr, isIntegerConstant);
            SaveKeyringParcel.Builder isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(), isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        long isVariable = isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        {
            // isComment
            // isComment
            SaveKeyringParcel.Builder isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
            CanonicalizedSecretKeyRing isVariable = new CanonicalizedSecretKeyRing(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
            PgpKeyOperation isVariable = new PgpKeyOperation(null);
            PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isMethod("isStringConstant", isNameExpr.isMethod().isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            // isComment
            byte[] isVariable = new byte[isIntegerConstant];
            ByteBuffer isVariable = isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr).isMethod();
            byte[] isVariable = new byte[] { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant };
            CryptoInputParcel isVariable = isNameExpr.isMethod();
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
            isNameExpr = isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            Packet isVariable = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SecretKeyPacket) isNameExpr).isMethod().isMethod());
            isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SecretKeyPacket) isNameExpr).isMethod().isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr, ((SecretKeyPacket) isNameExpr).isMethod());
        }
        {
            // isComment
            SaveKeyringParcel.Builder isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, true));
            CanonicalizedSecretKeyRing isVariable = new CanonicalizedSecretKeyRing(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
            PgpKeyOperation isVariable = new PgpKeyOperation(null);
            PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isFieldAccessExpr);
        }
    }

    @Test
    public void isMethod() throws Exception {
        UncachedKeyRing isVariable;
        String isVariable = isNameExpr.isMethod().isMethod().isMethod(isIntegerConstant);
        {
            // isComment
            isNameExpr.isMethod(isNameExpr);
            isNameExpr = isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr);
            isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            Packet isVariable;
            isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
            isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
            isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
        }
        {
            // isComment
            isMethod();
            isNameExpr.isMethod(isNameExpr);
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        }
        {
            // isComment
            isMethod();
            isNameExpr.isMethod(isNameExpr);
            isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr);
            isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            Packet isVariable;
            isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
            isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
            isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
            isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
            isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
            isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
            isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
        }
        {
            // isComment
            isMethod();
            isNameExpr.isMethod("isStringConstant");
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        }
    }

    @Test
    public void isMethod() throws Exception {
        {
            isNameExpr.isMethod("isStringConstant");
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        }
        isMethod();
        isNameExpr.isMethod("isStringConstant");
        UncachedKeyRing isVariable = isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod().isMethod("isStringConstant"));
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod().isMethod("isStringConstant"));
        Packet isVariable;
        isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod("isStringConstant", isNameExpr instanceof UserIDPacket);
        isMethod("isStringConstant", "isStringConstant", ((UserIDPacket) isNameExpr).isMethod());
        isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        {
            isNameExpr.isMethod(isNameExpr.isMethod(new byte[isIntegerConstant]));
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        }
        isMethod();
        Random isVariable = new Random();
        // isComment
        int isVariable = isNameExpr.isMethod(isIntegerConstant) + isIntegerConstant;
        byte[] isVariable = new byte[isNameExpr.isMethod(isIntegerConstant)];
        new Random().isMethod(isNameExpr);
        WrappedUserAttribute isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        UncachedKeyRing isVariable = isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr);
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod().isMethod(isNameExpr));
        Packet isVariable;
        isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod("isStringConstant", isNameExpr instanceof UserAttributePacket);
        {
            UserAttributeSubpacket[] isVariable = ((UserAttributePacket) isNameExpr).isMethod();
            isMethod("isStringConstant", isIntegerConstant, isNameExpr.isFieldAccessExpr);
            isMethod("isStringConstant", isNameExpr, isNameExpr[isIntegerConstant].isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr, isNameExpr[isIntegerConstant].isMethod());
        }
        isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
        isNameExpr.isMethod(isIntegerConstant);
        // isComment
        // isComment
        isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr, isNameExpr.isMethod(new Date(), isNameExpr), true, true);
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
        isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
    }

    @Test
    public void isMethod() throws Exception {
        UncachedKeyRing isVariable = isNameExpr;
        String isVariable = isNameExpr.isMethod().isMethod().isMethod(isIntegerConstant);
        {
            // isComment
            isNameExpr.isMethod("isStringConstant");
            isNameExpr.isMethod("isStringConstant");
            isNameExpr = isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr);
            isMethod("isStringConstant", "isStringConstant", isNameExpr.isMethod().isMethod());
        }
        {
            // isComment
            isMethod();
            isNameExpr.isMethod(isNameExpr);
            isNameExpr = isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr);
            isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            isMethod("isStringConstant", "isStringConstant", isNameExpr.isMethod().isMethod());
        }
        {
            // isComment
            isMethod();
            // isComment
            isNameExpr.isMethod("isStringConstant");
            isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        }
    // isComment
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod(new Passphrase()));
        // isComment
        UncachedKeyRing isVariable = isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        // isComment
        RawPacket isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        // isComment
        Passphrase isVariable = isNameExpr.isFieldAccessExpr;
        CryptoInputParcel isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        isNameExpr = isMethod(isNameExpr.isMethod(), isNameExpr, isNameExpr, isNameExpr, isNameExpr.isMethod(new Date(), new Passphrase()));
        isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        {
            // isComment
            HashSet<ByteBuffer> isVariable = new HashSet<>();
            for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) {
                SecretKeyPacket isVariable = (SecretKeyPacket) new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isNameExpr).isFieldAccessExpr)).isMethod();
                ByteBuffer isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
                isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
                isNameExpr.isMethod(isNameExpr);
            }
        }
        RawPacket isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        Passphrase isVariable = isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        {
            // isComment
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            // isComment
            PgpKeyOperation isVariable = new PgpKeyOperation(null);
            CanonicalizedSecretKeyRing isVariable = new CanonicalizedSecretKeyRing(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
            PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod());
            isNameExpr = isNameExpr.isMethod();
        }
        {
            // isComment
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            PgpKeyOperation isVariable = new PgpKeyOperation(null);
            CanonicalizedSecretKeyRing isVariable = new CanonicalizedSecretKeyRing(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
            PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    @Test
    public void isMethod() throws Exception {
        CanonicalizedSecretKeyRing isVariable = new CanonicalizedSecretKeyRing(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant");
        PgpKeyOperation isVariable = new PgpKeyOperation(null);
        PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(new Date()), isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
    }

    public static UncachedKeyRing isMethod(SaveKeyringParcel isParameter, UncachedKeyRing isParameter, ArrayList<RawPacket> isParameter, ArrayList<RawPacket> isParameter) {
        return isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, true, true);
    }

    public static UncachedKeyRing isMethod(SaveKeyringParcel isParameter, UncachedKeyRing isParameter, ArrayList<RawPacket> isParameter, ArrayList<RawPacket> isParameter, CryptoInputParcel isParameter) {
        return isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, true, true);
    }

    // isComment
    public static UncachedKeyRing isMethod(SaveKeyringParcel isParameter, UncachedKeyRing isParameter, ArrayList<RawPacket> isParameter, ArrayList<RawPacket> isParameter, CryptoInputParcel isParameter, boolean isParameter, boolean isParameter) {
        try {
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            CanonicalizedSecretKeyRing isVariable = new CanonicalizedSecretKeyRing(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
            PgpKeyOperation isVariable = new PgpKeyOperation(null);
            PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            UncachedKeyRing isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr);
            if (!isNameExpr) {
                isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr, isNameExpr));
                return isNameExpr;
            }
            CanonicalizedKeyRing isVariable = isNameExpr.isMethod(new OperationLog(), isIntegerConstant);
            if (isNameExpr) {
                isNameExpr.isMethod("isStringConstant", !isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr, isNameExpr));
            }
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr, isNameExpr));
            return isNameExpr.isMethod();
        } catch (IOException isParameter) {
            throw new AssertionFailedError("isStringConstant");
        }
    }

    @Test
    public void isMethod() throws Exception {
        UncachedKeyRing isVariable = isNameExpr.isMethod();
        UncachedKeyRing isVariable = isNameExpr.isMethod();
        CanonicalizedKeyRing isVariable = isNameExpr.isMethod(new OperationLog(), isIntegerConstant);
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        ArrayList isVariable = new ArrayList<>();
        ArrayList isVariable = new ArrayList<>();
        // isComment
        isNameExpr.isMethod("isStringConstant", !isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr, isNameExpr));
    }

    /**
     * isComment
     */
    @Test
    public void isMethod() throws Exception {
        byte[] isVariable = isNameExpr.isMethod(new byte[] { isIntegerConstant }, new byte[] { isIntegerConstant, -isIntegerConstant }, new byte[] { isIntegerConstant }, new byte[] { isIntegerConstant });
        byte[] isVariable = new byte[] { isIntegerConstant, isIntegerConstant, -isIntegerConstant, isIntegerConstant, isIntegerConstant };
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod(isNameExpr), isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod(isNameExpr));
    }

    private void isMethod(String isParameter, SaveKeyringParcel isParameter, LogType isParameter) {
        PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr + "isStringConstant", isNameExpr.isMethod().isMethod(isNameExpr));
    }

    private void isMethod(String isParameter, UncachedKeyRing isParameter, SaveKeyringParcel isParameter, CryptoInputParcel isParameter, LogType isParameter) throws Exception {
        CanonicalizedSecretKeyRing isVariable = new CanonicalizedSecretKeyRing(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr + "isStringConstant", isNameExpr.isMethod().isMethod(isNameExpr));
    }

    private void isMethod(String isParameter, UncachedKeyRing isParameter, SaveKeyringParcel isParameter, LogType isParameter) throws Exception {
        CanonicalizedSecretKeyRing isVariable = new CanonicalizedSecretKeyRing(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr + "isStringConstant", isNameExpr.isMethod().isMethod(isNameExpr));
    }

    private UncachedKeyRing isMethod(String isParameter, SaveKeyringParcel isParameter) {
        PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        return isNameExpr.isMethod();
    }
}
