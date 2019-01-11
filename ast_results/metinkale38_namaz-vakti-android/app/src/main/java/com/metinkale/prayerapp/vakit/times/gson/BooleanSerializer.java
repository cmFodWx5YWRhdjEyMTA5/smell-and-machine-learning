// isComment
package com.metinkale.prayerapp.vakit.times.gson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class isClassOrIsInterface implements JsonSerializer<Boolean>, JsonDeserializer<Boolean> {

    @Nullable
    @Override
    public JsonElement isMethod(Boolean isParameter, Type isParameter, JsonSerializationContext isParameter) {
        return isNameExpr ? new JsonPrimitive(isIntegerConstant) : null;
    }

    @NonNull
    @Override
    public Boolean isMethod(@NonNull JsonElement isParameter, Type isParameter, JsonDeserializationContext isParameter) throws JsonParseException {
        return isNameExpr.isMethod() == isIntegerConstant;
    }
}
