// isComment
package org.codehaus.jackson.node;

import java.io.IOException;
import org.codehaus.jackson.*;
import org.codehaus.jackson.map.SerializerProvider;

/**
 * isComment
 */
public final class isClassOrIsInterface extends ValueNode {

    // isComment
    public static final NullNode isVariable = new NullNode();

    private isConstructor() {
    }

    public static NullNode isMethod() {
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

    public String isMethod() {
        return "isStringConstant";
    }

    @Override
    public final void isMethod(JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonProcessingException {
        isNameExpr.isMethod();
    }

    public boolean isMethod(Object isParameter) {
        return (isNameExpr == this);
    }
}
