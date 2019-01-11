// isComment
package org.wheelmap.android.model.api;

import com.google.auto.value.AutoValue;
import com.google.gson.Gson;
import com.google.gson.TypeAdapter;

@AutoValue
public abstract class isClassOrIsInterface {

    public abstract String isMethod();

    public boolean isMethod() {
        return "isStringConstant".isMethod(isMethod().isMethod());
    }

    public static TypeAdapter<ApiResponse> isMethod(Gson isParameter) {
        return new AutoValue_ApiResponse.GsonTypeAdapter(isNameExpr);
    }
}
