// isComment
package org.openobservatory.ooniprobe.common;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import org.openobservatory.ooniprobe.model.jsonresult.TestKeys;
import java.lang.reflect.Type;

public class isClassOrIsInterface implements JsonDeserializer<TestKeys.Tampering> {

    @Override
    public TestKeys.Tampering isMethod(JsonElement isParameter, Type isParameter, JsonDeserializationContext isParameter) throws JsonParseException {
        if (isNameExpr.isMethod() && isNameExpr.isMethod().isMethod())
            return new TestKeys.Tampering(isNameExpr.isMethod().isMethod());
        else
            return new TestKeys.Tampering(new Gson().isMethod(isNameExpr, TestKeys.Tampering.TamperingObj.class).isMethod());
    }
}
