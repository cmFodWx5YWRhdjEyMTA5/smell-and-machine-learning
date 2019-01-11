// isComment
package com.fsck.k9.mailstore;

import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import android.app.Application;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import com.fsck.k9.DI;
import com.fsck.k9.K9RobolectricTest;
import com.fsck.k9.TestCoreResourceProvider;
import com.fsck.k9.mail.Address;
import com.fsck.k9.mail.BodyPart;
import com.fsck.k9.mail.Message;
import com.fsck.k9.mail.Message.RecipientType;
import com.fsck.k9.mail.MessagingException;
import com.fsck.k9.mail.Part;
import com.fsck.k9.mail.internet.MessageExtractor;
import com.fsck.k9.mail.internet.MimeBodyPart;
import com.fsck.k9.mail.internet.MimeHeader;
import com.fsck.k9.mail.internet.MimeMessage;
import com.fsck.k9.mail.internet.MimeMessageHelper;
import com.fsck.k9.mail.internet.MimeMultipart;
import com.fsck.k9.mail.internet.TextBody;
import com.fsck.k9.mail.internet.Viewable;
import com.fsck.k9.mail.internet.Viewable.MessageHeader;
import com.fsck.k9.mailstore.CryptoResultAnnotation.CryptoError;
import com.fsck.k9.mailstore.MessageViewInfoExtractor.ViewableExtractedText;
import com.fsck.k9.message.extractors.AttachmentInfoExtractor;
import com.fsck.k9.message.html.HtmlProcessor;
import org.junit.Before;
import org.junit.Test;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.openintents.openpgp.OpenPgpDecryptionResult;
import org.robolectric.RuntimeEnvironment;
import static com.fsck.k9.mail.TestMessageConstructionUtils.bodypart;
import static com.fsck.k9.mail.TestMessageConstructionUtils.messageFromBody;
import static com.fsck.k9.mail.TestMessageConstructionUtils.multipart;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertSame;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

@SuppressWarnings("isStringConstant")
public class isClassOrIsInterface extends K9RobolectricTest {

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    private MessageViewInfoExtractor isVariable;

    private Application isVariable;

