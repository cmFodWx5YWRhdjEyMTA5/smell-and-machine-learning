// isComment
package org.andstatus.app.context;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.support.annotation.NonNull;
import org.andstatus.app.account.MyAccounts;
import org.andstatus.app.database.DatabaseHolder;
import org.andstatus.app.net.http.HttpConnection;
import org.andstatus.app.notification.NotificationData;
import org.andstatus.app.notification.Notifier;
import org.andstatus.app.origin.PersistentOrigins;
import org.andstatus.app.service.ConnectionState;
import org.andstatus.app.timeline.meta.PersistentTimelines;
import org.andstatus.app.timeline.meta.Timeline;
import org.andstatus.app.user.CachedUsersAndActors;
import org.andstatus.app.util.IdentifiableInstance;

public interface isClassOrIsInterface extends IdentifiableInstance {

    MyContext isVariable = new MyContextImpl(null, null, "isStringConstant");

    MyContext isMethod(Object isParameter);

    MyContext isMethod(Context isParameter, Object isParameter);

    boolean isMethod();

    boolean isMethod();

    MyContextState isMethod();

    Context isMethod();

    long isMethod();

    DatabaseHolder isMethod();

    String isMethod();

    SQLiteDatabase isMethod();

    @NonNull
    CachedUsersAndActors isMethod();

    @NonNull
    MyAccounts isMethod();

    @NonNull
    PersistentOrigins isMethod();

    @NonNull
    PersistentTimelines isMethod();

    default void isMethod(@NonNull String isParameter, @NonNull ContentValues isParameter) {
    }

    void isMethod();

    boolean isMethod();

    void isMethod();

    ConnectionState isMethod();

    /**
     * isComment
     */
    boolean isMethod();

    void isMethod(boolean isParameter);

    Notifier isMethod();

    void isMethod(NotificationData isParameter);

    void isMethod(@NonNull Timeline isParameter);

    default boolean isMethod() {
        return true;
    }

    default HttpConnection isMethod() {
        return null;
    }

    default boolean isMethod() {
        return isMethod() == null;
    }
}
