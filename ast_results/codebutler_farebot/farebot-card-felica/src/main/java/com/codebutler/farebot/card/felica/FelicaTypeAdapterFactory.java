// isComment
package com.codebutler.farebot.card.felica;

import android.support.annotation.NonNull;
import com.google.gson.TypeAdapterFactory;
import com.ryanharter.auto.value.gson.GsonTypeAdapterFactory;

@GsonTypeAdapterFactory
public abstract class isClassOrIsInterface implements TypeAdapterFactory {

    @NonNull
    public static FelicaTypeAdapterFactory isMethod() {
        return new AutoValueGson_FelicaTypeAdapterFactory();
    }
}
