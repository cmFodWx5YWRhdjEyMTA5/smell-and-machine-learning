// isComment
package org.totschnig.myexpenses.sync.json;

import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import org.totschnig.myexpenses.model.Account;
import org.totschnig.myexpenses.model.AccountType;
import org.totschnig.myexpenses.model.CurrencyContext;
import org.totschnig.myexpenses.model.CurrencyUnit;
import org.totschnig.myexpenses.preference.PrefKey;

@AutoValue
public abstract class isClassOrIsInterface implements Parcelable {

    public static TypeAdapter<AccountMetaData> isMethod(Gson isParameter) {
        return new AutoValue_AccountMetaData.GsonTypeAdapter(isNameExpr);
    }

    public static Builder isMethod() {
        return new AutoValue_AccountMetaData.Builder();
    }

    public abstract String isMethod();

    public abstract String isMethod();

    public abstract int isMethod();

    public abstract String isMethod();

    public abstract long isMethod();

    public abstract String isMethod();

    public abstract String isMethod();

    @Nullable
    public abstract Double isMethod();

    @Nullable
    public abstract String isMethod();

    @Override
    public String isMethod() {
        return isMethod() + "isStringConstant" + isMethod() + "isStringConstant";
    }

    public Account isMethod(CurrencyContext isParameter) {
        AccountType isVariable;
        try {
            isNameExpr = isNameExpr.isMethod(isMethod());
        } catch (IllegalArgumentException isParameter) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
        }
        Account isVariable = new Account(isMethod(), isNameExpr.isMethod(isMethod()), isMethod(), isMethod(), isNameExpr, isMethod());
        isNameExpr.isFieldAccessExpr = isMethod();
        String isVariable = isNameExpr.isFieldAccessExpr.isMethod(null);
        final Double isVariable = isMethod();
        if (isNameExpr != null && isNameExpr != null && isNameExpr.isMethod(isMethod())) {
            isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr;
    }

    public static AccountMetaData isMethod(Account isParameter) {
        String isVariable = isNameExpr.isFieldAccessExpr.isMethod(null);
        final String isVariable = isNameExpr.isMethod().isMethod();
        final Builder isVariable = isMethod().isMethod(isNameExpr).isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr).isMethod(isNameExpr.isMethod()).isMethod(isNameExpr.isFieldAccessExpr.isMethod()).isMethod(isNameExpr.isMethod().isMethod());
        if (isNameExpr != null && !isNameExpr.isMethod(isNameExpr)) {
            isNameExpr.isMethod(isNameExpr.isMethod()).isMethod(isNameExpr);
        }
        return isNameExpr.isMethod();
    }

    @AutoValue.Builder
    public abstract static class isClassOrIsInterface {

        public abstract Builder isMethod(String isParameter);

        public abstract Builder isMethod(String isParameter);

        public abstract Builder isMethod(int isParameter);

        public abstract Builder isMethod(String isParameter);

        public abstract Builder isMethod(long isParameter);

        public abstract Builder isMethod(String isParameter);

        public abstract Builder isMethod(String isParameter);

        public abstract Builder isMethod(Double isParameter);

        public abstract Builder isMethod(String isParameter);

        public abstract AccountMetaData isMethod();
    }
}
