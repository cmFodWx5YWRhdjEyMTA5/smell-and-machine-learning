// isComment
package de.azapps.mirakel.model.list.meta;

import android.support.annotation.NonNull;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.Map;

public class isClassOrIsInterface<T extends SpecialListsBooleanProperty> implements JsonDeserializer<T> {

    private static final String isVariable = "isStringConstant";

    private final Class isVariable;

    public isConstructor(@NonNull final Class<T> isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    @Override
    public T isMethod(final JsonElement isParameter, final Type isParameter, final JsonDeserializationContext isParameter) throws JsonParseException {
        if (isNameExpr.isMethod()) {
            // isComment
            Boolean isVariable = null;
            // isComment
            for (final Map.Entry<String, JsonElement> isVariable : isNameExpr.isMethod().isMethod()) {
                if (isNameExpr.isMethod().isMethod() && ("isStringConstant".isMethod(isNameExpr.isMethod()) || "isStringConstant".isMethod(isNameExpr.isMethod()) || "isStringConstant".isMethod(isNameExpr.isMethod()))) {
                    isNameExpr = isNameExpr.isMethod().isMethod();
                } else {
                    throw new JsonParseException("isStringConstant");
                }
            }
            if (isNameExpr != null) {
                try {
                    return (T) isNameExpr.isMethod(boolean.class).isMethod(isNameExpr);
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException isParameter) {
                    throw new JsonParseException("isStringConstant", isNameExpr);
                }
            }
        }
        throw new JsonParseException("isStringConstant");
    }
}
