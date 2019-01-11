// isComment
package org.bitcoinj.jni;

import org.bitcoinj.script.Script;
import org.bitcoinj.wallet.Wallet;
import org.bitcoinj.wallet.listeners.ScriptsChangeEventListener;
import java.util.List;

/**
 * isComment
 */
public class isClassOrIsInterface implements ScriptsChangeEventListener {

    public long isVariable;

    @Override
    public native void isMethod(Wallet isParameter, List<Script> isParameter, boolean isParameter);
}
