// isComment
package org.codehaus.jackson.map.ser;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Calendar;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.*;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.node.ObjectNode;
import org.codehaus.jackson.schema.JsonSerializableSchema;
import org.codehaus.jackson.util.TokenBuffer;

/**
 * isComment
 */
public class isClassOrIsInterface {

    protected isConstructor() {
    }

    /**
     * isComment
     */
    protected abstract static class isClassOrIsInterface<T> extends ScalarSerializerBase<T> {

        protected isConstructor(Class<T> isParameter) {
            super(isNameExpr);
        }

        @Override
        public final void isMethod(T isParameter, JsonGenerator isParameter, SerializerProvider isParameter, TypeSerializer isParameter) throws IOException, JsonGenerationException {
            // isComment
            isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
    }

    /**
     * isComment
     */
    public static final class isClassOrIsInterface extends NonTypedScalarSerializer<Boolean> {

        /**
         * isComment
         */
        final boolean isVariable;

        public isConstructor(boolean isParameter) {
            super(Boolean.class);
            isNameExpr = isNameExpr;
        }

        @Override
        public void isMethod(Boolean isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }

        @Override
        public JsonNode isMethod(SerializerProvider isParameter, Type isParameter) throws JsonMappingException {
            /*isComment*/
            return isMethod("isStringConstant", !isNameExpr);
        }
    }

    /**
     * isComment
     */
    public static final class isClassOrIsInterface extends NonTypedScalarSerializer<String> {

        public isConstructor() {
            super(String.class);
        }

        @Override
        public void isMethod(String isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
            isNameExpr.isMethod(isNameExpr);
        }

        @Override
        public JsonNode isMethod(SerializerProvider isParameter, Type isParameter) {
            return isMethod("isStringConstant", true);
        }
    }

    /**
     * isComment
     */
    public static final class isClassOrIsInterface extends NonTypedScalarSerializer<Integer> {

        public isConstructor() {
            super(Integer.class);
        }

        @Override
        public void isMethod(Integer isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }

        @Override
        public JsonNode isMethod(SerializerProvider isParameter, Type isParameter) throws JsonMappingException {
            return isMethod("isStringConstant", true);
        }
    }

    /**
     * isComment
     */
    public static final class isClassOrIsInterface extends ScalarSerializerBase<Number> {

        static final IntLikeSerializer isVariable = new IntLikeSerializer();

        public isConstructor() {
            super(Number.class);
        }

        @Override
        public void isMethod(Number isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }

        @Override
        public JsonNode isMethod(SerializerProvider isParameter, Type isParameter) throws JsonMappingException {
            return isMethod("isStringConstant", true);
        }
    }

    public static final class isClassOrIsInterface extends ScalarSerializerBase<Long> {

        static final LongSerializer isVariable = new LongSerializer();

        public isConstructor() {
            super(Long.class);
        }

        @Override
        public void isMethod(Long isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }

        @Override
        public JsonNode isMethod(SerializerProvider isParameter, Type isParameter) {
            return isMethod("isStringConstant", true);
        }
    }

    public static final class isClassOrIsInterface extends ScalarSerializerBase<Float> {

        static final FloatSerializer isVariable = new FloatSerializer();

        public isConstructor() {
            super(Float.class);
        }

        @Override
        public void isMethod(Float isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }

        @Override
        public JsonNode isMethod(SerializerProvider isParameter, Type isParameter) {
            return isMethod("isStringConstant", true);
        }
    }

    /**
     * isComment
     */
    public static final class isClassOrIsInterface extends NonTypedScalarSerializer<Double> {

        static final DoubleSerializer isVariable = new DoubleSerializer();

        public isConstructor() {
            super(Double.class);
        }

        @Override
        public void isMethod(Double isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }

        @Override
        public JsonNode isMethod(SerializerProvider isParameter, Type isParameter) {
            return isMethod("isStringConstant", true);
        }
    }

    /**
     * isComment
     */
    public static final class isClassOrIsInterface extends ScalarSerializerBase<Number> {

        public static final NumberSerializer isVariable = new NumberSerializer();

        public isConstructor() {
            super(Number.class);
        }

        @Override
        public void isMethod(Number isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
            /*isComment*/
            if (isNameExpr instanceof Double) {
                isNameExpr.isMethod(((Double) isNameExpr).isMethod());
            } else if (isNameExpr instanceof Float) {
                isNameExpr.isMethod(((Float) isNameExpr).isMethod());
            } else {
                // isComment
                isNameExpr.isMethod(isNameExpr.isMethod());
            }
        }

        @Override
        public JsonNode isMethod(SerializerProvider isParameter, Type isParameter) {
            return isMethod("isStringConstant", true);
        }
    }

    /**
     * isComment
     */
    public static final class isClassOrIsInterface extends ScalarSerializerBase<Calendar> {

        public static final CalendarSerializer isVariable = new CalendarSerializer();

        public isConstructor() {
            super(Calendar.class);
        }

