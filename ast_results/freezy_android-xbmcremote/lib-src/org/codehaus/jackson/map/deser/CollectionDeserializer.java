// isComment
package org.codehaus.jackson.map.deser;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.*;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.util.ClassUtil;

/**
 * isComment
 */
public class isClassOrIsInterface extends StdDeserializer<Collection<Object>> {

    // isComment
    final Class<Collection<Object>> isVariable;

    /**
     * isComment
     */
    final JsonDeserializer<Object> isVariable;

    /**
     * isComment
     */
    final TypeDeserializer isVariable;

    /**
     * isComment
     */
    final Constructor<Collection<Object>> isVariable;

    @Deprecated
    public isConstructor(Class<?> isParameter, JsonDeserializer<Object> isParameter) {
        this(isNameExpr, isNameExpr, null);
    }

    @SuppressWarnings("isStringConstant")
    public isConstructor(Class<?> isParameter, JsonDeserializer<Object> isParameter, TypeDeserializer isParameter) {
        this(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isMethod((Class<Collection<Object>>) isNameExpr, true));
    }

    @SuppressWarnings("isStringConstant")
    public isConstructor(Class<?> isParameter, JsonDeserializer<Object> isParameter, TypeDeserializer isParameter, Constructor<Collection<Object>> isParameter) {
        super(isNameExpr);
        isNameExpr = (Class<Collection<Object>>) isNameExpr;
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    @Override
    public Collection<Object> isMethod(JsonParser isParameter, DeserializationContext isParameter) throws IOException, JsonProcessingException {
        Collection<Object> isVariable;
        try {
            isNameExpr = isNameExpr.isMethod();
        } catch (Exception isParameter) {
            throw isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        return isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public Collection<Object> isMethod(JsonParser isParameter, DeserializationContext isParameter, Collection<Object> isParameter) throws IOException, JsonProcessingException {
        // isComment
        if (isNameExpr.isMethod() != isNameExpr.isFieldAccessExpr) {
            throw isNameExpr.isMethod(isNameExpr);
        }
        JsonDeserializer<Object> isVariable = isNameExpr;
        JsonToken isVariable;
        final TypeDeserializer isVariable = isNameExpr;
        while ((isNameExpr = isNameExpr.isMethod()) != isNameExpr.isFieldAccessExpr) {
            Object isVariable;
            if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                isNameExpr = null;
            } else if (isNameExpr == null) {
                isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
            } else {
                isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
            }
            isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr;
    }

    @Override
    public Object isMethod(JsonParser isParameter, DeserializationContext isParameter, TypeDeserializer isParameter) throws IOException, JsonProcessingException {
        // isComment
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }
}
