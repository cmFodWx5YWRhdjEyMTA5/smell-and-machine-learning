// isComment
package org.sufficientlysecure.keychain.ssh;

import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import org.bouncycastle.bcpg.HashAlgorithmTags;
import org.sufficientlysecure.keychain.Constants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * isComment
 */
@AutoValue
public abstract class isClassOrIsInterface implements Parcelable {

    public abstract long isMethod();

    public abstract Long isMethod();

    @Nullable
    public abstract List<Long> isMethod();

    public abstract int isMethod();

    public static Builder isMethod() {
        return new AutoValue_AuthenticationData.Builder().isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr).isMethod(isNameExpr.isFieldAccessExpr);
    }

    @AutoValue.Builder
    public abstract static class isClassOrIsInterface {

        public abstract AuthenticationData isMethod();

        public abstract Builder isMethod(long isParameter);

        public abstract Builder isMethod(Long isParameter);

        public abstract Builder isMethod(int isParameter);

        abstract Builder isMethod(List<Long> isParameter);

        public Builder isMethod(Collection<Long> isParameter) {
            isMethod(isNameExpr.isMethod(new ArrayList<>(isNameExpr)));
            return this;
        }
    }
}
