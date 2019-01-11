// isComment
package org.codehaus.jackson.map.deser;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.*;
import org.codehaus.jackson.map.introspect.AnnotatedClass;
import org.codehaus.jackson.map.type.*;
import org.codehaus.jackson.map.util.ClassUtil;
import org.codehaus.jackson.type.JavaType;

/**
 * isComment
 */
public class isClassOrIsInterface extends DeserializerProvider {

    /*isComment*/
    /**
     * isComment
     */
    static final HashMap<JavaType, KeyDeserializer> isVariable = isNameExpr.isMethod();

    /**
     * isComment
     */
    protected final ConcurrentHashMap<JavaType, JsonDeserializer<Object>> isVariable = new ConcurrentHashMap<JavaType, JsonDeserializer<Object>>(isIntegerConstant, isDoubleConstant, isIntegerConstant);

    /**
     * isComment
     */
    protected final HashMap<JavaType, JsonDeserializer<Object>> isVariable = new HashMap<JavaType, JsonDeserializer<Object>>(isIntegerConstant);

    /*isComment*/
    /**
     * isComment
     */
    protected DeserializerFactory isVariable;

    /**
     * isComment
     */
    public isConstructor() {
        this(isNameExpr.isFieldAccessExpr);
    }

    public isConstructor(DeserializerFactory isParameter) {
        isNameExpr = isNameExpr;
    }

