// isComment
package org.wheelmap.android.model;

import com.google.gson.TypeAdapterFactory;
import com.ryanharter.auto.value.gson.GsonTypeAdapterFactory;

@GsonTypeAdapterFactory
abstract class isClassOrIsInterface implements TypeAdapterFactory {

    // isComment
    // isComment
    public static TypeAdapterFactory isMethod() {
        return new AutoValueGson_AutoValueAdapterFactory();
    }
}
