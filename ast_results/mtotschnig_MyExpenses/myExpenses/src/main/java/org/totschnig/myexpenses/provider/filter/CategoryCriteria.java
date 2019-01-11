// isComment
package org.totschnig.myexpenses.provider.filter;

import android.os.Parcel;
import android.os.Parcelable;
import org.totschnig.myexpenses.MyApplication;
import org.totschnig.myexpenses.R;
import org.totschnig.myexpenses.provider.DatabaseConstants;
import org.totschnig.myexpenses.util.Utils;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_CATID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_PARENTID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.KEY_ROWID;
import static org.totschnig.myexpenses.provider.DatabaseConstants.TABLE_CATEGORIES;

public class isClassOrIsInterface extends IdCriteria {

    public isConstructor(String isParameter, long... isParameter) {
        super(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr, isNameExpr, isNameExpr);
    }

    @SuppressWarnings("isStringConstant")
    public isConstructor(String isParameter, String... isParameter) {
        super(isNameExpr.isMethod().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr), isNameExpr.isFieldAccessExpr, isNameExpr, isNameExpr);
    }

    public isConstructor(Parcel isParameter) {
        super(isNameExpr);
    }

    @Override
    public String isMethod() {
        String isVariable = isNameExpr.isFieldAccessExpr.isFieldAccessExpr.isMethod(isNameExpr.isFieldAccessExpr);
        return isNameExpr + "isStringConstant" + isNameExpr.isFieldAccessExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant";
    }

    @Override
    public String[] isMethod() {
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    public static final Parcelable.Creator<CategoryCriteria> isVariable = new Parcelable.Creator<CategoryCriteria>() {

        public CategoryCriteria isMethod(Parcel isParameter) {
            return new CategoryCriteria(isNameExpr);
        }

        public CategoryCriteria[] isMethod(int isParameter) {
            return new CategoryCriteria[isNameExpr];
        }
    };

    public static Criteria isMethod(String isParameter) {
        return isNameExpr.isMethod("isStringConstant") ? new NullCriteria(isNameExpr) : isNameExpr.isMethod(isNameExpr, CategoryCriteria.class);
    }
}
