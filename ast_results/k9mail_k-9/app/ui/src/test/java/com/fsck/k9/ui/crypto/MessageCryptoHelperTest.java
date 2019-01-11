// isComment
package com.fsck.k9.ui.crypto;

import java.io.InputStream;
import java.io.OutputStream;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.fsck.k9.RobolectricTest;
import com.fsck.k9.autocrypt.AutocryptOperations;
import com.fsck.k9.mail.Address;
import com.fsck.k9.mail.Body;
import com.fsck.k9.mail.BodyPart;
import com.fsck.k9.mail.Message;
import com.fsck.k9.mail.internet.MimeBodyPart;
import com.fsck.k9.mail.internet.MimeMessage;
import com.fsck.k9.mail.internet.TextBody;
import com.fsck.k9.mailstore.CryptoResultAnnotation;
import com.fsck.k9.mailstore.CryptoResultAnnotation.CryptoError;
import com.fsck.k9.mailstore.MessageCryptoAnnotations;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.openintents.openpgp.IOpenPgpService2;
import org.openintents.openpgp.OpenPgpDecryptionResult;
import org.openintents.openpgp.OpenPgpSignatureResult;
import org.openintents.openpgp.util.OpenPgpApi;
import org.openintents.openpgp.util.OpenPgpApi.IOpenPgpCallback;
import org.openintents.openpgp.util.OpenPgpApi.IOpenPgpSinkResultCallback;
import org.openintents.openpgp.util.OpenPgpApi.OpenPgpDataSink;
import org.openintents.openpgp.util.OpenPgpApi.OpenPgpDataSource;
import org.robolectric.RuntimeEnvironment;
import static com.fsck.k9.mail.TestMessageConstructionUtils.bodypart;
import static com.fsck.k9.mail.TestMessageConstructionUtils.messageFromBody;
import static com.fsck.k9.mail.TestMessageConstructionUtils.multipart;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertSame;
import static junit.framework.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.same;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

@SuppressWarnings("isStringConstant")
public class isClassOrIsInterface extends RobolectricTest {

    private MessageCryptoHelper isVariable;

    private OpenPgpApi isVariable;

    private Intent isVariable;

    private IOpenPgpSinkResultCallback isVariable;

    private MessageCryptoCallback isVariable;

