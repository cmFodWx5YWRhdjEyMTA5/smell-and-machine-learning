// isComment
package org.sufficientlysecure.keychain.service;

import java.util.List;
import android.net.Uri;
import android.os.Parcelable;
import android.support.annotation.Nullable;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class isClassOrIsInterface implements Parcelable {

    @Nullable
    @SuppressWarnings("isStringConstant")
    public abstract long[] isMethod();

    public abstract boolean isMethod();

    public abstract boolean isMethod();

    public abstract boolean isMethod();

    public abstract boolean isMethod();

    @Nullable
    public abstract Uri isMethod();

    @Nullable
    public abstract List<String> isMethod();

    public static BackupKeyringParcel isMethod(long[] isParameter, boolean isParameter, boolean isParameter, boolean isParameter, Uri isParameter) {
        return new AutoValue_BackupKeyringParcel(isNameExpr, isNameExpr, true, isNameExpr, isNameExpr, isNameExpr, null);
    }

    public static BackupKeyringParcel isMethod(long[] isParameter, boolean isParameter, boolean isParameter, boolean isParameter, Uri isParameter, List<String> isParameter) {
        return new AutoValue_BackupKeyringParcel(isNameExpr, isNameExpr, true, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    public static BackupKeyringParcel isMethod(long[] isParameter, List<String> isParameter) {
        return new AutoValue_BackupKeyringParcel(isNameExpr, true, true, true, true, null, isNameExpr);
    }
}
