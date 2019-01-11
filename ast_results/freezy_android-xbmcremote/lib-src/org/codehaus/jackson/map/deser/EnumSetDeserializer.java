// isComment
package org.codehaus.jackson.map.deser;

import java.io.IOException;
import java.util.*;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.TypeDeserializer;

/**
 * isComment
 */
public final class isClassOrIsInterface extends StdDeserializer<EnumSet<?>> {

    @SuppressWarnings("isStringConstant")
    final Class<Enum> isVariable;

    final EnumDeserializer isVariable;

    @SuppressWarnings("isStringConstant")
    public isConstructor(EnumResolver isParameter) {
        super(EnumSet.class);
        isNameExpr = new EnumDeserializer(isNameExpr);
        // isComment
        isNameExpr = (Class<Enum>) ((Class<?>) isNameExpr.isMethod());
    }

    @SuppressWarnings("isStringConstant")
    public EnumSet<?> isMethod(JsonParser isParameter, DeserializationContext isParameter) throws IOException, JsonProcessingException {
        // isComment
        if (isNameExpr.isMethod() != isNameExpr.isFieldAccessExpr) {
            throw isNameExpr.isMethod(EnumSet.class);
        }
        EnumSet isVariable = isMethod();
        JsonToken isVariable;
        while ((isNameExpr = isNameExpr.isMethod()) != isNameExpr.isFieldAccessExpr) {
            /*isComment*/
            if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                throw isNameExpr.isMethod(isNameExpr);
            }
            Enum<?> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr;
    }

    @Override
    public Object isMethod(JsonParser isParameter, DeserializationContext isParameter, TypeDeserializer isParameter) throws IOException, JsonProcessingException {
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    @SuppressWarnings("isStringConstant")
    private EnumSet isMethod() {
        // isComment
        return isNameExpr.isMethod(isNameExpr);
    }
}
