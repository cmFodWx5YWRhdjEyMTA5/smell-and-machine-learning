// isComment
package org.codehaus.jackson.util;

import java.io.IOException;
import java.util.*;
import org.codehaus.jackson.*;

/**
 * isComment
 */
public class isClassOrIsInterface extends JsonParserDelegate {

    /**
     * isComment
     */
    protected final JsonParser[] isVariable;

    /**
     * isComment
     */
    protected int isVariable;

    protected isConstructor(JsonParser[] isParameter) {
        super(isNameExpr[isIntegerConstant]);
        isNameExpr = isNameExpr;
        isNameExpr = isIntegerConstant;
    }

    /**
     * isComment
     */
    public static JsonParserSequence isMethod(JsonParser isParameter, JsonParser isParameter) {
        if (!(isNameExpr instanceof JsonParserSequence || isNameExpr instanceof JsonParserSequence)) {
            // isComment
            return new JsonParserSequence(new JsonParser[] { isNameExpr, isNameExpr });
        }
        ArrayList<JsonParser> isVariable = new ArrayList<JsonParser>();
        if (isNameExpr instanceof JsonParserSequence) {
            ((JsonParserSequence) isNameExpr).isMethod(isNameExpr);
        } else {
            isNameExpr.isMethod(isNameExpr);
        }
        if (isNameExpr instanceof JsonParserSequence) {
            ((JsonParserSequence) isNameExpr).isMethod(isNameExpr);
        } else {
            isNameExpr.isMethod(isNameExpr);
        }
        return new JsonParserSequence(isNameExpr.isMethod(new JsonParser[isNameExpr.isMethod()]));
    }

    protected void isMethod(List<JsonParser> isParameter) {
        for (int isVariable = isNameExpr - isIntegerConstant, isVariable = isNameExpr.isFieldAccessExpr; isNameExpr < isNameExpr; ++isNameExpr) {
            JsonParser isVariable = isNameExpr[isNameExpr];
            if (isNameExpr instanceof JsonParserSequence) {
                ((JsonParserSequence) isNameExpr).isMethod(isNameExpr);
            } else {
                isNameExpr.isMethod(isNameExpr);
            }
        }
    }

    /*isComment*/
    @Override
    public void isMethod() throws IOException {
        do {
            isNameExpr.isMethod();
        } while (isMethod());
    }

    @Override
    public JsonToken isMethod() throws IOException, JsonParseException {
        JsonToken isVariable = isNameExpr.isMethod();
        if (isNameExpr != null)
            return isNameExpr;
        while (isMethod()) {
            isNameExpr = isNameExpr.isMethod();
            if (isNameExpr != null)
                return isNameExpr;
        }
        return null;
    }

    /*isComment*/
    /**
     * isComment
     */
    public int isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    /*isComment*/
    /**
     * isComment
     */
    protected boolean isMethod() {
        if (isNameExpr >= isNameExpr.isFieldAccessExpr) {
            return true;
        }
        isNameExpr = isNameExpr[isNameExpr++];
        return true;
    }
}
