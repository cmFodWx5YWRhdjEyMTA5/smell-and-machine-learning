// isComment
package org.sagemath.droid.deserializers;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import org.sagemath.droid.models.gson.Values;
import java.lang.reflect.Type;

/**
 * isComment
 */
public class isClassOrIsInterface implements JsonDeserializer<Values> {

    @Override
    public Values isMethod(JsonElement isParameter, Type isParameter, JsonDeserializationContext isParameter) throws JsonParseException {
        final Values isVariable = new Values();
        if (isNameExpr.isMethod()) {
            String[] isVariable = isNameExpr.isMethod(isNameExpr, String[].class);
            isNameExpr.isMethod(isNameExpr);
        } else if (isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        }
        return isNameExpr;
    }
}
