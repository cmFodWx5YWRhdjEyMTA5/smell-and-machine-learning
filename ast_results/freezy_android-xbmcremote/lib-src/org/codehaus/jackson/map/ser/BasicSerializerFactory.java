// isComment
package org.codehaus.jackson.map.ser;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.*;
import org.codehaus.jackson.map.*;
import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.codehaus.jackson.map.introspect.Annotated;
import org.codehaus.jackson.map.introspect.AnnotatedClass;
import org.codehaus.jackson.map.introspect.BasicBeanDescription;
import org.codehaus.jackson.map.jsontype.NamedType;
import org.codehaus.jackson.map.jsontype.TypeResolverBuilder;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.map.util.ClassUtil;
import org.codehaus.jackson.map.util.EnumValues;
import org.codehaus.jackson.map.util.Provider;
import org.codehaus.jackson.map.util.SubTypeHelper;
import org.codehaus.jackson.type.JavaType;
import org.codehaus.jackson.util.TokenBuffer;

/**
 * isComment
 */
public class isClassOrIsInterface extends SerializerFactory {

    /*isComment*/
    /**
     * isComment
     */
    static final HashMap<String, JsonSerializer<?>> isVariable = new HashMap<String, JsonSerializer<?>>();

    /**
     * isComment
     */
    static final ArrayList<SerializerMapping> isVariable = new ArrayList<SerializerMapping>();

