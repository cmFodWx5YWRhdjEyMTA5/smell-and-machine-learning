// isComment
package com.fsck.k9.mail.store.imap;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import com.fsck.k9.mail.Body;
import com.fsck.k9.mail.FetchProfile;
import com.fsck.k9.mail.FetchProfile.Item;
import com.fsck.k9.mail.Flag;
import com.fsck.k9.mail.Folder;
import com.fsck.k9.mail.Folder.FolderType;
import com.fsck.k9.mail.Message;
import com.fsck.k9.mail.MessageRetrievalListener;
import com.fsck.k9.mail.MessagingException;
import com.fsck.k9.mail.Part;
import com.fsck.k9.mail.internet.BinaryTempFileBody;
import com.fsck.k9.mail.internet.MimeHeader;
import com.fsck.k9.mail.store.StoreConfig;
import okio.Buffer;
import org.apache.james.mime4j.util.MimeUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import static com.fsck.k9.mail.Folder.OPEN_MODE_RO;
import static com.fsck.k9.mail.Folder.OPEN_MODE_RW;
import static com.fsck.k9.mail.store.imap.ImapResponseHelper.createImapResponse;
import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.mockito.internal.util.collections.Sets.newSet;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = isNameExpr.isFieldAccessExpr, sdk = isIntegerConstant)
public class isClassOrIsInterface {

    private ImapStore isVariable;

    private ImapConnection isVariable;

    private StoreConfig isVariable;

