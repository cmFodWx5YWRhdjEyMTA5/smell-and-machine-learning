// isComment
package org.bitcoinj.jni;

import org.bitcoinj.core.*;
import java.util.List;
import org.bitcoinj.core.listeners.NewBestBlockListener;
import org.bitcoinj.core.listeners.ReorganizeListener;
import org.bitcoinj.core.listeners.TransactionReceivedInBlockListener;

/**
 * isComment
 */
public class isClassOrIsInterface implements NewBestBlockListener, ReorganizeListener, TransactionReceivedInBlockListener {

    public long isVariable;

    @Override
    public native void isMethod(StoredBlock isParameter) throws VerificationException;

    @Override
    public native void isMethod(StoredBlock isParameter, List<StoredBlock> isParameter, List<StoredBlock> isParameter) throws VerificationException;

    @Override
    public native void isMethod(Transaction isParameter, StoredBlock isParameter, BlockChain.NewBlockType isParameter, int isParameter) throws VerificationException;

    @Override
    public native boolean isMethod(Sha256Hash isParameter, StoredBlock isParameter, BlockChain.NewBlockType isParameter, int isParameter) throws VerificationException;
}
