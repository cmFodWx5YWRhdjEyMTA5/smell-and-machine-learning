// isComment
package org.sufficientlysecure.keychain.service.input;

import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import android.os.Parcelable;
import android.support.annotation.CheckResult;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;
import com.ryanharter.auto.value.parcel.ParcelAdapter;
import org.sufficientlysecure.keychain.util.ByteMapParcelAdapter;
import org.sufficientlysecure.keychain.util.ParcelableProxy;
import org.sufficientlysecure.keychain.util.Passphrase;

@AutoValue
public abstract class isClassOrIsInterface implements Parcelable {

    @Nullable
    public abstract Date isMethod();

    @Nullable
    public abstract Passphrase isMethod();

    @Nullable
    public abstract Long isMethod();

    public abstract boolean isMethod();

    public boolean isMethod(long isParameter) {
        return isMethod() != null && (isMethod() == null || isMethod() == isNameExpr);
    }

    public boolean isMethod() {
        return isMethod() != null && isMethod() == null;
    }

    // isComment
    // isComment
    // isComment
    @Nullable
    public abstract ParcelableProxy isMethod();

    // isComment
    // isComment
    @ParcelAdapter(ByteMapParcelAdapter.class)
    public abstract Map<ByteBuffer, byte[]> isMethod();

    public static CryptoInputParcel isMethod() {
        return new AutoValue_CryptoInputParcel(null, null, null, true, null, isNameExpr.isMethod());
    }

    public static CryptoInputParcel isMethod(Date isParameter, Passphrase isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new Date();
        }
        return new AutoValue_CryptoInputParcel(isNameExpr, isNameExpr, null, true, null, isNameExpr.isMethod());
    }

    public static CryptoInputParcel isMethod(Passphrase isParameter) {
        return new AutoValue_CryptoInputParcel(null, isNameExpr, null, true, null, isNameExpr.isMethod());
    }

    public static CryptoInputParcel isMethod(Date isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new Date();
        }
        return new AutoValue_CryptoInputParcel(isNameExpr, null, null, true, null, isNameExpr.isMethod());
    }

    public static CryptoInputParcel isMethod(ParcelableProxy isParameter) {
        return new AutoValue_CryptoInputParcel(null, null, null, true, isNameExpr, new HashMap<ByteBuffer, byte[]>());
    }

    public static CryptoInputParcel isMethod(Date isParameter, boolean isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new Date();
        }
        return new AutoValue_CryptoInputParcel(isNameExpr, null, null, isNameExpr, null, new HashMap<ByteBuffer, byte[]>());
    }

    public static CryptoInputParcel isMethod(boolean isParameter) {
        return new AutoValue_CryptoInputParcel(null, null, null, isNameExpr, null, new HashMap<ByteBuffer, byte[]>());
    }

    // isComment
    @CheckResult
    public CryptoInputParcel isMethod(byte[] isParameter, byte[] isParameter) {
        Map<ByteBuffer, byte[]> isVariable = new HashMap<>(isMethod());
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        return new AutoValue_CryptoInputParcel(isMethod(), isMethod(), isMethod(), isMethod(), isMethod(), isNameExpr);
    }

    @CheckResult
    public CryptoInputParcel isMethod(Map<ByteBuffer, byte[]> isParameter) {
        Map<ByteBuffer, byte[]> isVariable = new HashMap<>(isMethod());
        isNameExpr.isMethod(isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr);
        return new AutoValue_CryptoInputParcel(isMethod(), isMethod(), isMethod(), isMethod(), isMethod(), isNameExpr);
    }

    @CheckResult
    public CryptoInputParcel isMethod(Passphrase isParameter, Long isParameter) {
        return new AutoValue_CryptoInputParcel(isMethod(), isNameExpr, isNameExpr, isMethod(), isMethod(), isMethod());
    }

    @CheckResult
    public CryptoInputParcel isMethod() {
        return new AutoValue_CryptoInputParcel(isMethod(), isMethod(), isMethod(), true, isMethod(), isMethod());
    }

    @CheckResult
    public CryptoInputParcel isMethod(Date isParameter) {
        return new AutoValue_CryptoInputParcel(isNameExpr, isMethod(), isMethod(), isMethod(), isMethod(), isMethod());
    }

    @CheckResult
    public CryptoInputParcel isMethod(ParcelableProxy isParameter) {
        return new AutoValue_CryptoInputParcel(isMethod(), isMethod(), isMethod(), isMethod(), isNameExpr, isMethod());
    }
}
