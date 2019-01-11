// isComment
package com.zegoggles.smssync.service;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import com.fsck.k9.mail.Message;
import com.fsck.k9.mail.internet.MimeMessage;
import com.fsck.k9.mail.store.imap.XOAuth2AuthenticationFailedException;
import com.zegoggles.smssync.auth.TokenRefreshException;
import com.zegoggles.smssync.auth.TokenRefresher;
import com.zegoggles.smssync.contacts.ContactAccessor;
import com.zegoggles.smssync.contacts.ContactGroup;
import com.zegoggles.smssync.contacts.ContactGroupIds;
import com.zegoggles.smssync.mail.BackupImapStore;
import com.zegoggles.smssync.mail.ConversionResult;
import com.zegoggles.smssync.mail.DataType;
import com.zegoggles.smssync.mail.MessageConverter;
import com.zegoggles.smssync.preferences.AuthPreferences;
import com.zegoggles.smssync.preferences.DataTypePreferences;
import com.zegoggles.smssync.preferences.Preferences;
import com.zegoggles.smssync.service.state.BackupState;
import com.zegoggles.smssync.service.state.SmsSyncState;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import java.util.EnumSet;
import java.util.HashMap;
import static com.google.common.truth.Truth.assertThat;
import static com.zegoggles.smssync.mail.DataType.CALLLOG;
import static com.zegoggles.smssync.mail.DataType.MMS;
import static com.zegoggles.smssync.mail.DataType.SMS;
import static com.zegoggles.smssync.service.BackupItemsFetcher.emptyCursor;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.eq;
import static org.mockito.Matchers.notNull;
import static org.mockito.Matchers.same;
import static org.mockito.Mockito.anyListOf;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(RobolectricTestRunner.class)
public class isClassOrIsInterface {

    BackupTask isVariable;

    BackupConfig isVariable;

    Context isVariable;

    @Mock
    BackupImapStore isVariable;

    @Mock
    BackupImapStore.BackupFolder isVariable;

    @Mock
    SmsBackupService isVariable;

    @Mock
    BackupState isVariable;

    @Mock
    BackupItemsFetcher isVariable;

    @Mock
    MessageConverter isVariable;

    @Mock
    CalendarSyncer isVariable;

    @Mock
    AuthPreferences isVariable;

    @Mock
    DataTypePreferences isVariable;

    @Mock
    Preferences isVariable;

    @Mock
    ContactAccessor isVariable;

    @Mock
    TokenRefresher isVariable;

