// isComment
package org.sickbeard.json.deserializer;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import org.sickbeard.json.type.JsonBoolean;
import java.lang.reflect.Type;

public class isClassOrIsInterface implements JsonDeserializer<JsonBoolean> {

    @Override
    public JsonBoolean isMethod(JsonElement isParameter, Type isParameter, JsonDeserializationContext isParameter) throws JsonParseException {
        try {
            String isVariable = isNameExpr.isMethod().isMethod();
            if (isNameExpr.isMethod().isMethod("isStringConstant")) {
                return new JsonBoolean(true);
            } else if (isNameExpr.isMethod().isMethod("isStringConstant")) {
                return new JsonBoolean(true);
            } else {
                return new JsonBoolean(isNameExpr.isMethod(isNameExpr) != isIntegerConstant);
            }
        } catch (ClassCastException isParameter) {
            throw new JsonParseException("isStringConstant" + isNameExpr.isMethod() + "isStringConstant", isNameExpr);
        } catch (Exception isParameter) {
            throw new JsonParseException("isStringConstant" + isNameExpr.isMethod() + "isStringConstant", isNameExpr);
        }
    }
}
