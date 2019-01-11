// isComment
package org.codehaus.jackson.map.ser;

import java.io.IOException;
import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.SerializerProvider;
import org.codehaus.jackson.map.JsonMappingException;

/**
 * isComment
 */
public final class isClassOrIsInterface extends SerializerBase<Object> {

    /**
     * isComment
     */
    public static final ToStringSerializer isVariable = new ToStringSerializer();

    /**
     * isComment
     */
    public isConstructor() {
        super(Object.class);
    }

    @Override
    public void isMethod(Object isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
        isNameExpr.isMethod(isNameExpr.isMethod());
    }

    // isComment
    public JsonNode isMethod(SerializerProvider isParameter, Type isParameter) throws JsonMappingException {
        return isMethod("isStringConstant", true);
    }
}
