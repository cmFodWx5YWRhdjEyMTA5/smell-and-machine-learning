// isComment
package com.fsck.k9.message;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import com.fsck.k9.Account.QuoteStyle;
import com.fsck.k9.CoreResourceProvider;
import com.fsck.k9.Identity;
import com.fsck.k9.RobolectricTest;
import com.fsck.k9.TestCoreResourceProvider;
import com.fsck.k9.mail.Address;
import com.fsck.k9.mail.BodyPart;
import com.fsck.k9.mail.BoundaryGenerator;
import com.fsck.k9.mail.Message;
import com.fsck.k9.mail.Message.RecipientType;
import com.fsck.k9.mail.MessagingException;
import com.fsck.k9.mail.internet.MessageIdGenerator;
import com.fsck.k9.mail.internet.MimeMessage;
import com.fsck.k9.mail.internet.MimeMultipart;
import com.fsck.k9.message.MessageBuilder.Callback;
import com.fsck.k9.message.quote.InsertableHtmlContent;
import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.robolectric.Robolectric;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

public class isClassOrIsInterface extends RobolectricTest {

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final Address isVariable = new Address("isStringConstant", "isStringConstant");

    private static final Address[] isVariable = new Address[] { new Address("isStringConstant", "isStringConstant"), new Address("isStringConstant", "isStringConstant") };

    private static final Address[] isVariable = new Address[] { new Address("isStringConstant", "isStringConstant") };

    private static final Address[] isVariable = new Address[] { new Address("isStringConstant", "isStringConstant") };

    private static final String isVariable = "isStringConstant";

    private static final Date isVariable = new Date(isStringConstant);

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant";

    private static final String isVariable = "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant";

    private static final String isVariable = "isStringConstant" + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant";

    private static final String isVariable = "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant" + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant";

    private static final String isVariable = "isStringConstant" + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + "isStringConstant" + isNameExpr + "isStringConstant";

    private MessageIdGenerator isVariable;

    private BoundaryGenerator isVariable;

    private CoreResourceProvider isVariable = new TestCoreResourceProvider();

    private Callback isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr = isMethod(MessageIdGenerator.class);
        isMethod(isNameExpr.isMethod(isMethod(Message.class))).isMethod(isNameExpr);
        isNameExpr = isMethod(BoundaryGenerator.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = isMethod(Callback.class);
    }

    @Test
    public void isMethod() throws Exception {
        MessageBuilder isVariable = isMethod();
        isNameExpr.isMethod(isNameExpr);
        MimeMessage isVariable = isMethod();
        isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod()[isIntegerConstant]);
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr + isNameExpr, isMethod(isNameExpr));
    }

    @Test
    public void isMethod() throws Exception {
        MessageBuilder isVariable = isMethod();
        Attachment isVariable = isMethod("isStringConstant", "isStringConstant", isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod(isNameExpr);
        MimeMessage isVariable = isMethod();
        isMethod(isNameExpr + isNameExpr, isMethod(isNameExpr));
    }

    @Test
    public void isMethod() throws Exception {
        MessageBuilder isVariable = isMethod();
        Attachment isVariable = isMethod("isStringConstant", "isStringConstant", isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod(isNameExpr);
        MimeMessage isVariable = isMethod();
        isMethod(isNameExpr + isNameExpr, isMethod(isNameExpr));
    }

    @Test
    public void isMethod() throws Exception {
        MessageBuilder isVariable = isMethod();
        Attachment isVariable = isMethod("isStringConstant", isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod(isNameExpr);
        MimeMessage isVariable = isMethod();
        isMethod(isNameExpr + isNameExpr, isMethod(isNameExpr));
    }

    @Test
    public void isMethod() {
        MessageBuilder isVariable = isMethod();
        isNameExpr.isMethod(isNameExpr);
        MimeMessage isVariable = isMethod();
        isMethod(MimeMultipart.class, isNameExpr.isMethod().isMethod());
        isMethod("isStringConstant", ((MimeMultipart) isNameExpr.isMethod()).isMethod());
        List<BodyPart> isVariable = ((MimeMultipart) isNameExpr.isMethod()).isMethod();
        // isComment
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod(isIntegerConstant).isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        MessageBuilder isVariable = isMethod();
        Attachment isVariable = isMethod("isStringConstant", "isStringConstant", isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        isNameExpr.isMethod(isNameExpr);
        MimeMessage isVariable = isMethod();
        isMethod(isNameExpr + isNameExpr, isMethod(isNameExpr));
    }

    @Test
    public void isMethod() throws MessagingException {
        MessageBuilder isVariable = isMethod();
        Callback isVariable = isMethod(Callback.class);
        isNameExpr.isMethod().isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod();
        isNameExpr.isMethod().isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(MimeMessage.class), isMethod(true));
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws MessagingException {
        MessageBuilder isVariable = new SimpleMessageBuilder(isNameExpr, isNameExpr, isNameExpr) {

            @Override
            protected void isMethod() {
                isMethod(new MessagingException("isStringConstant"));
            }
        };
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(MessagingException.class));
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws MessagingException {
        Callback isVariable = isMethod(Callback.class);
        MessageBuilder isVariable = new SimpleMessageBuilder(isNameExpr, isNameExpr, isNameExpr) {

            @Override
            protected void isMethod() {
                isMethod(new MessagingException("isStringConstant"));
            }
        };
        isNameExpr.isMethod().isMethod();
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod();
        isNameExpr.isMethod().isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(MessagingException.class));
        isMethod(isNameExpr);
    }

    private MimeMessage isMethod() {
        ArgumentCaptor<MimeMessage> isVariable = isNameExpr.isMethod(MimeMessage.class);
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod(), isMethod(true));
        isMethod(isNameExpr);
        return isNameExpr.isMethod();
    }

    private String isMethod(MimeMessage isParameter) throws IOException, MessagingException {
        ByteArrayOutputStream isVariable = new ByteArrayOutputStream();
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr.isMethod();
    }

    private Attachment isMethod(final String isParameter, final String isParameter, String isParameter) throws Exception {
        final byte[] isVariable = isNameExpr.isMethod();
        final File isVariable = isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod();
        FileOutputStream isVariable = new FileOutputStream(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod();
        return new Attachment() {

            @Override
            public Long isMethod() {
                return (long) isNameExpr.isFieldAccessExpr;
            }

            @Override
            public String isMethod() {
                return isNameExpr;
            }

            @Override
            public String isMethod() {
                return isNameExpr;
            }

            @Override
            public String isMethod() {
                return isNameExpr.isMethod();
            }

            @Override
            public LoadingState isMethod() {
                return isNameExpr.isFieldAccessExpr;
            }
        };
    }

    private MessageBuilder isMethod() {
        Identity isVariable = isMethod();
        return new SimpleMessageBuilder(isNameExpr, isNameExpr, isNameExpr).isMethod(isNameExpr).isMethod(isNameExpr).isMethod(true).isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr.isMethod(isNameExpr)).isMethod("isStringConstant").isMethod("isStringConstant").isMethod(true).isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr).isMethod(new ArrayList<Attachment>()).isMethod("isStringConstant").isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr).isMethod("isStringConstant").isMethod(new InsertableHtmlContent()).isMethod(true).isMethod(true).isMethod(true).isMethod(true).isMethod(isIntegerConstant).isMethod(null).isMethod(true);
    }

    private MessageBuilder isMethod() {
        return isMethod().isMethod(isNameExpr.isFieldAccessExpr);
    }

    private Identity isMethod() {
        Identity isVariable = new Identity();
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(true);
        return isNameExpr;
    }
}
