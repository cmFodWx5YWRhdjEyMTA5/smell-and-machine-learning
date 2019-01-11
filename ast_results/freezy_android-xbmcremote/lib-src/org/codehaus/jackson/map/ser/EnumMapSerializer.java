// isComment
package org.codehaus.jackson.map.ser;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import org.codehaus.jackson.*;
import org.codehaus.jackson.map.*;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.map.util.EnumValues;
import org.codehaus.jackson.type.JavaType;
import org.codehaus.jackson.node.JsonNodeFactory;
import org.codehaus.jackson.node.ObjectNode;
import org.codehaus.jackson.schema.JsonSchema;
import org.codehaus.jackson.schema.SchemaAware;

/**
 * isComment
 */
public class isClassOrIsInterface extends ContainerSerializerBase<EnumMap<? extends Enum<?>, ?>> implements ResolvableSerializer {

    protected final boolean isVariable;

    /**
     * isComment
     */
    protected final EnumValues isVariable;

    protected final JavaType isVariable;

    /**
     * isComment
     */
    protected JsonSerializer<Object> isVariable;

    /**
     * isComment
     */
    protected final TypeSerializer isVariable;

    public isConstructor(JavaType isParameter, boolean isParameter, EnumValues isParameter, TypeSerializer isParameter) {
        super(EnumMap.class, true);
        isNameExpr = isNameExpr || (isNameExpr != null && isNameExpr.isMethod());
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    @Override
    public ContainerSerializerBase<?> isMethod(TypeSerializer isParameter) {
        return new EnumMapSerializer(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public void isMethod(EnumMap<? extends Enum<?>, ?> isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
        isNameExpr.isMethod();
        if (!isNameExpr.isMethod()) {
            isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
        isNameExpr.isMethod();
    }

    @Override
    public void isMethod(EnumMap<? extends Enum<?>, ?> isParameter, JsonGenerator isParameter, SerializerProvider isParameter, TypeSerializer isParameter) throws IOException, JsonGenerationException {
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        if (!isNameExpr.isMethod()) {
            isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    protected void isMethod(EnumMap<? extends Enum<?>, ?> isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
        if (isNameExpr != null) {
            isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            return;
        }
        JsonSerializer<Object> isVariable = null;
        Class<?> isVariable = null;
        EnumValues isVariable = isNameExpr;
        for (Map.Entry<? extends Enum<?>, ?> isVariable : isNameExpr.isMethod()) {
            // isComment
            Enum<?> isVariable = isNameExpr.isMethod();
            if (isNameExpr == null) {
                /*isComment*/
                // isComment
                SerializerBase<?> isVariable = (SerializerBase<?>) isNameExpr.isMethod(isNameExpr.isMethod());
                isNameExpr = ((EnumSerializer) isNameExpr).isMethod();
            }
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
            // isComment
            Object isVariable = isNameExpr.isMethod();
            if (isNameExpr == null) {
                isNameExpr.isMethod().isMethod(null, isNameExpr, isNameExpr);
            } else {
                Class<?> isVariable = isNameExpr.isMethod();
                JsonSerializer<Object> isVariable;
                if (isNameExpr == isNameExpr) {
                    isNameExpr = isNameExpr;
                } else {
                    isNameExpr = isNameExpr.isMethod(isNameExpr);
                    isNameExpr = isNameExpr;
                    isNameExpr = isNameExpr;
                }
                try {
                    isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                } catch (Exception isParameter) {
                    // isComment
                    isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod().isMethod());
                }
            }
        }
    }

    protected void isMethod(EnumMap<? extends Enum<?>, ?> isParameter, JsonGenerator isParameter, SerializerProvider isParameter, JsonSerializer<Object> isParameter) throws IOException, JsonGenerationException {
        EnumValues isVariable = isNameExpr;
        for (Map.Entry<? extends Enum<?>, ?> isVariable : isNameExpr.isMethod()) {
            Enum<?> isVariable = isNameExpr.isMethod();
            if (isNameExpr == null) {
                // isComment
                SerializerBase<?> isVariable = (SerializerBase<?>) isNameExpr.isMethod(isNameExpr.isMethod());
                isNameExpr = ((EnumSerializer) isNameExpr).isMethod();
            }
            isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
            Object isVariable = isNameExpr.isMethod();
            if (isNameExpr == null) {
                isNameExpr.isMethod().isMethod(null, isNameExpr, isNameExpr);
            } else {
                try {
                    isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                } catch (Exception isParameter) {
                    isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod().isMethod());
                }
            }
        }
    }

    // isComment
    public void isMethod(SerializerProvider isParameter) throws JsonMappingException {
        if (isNameExpr) {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        }
    }

    @SuppressWarnings("isStringConstant")
    @Override
    public JsonNode isMethod(SerializerProvider isParameter, Type isParameter) throws JsonMappingException {
        ObjectNode isVariable = isMethod("isStringConstant", true);
        if (isNameExpr instanceof ParameterizedType) {
            Type[] isVariable = ((ParameterizedType) isNameExpr).isMethod();
            if (isNameExpr.isFieldAccessExpr == isIntegerConstant) {
                JavaType isVariable = isNameExpr.isMethod(isNameExpr[isIntegerConstant]);
                JavaType isVariable = isNameExpr.isMethod(isNameExpr[isIntegerConstant]);
                ObjectNode isVariable = isNameExpr.isFieldAccessExpr.isMethod();
                Class<Enum<?>> isVariable = (Class<Enum<?>>) isNameExpr.isMethod();
                for (Enum<?> isVariable : isNameExpr.isMethod()) {
                    JsonSerializer<Object> isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
                    JsonNode isVariable = (isNameExpr instanceof SchemaAware) ? ((SchemaAware) isNameExpr).isMethod(isNameExpr, null) : isNameExpr.isMethod();
                    isNameExpr.isMethod(isNameExpr.isMethod().isMethod().isMethod((Enum<?>) isNameExpr), isNameExpr);
                }
                isNameExpr.isMethod("isStringConstant", isNameExpr);
            }
        }
        return isNameExpr;
    }
}
