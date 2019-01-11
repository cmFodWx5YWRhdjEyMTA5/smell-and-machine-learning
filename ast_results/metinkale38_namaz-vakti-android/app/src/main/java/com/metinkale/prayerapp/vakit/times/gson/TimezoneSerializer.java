// isComment
package com.metinkale.prayerapp.vakit.times.gson;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;
import java.util.TimeZone;

public class isClassOrIsInterface implements JsonSerializer<TimeZone>, JsonDeserializer<TimeZone> {

    @Nullable
    @Override
    public JsonElement isMethod(TimeZone isParameter, Type isParameter, JsonSerializationContext isParameter) {
        return isNameExpr == null ? null : new JsonPrimitive(isNameExpr.isMethod());
    }

    @NonNull
    @Override
    public TimeZone isMethod(@NonNull JsonElement isParameter, Type isParameter, JsonDeserializationContext isParameter) {
        return isNameExpr.isMethod() ? isNameExpr.isMethod() : isNameExpr.isMethod(isNameExpr.isMethod());
    }
}
