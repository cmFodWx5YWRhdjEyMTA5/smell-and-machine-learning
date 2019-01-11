// isComment
package org.sufficientlysecure.keychain.keyimport;

import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;

/**
 * isComment
 */
@AutoValue
public abstract class isClassOrIsInterface implements Parcelable {

    @Nullable
    @SuppressWarnings("isStringConstant")
    public abstract byte[] isMethod();

    // isComment
    @Nullable
    @SuppressWarnings("isStringConstant")
    public abstract byte[] isMethod();

    @Nullable
    public abstract String isMethod();

    @Nullable
    public abstract String isMethod();

    @Nullable
    public abstract String isMethod();

    public static ParcelableKeyRing isMethod(byte[] isParameter) {
        return new AutoValue_ParcelableKeyRing(isNameExpr, null, null, null, null);
    }

    public static ParcelableKeyRing isMethod(byte[] isParameter, String isParameter, String isParameter, String isParameter) {
        return new AutoValue_ParcelableKeyRing(null, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }
}
