// isComment
package org.codehaus.jackson.map.deser;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.*;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends KeyDeserializer {

    final Class<?> isVariable;

    protected isConstructor(Class<?> isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public final Object isMethod(String isParameter, DeserializationContext isParameter) throws IOException, JsonProcessingException {
        if (isNameExpr == null) {
            // isComment
            return null;
        }
        try {
            Object isVariable = isMethod(isNameExpr, isNameExpr);
            if (isNameExpr != null) {
                return isNameExpr;
            }
        } catch (Exception isParameter) {
            throw isNameExpr.isMethod(isNameExpr, isNameExpr, "isStringConstant" + isNameExpr.isMethod());
        }
        throw isNameExpr.isMethod(isNameExpr, isNameExpr, "isStringConstant");
    }

    public Class<?> isMethod() {
        return isNameExpr;
    }

    protected abstract Object isMethod(String isParameter, DeserializationContext isParameter) throws Exception;

    /*isComment*/
    protected int isMethod(String isParameter) throws IllegalArgumentException {
        return isNameExpr.isMethod(isNameExpr);
    }

    protected long isMethod(String isParameter) throws IllegalArgumentException {
        return isNameExpr.isMethod(isNameExpr);
    }

    protected double isMethod(String isParameter) throws IllegalArgumentException {
        return isNameExpr.isMethod(isNameExpr);
    }

    static final class isClassOrIsInterface extends StdKeyDeserializer {

        isConstructor() {
            super(Boolean.class);
        }

        @Override
        public Boolean isMethod(String isParameter, DeserializationContext isParameter) throws JsonMappingException {
            if ("isStringConstant".isMethod(isNameExpr)) {
                return isNameExpr.isFieldAccessExpr;
            }
            if ("isStringConstant".isMethod(isNameExpr)) {
                return isNameExpr.isFieldAccessExpr;
            }
            throw isNameExpr.isMethod(isNameExpr, isNameExpr, "isStringConstant");
        }
    }

    static final class isClassOrIsInterface extends StdKeyDeserializer {

        isConstructor() {
            super(Byte.class);
        }

        @Override
        public Byte isMethod(String isParameter, DeserializationContext isParameter) throws JsonMappingException {
            int isVariable = isMethod(isNameExpr);
            if (isNameExpr < isNameExpr.isFieldAccessExpr || isNameExpr > isNameExpr.isFieldAccessExpr) {
                throw isNameExpr.isMethod(isNameExpr, isNameExpr, "isStringConstant");
            }
            return isNameExpr.isMethod((byte) isNameExpr);
        }
    }

    static final class isClassOrIsInterface extends StdKeyDeserializer {

        isConstructor() {
            super(Integer.class);
        }

        @Override
        public Short isMethod(String isParameter, DeserializationContext isParameter) throws JsonMappingException {
            int isVariable = isMethod(isNameExpr);
            if (isNameExpr < isNameExpr.isFieldAccessExpr || isNameExpr > isNameExpr.isFieldAccessExpr) {
                throw isNameExpr.isMethod(isNameExpr, isNameExpr, "isStringConstant");
            }
            return isNameExpr.isMethod((short) isNameExpr);
        }
    }

    /**
     * isComment
     */
    static final class isClassOrIsInterface extends StdKeyDeserializer {

        isConstructor() {
            super(Character.class);
        }

        @Override
        public Character isMethod(String isParameter, DeserializationContext isParameter) throws JsonMappingException {
            if (isNameExpr.isMethod() == isIntegerConstant) {
                return isNameExpr.isMethod(isNameExpr.isMethod(isIntegerConstant));
            }
            throw isNameExpr.isMethod(isNameExpr, isNameExpr, "isStringConstant");
        }
    }

    static final class isClassOrIsInterface extends StdKeyDeserializer {

        isConstructor() {
            super(Integer.class);
        }

        @Override
        public Integer isMethod(String isParameter, DeserializationContext isParameter) throws JsonMappingException {
            return isMethod(isNameExpr);
        }
    }

    static final class isClassOrIsInterface extends StdKeyDeserializer {

        isConstructor() {
            super(Long.class);
        }

        @Override
        public Long isMethod(String isParameter, DeserializationContext isParameter) throws JsonMappingException {
            return isMethod(isNameExpr);
        }
    }

    static final class isClassOrIsInterface extends StdKeyDeserializer {

        isConstructor() {
            super(Double.class);
        }

        @Override
        public Double isMethod(String isParameter, DeserializationContext isParameter) throws JsonMappingException {
            return isMethod(isNameExpr);
        }
    }

    static final class isClassOrIsInterface extends StdKeyDeserializer {

        isConstructor() {
            super(Float.class);
        }

        @Override
        public Float isMethod(String isParameter, DeserializationContext isParameter) throws JsonMappingException {
            /*isComment*/
            return isNameExpr.isMethod((float) isMethod(isNameExpr));
        }
    }

    static final class isClassOrIsInterface extends StdKeyDeserializer {

        final EnumResolver<?> isVariable;

        isConstructor(EnumResolver<?> isParameter) {
            super(isNameExpr.isMethod());
            isNameExpr = isNameExpr;
        }

        @Override
        public Enum<?> isMethod(String isParameter, DeserializationContext isParameter) throws JsonMappingException {
            Enum<?> isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr == null) {
                throw isNameExpr.isMethod(isNameExpr, isNameExpr, "isStringConstant");
            }
            return isNameExpr;
        }
    }

    /**
     * isComment
     */
    static final class isClassOrIsInterface extends StdKeyDeserializer {

        final Constructor<?> isVariable;

        public isConstructor(Constructor<?> isParameter) {
            super(isNameExpr.isMethod());
            isNameExpr = isNameExpr;
        }

        @Override
        public Object isMethod(String isParameter, DeserializationContext isParameter) throws Exception {
            return isNameExpr.isMethod(isNameExpr);
        }
    }

    /**
     * isComment
     */
    static final class isClassOrIsInterface extends StdKeyDeserializer {

        final Method isVariable;

        public isConstructor(Method isParameter) {
            super(isNameExpr.isMethod());
            isNameExpr = isNameExpr;
        }

        @Override
        public Object isMethod(String isParameter, DeserializationContext isParameter) throws Exception {
            return isNameExpr.isMethod(null, isNameExpr);
        }
    }
}
