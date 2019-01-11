// isComment
package org.codehaus.jackson.map.deser;

import java.io.IOException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.TypeDeserializer;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T> extends StdDeserializer<T> {

    protected isConstructor(Class<?> isParameter) {
        super(isNameExpr);
    }

    @Override
    public Object isMethod(JsonParser isParameter, DeserializationContext isParameter, TypeDeserializer isParameter) throws IOException, JsonProcessingException {
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }
}
