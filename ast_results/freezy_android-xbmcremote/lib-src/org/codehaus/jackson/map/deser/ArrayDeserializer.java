// isComment
package org.codehaus.jackson.map.deser;

import java.io.IOException;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.JsonToken;
import org.codehaus.jackson.map.*;
import org.codehaus.jackson.map.type.ArrayType;
import org.codehaus.jackson.map.util.ObjectBuffer;
import org.codehaus.jackson.type.JavaType;

/**
 * isComment
 */
public class isClassOrIsInterface extends StdDeserializer<Object> {

    // isComment
    final JavaType isVariable;

    /**
     * isComment
     */
    final boolean isVariable;

    /**
     * isComment
     */
    final Class<?> isVariable;

    /**
     * isComment
     */
    final JsonDeserializer<Object> isVariable;

    /**
     * isComment
     */
    final TypeDeserializer isVariable;

    @Deprecated
    public isConstructor(ArrayType isParameter, JsonDeserializer<Object> isParameter) {
        this(isNameExpr, isNameExpr, null);
    }

    public isConstructor(ArrayType isParameter, JsonDeserializer<Object> isParameter, TypeDeserializer isParameter) {
        super(Object[].class);
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr.isMethod().isMethod();
        isNameExpr = (isNameExpr == Object.class);
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    public JavaType isMethod() {
        return null;
    }

    public Object isMethod(JsonParser isParameter, DeserializationContext isParameter) throws IOException, JsonProcessingException {
        // isComment
        if (isNameExpr.isMethod() != isNameExpr.isFieldAccessExpr) {
            /*isComment*/
            if (isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr && isNameExpr == Byte.class) {
                return isMethod(isNameExpr, isNameExpr);
            }
            throw isNameExpr.isMethod(isNameExpr.isMethod());
        }
        final ObjectBuffer isVariable = isNameExpr.isMethod();
        Object[] isVariable = isNameExpr.isMethod();
        int isVariable = isIntegerConstant;
        JsonToken isVariable;
        final TypeDeserializer isVariable = isNameExpr;
        while ((isNameExpr = isNameExpr.isMethod()) != isNameExpr.isFieldAccessExpr) {
            // isComment
            Object isVariable;
            if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                isNameExpr = null;
            } else if (isNameExpr == null) {
                isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
            } else {
                isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
            }
            if (isNameExpr >= isNameExpr.isFieldAccessExpr) {
                isNameExpr = isNameExpr.isMethod(isNameExpr);
                isNameExpr = isIntegerConstant;
            }
            isNameExpr[isNameExpr++] = isNameExpr;
        }
        Object[] isVariable;
        if (isNameExpr) {
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr);
        } else {
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
        isNameExpr.isMethod(isNameExpr);
        return isNameExpr;
    }

    public Object isMethod(JsonParser isParameter, DeserializationContext isParameter, TypeDeserializer isParameter) throws IOException, JsonProcessingException {
        /*isComment*/
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    protected Byte[] isMethod(JsonParser isParameter, DeserializationContext isParameter) throws IOException, JsonProcessingException {
        // isComment
        byte[] isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
        // isComment
        Byte[] isVariable = new Byte[isNameExpr.isFieldAccessExpr];
        for (int isVariable = isIntegerConstant, isVariable = isNameExpr.isFieldAccessExpr; isNameExpr < isNameExpr; ++isNameExpr) {
            isNameExpr[isNameExpr] = isNameExpr.isMethod(isNameExpr[isNameExpr]);
        }
        return isNameExpr;
    }
}
