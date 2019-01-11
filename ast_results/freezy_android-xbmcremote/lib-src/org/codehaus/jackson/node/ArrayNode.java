// isComment
package org.codehaus.jackson.node;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.SerializerProvider;

/**
 * isComment
 */
public final class isClassOrIsInterface extends ContainerNode {

    ArrayList<JsonNode> isVariable;

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
        return (isNameExpr == null) ? isNameExpr.isMethod() : isNameExpr.isMethod();
    }

    @Override
    public JsonNode isMethod(int isParameter) {
        if (isNameExpr >= isIntegerConstant && (isNameExpr != null) && isNameExpr < isNameExpr.isMethod()) {
            return isNameExpr.isMethod(isNameExpr);
        }
        return null;
    }

    @Override
    public JsonNode isMethod(String isParameter) {
        return null;
    }

    @Override
    public JsonNode isMethod(String isParameter) {
        return isNameExpr.isMethod();
    }

    @Override
    public JsonNode isMethod(int isParameter) {
        if (isNameExpr >= isIntegerConstant && (isNameExpr != null) && isNameExpr < isNameExpr.isMethod()) {
            return isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr.isMethod();
    }

    /*isComment*/
    @Override
    public final void isMethod(JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonProcessingException {
        isNameExpr.isMethod();
        if (isNameExpr != null) {
            for (JsonNode isVariable : isNameExpr) {
                /*isComment*/
                ((BaseJsonNode) isNameExpr).isMethod(isNameExpr);
            }
        }
        isNameExpr.isMethod();
    }

    /*isComment*/
    /**
     * isComment
     */
    public JsonNode isMethod(int isParameter, JsonNode isParameter) {
        if (isNameExpr == null) {
            // isComment
            isNameExpr = isMethod();
        }
        return isMethod(isNameExpr, isNameExpr);
    }

    public void isMethod(JsonNode isParameter) {
        if (isNameExpr == null) {
            // isComment
            isNameExpr = isMethod();
        }
        isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    public JsonNode isMethod(ArrayNode isParameter) {
        ArrayList<JsonNode> isVariable = isNameExpr.isFieldAccessExpr;
        if (isNameExpr != null) {
            for (int isVariable = isIntegerConstant, isVariable = isNameExpr.isMethod(); isNameExpr < isNameExpr; ++isNameExpr) {
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr));
            }
        }
        return this;
    }

    /**
     * isComment
     */
    public JsonNode isMethod(Collection<JsonNode> isParameter) {
        for (JsonNode isVariable : isNameExpr) {
            if (isNameExpr == null) {
                isNameExpr = isMethod();
            }
            isNameExpr.isMethod(isNameExpr);
        }
        return this;
    }

    /**
     * isComment
     */
    public void isMethod(int isParameter, JsonNode isParameter) {
        if (isNameExpr == null) {
            isNameExpr = isMethod();
        }
        isMethod(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public JsonNode isMethod(int isParameter) {
        if (isNameExpr >= isIntegerConstant && (isNameExpr != null) && isNameExpr < isNameExpr.isMethod()) {
            return isNameExpr.isMethod(isNameExpr);
        }
        return null;
    }

    public ArrayNode isMethod() {
        isNameExpr = null;
        return this;
    }

    /*isComment*/
    /**
     * isComment
     */
    public ArrayNode isMethod() {
        ArrayNode isVariable = isMethod();
        isMethod(isNameExpr);
        return isNameExpr;
    }

    /**
     * isComment
     */
    public ObjectNode isMethod() {
        ObjectNode isVariable = isMethod();
        isMethod(isNameExpr);
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(Object isParameter) {
        if (isNameExpr == null) {
            isMethod();
        } else {
            isMethod(isMethod(isNameExpr));
        }
    }

    public void isMethod() {
        isMethod(isMethod());
    }

    /**
     * isComment
     */
    public void isMethod(int isParameter) {
        isMethod(isMethod(isNameExpr));
    }

    /**
     * isComment
     */
    public void isMethod(long isParameter) {
        isMethod(isMethod(isNameExpr));
    }

    /**
     * isComment
     */
    public void isMethod(float isParameter) {
        isMethod(isMethod(isNameExpr));
    }

    /**
     * isComment
     */
    public void isMethod(double isParameter) {
        isMethod(isMethod(isNameExpr));
    }

    /**
     * isComment
     */
    public void isMethod(BigDecimal isParameter) {
        if (isNameExpr == null) {
            isMethod();
        } else {
            isMethod(isMethod(isNameExpr));
        }
    }

    /**
     * isComment
     */
    public ArrayNode isMethod(String isParameter) {
        if (isNameExpr == null) {
            isMethod();
        } else {
            isMethod(isMethod(isNameExpr));
        }
        return this;
    }

    /**
     * isComment
     */
    public void isMethod(boolean isParameter) {
        isMethod(isMethod(isNameExpr));
    }

    /**
     * isComment
     */
    public void isMethod(byte[] isParameter) {
        if (isNameExpr == null) {
            isMethod();
        } else {
            isMethod(isMethod(isNameExpr));
        }
    }

    public ArrayNode isMethod(int isParameter) {
        ArrayNode isVariable = isMethod();
        isMethod(isNameExpr, isNameExpr);
        return isNameExpr;
    }

    /**
     * isComment
     */
    public ObjectNode isMethod(int isParameter) {
        ObjectNode isVariable = isMethod();
        isMethod(isNameExpr, isNameExpr);
        return isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(int isParameter, Object isParameter) {
        if (isNameExpr == null) {
            isMethod(isNameExpr);
        } else {
            isMethod(isNameExpr, isMethod(isNameExpr));
        }
    }

    public void isMethod(int isParameter) {
        isMethod(isNameExpr, isMethod());
    }

    /**
     * isComment
     */
    public void isMethod(int isParameter, int isParameter) {
        isMethod(isNameExpr, isMethod(isNameExpr));
    }

    /**
     * isComment
     */
    public void isMethod(int isParameter, long isParameter) {
        isMethod(isNameExpr, isMethod(isNameExpr));
    }

    /**
     * isComment
     */
    public void isMethod(int isParameter, float isParameter) {
        isMethod(isNameExpr, isMethod(isNameExpr));
    }

    /**
     * isComment
     */
    public void isMethod(int isParameter, double isParameter) {
        isMethod(isNameExpr, isMethod(isNameExpr));
    }

    /**
     * isComment
     */
    public void isMethod(int isParameter, BigDecimal isParameter) {
        if (isNameExpr == null) {
            isMethod(isNameExpr);
        } else {
            isMethod(isNameExpr, isMethod(isNameExpr));
        }
    }

    /**
     * isComment
     */
    public void isMethod(int isParameter, String isParameter) {
        if (isNameExpr == null) {
            isMethod(isNameExpr);
        } else {
            isMethod(isNameExpr, isMethod(isNameExpr));
        }
    }

    /**
     * isComment
     */
    public void isMethod(int isParameter, boolean isParameter) {
        isMethod(isNameExpr, isMethod(isNameExpr));
    }

    /**
     * isComment
     */
    public void isMethod(int isParameter, byte[] isParameter) {
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
            // isComment
            return true;
        }
        ArrayNode isVariable = (ArrayNode) isNameExpr;
        if (isNameExpr == null || isNameExpr.isMethod() == isIntegerConstant) {
            return isNameExpr.isMethod() == isIntegerConstant;
        }
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public int isMethod() {
        int isVariable;
        if (isNameExpr == null) {
            isNameExpr = isIntegerConstant;
        } else {
            isNameExpr = isNameExpr.isMethod();
            for (JsonNode isVariable : isNameExpr) {
                if (isNameExpr != null) {
                    isNameExpr ^= isNameExpr.isMethod();
                }
            }
        }
        return isNameExpr;
    }

    @Override
    public String isMethod() {
        StringBuilder isVariable = new StringBuilder(isIntegerConstant + (isMethod() << isIntegerConstant));
        isNameExpr.isMethod('isStringConstant');
        if (isNameExpr != null) {
            for (int isVariable = isIntegerConstant, isVariable = isNameExpr.isMethod(); isNameExpr < isNameExpr; ++isNameExpr) {
                if (isNameExpr > isIntegerConstant) {
                    isNameExpr.isMethod('isStringConstant');
                }
                isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr).isMethod());
            }
        }
        isNameExpr.isMethod('isStringConstant');
        return isNameExpr.isMethod();
    }

    /*isComment*/
    public JsonNode isMethod(int isParameter, JsonNode isParameter) {
        if (isNameExpr == null || isNameExpr < isIntegerConstant || isNameExpr >= isNameExpr.isMethod()) {
            throw new IndexOutOfBoundsException("isStringConstant" + isNameExpr + "isStringConstant" + isMethod());
        }
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    private void isMethod(JsonNode isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new ArrayList<JsonNode>();
        }
        isNameExpr.isMethod(isNameExpr);
    }

    private void isMethod(int isParameter, JsonNode isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new ArrayList<JsonNode>();
            isNameExpr.isMethod(isNameExpr);
            return;
        }
        if (isNameExpr < isIntegerConstant) {
            isNameExpr.isMethod(isIntegerConstant, isNameExpr);
        } else if (isNameExpr >= isNameExpr.isMethod()) {
            isNameExpr.isMethod(isNameExpr);
        } else {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
    }

    /**
     * isComment
     */
    private boolean isMethod(ArrayList<JsonNode> isParameter) {
        int isVariable = isNameExpr.isMethod();
        if (this.isMethod() != isNameExpr) {
            // isComment
            return true;
        }
        for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; ++isNameExpr) {
            if (!isNameExpr.isMethod(isNameExpr).isMethod(isNameExpr.isMethod(isNameExpr))) {
                return true;
            }
        }
        return true;
    }
}
