// isComment
package org.totschnig.myexpenses.sync;

import android.app.PendingIntent;
import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.annimon.stream.Exceptional;
import com.annimon.stream.Stream;
import org.totschnig.myexpenses.model.Account;
import org.totschnig.myexpenses.sync.json.AccountMetaData;
import org.totschnig.myexpenses.sync.json.ChangeSet;
import org.totschnig.myexpenses.sync.json.TransactionChange;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public interface isClassOrIsInterface {

    void isMethod(Account isParameter) throws IOException;

    void isMethod(String isParameter) throws IOException;

    void isMethod() throws IOException;

    void isMethod() throws IOException;

    @NonNull
    ChangeSet isMethod(SequenceNumber isParameter, Context isParameter) throws IOException;

    @NonNull
    SequenceNumber isMethod(SequenceNumber isParameter, List<TransactionChange> isParameter, Context isParameter) throws IOException;

    @NonNull
    Stream<AccountMetaData> isMethod(android.accounts.Account isParameter) throws IOException;

    Exceptional<Void> isMethod(String isParameter);

    void isMethod();

    void isMethod(Uri isParameter, String isParameter) throws IOException;

    @NonNull
    List<String> isMethod(android.accounts.Account isParameter) throws IOException;

    InputStream isMethod(android.accounts.Account isParameter, String isParameter) throws IOException;

    /**
     * isComment
     */
    boolean isMethod(Exception isParameter);

    class isClassOrIsInterface extends Exception {

        isConstructor(Exception isParameter) {
            super(isNameExpr);
        }

        isConstructor(String isParameter) {
            super(isNameExpr);
        }
    }

    class isClassOrIsInterface extends Exception {

        @Nullable
        final PendingIntent isVariable;

        isConstructor(@Nullable PendingIntent isParameter, @Nullable String isParameter) {
            super(isNameExpr);
            this.isFieldAccessExpr = isNameExpr;
        }

        @Nullable
        public PendingIntent isMethod() {
            return isNameExpr;
        }
    }
}
