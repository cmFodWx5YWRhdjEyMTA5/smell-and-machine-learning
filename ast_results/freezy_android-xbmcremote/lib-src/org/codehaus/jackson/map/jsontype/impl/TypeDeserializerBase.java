// isComment
package org.codehaus.jackson.map.jsontype.impl;

import java.io.IOException;
import java.util.HashMap;
import org.codehaus.jackson.*;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.map.DeserializationContext;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.jsontype.TypeIdResolver;
import org.codehaus.jackson.type.JavaType;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends TypeDeserializer {

    protected final TypeIdResolver isVariable;

    protected final JavaType isVariable;

    /**
     * isComment
     */
    protected final HashMap<String, JsonDeserializer<Object>> isVariable;

    protected isConstructor(JavaType isParameter, TypeIdResolver isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
        isNameExpr = new HashMap<String, JsonDeserializer<Object>>();
    }

    @Override
    public abstract JsonTypeInfo.As isMethod();

    public String isMethod() {
        return isNameExpr.isMethod().isMethod();
    }

    @Override
    public String isMethod() {
        return null;
    }

    @Override
    public TypeIdResolver isMethod() {
        return isNameExpr;
    }

    /*isComment*/
    protected final JsonDeserializer<Object> isMethod(DeserializationContext isParameter, String isParameter) throws IOException, JsonProcessingException {
        JsonDeserializer<Object> isVariable;
        synchronized (isNameExpr) {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr == null) {
                JavaType isVariable = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr == null) {
                    throw isNameExpr.isMethod(isNameExpr, isNameExpr);
                }
                isNameExpr = isNameExpr.isMethod().isMethod(isNameExpr.isMethod(), isNameExpr, null, null);
                isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
        }
        return isNameExpr;
    }
}
