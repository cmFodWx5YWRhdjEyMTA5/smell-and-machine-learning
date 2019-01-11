// isComment
package org.codehaus.jackson.map.ser;

import java.io.IOException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.*;
import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonGenerator;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.*;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.node.ObjectNode;
import org.codehaus.jackson.schema.JsonSchema;
import org.codehaus.jackson.schema.SchemaAware;
import org.codehaus.jackson.type.JavaType;

/**
 * isComment
 */
public final class isClassOrIsInterface {

    private isConstructor() {
    }

    /*isComment*/
    public static ContainerSerializerBase<?> isMethod(JavaType isParameter, boolean isParameter, TypeSerializer isParameter) {
        return new IndexedListSerializer(isNameExpr, isNameExpr, isNameExpr);
    }

    public static ContainerSerializerBase<?> isMethod(JavaType isParameter, boolean isParameter, TypeSerializer isParameter) {
        return new CollectionSerializer(isNameExpr, isNameExpr, isNameExpr);
    }

    public static ContainerSerializerBase<?> isMethod(JavaType isParameter, boolean isParameter, TypeSerializer isParameter) {
        return new IteratorSerializer(isNameExpr, isNameExpr, isNameExpr);
    }

    public static ContainerSerializerBase<?> isMethod(JavaType isParameter, boolean isParameter, TypeSerializer isParameter) {
        return new IterableSerializer(isNameExpr, isNameExpr, isNameExpr);
    }

    public static JsonSerializer<?> isMethod(JavaType isParameter) {
        return new EnumSetSerializer(isNameExpr);
    }

    /**
     * isComment
     */
    private abstract static class isClassOrIsInterface<T> extends ContainerSerializerBase<T> implements ResolvableSerializer {

        protected final boolean isVariable;

        protected final JavaType isVariable;

        /**
         * isComment
         */
        protected final TypeSerializer isVariable;

        /**
         * isComment
         */
        protected JsonSerializer<Object> isVariable;

        protected isConstructor(Class<?> isParameter, JavaType isParameter, boolean isParameter, TypeSerializer isParameter) {
            // isComment
            super(isNameExpr, true);
            isNameExpr = isNameExpr;
            // isComment
            isNameExpr = isNameExpr || (isNameExpr != null && isNameExpr.isMethod());
            isNameExpr = isNameExpr;
        }

        @Override
        public final void isMethod(T isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
            isNameExpr.isMethod();
            isMethod(isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod();
        }

        @Override
        public final void isMethod(T isParameter, JsonGenerator isParameter, SerializerProvider isParameter, TypeSerializer isParameter) throws IOException, JsonGenerationException {
            isNameExpr.isMethod(isNameExpr, isNameExpr);
            isMethod(isNameExpr, isNameExpr, isNameExpr);
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }

        protected abstract void isMethod(T isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException;

        @Override
        public JsonNode isMethod(SerializerProvider isParameter, Type isParameter) throws JsonMappingException {
            /*isComment*/
            ObjectNode isVariable = isMethod("isStringConstant", true);
            JavaType isVariable = null;
            if (isNameExpr != null) {
                JavaType isVariable = isNameExpr.isMethod(isNameExpr);
                isNameExpr = isNameExpr.isMethod();
                if (isNameExpr == null) {
                    // isComment
                    if (isNameExpr instanceof ParameterizedType) {
                        Type[] isVariable = ((ParameterizedType) isNameExpr).isMethod();
                        if (isNameExpr.isFieldAccessExpr == isIntegerConstant) {
                            isNameExpr = isNameExpr.isMethod(isNameExpr[isIntegerConstant]);
                        }
                    }
                }
            }
            if (isNameExpr == null && isNameExpr != null) {
                isNameExpr = isNameExpr;
            }
            if (isNameExpr != null) {
                JsonSerializer<Object> isVariable = isNameExpr.isMethod(isNameExpr);
                JsonNode isVariable = (isNameExpr instanceof SchemaAware) ? ((SchemaAware) isNameExpr).isMethod(isNameExpr, null) : isNameExpr.isMethod();
                isNameExpr.isMethod("isStringConstant", isNameExpr);
            }
            return isNameExpr;
        }

        /**
         * isComment
         */
        // isComment
        public void isMethod(SerializerProvider isParameter) throws JsonMappingException {
            if (isNameExpr && isNameExpr != null) {
                isNameExpr = isNameExpr.isMethod(isNameExpr);
            }
        }
    }

    /**
     * isComment
     */
    public static class isClassOrIsInterface extends AsArraySerializer<List<?>> {

        public static final IndexedListSerializer isVariable = new IndexedListSerializer(null, true, null);

        public isConstructor(JavaType isParameter, boolean isParameter, TypeSerializer isParameter) {
            super(List.class, isNameExpr, isNameExpr, isNameExpr);
        }

        @Override
        public ContainerSerializerBase<?> isMethod(TypeSerializer isParameter) {
            return new IndexedListSerializer(isNameExpr, isNameExpr, isNameExpr);
        }

        @Override
        public void isMethod(List<?> isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
            if (isNameExpr != null) {
                isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
                return;
            }
            if (isNameExpr != null) {
                isMethod(isNameExpr, isNameExpr, isNameExpr);
                return;
            }
            final int isVariable = isNameExpr.isMethod();
            if (isNameExpr > isIntegerConstant) {
                JsonSerializer<Object> isVariable = null;
                Class<?> isVariable = null;
                for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; ++isNameExpr) {
                    Object isVariable = isNameExpr.isMethod(isNameExpr);
                    try {
                        if (isNameExpr == null) {
                            isNameExpr.isMethod().isMethod(null, isNameExpr, isNameExpr);
                        } else {
                            // isComment
                            Class<?> isVariable = isNameExpr.isMethod();
                            JsonSerializer<Object> isVariable;
                            if (isNameExpr == isNameExpr) {
                                isNameExpr = isNameExpr;
                            } else {
                                isNameExpr = isNameExpr.isMethod(isNameExpr);
                                isNameExpr = isNameExpr;
                                isNameExpr = isNameExpr;
                            }
                            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                        }
                    } catch (Exception isParameter) {
                        // isComment
                        isMethod(isNameExpr, isNameExpr, isNameExpr);
                    }
                }
            }
        }

        public void isMethod(List<?> isParameter, JsonGenerator isParameter, SerializerProvider isParameter, JsonSerializer<Object> isParameter) throws IOException, JsonGenerationException {
            final int isVariable = isNameExpr.isMethod();
            if (isNameExpr > isIntegerConstant) {
                final TypeSerializer isVariable = isNameExpr;
                for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; ++isNameExpr) {
                    Object isVariable = isNameExpr.isMethod(isNameExpr);
                    try {
                        if (isNameExpr == null) {
                            isNameExpr.isMethod().isMethod(null, isNameExpr, isNameExpr);
                        } else if (isNameExpr == null) {
                            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                        } else {
                            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
                        }
                    } catch (Exception isParameter) {
                        // isComment
                        isMethod(isNameExpr, isNameExpr, isNameExpr);
                    }
                }
            }
        }

