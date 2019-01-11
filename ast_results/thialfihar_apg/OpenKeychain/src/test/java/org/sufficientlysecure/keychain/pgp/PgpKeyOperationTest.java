// isComment
package org.sufficientlysecure.keychain.pgp;

import junit.framework.AssertionFailedError;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.robolectric.*;
import org.robolectric.annotation.Config;
import org.robolectric.shadows.ShadowLog;
import org.spongycastle.bcpg.BCPGInputStream;
import org.spongycastle.bcpg.Packet;
import org.spongycastle.bcpg.PacketTags;
import org.spongycastle.bcpg.S2K;
import org.spongycastle.bcpg.SecretKeyPacket;
import org.spongycastle.bcpg.SecretSubkeyPacket;
import org.spongycastle.bcpg.SignaturePacket;
import org.spongycastle.bcpg.UserAttributePacket;
import org.spongycastle.bcpg.UserAttributeSubpacket;
import org.spongycastle.bcpg.UserIDPacket;
import org.spongycastle.bcpg.sig.KeyFlags;
import org.spongycastle.jce.provider.BouncyCastleProvider;
import org.spongycastle.openpgp.PGPSignature;
import org.sufficientlysecure.keychain.BuildConfig;
import org.sufficientlysecure.keychain.WorkaroundBuildConfig;
import org.sufficientlysecure.keychain.operations.results.OperationResult.LogType;
import org.sufficientlysecure.keychain.operations.results.OperationResult.OperationLog;
import org.sufficientlysecure.keychain.operations.results.PgpEditKeyResult;
import org.sufficientlysecure.keychain.pgp.CanonicalizedSecretKey.SecretKeyType;
import org.sufficientlysecure.keychain.service.SaveKeyringParcel;
import org.sufficientlysecure.keychain.service.SaveKeyringParcel.Algorithm;
import org.sufficientlysecure.keychain.service.SaveKeyringParcel.ChangeUnlockParcel;
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
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.Security;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

@RunWith(RobolectricGradleTestRunner.class)
@Config(constants = WorkaroundBuildConfig.class, sdk = isIntegerConstant, manifest = "isStringConstant")
public class isClassOrIsInterface {

    static UncachedKeyRing isVariable;

    static final Passphrase isVariable = isNameExpr.isMethod();

    UncachedKeyRing isVariable;

    PgpKeyOperation isVariable;

    SaveKeyringParcel isVariable;

    ArrayList<RawPacket> isVariable = new ArrayList<RawPacket>();

    ArrayList<RawPacket> isVariable = new ArrayList<RawPacket>();

    static CryptoInputParcel isVariable;

    @BeforeClass
    public static void isMethod() throws Exception {
        isNameExpr.isMethod(new BouncyCastleProvider(), isIntegerConstant);
        isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
        SaveKeyringParcel isVariable = new SaveKeyringParcel();
        isNameExpr.isFieldAccessExpr.isMethod(new SaveKeyringParcel.SubkeyAdd(isNameExpr.isFieldAccessExpr, isIntegerConstant, null, isNameExpr.isFieldAccessExpr, isStringConstant));
        isNameExpr.isFieldAccessExpr.isMethod(new SaveKeyringParcel.SubkeyAdd(isNameExpr.isFieldAccessExpr, isIntegerConstant, null, isNameExpr.isFieldAccessExpr, isStringConstant));
        isNameExpr.isFieldAccessExpr.isMethod(new SaveKeyringParcel.SubkeyAdd(isNameExpr.isFieldAccessExpr, isIntegerConstant, null, isNameExpr.isFieldAccessExpr, isStringConstant));
        isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
        {
            int isVariable = isIntegerConstant;
            byte[] isVariable = new byte[] { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant };
            WrappedUserAttribute isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        }
        isNameExpr.isFieldAccessExpr = new ChangeUnlockParcel(isNameExpr);
        PgpKeyOperation isVariable = new PgpKeyOperation(null);
        PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod(new OperationLog(), isIntegerConstant).isMethod();
        // isComment
        isNameExpr.isMethod(isIntegerConstant);
        isNameExpr = new CryptoInputParcel(new Date(), isNameExpr);
    }

    @Before
    public void isMethod() throws Exception {
        // isComment
        isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
        isNameExpr = isNameExpr;
        // isComment
        isNameExpr = new PgpKeyOperation(new ProgressScaler(null, isIntegerConstant, isIntegerConstant, isIntegerConstant));
        // isComment
        isNameExpr = new SaveKeyringParcel();
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod();
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod();
    }

