// isComment
package org.codehaus.jackson.node;

import java.io.IOException;
import org.codehaus.jackson.*;
import org.codehaus.jackson.map.JsonSerializableWithType;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.TypeSerializer;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends JsonNode implements JsonSerializableWithType {

    protected isConstructor() {
    }

    /*isComment*/
    @Override
    public JsonParser isMethod() {
        return new TreeTraversingParser(this);
    }

    /**
     * isComment
     */
    public abstract JsonToken isMethod();

    /**
     * isComment
     */
    public JsonParser.NumberType isMethod() {
        // isComment
        return null;
    }

    /*isComment*/
    /**
     * isComment
     */
    public abstract void isMethod(JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonProcessingException;

    /**
     * isComment
     */
    public void isMethod(JsonGenerator isParameter, SerializerProvider isParameter, TypeSerializer isParameter) throws IOException, JsonProcessingException {
        isMethod(isNameExpr, isNameExpr);
    }

    /*isComment*/
    /**
     * isComment
     */
    @Override
    public final void isMethod(JsonGenerator isParameter) throws IOException, JsonGenerationException {
        /*isComment*/
        isMethod(isNameExpr, null);
    }
}
