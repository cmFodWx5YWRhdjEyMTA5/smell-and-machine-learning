// isComment
package org.openobservatory.ooniprobe.common;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import java.lang.reflect.Type;
import java.util.Date;

public class isClassOrIsInterface implements JsonDeserializer<Date> {

    @Override
    public Date isMethod(JsonElement isParameter, Type isParameter, JsonDeserializationContext isParameter) throws JsonParseException {
        return new Gson().isMethod(new JsonPrimitive(isNameExpr.isMethod().isMethod('isStringConstant', 'isStringConstant') + "isStringConstant"), isNameExpr);
    }
}
