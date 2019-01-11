// isComment
package org.codehaus.jackson.map.ser;

import java.io.*;
import java.lang.reflect.Type;
import java.util.*;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.*;
import org.codehaus.jackson.map.util.Provider;

/**
 * isComment
 */
public class isClassOrIsInterface implements Provider<Map.Entry<Class<?>, JsonSerializer<?>>> {

    /**
     * isComment
     */
    public Collection<Map.Entry<Class<?>, JsonSerializer<?>>> isMethod() {
        HashMap<Class<?>, JsonSerializer<?>> isVariable = new HashMap<Class<?>, JsonSerializer<?>>();
        // isComment
        final ToStringSerializer isVariable = isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod(java.net.URL.class, isNameExpr);
        isNameExpr.isMethod(java.net.URI.class, isNameExpr);
        isNameExpr.isMethod(Currency.class, isNameExpr);
        isNameExpr.isMethod(UUID.class, isNameExpr);
        isNameExpr.isMethod(java.util.regex.Pattern.class, isNameExpr);
        // isComment
        isNameExpr.isMethod(File.class, new FileSerializer());
        isNameExpr.isMethod(Class.class, new ClassSerializer());
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr, isNameExpr.isFieldAccessExpr);
        return isNameExpr.isMethod();
    }

    /**
     * isComment
     */
    public static final class isClassOrIsInterface extends SerializerBase<File> {

        public isConstructor() {
            super(File.class);
        }

        @Override
        public void isMethod(File isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }

        @Override
        public JsonNode isMethod(SerializerProvider isParameter, Type isParameter) {
            return isMethod("isStringConstant", true);
        }
    }

    /**
     * isComment
     */
    @SuppressWarnings("isStringConstant")
    public static final class isClassOrIsInterface extends SerializerBase<Class> {

        public isConstructor() {
            super(Class.class);
        }

        @Override
        public void isMethod(Class isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }

        @Override
        public JsonNode isMethod(SerializerProvider isParameter, Type isParameter) throws JsonMappingException {
            return isMethod("isStringConstant", true);
        }
    }
}
