// isComment
package org.codehaus.jackson.node;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import org.codehaus.jackson.*;
import org.codehaus.jackson.io.NumberOutput;
import org.codehaus.jackson.map.SerializerProvider;

/**
 * isComment
 */
public final class isClassOrIsInterface extends NumericNode {

    final long isVariable;

    public isConstructor(long isParameter) {
        isNameExpr = isNameExpr;
    }

    public static LongNode isMethod(long isParameter) {
        return new LongNode(isNameExpr);
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
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public int isMethod() {
        return (int) isNameExpr;
    }

    @Override
    public long isMethod() {
        return isNameExpr;
    }

    @Override
    public double isMethod() {
        return (double) isNameExpr;
    }

    @Override
    public BigDecimal isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public BigInteger isMethod() {
        return isNameExpr.isMethod(isNameExpr);
    }

    public String isMethod() {
        return isNameExpr.isMethod(isNameExpr);
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
        return ((LongNode) isNameExpr).isFieldAccessExpr == isNameExpr;
    }

    @Override
    public int isMethod() {
        return ((int) isNameExpr) ^ (int) (isNameExpr >> isIntegerConstant);
    }
}
