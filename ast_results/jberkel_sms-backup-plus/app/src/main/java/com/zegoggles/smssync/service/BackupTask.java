// isComment
package com.zegoggles.smssync.service;

import android.content.Context;
import android.os.AsyncTask;
import android.support.annotation.NonNull;
import android.util.Log;
import com.fsck.k9.mail.AuthenticationFailedException;
import com.fsck.k9.mail.Message;
import com.fsck.k9.mail.MessagingException;
import com.fsck.k9.mail.store.imap.XOAuth2AuthenticationFailedException;
import com.squareup.otto.Subscribe;
import com.zegoggles.smssync.App;
import com.zegoggles.smssync.R;
import com.zegoggles.smssync.auth.OAuth2Client;
import com.zegoggles.smssync.auth.TokenRefreshException;
import com.zegoggles.smssync.auth.TokenRefresher;
import com.zegoggles.smssync.calendar.CalendarAccessor;
import com.zegoggles.smssync.contacts.ContactAccessor;
import com.zegoggles.smssync.contacts.ContactGroupIds;
import com.zegoggles.smssync.mail.BackupImapStore;
import com.zegoggles.smssync.mail.CallFormatter;
import com.zegoggles.smssync.mail.ConversionResult;
import com.zegoggles.smssync.mail.DataType;
import com.zegoggles.smssync.mail.MessageConverter;
import com.zegoggles.smssync.mail.PersonLookup;
import com.zegoggles.smssync.preferences.AuthPreferences;
import com.zegoggles.smssync.preferences.Preferences;
import com.zegoggles.smssync.service.state.BackupState;
import com.zegoggles.smssync.service.state.SmsSyncState;
import java.util.List;
import java.util.Locale;
import static com.zegoggles.smssync.App.LOCAL_LOGV;
import static com.zegoggles.smssync.App.TAG;
import static com.zegoggles.smssync.mail.DataType.CALLLOG;
import static com.zegoggles.smssync.mail.DataType.Defaults.MAX_SYNCED_DATE;
import static com.zegoggles.smssync.mail.DataType.MMS;
import static com.zegoggles.smssync.mail.DataType.SMS;
import static com.zegoggles.smssync.service.BackupType.MANUAL;
import static com.zegoggles.smssync.service.BackupType.SKIP;
import static com.zegoggles.smssync.service.state.SmsSyncState.BACKUP;
import static com.zegoggles.smssync.service.state.SmsSyncState.CALC;
import static com.zegoggles.smssync.service.state.SmsSyncState.CANCELED_BACKUP;
import static com.zegoggles.smssync.service.state.SmsSyncState.ERROR;
import static com.zegoggles.smssync.service.state.SmsSyncState.FINISHED_BACKUP;
import static com.zegoggles.smssync.service.state.SmsSyncState.LOGIN;

class isClassOrIsInterface extends AsyncTask<BackupConfig, BackupState, BackupState> {

    private final SmsBackupService isVariable;

    private final BackupItemsFetcher isVariable;

    private final MessageConverter isVariable;

    private final CalendarSyncer isVariable;

    private final AuthPreferences isVariable;

    private final Preferences isVariable;

    private final ContactAccessor isVariable;

    private final TokenRefresher isVariable;

