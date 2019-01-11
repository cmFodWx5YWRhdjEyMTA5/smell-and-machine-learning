// isComment
package org.bitcoinj.protocols.channels;

import org.bitcoinj.core.*;
import org.bitcoinj.protocols.channels.PaymentChannelClient.VersionSelector;
import org.bitcoinj.testing.TestWithWallet;
import org.bitcoinj.utils.Threading;
import org.bitcoinj.wallet.Wallet;
import org.bitcoinj.wallet.WalletExtension;
import org.bitcoinj.wallet.WalletFiles;
import org.bitcoinj.wallet.WalletProtobufSerializer;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protobuf.ByteString;
import org.bitcoin.paymentchannel.Protos;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.spongycastle.crypto.params.KeyParameter;
import javax.annotation.Nullable;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicBoolean;
import static org.bitcoinj.core.Coin.*;
import static org.bitcoinj.protocols.channels.PaymentChannelClient.VersionSelector.*;
import static org.bitcoinj.protocols.channels.PaymentChannelCloseException.CloseReason;
import static org.bitcoinj.testing.FakeTxBuilder.createFakeBlock;
import static org.bitcoin.paymentchannel.Protos.TwoWayChannelMessage.MessageType;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class isClassOrIsInterface extends TestWithWallet {

    private static final int isVariable = isIntegerConstant;

    private Wallet isVariable;

    private AtomicBoolean isVariable;

    private BlockingQueue<Transaction> isVariable;

    private TransactionBroadcaster isVariable;

    private Semaphore isVariable;

    private static final TransactionBroadcaster isVariable = new TransactionBroadcaster() {

        @Override
        public TransactionBroadcast isMethod(Transaction isParameter) {
            isMethod();
            return null;
        }
    };

    /**
     * isComment
     */
    @Parameterized.Parameters(name = "isStringConstant")
    public static Collection<PaymentChannelClient.DefaultClientChannelProperties> isMethod() {
        return isNameExpr.isMethod(new PaymentChannelClient.DefaultClientChannelProperties() {

            @Override
            public VersionSelector isMethod() {
                return isNameExpr;
            }
        }, new PaymentChannelClient.DefaultClientChannelProperties() {

            @Override
            public VersionSelector isMethod() {
                return isNameExpr;
            }
        });
    }

    @Parameterized.Parameter
    public IPaymentChannelClient.ClientChannelProperties isVariable;

    /**
     * isComment
     */
    private boolean isMethod() {
        return isNameExpr.isMethod() == isNameExpr;
    }

    /**
     * isComment
     */
    private boolean isMethod() {
        return isNameExpr.isMethod() == isNameExpr;
    }

    @Override
    @Before
    public void isMethod() throws Exception {
        super.isMethod();
        // isComment
        isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod(new Context(isNameExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr, true));
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        isNameExpr.isMethod(new StoredPaymentChannelClientStates(isNameExpr, isNameExpr));
        isNameExpr = new Wallet(isNameExpr);
        isNameExpr.isMethod(new StoredPaymentChannelServerStates(isNameExpr, isNameExpr));
        isNameExpr.isMethod();
        // isComment
        isNameExpr = new AtomicBoolean(true);
        // isComment
        // isComment
        isNameExpr = new LinkedBlockingQueue<>();
        isNameExpr = new Semaphore(isIntegerConstant);
        isNameExpr = new TransactionBroadcaster() {

            @Override
            public TransactionBroadcast isMethod(Transaction isParameter) {
                isNameExpr.isMethod();
                SettableFuture<Transaction> isVariable = isNameExpr.isMethod();
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr);
                return isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
        };
        // isComment
        // isComment
        // isComment
        isNameExpr.isMethod();
        isNameExpr.isFieldAccessExpr = true;
    }

    @After
    @Override
    public void isMethod() throws Exception {
        super.isMethod();
        isNameExpr.isFieldAccessExpr = true;
    }

    @After
    public void isMethod() {
        isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod();
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(null);
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        String isVariable = "isStringConstant";
        isNameExpr.isMethod(isNameExpr);
        KeyParameter isVariable = isNameExpr.isMethod().isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    private void isMethod(KeyParameter isParameter) throws Exception {
        // isComment
        final SettableFuture<ListenableFuture<PaymentChannelV1ServerState>> isVariable = isNameExpr.isMethod();
        final SettableFuture<Sha256Hash> isVariable = isNameExpr.isMethod();
        final BlockingQueue<ChannelTestUtils.UpdatePair> isVariable = new LinkedBlockingQueue<>();
        final PaymentChannelServerListener isVariable = new PaymentChannelServerListener(isNameExpr, isNameExpr, isIntegerConstant, isNameExpr, new PaymentChannelServerListener.HandlerFactory() {

            @Nullable
            @Override
            public ServerConnectionEventHandler isMethod(SocketAddress isParameter) {
                return new ServerConnectionEventHandler() {

                    @Override
                    public void isMethod(Sha256Hash isParameter) {
                        isNameExpr.isMethod(isNameExpr);
                    }

                    @Override
                    public ListenableFuture<ByteString> isMethod(Coin isParameter, Coin isParameter, ByteString isParameter) {
                        isNameExpr.isMethod(new ChannelTestUtils.UpdatePair(isNameExpr, isNameExpr));
                        return isNameExpr.isMethod(isNameExpr);
                    }

                    @Override
                    public void isMethod(CloseReason isParameter) {
                        isNameExpr.isMethod(null);
                    }
                };
            }
        });
        isNameExpr.isMethod(isIntegerConstant);
        PaymentChannelClientConnection isVariable = new PaymentChannelClientConnection(new InetSocketAddress("isStringConstant", isIntegerConstant), isIntegerConstant, isNameExpr, isNameExpr, isNameExpr, "isStringConstant", isNameExpr, isNameExpr);
        // isComment
        isNameExpr.isMethod();
        Transaction isVariable = isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod().isMethod();
        isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
        // isComment
        // isComment
        final CountDownLatch isVariable = new CountDownLatch(isIntegerConstant);
        File isVariable = isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr, isIntegerConstant, isNameExpr.isFieldAccessExpr, new WalletFiles.Listener() {

            @Override
            public void isMethod(File isParameter) {
                isNameExpr.isMethod();
            }

            @Override
            public void isMethod(File isParameter) {
            }
        });
        // isComment
        isNameExpr.isMethod(isIntegerConstant);
        Coin isVariable = isNameExpr.isMethod().isMethod();
        isNameExpr.isMethod().isMethod(isNameExpr, null);
        for (String isVariable : new String[] { null, "isStringConstant", "isStringConstant" }) {
            final ByteString isVariable = (isNameExpr == null) ? null : isNameExpr.isMethod(isNameExpr);
            final PaymentIncrementAck isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr).isMethod();
            if (isNameExpr != null) {
                final ByteString isVariable = isNameExpr.isMethod();
                isMethod("isStringConstant", isNameExpr);
                isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod());
            }
            isNameExpr = isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr);
        }
        isNameExpr.isMethod();
        StoredPaymentChannelServerStates isVariable = (StoredPaymentChannelServerStates) isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        StoredServerChannel isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
        PaymentChannelServerState isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        // isComment
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        Transaction isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr.isFieldAccessExpr || isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        // isComment
        isNameExpr.isMethod().isMethod();
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isMethod());
        // isComment
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isNameExpr.isMethod().isMethod() == isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        // isComment
        isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr).isFieldAccessExpr.isMethod());
        isNameExpr.isMethod(isMethod(isNameExpr, isNameExpr.isFieldAccessExpr).isFieldAccessExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr).isFieldAccessExpr.isMethod());
        isNameExpr.isMethod(isMethod(isNameExpr, isNameExpr.isFieldAccessExpr + isIntegerConstant).isFieldAccessExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr).isFieldAccessExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        if (!isMethod()) {
            // isComment
            return;
        }
        // isComment
        ChannelTestUtils.RecordingPair isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        PaymentChannelClient isVariable = new PaymentChannelClient(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, null, isNameExpr, isNameExpr.isFieldAccessExpr);
        PaymentChannelServer isVariable = isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        Protos.TwoWayChannelMessage isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr)).isMethod());
        final Protos.TwoWayChannelMessage isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        ChannelTestUtils.RecordingPair isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        PaymentChannelClient isVariable = new PaymentChannelClient(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, null, isNameExpr, isNameExpr.isFieldAccessExpr);
        PaymentChannelServer isVariable = isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        ChannelTestUtils.RecordingPair isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        PaymentChannelClient isVariable = new PaymentChannelClient(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, null, isNameExpr, isNameExpr.isFieldAccessExpr);
        PaymentChannelServer isVariable = isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        isNameExpr.isMethod();
        final Sha256Hash isVariable = isNameExpr.isMethod(new byte[] {});
        // isComment
        ChannelTestUtils.RecordingPair isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isFieldAccessExpr.isMethod();
        PaymentChannelClient isVariable = new PaymentChannelClient(isNameExpr, isNameExpr, isNameExpr, isNameExpr, null, isNameExpr, isNameExpr.isFieldAccessExpr);
        PaymentChannelServer isVariable = isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        final Protos.TwoWayChannelMessage isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        Coin isVariable = isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod(isNameExpr);
        if (isMethod()) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod();
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        Sha256Hash isVariable = (Sha256Hash) isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod();
        isNameExpr.isFieldAccessExpr.isMethod();
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod().isMethod());
        // isComment
        Coin isVariable = isNameExpr.isMethod(isNameExpr);
        ListenableFuture<PaymentIncrementAck> isVariable = isNameExpr.isMethod(isNameExpr);
        // isComment
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr).isMethod(// isComment
        isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod());
        // isComment
        try {
            isNameExpr.isMethod(isStringConstant, isNameExpr.isFieldAccessExpr);
            isMethod("isStringConstant");
        } catch (ExecutionException isParameter) {
            PaymentChannelCloseException isVariable = (PaymentChannelCloseException) isNameExpr.isMethod();
            isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        } catch (TimeoutException isParameter) {
            isMethod("isStringConstant");
        }
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        isNameExpr.isMethod();
        final Sha256Hash isVariable = isNameExpr.isMethod(new byte[] {});
        // isComment
        ChannelTestUtils.RecordingPair isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isFieldAccessExpr.isMethod();
        PaymentChannelClient isVariable = new PaymentChannelClient(isNameExpr, isNameExpr, isNameExpr, isNameExpr, null, isNameExpr, isNameExpr.isFieldAccessExpr);
        PaymentChannelServer isVariable = isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        final Protos.TwoWayChannelMessage isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        Coin isVariable = isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod(isNameExpr);
        if (isMethod()) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod();
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        Sha256Hash isVariable = (Sha256Hash) isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod();
        isNameExpr.isFieldAccessExpr.isMethod();
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod().isMethod());
        // isComment
        Coin isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr, ((ChannelTestUtils.UpdatePair) isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod()).isFieldAccessExpr);
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod();
        isMethod(isNameExpr.isFieldAccessExpr);
        // isComment
        StoredPaymentChannelClientStates isVariable = (StoredPaymentChannelClientStates) isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isIntegerConstant, isNameExpr.isFieldAccessExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod().isMethod().isFieldAccessExpr);
        // isComment
        // isComment
        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isFieldAccessExpr.isMethod();
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isMethod(new byte[] { isIntegerConstant }))).isMethod(isNameExpr).isMethod(isIntegerConstant)).isMethod());
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        // isComment
        isNameExpr = isMethod(isNameExpr);
        isNameExpr = isMethod(isNameExpr);
        isNameExpr = (StoredPaymentChannelClientStates) isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr = new PaymentChannelClient(isNameExpr, isNameExpr, isNameExpr, isNameExpr, null, isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        // isComment
        final Protos.TwoWayChannelMessage isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod().isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isMethod().isMethod().isMethod()));
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod());
        isNameExpr.isFieldAccessExpr.isMethod();
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod());
        // isComment
        isNameExpr.isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        PaymentChannelClient isVariable = isNameExpr;
        ChannelTestUtils.RecordingPair isVariable = isNameExpr;
        // isComment
        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr = new PaymentChannelClient(isNameExpr, isNameExpr, isNameExpr, isNameExpr, null, isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        // isComment
        // isComment
        {
            Protos.TwoWayChannelMessage isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr.isMethod().isMethod());
        }
        // isComment
        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr = new PaymentChannelClient(isNameExpr, isNameExpr, isNameExpr, isNameExpr, null, isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        // isComment
        isNameExpr.isFieldAccessExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isMethod())).isMethod(isNameExpr).isMethod(isIntegerConstant)).isMethod());
        // isComment
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        // isComment
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr).isFieldAccessExpr);
        // isComment
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr).isFieldAccessExpr);
        // isComment
        isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr));
        // isComment
        isNameExpr.isMethod(isIntegerConstant * isIntegerConstant * isIntegerConstant + isIntegerConstant * isIntegerConstant);
        StoredPaymentChannelClientStates isVariable = new StoredPaymentChannelClientStates(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        isNameExpr.isMethod();
        if (isMethod()) {
            isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod().isMethod());
        } else {
            isMethod(isNameExpr.isMethod().isMethod(isIntegerConstant).isMethod().isMethod());
        }
        isNameExpr.isMethod();
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod().isMethod());
        isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isMethod());
        // isComment
        StoredPaymentChannelServerStates isVariable = new StoredPaymentChannelServerStates(isNameExpr, isNameExpr);
        // isComment
        isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod());
    }

    private static Wallet isMethod(Wallet isParameter) throws Exception {
        ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
        new WalletProtobufSerializer().isMethod(isNameExpr, isNameExpr);
        org.bitcoinj.wallet.Protos.Wallet isVariable = isNameExpr.isMethod(new ByteArrayInputStream(isNameExpr.isMethod()));
        StoredPaymentChannelClientStates isVariable = new StoredPaymentChannelClientStates(null, isNameExpr);
        return new WalletProtobufSerializer().isMethod(isNameExpr.isMethod(), new WalletExtension[] { isNameExpr }, isNameExpr);
    }

    private static Wallet isMethod(Wallet isParameter) throws Exception {
        ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
        new WalletProtobufSerializer().isMethod(isNameExpr, isNameExpr);
        StoredPaymentChannelServerStates isVariable = new StoredPaymentChannelServerStates(null, isNameExpr);
        org.bitcoinj.wallet.Protos.Wallet isVariable = isNameExpr.isMethod(new ByteArrayInputStream(isNameExpr.isMethod()));
        return new WalletProtobufSerializer().isMethod(isNameExpr.isMethod(), new WalletExtension[] { isNameExpr }, isNameExpr);
    }

    @Test
    public void isMethod() throws InterruptedException {
        // isComment
        // isComment
        ChannelTestUtils.RecordingPair isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isFieldAccessExpr.isMethod();
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isMethod(new byte[] { isIntegerConstant, isIntegerConstant })).isMethod(isNameExpr).isMethod(isIntegerConstant)).isMethod());
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        ChannelTestUtils.RecordingPair isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        PaymentChannelClient isVariable = new PaymentChannelClient(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, null, isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(-isIntegerConstant)).isMethod(isNameExpr.isFieldAccessExpr).isMethod());
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod());
        // isComment
        try {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isMethod();
        } catch (IllegalStateException isParameter) {
        }
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        ChannelTestUtils.RecordingPair isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isIntegerConstant);
        PaymentChannelServer isVariable = isNameExpr.isFieldAccessExpr;
        PaymentChannelClient isVariable = new PaymentChannelClient(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, null, isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isMethod() + isIntegerConstant * isIntegerConstant * isIntegerConstant).isMethod(isIntegerConstant).isMethod(isNameExpr.isMethod(new ECKey().isMethod())).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isFieldAccessExpr).isMethod());
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod());
        // isComment
        try {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isMethod();
        } catch (IllegalStateException isParameter) {
        }
    }

    @Test
    public void isMethod() throws Exception {
        ChannelTestUtils.RecordingPair isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        PaymentChannelServer isVariable = isNameExpr.isFieldAccessExpr;
        PaymentChannelClient isVariable = new PaymentChannelClient(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, null, isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr).isFieldAccessExpr).isMethod(isNameExpr.isMethod(new ECKey().isMethod())).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isFieldAccessExpr).isMethod());
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod());
        // isComment
        try {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isMethod();
        } catch (IllegalStateException isParameter) {
        }
        // isComment
        // isComment
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isIntegerConstant));
        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr = isNameExpr.isFieldAccessExpr;
        final Coin isVariable = isNameExpr.isMethod(isIntegerConstant);
        isNameExpr = new PaymentChannelClient(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, null, isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr).isFieldAccessExpr).isMethod(isNameExpr.isMethod(new ECKey().isMethod())).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isFieldAccessExpr).isMethod());
        if (isMethod()) {
            final Protos.TwoWayChannelMessage isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
            Transaction isVariable = new Transaction(isNameExpr, isNameExpr.isMethod().isMethod().isMethod());
            isMethod(isNameExpr, isNameExpr.isMethod(isIntegerConstant).isMethod());
        } else {
            isMethod(isIntegerConstant, isNameExpr.isMethod().isMethod());
            PaymentChannelV2ClientState isVariable = (PaymentChannelV2ClientState) isNameExpr.isMethod();
            isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isMethod(isIntegerConstant).isMethod());
        }
    }

    @Test
    public void isMethod() throws Exception {
        Wallet isVariable = new Wallet(isNameExpr);
        isNameExpr.isMethod();
        ChannelTestUtils.RecordingPair isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        PaymentChannelServer isVariable = isNameExpr.isFieldAccessExpr;
        PaymentChannelClient isVariable = new PaymentChannelClient(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, null, isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        try {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod(new ECKey().isMethod())).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isFieldAccessExpr).isMethod());
            isMethod();
        } catch (InsufficientMoneyException isParameter) {
        // isComment
        }
    }

    @Test
    public void isMethod() throws Exception {
        ChannelTestUtils.RecordingPair isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        PaymentChannelServer isVariable = isNameExpr.isFieldAccessExpr;
        PaymentChannelClient isVariable = new PaymentChannelClient(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, null, isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        Protos.TwoWayChannelMessage.Builder isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        ByteString isVariable = isNameExpr.isMethod().isMethod();
        isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod() + isIntegerConstant));
        isNameExpr.isMethod().isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        ChannelTestUtils.RecordingPair isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        PaymentChannelServer isVariable = isNameExpr.isFieldAccessExpr;
        PaymentChannelClient isVariable = new PaymentChannelClient(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, null, isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr).isMethod());
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        ChannelTestUtils.RecordingPair isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        PaymentChannelClient isVariable = new PaymentChannelClient(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, null, isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr).isMethod());
        Protos.TwoWayChannelMessage isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        // isComment
        // isComment
        Sha256Hash isVariable = isNameExpr.isFieldAccessExpr;
        ChannelTestUtils.RecordingPair isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isFieldAccessExpr.isMethod();
        PaymentChannelClient isVariable = new PaymentChannelClient(isNameExpr, isNameExpr, isNameExpr, isNameExpr, null, isNameExpr, isNameExpr.isFieldAccessExpr);
        PaymentChannelServer isVariable = isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        if (isMethod()) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod();
        isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        Sha256Hash isVariable = (Sha256Hash) isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod();
        isNameExpr.isFieldAccessExpr.isMethod();
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod());
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod();
        // isComment
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod().isMethod());
        // isComment
        isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod());
        isNameExpr.isMethod();
        // isComment
        isNameExpr = new PaymentChannelClient(isNameExpr, isNameExpr, isNameExpr, isNameExpr, null, isNameExpr, isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
        Protos.TwoWayChannelMessage isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod().isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        // isComment
        // isComment
        // isComment
        {
            Sha256Hash isVariable = isNameExpr.isFieldAccessExpr;
            ChannelTestUtils.RecordingPair isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
            isNameExpr.isFieldAccessExpr.isMethod();
            PaymentChannelClient isVariable = new PaymentChannelClient(isNameExpr, isNameExpr, isNameExpr, isNameExpr, null, isNameExpr, isNameExpr.isFieldAccessExpr);
            PaymentChannelServer isVariable = isNameExpr.isFieldAccessExpr;
            isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
            if (isMethod()) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
            }
            isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
            Sha256Hash isVariable = (Sha256Hash) isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod();
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod());
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod());
            for (int isVariable = isIntegerConstant; isNameExpr < isIntegerConstant; isNameExpr++) {
                ListenableFuture<PaymentIncrementAck> isVariable = isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
                isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod();
                final Protos.TwoWayChannelMessage isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
                final Protos.PaymentAck isVariable = isNameExpr.isMethod();
                isMethod("isStringConstant", isNameExpr.isMethod());
                isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod()), isNameExpr.isMethod());
                isNameExpr.isMethod(isNameExpr);
                isMethod(isNameExpr.isMethod());
                final PaymentIncrementAck isVariable = isNameExpr.isMethod();
                isMethod("isStringConstant", isNameExpr, isNameExpr.isMethod());
                isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isMethod()), isNameExpr.isMethod());
            }
            // isComment
            isNameExpr.isMethod();
            isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
            Transaction isVariable = isNameExpr.isMethod();
            // isComment
            final Protos.TwoWayChannelMessage isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
            final Transaction isVariable = new Transaction(isNameExpr, isNameExpr.isMethod().isMethod().isMethod());
            isMethod(isNameExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            // isComment
            isMethod(isNameExpr.isMethod(isNameExpr.isMethod()));
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
            isNameExpr.isMethod();
            isNameExpr.isMethod();
        }
        // isComment
        {
            Sha256Hash isVariable = isNameExpr.isFieldAccessExpr;
            ChannelTestUtils.RecordingPair isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
            isNameExpr.isFieldAccessExpr.isMethod();
            PaymentChannelClient isVariable = new PaymentChannelClient(isNameExpr, isNameExpr, isNameExpr, isNameExpr, null, isNameExpr, isNameExpr.isFieldAccessExpr);
            PaymentChannelServer isVariable = isNameExpr.isFieldAccessExpr;
            isNameExpr.isMethod();
            final Protos.TwoWayChannelMessage isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isMethod(isNameExpr.isMethod().isMethod());
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
            if (isMethod()) {
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
                isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
            }
            isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
            isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
            Sha256Hash isVariable = (Sha256Hash) isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod();
            isNameExpr.isFieldAccessExpr.isMethod();
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod());
            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod());
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
            isNameExpr.isMethod();
            isNameExpr.isMethod();
        }
        // isComment
        {
            Sha256Hash isVariable = isNameExpr.isFieldAccessExpr;
            ChannelTestUtils.RecordingPair isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
            isNameExpr.isFieldAccessExpr.isMethod();
            PaymentChannelClient isVariable = new PaymentChannelClient(isNameExpr, isNameExpr, isNameExpr, isNameExpr, null, isNameExpr, isNameExpr.isFieldAccessExpr);
            PaymentChannelServer isVariable = isNameExpr.isFieldAccessExpr;
            isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr));
        }
        isMethod(isIntegerConstant, isNameExpr.isMethod(isNameExpr).isFieldAccessExpr.isMethod());
    }
}
