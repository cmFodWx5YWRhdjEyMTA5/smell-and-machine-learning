// isComment
package org.codehaus.jackson.map.deser;

import java.io.IOException;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.annotate.JsonCachable;

/**
 * isComment
 */
@JsonCachable
public class isClassOrIsInterface extends StdScalarDeserializer<Enum<?>> {

    final EnumResolver<?> isVariable;

    public isConstructor(EnumResolver<?> isParameter) {
        super(Enum.class);
        isNameExpr = isNameExpr;
    }

    /*isComment*/
    public Enum<?> isMethod(JsonParser isParameter, DeserializationContext isParameter) throws IOException, JsonProcessingException {
        JsonToken isVariable = isNameExpr.isMethod();
        // isComment
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            String isVariable = isNameExpr.isMethod();
            Enum<?> isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr == null) {
                throw isNameExpr.isMethod(isNameExpr.isMethod(), "isStringConstant");
            }
            return isNameExpr;
        }
        // isComment
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            int isVariable = isNameExpr.isMethod();
            Enum<?> isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr == null) {
                throw isNameExpr.isMethod(isNameExpr.isMethod(), "isStringConstant" + isNameExpr.isMethod() + "isStringConstant");
            }
            return isNameExpr;
        }
        throw isNameExpr.isMethod(isNameExpr.isMethod());
    }
}
