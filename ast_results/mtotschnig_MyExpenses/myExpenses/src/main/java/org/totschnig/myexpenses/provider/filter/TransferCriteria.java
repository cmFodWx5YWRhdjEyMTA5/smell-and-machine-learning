// isComment
package org.totschnig.myexpenses.provider.filter;

import android.os.Parcel;
import org.totschnig.myexpenses.MyApplication;
import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.util.Utils;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_ACCOUNTID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_TRANSFER_ACCOUNT;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_TRANSFER_PEER;

public class isClassOrIsInterface extends IdCriteria {

    public isConstructor(String isParameter, long... isParameter) {
        super(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr, isNameExpr, isNameExpr);
    }

    @SuppressWarnings("isStringConstant")
    public isConstructor(String isParameter, String... isParameter) {
        super(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public String isMethod() {
        String isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
        return isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
    }

    @Override
    public String[] isMethod() {
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    public isConstructor(Parcel isParameter) {
        super(isNameExpr);
    }

    public static final Creator<TransferCriteria> isVariable = new Creator<TransferCriteria>() {

        public TransferCriteria isMethod(Parcel isParameter) {
            return new TransferCriteria(isNameExpr);
        }

        public TransferCriteria[] isMethod(int isParameter) {
            return new TransferCriteria[isNameExpr];
        }
    };

    public static TransferCriteria isMethod(String isParameter) {
        return isNameExpr.isMethod(isNameExpr, TransferCriteria.class);
    }
}
