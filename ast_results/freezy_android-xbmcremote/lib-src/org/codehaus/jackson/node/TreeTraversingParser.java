// isComment
package org.codehaus.jackson.node;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.codehaus.jackson.*;

/**
 * isComment
 */
public class isClassOrIsInterface extends JsonParser {

    /*isComment*/
    protected ObjectCodec isVariable;

    /**
     * isComment
     */
    protected NodeCursor isVariable;

    /*isComment*/
    /**
     * isComment
     */
    protected JsonToken isVariable;

    /**
     * isComment
     */
    protected boolean isVariable;

    /**
     * isComment
     */
    protected boolean isVariable;

    public isConstructor(JsonNode isParameter) {
        this(isNameExpr, null);
    }

    public isConstructor(JsonNode isParameter, ObjectCodec isParameter) {
        isNameExpr = isNameExpr;
        if (isNameExpr.isMethod()) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr = new NodeCursor.Array(isNameExpr, null);
        } else if (isNameExpr.isMethod()) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
            isNameExpr = new NodeCursor.Object(isNameExpr, null);
        } else {
            // isComment
            isNameExpr = new NodeCursor.RootValue(isNameExpr, null);
        }
    }

    public void isMethod(ObjectCodec isParameter) {
        isNameExpr = isNameExpr;
    }

    public ObjectCodec isMethod() {
        return isNameExpr;
    }

    /*isComment*/
    @Override
    public void isMethod() throws IOException {
        if (!isNameExpr) {
            isNameExpr = true;
            isNameExpr = null;
            isNameExpr = null;
        }
    }

    /*isComment*/
    @Override
    public JsonToken isMethod() throws IOException, JsonParseException {
        if (isNameExpr != null) {
            isNameExpr = isNameExpr;
            isNameExpr = null;
            return isNameExpr;
        }
        // isComment
        if (isNameExpr) {
            isNameExpr = true;
            // isComment
            if (!isNameExpr.isMethod()) {
                isNameExpr = (isNameExpr == isNameExpr.isFieldAccessExpr) ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr;
                return isNameExpr;
            }
            isNameExpr = isNameExpr.isMethod();
            return (isNameExpr = isNameExpr.isMethod());
        }
        // isComment
        if (isNameExpr == null) {
            // isComment
            isNameExpr = true;
            return null;
        }
        // isComment
        isNameExpr = isNameExpr.isMethod();
        if (isNameExpr != null) {
            if (isNameExpr == isNameExpr.isFieldAccessExpr || isNameExpr == isNameExpr.isFieldAccessExpr) {
                isNameExpr = true;
            }
            return isNameExpr;
        }
        // isComment
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod();
        return isNameExpr;
    }

    // isComment
    // isComment
    @Override
    public JsonParser isMethod() throws IOException, JsonParseException {
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
        } else if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            isNameExpr = isNameExpr.isFieldAccessExpr;
        }
        return this;
    }

    @Override
    public boolean isMethod() {
        return isNameExpr;
    }

    /*isComment*/
    @Override
    public String isMethod() {
        return (isNameExpr == null) ? null : isNameExpr.isMethod();
    }

    @Override
    public JsonStreamContext isMethod() {
        return isNameExpr;
    }

    @Override
    public JsonLocation isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public JsonLocation isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    /*isComment*/
    @Override
    public String isMethod() {
        if (isNameExpr) {
            return null;
        }
        // isComment
        switch(isNameExpr) {
            case isNameExpr:
                return isNameExpr.isMethod();
            case isNameExpr:
                return isMethod().isMethod();
            case isNameExpr:
            case isNameExpr:
                return isNameExpr.isMethod(isMethod().isMethod());
            case isNameExpr:
                JsonNode isVariable = isMethod();
                if (isNameExpr != null && isNameExpr.isMethod()) {
                    // isComment
                    return isNameExpr.isMethod();
                }
        }
        return (isNameExpr == null) ? null : isNameExpr.isMethod();
    }

    @Override
    public char[] isMethod() throws IOException, JsonParseException {
        return isMethod().isMethod();
    }

    @Override
    public int isMethod() throws IOException, JsonParseException {
        return isMethod().isMethod();
    }

    @Override
    public int isMethod() throws IOException, JsonParseException {
        // isComment
        return isIntegerConstant;
    }

    /*isComment*/
    // isComment
    @Override
    public NumberType isMethod() throws IOException, JsonParseException {
        JsonNode isVariable = isMethod();
        return (isNameExpr == null) ? null : isNameExpr.isMethod();
    }

    @Override
    public BigInteger isMethod() throws IOException, JsonParseException {
        return isMethod().isMethod();
    }

    @Override
    public BigDecimal isMethod() throws IOException, JsonParseException {
        return isMethod().isMethod();
    }

    @Override
    public double isMethod() throws IOException, JsonParseException {
        return isMethod().isMethod();
    }

    @Override
    public float isMethod() throws IOException, JsonParseException {
        return (float) isMethod().isMethod();
    }

    @Override
    public long isMethod() throws IOException, JsonParseException {
        return isMethod().isMethod();
    }

    @Override
    public int isMethod() throws IOException, JsonParseException {
        return isMethod().isMethod();
    }

    @Override
    public Number isMethod() throws IOException, JsonParseException {
        return isMethod().isMethod();
    }

    public Object isMethod() {
        if (!isNameExpr) {
            JsonNode isVariable = isMethod();
            if (isNameExpr != null && isNameExpr.isMethod()) {
                return ((POJONode) isNameExpr).isMethod();
            }
        }
        return null;
    }

    /*isComment*/
    @Override
    public byte[] isMethod(Base64Variant isParameter) throws IOException, JsonParseException {
        // isComment
        JsonNode isVariable = isMethod();
        if (isNameExpr != null) {
            // isComment
            byte[] isVariable = isNameExpr.isMethod();
            // isComment
            if (isNameExpr != null) {
                return isNameExpr;
            }
            // isComment
            if (isNameExpr.isMethod()) {
                Object isVariable = ((POJONode) isNameExpr).isMethod();
                if (isNameExpr instanceof byte[]) {
                    return (byte[]) isNameExpr;
                }
            }
        }
        // isComment
        return null;
    }

    /*isComment*/
    protected JsonNode isMethod() {
        if (isNameExpr || isNameExpr == null) {
            return null;
        }
        return isNameExpr.isMethod();
    }

    protected JsonNode isMethod() throws JsonParseException {
        JsonNode isVariable = isMethod();
        if (isNameExpr == null || !isNameExpr.isMethod()) {
            JsonToken isVariable = (isNameExpr == null) ? null : isNameExpr.isMethod();
            throw isMethod("isStringConstant" + isNameExpr + "isStringConstant");
        }
        return isNameExpr;
    }
}
