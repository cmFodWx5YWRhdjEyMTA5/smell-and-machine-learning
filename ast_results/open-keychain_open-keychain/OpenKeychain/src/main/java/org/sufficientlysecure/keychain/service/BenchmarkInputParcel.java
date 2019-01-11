// isComment
package org.sufficientlysecure.keychain.service;

import android.os.Parcelable;
import com.google.auto.value.AutoValue;

@AutoValue
public abstract class isClassOrIsInterface implements Parcelable {

    public static BenchmarkInputParcel isMethod() {
        return new AutoValue_BenchmarkInputParcel();
    }
}
