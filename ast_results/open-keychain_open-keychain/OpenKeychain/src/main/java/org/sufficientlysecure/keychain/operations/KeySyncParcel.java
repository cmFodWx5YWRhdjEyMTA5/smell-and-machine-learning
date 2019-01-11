// isComment
package org.sufficientlysecure.keychain.operations;

import android.os.Parcelable;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class isClassOrIsInterface implements Parcelable {

    public abstract boolean isMethod();

    public static KeySyncParcel isMethod() {
        return new AutoValue_KeySyncParcel(true);
    }

    public static KeySyncParcel isMethod() {
        return new AutoValue_KeySyncParcel(true);
    }
}
