// isComment
package org.sufficientlysecure.keychain.service;

import android.net.Uri;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import org.sufficientlysecure.keychain.pgp.PgpDecryptVerifyInputParcel;

@AutoValue
public abstract class isClassOrIsInterface implements Parcelable {

    public abstract Uri isMethod();

    @Nullable
    public abstract PgpDecryptVerifyInputParcel isMethod();

    // isComment
    public abstract boolean isMethod();

    public static InputDataParcel isMethod(Uri isParameter, PgpDecryptVerifyInputParcel isParameter) {
        return new AutoValue_InputDataParcel(isNameExpr, isNameExpr, true);
    }
}