        @Override
        public void isMethod(Calendar isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
            isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
        }

        @Override
        public JsonNode isMethod(SerializerProvider isParameter, Type isParameter) {
            // isComment
            return isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) ? "isStringConstant" : "isStringConstant", true);
        }
    }

    /**
     * isComment
     */
    public static final class isClassOrIsInterface extends ScalarSerializerBase<java.util.Date> {

        public static final UtilDateSerializer isVariable = new UtilDateSerializer();

        public isConstructor() {
            super(java.util.Date.class);
        }

        @Override
        public void isMethod(java.util.Date isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }

        @Override
        public JsonNode isMethod(SerializerProvider isParameter, Type isParameter) throws JsonMappingException {
            // isComment
            return isMethod(isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr) ? "isStringConstant" : "isStringConstant", true);
        }
    }

    /**
     * isComment
     */
    public static final class isClassOrIsInterface extends ScalarSerializerBase<java.sql.Date> {

        public isConstructor() {
            super(java.sql.Date.class);
        }

        @Override
        public void isMethod(java.sql.Date isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }

        @Override
        public JsonNode isMethod(SerializerProvider isParameter, Type isParameter) {
            // isComment
            return isMethod("isStringConstant", true);
        }
    }

    public static final class isClassOrIsInterface extends ScalarSerializerBase<java.sql.Time> {

        public isConstructor() {
            super(java.sql.Time.class);
        }

        @Override
        public void isMethod(java.sql.Time isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
            isNameExpr.isMethod(isNameExpr.isMethod());
        }

        @Override
        public JsonNode isMethod(SerializerProvider isParameter, Type isParameter) {
            return isMethod("isStringConstant", true);
        }
    }

    /**
     * isComment
     */
    @SuppressWarnings("isStringConstant")
    public static final class isClassOrIsInterface extends SerializerBase<JsonSerializable> {

        static final SerializableSerializer isVariable = new SerializableSerializer();

        private isConstructor() {
            super(JsonSerializable.class);
        }

        @Override
        public void isMethod(JsonSerializable isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }

        @Override
        public final void isMethod(JsonSerializable isParameter, JsonGenerator isParameter, SerializerProvider isParameter, TypeSerializer isParameter) throws IOException, JsonGenerationException {
            /*isComment*/
            if (isNameExpr instanceof JsonSerializableWithType) {
                ((JsonSerializableWithType) isNameExpr).isMethod(isNameExpr, isNameExpr, isNameExpr);
            } else {
                this.isMethod(isNameExpr, isNameExpr, isNameExpr);
            }
        }

        @Override
        public JsonNode isMethod(SerializerProvider isParameter, Type isParameter) throws JsonMappingException {
            ObjectNode isVariable = isMethod();
            String isVariable = "isStringConstant";
            String isVariable = null;
            String isVariable = null;
            if (isNameExpr != null) {
                Class<?> isVariable = isNameExpr.isMethod(isNameExpr).isMethod();
                if (isNameExpr.isMethod(JsonSerializableSchema.class)) {
                    JsonSerializableSchema isVariable = isNameExpr.isMethod(JsonSerializableSchema.class);
                    isNameExpr = isNameExpr.isMethod();
                    if (!"isStringConstant".isMethod(isNameExpr.isMethod())) {
                        isNameExpr = isNameExpr.isMethod();
                    }
                    if (!"isStringConstant".isMethod(isNameExpr.isMethod())) {
                        isNameExpr = isNameExpr.isMethod();
                    }
                }
            }
            isNameExpr.isMethod("isStringConstant", isNameExpr);
            if (isNameExpr != null) {
                try {
                    isNameExpr.isMethod("isStringConstant", new ObjectMapper().isMethod(isNameExpr, JsonNode.class));
                } catch (IOException isParameter) {
                    throw new IllegalStateException(isNameExpr);
                }
            }
            if (isNameExpr != null) {
                try {
                    isNameExpr.isMethod("isStringConstant", new ObjectMapper().isMethod(isNameExpr, JsonNode.class));
                } catch (IOException isParameter) {
                    throw new IllegalStateException(isNameExpr);
                }
            }
            isNameExpr.isMethod("isStringConstant", true);
            return isNameExpr;
        }
    }

    /**
     * isComment
     */
    public static final class isClassOrIsInterface extends SerializerBase<TokenBuffer> {

        public isConstructor() {
            super(TokenBuffer.class);
        }

        @Override
        public void isMethod(TokenBuffer isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
            isNameExpr.isMethod(isNameExpr);
        }

        /**
         * isComment
         */
        @Override
        public final void isMethod(TokenBuffer isParameter, JsonGenerator isParameter, SerializerProvider isParameter, TypeSerializer isParameter) throws IOException, JsonGenerationException {
            isMethod(isNameExpr, isNameExpr, isNameExpr);
        }

        @Override
        public JsonNode isMethod(SerializerProvider isParameter, Type isParameter) {
            /*isComment*/
            return isMethod("isStringConstant", true);
        }
    }
}
