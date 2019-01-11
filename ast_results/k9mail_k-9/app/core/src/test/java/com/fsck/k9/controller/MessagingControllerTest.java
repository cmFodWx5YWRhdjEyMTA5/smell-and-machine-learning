// isComment
package com.fsck.k9.controller;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import android.content.Context;
import com.fsck.k9.Account;
import com.fsck.k9.Account.SpecialFolderSelection;
import com.fsck.k9.AccountPreferenceSerializer;
import com.fsck.k9.AccountStats;
import com.fsck.k9.CoreResourceProvider;
import com.fsck.k9.DI;
import com.fsck.k9.K9;
import com.fsck.k9.K9RobolectricTest;
import com.fsck.k9.Preferences;
import com.fsck.k9.backend.BackendManager;
import com.fsck.k9.backend.api.Backend;
import com.fsck.k9.helper.Contacts;
import com.fsck.k9.mail.AuthenticationFailedException;
import com.fsck.k9.mail.CertificateValidationException;
import com.fsck.k9.mail.FetchProfile;
import com.fsck.k9.mail.Flag;
import com.fsck.k9.mail.Folder;
import com.fsck.k9.mail.MessageRetrievalListener;
import com.fsck.k9.mail.MessagingException;
import com.fsck.k9.mailstore.LocalFolder;
import com.fsck.k9.mailstore.LocalMessage;
import com.fsck.k9.mailstore.LocalStore;
import com.fsck.k9.mailstore.LocalStoreProvider;
import com.fsck.k9.mailstore.OutboxState;
import com.fsck.k9.mailstore.OutboxStateRepository;
import com.fsck.k9.mailstore.SendState;
import com.fsck.k9.mailstore.UnavailableStorageException;
import com.fsck.k9.notification.NotificationController;
import com.fsck.k9.search.LocalSearch;
import com.fsck.k9.search.SearchAccount;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.koin.standalone.StandAloneContext;
import org.mockito.ArgumentCaptor;
import org.mockito.ArgumentMatchers;
import org.mockito.Captor;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.shadows.ShadowLog;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.nullable;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.inOrder;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;

@SuppressWarnings("isStringConstant")
public class isClassOrIsInterface extends K9RobolectricTest {

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final int isVariable = isIntegerConstant;

    private static final String isVariable = "isStringConstant";

    private MessagingController isVariable;

    private Account isVariable;

    @Mock
    private BackendManager isVariable;

    @Mock
    private Backend isVariable;

    @Mock
    private LocalStoreProvider isVariable;

    @Mock
    private Contacts isVariable;

    @Mock
    private AccountStats isVariable;

    @Mock
    private SimpleMessagingListener isVariable;

    @Mock
    private LocalSearch isVariable;

    @Mock
    private LocalFolder isVariable;

    @Mock
    private LocalFolder isVariable;

    @Mock
    private LocalStore isVariable;

    @Mock
    private NotificationController isVariable;

    @Captor
    private ArgumentCaptor<List<LocalFolder>> isVariable;

    @Captor
    private ArgumentCaptor<FetchProfile> isVariable;

    @Captor
    private ArgumentCaptor<MessageRetrievalListener<LocalMessage>> isVariable;

    private Context isVariable;

    private Set<Flag> isVariable;

    private Set<Flag> isVariable;

    private List<String> isVariable;

    @Mock
    private LocalMessage isVariable;

    @Mock
    private LocalMessage isVariable;

    @Mock
    private LocalMessage isVariable;

    private volatile boolean isVariable = true;

    private AccountStatsCollector isVariable = new AccountStatsCollector() {

        @NotNull
        @Override
        public AccountStats isMethod(@NotNull SearchAccount isParameter) {
            return isNameExpr;
        }

        @Nullable
        @Override
        public AccountStats isMethod(@NotNull Account isParameter) {
            return isNameExpr;
        }
    };

    @Before
    public void isMethod() throws MessagingException {
        isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod(this);
        isNameExpr = isNameExpr.isFieldAccessExpr;
        isNameExpr = new MessagingController(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isMethod(CoreResourceProvider.class), isNameExpr, isNameExpr.<ControllerExtension>isMethod());
        isMethod();
        isMethod();
        isMethod();
    }

