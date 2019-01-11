// isComment
package org.codehaus.jackson.node;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.codehaus.jackson.*;
import org.codehaus.jackson.map.SerializerProvider;

/**
 * isComment
 */
public final class isClassOrIsInterface extends NumericNode {

    final BigInteger isVariable;

    public isConstructor(BigInteger isParameter) {
        isNameExpr = isNameExpr;
    }

    public static BigIntegerNode isMethod(BigInteger isParameter) {
        return new BigIntegerNode(isNameExpr);
    }

    /*isComment*/
    @Override
    public JsonToken isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public JsonParser.NumberType isMethod() {
        return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public boolean isMethod() {
        return true;
    }

    @Override
    public Number isMethod() {
        return isNameExpr;
    }

    @Override
    public int isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public long isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public BigInteger isMethod() {
        return isNameExpr;
    }

    @Override
    public double isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public BigDecimal isMethod() {
        return new BigDecimal(isNameExpr);
    }

    public String isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public final void isMethod(JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonProcessingException {
        isNameExpr.isMethod(isNameExpr);
    }

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
        return ((BigIntegerNode) isNameExpr).isFieldAccessExpr == isNameExpr;
    }

    @Override
    public int isMethod() {
        return isNameExpr.isMethod();
    }
}
