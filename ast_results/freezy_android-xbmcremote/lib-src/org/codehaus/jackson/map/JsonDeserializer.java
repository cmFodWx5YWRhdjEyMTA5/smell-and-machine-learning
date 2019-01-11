// isComment
package org.codehaus.jackson.map;

import java.io.IOException;
import org.codehaus.jackson.*;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T> {

    /**
     * isComment
     */
    public abstract T isMethod(JsonParser isParameter, DeserializationContext isParameter) throws IOException, JsonProcessingException;

    /**
     * isComment
     */
    public T isMethod(JsonParser isParameter, DeserializationContext isParameter, T isParameter) throws IOException, JsonProcessingException {
        throw new UnsupportedOperationException();
    }

    /**
     * isComment
     */
    @SuppressWarnings("isStringConstant")
    public Object isMethod(JsonParser isParameter, DeserializationContext isParameter, TypeDeserializer isParameter) throws IOException, JsonProcessingException {
        // isComment
        return (T) isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public T isMethod() {
        return null;
    }

    /**
     * isComment
     */
    public abstract static class isClassOrIsInterface extends JsonDeserializer<Object> {
    }
}
