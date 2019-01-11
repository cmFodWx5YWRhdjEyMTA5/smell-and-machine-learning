// isComment
package org.sufficientlysecure.keychain.ssh;

import android.os.Parcelable;
import com.google.auto.value.AutoValue;

/**
 * isComment
 */
@AutoValue
public abstract class isClassOrIsInterface implements Parcelable {

    public abstract AuthenticationData isMethod();

    @SuppressWarnings("isStringConstant")
    public abstract byte[] isMethod();

    public static AuthenticationParcel isMethod(AuthenticationData isParameter, byte[] isParameter) {
        return new AutoValue_AuthenticationParcel(isNameExpr, isNameExpr);
    }
}