    @After
    public void isMethod() throws Exception {
        isMethod();
        isNameExpr.isMethod();
        isNameExpr.isFieldAccessExpr.isMethod();
    }

    @Test
    public void isMethod() throws MessagingException {
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws MessagingException {
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() throws MessagingException {
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr, isMethod()).isMethod();
    }

    @Test(expected = UnavailableAccountException.class)
    public void isMethod() throws MessagingException {
        isMethod(new UnavailableStorageException("isStringConstant")).isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Test()
    public void isMethod() throws MessagingException {
        isMethod(new RuntimeException("isStringConstant")).isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr);
        try {
            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        } catch (Exception isParameter) {
        }
        isMethod(isNameExpr, isMethod()).isMethod();
    }

    @Test()
    public void isMethod() throws MessagingException {
        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr, isMethod()).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws MessagingException {
        List<LocalFolder> isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(true)).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, true, isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws MessagingException {
        List<LocalFolder> isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(true)).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, true, isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr), isNameExpr.isMethod());
        isMethod(isNameExpr, isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws MessagingException {
        isMethod(isNameExpr.isMethod(true)).isMethod(new MessagingException("isStringConstant"));
        isNameExpr.isMethod(isNameExpr, true, isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr, "isStringConstant");
    }

    @Test
    public void isMethod() throws MessagingException {
        isMethod(isNameExpr.isMethod(true)).isMethod(new MessagingException("isStringConstant"));
        isNameExpr.isMethod(isNameExpr, true, isNameExpr);
        isMethod(isNameExpr, isMethod()).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws MessagingException {
        List<LocalFolder> isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(true)).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, true, isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws MessagingException {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr));
        isMethod(isNameExpr.isMethod()).isMethod(new String[] { "isStringConstant" });
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(MessageRetrievalListener.class), isMethod(isNameExpr));
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr));
        LocalMessage isVariable = isMethod(LocalMessage.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(new String[] { "isStringConstant" });
        isMethod(isNameExpr.isMethod(isMethod(MessageRetrievalListener.class), isMethod(isNameExpr))).isMethod(new MessagingException("isStringConstant"));
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod(), isMethod(isNameExpr));
        isNameExpr.isMethod().isMethod(isNameExpr, isIntegerConstant, isIntegerConstant);
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr), isMethod((String) null), isMethod(isNameExpr.isMethod(isNameExpr)));
    }

    private void isMethod() throws Exception {
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr));
        isNameExpr = new ArrayList<>();
        isNameExpr.isMethod(isNameExpr, "isStringConstant", "isStringConstant", "isStringConstant");
        List<String> isVariable = new ArrayList<>();
        isNameExpr.isMethod(isNameExpr, "isStringConstant", "isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod(isMethod(isNameExpr), isMethod(), isMethod(Set.class), isMethod(Set.class))).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr.<String>isMethod())).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod("isStringConstant")).isMethod(new Answer<LocalMessage>() {

            @Override
            public LocalMessage isMethod(InvocationOnMock isParameter) throws Throwable {
                if (isNameExpr) {
                    return isNameExpr;
                } else
                    return null;
            }
        });
        isMethod(new Answer<Void>() {

            @Override
            public Void isMethod(InvocationOnMock isParameter) throws Throwable {
                isNameExpr = true;
                return null;
            }
        }).isMethod(isNameExpr).isMethod(isMethod(isNameExpr), isMethod("isStringConstant"), isMethod(FetchProfile.class));
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isIntegerConstant);
    }

    @Test
    public void isMethod() throws Exception {
        isMethod();
        isNameExpr.isMethod(isNameExpr, isNameExpr, "isStringConstant", isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        isMethod();
        isNameExpr.isMethod(isNameExpr, isNameExpr, "isStringConstant", isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr, "isStringConstant", isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        isMethod();
        isNameExpr.isMethod(isNameExpr, isNameExpr, "isStringConstant", isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        isMethod();
        isNameExpr.isMethod(isNameExpr, isNameExpr, "isStringConstant", isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        isMethod();
        isNameExpr.isMethod(isNameExpr, isNameExpr, "isStringConstant", isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr, isMethod()).isMethod("isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        isMethod();
        isNameExpr.isMethod(isNameExpr, isNameExpr, "isStringConstant", isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(isNameExpr), isMethod("isStringConstant"), isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        isMethod();
        isNameExpr.isMethod(isNameExpr, isNameExpr, "isStringConstant", isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr, isMethod()).isMethod(isMethod(isNameExpr), isMethod("isStringConstant"), isNameExpr.isMethod());
    }

    @Test
    public void isMethod() throws Exception {
        isMethod();
        isMethod(isNameExpr.isMethod(isMethod(), isMethod(), isMethod(Set.class), isMethod(Set.class))).isMethod(new MessagingException("isStringConstant"));
        isNameExpr.isMethod(isNameExpr, isNameExpr, "isStringConstant", isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(null, "isStringConstant");
    }

    @Test
    public void isMethod() throws Exception {
        isMethod();
        isMethod(isNameExpr.isMethod(isMethod(), isMethod(String.class), isMethod(Set.class), isMethod(Set.class))).isMethod(new MessagingException("isStringConstant"));
        isNameExpr.isMethod(isNameExpr, isNameExpr, "isStringConstant", isNameExpr, isNameExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr, isIntegerConstant, isIntegerConstant, isNameExpr.<String>isMethod());
    }

    @Test
    public void isMethod() throws MessagingException {
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws MessagingException {
        isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws MessagingException {
        isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr, "isStringConstant", isIntegerConstant, isIntegerConstant);
    }

    @Test
    public void isMethod() throws MessagingException {
        isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws MessagingException {
        isMethod();
        isNameExpr.isMethod(isNameExpr);
        InOrder isVariable = isMethod(isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, true);
        isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, true);
    }

    @Test
    public void isMethod() throws MessagingException {
        isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, true);
    }

    @Test
    public void isMethod() throws MessagingException {
        isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr, "isStringConstant", isIntegerConstant, isIntegerConstant);
    }

    @Test
    public void isMethod() throws MessagingException {
        isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr, "isStringConstant", isIntegerConstant, isIntegerConstant);
    }

    @Test
    public void isMethod() throws MessagingException {
        isMethod();
        isMethod(new AuthenticationFailedException("isStringConstant")).isMethod(isNameExpr).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr, true);
    }

    @Test
    public void isMethod() throws MessagingException {
        isMethod();
        isMethod(new CertificateValidationException("isStringConstant")).isMethod(isNameExpr).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr, true);
    }

    @Test
    public void isMethod() throws MessagingException {
        isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr);
    }

    private void isMethod() throws MessagingException {
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isStringConstant);
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isMethod(isNameExpr.isMethod(null)).isMethod(isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(isStringConstant);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)).isMethod(new String[] {});
        OutboxState isVariable = new OutboxState(isNameExpr.isFieldAccessExpr, isIntegerConstant, null, isIntegerConstant);
        OutboxStateRepository isVariable = isMethod(OutboxStateRepository.class);
        isMethod(isNameExpr.isMethod(isStringConstant)).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
    }

    private void isMethod() {
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
    }

    private void isMethod() throws MessagingException {
        // isComment
        isNameExpr = isMethod(new Account(isNameExpr));
        isNameExpr.isMethod(AccountPreferenceSerializer.class).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(true).isMethod(isNameExpr).isMethod(isNameExpr);
    }

    private void isMethod() throws MessagingException {
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(true)).isMethod(isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
    }

    private void isMethod(Map<String, Account> isParameter) throws Exception {
        // isComment
        Field isVariable = Preferences.class.isMethod("isStringConstant");
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr);
        Field isVariable = Preferences.class.isMethod("isStringConstant");
        isNameExpr.isMethod(true);
        ArrayList<Account> isVariable = new ArrayList<>(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr);
    }

    private void isMethod() {
        isNameExpr.isMethod(isNameExpr).isMethod();
    }
}
