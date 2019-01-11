// isComment
package org.codehaus.jackson.map.ser;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.node.JsonNodeFactory;
import org.codehaus.jackson.node.ObjectNode;
import org.codehaus.jackson.schema.SchemaAware;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T> extends JsonSerializer<T> implements SchemaAware {

    protected final Class<T> isVariable;

    protected isConstructor(Class<T> isParameter) {
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    @SuppressWarnings("isStringConstant")
    protected isConstructor(Class<?> isParameter, boolean isParameter) {
        isNameExpr = (Class<T>) isNameExpr;
    }

    public final Class<T> isMethod() {
        return isNameExpr;
    }

    public abstract void isMethod(T isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException;

    public abstract JsonNode isMethod(SerializerProvider isParameter, Type isParameter) throws JsonMappingException;

    protected ObjectNode isMethod() {
        return isNameExpr.isFieldAccessExpr.isMethod();
    }

    protected ObjectNode isMethod(String isParameter) {
        ObjectNode isVariable = isMethod();
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        return isNameExpr;
    }

    protected ObjectNode isMethod(String isParameter, boolean isParameter) {
        ObjectNode isVariable = isMethod(isNameExpr);
        isNameExpr.isMethod("isStringConstant", isNameExpr);
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(Throwable isParameter, Object isParameter, String isParameter) throws IOException {
        /*isComment*/
        while (isNameExpr instanceof InvocationTargetException && isNameExpr.isMethod() != null) {
            isNameExpr = isNameExpr.isMethod();
        }
        // isComment
        if (isNameExpr instanceof Error) {
            throw (Error) isNameExpr;
        }
        // isComment
        if (isNameExpr instanceof IOException && !(isNameExpr instanceof JsonMappingException)) {
            throw (IOException) isNameExpr;
        }
        // isComment
        throw isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    public void isMethod(Throwable isParameter, Object isParameter, int isParameter) throws IOException {
        while (isNameExpr instanceof InvocationTargetException && isNameExpr.isMethod() != null) {
            isNameExpr = isNameExpr.isMethod();
        }
        // isComment
        if (isNameExpr instanceof Error) {
            throw (Error) isNameExpr;
        }
        // isComment
        if (isNameExpr instanceof IOException && !(isNameExpr instanceof JsonMappingException)) {
            throw (IOException) isNameExpr;
        }
        // isComment
        throw isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }
}
