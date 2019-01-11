// isComment
package org.codehaus.jackson.map;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.type.*;
import org.codehaus.jackson.type.JavaType;

/**
 * isComment
 */
public abstract class isClassOrIsInterface {

    /*isComment*/
    /**
     * isComment
     */
    public abstract JsonDeserializer<Object> isMethod(DeserializationConfig isParameter, JavaType isParameter, DeserializerProvider isParameter) throws JsonMappingException;

    /**
     * isComment
     */
    public abstract JsonDeserializer<?> isMethod(DeserializationConfig isParameter, ArrayType isParameter, DeserializerProvider isParameter) throws JsonMappingException;

    public abstract JsonDeserializer<?> isMethod(DeserializationConfig isParameter, CollectionType isParameter, DeserializerProvider isParameter) throws JsonMappingException;

    public abstract JsonDeserializer<?> isMethod(DeserializationConfig isParameter, Class<?> isParameter, DeserializerProvider isParameter) throws JsonMappingException;

    public abstract JsonDeserializer<?> isMethod(DeserializationConfig isParameter, MapType isParameter, DeserializerProvider isParameter) throws JsonMappingException;

    /**
     * isComment
     */
    public abstract JsonDeserializer<?> isMethod(DeserializationConfig isParameter, Class<? extends JsonNode> isParameter, DeserializerProvider isParameter) throws JsonMappingException;

    /**
     * isComment
     */
    public TypeDeserializer isMethod(DeserializationConfig isParameter, JavaType isParameter) {
        // isComment
        return null;
    }
}
