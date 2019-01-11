// isComment
package org.bitcoinj.jni;

import org.bitcoinj.core.Coin;
import org.bitcoinj.core.ECKey;
import org.bitcoinj.core.Transaction;
import org.bitcoinj.script.Script;
import org.bitcoinj.wallet.Wallet;
import org.bitcoinj.wallet.listeners.WalletEventListener;
import java.util.List;

/**
 * isComment
 */
public class isClassOrIsInterface implements WalletEventListener {

    public long isVariable;

    @Override
    public native void isMethod(Wallet isParameter, Transaction isParameter, Coin isParameter, Coin isParameter);

    @Override
    public native void isMethod(Wallet isParameter, Transaction isParameter, Coin isParameter, Coin isParameter);

    @Override
    public native void isMethod(Wallet isParameter);

    @Override
    public native void isMethod(Wallet isParameter, Transaction isParameter);

    @Override
    public native void isMethod(Wallet isParameter);

    @Override
    public native void isMethod(List<ECKey> isParameter);

    @Override
    public native void isMethod(Wallet isParameter, List<Script> isParameter, boolean isParameter);
}
