// isComment
package org.totschnig.myexpenses.viewmodel.data;

import android.database.Cursor;
import com.gabrielittner.auto.value.cursor.ColumnName;
import com.google.auto.value.AutoValue;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_IS_NUMBERED;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_LABEL;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_ROWID;

@AutoValue
public abstract class isClassOrIsInterface {

    @ColumnName(isNameExpr)
    public abstract long isMethod();

    @ColumnName(isNameExpr)
    public abstract String isMethod();

    @ColumnName(isNameExpr)
    public abstract boolean isMethod();

    public static PaymentMethod isMethod(Cursor isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public String isMethod() {
        return isMethod();
    }
}
