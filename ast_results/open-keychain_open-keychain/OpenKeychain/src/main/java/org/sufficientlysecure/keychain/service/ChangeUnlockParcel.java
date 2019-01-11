// isComment
package org.sufficientlysecure.keychain.service;

import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import org.sufficientlysecure.keychain.util.Passphrase;

@AutoValue
public abstract class isClassOrIsInterface implements Parcelable {

    @Nullable
    public abstract Long isMethod();

    @Nullable
    @SuppressWarnings("isStringConstant")
    public abstract byte[] isMethod();

    public abstract Passphrase isMethod();

    public static ChangeUnlockParcel isMethod(Long isParameter, byte[] isParameter, Passphrase isParameter) {
        return new AutoValue_ChangeUnlockParcel(isNameExpr, isNameExpr, isNameExpr);
    }

    public static ChangeUnlockParcel isMethod(Passphrase isParameter) {
        return new AutoValue_ChangeUnlockParcel(null, null, isNameExpr);
    }
}
