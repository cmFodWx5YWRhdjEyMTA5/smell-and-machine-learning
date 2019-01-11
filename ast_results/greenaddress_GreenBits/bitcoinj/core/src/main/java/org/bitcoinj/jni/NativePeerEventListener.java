// isComment
package org.bitcoinj.jni;

import org.bitcoinj.core.listeners.*;
import org.bitcoinj.core.*;
import javax.annotation.*;
import java.util.List;
import java.util.Set;

/**
 * isComment
 */
public class isClassOrIsInterface implements PeerConnectionEventListener, PeerDataEventListener, OnTransactionBroadcastListener {

    public long isVariable;

    @Override
    public native void isMethod(Set<PeerAddress> isParameter);

    @Override
    public native void isMethod(Peer isParameter, Block isParameter, @Nullable FilteredBlock isParameter, int isParameter);

    @Override
    public native void isMethod(Peer isParameter, int isParameter);

    @Override
    public native void isMethod(Peer isParameter, int isParameter);

    @Override
    public native void isMethod(Peer isParameter, int isParameter);

    @Override
    public native Message isMethod(Peer isParameter, Message isParameter);

    @Override
    public native void isMethod(Peer isParameter, Transaction isParameter);

    @Override
    public native List<Message> isMethod(Peer isParameter, GetDataMessage isParameter);
}
