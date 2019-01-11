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
    public abstract void isMethod(T isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonProcessingException;

    /**
     * isComment
     */
    public void isMethod(T isParameter, JsonGenerator isParameter, SerializerProvider isParameter, TypeSerializer isParameter) throws IOException, JsonProcessingException {
        isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    /*isComment*/
    /**
     * isComment
     */
    public Class<T> isMethod() {
        return null;
    }

    /**
     * isComment
     */
    public abstract static class isClassOrIsInterface extends JsonSerializer<Object> {
    }
}
