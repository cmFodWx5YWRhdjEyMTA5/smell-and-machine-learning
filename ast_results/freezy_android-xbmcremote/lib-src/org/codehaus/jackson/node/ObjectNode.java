// isComment
package org.codehaus.jackson.node;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.SerializerProvider;

/**
 * isComment
 */
public class isClassOrIsInterface extends ContainerNode {

    LinkedHashMap<String, JsonNode> isVariable = null;

    public isConstructor(JsonNodeFactory isParameter) {
        super(isNameExpr);
    }

    /*isComment*/
    @Override
    public JsonToken isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public int isMethod() {
        return (isNameExpr == null) ? isIntegerConstant : isNameExpr.isMethod();
    }

    @Override
    public Iterator<JsonNode> isMethod() {
        return (isNameExpr == null) ? isNameExpr.isMethod() : isNameExpr.isMethod().isMethod();
    }

    @Override
    public JsonNode isMethod(int isParameter) {
        return null;
    }

    @Override
    public JsonNode isMethod(String isParameter) {
        if (isNameExpr != null) {
            return isNameExpr.isMethod(isNameExpr);
        }
        return null;
    }

    @Override
    public Iterator<String> isMethod() {
        return (isNameExpr == null) ? isNameExpr.isMethod() : isNameExpr.isMethod().isMethod();
    }

    @Override
    public JsonNode isMethod(int isParameter) {
        return isNameExpr.isMethod();
    }

