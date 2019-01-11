// isComment
package org.sufficientlysecure.keychain.service;

import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import org.sufficientlysecure.keychain.keyimport.HkpKeyserverAddress;

@AutoValue
public abstract class isClassOrIsInterface implements Parcelable {

    public abstract long isMethod();

    public abstract boolean isMethod();

    @Nullable
    public abstract HkpKeyserverAddress isMethod();

    public static RevokeKeyringParcel isMethod(long isParameter, boolean isParameter, HkpKeyserverAddress isParameter) {
        return new AutoValue_RevokeKeyringParcel(isNameExpr, isNameExpr, isNameExpr);
    }
}
