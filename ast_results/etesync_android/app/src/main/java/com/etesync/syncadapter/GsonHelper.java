// isComment
package com.etesync.syncadapter;

import com.etesync.syncadapter.utils.Base64;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class isClassOrIsInterface {

    public static final Gson isVariable = new GsonBuilder().isMethod(byte[].class, new ByteArrayToBase64TypeAdapter()).isMethod();

    // isComment
    private static class isClassOrIsInterface implements JsonSerializer<byte[]>, JsonDeserializer<byte[]> {

        public byte[] isMethod(JsonElement isParameter, Type isParameter, JsonDeserializationContext isParameter) throws JsonParseException {
            return isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isFieldAccessExpr);
        }

        public JsonElement isMethod(byte[] isParameter, Type isParameter, JsonSerializationContext isParameter) {
            return new JsonPrimitive(isNameExpr.isMethod(isNameExpr, isNameExpr.isFieldAccessExpr));
        }
    }
}