    @Before
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod());
        isNameExpr = isMethod(ImapStore.class);
        isNameExpr = isMethod(StoreConfig.class);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isNameExpr = isMethod(ImapConnection.class);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isIntegerConstant, isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod();
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(IOException.class).isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod();
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(IOException.class).isMethod(isNameExpr).isMethod("isStringConstant");
        try {
            isNameExpr.isMethod(isNameExpr);
            isMethod("isStringConstant");
        } catch (MessagingException isParameter) {
            isMethod(isNameExpr.isMethod());
            isMethod(IOException.class, isNameExpr.isMethod().isMethod());
        }
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(MessagingException.class).isMethod(isNameExpr).isMethod("isStringConstant");
        try {
            isNameExpr.isMethod(isNameExpr);
            isMethod("isStringConstant");
        } catch (MessagingException isParameter) {
        }
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        List<ImapResponse> isVariable = isMethod(isMethod("isStringConstant"), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        try {
            isNameExpr.isMethod(isNameExpr);
            isMethod("isStringConstant");
        } catch (MessagingException isParameter) {
            isMethod("isStringConstant", isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        boolean isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(NegativeImapResponseException.class).isMethod(isNameExpr).isMethod("isStringConstant");
        boolean isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        boolean isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(NegativeImapResponseException.class).isMethod(isNameExpr).isMethod("isStringConstant");
        boolean isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        Folder isVariable = isMethod(Folder.class);
        List<ImapMessage> isVariable = isMethod(isMethod(ImapMessage.class));
        try {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            isMethod("isStringConstant");
        } catch (MessagingException isParameter) {
            isMethod("isStringConstant", isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        ImapFolder isVariable = isMethod("isStringConstant");
        List<ImapMessage> isVariable = isNameExpr.isMethod();
        Map<String, String> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        List<ImapMessage> isVariable = isMethod(isMethod(ImapMessage.class));
        try {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            isMethod("isStringConstant");
        } catch (MessagingException isParameter) {
            isMethod("isStringConstant", isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        ImapFolder isVariable = isMethod("isStringConstant");
        List<ImapMessage> isVariable = isMethod(isMethod("isStringConstant"));
        List<ImapResponse> isVariable = isMethod(isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        Map<String, String> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        ImapFolder isVariable = isMethod("isStringConstant");
        List<ImapMessage> isVariable = isMethod(isMethod("isStringConstant"));
        List<ImapResponse> isVariable = isMethod(isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        Map<String, String> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr.isMethod("isStringConstant"));
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        ImapFolder isVariable = isMethod("isStringConstant");
        List<ImapMessage> isVariable = isMethod(isMethod("isStringConstant"));
        List<ImapResponse> isVariable = isMethod(isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        ImapFolder isVariable = isMethod("isStringConstant");
        List<ImapMessage> isVariable = isNameExpr.isMethod();
        Map<String, String> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        List<ImapMessage> isVariable = isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        List<ImapMessage> isVariable = isMethod(isMethod("isStringConstant"));
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isMethod(isNameExpr).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        List<ImapMessage> isVariable = isMethod(isMethod("isStringConstant"));
        List<ImapResponse> isVariable = isMethod(isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isMethod(isNameExpr).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        List<ImapMessage> isVariable = isMethod(isMethod("isStringConstant"));
        List<ImapResponse> isVariable = isMethod(isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(NegativeImapResponseException.class).isMethod(isNameExpr.isMethod()).isMethod(isNameExpr).isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isMethod(isNameExpr).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        try {
            isNameExpr.isMethod();
            isMethod("isStringConstant");
        } catch (MessagingException isParameter) {
            isMethod("isStringConstant", isNameExpr);
        }
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(new IOException());
        isNameExpr.isMethod(isNameExpr);
        try {
            isNameExpr.isMethod();
            isMethod("isStringConstant");
        } catch (MessagingException isParameter) {
            isMethod("isStringConstant", isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        List<ImapResponse> isVariable = isMethod(isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod();
        isMethod(isIntegerConstant, isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        try {
            isNameExpr.isMethod();
            isMethod("isStringConstant");
        } catch (MessagingException isParameter) {
            isMethod("isStringConstant", isNameExpr);
        }
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        List<ImapResponse> isVariable = isMethod(isMethod("isStringConstant"), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod();
        isMethod(isIntegerConstant, isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        List<ImapResponse> isVariable = isMethod(isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        long isVariable = isNameExpr.isMethod();
        isMethod(isStringConstant, isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod(NegativeImapResponseException.class).isMethod(isNameExpr).isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        long isVariable = isNameExpr.isMethod();
        isMethod(-isStringConstant, isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod(IOException.class).isMethod(isNameExpr).isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        try {
            isNameExpr.isMethod();
            isMethod("isStringConstant");
        } catch (MessagingException isParameter) {
            isMethod("isStringConstant", isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        List<ImapResponse> isVariable = isMethod(isMethod("isStringConstant"), isMethod("isStringConstant"), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        List<ImapMessage> isVariable = isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, null, null);
        isMethod(isNameExpr);
        isMethod(isMethod("isStringConstant", "isStringConstant", "isStringConstant"), isMethod(isNameExpr));
    }

    @Test
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"));
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        List<ImapResponse> isVariable = isMethod(isMethod("isStringConstant"), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        List<ImapMessage> isVariable = isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, new Date(isStringConstant), null);
        isMethod(isNameExpr);
        isMethod(isMethod("isStringConstant", "isStringConstant"), isMethod(isNameExpr));
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        List<ImapResponse> isVariable = isMethod(isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        MessageRetrievalListener<ImapMessage> isVariable = isMethod();
        List<ImapMessage> isVariable = isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, null, isNameExpr);
        ImapMessage isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr).isMethod("isStringConstant", isIntegerConstant, isIntegerConstant);
        isMethod(isNameExpr).isMethod(isNameExpr, isIntegerConstant, isIntegerConstant);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        try {
            isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, null, null);
            isMethod("isStringConstant");
        } catch (MessagingException isParameter) {
            isMethod("isStringConstant", isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        try {
            isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, null, null);
            isMethod("isStringConstant");
        } catch (MessagingException isParameter) {
            isMethod("isStringConstant", isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        try {
            isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, null, null);
            isMethod("isStringConstant");
        } catch (MessagingException isParameter) {
            isMethod("isStringConstant", isNameExpr.isMethod());
        }
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        try {
            isNameExpr.isMethod(isIntegerConstant, isIntegerConstant, null, null);
            isMethod("isStringConstant");
        } catch (MessagingException isParameter) {
            isMethod("isStringConstant", isNameExpr);
        }
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        try {
            isNameExpr.isMethod(isMethod(isStringConstant, isStringConstant, isStringConstant), true, null);
            isMethod("isStringConstant");
        } catch (MessagingException isParameter) {
            isMethod("isStringConstant", isNameExpr);
        }
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        List<ImapResponse> isVariable = isMethod(isMethod("isStringConstant"), isMethod("isStringConstant"), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        List<ImapMessage> isVariable = isNameExpr.isMethod(isMethod(isStringConstant, isStringConstant, isStringConstant), true, null);
        isMethod(isNameExpr);
        isMethod(isMethod("isStringConstant", "isStringConstant", "isStringConstant"), isMethod(isNameExpr));
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        List<ImapResponse> isVariable = isMethod(isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        MessageRetrievalListener<ImapMessage> isVariable = isMethod();
        List<ImapMessage> isVariable = isNameExpr.isMethod(isMethod(isStringConstant), true, isNameExpr);
        ImapMessage isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr).isMethod("isStringConstant", isIntegerConstant, isIntegerConstant);
        isMethod(isNameExpr).isMethod(isNameExpr, isIntegerConstant, isIntegerConstant);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        try {
            isNameExpr.isMethod(isMethod("isStringConstant", "isStringConstant", "isStringConstant"));
            isMethod("isStringConstant");
        } catch (MessagingException isParameter) {
            isMethod("isStringConstant", isNameExpr);
        }
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        List<ImapResponse> isVariable = isMethod(isMethod("isStringConstant"), isMethod("isStringConstant"), isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        List<ImapMessage> isVariable = isNameExpr.isMethod(isMethod("isStringConstant", "isStringConstant", "isStringConstant"));
        isMethod(isNameExpr);
        isMethod(isMethod("isStringConstant", "isStringConstant", "isStringConstant"), isMethod(isNameExpr));
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        try {
            isNameExpr.isMethod(isIntegerConstant, new Date());
            isMethod("isStringConstant");
        } catch (MessagingException isParameter) {
            isMethod("isStringConstant", isNameExpr);
        }
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        List<ImapResponse> isVariable = isMethod(isMethod("isStringConstant"));
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        boolean isVariable = isNameExpr.isMethod(isIntegerConstant, null);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        boolean isVariable = isNameExpr.isMethod(isIntegerConstant, null);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        boolean isVariable = isNameExpr.isMethod(isIntegerConstant, null);
        isMethod(isNameExpr);
        // isComment
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isIntegerConstant, null);
        isMethod(isNameExpr).isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        FetchProfile isVariable = isMethod();
        isNameExpr.isMethod(null, isNameExpr, null);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        FetchProfile isVariable = isMethod();
        isNameExpr.isMethod(isNameExpr.<ImapMessage>isMethod(), isNameExpr, null);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isMethod(ImapResponseCallback.class))).isMethod(isMethod("isStringConstant"));
        List<ImapMessage> isVariable = isMethod("isStringConstant");
        FetchProfile isVariable = isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr, null);
        isMethod(isNameExpr).isMethod("isStringConstant", true);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isMethod(ImapResponseCallback.class))).isMethod(isMethod("isStringConstant"));
        List<ImapMessage> isVariable = isMethod("isStringConstant");
        FetchProfile isVariable = isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr, null);
        isMethod(isNameExpr).isMethod("isStringConstant" + "isStringConstant" + "isStringConstant", true);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isMethod(ImapResponseCallback.class))).isMethod(isMethod("isStringConstant"));
        List<ImapMessage> isVariable = isMethod("isStringConstant");
        FetchProfile isVariable = isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr, null);
        isMethod(isNameExpr).isMethod("isStringConstant", true);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isMethod(ImapResponseCallback.class))).isMethod(isMethod("isStringConstant"));
        List<ImapMessage> isVariable = isMethod("isStringConstant");
        FetchProfile isVariable = isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr, isNameExpr, null);
        isMethod(isNameExpr).isMethod("isStringConstant", true);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isMethod(ImapResponseCallback.class))).isMethod(isMethod("isStringConstant"));
        List<ImapMessage> isVariable = isMethod("isStringConstant");
        FetchProfile isVariable = isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr, isNameExpr, null);
        isMethod(isNameExpr).isMethod("isStringConstant", true);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isMethod(ImapResponseCallback.class))).isMethod(isMethod("isStringConstant"));
        List<ImapMessage> isVariable = isMethod("isStringConstant");
        FetchProfile isVariable = isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr, null);
        isMethod(isNameExpr).isMethod("isStringConstant", true);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        List<ImapMessage> isVariable = isMethod("isStringConstant");
        FetchProfile isVariable = isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod(isMethod(ImapResponseCallback.class))).isMethod(isMethod("isStringConstant")).isMethod(isMethod("isStringConstant"));
        isNameExpr.isMethod(isNameExpr, isNameExpr, null);
        ImapMessage isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, true);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isNameExpr.isMethod(isNameExpr);
        ImapMessage isVariable = isMethod("isStringConstant");
        Part isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(isMethod(ImapResponseCallback.class))).isMethod(isMethod("isStringConstant"));
        isNameExpr.isMethod(isNameExpr, isNameExpr, null);
        isMethod(isNameExpr).isMethod("isStringConstant", true);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        ImapMessage isVariable = isMethod("isStringConstant");
        Part isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(isMethod(ImapResponseCallback.class))).isMethod(isMethod("isStringConstant"));
        isNameExpr.isMethod(isNameExpr, isNameExpr, null);
        isMethod(isNameExpr).isMethod("isStringConstant", true);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        ImapMessage isVariable = isMethod("isStringConstant");
        Part isVariable = isMethod("isStringConstant");
        isMethod();
        isNameExpr.isMethod(isNameExpr, isNameExpr, null);
        ArgumentCaptor<Body> isVariable = isNameExpr.isMethod(Body.class);
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        Body isVariable = isNameExpr.isMethod();
        Buffer isVariable = new Buffer();
        isNameExpr.isMethod(isNameExpr.isMethod());
        isMethod("isStringConstant", isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        List<ImapMessage> isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isMethod("isStringConstant"));
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod("isStringConstant", true);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        ImapMessage isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(new String[isIntegerConstant]);
        String isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        ImapMessage isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(new String[] { "isStringConstant" });
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        ImapMessage isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(new String[] { "isStringConstant" });
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isMethod(isMethod("isStringConstant")));
        String isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod("isStringConstant", isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod();
        isMethod(isNameExpr).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr), true);
        isMethod(isNameExpr).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        ImapMessage isVariable = isMethod("isStringConstant");
        String isVariable = isNameExpr.isMethod("isStringConstant", isNameExpr);
        isMethod("isStringConstant", isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        ImapMessage isVariable = isMethod("isStringConstant");
        String isVariable = isNameExpr.isMethod("isStringConstant", isNameExpr);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isNameExpr.isMethod("isStringConstant", isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.<Flag>isMethod());
        isMethod(isNameExpr).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isNameExpr.isMethod("isStringConstant", isNameExpr.<Flag>isMethod(), isNameExpr.<Flag>isMethod());
        isMethod(isNameExpr).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(true);
        try {
            isNameExpr.isMethod("isStringConstant", isNameExpr.<Flag>isMethod(), isNameExpr.<Flag>isMethod());
            isMethod("isStringConstant");
        } catch (MessagingException isParameter) {
            isMethod("isStringConstant", isNameExpr.isMethod());
        }
    }

    @Test(expected = Error.class)
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        isNameExpr.isMethod(true);
    }

    @Test
    public void isMethod() throws Exception {
        ImapFolder isVariable = isMethod("isStringConstant");
        ImapMessage isVariable = isNameExpr.isMethod("isStringConstant");
        isMethod("isStringConstant", isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod());
    }

    private Part isMethod(String isParameter) {
        Part isVariable = isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod(new String[] { isNameExpr.isFieldAccessExpr });
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod(new String[] { "isStringConstant" });
        return isNameExpr;
    }

    private void isMethod() throws IOException {
        isMethod(isNameExpr.isMethod(isMethod(ImapResponseCallback.class))).isMethod(new Answer<ImapResponse>() {

            @Override
            public ImapResponse isMethod(InvocationOnMock isParameter) throws Throwable {
                ImapResponseCallback isVariable = (ImapResponseCallback) isNameExpr.isMethod()[isIntegerConstant];
                return isMethod(isNameExpr);
            }
        }).isMethod(new Answer<ImapResponse>() {

            @Override
            public ImapResponse isMethod(InvocationOnMock isParameter) throws Throwable {
                ImapResponseCallback isVariable = (ImapResponseCallback) isNameExpr.isMethod()[isIntegerConstant];
                return isNameExpr.isMethod(isNameExpr, "isStringConstant");
            }
        });
    }

    private ImapResponse isMethod(ImapResponseCallback isParameter) {
        ImapResponse isVariable = isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        ImapList isVariable = new ImapList();
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr;
    }

    private Set<String> isMethod(List<ImapMessage> isParameter) {
        Set<String> isVariable = new HashSet<>();
        for (Message isVariable : isNameExpr) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        return isNameExpr;
    }

    private ImapFolder isMethod(String isParameter) {
        return new ImapFolder(isNameExpr, isNameExpr, isNameExpr.isMethod());
    }

    private ImapMessage isMethod(String isParameter) {
        ImapMessage isVariable = isMethod(ImapMessage.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        return isNameExpr;
    }

    private List<ImapMessage> isMethod(String... isParameter) {
        List<ImapMessage> isVariable = new ArrayList<>(isNameExpr.isFieldAccessExpr);
        for (String isVariable : isNameExpr) {
            ImapMessage isVariable = isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr;
    }

    private Part isMethod(String isParameter) {
        Part isVariable = isMethod(Part.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        return isNameExpr;
    }

    private FetchProfile isMethod(Item... isParameter) {
        FetchProfile isVariable = new FetchProfile();
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        return isNameExpr;
    }

    @SuppressWarnings("isStringConstant")
    private MessageRetrievalListener<ImapMessage> isMethod() {
        return isMethod(MessageRetrievalListener.class);
    }

    private void isMethod(int isParameter) throws MessagingException, IOException {
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        List<ImapResponse> isVariable = isMethod(isMethod("isStringConstant"), isMethod("isStringConstant" + "isStringConstant"), isMethod("isStringConstant"), isMethod("isStringConstant"), isMethod("isStringConstant"), isMethod("isStringConstant"), (isNameExpr == isNameExpr) ? isMethod("isStringConstant") : isMethod("isStringConstant"));
        if (isNameExpr == isNameExpr) {
            isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        } else {
            isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        }
    }

    private void isMethod(String isParameter, MessagingException isParameter) {
        isMethod("isStringConstant" + isNameExpr + "isStringConstant", isNameExpr.isMethod());
    }
}
