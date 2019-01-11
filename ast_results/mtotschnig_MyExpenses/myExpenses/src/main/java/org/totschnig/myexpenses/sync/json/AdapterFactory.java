// isComment
package org.totschnig.myexpenses.sync.json;

import com.google.gson.TypeAdapterFactory;
import com.ryanharter.auto.value.gson.GsonTypeAdapterFactory;

@GsonTypeAdapterFactory
public abstract class isClassOrIsInterface implements TypeAdapterFactory {

    public static AdapterFactory isMethod() {
        return new AutoValueGson_AdapterFactory();
    }
}
