// isComment
package org.wheelmap.android.model.api;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

@AutoValue
public abstract class isClassOrIsInterface {

    public abstract long isMethod();

    public static TypeAdapter<MeasurementImageUploadResponse> isMethod(Gson isParameter) {
        return new AutoValue_MeasurementImageUploadResponse.GsonTypeAdapter(isNameExpr);
    }
}
