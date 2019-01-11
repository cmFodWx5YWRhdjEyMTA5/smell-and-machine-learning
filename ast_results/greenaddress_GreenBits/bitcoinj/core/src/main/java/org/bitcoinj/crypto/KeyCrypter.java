// isComment
package org.bitcoinj.crypto;

import org.bitcoinj.wallet.Protos.Wallet.EncryptionType;
import org.spongycastle.crypto.params.KeyParameter;
import java.io.Serializable;

/**
 * isComment
 */
public interface isClassOrIsInterface extends Serializable {

    /**
     * isComment
     */
    EncryptionType isMethod();

    /**
     * isComment
     */
    KeyParameter isMethod(CharSequence isParameter) throws KeyCrypterException;

    /**
     * isComment
     */
    byte[] isMethod(EncryptedData isParameter, KeyParameter isParameter) throws KeyCrypterException;

    /**
     * isComment
     */
    EncryptedData isMethod(byte[] isParameter, KeyParameter isParameter) throws KeyCrypterException;
}