    private AttachmentInfoExtractor isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = isNameExpr.isFieldAccessExpr;
        HtmlProcessor isVariable = isMethod();
        isNameExpr = isMethod(isNameExpr.isMethod(AttachmentInfoExtractor.class));
        isNameExpr = new MessageViewInfoExtractor(isNameExpr, isNameExpr, new TestCoreResourceProvider());
    }

    @Test
    public void isMethod() throws MessagingException {
        // isComment
        TextBody isVariable = new TextBody(isNameExpr);
        // isComment
        MimeMessage isVariable = new MimeMessage();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        // isComment
        HtmlProcessor isVariable = isMethod(HtmlProcessor.class);
        MessageViewInfoExtractor isVariable = new MessageViewInfoExtractor(null, isNameExpr, new TestCoreResourceProvider());
        String isVariable = "isStringConstant";
        isMethod(isNameExpr.isMethod(isMethod())).isMethod(isNameExpr);
        // isComment
        List<Part> isVariable = new ArrayList<>();
        ArrayList<Viewable> isVariable = new ArrayList<>();
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        ViewableExtractedText isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws MessagingException {
        // isComment
        TextBody isVariable = new TextBody(isNameExpr);
        // isComment
        MimeMessage isVariable = new MimeMessage();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        // isComment
        List<Part> isVariable = new ArrayList<>();
        ArrayList<Viewable> isVariable = new ArrayList<>();
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        ViewableExtractedText isVariable = isNameExpr.isMethod(isNameExpr);
        String isVariable = "isStringConstant" + "isStringConstant" + "isStringConstant";
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws MessagingException {
        // isComment
        TextBody isVariable = new TextBody(isNameExpr);
        // isComment
        MimeMessage isVariable = new MimeMessage();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        // isComment
        List<Part> isVariable = new ArrayList<>();
        ArrayList<Viewable> isVariable = new ArrayList<>();
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        ViewableExtractedText isVariable = isNameExpr.isMethod(isNameExpr);
        String isVariable = "isStringConstant" + "isStringConstant";
        String isVariable = "isStringConstant" + "isStringConstant" + "isStringConstant";
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws MessagingException {
        String isVariable = "isStringConstant";
        // isComment
        TextBody isVariable = new TextBody(isNameExpr);
        // isComment
        MimeMessage isVariable = new MimeMessage();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant");
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        // isComment
        ArrayList<Viewable> isVariable = new ArrayList<>();
        isNameExpr.isMethod(isNameExpr, isNameExpr, null);
        isMethod(isNameExpr.isMethod(), isIntegerConstant);
        ViewableExtractedText isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws MessagingException {
        String isVariable = "isStringConstant";
        String isVariable = "isStringConstant";
        // isComment
        TextBody isVariable = new TextBody(isNameExpr);
        TextBody isVariable = new TextBody(isNameExpr);
        // isComment
        MimeMultipart isVariable = isNameExpr.isMethod();
        MimeBodyPart isVariable = new MimeBodyPart(isNameExpr, "isStringConstant");
        MimeBodyPart isVariable = new MimeBodyPart(isNameExpr, "isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        // isComment
        MimeMessage isVariable = new MimeMessage();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        // isComment
        List<Part> isVariable = new ArrayList<>();
        ArrayList<Viewable> isVariable = new ArrayList<>();
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        ViewableExtractedText isVariable = isNameExpr.isMethod(isNameExpr);
        String isVariable = isNameExpr + "isStringConstant" + "isStringConstant" + isNameExpr;
        String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant";
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws MessagingException {
        isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        String isVariable = "isStringConstant";
        // isComment
        TextBody isVariable = new TextBody(isNameExpr);
        // isComment
        TextBody isVariable = new TextBody(isNameExpr);
        // isComment
        MimeMessage isVariable = new MimeMessage();
        isNameExpr.isMethod(new Date(isIntegerConstant, isIntegerConstant, isIntegerConstant), true);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new Address[] { new Address("isStringConstant") });
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(new Address("isStringConstant"));
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        // isComment
        MimeMultipart isVariable = isNameExpr.isMethod();
        MimeBodyPart isVariable = new MimeBodyPart(isNameExpr, "isStringConstant");
        MimeBodyPart isVariable = new MimeBodyPart(isNameExpr, "isStringConstant");
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        // isComment
        MimeMessage isVariable = new MimeMessage();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        // isComment
        List<Part> isVariable = new ArrayList<>();
        ArrayList<Viewable> isVariable = new ArrayList<>();
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        ViewableExtractedText isVariable = isNameExpr.isMethod(isNameExpr);
        String isVariable = isNameExpr + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + isNameExpr;
        String isVariable = "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant";
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws Exception {
        String isVariable = "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant";
        MimeMessage isVariable = isNameExpr.isMethod(new ByteArrayInputStream(isNameExpr.isMethod()), true);
        // isComment
        List<Part> isVariable = new ArrayList<>();
        ArrayList<Viewable> isVariable = new ArrayList<>();
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        String isVariable = "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant";
        String isVariable = "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant";
        isMethod(isIntegerConstant, isNameExpr.isMethod());
        isMethod("isStringConstant", ((MessageHeader) isNameExpr.isMethod(isIntegerConstant)).isMethod().isMethod());
        ViewableExtractedText isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws Exception {
        BodyPart isVariable = isMethod("isStringConstant");
        Message isVariable = isMethod(isMethod("isStringConstant", isMethod("isStringConstant", "isStringConstant"), isNameExpr));
        isNameExpr.isMethod(isNameExpr);
        AttachmentViewInfo isVariable = isMethod(AttachmentViewInfo.class);
        isMethod(isNameExpr, isNameExpr);
        MessageViewInfo isVariable = isNameExpr.isMethod(isNameExpr, null, true);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws Exception {
        Message isVariable = isMethod(isNameExpr, isMethod("isStringConstant", "isStringConstant", isMethod("isStringConstant", "isStringConstant"), isMethod("isStringConstant")));
        CryptoResultAnnotation isVariable = isNameExpr.isMethod(null, null, null, null, null, true);
        MessageCryptoAnnotations isVariable = isMethod(isNameExpr, isNameExpr);
        MessageViewInfo isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, true);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        Message isVariable = isMethod(isMethod("isStringConstant", "isStringConstant", isMethod("isStringConstant", "isStringConstant"), isMethod("isStringConstant")));
        MimeBodyPart isVariable = isMethod("isStringConstant", "isStringConstant");
        CryptoResultAnnotation isVariable = isNameExpr.isMethod(null, null, null, null, isNameExpr, true);
        MessageCryptoAnnotations isVariable = isMethod(isNameExpr, isNameExpr);
        MessageViewInfo isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, true);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        MimeBodyPart isVariable = isMethod("isStringConstant", "isStringConstant", isMethod("isStringConstant", "isStringConstant"), isMethod("isStringConstant"));
        BodyPart isVariable = isMethod("isStringConstant", "isStringConstant");
        Message isVariable = isMethod(isMethod("isStringConstant", isNameExpr, isNameExpr));
        CryptoResultAnnotation isVariable = isNameExpr.isMethod(null, null, null, null, null, true);
        MessageCryptoAnnotations isVariable = isMethod(isNameExpr, isNameExpr);
        MessageViewInfo isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, true);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        MimeBodyPart isVariable = isMethod("isStringConstant", "isStringConstant", isMethod("isStringConstant", "isStringConstant"), isMethod("isStringConstant"));
        BodyPart isVariable = isMethod("isStringConstant");
        Message isVariable = isMethod(isMethod("isStringConstant", isNameExpr, isNameExpr));
        CryptoResultAnnotation isVariable = isNameExpr.isMethod(null, null, null, null, null, true);
        MessageCryptoAnnotations isVariable = isMethod(isNameExpr, isNameExpr);
        AttachmentViewInfo isVariable = isMethod(AttachmentViewInfo.class);
        isMethod(isNameExpr, isNameExpr);
        MessageViewInfo isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, true);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        Message isVariable = isMethod(isMethod("isStringConstant", "isStringConstant", isMethod("isStringConstant"), isMethod("isStringConstant")));
        MessageViewInfo isVariable = isNameExpr.isMethod(isNameExpr, null, true);
        isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws Exception {
        MimeBodyPart isVariable = isMethod("isStringConstant", "isStringConstant");
        Message isVariable = isMethod(isMethod("isStringConstant", "isStringConstant", isMethod("isStringConstant"), isMethod("isStringConstant")));
        MessageCryptoAnnotations isVariable = new MessageCryptoAnnotations();
        CryptoResultAnnotation isVariable = isNameExpr.isMethod(null, null, null, null, isNameExpr, true);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        MessageViewInfo isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, true);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        MimeBodyPart isVariable = isMethod("isStringConstant", "isStringConstant");
        Message isVariable = isMethod(isMethod("isStringConstant", "isStringConstant", isMethod("isStringConstant"), isMethod("isStringConstant")));
        isNameExpr.isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant")[isIntegerConstant] + "isStringConstant");
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        MessageCryptoAnnotations isVariable = new MessageCryptoAnnotations();
        OpenPgpDecryptionResult isVariable = new OpenPgpDecryptionResult(isNameExpr.isFieldAccessExpr);
        CryptoResultAnnotation isVariable = isNameExpr.isMethod(isNameExpr, null, null, null, isNameExpr, true);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        MessageViewInfo isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, true);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        Message isVariable = isMethod(isMethod("isStringConstant", "isStringConstant", isMethod("isStringConstant", "isStringConstant"), isMethod("isStringConstant", "isStringConstant")));
        MessageViewInfo isVariable = isNameExpr.isMethod(isNameExpr, null, true);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr.isMethod());
        isMethod(isNameExpr.isFieldAccessExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        BodyPart isVariable = isMethod("isStringConstant");
        Message isVariable = isMethod(isMethod("isStringConstant", isMethod("isStringConstant", "isStringConstant", isMethod("isStringConstant", "isStringConstant"), isMethod("isStringConstant", "isStringConstant")), isNameExpr));
        AttachmentViewInfo isVariable = isMethod(AttachmentViewInfo.class);
        isMethod(isNameExpr, isNameExpr);
        MessageViewInfo isVariable = isNameExpr.isMethod(isNameExpr, null, true);
        isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isMethod(isIntegerConstant));
        isMethod(isNameExpr.isFieldAccessExpr.isMethod());
    }

    void isMethod(BodyPart isParameter, AttachmentViewInfo isParameter) throws MessagingException {
        isMethod(isNameExpr).isMethod(isNameExpr).isMethod(isNameExpr);
    }

    @NonNull
    MessageCryptoAnnotations isMethod(Part isParameter, CryptoResultAnnotation isParameter) {
        MessageCryptoAnnotations isVariable = new MessageCryptoAnnotations();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        return isNameExpr;
    }

    HtmlProcessor isMethod() {
        HtmlProcessor isVariable = isMethod(HtmlProcessor.class);
        isMethod(isNameExpr.isMethod(isMethod())).isMethod(new Answer<String>() {

            @Override
            public String isMethod(InvocationOnMock isParameter) throws Throwable {
                return (String) isNameExpr.isMethod()[isIntegerConstant];
            }
        });
        return isNameExpr;
    }

    private void isMethod(String isParameter) {
        Locale isVariable = new Locale(isNameExpr);
        Resources isVariable = isNameExpr.isMethod();
        Configuration isVariable = isNameExpr.isMethod();
        isNameExpr.isFieldAccessExpr = isNameExpr;
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
    }
}
