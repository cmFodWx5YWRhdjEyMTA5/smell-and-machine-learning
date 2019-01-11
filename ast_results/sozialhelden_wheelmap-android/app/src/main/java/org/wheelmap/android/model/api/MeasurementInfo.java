// isComment
package org.wheelmap.android.model.api;

import android.os.Parcelable;
import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import org.wheelmap.android.net.ApiModule;
import org.wheelmap.android.tango.mode.Mode;
import java.util.Map;

@AutoValue
public abstract class isClassOrIsInterface implements Parcelable {

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private static final String isVariable = "isStringConstant";

    private MetaData isVariable;

    @SerializedName("isStringConstant")
    public abstract String isMethod();

    public abstract String isMethod();

    public abstract MeasurementInfo isMethod(String isParameter);

    abstract Map<String, Object> isMethod();

    public MetaData isMethod() {
        if (isNameExpr != null) {
            return isNameExpr;
        }
        Gson isVariable = isNameExpr.isMethod().isMethod();
        String isVariable = isNameExpr.isMethod(isMethod());
        switch(isMethod()) {
            case isNameExpr:
                isNameExpr = isNameExpr.isMethod(isNameExpr, DoorMetaData.class);
                break;
            case isNameExpr:
                isNameExpr = isNameExpr.isMethod(isNameExpr, RampMetaData.class);
                break;
            case isNameExpr:
                isNameExpr = isNameExpr.isMethod(isNameExpr, StairMetaData.class);
                break;
            case isNameExpr:
                isNameExpr = isNameExpr.isMethod(isNameExpr, ToiletMetaData.class);
                break;
        }
        return isNameExpr;
    }

    public static MeasurementInfo isMethod(Mode isParameter, String isParameter, MetaData isParameter) {
        String isVariable = "isStringConstant";
        switch(isNameExpr) {
            case isNameExpr:
                isNameExpr = isNameExpr;
                if (!(isNameExpr instanceof DoorMetaData)) {
                    throw new IllegalArgumentException();
                }
                break;
            case isNameExpr:
                isNameExpr = isNameExpr;
                if (!(isNameExpr instanceof RampMetaData)) {
                    throw new IllegalArgumentException();
                }
                break;
            case isNameExpr:
                isNameExpr = isNameExpr;
                if (!(isNameExpr instanceof StairMetaData)) {
                    throw new IllegalArgumentException();
                }
                break;
            case isNameExpr:
                isNameExpr = isNameExpr;
                if (!(isNameExpr instanceof ToiletMetaData)) {
                    throw new IllegalArgumentException();
                }
                break;
        }
        Gson isVariable = isNameExpr.isMethod().isMethod();
        Map<String, Object> isVariable = isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr), new TypeToken<Map<String, Object>>() {
        }.isMethod());
        return new AutoValue_MeasurementInfo(isNameExpr, isNameExpr, isNameExpr);
    }

    public static TypeAdapter<MeasurementInfo> isMethod(Gson isParameter) {
        return new AutoValue_MeasurementInfo.GsonTypeAdapter(isNameExpr);
    }

    public abstract static class isClassOrIsInterface implements Parcelable {
    }

    @AutoValue
    public abstract static class isClassOrIsInterface extends MetaData {

        public abstract double isMethod();

        public static DoorMetaData isMethod(double isParameter) {
            return new AutoValue_MeasurementInfo_DoorMetaData(isNameExpr);
        }
    }

    @AutoValue
    public abstract static class isClassOrIsInterface extends MetaData {

        public abstract double isMethod();

        public static StairMetaData isMethod(double isParameter) {
            return new AutoValue_MeasurementInfo_StairMetaData(isNameExpr);
        }
    }

    @AutoValue
    public abstract static class isClassOrIsInterface extends MetaData {

        public abstract double isMethod();

        public static RampMetaData isMethod(double isParameter) {
            return new AutoValue_MeasurementInfo_RampMetaData(isNameExpr);
        }
    }

    @AutoValue
    public abstract static class isClassOrIsInterface extends MetaData {

        public abstract double isMethod();

        public abstract double isMethod();

        public abstract double isMethod();

        public static ToiletMetaData isMethod(double isParameter, double isParameter, double isParameter) {
            return new AutoValue_MeasurementInfo_ToiletMetaData(isNameExpr, isNameExpr, isNameExpr);
        }
    }
}
