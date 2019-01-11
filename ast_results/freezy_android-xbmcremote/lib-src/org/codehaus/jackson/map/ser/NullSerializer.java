// isComment
package org.codehaus.jackson.map.ser;

import java.lang.reflect.Type;
import java.io.IOException;
import org.codehaus.jackson.*;
import org.codehaus.jackson.map.*;

/**
 * isComment
 */
public class isClassOrIsInterface extends SerializerBase<Object> {

    public static final NullSerializer isVariable = new NullSerializer();

    private isConstructor() {
        super(Object.class);
    }

    @Override
    public void isMethod(Object isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
        isNameExpr.isMethod();
    }

    @Override
    public JsonNode isMethod(SerializerProvider isParameter, Type isParameter) throws JsonMappingException {
        return isMethod("isStringConstant");
    }
}
