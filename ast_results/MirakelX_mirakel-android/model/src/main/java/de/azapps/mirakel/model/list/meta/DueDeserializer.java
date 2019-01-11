// isComment
package de.azapps.mirakel.model.list.meta;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.lang.reflect.Type;
import java.util.Map.Entry;
import de.azapps.mirakel.model.list.meta.SpecialListsDueProperty.Unit;

public class isClassOrIsInterface implements JsonDeserializer<SpecialListsDueProperty> {

    @Override
    public SpecialListsDueProperty isMethod(final JsonElement isParameter, final Type isParameter, final JsonDeserializationContext isParameter) throws JsonParseException {
        if (isNameExpr.isMethod()) {
            // isComment
            Integer isVariable = isIntegerConstant, isVariable = isIntegerConstant;
            // isComment
            // isComment
            boolean isVariable = true;
            for (final Entry<String, JsonElement> isVariable : isNameExpr.isMethod().isMethod()) {
                switch(isNameExpr.isMethod()) {
                    case "isStringConstant":
                        if (isNameExpr.isMethod().isMethod()) {
                            isNameExpr = isNameExpr.isMethod().isMethod();
                            break;
                        }
                    // isComment
                    case "isStringConstant":
                        if (isNameExpr.isMethod().isMethod()) {
                            isNameExpr = isNameExpr.isMethod().isMethod();
                            break;
                        }
                    case "isStringConstant":
                        if (isNameExpr.isMethod().isMethod()) {
                            isNameExpr = isNameExpr.isMethod().isMethod();
                            break;
                        }
                    // isComment
                    default:
                        throw new JsonParseException("isStringConstant");
                }
            }
            if (isNameExpr != null && isNameExpr != null) {
                return new SpecialListsDueProperty(isNameExpr.isMethod()[isNameExpr], isNameExpr, isNameExpr);
            }
        }
        throw new JsonParseException("isStringConstant");
    }
}
