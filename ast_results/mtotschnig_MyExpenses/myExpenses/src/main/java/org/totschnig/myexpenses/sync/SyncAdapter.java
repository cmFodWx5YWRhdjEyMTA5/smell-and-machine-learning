// isComment
package org.totschnig.myexpenses.sync;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.AbstractThreadedSyncAdapter;
import android.content.ContentProviderClient;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.OperationApplicationException;
import android.content.SyncResult;
import android.database.Cursor;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteException;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.v4.util.Pair;
import android.util.SparseArray;
import com.annimon.stream.Collectors;
import com.annimon.stream.Exceptional;
import com.annimon.stream.Stream;
import org.apache.commons.collections4.ListUtils;
import org.totschnig.myexpenses.BuildConfig;
import org.totschnig.myexpenses.MyApplication;
import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.activity.ManageSyncBackends;
import org.totschnig.myexpenses.export.CategoryInfo;
import org.totschnig.myexpenses.model.CurrencyUnit;
import org.totschnig.myexpenses.model.Money;
import org.totschnig.myexpenses.model.Payee;
import org.totschnig.myexpenses.model.PaymentMethod;
import org.totschnig.myexpenses.model.SplitTransaction;
import org.totschnig.myexpenses.model.Transaction;
import org.totschnig.myexpenses.model.Transfer;
import org.totschnig.myexpenses.preference.PrefKey;
import org.totschnig.myexpenses.provider.DatabaseConstants;
import org.totschnig.myexpenses.provider.TransactionProvider;
import org.totschnig.myexpenses.service.SyncNotificationDismissHandler;
import org.totschnig.myexpenses.sync.json.ChangeSet;
import org.totschnig.myexpenses.sync.json.TransactionChange;
import org.totschnig.myexpenses.util.NotificationBuilderWrapper;
import org.totschnig.myexpenses.util.TextUtils;
import org.totschnig.myexpenses.util.Utils;
import org.totschnig.myexpenses.util.crashreporting.CrashHandler;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import timber.log.Timber;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_ACCOUNTID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_AMOUNT;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_CATID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_COMMENT;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_CR_STATUS;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_DATE;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_EQUIVALENT_AMOUNT;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_KEY;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_METHODID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_ORIGINAL_AMOUNT;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_ORIGINAL_CURRENCY;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_PARENTID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_PAYEEID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_PICTURE_URI;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_REFERENCE_NUMBER;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_ROWID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_SYNC_ACCOUNT_NAME;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_SYNC_SEQUENCE_LOCAL;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_UUID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_VALUE;

public class isClassOrIsInterface extends AbstractThreadedSyncAdapter {

    public static final int isVariable = isIntegerConstant;

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    private static final ThreadLocal<org.totschnig.myexpenses.model.Account> isVariable = new ThreadLocal<>();

    public static final int isVariable = isNameExpr.isFieldAccessExpr ? isIntegerConstant : isIntegerConstant;

    private static final long isVariable = isNameExpr.isFieldAccessExpr.isMethod(isIntegerConstant);

