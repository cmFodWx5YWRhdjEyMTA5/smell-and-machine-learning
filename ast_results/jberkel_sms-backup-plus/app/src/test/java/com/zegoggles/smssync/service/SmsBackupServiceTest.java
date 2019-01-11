// isComment
package com.zegoggles.smssync.service;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v4.app.NotificationCompat;
import android.telephony.TelephonyManager;
import com.fsck.k9.mail.MessagingException;
import com.zegoggles.smssync.contacts.ContactGroup;
import com.zegoggles.smssync.mail.DataType;
import com.zegoggles.smssync.preferences.AuthPreferences;
import com.zegoggles.smssync.preferences.DataTypePreferences;
import com.zegoggles.smssync.preferences.Preferences;
import com.zegoggles.smssync.service.exception.BackupDisabledException;
import com.zegoggles.smssync.service.exception.NoConnectionException;
import com.zegoggles.smssync.service.exception.RequiresLoginException;
import com.zegoggles.smssync.service.exception.RequiresWifiException;
import com.zegoggles.smssync.service.state.SmsSyncState;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.shadows.ShadowConnectivityManager;
import org.robolectric.shadows.ShadowNetworkInfo;
import org.robolectric.shadows.ShadowWifiManager;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import static android.content.pm.PackageManager.PERMISSION_GRANTED;
import static com.google.common.truth.Truth.assertThat;
import static com.zegoggles.smssync.service.BackupType.MANUAL;
import static com.zegoggles.smssync.service.BackupType.REGULAR;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyZeroInteractions;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.robolectric.Shadows.shadowOf;

@RunWith(RobolectricTestRunner.class)
public class isClassOrIsInterface {

    SmsBackupService isVariable;

    ShadowConnectivityManager isVariable;

    ShadowWifiManager isVariable;

    List<NotificationCompat.Builder> isVariable;

    @Mock
    AuthPreferences isVariable;

    @Mock
    Preferences isVariable;

    @Mock
    DataTypePreferences isVariable;

    @Mock
    BackupTask isVariable;

    @Mock
    BackupJobs isVariable;

    @Before
    public void isMethod() {
        isMethod(this);
        isNameExpr = new ArrayList<NotificationCompat.Builder>();
        isNameExpr = new SmsBackupService() {

            @Override
            public Context isMethod() {
                return isNameExpr.isFieldAccessExpr;
            }

            @Override
            public Resources isMethod() {
                return isMethod().isMethod();
            }

            @Override
            protected BackupTask isMethod() {
                return isNameExpr;
            }

            @Override
            protected BackupJobs isMethod() {
                return isNameExpr;
            }

            @Override
            protected Preferences isMethod() {
                return isNameExpr;
            }

            @Override
            public int isMethod(String isParameter, int isParameter, int isParameter) {
                return isNameExpr;
            }

            @Override
            protected AuthPreferences isMethod() {
                return isNameExpr;
            }

            @Override
            protected void isMethod(int isParameter, NotificationCompat.Builder isParameter) {
                isNameExpr.isMethod(isNameExpr);
            }
        };
        isNameExpr = isMethod(isNameExpr.isMethod());
        isNameExpr = isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod();
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr);
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr));
    }

    @After
    public void isMethod() {
        isNameExpr.isMethod();
    }

    @Test
    public void isMethod() throws Exception {
        Intent isVariable = new Intent(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(BackupConfig.class));
    }

    @Test
    public void isMethod() throws Exception {
        Intent isVariable = new Intent(isNameExpr.isMethod());
        isNameExpr.isMethod(null);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod().isFieldAccessExpr).isMethod(NoConnectionException.class);
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr.isMethod()).isMethod(true);
        Intent isVariable = new Intent(isNameExpr.isMethod());
        isNameExpr.isMethod(null);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(BackupConfig.class));
    }

    @Test
    public void isMethod() throws Exception {
        Intent isVariable = new Intent();
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod().isFieldAccessExpr).isMethod(RequiresWifiException.class);
    }

    @Test
    public void isMethod() throws Exception {
        Intent isVariable = new Intent();
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isMethod());
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod().isFieldAccessExpr).isMethod(RequiresWifiException.class);
    }

    @Test
    public void isMethod() throws Exception {
        Intent isVariable = new Intent();
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod().isFieldAccessExpr).isMethod(RequiresLoginException.class);
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isMethod(DataType.class));
        Intent isVariable = new Intent();
        isMethod(isNameExpr.isMethod()).isMethod(true);
        isNameExpr.isMethod(true);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod().isFieldAccessExpr).isMethod(BackupDisabledException.class);
        isMethod(isNameExpr.isMethod().isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Test
    public void isMethod() throws Exception {
        Intent isVariable = new Intent(isNameExpr.isMethod());
        ArgumentCaptor<BackupConfig> isVariable = isNameExpr.isMethod(BackupConfig.class);
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isNameExpr.isMethod());
        BackupConfig isVariable = isNameExpr.isMethod();
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isIntegerConstant);
    }

    @Test
    public void isMethod() throws Exception {
        isNameExpr.isMethod(true);
        Intent isVariable = new Intent(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr).isMethod(isMethod(BackupConfig.class));
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, null));
        isMethod(isNameExpr).isMethod();
        isMethod(isMethod(isNameExpr).isMethod()).isMethod();
        isMethod(isMethod(isNameExpr).isMethod()).isMethod();
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        Intent isVariable = new Intent(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod(isNameExpr.isMethod().isFieldAccessExpr).isMethod(MessagingException.class);
    }

    @Test
    public void isMethod() throws Exception {
        isMethod(isNameExpr.isMethod()).isMethod("isStringConstant");
        Intent isVariable = new Intent(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr);
        isMethod(isNameExpr);
        isMethod("isStringConstant", "isStringConstant");
        isMethod(isMethod(isNameExpr).isMethod()).isMethod();
        isMethod(isMethod(isNameExpr).isMethod()).isMethod();
    }

    private void isMethod(CharSequence isParameter, CharSequence isParameter) {
        isMethod(isNameExpr).isMethod(isIntegerConstant);
        NotificationCompat.Builder isVariable = isNameExpr.isMethod(isIntegerConstant);
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr);
        isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr);
    }

    private NetworkInfo isMethod() {
        return isNameExpr.isMethod(null, /*isComment*/
        isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, true, /*isComment*/
        true);
    }
}
