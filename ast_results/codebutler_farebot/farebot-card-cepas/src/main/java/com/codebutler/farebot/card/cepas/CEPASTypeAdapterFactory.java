// isComment
package com.codebutler.farebot.card.cepas;

import android.support.annotation.NonNull;
import com.google.gson.TypeAdapterFactory;
import com.ryanharter.auto.value.gson.GsonTypeAdapterFactory;

@GsonTypeAdapterFactory
public abstract class isClassOrIsInterface implements TypeAdapterFactory {

    @NonNull
    public static CEPASTypeAdapterFactory isMethod() {
        return new AutoValueGson_CEPASTypeAdapterFactory();
    }
}
