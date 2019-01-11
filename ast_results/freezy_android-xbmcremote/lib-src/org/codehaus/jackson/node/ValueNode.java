// isComment
package org.codehaus.jackson.node;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonToken;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends BaseJsonNode {

    protected isConstructor() {
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public abstract JsonToken isMethod();

    /*isComment*/
    @Override
    public JsonNode isMethod(String isParameter) {
        return isNameExpr.isMethod();
    }

    @Override
    public JsonNode isMethod(int isParameter) {
        return isNameExpr.isMethod();
    }

    /*isComment*/
    @Override
    public String isMethod() {
        return isMethod();
    }
}
