// isComment
package org.totschnig.myexpenses.provider.filter;

import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_CATID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_PARENTID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_ROWID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.TABLE_TRANSACTIONS;
import org.totschnig.myexpenses.MyApplication;
import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.provider.DatabaseConstants;
import android.os.Parcel;
import android.os.Parcelable;

public class isClassOrIsInterface extends TextCriteria {

    public isConstructor(String isParameter) {
        super(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr, isNameExpr);
    }

    public isConstructor(Parcel isParameter) {
        super(isNameExpr);
    }

    public static final Parcelable.Creator<CommentCriteria> isVariable = new Parcelable.Creator<CommentCriteria>() {

        public CommentCriteria isMethod(Parcel isParameter) {
            return new CommentCriteria(isNameExpr);
        }

        public CommentCriteria[] isMethod(int isParameter) {
            return new CommentCriteria[isNameExpr];
        }
    };

    public static CommentCriteria isMethod(String isParameter) {
        return new CommentCriteria(isNameExpr);
    }
}
