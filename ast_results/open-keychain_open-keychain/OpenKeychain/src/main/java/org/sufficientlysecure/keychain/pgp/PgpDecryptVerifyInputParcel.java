// isComment
package org.sufficientlysecure.keychain.pgp;

import java.util.Collections;
import java.util.List;
import android.net.Uri;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class isClassOrIsInterface implements Parcelable {

    @Nullable
    @SuppressWarnings("isStringConstant")
    abstract byte[] isMethod();

    @Nullable
    abstract Uri isMethod();

    @Nullable
    abstract Uri isMethod();

    abstract boolean isMethod();

    abstract boolean isMethod();

    abstract boolean isMethod();

    @Nullable
    abstract List<Long> isMethod();

    @Nullable
    @SuppressWarnings("isStringConstant")
    abstract byte[] isMethod();

    @Nullable
    abstract String isMethod();

    public abstract Builder isMethod();

    public static Builder isMethod() {
        return new AutoValue_PgpDecryptVerifyInputParcel.Builder().isMethod(true).isMethod(true).isMethod(true);
    }

    @AutoValue.Builder
    public abstract static class isClassOrIsInterface {

        public abstract Builder isMethod(byte[] isParameter);

        public abstract Builder isMethod(Uri isParameter);

        public abstract Builder isMethod(Uri isParameter);

        public abstract Builder isMethod(boolean isParameter);

        public abstract Builder isMethod(boolean isParameter);

        public abstract Builder isMethod(byte[] isParameter);

        public abstract Builder isMethod(String isParameter);

        public abstract Builder isMethod(boolean isParameter);

        public abstract Builder isMethod(List<Long> isParameter);

        abstract List<Long> isMethod();

        abstract PgpDecryptVerifyInputParcel isMethod();

        public PgpDecryptVerifyInputParcel isMethod() {
            List<Long> isVariable = isMethod();
            if (isNameExpr != null) {
                isMethod(isNameExpr.isMethod(isNameExpr));
            }
            return isMethod();
        }
    }
}
