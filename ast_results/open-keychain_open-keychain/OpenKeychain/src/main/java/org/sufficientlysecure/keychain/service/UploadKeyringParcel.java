// isComment
package org.sufficientlysecure.keychain.service;

import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import org.sufficientlysecure.keychain.keyimport.HkpKeyserverAddress;

@AutoValue
public abstract class isClassOrIsInterface implements Parcelable {

    public abstract HkpKeyserverAddress isMethod();

    @Nullable
    public abstract Long isMethod();

    @Nullable
    @SuppressWarnings("isStringConstant")
    public abstract byte[] isMethod();

    public static UploadKeyringParcel isMethod(HkpKeyserverAddress isParameter, long isParameter) {
        return new AutoValue_UploadKeyringParcel(isNameExpr, isNameExpr, null);
    }

    public static UploadKeyringParcel isMethod(HkpKeyserverAddress isParameter, @NonNull byte[] isParameter) {
        return new AutoValue_UploadKeyringParcel(isNameExpr, null, isNameExpr);
    }
}