    /*isComment*/
    @Override
    public JsonDeserializer<Object> isMethod(DeserializationConfig isParameter, JavaType isParameter, JavaType isParameter, String isParameter) throws JsonMappingException {
        /*isComment*/
        JsonDeserializer<Object> isVariable = isMethod(isNameExpr);
        if (isNameExpr != null) {
            return isNameExpr;
        }
        // isComment
        isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr == null) {
            /*isComment*/
            isNameExpr = isMethod(isNameExpr);
        }
        return isNameExpr;
    }

    @Override
    public JsonDeserializer<Object> isMethod(DeserializationConfig isParameter, JavaType isParameter) throws JsonMappingException {
        JsonDeserializer<Object> isVariable = isMethod(isNameExpr, isNameExpr, null, null);
        TypeDeserializer isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        if (isNameExpr != null) {
            return new WrappedDeserializer(isNameExpr, isNameExpr);
        }
        return isNameExpr;
    }

    @Override
    public KeyDeserializer isMethod(DeserializationConfig isParameter, JavaType isParameter) throws JsonMappingException {
        // isComment
        Class<?> isVariable = isNameExpr.isMethod();
        if (isNameExpr == String.class || isNameExpr == Object.class) {
            return null;
        }
        // isComment
        KeyDeserializer isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null) {
            return isNameExpr;
        }
        // isComment
        if (isNameExpr.isMethod()) {
            return isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        // isComment
        isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
        if (isNameExpr != null) {
            return isNameExpr;
        }
        // isComment
        return isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public boolean isMethod(DeserializationConfig isParameter, JavaType isParameter) {
        /*isComment*/
        JsonDeserializer<Object> isVariable = isMethod(isNameExpr);
        if (isNameExpr == null) {
            try {
                isNameExpr = isMethod(isNameExpr, isNameExpr, null, null);
            } catch (Exception isParameter) {
                return true;
            }
        }
        return (isNameExpr != null);
    }

    public int isMethod() {
        return isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    public void isMethod() {
        isNameExpr.isMethod();
    }

    /*isComment*/
    protected JsonDeserializer<Object> isMethod(JavaType isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    protected JsonDeserializer<Object> isMethod(DeserializationConfig isParameter, JavaType isParameter, JavaType isParameter, String isParameter) throws JsonMappingException {
        /*isComment*/
        synchronized (isNameExpr) {
            // isComment
            JsonDeserializer<Object> isVariable = isMethod(isNameExpr);
            if (isNameExpr != null) {
                return isNameExpr;
            }
            int isVariable = isNameExpr.isMethod();
            // isComment
            if (isNameExpr > isIntegerConstant) {
                isNameExpr = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr != null) {
                    return isNameExpr;
                }
            }
            // isComment
            try {
                return isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            } finally {
                // isComment
                if (isNameExpr == isIntegerConstant && isNameExpr.isMethod() > isIntegerConstant) {
                    isNameExpr.isMethod();
                }
            }
        }
    }

    /**
     * isComment
     */
    protected JsonDeserializer<Object> isMethod(DeserializationConfig isParameter, JavaType isParameter, JavaType isParameter, String isParameter) throws JsonMappingException {
        JsonDeserializer<Object> isVariable;
        try {
            isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        } catch (IllegalArgumentException isParameter) {
            /*isComment*/
            throw new JsonMappingException(isNameExpr.isMethod(), null, isNameExpr);
        }
        if (isNameExpr == null) {
            return null;
        }
        boolean isVariable = (isNameExpr instanceof ResolvableDeserializer);
        // isComment
        boolean isVariable = isNameExpr;
        if (!isNameExpr) {
            AnnotationIntrospector isVariable = isNameExpr.isMethod();
            // isComment
            AnnotatedClass isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr, null);
            Boolean isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null) {
                isNameExpr = isNameExpr.isMethod();
            }
        }
        /*isComment*/
        isNameExpr.isMethod(isNameExpr, isNameExpr);
        /*isComment*/
        if (isNameExpr) {
            isMethod(isNameExpr, (ResolvableDeserializer) isNameExpr);
        }
        if (isNameExpr) {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        return isNameExpr;
    }

    /*isComment*/
    @SuppressWarnings("isStringConstant")
    protected JsonDeserializer<Object> isMethod(DeserializationConfig isParameter, JavaType isParameter, JavaType isParameter, String isParameter) throws JsonMappingException {
        if (isNameExpr.isMethod()) {
            return (JsonDeserializer<Object>) isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), this);
        }
        if (isNameExpr.isMethod()) {
            if (isNameExpr instanceof ArrayType) {
                return (JsonDeserializer<Object>) isNameExpr.isMethod(isNameExpr, (ArrayType) isNameExpr, this);
            }
            if (isNameExpr instanceof MapType) {
                return (JsonDeserializer<Object>) isNameExpr.isMethod(isNameExpr, (MapType) isNameExpr, this);
            }
            if (isNameExpr instanceof CollectionType) {
                return (JsonDeserializer<Object>) isNameExpr.isMethod(isNameExpr, (CollectionType) isNameExpr, this);
            }
        }
        // isComment
        Class<?> isVariable = isNameExpr.isMethod();
        if (JsonNode.class.isMethod(isNameExpr)) {
            Class<? extends JsonNode> isVariable = (Class<? extends JsonNode>) isNameExpr;
            return (JsonDeserializer<Object>) isNameExpr.isMethod(isNameExpr, isNameExpr, this);
        }
        return (JsonDeserializer<Object>) isNameExpr.isMethod(isNameExpr, isNameExpr, this);
    }

    protected void isMethod(DeserializationConfig isParameter, ResolvableDeserializer isParameter) throws JsonMappingException {
        isNameExpr.isMethod(isNameExpr, this);
    }

    /*isComment*/
    protected JsonDeserializer<Object> isMethod(JavaType isParameter) throws JsonMappingException {
        /*isComment*/
        Class<?> isVariable = isNameExpr.isMethod();
        if (!isNameExpr.isMethod(isNameExpr)) {
            throw new JsonMappingException("isStringConstant" + isNameExpr);
        }
        throw new JsonMappingException("isStringConstant" + isNameExpr);
    }

    protected KeyDeserializer isMethod(JavaType isParameter) throws JsonMappingException {
        throw new JsonMappingException("isStringConstant" + isNameExpr);
    }

    /**
     * isComment
     */
    protected static final class isClassOrIsInterface extends JsonDeserializer<Object> {

        final TypeDeserializer isVariable;

        final JsonDeserializer<Object> isVariable;

        public isConstructor(TypeDeserializer isParameter, JsonDeserializer<Object> isParameter) {
            super();
            isNameExpr = isNameExpr;
            isNameExpr = isNameExpr;
        }

        @Override
        public Object isMethod(JsonParser isParameter, DeserializationContext isParameter) throws IOException, JsonProcessingException {
            return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        }

        @Override
        public Object isMethod(JsonParser isParameter, DeserializationContext isParameter, TypeDeserializer isParameter) throws IOException, JsonProcessingException {
            // isComment
            throw new IllegalStateException("isStringConstant");
        }
    }
}
