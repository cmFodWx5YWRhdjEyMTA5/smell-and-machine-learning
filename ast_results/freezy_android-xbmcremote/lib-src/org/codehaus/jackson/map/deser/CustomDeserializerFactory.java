// isComment
package org.codehaus.jackson.map.deser;

import java.util.*;
import org.codehaus.jackson.type.JavaType;
import org.codehaus.jackson.map.*;
import org.codehaus.jackson.map.type.*;

/**
 * isComment
 */
public class isClassOrIsInterface extends BeanDeserializerFactory {

    /*isComment*/
    /**
     * isComment
     */
    HashMap<ClassKey, JsonDeserializer<Object>> isVariable = null;

    /*isComment*/
    /**
     * isComment
     */
    HashMap<ClassKey, Class<?>> isVariable;

    public isConstructor() {
        super();
    }

    /*isComment*/
    /**
     * isComment
     */
    @SuppressWarnings("isStringConstant")
    public <T> void isMethod(Class<T> isParameter, JsonDeserializer<? extends T> isParameter) {
        ClassKey isVariable = new ClassKey(isNameExpr);
        if (isNameExpr == null) {
            isNameExpr = new HashMap<ClassKey, JsonDeserializer<Object>>();
        }
        isNameExpr.isMethod(isNameExpr, (JsonDeserializer<Object>) isNameExpr);
    }

    /**
     * isComment
     */
    public void isMethod(Class<?> isParameter, Class<?> isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new HashMap<ClassKey, Class<?>>();
        }
        isNameExpr.isMethod(new ClassKey(isNameExpr), isNameExpr);
    }

    /*isComment*/
    @Override
    public JsonDeserializer<Object> isMethod(DeserializationConfig isParameter, JavaType isParameter, DeserializerProvider isParameter) throws JsonMappingException {
        Class<?> isVariable = isNameExpr.isMethod();
        ClassKey isVariable = new ClassKey(isNameExpr);
        // isComment
        if (isNameExpr != null) {
            JsonDeserializer<Object> isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null) {
                return isNameExpr;
            }
        }
        // isComment
        return super.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }

    // isComment
    // isComment
    @Override
    public JsonDeserializer<?> isMethod(DeserializationConfig isParameter, Class<?> isParameter, DeserializerProvider isParameter) throws JsonMappingException {
        /*isComment*/
        if (isNameExpr != null) {
            ClassKey isVariable = new ClassKey(isNameExpr);
            JsonDeserializer<?> isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null) {
                return isNameExpr;
            }
        }
        return super.isMethod(isNameExpr, isNameExpr, isNameExpr);
    }
}
