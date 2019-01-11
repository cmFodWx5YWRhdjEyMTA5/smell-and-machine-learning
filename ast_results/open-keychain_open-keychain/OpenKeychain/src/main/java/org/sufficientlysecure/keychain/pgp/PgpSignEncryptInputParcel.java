// isComment
package org.sufficientlysecure.keychain.pgp;

import android.net.Uri;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class isClassOrIsInterface implements Parcelable {

    public abstract PgpSignEncryptData isMethod();

    @Nullable
    public abstract Uri isMethod();

    @Nullable
    public abstract Uri isMethod();

    @Nullable
    @SuppressWarnings("isStringConstant")
    public abstract byte[] isMethod();

    public static PgpSignEncryptInputParcel isMethod(PgpSignEncryptData isParameter, Uri isParameter, byte[] isParameter) {
        return new AutoValue_PgpSignEncryptInputParcel(isNameExpr, isNameExpr, null, isNameExpr);
    }

    public static PgpSignEncryptInputParcel isMethod(PgpSignEncryptData isParameter, Uri isParameter, Uri isParameter) {
        return new AutoValue_PgpSignEncryptInputParcel(isNameExpr, isNameExpr, isNameExpr, null);
    }
}