    @Test
    public void isMethod() {
        {
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(new SaveKeyringParcel.SubkeyAdd(isNameExpr.isFieldAccessExpr, new Random().isMethod(isIntegerConstant) + isIntegerConstant, null, isNameExpr.isFieldAccessExpr, isStringConstant));
            isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
            isNameExpr.isFieldAccessExpr = new ChangeUnlockParcel(isNameExpr);
            isMethod("isStringConstant", isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        {
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(new SaveKeyringParcel.SubkeyAdd(isNameExpr.isFieldAccessExpr, isIntegerConstant, null, isNameExpr.isFieldAccessExpr, isStringConstant));
            isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
            isNameExpr.isFieldAccessExpr = new ChangeUnlockParcel(isNameExpr);
            isMethod("isStringConstant", isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        {
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(new SaveKeyringParcel.SubkeyAdd(isNameExpr.isFieldAccessExpr, isIntegerConstant, null, isNameExpr.isFieldAccessExpr, null));
            isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
            isNameExpr.isFieldAccessExpr = new ChangeUnlockParcel(isNameExpr);
            isMethod("isStringConstant", isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        {
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(new SaveKeyringParcel.SubkeyAdd(isNameExpr.isFieldAccessExpr, isIntegerConstant, null, isNameExpr.isFieldAccessExpr, isStringConstant));
            isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
            isNameExpr.isFieldAccessExpr = new ChangeUnlockParcel(isNameExpr);
            isMethod("isStringConstant", isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        {
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(new SaveKeyringParcel.SubkeyAdd(isNameExpr.isFieldAccessExpr, isIntegerConstant, null, isNameExpr.isFieldAccessExpr, isStringConstant));
            isNameExpr.isFieldAccessExpr = new ChangeUnlockParcel(isNameExpr);
            isMethod("isStringConstant", isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        {
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
            isNameExpr.isFieldAccessExpr = new ChangeUnlockParcel(isNameExpr);
            isMethod("isStringConstant", isNameExpr, isNameExpr.isFieldAccessExpr);
        }
    }

    @Test
    public // isComment
    void isMethod() throws Exception {
        SaveKeyringParcel isVariable = new SaveKeyringParcel();
        isNameExpr.isFieldAccessExpr.isMethod(new SaveKeyringParcel.SubkeyAdd(isNameExpr.isFieldAccessExpr, isIntegerConstant, null, isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr, isStringConstant));
        isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
        isNameExpr = isMethod("isStringConstant", isNameExpr);
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod(isNameExpr.isMethod()).isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr, (long) isNameExpr.isMethod().isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        // isComment
        // isComment
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod().isMethod().isMethod());
        ArrayList<WrappedUserAttribute> isVariable = isNameExpr.isMethod().isMethod();
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod(isIntegerConstant).isMethod().isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", new byte[] { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant }, isNameExpr.isMethod(isIntegerConstant).isMethod()[isIntegerConstant]);
        List<UncachedPublicKey> isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod().isMethod(new Date(new Date().isMethod() - isIntegerConstant * isIntegerConstant)));
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, (long) isNameExpr.isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, (long) isNameExpr.isMethod(isIntegerConstant).isMethod());
        ArrayList<WrappedSignature> isVariable = isNameExpr.isMethod(isIntegerConstant).isMethod().isMethod().isMethod();
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod(), isNameExpr.isMethod(isIntegerConstant).isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, (long) isNameExpr.isMethod(isIntegerConstant).isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        {
            SaveKeyringParcel isVariable = new SaveKeyringParcel();
            // isComment
            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod() - isIntegerConstant;
            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod();
            isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        {
            SaveKeyringParcel isVariable = new SaveKeyringParcel();
            // isComment
            isNameExpr.isFieldAccessExpr = null;
            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod();
            isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        {
            SaveKeyringParcel isVariable = new SaveKeyringParcel();
            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod();
            // isComment
            isNameExpr.isFieldAccessExpr[isIntegerConstant] += isIntegerConstant;
            isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        {
            SaveKeyringParcel isVariable = new SaveKeyringParcel();
            isNameExpr.isFieldAccessExpr = isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr = null;
            isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        {
            Passphrase isVariable = new Passphrase();
            if (isNameExpr.isMethod(isNameExpr)) {
                isNameExpr = new Passphrase("isStringConstant");
            }
            isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
            isMethod("isStringConstant", isNameExpr, isNameExpr, new CryptoInputParcel(isNameExpr), isNameExpr.isFieldAccessExpr);
        }
        {
            isNameExpr.isMethod();
            isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
        }
    }

    @Test
    public void isMethod() throws Exception {
        long isVariable = new Date().isMethod() / isIntegerConstant + isIntegerConstant;
        int isVariable = isNameExpr.isFieldAccessExpr;
        int isVariable = isIntegerConstant + new Random().isMethod(isIntegerConstant);
        isNameExpr.isFieldAccessExpr.isMethod(new SubkeyAdd(isNameExpr.isFieldAccessExpr, isNameExpr, null, isNameExpr, isNameExpr));
        UncachedKeyRing isVariable = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        Packet isVariable;
        isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SecretSubkeyPacket);
        isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
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
        isNameExpr.isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod().isMethod() / isIntegerConstant);
        isNameExpr.isMethod("isStringConstant", isNameExpr, (long) isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr, (int) isNameExpr.isMethod());
        {
            // isComment
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(new SubkeyAdd(isNameExpr.isFieldAccessExpr, new Random().isMethod(isIntegerConstant), null, isNameExpr.isFieldAccessExpr, isStringConstant));
            isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        {
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(new SaveKeyringParcel.SubkeyAdd(isNameExpr.isFieldAccessExpr, isIntegerConstant, null, isNameExpr.isFieldAccessExpr, null));
            isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        {
            // isComment
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(new SubkeyAdd(isNameExpr.isFieldAccessExpr, isIntegerConstant, null, isNameExpr.isFieldAccessExpr, new Date().isMethod() / isIntegerConstant - isIntegerConstant));
            isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
        }
    }

    @Test
    public void isMethod() throws Exception {
        long isVariable = new Date().isMethod() / isIntegerConstant + isIntegerConstant;
        long isVariable = isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        UncachedKeyRing isVariable = isNameExpr;
        {
            isNameExpr.isFieldAccessExpr.isMethod(new SubkeyChange(isNameExpr, null, isNameExpr));
            isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr);
            Packet isVariable = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(isNameExpr).isMethod().isMethod() / isIntegerConstant);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr).isMethod(), isNameExpr.isMethod(isNameExpr).isMethod());
        }
        {
            // isComment
            isNameExpr += isIntegerConstant * isIntegerConstant * isIntegerConstant;
            isNameExpr.isFieldAccessExpr.isMethod(new SubkeyChange(isNameExpr, null, isNameExpr));
            isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(isNameExpr).isMethod().isMethod() / isIntegerConstant);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr).isMethod(), isNameExpr.isMethod(isNameExpr).isMethod());
        }
        {
            int isVariable = isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr;
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(new SubkeyChange(isNameExpr, isNameExpr, null));
            isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr);
            Packet isVariable = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr, (long) isNameExpr.isMethod(isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(isNameExpr).isMethod().isMethod() / isIntegerConstant);
        }
        {
            // isComment
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(new SubkeyChange(isNameExpr, null, isStringConstant));
            isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr);
            Packet isVariable = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr).isMethod());
        }
        {
            // isComment
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(new SubkeyChange(isNameExpr, null, new Date().isMethod() / isIntegerConstant - isIntegerConstant));
            isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        {
            // isComment
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(new SubkeyChange(isIntegerConstant, null, null));
            isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
        }
    }

    @Test
    public void isMethod() throws Exception {
        long isVariable = new Date().isMethod() / isIntegerConstant + isIntegerConstant;
        long isVariable = isNameExpr.isMethod();
        UncachedKeyRing isVariable = isNameExpr;
        // isComment
        isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
        isNameExpr.isFieldAccessExpr = "isStringConstant";
        isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
        isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        {
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(new SubkeyChange(isNameExpr, null, isNameExpr));
            isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            // isComment
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod().isMethod().isMethod() / isIntegerConstant);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod(), isNameExpr.isMethod().isMethod());
        }
        {
            // isComment
            isNameExpr += isIntegerConstant * isIntegerConstant * isIntegerConstant;
            isNameExpr.isFieldAccessExpr.isMethod(new SubkeyChange(isNameExpr, null, isNameExpr));
            isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(isNameExpr).isMethod().isMethod() / isIntegerConstant);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr).isMethod(), isNameExpr.isMethod(isNameExpr).isMethod());
            Date isVariable = isNameExpr.isMethod(new OperationLog(), isIntegerConstant).isMethod().isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod() / isIntegerConstant);
        }
        {
            int isVariable = isNameExpr.isFieldAccessExpr | isNameExpr.isFieldAccessExpr;
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(new SubkeyChange(isNameExpr, isNameExpr, null));
            isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr, (long) isNameExpr.isMethod(isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod(isNameExpr).isMethod().isMethod() / isIntegerConstant);
        }
        {
            // isComment
            // isComment
            // isComment
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
            isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(new SubkeyChange(isNameExpr, null, isStringConstant));
            isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            // isComment
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(new OperationLog(), isIntegerConstant).isMethod().isMethod());
            // isComment
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr).isMethod());
        }
        {
            // isComment
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
            isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
            isNameExpr.isFieldAccessExpr.isMethod(new SubkeyChange(isNameExpr, isNameExpr.isFieldAccessExpr, null));
            isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        {
            // isComment
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(new SubkeyChange(isNameExpr, isNameExpr.isFieldAccessExpr, null));
            isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        {
            // isComment
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(new SubkeyChange(isNameExpr, null, new Date().isMethod() / isIntegerConstant - isIntegerConstant));
            isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
        }
    }

    @Test
    public void isMethod() throws Exception {
        isNameExpr.isMethod();
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod());
        UncachedKeyRing isVariable = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        Packet isVariable;
        isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        long isVariable = isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        int isVariable = isNameExpr.isMethod(isNameExpr).isMethod();
        UncachedKeyRing isVariable;
        {
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(isStringConstant);
            CanonicalizedSecretKeyRing isVariable = new CanonicalizedSecretKeyRing(isNameExpr.isMethod(), true, isIntegerConstant);
            UncachedKeyRing isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr);
        }
        {
            // isComment
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, new CryptoInputParcel(new Date(), isNameExpr));
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            Packet isVariable;
            isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr).isMethod());
        }
        {
            // isComment
            isNameExpr.isMethod();
            // isComment
            isNameExpr.isFieldAccessExpr.isMethod(new SubkeyChange(isNameExpr, true));
            isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            Packet isVariable;
            isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr, (long) isNameExpr.isMethod(isNameExpr).isMethod());
        }
    }

    @Test
    public void isMethod() throws Exception {
        long isVariable = isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        isNameExpr.isFieldAccessExpr.isMethod(new SubkeyChange(isNameExpr, true, true));
        isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr);
        Packet isVariable = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SecretSubkeyPacket) isNameExpr).isMethod().isMethod());
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, ((SecretSubkeyPacket) isNameExpr).isMethod().isMethod());
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, ((SecretSubkeyPacket) isNameExpr).isMethod().isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", ((SecretSubkeyPacket) isNameExpr).isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        long isVariable = isNameExpr.isMethod();
        isNameExpr.isFieldAccessExpr.isMethod(new SubkeyChange(isNameExpr, true, true));
        isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr);
        Packet isVariable = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SecretKeyPacket) isNameExpr).isMethod().isMethod());
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, ((SecretKeyPacket) isNameExpr).isMethod().isMethod());
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, ((SecretKeyPacket) isNameExpr).isMethod().isFieldAccessExpr);
        isNameExpr.isMethod("isStringConstant", ((SecretKeyPacket) isNameExpr).isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        long isVariable = isNameExpr.isMethod(isNameExpr, isIntegerConstant);
        UncachedKeyRing isVariable;
        {
            // isComment
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(new SubkeyChange(isNameExpr, true, true));
            isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, new CryptoInputParcel());
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            Packet isVariable = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SecretKeyPacket) isNameExpr).isMethod().isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SecretKeyPacket) isNameExpr).isMethod().isMethod());
        }
    }

    @Test
    public void isMethod() throws Exception {
        UncachedKeyRing isVariable;
        {
            // isComment
            long isVariable = isNameExpr.isMethod(isNameExpr, isIntegerConstant);
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(new SubkeyChange(isNameExpr, true, true));
            isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        {
            // isComment
            long isVariable = isNameExpr.isMethod(isNameExpr, isIntegerConstant);
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(new SubkeyChange(isNameExpr, true, true));
            isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        {
            // isComment
            // isComment
            long isVariable = isNameExpr.isMethod(isNameExpr, isIntegerConstant);
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(new SubkeyChange(isNameExpr, true, true));
            CanonicalizedSecretKeyRing isVariable = new CanonicalizedSecretKeyRing(isNameExpr.isMethod(), true, isIntegerConstant);
            PgpKeyOperation isVariable = new PgpKeyOperation(null);
            PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            // isComment
            byte[] isVariable = new byte[isIntegerConstant];
            ByteBuffer isVariable = isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr).isMethod();
            byte[] isVariable = new byte[] { isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant };
            CryptoInputParcel isVariable = new CryptoInputParcel();
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            Packet isVariable = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SecretKeyPacket) isNameExpr).isMethod().isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SecretKeyPacket) isNameExpr).isMethod().isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr, ((SecretKeyPacket) isNameExpr).isMethod());
        }
    }

    @Test
    public void isMethod() throws Exception {
        UncachedKeyRing isVariable;
        String isVariable = isNameExpr.isMethod().isMethod().isMethod(isIntegerConstant);
        {
            // isComment
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            Packet isVariable;
            isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
        }
        {
            // isComment
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr = isNameExpr;
            isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        {
            // isComment
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
            isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            Packet isVariable;
            isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
            isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(), ((SignaturePacket) isNameExpr).isMethod());
        }
        {
            // isComment
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
            isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
        }
    }

    @Test
    public void isMethod() throws Exception {
        {
            isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
            isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        isNameExpr.isMethod();
        isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
        UncachedKeyRing isVariable = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod().isMethod("isStringConstant"));
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod().isMethod("isStringConstant"));
        Packet isVariable;
        isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod("isStringConstant", isNameExpr instanceof UserIDPacket);
        isNameExpr.isMethod("isStringConstant", "isStringConstant", ((UserIDPacket) isNameExpr).isMethod());
        isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        {
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(new byte[isIntegerConstant]));
            isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
        }
        isNameExpr.isMethod();
        Random isVariable = new Random();
        // isComment
        int isVariable = isNameExpr.isMethod(isIntegerConstant) + isIntegerConstant;
        byte[] isVariable = new byte[isNameExpr.isMethod(isIntegerConstant)];
        new Random().isMethod(isNameExpr);
        WrappedUserAttribute isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        UncachedKeyRing isVariable = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod().isMethod(isNameExpr));
        Packet isVariable;
        isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod("isStringConstant", isNameExpr instanceof UserAttributePacket);
        {
            UserAttributeSubpacket[] isVariable = ((UserAttributePacket) isNameExpr).isMethod();
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr, isNameExpr[isIntegerConstant].isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr, isNameExpr[isIntegerConstant].isMethod());
        }
        isNameExpr = new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isIntegerConstant).isFieldAccessExpr)).isMethod();
        isNameExpr.isMethod("isStringConstant", isNameExpr instanceof SignaturePacket);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, ((SignaturePacket) isNameExpr).isMethod());
        isNameExpr.isMethod(isIntegerConstant);
        // isComment
        // isComment
        isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, new CryptoInputParcel(new Date(), isNameExpr), true, true);
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
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
            isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
            isNameExpr.isFieldAccessExpr = "isStringConstant";
            isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", "isStringConstant", isNameExpr.isMethod().isMethod());
        }
        {
            // isComment
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr = isNameExpr;
            isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", "isStringConstant", isNameExpr.isMethod().isMethod());
        }
        {
            // isComment
            isNameExpr.isMethod();
            // isComment
            isNameExpr.isFieldAccessExpr = "isStringConstant";
            if (isNameExpr.isFieldAccessExpr.isMethod(isNameExpr)) {
                isNameExpr.isFieldAccessExpr += "isStringConstant";
            }
            isMethod("isStringConstant", isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
        }
    // isComment
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        isNameExpr.isFieldAccessExpr = new ChangeUnlockParcel(new Passphrase());
        // isComment
        UncachedKeyRing isVariable = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        // isComment
        RawPacket isVariable = isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        // isComment
        Passphrase isVariable = isNameExpr.isMethod(true);
        CryptoInputParcel isVariable = new CryptoInputParcel(isNameExpr);
        isNameExpr.isFieldAccessExpr = new ChangeUnlockParcel(isNameExpr);
        isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, new CryptoInputParcel(new Date(), new Passphrase()));
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        {
            // isComment
            HashSet<ByteBuffer> isVariable = new HashSet<ByteBuffer>();
            for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) {
                SecretKeyPacket isVariable = (SecretKeyPacket) new BCPGInputStream(new ByteArrayInputStream(isNameExpr.isMethod(isNameExpr).isFieldAccessExpr)).isMethod();
                ByteBuffer isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
                isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr));
                isNameExpr.isMethod(isNameExpr);
            }
        }
        RawPacket isVariable = isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        Passphrase isVariable = isNameExpr.isMethod(true);
        isNameExpr.isFieldAccessExpr = new ChangeUnlockParcel(isNameExpr);
        {
            // isComment
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            // isComment
            PgpKeyOperation isVariable = new PgpKeyOperation(null);
            CanonicalizedSecretKeyRing isVariable = new CanonicalizedSecretKeyRing(isNameExpr.isMethod(), true, isIntegerConstant);
            PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr));
            isNameExpr = isNameExpr.isMethod();
        }
        {
            // isComment
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
            PgpKeyOperation isVariable = new PgpKeyOperation(null);
            CanonicalizedSecretKeyRing isVariable = new CanonicalizedSecretKeyRing(isNameExpr.isMethod(), true, isIntegerConstant);
            PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr, new CryptoInputParcel(isNameExpr), isNameExpr);
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr));
        }
    }

    @Test
    public void isMethod() throws Exception {
        Passphrase isVariable = new Passphrase("isStringConstant");
        // isComment
        isNameExpr.isFieldAccessExpr = new ChangeUnlockParcel(null, isNameExpr);
        UncachedKeyRing isVariable = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        RawPacket isVariable = isNameExpr.isMethod(isIntegerConstant);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        // isComment
        CanonicalizedSecretKeyRing isVariable = new CanonicalizedSecretKeyRing(isNameExpr.isMethod(), true, isIntegerConstant);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
        // isComment
        isNameExpr.isMethod(isIntegerConstant);
        {
            isNameExpr.isFieldAccessExpr = new ChangeUnlockParcel(new Passphrase("isStringConstant"), null);
            isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, new CryptoInputParcel(isNameExpr), true, true);
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
            isNameExpr.isMethod("isStringConstant", isIntegerConstant, isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() throws Exception {
        CanonicalizedSecretKeyRing isVariable = new CanonicalizedSecretKeyRing(isNameExpr.isMethod(), true, isIntegerConstant);
        isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
        PgpKeyOperation isVariable = new PgpKeyOperation(null);
        PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr, new CryptoInputParcel(new Date()), isNameExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
    }

    private static UncachedKeyRing isMethod(SaveKeyringParcel isParameter, UncachedKeyRing isParameter, ArrayList<RawPacket> isParameter, ArrayList<RawPacket> isParameter) {
        return isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, true, true);
    }

    private static UncachedKeyRing isMethod(SaveKeyringParcel isParameter, UncachedKeyRing isParameter, ArrayList<RawPacket> isParameter, ArrayList<RawPacket> isParameter, CryptoInputParcel isParameter) {
        return isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, true, true);
    }

    // isComment
    private static UncachedKeyRing isMethod(SaveKeyringParcel isParameter, UncachedKeyRing isParameter, ArrayList<RawPacket> isParameter, ArrayList<RawPacket> isParameter, CryptoInputParcel isParameter, boolean isParameter, boolean isParameter) {
        try {
            isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod());
            CanonicalizedSecretKeyRing isVariable = new CanonicalizedSecretKeyRing(isNameExpr.isMethod(), true, isIntegerConstant);
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
        ArrayList isVariable = new ArrayList<RawPacket>();
        ArrayList isVariable = new ArrayList<RawPacket>();
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
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod(isNameExpr), isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod(isNameExpr));
    }

    private void isMethod(String isParameter, SaveKeyringParcel isParameter, LogType isParameter) {
        PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr + "isStringConstant", isNameExpr.isMethod().isMethod(isNameExpr));
    }

    private void isMethod(String isParameter, UncachedKeyRing isParameter, SaveKeyringParcel isParameter, CryptoInputParcel isParameter, LogType isParameter) throws Exception {
        CanonicalizedSecretKeyRing isVariable = new CanonicalizedSecretKeyRing(isNameExpr.isMethod(), true, isIntegerConstant);
        PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr + "isStringConstant", isNameExpr.isMethod().isMethod(isNameExpr));
    }

    private void isMethod(String isParameter, UncachedKeyRing isParameter, SaveKeyringParcel isParameter, LogType isParameter) throws Exception {
        CanonicalizedSecretKeyRing isVariable = new CanonicalizedSecretKeyRing(isNameExpr.isMethod(), true, isIntegerConstant);
        PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr + "isStringConstant", isNameExpr.isMethod().isMethod(isNameExpr));
    }

    private UncachedKeyRing isMethod(String isParameter, SaveKeyringParcel isParameter) {
        PgpEditKeyResult isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        return isNameExpr.isMethod();
    }
}
