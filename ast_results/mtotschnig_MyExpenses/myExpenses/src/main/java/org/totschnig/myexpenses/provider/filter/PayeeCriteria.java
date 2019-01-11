// isComment
package org.totschnig.myexpenses.provider.filter;

import android.os.Parcel;
import android.os.Parcelable;
import org.totschnig.myexpenses.MyApplication;
import org.totschnig.myexpenses.R;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_PAYEEID;

public class isClassOrIsInterface extends IdCriteria {

    public isConstructor(String isParameter, long... isParameter) {
        super(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr, isNameExpr, isNameExpr);
    }

    @SuppressWarnings("isStringConstant")
    public isConstructor(String isParameter, String... isParameter) {
        super(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(Parcel isParameter) {
        super(isNameExpr);
    }

    public static final Parcelable.Creator<PayeeCriteria> isVariable = new Parcelable.Creator<PayeeCriteria>() {

        public PayeeCriteria isMethod(Parcel isParameter) {
            return new PayeeCriteria(isNameExpr);
        }

        public PayeeCriteria[] isMethod(int isParameter) {
            return new PayeeCriteria[isNameExpr];
        }
    };

    public static Criteria isMethod(String isParameter) {
        return isNameExpr.isMethod("isStringConstant") ? new NullCriteria(isNameExpr) : isNameExpr.isMethod(isNameExpr, PayeeCriteria.class);
    }

    @Override
    protected boolean isMethod() {
        return true;
    }
}