    private AutocryptOperations isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = isMethod(OpenPgpApi.class);
        isNameExpr = isMethod(AutocryptOperations.class);
        OpenPgpApiFactory isVariable = isMethod(OpenPgpApiFactory.class);
        isMethod(isNameExpr.isMethod(isMethod(Context.class), isMethod(IOpenPgpService2.class))).isMethod(isNameExpr);
        isNameExpr = new MessageCryptoHelper(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr, "isStringConstant");
        isNameExpr = isMethod(MessageCryptoCallback.class);
    }

    @Test
    public void isMethod() throws Exception {
        MimeMessage isVariable = new MimeMessage();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        MessageCryptoCallback isVariable = isMethod(MessageCryptoCallback.class);
        isNameExpr.isMethod(isNameExpr, isNameExpr, null, true);
        ArgumentCaptor<MessageCryptoAnnotations> isVariable = isNameExpr.isMethod(MessageCryptoAnnotations.class);
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        MessageCryptoAnnotations isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        MimeMessage isVariable = new MimeMessage();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(true);
        isMethod(isNameExpr.isMethod(isMethod(isNameExpr), isMethod(Intent.class))).isMethod(true);
        MessageCryptoCallback isVariable = isMethod(MessageCryptoCallback.class);
        isNameExpr.isMethod(isNameExpr, isNameExpr, null, true);
        ArgumentCaptor<MessageCryptoAnnotations> isVariable = isNameExpr.isMethod(MessageCryptoAnnotations.class);
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        MessageCryptoAnnotations isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr);
        ArgumentCaptor<Intent> isVariable = isNameExpr.isMethod(Intent.class);
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr), isNameExpr.isMethod());
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr.isMethod()), isMethod((InputStream) null), isMethod((OutputStream) null), isMethod(IOpenPgpCallback.class));
    }

    @Test
    public void isMethod() throws Exception {
        Message isVariable = isMethod(isMethod("isStringConstant", "isStringConstant", isMethod("isStringConstant"), isMethod("isStringConstant")));
        MessageCryptoCallback isVariable = isMethod(MessageCryptoCallback.class);
        isNameExpr.isMethod(isNameExpr, isNameExpr, null, true);
        isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, null, null, null, null);
    }

    @Test
    public void isMethod() throws Exception {
        Message isVariable = isMethod(isMethod("isStringConstant", "isStringConstant", isMethod("isStringConstant"), isMethod("isStringConstant")));
        MessageCryptoCallback isVariable = isMethod(MessageCryptoCallback.class);
        isNameExpr.isMethod(isNameExpr, isNameExpr, null, true);
        isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, null, null, null, null);
    }

    @Test
    public void isMethod() throws Exception {
        Message isVariable = isMethod(isMethod("isStringConstant", "isStringConstant", isMethod("isStringConstant", "isStringConstant"), isMethod("isStringConstant", "isStringConstant")));
        MessageCryptoCallback isVariable = isMethod(MessageCryptoCallback.class);
        isNameExpr.isMethod(isNameExpr, isNameExpr, null, true);
        isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, null, null, null, null);
    }

    @Test
    public void isMethod() throws Exception {
        Message isVariable = isMethod(isMethod("isStringConstant", "isStringConstant", isMethod("isStringConstant", "isStringConstant"), isMethod("isStringConstant", "isStringConstant")));
        MessageCryptoCallback isVariable = isMethod(MessageCryptoCallback.class);
        isNameExpr.isMethod(isNameExpr, isNameExpr, null, true);
        isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, null, null, null, null);
    }

    @Test
    public void isMethod() throws Exception {
        BodyPart isVariable = isMethod(isMethod("isStringConstant", "isStringConstant"));
        Message isVariable = isMethod(isMethod("isStringConstant", "isStringConstant", isNameExpr, isMethod("isStringConstant", "isStringConstant")));
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")[isIntegerConstant]);
        OutputStream isVariable = isMethod(OutputStream.class);
        isMethod(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr).isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        Message isVariable = isMethod(isMethod("isStringConstant", "isStringConstant", isMethod("isStringConstant", "isStringConstant"), isMethod("isStringConstant", "isStringConstant")));
        MessageCryptoCallback isVariable = isMethod(MessageCryptoCallback.class);
        isNameExpr.isMethod(isNameExpr, isNameExpr, null, true);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        Message isVariable = isMethod(isMethod("isStringConstant", "isStringConstant", isMethod("isStringConstant"), isMethod("isStringConstant")));
        MessageCryptoCallback isVariable = isMethod(MessageCryptoCallback.class);
        isNameExpr.isMethod(isNameExpr, isNameExpr, null, true);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        Body isVariable = isMethod(new TextBody("isStringConstant"));
        Message isVariable = isMethod(isMethod("isStringConstant", "isStringConstant", isMethod("isStringConstant", "isStringConstant"), isMethod("isStringConstant", isNameExpr)));
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant")[isIntegerConstant]);
        OutputStream isVariable = isMethod(OutputStream.class);
        Intent isVariable = new Intent();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        OpenPgpDecryptionResult isVariable = isMethod(OpenPgpDecryptionResult.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        OpenPgpSignatureResult isVariable = isMethod(OpenPgpSignatureResult.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        PendingIntent isVariable = isMethod(PendingIntent.class);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isNameExpr, isNameExpr, isNameExpr);
        MimeBodyPart isVariable = new MimeBodyPart(new TextBody("isStringConstant"));
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr);
    }

    private void isMethod(Message isParameter, Body isParameter, OutputStream isParameter) throws Exception {
        isNameExpr.isMethod(isNameExpr, isNameExpr, null, true);
        ArgumentCaptor<Intent> isVariable = isNameExpr.isMethod(Intent.class);
        ArgumentCaptor<OpenPgpDataSource> isVariable = isNameExpr.isMethod(OpenPgpDataSource.class);
        ArgumentCaptor<IOpenPgpSinkResultCallback> isVariable = isNameExpr.isMethod(IOpenPgpSinkResultCallback.class);
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isMethod(OpenPgpDataSink.class), isNameExpr.isMethod());
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod();
        OpenPgpDataSource isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr);
    }

    private void isMethod(Message isParameter, BodyPart isParameter, OutputStream isParameter) throws Exception {
        isNameExpr.isMethod(isNameExpr, isNameExpr, null, true);
        ArgumentCaptor<Intent> isVariable = isNameExpr.isMethod(Intent.class);
        ArgumentCaptor<OpenPgpDataSource> isVariable = isNameExpr.isMethod(OpenPgpDataSource.class);
        ArgumentCaptor<IOpenPgpSinkResultCallback> isVariable = isNameExpr.isMethod(IOpenPgpSinkResultCallback.class);
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod());
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod();
        OpenPgpDataSource isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr);
    }

    private void isMethod(MessageCryptoCallback isParameter) {
        ArgumentCaptor<MessageCryptoAnnotations> isVariable = isNameExpr.isMethod(MessageCryptoAnnotations.class);
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr);
        MessageCryptoAnnotations isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod());
    }

    private void isMethod(Message isParameter, MessageCryptoCallback isParameter, CryptoError isParameter, MimeBodyPart isParameter, OpenPgpDecryptionResult isParameter, OpenPgpSignatureResult isParameter, PendingIntent isParameter) {
        ArgumentCaptor<MessageCryptoAnnotations> isVariable = isNameExpr.isMethod(MessageCryptoAnnotations.class);
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        MessageCryptoAnnotations isVariable = isNameExpr.isMethod();
        CryptoResultAnnotation isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr.isMethod());
        if (isNameExpr != null) {
            isMethod(isNameExpr, isNameExpr.isMethod());
        }
        isMethod(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr);
    }
}
