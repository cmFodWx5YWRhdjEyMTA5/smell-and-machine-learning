// isComment
package fr.free.nrw.commons.utils;

import android.net.Uri;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;

public class isClassOrIsInterface implements JsonDeserializer<Uri> {

    @Override
    public Uri isMethod(final JsonElement isParameter, final Type isParameter, final JsonDeserializationContext isParameter) throws JsonParseException {
        return isNameExpr.isMethod(isNameExpr.isMethod());
    }
}
