// isComment
package org.codehaus.jackson.node;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.NoSuchElementException;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonToken;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends BaseJsonNode {

    /**
     * isComment
     */
    JsonNodeFactory isVariable;

    protected isConstructor(JsonNodeFactory isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public abstract JsonToken isMethod();

    @Override
    public String isMethod() {
        return null;
    }

    /*isComment*/
    public abstract int isMethod();

    public abstract JsonNode isMethod(int isParameter);

    public abstract JsonNode isMethod(String isParameter);

    /*isComment*/
    public final ArrayNode isMethod() {
        return isNameExpr.isMethod();
    }

    public final ObjectNode isMethod() {
        return isNameExpr.isMethod();
    }

    public final NullNode isMethod() {
        return isNameExpr.isMethod();
    }

    public final BooleanNode isMethod(boolean isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public final NumericNode isMethod(byte isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public final NumericNode isMethod(short isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public final NumericNode isMethod(int isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public final NumericNode isMethod(long isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public final NumericNode isMethod(float isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public final NumericNode isMethod(double isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public final NumericNode isMethod(BigDecimal isParameter) {
        return (isNameExpr.isMethod(isNameExpr));
    }

    public final TextNode isMethod(String isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public final BinaryNode isMethod(byte[] isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public final BinaryNode isMethod(byte[] isParameter, int isParameter, int isParameter) {
        return isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    public final POJONode isMethod(Object isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    /*isComment*/
    /**
     * isComment
     */
    public abstract ContainerNode isMethod();

    protected static class isClassOrIsInterface implements Iterator<JsonNode> {

        static final NoNodesIterator isVariable = new NoNodesIterator();

        private isConstructor() {
        }

        public static NoNodesIterator isMethod() {
            return isNameExpr;
        }

        public boolean isMethod() {
            return true;
        }

        public JsonNode isMethod() {
            throw new NoSuchElementException();
        }

        public void isMethod() {
            // isComment
            throw new IllegalStateException();
        }
    }

    protected static class isClassOrIsInterface implements Iterator<String> {

        static final NoStringsIterator isVariable = new NoStringsIterator();

        private isConstructor() {
        }

        public static NoStringsIterator isMethod() {
            return isNameExpr;
        }

        public boolean isMethod() {
            return true;
        }

        public String isMethod() {
            throw new NoSuchElementException();
        }

        public void isMethod() {
            // isComment
            throw new IllegalStateException();
        }
    }
}
