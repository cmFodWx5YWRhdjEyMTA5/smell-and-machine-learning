// isComment
package com.etesync.syncadapter;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Process;
import android.os.StrictMode;
import android.provider.CalendarContract;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationManagerCompat;
import android.support.v4.content.ContextCompat;
import android.util.Log;
import android.widget.Toast;
import com.etesync.syncadapter.log.LogcatHandler;
import com.etesync.syncadapter.log.PlainTextFormatter;
import com.etesync.syncadapter.model.CollectionInfo;
import com.etesync.syncadapter.model.JournalEntity;
import com.etesync.syncadapter.model.Models;
import com.etesync.syncadapter.model.ServiceDB;
import com.etesync.syncadapter.model.ServiceEntity;
import com.etesync.syncadapter.model.Settings;
import com.etesync.syncadapter.resource.LocalAddressBook;
import com.etesync.syncadapter.resource.LocalCalendar;
import com.etesync.syncadapter.ui.AccountsActivity;
import com.etesync.syncadapter.utils.HintManager;
import com.etesync.syncadapter.utils.LanguageUtils;
import org.acra.ACRA;
import org.acra.annotation.AcraCore;
import org.acra.annotation.AcraMailSender;
import org.acra.annotation.AcraToast;
import org.apache.commons.lang3.time.DateFormatUtils;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.HostnameVerifier;
import at.bitfire.cert4android.CustomCertManager;
import at.bitfire.ical4android.CalendarStorageException;
import at.bitfire.vcard4android.ContactsStorageException;
import io.requery.Persistable;
import io.requery.android.sqlite.DatabaseSource;
import io.requery.meta.EntityModel;
import io.requery.sql.Configuration;
import io.requery.sql.EntityDataStore;
import okhttp3.internal.tls.OkHostnameVerifier;

@AcraCore(buildConfigClass = BuildConfig.class, logcatArguments = { "isStringConstant", "isStringConstant", "isStringConstant", "isStringConstant" })
@AcraMailSender(mailTo = "isStringConstant", subject = isNameExpr.isFieldAccessExpr.isFieldAccessExpr, reportFileName = "isStringConstant")
@AcraToast(resText = isNameExpr.isFieldAccessExpr.isFieldAccessExpr, length = isNameExpr.isFieldAccessExpr)
public class isClassOrIsInterface extends Application {

    public static final String isVariable = "isStringConstant", isVariable = "isStringConstant", isVariable = "isStringConstant", isVariable = "isStringConstant", isVariable = "isStringConstant", isVariable = "isStringConstant", isVariable = "isStringConstant";

    public static final String isVariable = "isStringConstant";

    public static final int isVariable = isIntegerConstant;

    public static final String isVariable = "isStringConstant";

    public static Locale isVariable = isNameExpr.isMethod();

    private static String isVariable;

    private CustomCertManager isVariable;

    private static SSLSocketFactoryCompat isVariable;

    private static HostnameVerifier isVariable;

    public static final Logger isVariable = isNameExpr.isMethod("isStringConstant");

    static {
        isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr.isFieldAccessExpr = isNameExpr.isMethod("isStringConstant");
    }

    private static String isVariable;

    private static String isVariable;

    private static String isVariable;

    public static String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    public CustomCertManager isMethod() {
        return this.isFieldAccessExpr;
    }

    public static SSLSocketFactoryCompat isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    public static HostnameVerifier isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    public static String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    public static String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    public static String isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    @SuppressLint("isStringConstant")
    public void isMethod() {
        super.isMethod();
        isMethod();
        isMethod();
        isNameExpr.isMethod();
        isMethod();
        isNameExpr = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr = isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isMethod();
    }

    @Override
    protected void isMethod(Context isParameter) {
        super.isMethod(isNameExpr);
        // isComment
        isNameExpr.isMethod(this);
    }

    private void isMethod() {
        ServiceDB.OpenHelper isVariable = new ServiceDB.OpenHelper(this);
        String isVariable = new Settings(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr, null);
        if (isNameExpr != null && !isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isMethod(this, isNameExpr);
        }
        isNameExpr.isMethod();
    }

