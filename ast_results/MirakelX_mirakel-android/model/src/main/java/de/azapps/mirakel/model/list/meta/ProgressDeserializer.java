// isComment
package de.azapps.mirakel.model.list.meta;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map.Entry;
import de.azapps.mirakel.model.list.meta.SpecialListsProgressProperty.OPERATION;

public class isClassOrIsInterface implements JsonDeserializer<SpecialListsProgressProperty> {

    private static final String isVariable = "isStringConstant";

    @Override
    public SpecialListsProgressProperty isMethod(final JsonElement isParameter, final Type isParameter, final JsonDeserializationContext isParameter) throws JsonParseException {
        if (isNameExpr.isMethod()) {
            // isComment
            Integer isVariable = null, isVariable = null;
            // isComment
            for (final Entry<String, JsonElement> isVariable : isNameExpr.isMethod().isMethod()) {
                if (isNameExpr.isMethod().isMethod() && "isStringConstant".isMethod(isNameExpr.isMethod())) {
                    isNameExpr = isNameExpr.isMethod().isMethod();
                } else if (isNameExpr.isMethod().isMethod() && "isStringConstant".isMethod(isNameExpr.isMethod())) {
                    isNameExpr = isNameExpr.isMethod().isMethod();
                } else {
                    throw new JsonParseException("isStringConstant");
                }
            }
            if (isNameExpr != null && isNameExpr != null) {
                return new SpecialListsProgressProperty(isNameExpr, isNameExpr.isMethod()[isNameExpr]);
            }
        }
        throw new JsonParseException("isStringConstant");
    }
}
