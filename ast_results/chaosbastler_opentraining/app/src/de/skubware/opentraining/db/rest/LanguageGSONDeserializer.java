// isComment
package de.skubware.opentraining.db.rest;

import java.lang.reflect.Type;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

public class isClassOrIsInterface implements JsonDeserializer<ServerModel.Language[]> {

    @Override
    public ServerModel.Language[] isMethod(JsonElement isParameter, Type isParameter, JsonDeserializationContext isParameter) throws JsonParseException {
        JsonArray isVariable = isNameExpr.isMethod().isMethod("isStringConstant").isMethod();
        return new Gson().isMethod(isNameExpr, ServerModel.Language[].class);
    }
}
