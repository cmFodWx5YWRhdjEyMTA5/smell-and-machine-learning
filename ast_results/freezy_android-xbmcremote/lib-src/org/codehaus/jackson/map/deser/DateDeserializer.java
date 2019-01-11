// isComment
package org.codehaus.jackson.map.deser;

import java.io.IOException;
import java.util.Date;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.DeserializationContext;

/**
 * isComment
 */
public class isClassOrIsInterface extends StdScalarDeserializer<Date> {

    public isConstructor() {
        super(Date.class);
    }

    @Override
    public java.util.Date isMethod(JsonParser isParameter, DeserializationContext isParameter) throws IOException, JsonProcessingException {
        return isMethod(isNameExpr, isNameExpr);
    }
}
