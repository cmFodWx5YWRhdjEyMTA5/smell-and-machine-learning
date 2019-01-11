// isComment
package com.zegoggles.smssync.service;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.CallLog;
import android.provider.Telephony;
import android.support.annotation.NonNull;
import android.util.Log;
import com.fsck.k9.mail.AuthenticationFailedException;
import com.fsck.k9.mail.FetchProfile;
import com.fsck.k9.mail.Message;
import com.fsck.k9.mail.MessagingException;
import com.fsck.k9.mail.store.imap.XOAuth2AuthenticationFailedException;
import com.squareup.otto.Subscribe;
import com.zegoggles.smssync.App;
import com.zegoggles.smssync.Consts;
import com.zegoggles.smssync.auth.TokenRefreshException;
import com.zegoggles.smssync.auth.TokenRefresher;
import com.zegoggles.smssync.mail.BackupImapStore;
import com.zegoggles.smssync.mail.DataType;
import com.zegoggles.smssync.mail.MessageConverter;
import com.zegoggles.smssync.preferences.Preferences;
import com.zegoggles.smssync.service.state.RestoreState;
import com.zegoggles.smssync.service.state.SmsSyncState;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import static com.zegoggles.smssync.App.LOCAL_LOGV;
import static com.zegoggles.smssync.App.TAG;
import static com.zegoggles.smssync.mail.DataType.CALLLOG;
import static com.zegoggles.smssync.mail.DataType.SMS;
import static com.zegoggles.smssync.service.state.SmsSyncState.CALC;
import static com.zegoggles.smssync.service.state.SmsSyncState.CANCELED_RESTORE;
import static com.zegoggles.smssync.service.state.SmsSyncState.FINISHED_RESTORE;
import static com.zegoggles.smssync.service.state.SmsSyncState.LOGIN;
import static com.zegoggles.smssync.service.state.SmsSyncState.RESTORE;
import static com.zegoggles.smssync.service.state.SmsSyncState.UPDATING_THREADS;

class isClassOrIsInterface extends AsyncTask<RestoreConfig, RestoreState, RestoreState> {

    private static final String isVariable = "isStringConstant";

    private Set<String> isVariable = new HashSet<String>();

    private Set<String> isVariable = new HashSet<String>();

    private Set<String> isVariable = new HashSet<String>();

    private final SmsRestoreService isVariable;

    private final ContentResolver isVariable;

    private final MessageConverter isVariable;

    private final TokenRefresher isVariable;

    private final Preferences isVariable;

    isConstructor(SmsRestoreService isParameter, MessageConverter isParameter, ContentResolver isParameter, TokenRefresher isParameter) {
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr;
        this.isFieldAccessExpr = isNameExpr.isMethod();
    }

    @Override
    protected void isMethod() {
        isNameExpr.isMethod(this);
    }

    @Subscribe
    public void isMethod(CancelEvent isParameter) {
        isMethod(isNameExpr.isMethod());
    }

    @NonNull
    protected RestoreState isMethod(RestoreConfig... isParameter) {
        if (isNameExpr == null || isNameExpr.isFieldAccessExpr == isIntegerConstant)
            throw new IllegalArgumentException("isStringConstant");
        RestoreConfig isVariable = isNameExpr[isIntegerConstant];
        if (!isNameExpr.isFieldAccessExpr && !isNameExpr.isFieldAccessExpr) {
            return new RestoreState(isNameExpr, isIntegerConstant, isIntegerConstant, isIntegerConstant, isIntegerConstant, null, null);
        } else {
            try {
                isNameExpr.isMethod();
                return isMethod(isNameExpr);
            } finally {
                isNameExpr.isMethod();
            }
        }
    }