        public void isMethod(List<?> isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
            final int isVariable = isNameExpr.isMethod();
            if (isNameExpr > isIntegerConstant) {
                JsonSerializer<Object> isVariable = null;
                Class<?> isVariable = null;
                final TypeSerializer isVariable = isNameExpr;
                for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; ++isNameExpr) {
                    Object isVariable = isNameExpr.isMethod(isNameExpr);
                    try {
                        if (isNameExpr == null) {
                            isNameExpr.isMethod().isMethod(null, isNameExpr, isNameExpr);
                        } else {
                            Class<?> isVariable = isNameExpr.isMethod();
                            JsonSerializer<Object> isVariable;
                            if (isNameExpr == isNameExpr) {
                                isNameExpr = isNameExpr;
                            } else {
                                isNameExpr = isNameExpr.isMethod(isNameExpr);
                                isNameExpr = isNameExpr;
                                isNameExpr = isNameExpr;
                            }
                            isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
                        }
                    } catch (Exception isParameter) {
                        // isComment
                        isMethod(isNameExpr, isNameExpr, isNameExpr);
                    }
                }
            }
        }
    }

    /**
     * isComment
     */
    public static class isClassOrIsInterface extends AsArraySerializer<Collection<?>> {

        public static final CollectionSerializer isVariable = new CollectionSerializer(null, true, null);

        public isConstructor(JavaType isParameter, boolean isParameter, TypeSerializer isParameter) {
            super(Collection.class, isNameExpr, isNameExpr, isNameExpr);
        }

        @Override
        public ContainerSerializerBase<?> isMethod(TypeSerializer isParameter) {
            return new CollectionSerializer(isNameExpr, isNameExpr, isNameExpr);
        }

        @Override
        public void isMethod(Collection<?> isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
            if (isNameExpr != null) {
                isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
                return;
            }
            Iterator<?> isVariable = isNameExpr.isMethod();
            if (isNameExpr.isMethod()) {
                JsonSerializer<Object> isVariable = null;
                Class<?> isVariable = null;
                TypeSerializer isVariable = isNameExpr;
                int isVariable = isIntegerConstant;
                do {
                    Object isVariable = isNameExpr.isMethod();
                    try {
                        if (isNameExpr == null) {
                            isNameExpr.isMethod().isMethod(null, isNameExpr, isNameExpr);
                        } else {
                            // isComment
                            Class<?> isVariable = isNameExpr.isMethod();
                            JsonSerializer<Object> isVariable;
                            if (isNameExpr == isNameExpr) {
                                isNameExpr = isNameExpr;
                            } else {
                                isNameExpr = isNameExpr.isMethod(isNameExpr);
                                isNameExpr = isNameExpr;
                                isNameExpr = isNameExpr;
                            }
                            if (isNameExpr == null) {
                                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                            } else {
                                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
                            }
                        }
                    } catch (Exception isParameter) {
                        // isComment
                        isMethod(isNameExpr, isNameExpr, isNameExpr);
                    }
                    ++isNameExpr;
                } while (isNameExpr.isMethod());
            }
        }

        public void isMethod(Collection<?> isParameter, JsonGenerator isParameter, SerializerProvider isParameter, JsonSerializer<Object> isParameter) throws IOException, JsonGenerationException {
            Iterator<?> isVariable = isNameExpr.isMethod();
            if (isNameExpr.isMethod()) {
                TypeSerializer isVariable = isNameExpr;
                int isVariable = isIntegerConstant;
                do {
                    Object isVariable = isNameExpr.isMethod();
                    try {
                        if (isNameExpr == null) {
                            isNameExpr.isMethod().isMethod(null, isNameExpr, isNameExpr);
                        } else {
                            if (isNameExpr == null) {
                                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                            } else {
                                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
                            }
                        }
                        ++isNameExpr;
                    } catch (Exception isParameter) {
                        // isComment
                        isMethod(isNameExpr, isNameExpr, isNameExpr);
                    }
                } while (isNameExpr.isMethod());
            }
        }
    }

    public static class isClassOrIsInterface extends AsArraySerializer<Iterator<?>> {

        public static final IteratorSerializer isVariable = new IteratorSerializer(null, true, null);

        public isConstructor(JavaType isParameter, boolean isParameter, TypeSerializer isParameter) {
            super(Iterator.class, isNameExpr, isNameExpr, isNameExpr);
        }

        @Override
        public ContainerSerializerBase<?> isMethod(TypeSerializer isParameter) {
            return new IteratorSerializer(isNameExpr, isNameExpr, isNameExpr);
        }

        @Override
        public void isMethod(Iterator<?> isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
            if (isNameExpr.isMethod()) {
                JsonSerializer<Object> isVariable = null;
                Class<?> isVariable = null;
                do {
                    Object isVariable = isNameExpr.isMethod();
                    if (isNameExpr == null) {
                        isNameExpr.isMethod().isMethod(null, isNameExpr, isNameExpr);
                    } else {
                        // isComment
                        Class<?> isVariable = isNameExpr.isMethod();
                        JsonSerializer<Object> isVariable;
                        if (isNameExpr == isNameExpr) {
                            isNameExpr = isNameExpr;
                        } else {
                            isNameExpr = isNameExpr.isMethod(isNameExpr);
                            isNameExpr = isNameExpr;
                            isNameExpr = isNameExpr;
                        }
                        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                    }
                } while (isNameExpr.isMethod());
            }
        }
    }

    public static class isClassOrIsInterface extends AsArraySerializer<Iterable<?>> {

        public static final IterableSerializer isVariable = new IterableSerializer(null, true, null);

        public isConstructor(JavaType isParameter, boolean isParameter, TypeSerializer isParameter) {
            super(Iterable.class, isNameExpr, isNameExpr, isNameExpr);
        }

        @Override
        public ContainerSerializerBase<?> isMethod(TypeSerializer isParameter) {
            return new IterableSerializer(isNameExpr, isNameExpr, isNameExpr);
        }

        @Override
        public void isMethod(Iterable<?> isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
            Iterator<?> isVariable = isNameExpr.isMethod();
            if (isNameExpr.isMethod()) {
                JsonSerializer<Object> isVariable = null;
                Class<?> isVariable = null;
                do {
                    Object isVariable = isNameExpr.isMethod();
                    if (isNameExpr == null) {
                        isNameExpr.isMethod().isMethod(null, isNameExpr, isNameExpr);
                    } else {
                        // isComment
                        Class<?> isVariable = isNameExpr.isMethod();
                        JsonSerializer<Object> isVariable;
                        if (isNameExpr == isNameExpr) {
                            isNameExpr = isNameExpr;
                        } else {
                            isNameExpr = isNameExpr.isMethod(isNameExpr);
                            isNameExpr = isNameExpr;
                            isNameExpr = isNameExpr;
                        }
                        isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                    }
                } while (isNameExpr.isMethod());
            }
        }
    }

    public static class isClassOrIsInterface extends AsArraySerializer<EnumSet<? extends Enum<?>>> {

        public isConstructor(JavaType isParameter) {
            super(EnumSet.class, isNameExpr, true, null);
        }

        @Override
        public ContainerSerializerBase<?> isMethod(TypeSerializer isParameter) {
            // isComment
            return this;
        }

        @Override
        public void isMethod(EnumSet<? extends Enum<?>> isParameter, JsonGenerator isParameter, SerializerProvider isParameter) throws IOException, JsonGenerationException {
            JsonSerializer<Object> isVariable = isNameExpr;
            /*isComment*/
            for (Enum<?> isVariable : isNameExpr) {
                if (isNameExpr == null) {
                    /*isComment*/
                    isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod());
                }
                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
            }
        }
    }
}