    public void isMethod() {
        if (isNameExpr.isFieldAccessExpr) {
            if (isNameExpr != null)
                isNameExpr.isMethod();
            ServiceDB.OpenHelper isVariable = new ServiceDB.OpenHelper(this);
            Settings isVariable = new Settings(isNameExpr.isMethod());
            isNameExpr = new CustomCertManager(this, !isNameExpr.isMethod(isNameExpr, true));
            isNameExpr = new SSLSocketFactoryCompat(isNameExpr);
            isNameExpr = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
            isNameExpr.isMethod();
        }
    }

    public void isMethod() {
        ServiceDB.OpenHelper isVariable = new ServiceDB.OpenHelper(this);
        Settings isVariable = new Settings(isNameExpr.isMethod());
        boolean isVariable = isNameExpr.isMethod(isNameExpr, true), isVariable = isNameExpr || isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + isNameExpr);
        // isComment
        final Logger isVariable = isNameExpr.isMethod("isStringConstant");
        isNameExpr.isMethod(isNameExpr ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr);
        // isComment
        isNameExpr.isMethod(true);
        for (Handler isVariable : isNameExpr.isMethod()) isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        NotificationManagerCompat isVariable = isNameExpr.isMethod(this);
        // isComment
        if (isNameExpr) {
            NotificationCompat.Builder isVariable = new NotificationCompat.Builder(this);
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isMethod(this)).isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(true);
            File isVariable = isMethod(null);
            if (isNameExpr != null)
                try {
                    String isVariable = new File(isNameExpr, "isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod(isNameExpr.isMethod(), "isStringConstant") + "isStringConstant").isMethod();
                    isNameExpr.isMethod("isStringConstant" + isNameExpr);
                    FileHandler isVariable = new FileHandler(isNameExpr);
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
                    isNameExpr.isMethod(isNameExpr);
                    isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)).isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr).isMethod(new NotificationCompat.BigTextStyle().isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod()))).isMethod(true);
                } catch (IOException isParameter) {
                    isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, "isStringConstant", isNameExpr);
                    isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, isNameExpr.isMethod())).isMethod(isNameExpr.isFieldAccessExpr);
                }
            else
                isNameExpr.isMethod(isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isMethod());
        } else
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        isNameExpr.isMethod();
    }

    @Nullable
    @TargetApi(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)
    public static Bitmap isMethod(@NonNull Context isParameter) {
        Bitmap isVariable = null;
        Drawable isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        if (isNameExpr instanceof BitmapDrawable)
            isNameExpr = ((BitmapDrawable) isNameExpr).isMethod();
        return isNameExpr;
    }

    public static class isClassOrIsInterface extends BroadcastReceiver {

        public static final String isVariable = isNameExpr.isFieldAccessExpr + "isStringConstant";

        @Override
        public void isMethod(Context isParameter, Intent isParameter) {
            isNameExpr.isMethod("isStringConstant");
            App isVariable = (App) isNameExpr.isMethod();
            isNameExpr.isMethod();
        }
    }

    private EntityDataStore<Persistable> isVariable;

    /**
     * isComment
     */
    public EntityDataStore<Persistable> isMethod() {
        if (isNameExpr == null) {
            // isComment
            DatabaseSource isVariable = new MyDatabaseSource(this, isNameExpr.isFieldAccessExpr, isIntegerConstant);
            Configuration isVariable = isNameExpr.isMethod();
            isNameExpr = new EntityDataStore<>(isNameExpr);
        }
        return isNameExpr;
    }

    private static class isClassOrIsInterface extends DatabaseSource {

        isConstructor(Context isParameter, EntityModel isParameter, int isParameter) {
            super(isNameExpr, isNameExpr, isNameExpr);
        }

        @Override
        public void isMethod(SQLiteDatabase isParameter, int isParameter, int isParameter) {
            super.isMethod(isNameExpr, isNameExpr, isNameExpr);
            if (isNameExpr < isIntegerConstant) {
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod("isStringConstant");
                // isComment
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod("isStringConstant");
                isNameExpr.isMethod("isStringConstant");
            }
        }
    }

    // isComment
    private static final String isVariable = "isStringConstant";

    /**
     * isComment
     */
    private void isMethod() {
        SharedPreferences isVariable = isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
        if (isNameExpr.isMethod(isNameExpr, isIntegerConstant) == isIntegerConstant) {
            isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr.isFieldAccessExpr).isMethod();
        }
    }

    private void isMethod(int isParameter) {
        isNameExpr.isFieldAccessExpr.isMethod("isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr);
        if (isNameExpr < isIntegerConstant) {
            EntityDataStore<Persistable> isVariable = this.isMethod();
            ServiceDB.OpenHelper isVariable = new ServiceDB.OpenHelper(this);
            List<CollectionInfo> isVariable = isMethod(isNameExpr);
            for (CollectionInfo isVariable : isNameExpr) {
                JournalEntity isVariable = new JournalEntity(isNameExpr, isNameExpr);
                isNameExpr.isMethod(isNameExpr);
            }
            SQLiteDatabase isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null, null);
            isNameExpr.isMethod();
        }
        if (isNameExpr < isIntegerConstant) {
            /*isComment*/
            AccountManager isVariable = isNameExpr.isMethod(this);
            for (Account isVariable : isNameExpr.isMethod(isNameExpr.isMethod())) {
                try {
                    // isComment
                    new AccountSettings(this, isNameExpr);
                    LocalCalendar[] isVariable = (LocalCalendar[]) isNameExpr.isMethod(isNameExpr, this.isMethod().isMethod(isNameExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null, null);
                    for (LocalCalendar isVariable : isNameExpr) {
                        isNameExpr.isMethod();
                    }
                } catch (CalendarStorageException | InvalidAccountException isParameter) {
                    isNameExpr.isMethod();
                }
            }
            for (Account isVariable : isNameExpr.isMethod(isNameExpr.isMethod())) {
                LocalAddressBook isVariable = new LocalAddressBook(this, isNameExpr, this.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
                try {
                    isNameExpr.isMethod();
                } catch (ContactsStorageException isParameter) {
                    isNameExpr.isMethod();
                }
            }
        }
        if (isNameExpr < isIntegerConstant) {
            isNameExpr.isMethod(this, isNameExpr.isFieldAccessExpr, true);
        }
        if (isNameExpr < isIntegerConstant) {
            ServiceDB.OpenHelper isVariable = new ServiceDB.OpenHelper(this);
            isMethod(isNameExpr);
        }
    }

    public static class isClassOrIsInterface extends BroadcastReceiver {

        @Override
        @SuppressLint("isStringConstant")
        public void isMethod(Context isParameter, Intent isParameter) {
            isNameExpr.isFieldAccessExpr.isMethod("isStringConstant");
            App isVariable = (App) isNameExpr.isMethod();
            SharedPreferences isVariable = isNameExpr.isMethod("isStringConstant", isNameExpr.isFieldAccessExpr);
            int isVariable = isNameExpr.isMethod(isNameExpr, isIntegerConstant);
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod().isMethod(isNameExpr, isNameExpr.isFieldAccessExpr).isMethod();
        }
    }

    @NonNull
    private List<CollectionInfo> isMethod(ServiceDB.OpenHelper isParameter) {
        SQLiteDatabase isVariable = isNameExpr.isMethod();
        List<CollectionInfo> isVariable = new LinkedList<>();
        Cursor isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null, null, null, null, null, null);
        while (isNameExpr.isMethod()) {
            ContentValues isVariable = new ContentValues();
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
        }
        isNameExpr.isMethod();
        isNameExpr.isMethod();
        return isNameExpr;
    }

    public void isMethod(ServiceDB.OpenHelper isParameter) {
        SQLiteDatabase isVariable = isNameExpr.isMethod();
        EntityDataStore<Persistable> isVariable = this.isMethod();
        Cursor isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null, null, null, null, null, null);
        while (isNameExpr.isMethod()) {
            ContentValues isVariable = new ContentValues();
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            ServiceEntity isVariable = new ServiceEntity();
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
            isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr)));
            isNameExpr.isMethod(isNameExpr);
            for (JournalEntity isVariable : isNameExpr.isMethod(JournalEntity.class).isMethod(isNameExpr.isFieldAccessExpr.isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr))).isMethod()) {
                isNameExpr.isMethod(isNameExpr);
                isNameExpr.isMethod(isNameExpr);
            }
        }
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr, null, null);
        isNameExpr.isMethod();
        isNameExpr.isMethod();
    }
}
