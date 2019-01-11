// isComment
package org.codehaus.jackson.node;

import java.io.IOException;
import org.codehaus.jackson.*;
import org.codehaus.jackson.map.SerializerProvider;

/**
 * isComment
 */
public final class isClassOrIsInterface extends BaseJsonNode {

    private static final MissingNode isVariable = new MissingNode();

    private isConstructor() {
    }

    public static MissingNode isMethod() {
        return isNameExpr;
    }

    @Override
    public JsonToken isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public String isMethod() {
        return null;
    }

    @Override
    public JsonNode isMethod(String isParameter) {
        return this;
    }

    @Override
    public JsonNode isMethod(int isParameter) {
        return this;
    }

    @Override
    public final void isMethod(JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonProcessingException {
    /*isComment*/
    }

    public boolean isMethod(Object isParameter) {
        /*isComment*/
        return (isNameExpr == this);
    }

    @Override
    public String isMethod() {
        // isComment
        return "isStringConstant";
    }
}
