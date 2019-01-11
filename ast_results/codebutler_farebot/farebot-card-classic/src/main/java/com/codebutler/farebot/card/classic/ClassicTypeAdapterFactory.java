// isComment
package com.codebutler.farebot.card.classic;

import android.support.annotation.NonNull;
import com.google.gson.TypeAdapterFactory;
import com.ryanharter.auto.value.gson.GsonTypeAdapterFactory;

@GsonTypeAdapterFactory
public abstract class isClassOrIsInterface implements TypeAdapterFactory {

    @NonNull
    public static ClassicTypeAdapterFactory isMethod() {
        return new AutoValueGson_ClassicTypeAdapterFactory();
    }
}