    @Before
    public void isMethod() {
        isMethod(this);
        isNameExpr = isMethod(isNameExpr.isMethod(isNameExpr));
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isNameExpr = new BackupTask(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isNameExpr = isNameExpr.isFieldAccessExpr;
    }

    private BackupConfig isMethod(EnumSet<DataType> isParameter) {
        return new BackupConfig(isNameExpr, isIntegerConstant, isIntegerConstant, new ContactGroup(-isIntegerConstant), isNameExpr.isFieldAccessExpr, isNameExpr, true);
    }

    @Test
    public void isMethod() throws Exception {
        isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, null);
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr, isIntegerConstant);
        isMethod(isNameExpr.isMethod(isMethod(Cursor.class), isMethod(isNameExpr))).isMethod(isMethod(isNameExpr, isIntegerConstant));
        isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr)).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr, isIntegerConstant);
        isMethod(isNameExpr.isMethod(isMethod(Cursor.class), isMethod(isNameExpr))).isMethod(isMethod(isNameExpr, isIntegerConstant));
        isMethod(isNameExpr.isMethod(isMethod(DataType.class), isMethod(isNameExpr))).isMethod(isNameExpr);
        BackupState isVariable = isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(Message.class));
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, null);
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, null);
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod();
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr, isIntegerConstant);
        isMethod(isNameExpr, isIntegerConstant);
        isMethod(isNameExpr.isMethod(isMethod(DataType.class), isMethod(isNameExpr))).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isMethod(Cursor.class), isMethod(DataType.class))).isMethod(isMethod(isNameExpr, isIntegerConstant));
        BackupState isVariable = isNameExpr.isMethod(isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr)));
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isIntegerConstant);
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isMethod(Message.class));
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr, isIntegerConstant);
        isMethod(isNameExpr.isMethod(isMethod(Cursor.class), isMethod(isNameExpr))).isMethod(isMethod(isNameExpr, isIntegerConstant));
        isMethod(isNameExpr.isMethod(isMethod(DataType.class), isMethod(isNameExpr))).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isMethod()).isMethod(isNameExpr, isNameExpr);
        isMethod(isNameExpr, isMethod()).isMethod(isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr, isIntegerConstant);
        isMethod(isNameExpr.isMethod(isMethod(Cursor.class), isMethod(isNameExpr))).isMethod(isMethod(isNameExpr, isIntegerConstant));
        isMethod(isNameExpr.isMethod(isMethod(DataType.class), isMethod(isNameExpr))).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr, isIntegerConstant);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr.isMethod(isMethod(DataType.class))).isMethod(-isStringConstant);
        BackupState isVariable = isNameExpr.isMethod(new BackupConfig(isNameExpr, isIntegerConstant, isIntegerConstant, new ContactGroup(-isIntegerConstant), isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr), true));
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, -isIntegerConstant);
        isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr.isMethod()).isMethod();
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr, isIntegerConstant);
        isMethod(isNameExpr.isMethod(isMethod(Cursor.class), isMethod(DataType.class))).isMethod(isMethod(isNameExpr, isIntegerConstant));
        XOAuth2AuthenticationFailedException isVariable = isMethod(XOAuth2AuthenticationFailedException.class);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod(isMethod(DataType.class), isMethod(isNameExpr))).isMethod(isNameExpr);
        isMethod(new TokenRefreshException("isStringConstant")).isMethod(isNameExpr).isMethod();
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod();
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        // isComment
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr, isIntegerConstant);
        isMethod(isNameExpr.isMethod(isMethod(Cursor.class), isMethod(DataType.class))).isMethod(isMethod(isNameExpr, isIntegerConstant));
        XOAuth2AuthenticationFailedException isVariable = isMethod(XOAuth2AuthenticationFailedException.class);
        isMethod(isNameExpr.isMethod()).isMethod(isIntegerConstant);
        isMethod(isNameExpr.isMethod(isMethod(DataType.class), isMethod(isNameExpr))).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isNameExpr.isFieldAccessExpr, null);
        isMethod(isNameExpr, isMethod(isIntegerConstant)).isMethod(isNameExpr.isFieldAccessExpr, null);
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        // isComment
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr).isMethod();
    }

    private ConversionResult isMethod(DataType isParameter, int isParameter) {
        ConversionResult isVariable = new ConversionResult(isNameExpr);
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) {
            isNameExpr.isMethod(new MimeMessage(), new HashMap<String, String>());
        }
        return isNameExpr;
    }

    private void isMethod(DataType isParameter, final int isParameter) {
        isMethod(isNameExpr.isMethod(isMethod(isNameExpr), isMethod(ContactGroupIds.class), isMethod())).isMethod(new Answer<Object>() {

            @Override
            public Object isMethod(InvocationOnMock isParameter) throws Throwable {
                return isMethod(isNameExpr);
            }
        });
    }

    private Cursor isMethod(int isParameter) {
        MatrixCursor isVariable = new MatrixCursor(new String[] { "isStringConstant" });
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; isNameExpr++) {
            isNameExpr.isMethod(new Object[] { "isStringConstant" });
        }
        return isNameExpr;
    }

    private void isMethod() {
        isMethod(isNameExpr.isMethod(isMethod(DataType.class), isMethod(ContactGroupIds.class), isMethod())).isMethod(isMethod());
    }
}
