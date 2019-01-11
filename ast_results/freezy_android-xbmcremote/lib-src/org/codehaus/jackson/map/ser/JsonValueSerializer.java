// isComment
package org.codehaus.jackson.map.ser;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.*;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.schema.SchemaAware;
import org.codehaus.jackson.schema.JsonSchema;
import org.codehaus.jackson.type.JavaType;

/**
 * isComment
 */
public final class isClassOrIsInterface extends SerializerBase<Object> implements ResolvableSerializer, SchemaAware {

    final Method isVariable;

    protected JsonSerializer<Object> isVariable;

    /**
     * isComment
     */
    public isConstructor(Method isParameter, JsonSerializer<Object> isParameter) {
        super(Object.class);
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    public void isMethod(Object isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
        try {
            Object isVariable = isNameExpr.isMethod(isNameExpr);
            JsonSerializer<Object> isVariable;
            if (isNameExpr == null) {
                isNameExpr = isNameExpr.isMethod();
            } else {
                isNameExpr = isNameExpr;
                if (isNameExpr == null) {
                    Class<?> isVariable = isNameExpr.isMethod();
                    /*isComment*/
                    // isComment
                    isNameExpr = isNameExpr.isMethod(isNameExpr, true);
                }
            }
            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        } catch (IOException isParameter) {
            throw isNameExpr;
        } catch (Exception isParameter) {
            Throwable isVariable = isNameExpr;
            // isComment
            while (isNameExpr instanceof InvocationTargetException && isNameExpr.isMethod() != null) {
                isNameExpr = isNameExpr.isMethod();
            }
            // isComment
            if (isNameExpr instanceof Error) {
                throw (Error) isNameExpr;
            }
            // isComment
            throw isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod() + "isStringConstant");
        }
    }

    // isComment
    public JsonNode isMethod(SerializerProvider isParameter, Type isParameter) throws JsonMappingException {
        return (isNameExpr instanceof SchemaAware) ? ((SchemaAware) isNameExpr).isMethod(isNameExpr, null) : isNameExpr.isMethod();
    }

    /*isComment*/
    /**
     * isComment
     */
    public void isMethod(SerializerProvider isParameter) throws JsonMappingException {
        if (isNameExpr == null) {
            // isComment
            if (isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) || isNameExpr.isMethod(isNameExpr.isMethod().isMethod())) {
                JavaType isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
                // isComment
                /*isComment*/
                isNameExpr = isNameExpr.isMethod(isNameExpr, true);
            }
        }
    }

    /*isComment*/
    @Override
    public String isMethod() {
        return "isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod() + "isStringConstant";
    }
}
