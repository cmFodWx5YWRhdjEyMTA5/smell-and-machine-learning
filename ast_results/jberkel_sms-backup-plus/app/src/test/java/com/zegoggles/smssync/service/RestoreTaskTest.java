// isComment
package com.zegoggles.smssync.service;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import android.provider.Telephony;
import com.fsck.k9.mail.MessagingException;
import com.fsck.k9.mail.store.imap.ImapMessage;
import com.zegoggles.smssync.Consts;
import com.zegoggles.smssync.auth.TokenRefresher;
import com.zegoggles.smssync.mail.BackupImapStore;
import com.zegoggles.smssync.mail.DataType;
import com.zegoggles.smssync.mail.MessageConverter;
import com.zegoggles.smssync.preferences.DataTypePreferences;
import com.zegoggles.smssync.preferences.Preferences;
import com.zegoggles.smssync.service.state.RestoreState;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static com.google.common.truth.Truth.assertThat;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyBoolean;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

@RunWith(RobolectricTestRunner.class)
public class isClassOrIsInterface {

    RestoreTask isVariable;

    RestoreConfig isVariable;

    @Mock
    BackupImapStore isVariable;

    @Mock
    BackupImapStore.BackupFolder isVariable;

    @Mock
    SmsRestoreService isVariable;

    @Mock
    RestoreState isVariable;

    @Mock
    MessageConverter isVariable;

    @Mock
    ContentResolver isVariable;

    @Mock
    TokenRefresher isVariable;

    @Before
    public void isMethod() throws MessagingException {
        isMethod(this);
        isNameExpr = new RestoreConfig(isNameExpr, isIntegerConstant, true, true, true, -isIntegerConstant, isIntegerConstant);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(new Preferences(isNameExpr.isFieldAccessExpr));
        isMethod(isNameExpr.isMethod(isMethod(DataType.class), isMethod(DataTypePreferences.class))).isMethod(isNameExpr);
        isNameExpr = new RestoreTask(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Test
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod();
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() throws Exception {
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod();
    }

    @Test
    public void isMethod() throws Exception {
        Date isVariable = new Date();
        List<ImapMessage> isVariable = new ArrayList<ImapMessage>();
        ContentValues isVariable = new ContentValues();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod());
        ImapMessage isVariable = isMethod(ImapMessage.class);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isMethod(), isMethod(), isMethod(Date.class))).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr)).isMethod(isNameExpr.isMethod("isStringConstant"));
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod("isStringConstant"), null, null);
        isMethod(isNameExpr.isMethod().isMethod().isMethod(isNameExpr.isFieldAccessExpr)).isMethod(isNameExpr.isMethod());
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr).isMethod();
    }
}
