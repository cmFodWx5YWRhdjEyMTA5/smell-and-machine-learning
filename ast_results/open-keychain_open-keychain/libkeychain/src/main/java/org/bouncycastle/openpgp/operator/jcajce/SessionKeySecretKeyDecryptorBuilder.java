// isComment
package org.bouncycastle.openpgp.operator.jcajce;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Provider;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import org.bouncycastle.bcpg.S2K;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.NamedJcaJceHelper;
import org.bouncycastle.jcajce.util.ProviderJcaJceHelper;
import org.bouncycastle.openpgp.PGPException;
import org.bouncycastle.openpgp.operator.PBESecretKeyDecryptor;
import org.bouncycastle.openpgp.operator.PGPDigestCalculatorProvider;

/**
 * isComment
 */
public class isClassOrIsInterface {

    private OperatorHelper isVariable = new OperatorHelper(new DefaultJcaJceHelper());

    private PGPDigestCalculatorProvider isVariable;

    private JcaPGPDigestCalculatorProviderBuilder isVariable;

    public isConstructor() {
        this.isFieldAccessExpr = new JcaPGPDigestCalculatorProviderBuilder();
    }

    public isConstructor(PGPDigestCalculatorProvider isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    public SessionKeySecretKeyDecryptorBuilder isMethod(Provider isParameter) {
        this.isFieldAccessExpr = new OperatorHelper(new ProviderJcaJceHelper(isNameExpr));
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        return this;
    }

    public SessionKeySecretKeyDecryptorBuilder isMethod(String isParameter) {
        this.isFieldAccessExpr = new OperatorHelper(new NamedJcaJceHelper(isNameExpr));
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        return this;
    }

    public PBESecretKeyDecryptor isMethod(final byte[] isParameter) throws PGPException {
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod();
        }
        return new PBESecretKeyDecryptor(null, isNameExpr) {

            @Override
            public byte[] isMethod(int isParameter, S2K isParameter) throws PGPException {
                return isNameExpr;
            }

            public byte[] isMethod(int isParameter, byte[] isParameter, byte[] isParameter, byte[] isParameter, int isParameter, int isParameter) throws PGPException {
                try {
                    Cipher isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr) + "isStringConstant");
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr, isNameExpr), new IvParameterSpec(isNameExpr));
                    return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                } catch (IllegalBlockSizeException isParameter) {
                    throw new PGPException("isStringConstant" + isNameExpr.isMethod(), isNameExpr);
                } catch (BadPaddingException isParameter) {
                    throw new PGPException("isStringConstant" + isNameExpr.isMethod(), isNameExpr);
                } catch (InvalidAlgorithmParameterException isParameter) {
                    throw new PGPException("isStringConstant" + isNameExpr.isMethod(), isNameExpr);
                } catch (InvalidKeyException isParameter) {
                    throw new PGPException("isStringConstant" + isNameExpr.isMethod(), isNameExpr);
                }
            }
        };
    }
}