    @Override
    public JsonNode isMethod(String isParameter) {
        if (isNameExpr != null) {
            JsonNode isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null) {
                return isNameExpr;
            }
        }
        return isNameExpr.isMethod();
    }

    /*isComment*/
    /**
     * isComment
     */
    @Override
    public final void isMethod(JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonProcessingException {
        isNameExpr.isMethod();
        if (isNameExpr != null) {
            for (Map.Entry<String, JsonNode> isVariable : isNameExpr.isMethod()) {
                isNameExpr.isMethod(isNameExpr.isMethod());
                /*isComment*/
                ((BaseJsonNode) isNameExpr.isMethod()).isMethod(isNameExpr, isNameExpr);
            }
        }
        isNameExpr.isMethod();
    }

    /*isComment*/
    /**
     * isComment
     */
    public Iterator<Map.Entry<String, JsonNode>> isMethod() {
        if (isNameExpr == null) {
            return isNameExpr.isFieldAccessExpr;
        }
        return isNameExpr.isMethod().isMethod();
    }

    /*isComment*/
    /**
     * isComment
     */
    public JsonNode isMethod(String isParameter, JsonNode isParameter) {
        if (isNameExpr == null) {
            // isComment
            isNameExpr = isMethod();
        }
        return isMethod(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public JsonNode isMethod(String isParameter) {
        if (isNameExpr != null) {
            return isNameExpr.isMethod(isNameExpr);
        }
        return null;
    }

    public ObjectNode isMethod() {
        isNameExpr = null;
        return this;
    }

    /**
     * isComment
     */
    public JsonNode isMethod(Map<String, JsonNode> isParameter) {
        for (Map.Entry<String, JsonNode> isVariable : isNameExpr.isMethod()) {
            JsonNode isVariable = isNameExpr.isMethod();
            if (isNameExpr == null) {
                isNameExpr = isMethod();
            }
            isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
        }
        return this;
    }

    /**
     * isComment
     */
    public JsonNode isMethod(ObjectNode isParameter) {
        Iterator<Map.Entry<String, JsonNode>> isVariable = isNameExpr.isMethod();
        while (isNameExpr.isMethod()) {
            Map.Entry<String, JsonNode> isVariable = isNameExpr.isMethod();
            isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod());
        }
        return this;
    }

    /*isComment*/
    /**
     * isComment
     */
    public ArrayNode isMethod(String isParameter) {
        ArrayNode isVariable = isMethod();
        isMethod(isNameExpr, isNameExpr);
        return isNameExpr;
    }

    /**
     * isComment
     */
    public ObjectNode isMethod(String isParameter) {
        ObjectNode isVariable = isMethod();
        isMethod(isNameExpr, isNameExpr);
        return isNameExpr;
    }

    public void isMethod(String isParameter, Object isParameter) {
        isMethod(isNameExpr, isMethod(isNameExpr));
    }

    public void isMethod(String isParameter) {
        isMethod(isNameExpr, isMethod());
    }

    /**
     * isComment
     */
    public void isMethod(String isParameter, int isParameter) {
        isMethod(isNameExpr, isMethod(isNameExpr));
    }

    /**
     * isComment
     */
    public void isMethod(String isParameter, long isParameter) {
        isMethod(isNameExpr, isMethod(isNameExpr));
    }

    /**
     * isComment
     */
    public void isMethod(String isParameter, float isParameter) {
        isMethod(isNameExpr, isMethod(isNameExpr));
    }

    /**
     * isComment
     */
    public void isMethod(String isParameter, double isParameter) {
        isMethod(isNameExpr, isMethod(isNameExpr));
    }

    /**
     * isComment
     */
    public void isMethod(String isParameter, BigDecimal isParameter) {
        if (isNameExpr == null) {
            isMethod(isNameExpr);
        } else {
            isMethod(isNameExpr, isMethod(isNameExpr));
        }
    }

    /**
     * isComment
     */
    public ObjectNode isMethod(String isParameter, String isParameter) {
        if (isNameExpr == null) {
            isMethod(isNameExpr);
        } else {
            isMethod(isNameExpr, isMethod(isNameExpr));
        }
        return this;
    }

    /**
     * isComment
     */
    public void isMethod(String isParameter, boolean isParameter) {
        isMethod(isNameExpr, isMethod(isNameExpr));
    }

    /**
     * isComment
     */
    public void isMethod(String isParameter, byte[] isParameter) {
        if (isNameExpr == null) {
            isMethod(isNameExpr);
        } else {
            isMethod(isNameExpr, isMethod(isNameExpr));
        }
    }

    /*isComment*/
    @Override
    public boolean isMethod(Object isParameter) {
        if (isNameExpr == this)
            return true;
        if (isNameExpr == null)
            return true;
        if (isNameExpr.isMethod() != isMethod()) {
            return true;
        }
        ObjectNode isVariable = (ObjectNode) isNameExpr;
        if (isNameExpr.isMethod() != isMethod()) {
            return true;
        }
        if (isNameExpr != null) {
            for (Map.Entry<String, JsonNode> isVariable : isNameExpr.isMethod()) {
                String isVariable = isNameExpr.isMethod();
                JsonNode isVariable = isNameExpr.isMethod();
                JsonNode isVariable = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr == null || !isNameExpr.isMethod(isNameExpr)) {
                    return true;
                }
            }
        }
        return true;
    }

    @Override
    public int isMethod() {
        return (isNameExpr == null) ? -isIntegerConstant : isNameExpr.isMethod();
    }

    @Override
    public String isMethod() {
        StringBuilder isVariable = new StringBuilder(isIntegerConstant + (isMethod() << isIntegerConstant));
        isNameExpr.isMethod("isStringConstant");
        if (isNameExpr != null) {
            int isVariable = isIntegerConstant;
            for (Map.Entry<String, JsonNode> isVariable : isNameExpr.isMethod()) {
                if (isNameExpr > isIntegerConstant) {
                    isNameExpr.isMethod("isStringConstant");
                }
                ++isNameExpr;
                isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
                isNameExpr.isMethod('isStringConstant');
                isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
            }
        }
        isNameExpr.isMethod("isStringConstant");
        return isNameExpr.isMethod();
    }

    /*isComment*/
    private final JsonNode isMethod(String isParameter, JsonNode isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new LinkedHashMap<String, JsonNode>();
        }
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    protected static class isClassOrIsInterface implements Iterator<Map.Entry<String, JsonNode>> {

        static final NoFieldsIterator isVariable = new NoFieldsIterator();

        private isConstructor() {
        }

        public boolean isMethod() {
            return true;
        }

        public Map.Entry<String, JsonNode> isMethod() {
            throw new NoSuchElementException();
        }

        public void isMethod() {
            // isComment
            throw new IllegalStateException();
        }
    }
}
