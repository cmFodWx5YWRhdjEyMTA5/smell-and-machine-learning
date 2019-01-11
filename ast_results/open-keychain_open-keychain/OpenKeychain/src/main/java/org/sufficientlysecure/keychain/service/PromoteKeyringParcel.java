// isComment
package org.sufficientlysecure.keychain.service;

import java.util.List;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class isClassOrIsInterface implements Parcelable {

    public abstract long isMethod();

    @Nullable
    @SuppressWarnings("isStringConstant")
    public abstract byte[] isMethod();

    @Nullable
    @SuppressWarnings("isStringConstant")
    public abstract List<byte[]> isMethod();

    public static PromoteKeyringParcel isMethod(long isParameter, byte[] isParameter, @Nullable List<byte[]> isParameter) {
        return new AutoValue_PromoteKeyringParcel(isNameExpr, isNameExpr, isNameExpr);
    }
}
