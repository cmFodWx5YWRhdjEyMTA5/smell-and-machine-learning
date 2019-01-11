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

    static final StdKeySerializer isVariable = new StdKeySerializer();

    public isConstructor() {
        super(Object.class);
    }

    @Override
    public void isMethod(Object isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
        String isVariable = (isNameExpr.isMethod() == String.class) ? ((String) isNameExpr) : isNameExpr.isMethod();
        isNameExpr.isMethod(isNameExpr);
    }

    // isComment
    public JsonNode isMethod(SerializerProvider isParameter, Type isParameter) throws JsonMappingException {
        return isMethod("isStringConstant");
    }
}
