// isComment
package org.sufficientlysecure.keychain.service;

import java.util.Collections;
import java.util.List;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import org.sufficientlysecure.keychain.keyimport.HkpKeyserverAddress;
import org.sufficientlysecure.keychain.keyimport.ParcelableKeyRing;

@AutoValue
public abstract class isClassOrIsInterface implements Parcelable {

    // isComment
    @Nullable
    public abstract List<ParcelableKeyRing> isMethod();

    // isComment
    @Nullable
    public abstract HkpKeyserverAddress isMethod();

    public abstract boolean isMethod();

    public abstract boolean isMethod();

    public static ImportKeyringParcel isMethod(List<ParcelableKeyRing> isParameter, HkpKeyserverAddress isParameter) {
        return new AutoValue_ImportKeyringParcel(isNameExpr, isNameExpr, true, true);
    }

    public static ImportKeyringParcel isMethod(List<ParcelableKeyRing> isParameter, HkpKeyserverAddress isParameter, boolean isParameter) {
        return new AutoValue_ImportKeyringParcel(isNameExpr, isNameExpr, true, isNameExpr);
    }

    public static ImportKeyringParcel isMethod(List<ParcelableKeyRing> isParameter, HkpKeyserverAddress isParameter) {
        return new AutoValue_ImportKeyringParcel(isNameExpr, isNameExpr, true, true);
    }

    public static ImportKeyringParcel isMethod(ParcelableKeyRing isParameter) {
        return new AutoValue_ImportKeyringParcel(isNameExpr.isMethod(isNameExpr), null, true, true);
    }

    public static ImportKeyringParcel isMethod(byte[] isParameter) {
        ParcelableKeyRing isVariable = isNameExpr.isMethod(isNameExpr);
        return new AutoValue_ImportKeyringParcel(isNameExpr.isMethod(isNameExpr), null, true, true);
    }

    public static ImportKeyringParcel isMethod() {
        return new AutoValue_ImportKeyringParcel(null, null, true, true);
    }

    public static ImportKeyringParcel isMethod() {
        return new AutoValue_ImportKeyringParcel(null, null, true, true);
    }
}