    private RestoreState isMethod(RestoreConfig isParameter) {
        final BackupImapStore isVariable = isNameExpr.isFieldAccessExpr;
        int isVariable = isNameExpr.isFieldAccessExpr;
        try {
            isMethod(isNameExpr);
            isNameExpr.isMethod();
            isMethod(isNameExpr);
            final List<Message> isVariable = new ArrayList<Message>();
            if (isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, null));
            }
            if (isNameExpr.isFieldAccessExpr) {
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr, null));
            }
            final int isVariable = isNameExpr.isFieldAccessExpr <= isIntegerConstant ? isNameExpr.isMethod() : isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
            if (isNameExpr > isIntegerConstant) {
                for (; isNameExpr < isNameExpr && !isMethod(); isNameExpr++) {
                    DataType isVariable = isMethod(isNameExpr.isMethod(isNameExpr));
                    // isComment
                    isNameExpr.isMethod(isNameExpr, null);
                    isMethod(new RestoreState(isNameExpr, isNameExpr, isNameExpr, isIntegerConstant, isIntegerConstant, isNameExpr, null));
                    if (isNameExpr % isIntegerConstant == isIntegerConstant) {
                        // isComment
                        isNameExpr.isMethod();
                    }
                }
                isMethod();
            } else {
                isNameExpr.isMethod(isNameExpr, "isStringConstant");
            }
            final int isVariable = isNameExpr.isMethod() + isNameExpr.isMethod();
            return new RestoreState(isMethod() ? isNameExpr : isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr.isMethod(isIntegerConstant, isNameExpr.isMethod() - isNameExpr), null, null);
        } catch (XOAuth2AuthenticationFailedException isParameter) {
            return isMethod(isNameExpr, isNameExpr, isNameExpr);
        } catch (AuthenticationFailedException isParameter) {
            return isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        } catch (MessagingException isParameter) {
            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
            isMethod();
            return isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        } catch (IllegalStateException isParameter) {
            // isComment
            return isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
        } finally {
            isNameExpr.isMethod();
        }
    }

    private RestoreState isMethod(RestoreConfig isParameter, int isParameter, XOAuth2AuthenticationFailedException isParameter) {
        if (isNameExpr.isMethod() == isIntegerConstant) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant");
            if (isNameExpr.isFieldAccessExpr < isIntegerConstant) {
                try {
                    isNameExpr.isMethod();
                    // isComment
                    return isMethod(isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod()));
                } catch (MessagingException isParameter) {
                    isNameExpr.isMethod(isNameExpr, isNameExpr);
                } catch (TokenRefreshException isParameter) {
                    isNameExpr.isMethod(isNameExpr, isNameExpr);
                }
            } else {
                isNameExpr.isMethod(isNameExpr, "isStringConstant");
            }
        } else {
            isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod());
        }
        return isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
    }

    private void isMethod(SmsSyncState isParameter) {
        isMethod(isMethod(isNameExpr, null));
    }

    private RestoreState isMethod(SmsSyncState isParameter, Exception isParameter) {
        return isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr);
    }

    @Override
    protected void isMethod(RestoreState isParameter) {
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isMethod() + "isStringConstant");
            isMethod(isNameExpr);
        }
        isNameExpr.isMethod(this);
    }

    @Override
    protected void isMethod() {
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isMethod(isMethod(isNameExpr, null));
        isNameExpr.isMethod(this);
    }

    @Override
    protected void isMethod(RestoreState... isParameter) {
        if (isNameExpr != null && isNameExpr.isFieldAccessExpr > isIntegerConstant && !isMethod()) {
            isMethod(isNameExpr[isIntegerConstant]);
        }
    }

    private void isMethod(RestoreState isParameter) {
        if (isNameExpr == null)
            return;
        isNameExpr.isMethod(isNameExpr);
    }

    @SuppressWarnings("isStringConstant")
    private DataType isMethod(Message isParameter) {
        isNameExpr.isMethod(isNameExpr.isMethod());
        FetchProfile isVariable = new FetchProfile();
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        DataType isVariable = null;
        try {
            if (isNameExpr)
                isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr.isMethod());
            isNameExpr.isMethod().isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr, null);
            isNameExpr = isNameExpr.isMethod(isNameExpr);
            // isComment
            switch(isNameExpr) {
                case isNameExpr:
                    isMethod(isNameExpr);
                    break;
                case isNameExpr:
                    isMethod(isNameExpr);
                    break;
                default:
                    if (isNameExpr)
                        isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
            }
        } catch (MessagingException isParameter) {
            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        } catch (IllegalArgumentException isParameter) {
            // isComment
            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        } catch (IOException isParameter) {
            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
        return isNameExpr;
    }

    private void isMethod(final Message isParameter) throws IOException, MessagingException {
        if (isNameExpr)
            isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr + "isStringConstant");
        final ContentValues isVariable = isNameExpr.isMethod(isNameExpr);
        final Integer isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        // isComment
        if (isNameExpr != null && (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr || isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) && !isMethod(isNameExpr)) {
            final Uri isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr.isMethod());
                Long isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
                if (isNameExpr != null && isNameExpr.isMethod().isMethod(isNameExpr) < isNameExpr) {
                    isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr);
                }
                if (isNameExpr)
                    isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr);
            }
        } else {
            if (isNameExpr)
                isNameExpr.isMethod(isNameExpr, "isStringConstant");
        }
    }

    private void isMethod(final Message isParameter) throws MessagingException, IOException {
        if (isNameExpr)
            isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr + "isStringConstant");
        final ContentValues isVariable = isNameExpr.isMethod(isNameExpr);
        if (!isMethod(isNameExpr)) {
            final Uri isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr);
            if (isNameExpr != null)
                isNameExpr.isMethod(isNameExpr.isMethod());
        } else {
            if (isNameExpr)
                isNameExpr.isMethod(isNameExpr, "isStringConstant");
        }
    }

    private boolean isMethod(ContentValues isParameter) {
        Cursor isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new String[] { "isStringConstant" }, "isStringConstant", new String[] { isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) }, null);
        boolean isVariable = true;
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod() > isIntegerConstant;
            isNameExpr.isMethod();
        }
        return isNameExpr;
    }

    private boolean isMethod(ContentValues isParameter) {
        // isComment
        Cursor isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new String[] { "isStringConstant" }, "isStringConstant", new String[] { isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) }, null);
        boolean isVariable = true;
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isMethod() > isIntegerConstant;
            isNameExpr.isMethod();
        }
        return isNameExpr;
    }

    private void isMethod() {
        if (isNameExpr.isMethod() > isIntegerConstant) {
            isMethod();
        }
    }

    private void isMethod() {
        // isComment
        // isComment
        // isComment
        isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
        isNameExpr.isMethod(isNameExpr.isMethod("isStringConstant"), null, null);
        isNameExpr.isMethod(isNameExpr, "isStringConstant");
    }

    protected Set<String> isMethod() {
        return isNameExpr;
    }
}
