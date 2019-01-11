// isComment
package org.bitcoinj.jni;

import org.bitcoinj.core.*;
import org.bitcoinj.protocols.channels.PaymentChannelCloseException;
import org.bitcoinj.protocols.channels.ServerConnectionEventHandler;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.protobuf.ByteString;

/**
 * isComment
 */
public class isClassOrIsInterface extends ServerConnectionEventHandler {

    public long isVariable;

    @Override
    public native void isMethod(Sha256Hash isParameter);

    @Override
    public native ListenableFuture<ByteString> isMethod(Coin isParameter, Coin isParameter, ByteString isParameter);

    @Override
    public native void isMethod(PaymentChannelCloseException.CloseReason isParameter);
}