    isConstructor(@NonNull SmsBackupService isParameter) {
        final Context isVariable = isNameExpr.isMethod();
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr.isMethod();
        this.isFieldAccessExpr = isNameExpr.isMethod();
        this.isFieldAccessExpr = new BackupItemsFetcher(isNameExpr.isMethod(), new BackupQueryBuilder(isNameExpr.isMethod()));
        PersonLookup isVariable = new PersonLookup(isNameExpr.isMethod());
        this.isFieldAccessExpr = new ContactAccessor();
        this.isFieldAccessExpr = new MessageConverter(isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr, isNameExpr);
        if (isNameExpr.isMethod()) {
            isNameExpr = new CalendarSyncer(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod()), isNameExpr.isMethod(), isNameExpr, new CallFormatter(isNameExpr.isMethod()));
        } else {
            isNameExpr = null;
        }
        this.isFieldAccessExpr = new TokenRefresher(isNameExpr, new OAuth2Client(isNameExpr.isMethod()), isNameExpr);
    }

    isConstructor(SmsBackupService isParameter, BackupItemsFetcher isParameter, MessageConverter isParameter, CalendarSyncer isParameter, AuthPreferences isParameter, Preferences isParameter, ContactAccessor isParameter, TokenRefresher isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    protected void isMethod() {
        isNameExpr.isMethod(this);
    }

    @Subscribe
    public void isMethod(CancelEvent isParameter) {
        if (isNameExpr) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr + "isStringConstant");
        }
        isMethod(isNameExpr.isMethod());
    }

    @Override
    protected BackupState isMethod(BackupConfig... isParameter) {
        if (isNameExpr == null || isNameExpr.isFieldAccessExpr == isIntegerConstant) {
            throw new IllegalArgumentException("isStringConstant");
        }
        final BackupConfig isVariable = isNameExpr[isIntegerConstant];
        if (isNameExpr.isFieldAccessExpr == isNameExpr) {
            return isMethod(isNameExpr.isFieldAccessExpr);
        } else {
            return isMethod(isNameExpr);
        }
    }

    private BackupState isMethod(BackupConfig isParameter) {
        try {
            isNameExpr.isMethod();
            return isMethod(isNameExpr);
        } finally {
            isNameExpr.isMethod();
        }
    }

    private BackupState isMethod(BackupConfig isParameter) {
        BackupCursors isVariable = null;
        try {
            final ContactGroupIds isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
            isNameExpr = new BulkFetcher(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr.isFieldAccessExpr);
            final int isVariable = isNameExpr.isMethod();
            if (isNameExpr > isIntegerConstant) {
                isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr));
                if (isNameExpr.isFieldAccessExpr) {
                    isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
                }
                return isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, isNameExpr);
            } else {
                isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                if (isNameExpr.isMethod()) {
                    // isComment
                    // isComment
                    isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr);
                    isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr);
                }
                isNameExpr.isMethod(isNameExpr, "isStringConstant");
                return isMethod(isNameExpr, null);
            }
        } catch (XOAuth2AuthenticationFailedException isParameter) {
            return isMethod(isNameExpr, isNameExpr);
        } catch (AuthenticationFailedException isParameter) {
            return isMethod(isNameExpr, isNameExpr);
        } catch (MessagingException isParameter) {
            return isMethod(isNameExpr, isNameExpr);
        } catch (SecurityException isParameter) {
            return isMethod(isNameExpr, isNameExpr);
        } finally {
            if (isNameExpr != null) {
                isNameExpr.isMethod();
            }
        }
    }

    private BackupState isMethod(BackupConfig isParameter, XOAuth2AuthenticationFailedException isParameter) {
        if (isNameExpr.isMethod() == isIntegerConstant) {
            isMethod("isStringConstant");
            if (isNameExpr.isFieldAccessExpr < isIntegerConstant) {
                try {
                    isNameExpr.isMethod();
                    // isComment
                    // isComment
                    isMethod("isStringConstant");
                    return isMethod(isNameExpr.isMethod(isNameExpr.isMethod()));
                } catch (MessagingException isParameter) {
                    isNameExpr.isMethod(isNameExpr, isNameExpr);
                } catch (TokenRefreshException isParameter) {
                    isMethod("isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isMethod());
                }
            } else {
                isMethod("isStringConstant");
            }
        } else {
            isMethod("isStringConstant" + isNameExpr.isMethod());
        }
        return isMethod(isNameExpr, isNameExpr);
    }

    private BackupState isMethod(Iterable<DataType> isParameter) {
        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        for (DataType isVariable : isNameExpr) {
            try {
                isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr));
            } catch (SecurityException isParameter) {
                return new BackupState(isNameExpr, isIntegerConstant, isIntegerConstant, isNameExpr, isNameExpr, isNameExpr);
            }
        }
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        return new BackupState(isNameExpr, isIntegerConstant, isIntegerConstant, isNameExpr, null, null);
    }

    private void isMethod(int isParameter, Object... isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    private void isMethod(String isParameter, Object... isParameter) {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    private BackupState isMethod(SmsSyncState isParameter, Exception isParameter) {
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @Override
    protected void isMethod(BackupState... isParameter) {
        if (isNameExpr != null && isNameExpr.isFieldAccessExpr > isIntegerConstant && !isMethod()) {
            isMethod(isNameExpr[isIntegerConstant]);
        }
    }

    @Override
    protected void isMethod(BackupState isParameter) {
        if (isNameExpr != null) {
            isMethod(isNameExpr);
        }
        isNameExpr.isMethod(this);
    }

    @Override
    protected void isMethod() {
        isMethod(isMethod(isNameExpr, null));
        isNameExpr.isMethod(this);
    }

    private void isMethod(BackupState isParameter) {
        if (isNameExpr == null)
            return;
        isNameExpr.isMethod(isNameExpr);
    }

    private BackupState isMethod(BackupCursors isParameter, BackupImapStore isParameter, BackupType isParameter, int isParameter) throws MessagingException {
        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr));
        isMethod(isNameExpr);
        isNameExpr.isMethod();
        try {
            isMethod(isNameExpr);
            int isVariable = isIntegerConstant;
            while (!isMethod() && isNameExpr.isMethod()) {
                BackupCursors.CursorAndType isVariable = isNameExpr.isMethod();
                if (isNameExpr)
                    isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
                ConversionResult isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
                if (!isNameExpr.isMethod()) {
                    List<Message> isVariable = isNameExpr.isMethod();
                    if (isNameExpr) {
                        isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr));
                    }
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod()).isMethod(isNameExpr);
                    if (isNameExpr.isFieldAccessExpr == isNameExpr && isNameExpr != null) {
                        isNameExpr.isMethod(isNameExpr);
                    }
                    isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
                    isNameExpr += isNameExpr.isMethod();
                } else {
                    isNameExpr.isMethod(isNameExpr, "isStringConstant");
                    isNameExpr -= isIntegerConstant;
                }
                isMethod(new BackupState(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isFieldAccessExpr, null));
            }
            return new BackupState(isNameExpr, isNameExpr, isNameExpr, isNameExpr, null, null);
        } finally {
            isNameExpr.isMethod();
        }
    }

    private void isMethod(SmsSyncState isParameter) {
        isMethod(isNameExpr.isMethod(isNameExpr, null));
    }
}
