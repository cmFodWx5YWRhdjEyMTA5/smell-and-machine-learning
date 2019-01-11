// isComment
package org.sufficientlysecure.keychain.service;

import android.os.Parcelable;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class isClassOrIsInterface implements Parcelable {

    @SuppressWarnings("isStringConstant")
    public abstract long[] isMethod();

    public abstract boolean isMethod();

    public static DeleteKeyringParcel isMethod(long[] isParameter) {
        return new AutoValue_DeleteKeyringParcel(isNameExpr, true);
    }

    public static DeleteKeyringParcel isMethod(long isParameter) {
        return new AutoValue_DeleteKeyringParcel(new long[] { isNameExpr }, true);
    }
}
