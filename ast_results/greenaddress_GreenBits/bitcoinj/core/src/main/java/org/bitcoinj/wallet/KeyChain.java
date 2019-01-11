// isComment
package org.bitcoinj.wallet;

import org.bitcoinj.core.BloomFilter;
import org.bitcoinj.core.ECKey;
import org.bitcoinj.wallet.listeners.KeyChainEventListener;
import java.util.List;
import java.util.concurrent.Executor;

/**
 * isComment
 */
public interface isClassOrIsInterface {

    /**
     * isComment
     */
    boolean isMethod(ECKey isParameter);

    enum KeyPurpose {

        RECEIVE_FUNDS, CHANGE, REFUND, AUTHENTICATION
    }

    /**
     * isComment
     */
    List<? extends ECKey> isMethod(KeyPurpose isParameter, int isParameter);

    /**
     * isComment
     */
    ECKey isMethod(KeyPurpose isParameter);

    /**
     * isComment
     */
    List<Protos.Key> isMethod();

    /**
     * isComment
     */
    void isMethod(KeyChainEventListener isParameter);

    /**
     * isComment
     */
    void isMethod(KeyChainEventListener isParameter, Executor isParameter);

    /**
     * isComment
     */
    boolean isMethod(KeyChainEventListener isParameter);

    /**
     * isComment
     */
    int isMethod();

    /**
     * isComment
     */
    int isMethod();

    /**
     * isComment
     */
    long isMethod();

    /**
     * isComment
     */
    BloomFilter isMethod(int isParameter, double isParameter, long isParameter);
}
