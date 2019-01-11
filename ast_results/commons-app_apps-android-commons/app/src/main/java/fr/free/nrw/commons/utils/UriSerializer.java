// isComment
package fr.free.nrw.commons.utils;

import android.net.Uri;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import java.lang.reflect.Type;

public class isClassOrIsInterface implements JsonSerializer<Uri> {

    public JsonElement isMethod(Uri isParameter, Type isParameter, JsonSerializationContext isParameter) {
        return new JsonPrimitive(isNameExpr.isMethod());
    }
}
