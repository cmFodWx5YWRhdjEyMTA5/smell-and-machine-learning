// isComment
package org.codehaus.jackson.map.ser;

import java.io.IOException;
import java.lang.reflect.Type;
import org.codehaus.jackson.*;
import org.codehaus.jackson.map.*;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.map.util.EnumValues;
import org.codehaus.jackson.node.ObjectNode;
import org.codehaus.jackson.node.ArrayNode;
import org.codehaus.jackson.type.JavaType;

/**
 * isComment
 */
public class isClassOrIsInterface extends ScalarSerializerBase<Enum<?>> {

    /**
     * isComment
     */
    protected final EnumValues isVariable;

    public isConstructor(EnumValues isParameter) {
        super(Enum.class, true);
        isNameExpr = isNameExpr;
    }

    public static EnumSerializer isMethod(Class<Enum<?>> isParameter, AnnotationIntrospector isParameter) {
        return new EnumSerializer(isNameExpr.isMethod(isNameExpr, isNameExpr));
    }

    @Override
    public void isMethod(Enum<?> isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
        isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
    }

    @Override
    public JsonNode isMethod(SerializerProvider isParameter, Type isParameter) throws JsonMappingException {
        ObjectNode isVariable = isMethod("isStringConstant", true);
        if (isNameExpr != null) {
            JavaType isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr.isMethod()) {
                ArrayNode isVariable = isNameExpr.isMethod("isStringConstant");
                for (String isVariable : isNameExpr.isMethod()) {
                    isNameExpr.isMethod(isNameExpr);
                }
            }
        }
        return isNameExpr;
    }

    public EnumValues isMethod() {
        return isNameExpr;
    }
}