    static {
        /*isComment*/
        isNameExpr.isMethod(String.class.isMethod(), new StdSerializers.StringSerializer());
        final ToStringSerializer isVariable = isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod(StringBuffer.class.isMethod(), isNameExpr);
        isNameExpr.isMethod(StringBuilder.class.isMethod(), isNameExpr);
        isNameExpr.isMethod(Character.class.isMethod(), isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr);
        // isComment
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(), new StdSerializers.BooleanSerializer(true));
        isNameExpr.isMethod(Boolean.class.isMethod(), new StdSerializers.BooleanSerializer(true));
        final JsonSerializer<?> isVariable = new StdSerializers.IntegerSerializer();
        isNameExpr.isMethod(Integer.class.isMethod(), isNameExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr);
        isNameExpr.isMethod(Long.class.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(Byte.class.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(Short.class.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        // isComment
        isNameExpr.isMethod(Float.class.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(Double.class.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        // isComment
        final JsonSerializer<?> isVariable = new StdSerializers.NumberSerializer();
        isNameExpr.isMethod(BigInteger.class.isMethod(), isNameExpr);
        isNameExpr.isMethod(BigDecimal.class.isMethod(), isNameExpr);
        /*isComment*/
        isNameExpr.isMethod(Calendar.class.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(java.util.Date.class.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(java.sql.Date.class.isMethod(), new StdSerializers.SqlDateSerializer());
        isNameExpr.isMethod(java.sql.Time.class.isMethod(), new StdSerializers.SqlTimeSerializer());
        // isComment
        isNameExpr.isMethod(java.sql.Timestamp.class.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        // isComment
        isNameExpr.isMethod(boolean[].class.isMethod(), new ArraySerializers.BooleanArraySerializer());
        isNameExpr.isMethod(byte[].class.isMethod(), new ArraySerializers.ByteArraySerializer());
        isNameExpr.isMethod(char[].class.isMethod(), new ArraySerializers.CharArraySerializer());
        isNameExpr.isMethod(short[].class.isMethod(), new ArraySerializers.ShortArraySerializer());
        isNameExpr.isMethod(int[].class.isMethod(), new ArraySerializers.IntArraySerializer());
        isNameExpr.isMethod(long[].class.isMethod(), new ArraySerializers.LongArraySerializer());
        isNameExpr.isMethod(float[].class.isMethod(), new ArraySerializers.FloatArraySerializer());
        isNameExpr.isMethod(double[].class.isMethod(), new ArraySerializers.DoubleArraySerializer());
        isNameExpr.isMethod(Object[].class.isMethod(), isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        isNameExpr.isMethod(String[].class.isMethod(), new ArraySerializers.StringArraySerializer());
        // isComment
        final ContainerSerializers.IndexedListSerializer isVariable = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        final ContainerSerializers.CollectionSerializer isVariable = isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        isNameExpr.isMethod(ArrayList.class.isMethod(), isNameExpr);
        isNameExpr.isMethod(Vector.class.isMethod(), isNameExpr);
        isNameExpr.isMethod(LinkedList.class.isMethod(), isNameExpr);
        // isComment
        // isComment
        final MapSerializer isVariable = isNameExpr.isFieldAccessExpr;
        isNameExpr.isMethod(HashMap.class.isMethod(), isNameExpr);
        isNameExpr.isMethod(Hashtable.class.isMethod(), isNameExpr);
        isNameExpr.isMethod(LinkedHashMap.class.isMethod(), isNameExpr);
        isNameExpr.isMethod(TreeMap.class.isMethod(), isNameExpr);
        isNameExpr.isMethod(Properties.class.isMethod(), isNameExpr);
        isNameExpr.isMethod(HashSet.class.isMethod(), isNameExpr);
        isNameExpr.isMethod(LinkedHashSet.class.isMethod(), isNameExpr);
        isNameExpr.isMethod(TreeSet.class.isMethod(), isNameExpr);
        // isComment
        for (Map.Entry<Class<?>, JsonSerializer<?>> isVariable : new JdkSerializers().isMethod()) {
            isNameExpr.isMethod(isNameExpr.isMethod().isMethod(), isNameExpr.isMethod());
        }
        // isComment
        // isComment
        isNameExpr.isMethod(TokenBuffer.class.isMethod(), new StdSerializers.TokenBufferSerializer());
    }

    static {
        /*isComment*/
        for (String isVariable : new String[] { "isStringConstant", "isStringConstant" }) {
            Object isVariable = null;
            try {
                isNameExpr = isNameExpr.isMethod(isNameExpr).isMethod();
            } catch (LinkageError isParameter) {
            }// isComment
             catch (Exception isParameter) {
            }
            if (isNameExpr != null) {
                @SuppressWarnings("isStringConstant")
                Provider<Map.Entry<Class<?>, JsonSerializer<?>>> isVariable = (Provider<Map.Entry<Class<?>, JsonSerializer<?>>>) isNameExpr;
                for (Map.Entry<Class<?>, JsonSerializer<?>> isVariable : isNameExpr.isMethod()) {
                    /*isComment*/
                    Class<?> isVariable = isNameExpr.isMethod();
                    if (isNameExpr.isMethod(isNameExpr)) {
                        isNameExpr.isMethod(isNameExpr.isMethod().isMethod(), isNameExpr.isMethod());
                    } else {
                        isNameExpr.isMethod(new SerializerMapping(isNameExpr, isNameExpr.isMethod()));
                    }
                }
            }
        }
    }

    /*isComment*/
    /**
     * isComment
     */
    public static final BasicSerializerFactory isVariable = new BasicSerializerFactory();

    /**
     * isComment
     */
    protected isConstructor() {
    }

    /*isComment*/
    /**
     * isComment
     */
    @Override
    @SuppressWarnings("isStringConstant")
    public <T> JsonSerializer<T> isMethod(Class<T> isParameter, SerializationConfig isParameter) {
        return (JsonSerializer<T>) isMethod(isNameExpr.isMethod(isNameExpr), isNameExpr);
    }

    @Override
    @SuppressWarnings("isStringConstant")
    public JsonSerializer<Object> isMethod(JavaType isParameter, SerializationConfig isParameter) {
        /*isComment*/
        BasicBeanDescription isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
        JsonSerializer<?> isVariable = isMethod(isNameExpr, isNameExpr.isMethod());
        if (isNameExpr == null) {
            // isComment
            isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr);
            if (isNameExpr == null) {
                /*isComment*/
                isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr);
                if (isNameExpr == null) {
                    // isComment
                    isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr);
                }
            }
        }
        return (JsonSerializer<Object>) isNameExpr;
    }

    /**
     * isComment
     */
    @Override
    public TypeSerializer isMethod(JavaType isParameter, SerializationConfig isParameter) {
        BasicBeanDescription isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
        AnnotatedClass isVariable = isNameExpr.isMethod();
        AnnotationIntrospector isVariable = isNameExpr.isMethod();
        TypeResolverBuilder<?> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        /*isComment*/
        Collection<NamedType> isVariable = null;
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        } else {
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
        return (isNameExpr == null) ? null : isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    /*isComment*/
    public final JsonSerializer<?> isMethod() {
        return isNameExpr.isFieldAccessExpr;
    }

    /*isComment*/
    /**
     * isComment
     */
    public final JsonSerializer<?> isMethod(JavaType isParameter, SerializationConfig isParameter, BasicBeanDescription isParameter) {
        JsonSerializer<?> isVariable = isNameExpr.isMethod(isNameExpr.isMethod().isMethod());
        /*isComment*/
        if (isNameExpr != null) {
            if (isNameExpr == isNameExpr.isFieldAccessExpr) {
                return isMethod(isNameExpr, isNameExpr, isNameExpr);
            }
            if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                return isMethod(isNameExpr, isNameExpr, isNameExpr);
            }
            if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                return isMethod(isNameExpr, isNameExpr, isNameExpr);
            }
            if (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                return isMethod(isNameExpr, isNameExpr, isNameExpr);
            }
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    @SuppressWarnings("isStringConstant")
    public final JsonSerializer<?> isMethod(JavaType isParameter, SerializationConfig isParameter, BasicBeanDescription isParameter) {
        Class<?> isVariable = isNameExpr.isMethod();
        /*isComment*/
        if (JsonSerializable.class.isMethod(isNameExpr)) {
            return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        }
        if (Map.class.isMethod(isNameExpr)) {
            if (EnumMap.class.isMethod(isNameExpr)) {
                return isMethod(isNameExpr, isNameExpr, isNameExpr);
            }
            return isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
        if (Object[].class.isMethod(isNameExpr)) {
            return isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
        if (List.class.isMethod(isNameExpr)) {
            if (isNameExpr == List.class || isNameExpr == AbstractList.class || RandomAccess.class.isMethod(isNameExpr)) {
                return isMethod(isNameExpr, isNameExpr, isNameExpr);
            }
            return isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
        if (Number.class.isMethod(isNameExpr)) {
            return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        }
        if (Enum.class.isMethod(isNameExpr)) {
            @SuppressWarnings("isStringConstant")
            Class<Enum<?>> isVariable = (Class<Enum<?>>) isNameExpr;
            return isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        }
        if (Calendar.class.isMethod(isNameExpr)) {
            return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        }
        if (java.util.Date.class.isMethod(isNameExpr)) {
            return isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        }
        for (int isVariable = isIntegerConstant, isVariable = isNameExpr.isMethod(); isNameExpr < isNameExpr; ++isNameExpr) {
            SerializerMapping isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr.isMethod(isNameExpr)) {
                return isNameExpr.isMethod();
            }
        }
        if (Collection.class.isMethod(isNameExpr)) {
            if (EnumSet.class.isMethod(isNameExpr)) {
                return isMethod(isNameExpr, isNameExpr, isNameExpr);
            }
            return isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
        return null;
    }

    /**
     * isComment
     */
    public final JsonSerializer<?> isMethod(JavaType isParameter, SerializationConfig isParameter, BasicBeanDescription isParameter) {
        Class<?> isVariable = isNameExpr.isMethod();
        // isComment
        if (Iterator.class.isMethod(isNameExpr)) {
            return isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
        if (Iterable.class.isMethod(isNameExpr)) {
            return isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
        if (CharSequence.class.isMethod(isNameExpr)) {
            return isNameExpr.isFieldAccessExpr;
        }
        return null;
    }

    /**
     * isComment
     */
    @SuppressWarnings("isStringConstant")
    protected JsonSerializer<Object> isMethod(SerializationConfig isParameter, Annotated isParameter) {
        Object isVariable = isNameExpr.isMethod().isMethod(isNameExpr);
        if (isNameExpr != null) {
            if (isNameExpr instanceof JsonSerializer) {
                return (JsonSerializer<Object>) isNameExpr;
            }
            /*isComment*/
            if (!(isNameExpr instanceof Class)) {
                throw new IllegalStateException("isStringConstant" + isNameExpr.isMethod().isMethod() + "isStringConstant");
            }
            Class<?> isVariable = (Class<?>) isNameExpr;
            if (!JsonSerializer.class.isMethod(isNameExpr)) {
                throw new IllegalStateException("isStringConstant" + isNameExpr.isMethod() + "isStringConstant");
            }
            return (JsonSerializer<Object>) isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
        }
        return null;
    }

    /**
     * isComment
     */
    protected JsonSerializer<?> isMethod(JavaType isParameter, SerializationConfig isParameter, BasicBeanDescription isParameter) {
        AnnotationIntrospector isVariable = isNameExpr.isMethod();
        boolean isVariable = isMethod(isNameExpr, isNameExpr);
        JavaType isVariable = isNameExpr.isMethod();
        TypeSerializer isVariable = isMethod(isNameExpr, isNameExpr);
        return isNameExpr.isMethod(isNameExpr.isMethod(isNameExpr.isMethod()), isNameExpr, isNameExpr, isNameExpr);
    }

    protected JsonSerializer<?> isMethod(JavaType isParameter, SerializationConfig isParameter, BasicBeanDescription isParameter) {
        JavaType isVariable = isNameExpr.isMethod();
        JavaType isVariable = isNameExpr.isMethod();
        // isComment
        EnumValues isVariable = null;
        if (isNameExpr.isMethod()) {
            // isComment
            @SuppressWarnings("isStringConstant")
            Class<Enum<?>> isVariable = (Class<Enum<?>>) isNameExpr.isMethod();
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        }
        TypeSerializer isVariable = isMethod(isNameExpr, isNameExpr);
        return new EnumMapSerializer(isNameExpr, isMethod(isNameExpr, isNameExpr), isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    protected JsonSerializer<?> isMethod(JavaType isParameter, SerializationConfig isParameter, BasicBeanDescription isParameter) {
        JavaType isVariable = isNameExpr.isMethod();
        TypeSerializer isVariable = isMethod(isNameExpr, isNameExpr);
        return isNameExpr.isMethod(isNameExpr, isMethod(isNameExpr, isNameExpr), isNameExpr);
    }

    protected JsonSerializer<?> isMethod(JavaType isParameter, SerializationConfig isParameter, BasicBeanDescription isParameter) {
        JavaType isVariable = isNameExpr.isMethod();
        TypeSerializer isVariable = isMethod(isNameExpr, isNameExpr);
        return isNameExpr.isMethod(isNameExpr, isMethod(isNameExpr, isNameExpr), isNameExpr);
    }

    protected JsonSerializer<?> isMethod(JavaType isParameter, SerializationConfig isParameter, BasicBeanDescription isParameter) {
        JavaType isVariable = isNameExpr.isMethod();
        TypeSerializer isVariable = isMethod(isNameExpr, isNameExpr);
        return isNameExpr.isMethod(isNameExpr, isMethod(isNameExpr, isNameExpr), isNameExpr);
    }

    protected JsonSerializer<?> isMethod(JavaType isParameter, SerializationConfig isParameter, BasicBeanDescription isParameter) {
        // isComment
        JavaType isVariable = isNameExpr.isMethod(isIntegerConstant);
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod(Object.class);
        }
        TypeSerializer isVariable = isMethod(isNameExpr, isNameExpr);
        return isNameExpr.isMethod(isNameExpr, isMethod(isNameExpr, isNameExpr), isNameExpr);
    }

    protected JsonSerializer<?> isMethod(JavaType isParameter, SerializationConfig isParameter, BasicBeanDescription isParameter) {
        // isComment
        JavaType isVariable = isNameExpr.isMethod(isIntegerConstant);
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod(Object.class);
        }
        TypeSerializer isVariable = isMethod(isNameExpr, isNameExpr);
        return isNameExpr.isMethod(isNameExpr, isMethod(isNameExpr, isNameExpr), isNameExpr);
    }

    protected JsonSerializer<?> isMethod(JavaType isParameter, SerializationConfig isParameter, BasicBeanDescription isParameter) {
        // isComment
        JavaType isVariable = isNameExpr.isMethod();
        // isComment
        if (!isNameExpr.isMethod()) {
            isNameExpr = null;
        }
        return isNameExpr.isMethod(isNameExpr);
    }

    /**
     * isComment
     */
    protected boolean isMethod(SerializationConfig isParameter, BasicBeanDescription isParameter) {
        JsonSerialize.Typing isVariable = isNameExpr.isMethod().isMethod(isNameExpr.isMethod());
        if (isNameExpr != null) {
            return (isNameExpr == isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        }
        return isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
    }

    private static final class isClassOrIsInterface {

        final Class<?> isVariable;

        final JsonSerializer<?> isVariable;

        public isConstructor(Class<?> isParameter, JsonSerializer<?> isParameter) {
            isNameExpr = isNameExpr;
            isNameExpr = isNameExpr;
        }

        public boolean isMethod(Class<?> isParameter) {
            return isNameExpr.isMethod(isNameExpr);
        }

        public JsonSerializer<?> isMethod() {
            return isNameExpr;
        }
    }
}
