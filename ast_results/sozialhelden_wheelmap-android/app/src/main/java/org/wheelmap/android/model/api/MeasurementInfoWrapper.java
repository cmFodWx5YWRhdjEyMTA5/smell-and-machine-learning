// isComment
package org.wheelmap.android.model.api;

import android.os.Parcelable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

@AutoValue
public abstract class isClassOrIsInterface implements Parcelable {

    abstract MeasurementInfo isMethod();

    public static MeasurementInfoWrapper isMethod(MeasurementInfo isParameter) {
        return new AutoValue_MeasurementInfoWrapper(isNameExpr);
    }

    public static TypeAdapter<MeasurementInfoWrapper> isMethod(Gson isParameter) {
        return new AutoValue_MeasurementInfoWrapper.GsonTypeAdapter(isNameExpr);
    }
}
