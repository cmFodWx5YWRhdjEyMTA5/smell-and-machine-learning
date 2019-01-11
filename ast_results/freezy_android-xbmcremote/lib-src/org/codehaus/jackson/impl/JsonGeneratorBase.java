// isComment
package org.codehaus.jackson.impl;

import java.io.*;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.codehaus.jackson.*;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends JsonGenerator {

    /*isComment*/
    protected ObjectCodec isVariable;

    /**
     * isComment
     */
    protected int isVariable;

    /**
     * isComment
     */
    protected boolean isVariable;

    /*isComment*/
    /**
     * isComment
     */
    protected JsonWriteContext isVariable;

    /**
     * isComment
     */
    protected boolean isVariable;

    protected isConstructor(int isParameter, ObjectCodec isParameter) {
        super();
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isNameExpr;
        isNameExpr = isMethod(isNameExpr.isFieldAccessExpr);
    }

    /*isComment*/
    @Override
    public JsonGenerator isMethod(Feature isParameter) {
        isNameExpr |= isNameExpr.isMethod();
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            isNameExpr = true;
        }
        return this;
    }

    @Override
    public JsonGenerator isMethod(Feature isParameter) {
        isNameExpr &= ~isNameExpr.isMethod();
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            isNameExpr = true;
        }
        return this;
    }

    // isComment
    @Override
    public final boolean isMethod(Feature isParameter) {
        return (isNameExpr & isNameExpr.isMethod()) != isIntegerConstant;
    }

    public final JsonGenerator isMethod() {
        return isMethod(new DefaultPrettyPrinter());
    }

    public final JsonGenerator isMethod(ObjectCodec isParameter) {
        isNameExpr = isNameExpr;
        return this;
    }

    public final ObjectCodec isMethod() {
        return isNameExpr;
    }

    /*isComment*/
    /**
     * isComment
     */
    public final JsonWriteContext isMethod() {
        return isNameExpr;
    }

    /*isComment*/
    public final void isMethod() throws IOException, JsonGenerationException {
        // isComment
        isMethod("isStringConstant");
        isNameExpr = isNameExpr.isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod(this);
        } else {
            isMethod();
        }
    }

    protected abstract void isMethod() throws IOException, JsonGenerationException;

    public final void isMethod() throws IOException, JsonGenerationException {
        if (!isNameExpr.isMethod()) {
            isMethod("isStringConstant" + isNameExpr.isMethod());
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod(this, isNameExpr.isMethod());
        } else {
            isMethod();
        }
        isNameExpr = isNameExpr.isMethod();
    }

    protected abstract void isMethod() throws IOException, JsonGenerationException;

    public final void isMethod() throws IOException, JsonGenerationException {
        isMethod("isStringConstant");
        isNameExpr = isNameExpr.isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod(this);
        } else {
            isMethod();
        }
    }

    protected abstract void isMethod() throws IOException, JsonGenerationException;

    public final void isMethod() throws IOException, JsonGenerationException {
        if (!isNameExpr.isMethod()) {
            isMethod("isStringConstant" + isNameExpr.isMethod());
        }
        isNameExpr = isNameExpr.isMethod();
        if (isNameExpr != null) {
            isNameExpr.isMethod(this, isNameExpr.isMethod());
        } else {
            isMethod();
        }
    }

    protected abstract void isMethod() throws IOException, JsonGenerationException;

    public final void isMethod(String isParameter) throws IOException, JsonGenerationException {
        // isComment
        int isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            isMethod("isStringConstant");
        }
        isMethod(isNameExpr, (isNameExpr == isNameExpr.isFieldAccessExpr));
    }

    protected abstract void isMethod(String isParameter, boolean isParameter) throws IOException, JsonGenerationException;

    /*isComment*/
    // isComment
    // isComment
    // isComment
    // isComment
    // isComment
    /*isComment*/
    public abstract void isMethod(int isParameter) throws IOException, JsonGenerationException;

    public abstract void isMethod(long isParameter) throws IOException, JsonGenerationException;

    public abstract void isMethod(double isParameter) throws IOException, JsonGenerationException;

    public abstract void isMethod(float isParameter) throws IOException, JsonGenerationException;

    public abstract void isMethod(BigDecimal isParameter) throws IOException, JsonGenerationException;

    public abstract void isMethod(boolean isParameter) throws IOException, JsonGenerationException;

    public abstract void isMethod() throws IOException, JsonGenerationException;

    /*isComment*/
    public void isMethod(Object isParameter) throws IOException, JsonProcessingException {
        if (isNameExpr == null) {
            // isComment
            isMethod();
        } else {
            /*isComment*/
            if (isNameExpr != null) {
                isNameExpr.isMethod(this, isNameExpr);
                return;
            }
            isMethod(isNameExpr);
        }
    }

    public void isMethod(JsonNode isParameter) throws IOException, JsonProcessingException {
        // isComment
        if (isNameExpr == null) {
            isMethod();
        } else {
            if (isNameExpr == null) {
                throw new IllegalStateException("isStringConstant");
            }
            isNameExpr.isMethod(this, isNameExpr);
        }
    }

    /*isComment*/
    public abstract void isMethod() throws IOException;

    public void isMethod() throws IOException {
        isNameExpr = true;
    }

    public boolean isMethod() {
        return isNameExpr;
    }

    /*isComment*/
    public final void isMethod(JsonParser isParameter) throws IOException, JsonProcessingException {
        switch(isNameExpr.isMethod()) {
            case isNameExpr:
                isMethod();
                break;
            case isNameExpr:
                isMethod();
                break;
            case isNameExpr:
                isMethod();
                break;
            case isNameExpr:
                isMethod();
                break;
            case isNameExpr:
                isMethod(isNameExpr.isMethod());
                break;
            case isNameExpr:
                isMethod(isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr.isMethod());
                break;
            case isNameExpr:
                switch(isNameExpr.isMethod()) {
                    case isNameExpr:
                        isMethod(isNameExpr.isMethod());
                        break;
                    case isNameExpr:
                        isMethod(isNameExpr.isMethod());
                        break;
                    default:
                        isMethod(isNameExpr.isMethod());
                }
                break;
            case isNameExpr:
                switch(isNameExpr.isMethod()) {
                    case isNameExpr:
                        isMethod(isNameExpr.isMethod());
                        break;
                    case isNameExpr:
                        isMethod(isNameExpr.isMethod());
                        break;
                    default:
                        isMethod(isNameExpr.isMethod());
                }
                break;
            case isNameExpr:
                isMethod(true);
                break;
            case isNameExpr:
                isMethod(true);
                break;
            case isNameExpr:
                isMethod();
                break;
            case isNameExpr:
                isMethod(isNameExpr.isMethod());
                break;
            default:
                isMethod();
        }
    }

    public final void isMethod(JsonParser isParameter) throws IOException, JsonProcessingException {
        JsonToken isVariable = isNameExpr.isMethod();
        // isComment
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            isMethod(isNameExpr.isMethod());
            isNameExpr = isNameExpr.isMethod();
        // isComment
        }
        switch(isNameExpr) {
            case isNameExpr:
                isMethod();
                while (isNameExpr.isMethod() != isNameExpr.isFieldAccessExpr) {
                    isMethod(isNameExpr);
                }
                isMethod();
                break;
            case isNameExpr:
                isMethod();
                while (isNameExpr.isMethod() != isNameExpr.isFieldAccessExpr) {
                    isMethod(isNameExpr);
                }
                isMethod();
                break;
            default:
                // isComment
                isMethod(isNameExpr);
        }
    }

    /*isComment*/
    protected abstract void isMethod();

    protected abstract void isMethod(String isParameter) throws IOException, JsonGenerationException;

    protected void isMethod(String isParameter) throws JsonGenerationException {
        throw new JsonGenerationException(isNameExpr);
    }

    protected void isMethod() {
        throw new RuntimeException("isStringConstant");
    }

    /**
     * isComment
     */
    protected void isMethod(Object isParameter) throws IOException, JsonGenerationException {
        /*isComment*/
        if (isNameExpr instanceof String) {
            isMethod((String) isNameExpr);
            return;
        }
        if (isNameExpr instanceof Number) {
            Number isVariable = (Number) isNameExpr;
            if (isNameExpr instanceof Integer) {
                isMethod(isNameExpr.isMethod());
                return;
            } else if (isNameExpr instanceof Long) {
                isMethod(isNameExpr.isMethod());
                return;
            } else if (isNameExpr instanceof Double) {
                isMethod(isNameExpr.isMethod());
                return;
            } else if (isNameExpr instanceof BigInteger) {
                isMethod((BigInteger) isNameExpr);
                return;
            } else if (isNameExpr instanceof BigDecimal) {
                isMethod((BigDecimal) isNameExpr);
                return;
            }
        } else if (isNameExpr instanceof byte[]) {
            isMethod((byte[]) isNameExpr);
        } else if (isNameExpr instanceof Boolean) {
            isMethod(((Boolean) isNameExpr).isMethod());
        }
        throw new IllegalStateException("isStringConstant");
    }
}
