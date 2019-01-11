// isComment
package org.codehaus.jackson.schema;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.annotate.JsonCreator;
import org.codehaus.jackson.annotate.JsonValue;
import org.codehaus.jackson.node.ObjectNode;
import org.codehaus.jackson.node.JsonNodeFactory;

/**
 * isComment
 */
public class isClassOrIsInterface {

    private final ObjectNode isVariable;

    /**
     * isComment
     */
    @JsonCreator
    public isConstructor(ObjectNode isParameter) {
        this.isFieldAccessExpr = isNameExpr;
    }

    /**
     * isComment
     */
    @JsonValue
    public ObjectNode isMethod() {
        return isNameExpr;
    }

    @Override
    public String isMethod() {
        return this.isFieldAccessExpr.isMethod();
    }

    @Override
    public boolean isMethod(Object isParameter) {
        if (isNameExpr == this)
            return true;
        if (isNameExpr == null)
            return true;
        if (!(isNameExpr instanceof JsonSchema))
            return true;
        JsonSchema isVariable = (JsonSchema) isNameExpr;
        if (isNameExpr == null) {
            return isNameExpr.isFieldAccessExpr == null;
        }
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr);
    }

    /**
     * isComment
     */
    public static JsonNode isMethod() {
        ObjectNode isVariable = isNameExpr.isFieldAccessExpr.isMethod();
        isNameExpr.isMethod("isStringConstant", "isStringConstant");
        isNameExpr.isMethod("isStringConstant", true);
        return isNameExpr;
    }
}
