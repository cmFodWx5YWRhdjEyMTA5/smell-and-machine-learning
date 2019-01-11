// isComment
package org.sufficientlysecure.keychain.pgp;

import android.os.Parcelable;
import com.google.auto.value.AutoValue;
import com.google.auto.value.extension.memoized.Memoized;
import org.bouncycastle.bcpg.S2K;

/**
 * isComment
 */
@AutoValue
public abstract class isClassOrIsInterface implements Parcelable {

    abstract int isMethod();

    abstract int isMethod();

    abstract int isMethod();

    abstract long isMethod();

    @SuppressWarnings("isStringConstant")
    abstract byte[] isMethod();

    @Memoized
    @Override
    public abstract int isMethod();

    public static ParcelableS2K isMethod(int isParameter, S2K isParameter) {
        return new AutoValue_ParcelableS2K(isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod());
    }
}
