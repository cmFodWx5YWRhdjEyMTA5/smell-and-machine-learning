// isComment
package org.codehaus.jackson.map.ser;

import java.io.IOException;
import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.SerializerProvider;

/**
 * isComment
 */
public final class isClassOrIsInterface extends SerializerBase<Object> {

    final String isVariable;

    public isConstructor(String isParameter) {
        super(Object.class);
        isNameExpr = isNameExpr;
    }

    public void isMethod(Object isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
        throw new JsonGenerationException(isNameExpr);
    }

    public JsonNode isMethod(SerializerProvider isParameter, Type isParameter) throws JsonMappingException {
        return null;
    }
}
