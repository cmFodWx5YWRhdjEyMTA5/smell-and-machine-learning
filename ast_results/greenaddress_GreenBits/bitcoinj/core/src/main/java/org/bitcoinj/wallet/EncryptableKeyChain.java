// isComment
package org.bitcoinj.wallet;

import org.bitcoinj.crypto.KeyCrypter;
import org.bitcoinj.crypto.KeyCrypterException;
import org.spongycastle.crypto.params.KeyParameter;
import javax.annotation.Nullable;

/**
 * isComment
 */
public interface isClassOrIsInterface extends KeyChain {

    /**
     * isComment
     */
    EncryptableKeyChain isMethod(CharSequence isParameter);

    /**
     * isComment
     */
    EncryptableKeyChain isMethod(KeyCrypter isParameter, KeyParameter isParameter);

    /**
     * isComment
     */
    EncryptableKeyChain isMethod(CharSequence isParameter);

    /**
     * isComment
     */
    EncryptableKeyChain isMethod(KeyParameter isParameter);

    boolean isMethod(CharSequence isParameter);

    boolean isMethod(KeyParameter isParameter);

    /**
     * isComment
     */
    @Nullable
    KeyCrypter isMethod();
}