    private static final long isVariable = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);

    private Map<String, Long> isVariable;

    private Map<String, Long> isVariable;

    private Map<String, Long> isVariable;

    private Map<String, Long> isVariable;

    private SparseArray<StringBuilder> isVariable = new SparseArray<>();

    public static final String isVariable = "isStringConstant";

    private boolean isVariable = true;

    public isConstructor(Context isParameter, boolean isParameter) {
        super(isNameExpr, isNameExpr);
    }

    public isConstructor(Context isParameter, boolean isParameter, boolean isParameter) {
        super(isNameExpr, isNameExpr, isNameExpr);
    }

    public static String isMethod(long isParameter) {
        return "isStringConstant" + isNameExpr;
    }

    public static String isMethod(long isParameter) {
        return "isStringConstant" + isNameExpr;
    }

    private String isMethod(AccountManager isParameter, Account isParameter, String isParameter, String isParameter) {
        String isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        return isNameExpr == null ? isNameExpr : isNameExpr;
    }

    @Override
    public void isMethod(Account isParameter, Bundle isParameter, String isParameter, ContentProviderClient isParameter, SyncResult isParameter) {
        isMethod().isMethod("isStringConstant", isNameExpr);
        if (isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isMethod(isNameExpr.isMethod());
            if (isNameExpr.isMethod(isNameExpr, isNameExpr)) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
            return;
        }
        isNameExpr = new HashMap<>();
        isNameExpr = new HashMap<>();
        isNameExpr = new HashMap<>();
        isNameExpr = new HashMap<>();
        String isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod();
        if (isNameExpr.isMethod(isNameExpr) == null) {
            isNameExpr.isMethod(isNameExpr, new StringBuilder());
        }
        isNameExpr = isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, true);
        if (isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, true) && !isMethod(isMethod())) {
            final String isVariable = isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            isMethod().isMethod(isNameExpr);
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr)) {
                isMethod(isMethod(), isNameExpr, isNameExpr, null);
            }
            return;
        }
        AccountManager isVariable = isNameExpr.isMethod(isMethod());
        Exceptional<SyncBackendProvider> isVariable = isNameExpr.isMethod(isMethod(), isNameExpr);
        SyncBackendProvider isVariable;
        try {
            isNameExpr = isNameExpr.isMethod();
        } catch (Throwable isParameter) {
            isNameExpr.isFieldAccessExpr = true;
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr, "isStringConstant");
            isMethod("isStringConstant", isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr.isMethod()), null, isMethod());
            return;
        }
        String isVariable;
        try {
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr, true);
        } catch (OperationCanceledException | IOException | AuthenticatorException isParameter) {
            isMethod().isMethod(isNameExpr, "isStringConstant");
            isNameExpr.isFieldAccessExpr.isFieldAccessExpr++;
            return;
        }
        final Exceptional<Void> isVariable = isNameExpr.isMethod(isNameExpr);
        if (!isNameExpr.isMethod()) {
            final Throwable isVariable = isNameExpr.isMethod();
            if (isNameExpr instanceof SyncBackendProvider.ResolvableSetupException) {
                isMethod((SyncBackendProvider.ResolvableSetupException) isNameExpr);
            } else {
                isNameExpr.isFieldAccessExpr.isFieldAccessExpr++;
                isNameExpr.isFieldAccessExpr = isNameExpr;
                isMethod().isMethod(isNameExpr);
                isMethod(isNameExpr.isMethod(isMethod(), "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr, true);
            }
            return;
        }
        isMethod(isNameExpr, isNameExpr, isNameExpr);
        Cursor isVariable;
        String[] isVariable;
        String isVariable = isNameExpr + "isStringConstant";
        if (isNameExpr != null) {
            isNameExpr += "isStringConstant" + isNameExpr + "isStringConstant";
            isNameExpr = new String[] { isNameExpr.isFieldAccessExpr, isNameExpr };
        } else {
            isNameExpr = new String[] { isNameExpr.isFieldAccessExpr };
        }
        String[] isVariable = { isNameExpr };
        try {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant", isNameExpr, isNameExpr);
        } catch (RemoteException isParameter) {
            isNameExpr.isFieldAccessExpr = true;
            isMethod(isNameExpr, isNameExpr);
            return;
        }
        if (isNameExpr == null) {
            isNameExpr.isFieldAccessExpr = true;
            Exception isVariable = new Exception("isStringConstant");
            isMethod(isNameExpr, isNameExpr);
            return;
        }
        if (isNameExpr.isMethod()) {
            do {
                long isVariable = isNameExpr.isMethod(isIntegerConstant);
                try {
                    isNameExpr.isMethod(isMethod(isNameExpr), new ContentValues(isIntegerConstant), null, null);
                    // isComment
                    isNameExpr.isMethod(isNameExpr, isMethod(isNameExpr), null);
                    isNameExpr.isMethod(isNameExpr, isMethod(isNameExpr), null);
                } catch (RemoteException | SQLiteConstraintException isParameter) {
                    isNameExpr.isFieldAccessExpr = true;
                    isMethod(isNameExpr, isNameExpr);
                    return;
                }
            } while (isNameExpr.isMethod());
        }
        isNameExpr.isMethod();
        try {
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        } catch (RemoteException isParameter) {
            isNameExpr.isFieldAccessExpr = true;
            isMethod(isNameExpr, isNameExpr);
            return;
        }
        if (isNameExpr != null) {
            if (isNameExpr.isMethod()) {
                do {
                    long isVariable = isNameExpr.isMethod(isIntegerConstant);
                    String isVariable = isMethod(isNameExpr);
                    String isVariable = isMethod(isNameExpr);
                    long isVariable = isNameExpr.isMethod(isMethod(isNameExpr, isNameExpr, isNameExpr, "isStringConstant"));
                    SequenceNumber isVariable = isNameExpr.isMethod(isMethod(isNameExpr, isNameExpr, isNameExpr, "isStringConstant"));
                    final org.totschnig.myexpenses.model.Account isVariable = isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod(isNameExpr);
                    if (isNameExpr == null) {
                        // isComment
                        continue;
                    }
                    isNameExpr.isMethod(isNameExpr);
                    if (isNameExpr != null && isNameExpr.isMethod(isNameExpr)) {
                        try {
                            isNameExpr.isMethod(isNameExpr);
                            isMethod(isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod()), isNameExpr, true);
                        } catch (IOException isParameter) {
                            isMethod().isMethod(isNameExpr);
                            if (isMethod(isNameExpr, isNameExpr, isNameExpr)) {
                                return;
                            }
                            isNameExpr.isFieldAccessExpr.isFieldAccessExpr++;
                            isNameExpr.isFieldAccessExpr = isNameExpr;
                            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
                        }
                        break;
                    }
                    isMethod(isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod()), isNameExpr, true);
                    try {
                        isNameExpr.isMethod(isNameExpr);
                    } catch (IOException isParameter) {
                        isMethod().isMethod(isNameExpr);
                        if (isMethod(isNameExpr, isNameExpr, isNameExpr)) {
                            return;
                        }
                        isNameExpr.isFieldAccessExpr.isFieldAccessExpr++;
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
                        continue;
                    }
                    try {
                        isNameExpr.isMethod();
                    } catch (IOException isParameter) {
                        isMethod().isMethod(isNameExpr);
                        if (isMethod(isNameExpr, isNameExpr, isNameExpr)) {
                            return;
                        }
                        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
                        isNameExpr.isFieldAccessExpr.isFieldAccessExpr++;
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        continue;
                    }
                    boolean isVariable = true;
                    int isVariable = isIntegerConstant, isVariable = isIntegerConstant;
                    try {
                        ChangeSet isVariable = isNameExpr.isMethod(isNameExpr, isMethod());
                        if (isNameExpr == null) {
                            isNameExpr.isFieldAccessExpr.isFieldAccessExpr++;
                            isNameExpr.isFieldAccessExpr = isNameExpr;
                            isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
                            continue;
                        }
                        List<TransactionChange> isVariable;
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                        isNameExpr = isNameExpr.isFieldAccessExpr;
                        List<TransactionChange> isVariable = new ArrayList<>();
                        long isVariable = isNameExpr;
                        while (true) {
                            isNameExpr++;
                            List<TransactionChange> isVariable = isMethod(isNameExpr, isNameExpr, isNameExpr);
                            if (isNameExpr.isMethod() > isIntegerConstant) {
                                isNameExpr.isMethod(isNameExpr);
                                isNameExpr = isNameExpr;
                            } else {
                                break;
                            }
                        }
                        if (isNameExpr.isMethod() > isIntegerConstant || isNameExpr.isMethod() > isIntegerConstant) {
                            if (isNameExpr.isMethod() > isIntegerConstant) {
                                isNameExpr = isMethod(isNameExpr);
                            }
                            Pair<List<TransactionChange>, List<TransactionChange>> isVariable = isMethod(isNameExpr, isNameExpr);
                            isNameExpr = isNameExpr.isFieldAccessExpr;
                            isNameExpr = isNameExpr.isFieldAccessExpr;
                            if (isNameExpr.isMethod() > isIntegerConstant) {
                                isMethod(isNameExpr, isNameExpr, isNameExpr);
                                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod(isNameExpr));
                                isNameExpr = isNameExpr.isMethod();
                            }
                            if (isNameExpr.isMethod() > isIntegerConstant) {
                                isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, isMethod());
                                if (!isNameExpr.isFieldAccessExpr) {
                                    // isComment
                                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant", new String[] { isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr) });
                                }
                                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod(isNameExpr));
                                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod(isNameExpr));
                                isNameExpr = isNameExpr.isMethod();
                            }
                        }
                        isNameExpr = true;
                    } catch (IOException isParameter) {
                        isMethod().isMethod(isNameExpr);
                        if (isMethod(isNameExpr, isNameExpr, isNameExpr)) {
                            return;
                        }
                        isNameExpr.isFieldAccessExpr.isFieldAccessExpr++;
                        isNameExpr.isFieldAccessExpr = isNameExpr;
                        isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
                    } catch (RemoteException | OperationApplicationException | SQLiteException isParameter) {
                        isNameExpr.isFieldAccessExpr = true;
                        isMethod(isNameExpr, isNameExpr);
                    } catch (Exception isParameter) {
                        isMethod("isStringConstant" + isNameExpr.isMethod(), isNameExpr, true);
                        isMethod().isMethod(isNameExpr);
                    } finally {
                        if (isNameExpr > isIntegerConstant || isNameExpr > isIntegerConstant) {
                            isMethod(isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr), isNameExpr, true);
                        } else if (isNameExpr) {
                            isMethod(isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr, true);
                        }
                        try {
                            isNameExpr.isMethod();
                        } catch (IOException isParameter) {
                            isMethod().isMethod(isNameExpr);
                            if (!isMethod(isNameExpr, isNameExpr, isNameExpr)) {
                                isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr);
                                isNameExpr.isFieldAccessExpr.isFieldAccessExpr++;
                                isNameExpr.isFieldAccessExpr = isNameExpr;
                            }
                        }
                    }
                } while (isNameExpr.isMethod());
            }
            isNameExpr.isMethod();
        }
        isNameExpr.isMethod();
    }

    private void isMethod(Account isParameter, ContentProviderClient isParameter, SyncBackendProvider isParameter) {
        String isVariable = isMethod(isNameExpr, isNameExpr);
        if (isNameExpr != null) {
            String isVariable = isMethod(isNameExpr, isNameExpr);
            try {
                isMethod().isMethod("isStringConstant", isNameExpr, isNameExpr);
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr);
                isMethod(isNameExpr, isNameExpr);
                isMethod(isNameExpr, isNameExpr);
                isMethod(isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr.isFieldAccessExpr), null, null);
            } catch (Exception isParameter) {
                isMethod().isMethod(isNameExpr);
                if (!isMethod(isNameExpr, isNameExpr, isNameExpr)) {
                    isMethod(isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr, isNameExpr.isFieldAccessExpr) + "isStringConstant" + isNameExpr.isMethod(), null, null);
                }
            }
        }
    }

    private boolean isMethod(SyncBackendProvider isParameter, Exception isParameter, Account isParameter) {
        if (isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isMethod();
            Intent isVariable = isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
            isMethod(isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), null, null, isNameExpr);
            return true;
        }
        return true;
    }

    @NonNull
    private Intent isMethod() {
        return new Intent(isMethod(), ManageSyncBackends.class);
    }

    private void isMethod(String isParameter, @Nullable Account isParameter, boolean isParameter) {
        isMethod().isMethod(isNameExpr);
        if (isNameExpr) {
            StringBuilder isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
            if (isNameExpr.isMethod() > isIntegerConstant) {
                isNameExpr.isMethod(isNameExpr ? "isStringConstant" : "isStringConstant");
            }
            isNameExpr.isMethod(isNameExpr);
            isNameExpr = isNameExpr.isMethod();
            isMethod(isMethod(), isNameExpr, isNameExpr, null);
        }
    }

    public static Timber.Tree isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }

    private void isMethod(String isParameter, String isParameter, @Nullable Account isParameter, @Nullable Intent isParameter) {
        if (isNameExpr) {
            isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        }
    }

    private void isMethod(String isParameter, String isParameter, @Nullable Account isParameter, @Nullable Intent isParameter) {
        NotificationBuilderWrapper isVariable = isNameExpr.isMethod(isMethod(), isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr.isMethod(isMethod(), isIntegerConstant, isNameExpr, isNameExpr.isFieldAccessExpr));
        }
        if (isNameExpr != null) {
            Intent isVariable = new Intent(isMethod(), SyncNotificationDismissHandler.class);
            isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod(isNameExpr.isMethod(isMethod(), isIntegerConstant, isNameExpr, isNameExpr.isFieldAccessExpr));
        }
        Notification isVariable = isNameExpr.isMethod();
        isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
        ((NotificationManager) isMethod().isMethod(isNameExpr.isFieldAccessExpr)).isMethod("isStringConstant", isNameExpr != null ? isNameExpr.isMethod() : isIntegerConstant, isNameExpr);
    }

    private void isMethod(SyncBackendProvider.ResolvableSetupException isParameter) {
        final PendingIntent isVariable = isNameExpr.isMethod();
        if (isNameExpr != null) {
            NotificationBuilderWrapper isVariable = isNameExpr.isMethod(isMethod(), isNameExpr.isFieldAccessExpr, isMethod(), isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr);
            Notification isVariable = isNameExpr.isMethod();
            isNameExpr.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
            ((NotificationManager) isMethod().isMethod(isNameExpr.isFieldAccessExpr)).isMethod("isStringConstant", isIntegerConstant, isNameExpr);
        }
    }

    private void isMethod(int isParameter, Account isParameter) {
        isMethod(isMethod().isMethod(isNameExpr), isNameExpr, true);
    }

    private void isMethod(Exception isParameter, Account isParameter) {
        isNameExpr.isMethod(isNameExpr);
        isMethod(isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) + "isStringConstant" + isNameExpr.isMethod(), isNameExpr, true);
    }

    private String isMethod() {
        return isNameExpr.isMethod(isMethod(), "isStringConstant", isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    private List<TransactionChange> isMethod(ContentProviderClient isParameter, long isParameter, long isParameter) throws RemoteException {
        List<TransactionChange> isVariable = new ArrayList<>();
        Uri isVariable = isMethod(isNameExpr, isNameExpr);
        boolean isVariable = isMethod(isNameExpr, isNameExpr);
        if (isNameExpr) {
            ContentValues isVariable = new ContentValues(isIntegerConstant);
            long isVariable = isNameExpr + isIntegerConstant;
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            // isComment
            // isComment
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant", new String[] { isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr) });
        }
        if (isNameExpr) {
            Cursor isVariable = isNameExpr.isMethod(isNameExpr, null, null, null, null);
            if (isNameExpr != null) {
                if (isNameExpr.isMethod()) {
                    do {
                        TransactionChange isVariable = isNameExpr.isMethod(isNameExpr);
                        if (!isNameExpr.isMethod()) {
                            isNameExpr.isMethod(isNameExpr);
                        }
                    } while (isNameExpr.isMethod());
                }
                isNameExpr.isMethod();
            }
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    private List<TransactionChange> isMethod(List<TransactionChange> isParameter) {
        HashMap<String, List<TransactionChange>> isVariable = new HashMap<>();
        for (Iterator<TransactionChange> isVariable = isNameExpr.isMethod(); isNameExpr.isMethod(); ) {
            TransactionChange isVariable = isNameExpr.isMethod();
            if ((isNameExpr.isMethod() != null)) {
                isMethod(isNameExpr, isNameExpr.isMethod()).isMethod(isNameExpr);
                isNameExpr.isMethod();
            }
        }
        // isComment
        // isComment
        isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isParameter -> {
            if (!isNameExpr.isMethod(isNameExpr).isMethod(isParameter -> isNameExpr.isMethod().isMethod(isNameExpr))) {
                isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod(isNameExpr).isMethod(isIntegerConstant).isMethod()).isMethod(isNameExpr).isMethod());
                isNameExpr.isMethod(isNameExpr, isMethod(isNameExpr.isMethod(isNameExpr), isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr)))));
            }
        });
        return isNameExpr.isMethod(isNameExpr).isMethod(isParameter -> isNameExpr.isMethod(isNameExpr.isMethod()) ? isNameExpr.isMethod().isMethod(isNameExpr.isMethod(isNameExpr.isMethod())).isMethod() : isNameExpr).isMethod(isNameExpr.isMethod());
    }

    private void isMethod(ContentProviderClient isParameter, List<TransactionChange> isParameter, long isParameter) throws RemoteException, OperationApplicationException {
        if (isNameExpr.isMethod() == isIntegerConstant) {
            return;
        }
        if (isNameExpr.isMethod() > isNameExpr) {
            for (List<TransactionChange> isVariable : isNameExpr.isMethod(isNameExpr, isNameExpr)) {
                isMethod(isNameExpr, isNameExpr, isNameExpr);
            }
        } else {
            isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
    }

    private void isMethod(ContentProviderClient isParameter, List<TransactionChange> isParameter, long isParameter) throws RemoteException, OperationApplicationException {
        ArrayList<ContentProviderOperation> isVariable = new ArrayList<>();
        isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr).isMethod(isParameter -> isMethod(isNameExpr, isNameExpr, isNameExpr, -isIntegerConstant));
        isNameExpr.isMethod(isNameExpr.isMethod());
        ContentProviderResult[] isVariable = isNameExpr.isMethod(isNameExpr);
        int isVariable = isNameExpr.isMethod();
        int isVariable = isNameExpr.isFieldAccessExpr;
        if (isNameExpr != isNameExpr) {
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr, isNameExpr));
        }
    }

    @VisibleForTesting
    public void isMethod(@NonNull TransactionChange isParameter, long isParameter, ArrayList<ContentProviderOperation> isParameter, int isParameter) {
        Uri isVariable = isNameExpr.isFieldAccessExpr;
        boolean isVariable = true;
        switch(isNameExpr.isMethod()) {
            case isNameExpr:
                long isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
                if (isNameExpr > -isIntegerConstant) {
                    if (isNameExpr > -isIntegerConstant) {
                        // isComment
                        // isComment
                        // isComment
                        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr).isMethod(isMethod(isNameExpr)).isMethod(isNameExpr + "isStringConstant", new String[] { isNameExpr.isMethod(isNameExpr) }).isMethod(isNameExpr, isNameExpr).isMethod());
                    } else {
                        isNameExpr = true;
                        isMethod().isMethod("isStringConstant");
                    }
                } else {
                    isNameExpr.isMethod(isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr));
                }
                break;
            case isNameExpr:
                ContentValues isVariable = isMethod(isNameExpr);
                if (isNameExpr.isMethod() > isIntegerConstant || isNameExpr != -isIntegerConstant) {
                    final ContentProviderOperation.Builder isVariable = isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant", new String[] { isNameExpr.isMethod(), isNameExpr.isMethod(isNameExpr) });
                    if (isNameExpr.isMethod() > isIntegerConstant) {
                        isNameExpr.isMethod(isNameExpr);
                    }
                    if (isNameExpr != -isIntegerConstant) {
                        isNameExpr.isMethod(isNameExpr, isNameExpr);
                    }
                    isNameExpr.isMethod(isNameExpr.isMethod());
                }
                break;
            case isNameExpr:
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr + "isStringConstant", new String[] { isNameExpr.isMethod() }).isMethod());
                break;
            case isNameExpr:
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr).isMethod()).isMethod(isNameExpr, isNameExpr.isMethod()).isMethod());
                break;
        }
        if (isNameExpr.isMethod() && isNameExpr.isMethod() != null && !isNameExpr) {
            final int isVariable = isNameExpr.isMethod() - isIntegerConstant;
            List<TransactionChange> isVariable = isMethod(isNameExpr.isMethod(), isMethod(isNameExpr.isMethod(isNameExpr.isMethod())));
            isNameExpr.isMethod(isNameExpr).isMethod(isParameter -> {
                if (!isNameExpr.isMethod().isMethod(isNameExpr.isMethod()))
                    throw new AssertionError();
                // isComment
                // isComment
                isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isMethod() ? isNameExpr : -isIntegerConstant);
            });
        }
    }

    private ArrayList<ContentProviderOperation> isMethod(TransactionChange isParameter, int isParameter, int isParameter) {
        if (!isNameExpr.isMethod())
            throw new AssertionError();
        Long isVariable;
        if (isNameExpr.isMethod() != null) {
            isNameExpr = isNameExpr.isMethod();
        } else {
            isNameExpr = isStringConstant;
        }
        Money isVariable = new Money(isMethod().isMethod(), isNameExpr);
        Transaction isVariable = null;
        if (isNameExpr.isMethod() != null) {
            isNameExpr = new SplitTransaction(isMethod().isMethod(), isNameExpr);
        } else {
            if (isNameExpr.isMethod() != null) {
                // isComment
                // isComment
                // isComment
                long isVariable = isMethod(isNameExpr.isMethod());
                long isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
                if (isNameExpr != -isIntegerConstant) {
                    isNameExpr = new Transfer(isMethod().isMethod(), isNameExpr, isNameExpr);
                }
            }
        }
        if (isNameExpr == null) {
            isNameExpr = new Transaction(isMethod().isMethod(), isNameExpr);
            if (isNameExpr.isMethod() == null && isNameExpr.isMethod() != null) {
                long isVariable = isMethod(isNameExpr.isMethod());
                if (isNameExpr != -isIntegerConstant) {
                    isNameExpr.isMethod(isNameExpr);
                }
            }
        }
        isNameExpr.isFieldAccessExpr = isNameExpr.isMethod();
        if (isNameExpr.isMethod() != null) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        if (isNameExpr.isMethod() != null) {
            Long isVariable = isNameExpr.isMethod();
            assert isNameExpr != null;
            isNameExpr.isMethod(new Date(isNameExpr * isIntegerConstant));
        }
        if (isNameExpr.isMethod() != null) {
            long isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
            if (isNameExpr != -isIntegerConstant) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
        if (isNameExpr.isMethod() != null) {
            long isVariable = isMethod(isNameExpr.isMethod());
            if (isNameExpr != -isIntegerConstant) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
        if (isNameExpr.isMethod() != null) {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod()));
        }
        isNameExpr.isMethod(isNameExpr.isMethod());
        if (isNameExpr == -isIntegerConstant && isNameExpr.isMethod() != null) {
            long isVariable = isNameExpr.isMethod(isMethod().isMethod(), isNameExpr.isMethod());
            if (isNameExpr == -isIntegerConstant) {
                // isComment
                return new ArrayList<>();
            }
            isNameExpr.isMethod(isNameExpr);
        }
        if (isNameExpr.isMethod() != null) {
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod()));
        }
        if (isNameExpr.isMethod() != null && isNameExpr.isMethod() != null) {
            CurrencyUnit isVariable = ((MyApplication) isMethod().isMethod()).isMethod().isMethod().isMethod(isNameExpr.isMethod());
            isNameExpr.isMethod(new Money(isNameExpr, isNameExpr.isMethod()));
        }
        if (isNameExpr.isMethod() != null && isNameExpr.isMethod() != null) {
            final CurrencyUnit isVariable = isNameExpr.isMethod();
            if (isNameExpr.isMethod().isMethod(isNameExpr.isMethod())) {
                isNameExpr.isMethod(new Money(isNameExpr, isNameExpr.isMethod()));
            }
        }
        return isNameExpr.isMethod(isNameExpr, isNameExpr, true);
    }

    private ContentValues isMethod(TransactionChange isParameter) {
        ContentValues isVariable = new ContentValues();
        if (isNameExpr.isMethod() != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        }
        if (isNameExpr.isMethod() != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        }
        if (isNameExpr.isMethod() != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        }
        if (isNameExpr.isMethod() != null) {
            long isVariable = isMethod(isNameExpr.isMethod());
            if (isNameExpr != -isIntegerConstant) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
        }
        if (isNameExpr.isMethod() != null) {
            long isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
            if (isNameExpr != -isIntegerConstant) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
        }
        if (isNameExpr.isMethod() != null) {
            long isVariable = isMethod(isNameExpr.isMethod());
            if (isNameExpr != -isIntegerConstant) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
        }
        if (isNameExpr.isMethod() != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        }
        if (isNameExpr.isMethod() != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        }
        if (isNameExpr.isMethod() != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        }
        if (isNameExpr.isMethod() != null && isNameExpr.isMethod() != null) {
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
            isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        }
        if (isNameExpr.isMethod() != null && isNameExpr.isMethod() != null) {
            final CurrencyUnit isVariable = isNameExpr.isMethod();
            if (isNameExpr.isMethod().isMethod(isNameExpr.isMethod())) {
                isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
            }
        }
        return isNameExpr;
    }

    private long isMethod(String isParameter) {
        Long isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod(isNameExpr);
            if (isNameExpr != -isIntegerConstant) {
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
        }
        return isNameExpr;
    }

    private long isMethod(String isParameter) {
        new CategoryInfo(isNameExpr).isMethod(isNameExpr, true);
        return isNameExpr.isMethod(isNameExpr) != null ? isNameExpr.isMethod(isNameExpr) : -isIntegerConstant;
    }

    private long isMethod(String isParameter) {
        Long isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr == -isIntegerConstant) {
                isNameExpr = isNameExpr.isMethod(isNameExpr, isMethod().isMethod());
            }
            if (isNameExpr != -isIntegerConstant) {
                // isComment
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
        }
        return isNameExpr;
    }

    @VisibleForTesting
    Pair<List<TransactionChange>, List<TransactionChange>> isMethod(List<TransactionChange> isParameter, List<TransactionChange> isParameter) {
        // isComment
        List<String> isVariable = isMethod(isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr)));
        List<TransactionChange> isVariable = isMethod(isNameExpr, isNameExpr);
        List<TransactionChange> isVariable = isMethod(isNameExpr, isNameExpr);
        // isComment
        HashMap<String, List<TransactionChange>> isVariable = new HashMap<>();
        HashMap<String, TransactionChange> isVariable = new HashMap<>();
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr.isMethod(isNameExpr)).isMethod(TransactionChange::isCreateOrUpdate).isMethod(isParameter -> isMethod(isNameExpr, isNameExpr.isMethod()).isMethod(isNameExpr));
        List<String> isVariable = isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isParameter -> isNameExpr.isMethod(isNameExpr).isMethod() > isIntegerConstant).isMethod(isNameExpr.isMethod());
        isNameExpr.isMethod(isNameExpr).isMethod(isParameter -> isNameExpr.isMethod(isNameExpr, isMethod(isNameExpr.isMethod(isNameExpr))));
        isNameExpr = isMethod(isNameExpr, isNameExpr);
        isNameExpr = isMethod(isNameExpr, isNameExpr);
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    private List<String> isMethod(Stream<TransactionChange> isParameter) {
        return isNameExpr.isMethod(TransactionChange::isDelete).isMethod(TransactionChange::uuid).isMethod(isNameExpr.isMethod());
    }

    private List<TransactionChange> isMethod(List<TransactionChange> isParameter, List<String> isParameter) {
        return isNameExpr.isMethod(isNameExpr).isMethod(isParameter -> isNameExpr.isMethod() || !isNameExpr.isMethod(isNameExpr.isMethod())).isMethod(isNameExpr.isMethod());
    }

    private List<TransactionChange> isMethod(List<TransactionChange> isParameter, HashMap<String, TransactionChange> isParameter) {
        return isNameExpr.isMethod(isNameExpr).isMethod(isParameter -> isNameExpr.isMethod() && isNameExpr.isMethod(isNameExpr.isMethod()) ? isNameExpr.isMethod(isNameExpr.isMethod()) : isNameExpr).isMethod().isMethod(isNameExpr.isMethod());
    }

    @VisibleForTesting
    public TransactionChange isMethod(List<TransactionChange> isParameter) {
        if (isNameExpr.isMethod() < isIntegerConstant) {
            throw new IllegalStateException("isStringConstant");
        }
        return isNameExpr.isMethod(isNameExpr).isMethod(TransactionChange::timeStamp).isMethod(this::mergeUpdate).isMethod();
    }

    private TransactionChange isMethod(TransactionChange isParameter, TransactionChange isParameter) {
        if (!(isNameExpr.isMethod() && isNameExpr.isMethod())) {
            throw new IllegalStateException("isStringConstant");
        }
        if (!isNameExpr.isMethod().isMethod(isNameExpr.isMethod())) {
            throw new IllegalStateException("isStringConstant");
        }
        TransactionChange.Builder isVariable = isNameExpr.isMethod();
        if (isNameExpr.isMethod() != null) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        if (isNameExpr.isMethod() != null) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        if (isNameExpr.isMethod() != null) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        if (isNameExpr.isMethod() != null) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        if (isNameExpr.isMethod() != null) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        if (isNameExpr.isMethod() != null) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        if (isNameExpr.isMethod() != null) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        if (isNameExpr.isMethod() != null) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        if (isNameExpr.isMethod() != null) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        if (isNameExpr.isMethod() != null) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        if (isNameExpr.isMethod() != null) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        if (isNameExpr.isMethod() != null) {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }
        return isNameExpr.isMethod().isMethod();
    }

    private Uri isMethod(long isParameter, long isParameter) {
        return isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr)).isMethod();
    }

    private Uri isMethod(long isParameter) {
        return isNameExpr.isFieldAccessExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod(isNameExpr)).isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant").isMethod();
    }

    private List<TransactionChange> isMethod(HashMap<String, List<TransactionChange>> isParameter, String isParameter) {
        List<TransactionChange> isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr == null) {
            isNameExpr = new ArrayList<>();
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        return isNameExpr;
    }

    private boolean isMethod(ContentProviderClient isParameter, Uri isParameter) throws RemoteException {
        boolean isVariable = true;
        Cursor isVariable = isNameExpr.isMethod(isNameExpr, new String[] { "isStringConstant" }, null, null, null);
        if (isNameExpr != null) {
            if (isNameExpr.isMethod()) {
                isNameExpr = isNameExpr.isMethod(isIntegerConstant) > isIntegerConstant;
            }
            isNameExpr.isMethod();
        }
        return isNameExpr;
    }

    @VisibleForTesting
    public org.totschnig.myexpenses.model.Account isMethod() {
        return isNameExpr.isMethod();
    }

    private boolean isMethod(Context isParameter) {
        ConnectivityManager isVariable = (ConnectivityManager) isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        if (isNameExpr == null)
            return true;
        NetworkInfo isVariable = isNameExpr.isMethod();
        return (isNameExpr != null && isNameExpr.isMethod() && isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr);
    }

    private boolean isMethod(ContentProviderClient isParameter, PrefKey isParameter, boolean isParameter) {
        String isVariable = isMethod(isNameExpr, isNameExpr.isMethod());
        return isNameExpr != null ? isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod()) : isNameExpr;
    }

    private String isMethod(ContentProviderClient isParameter, String isParameter) {
        try {
            Cursor isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, new String[] { isNameExpr }, isNameExpr + "isStringConstant", new String[] { isNameExpr }, null);
            if (isNameExpr != null) {
                if (isNameExpr.isMethod()) {
                    return isNameExpr.isMethod(isIntegerConstant);
                }
                isNameExpr.isMethod();
            }
        } catch (RemoteException isParameter) {
        }
        return null;
    }

    private void isMethod(ContentProviderClient isParameter, String isParameter) {
        try {
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr + "isStringConstant", new String[] { isNameExpr });
        } catch (RemoteException isParameter) {
        }
    }
}
