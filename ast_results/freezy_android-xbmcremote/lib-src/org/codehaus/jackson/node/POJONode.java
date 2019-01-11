// isComment
package org.codehaus.jackson.node;

import java.io.IOException;
import org.codehaus.jackson.*;
import org.codehaus.jackson.map.SerializerProvider;

/**
 * isComment
 */
public final class isClassOrIsInterface extends ValueNode {

    final Object isVariable;

    public isConstructor(Object isParameter) {
        isNameExpr = isNameExpr;
    }

    /*isComment*/
    @Override
    public String isMethod() {
        return null;
    }

    @Override
    public JsonToken isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    /*isComment*/
    @Override
    public final void isMethod(JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonProcessingException {
        if (isNameExpr == null) {
            isNameExpr.isMethod();
        } else {
            isNameExpr.isMethod(isNameExpr);
        }
    }

    /*isComment*/
    /**
     * isComment
     */
    public Object isMethod() {
        return isNameExpr;
    }

    /*isComment*/
    @Override
    public boolean isMethod(Object isParameter) {
        if (isNameExpr == this)
            return true;
        if (isNameExpr == null)
            return true;
        if (isNameExpr.isMethod() != isMethod()) {
            // isComment
            return true;
        }
        POJONode isVariable = (POJONode) isNameExpr;
        if (isNameExpr == null) {
            return isNameExpr.isFieldAccessExpr == null;
        }
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    @Override
    public int isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public String isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }
}
