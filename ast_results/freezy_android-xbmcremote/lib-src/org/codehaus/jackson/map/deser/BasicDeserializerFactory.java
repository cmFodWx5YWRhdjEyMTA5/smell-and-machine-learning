// isComment
package org.codehaus.jackson.map.deser;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;
import java.util.*;
import java.util.concurrent.*;
import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.map.*;
import org.codehaus.jackson.map.introspect.Annotated;
import org.codehaus.jackson.map.introspect.AnnotatedClass;
import org.codehaus.jackson.map.introspect.AnnotatedConstructor;
import org.codehaus.jackson.map.introspect.AnnotatedMember;
import org.codehaus.jackson.map.introspect.AnnotatedMethod;
import org.codehaus.jackson.map.introspect.AnnotatedParameter;
import org.codehaus.jackson.map.introspect.BasicBeanDescription;
import org.codehaus.jackson.map.jsontype.NamedType;
import org.codehaus.jackson.map.jsontype.TypeResolverBuilder;
import org.codehaus.jackson.map.type.*;
import org.codehaus.jackson.map.util.ClassUtil;
import org.codehaus.jackson.map.util.SubTypeHelper;
import org.codehaus.jackson.type.JavaType;

/**
 * isComment
 */
public abstract class isClassOrIsInterface extends DeserializerFactory {

    // isComment
    static final JavaType isVariable = isNameExpr.isMethod(String.class);

    /**
     * isComment
     */
    static final HashMap<JavaType, JsonDeserializer<Object>> isVariable = isNameExpr.isMethod();

    /*isComment*/
    @SuppressWarnings("isStringConstant")
    static final HashMap<String, Class<? extends Map>> isVariable = new HashMap<String, Class<? extends Map>>();

    static {
        isNameExpr.isMethod(Map.class.isMethod(), LinkedHashMap.class);
        isNameExpr.isMethod(ConcurrentMap.class.isMethod(), ConcurrentHashMap.class);
        isNameExpr.isMethod(SortedMap.class.isMethod(), TreeMap.class);
        /*isComment*/
        isNameExpr.isMethod("isStringConstant", TreeMap.class);
        try {
            Class<?> isVariable = isNameExpr.isMethod("isStringConstant");
            Class<?> isVariable = isNameExpr.isMethod("isStringConstant");
            @SuppressWarnings("isStringConstant")
            Class<? extends Map> isVariable = (Class<? extends Map>) isNameExpr;
            isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
        } catch (ClassNotFoundException isParameter) {
        // isComment
        }
    }

    /*isComment*/
    @SuppressWarnings("isStringConstant")
    static final HashMap<String, Class<? extends Collection>> isVariable = new HashMap<String, Class<? extends Collection>>();

    static {
        isNameExpr.isMethod(Collection.class.isMethod(), ArrayList.class);
        isNameExpr.isMethod(List.class.isMethod(), ArrayList.class);
        isNameExpr.isMethod(Set.class.isMethod(), HashSet.class);
        isNameExpr.isMethod(SortedSet.class.isMethod(), TreeSet.class);
        isNameExpr.isMethod(Queue.class.isMethod(), LinkedList.class);
        /*isComment*/
        isNameExpr.isMethod("isStringConstant", LinkedList.class);
        isNameExpr.isMethod("isStringConstant", TreeSet.class);
    }

    /**
     * isComment
     */
    static final HashMap<JavaType, JsonDeserializer<Object>> isVariable = isNameExpr.isMethod();

    protected isConstructor() {
    }

    /*isComment*/
    @Override
    public JsonDeserializer<?> isMethod(DeserializationConfig isParameter, ArrayType isParameter, DeserializerProvider isParameter) throws JsonMappingException {
        JavaType isVariable = isNameExpr.isMethod();
        // isComment
        JsonDeserializer<Object> isVariable = isNameExpr.isMethod();
        if (isNameExpr == null) {
            // isComment
            JsonDeserializer<Object> isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null) {
                return isNameExpr;
            }
            // isComment
            if (isNameExpr.isMethod()) {
                // isComment
                throw new IllegalArgumentException("isStringConstant" + isNameExpr + "isStringConstant");
            }
            // isComment
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, null);
        }
        // isComment
        TypeDeserializer isVariable = isNameExpr.isMethod();
        // isComment
        if (isNameExpr == null) {
            isNameExpr = isMethod(isNameExpr, isNameExpr);
        }
        return new ArrayDeserializer(isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public JsonDeserializer<?> isMethod(DeserializationConfig isParameter, CollectionType isParameter, DeserializerProvider isParameter) throws JsonMappingException {
        Class<?> isVariable = isNameExpr.isMethod();
        BasicBeanDescription isVariable = isNameExpr.isMethod(isNameExpr);
        // isComment
        JsonDeserializer<Object> isVariable = isMethod(isNameExpr, isNameExpr.isMethod());
        if (isNameExpr != null) {
            return isNameExpr;
        }
        // isComment
        isNameExpr = isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr, null);
        JavaType isVariable = isNameExpr.isMethod();
        // isComment
        JsonDeserializer<Object> isVariable = isNameExpr.isMethod();
        if (isNameExpr == null) {
            // isComment
            if (EnumSet.class.isMethod(isNameExpr)) {
                return new EnumSetDeserializer(isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()));
            }
            // isComment
            // isComment
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, null);
        }
        /*isComment*/
        if (isNameExpr.isMethod() || isNameExpr.isMethod()) {
            @SuppressWarnings("isStringConstant")
            Class<? extends Collection> isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
            if (isNameExpr == null) {
                throw new IllegalArgumentException("isStringConstant" + isNameExpr);
            }
            isNameExpr = isNameExpr;
        }
        // isComment
        TypeDeserializer isVariable = isNameExpr.isMethod();
        // isComment
        if (isNameExpr == null) {
            isNameExpr = isMethod(isNameExpr, isNameExpr);
        }
        boolean isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        @SuppressWarnings("isStringConstant")
        Constructor<Collection<Object>> isVariable = isNameExpr.isMethod((Class<Collection<Object>>) isNameExpr, isNameExpr);
        return new CollectionDeserializer(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    @Override
    public JsonDeserializer<?> isMethod(DeserializationConfig isParameter, MapType isParameter, DeserializerProvider isParameter) throws JsonMappingException {
        Class<?> isVariable = isNameExpr.isMethod();
        BasicBeanDescription isVariable = isNameExpr.isMethod(isNameExpr);
        // isComment
        JsonDeserializer<Object> isVariable = isMethod(isNameExpr, isNameExpr.isMethod());
        if (isNameExpr != null) {
            return isNameExpr;
        }
        // isComment
        isNameExpr = isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr, null);
        JavaType isVariable = isNameExpr.isMethod();
        JavaType isVariable = isNameExpr.isMethod();
        // isComment
        @SuppressWarnings("isStringConstant")
        JsonDeserializer<Object> isVariable = (JsonDeserializer<Object>) isNameExpr.isMethod();
        if (isNameExpr == null) {
            // isComment
            // isComment
            isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, null);
        }
        /*isComment*/
        if (EnumMap.class.isMethod(isNameExpr)) {
            return new EnumMapDeserializer(isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr.isMethod()), isNameExpr);
        }
        // isComment
        // isComment
        KeyDeserializer isVariable = (KeyDeserializer) isNameExpr.isMethod();
        if (isNameExpr == null) {
            isNameExpr = (isNameExpr.isMethod(isNameExpr)) ? null : isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        /*isComment*/
        if (isNameExpr.isMethod() || isNameExpr.isMethod()) {
            @SuppressWarnings("isStringConstant")
            Class<? extends Map> isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
            if (isNameExpr == null) {
                throw new IllegalArgumentException("isStringConstant" + isNameExpr);
            }
            isNameExpr = isNameExpr;
            // isComment
            isNameExpr = isNameExpr.isMethod(isNameExpr);
        }
        // isComment
        boolean isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        // isComment
        @SuppressWarnings("isStringConstant")
        Constructor<Map<Object, Object>> isVariable = (Constructor<Map<Object, Object>>) isNameExpr.isMethod();
        if (isNameExpr != null) {
            if (isNameExpr) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
        // isComment
        TypeDeserializer isVariable = isNameExpr.isMethod();
        // isComment
        if (isNameExpr == null) {
            isNameExpr = isMethod(isNameExpr, isNameExpr);
        }
        MapDeserializer isVariable = new MapDeserializer(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        isNameExpr.isMethod(isNameExpr.isMethod().isMethod(isNameExpr.isMethod()));
        isNameExpr.isMethod(isMethod(isNameExpr, isNameExpr));
        return isNameExpr;
    }

    /**
     * isComment
     */
    @Override
    @SuppressWarnings("isStringConstant")
    public JsonDeserializer<?> isMethod(DeserializationConfig isParameter, Class<?> isParameter, DeserializerProvider isParameter) throws JsonMappingException {
        /*isComment*/
        BasicBeanDescription isVariable = isNameExpr.isMethod(isNameExpr);
        JsonDeserializer<Object> isVariable = isMethod(isNameExpr, isNameExpr.isMethod());
        if (isNameExpr != null) {
            return isNameExpr;
        }
        JsonDeserializer<?> isVariable = new EnumDeserializer(isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod()));
        return (JsonDeserializer<Object>) isNameExpr;
    }

    @Override
    public JsonDeserializer<?> isMethod(DeserializationConfig isParameter, Class<? extends JsonNode> isParameter, DeserializerProvider isParameter) throws JsonMappingException {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public JsonDeserializer<Object> isMethod(DeserializationConfig isParameter, JavaType isParameter, DeserializerProvider isParameter) throws JsonMappingException {
        return isNameExpr.isMethod(isNameExpr);
    }

    @Override
    public TypeDeserializer isMethod(DeserializationConfig isParameter, JavaType isParameter) {
        Class<?> isVariable = isNameExpr.isMethod();
        BasicBeanDescription isVariable = isNameExpr.isMethod(isNameExpr);
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
    /**
     * isComment
     */
    public TypeDeserializer isMethod(DeserializationConfig isParameter, JavaType isParameter, AnnotatedMember isParameter) {
        AnnotationIntrospector isVariable = isNameExpr.isMethod();
        TypeResolverBuilder<?> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        // isComment
        if (isNameExpr == null) {
            return isMethod(isNameExpr, isNameExpr);
        }
        // isComment
        Collection<NamedType> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public TypeDeserializer isMethod(DeserializationConfig isParameter, JavaType isParameter, AnnotatedMember isParameter) {
        AnnotationIntrospector isVariable = isNameExpr.isMethod();
        TypeResolverBuilder<?> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        JavaType isVariable = isNameExpr.isMethod();
        // isComment
        if (isNameExpr == null) {
            return isMethod(isNameExpr, isNameExpr);
        }
        // isComment
        Collection<NamedType> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    /*isComment*/
    /**
     * isComment
     */
    protected JsonDeserializer<Object> isMethod(DeserializationConfig isParameter, Annotated isParameter) {
        Object isVariable = isNameExpr.isMethod().isMethod(isNameExpr);
        if (isNameExpr != null) {
            return isMethod(isNameExpr, isNameExpr);
        }
        return null;
    }

    @SuppressWarnings("isStringConstant")
    JsonDeserializer<Object> isMethod(DeserializationConfig isParameter, Object isParameter) {
        if (isNameExpr instanceof JsonDeserializer) {
            return (JsonDeserializer<Object>) isNameExpr;
        }
        /*isComment*/
        if (!(isNameExpr instanceof Class)) {
            throw new IllegalStateException("isStringConstant" + isNameExpr.isMethod().isMethod() + "isStringConstant");
        }
        Class<?> isVariable = (Class<?>) isNameExpr;
        if (!JsonDeserializer.class.isMethod(isNameExpr)) {
            throw new IllegalStateException("isStringConstant" + isNameExpr.isMethod() + "isStringConstant");
        }
        return (JsonDeserializer<Object>) isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr));
    }

    /**
     * isComment
     */
    @SuppressWarnings("isStringConstant")
    protected <T extends JavaType> T isMethod(DeserializationConfig isParameter, Annotated isParameter, T isParameter, String isParameter) throws JsonMappingException {
        // isComment
        AnnotationIntrospector isVariable = isNameExpr.isMethod();
        Class<?> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr != null) {
            try {
                isNameExpr = (T) isNameExpr.isMethod(isNameExpr);
            } catch (IllegalArgumentException isParameter) {
                throw new JsonMappingException("isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod(), null, isNameExpr);
            }
        }
        // isComment
        if (isNameExpr.isMethod()) {
            Class<?> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr);
            if (isNameExpr != null) {
                // isComment
                if (!(isNameExpr instanceof MapType)) {
                    throw new JsonMappingException("isStringConstant" + isNameExpr + "isStringConstant");
                }
                try {
                    isNameExpr = (T) ((MapType) isNameExpr).isMethod(isNameExpr);
                } catch (IllegalArgumentException isParameter) {
                    throw new JsonMappingException("isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod(), null, isNameExpr);
                }
            }
            // isComment
            Class<?> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(), isNameExpr);
            if (isNameExpr != null) {
                try {
                    isNameExpr = (T) isNameExpr.isMethod(isNameExpr);
                } catch (IllegalArgumentException isParameter) {
                    throw new JsonMappingException("isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr.isMethod(), null, isNameExpr);
                }
            }
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    protected JavaType isMethod(DeserializationConfig isParameter, BasicBeanDescription isParameter, Type isParameter, Annotated isParameter) {
        JavaType isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod());
        // isComment
        if (isNameExpr.isMethod()) {
            AnnotationIntrospector isVariable = isNameExpr.isMethod();
            boolean isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
            JavaType isVariable = isNameExpr.isMethod();
            if (isNameExpr != null) {
                Class<? extends KeyDeserializer> isVariable = isNameExpr.isMethod(isNameExpr);
                if (isNameExpr != null && isNameExpr != KeyDeserializer.None.class) {
                    KeyDeserializer isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
                    isNameExpr.isMethod(isNameExpr);
                }
            }
            // isComment
            Class<? extends JsonDeserializer<?>> isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null && isNameExpr != JsonDeserializer.None.class) {
                JsonDeserializer<?> isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
                isNameExpr.isMethod().isMethod(isNameExpr);
            }
            /*isComment*/
            if (isNameExpr instanceof AnnotatedMember) {
                TypeDeserializer isVariable = isMethod(isNameExpr, isNameExpr, (AnnotatedMember) isNameExpr);
                if (isNameExpr != null) {
                    isNameExpr.isMethod().isMethod(isNameExpr);
                }
            }
        }
        TypeDeserializer isVariable;
        if (isNameExpr instanceof AnnotatedMember) {
            // isComment
            isNameExpr = isMethod(isNameExpr, isNameExpr, (AnnotatedMember) isNameExpr);
        } else {
            // isComment
            isNameExpr = isMethod(isNameExpr, isNameExpr);
        }
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr;
    }

    /*isComment*/
    /**
     * isComment
     */
    CreatorContainer isMethod(DeserializationConfig isParameter, BasicBeanDescription isParameter) throws JsonMappingException {
        Class<?> isVariable = isNameExpr.isMethod();
        AnnotationIntrospector isVariable = isNameExpr.isMethod();
        boolean isVariable = isNameExpr.isMethod(isNameExpr.isFieldAccessExpr.isFieldAccessExpr);
        CreatorContainer isVariable = new CreatorContainer(isNameExpr, isNameExpr);
        // isComment
        for (AnnotatedConstructor isVariable : isNameExpr.isMethod()) {
            int isVariable = isNameExpr.isMethod();
            if (isNameExpr < isIntegerConstant || !isNameExpr.isMethod(isNameExpr)) {
                // isComment
                continue;
            }
            // isComment
            SettableBeanProperty[] isVariable = new SettableBeanProperty[isNameExpr];
            int isVariable = isIntegerConstant;
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; ++isNameExpr) {
                AnnotatedParameter isVariable = isNameExpr.isMethod(isNameExpr);
                String isVariable = (isNameExpr == null) ? null : isNameExpr.isMethod(isNameExpr);
                // isComment
                if (isNameExpr == null || isNameExpr.isMethod() == isIntegerConstant) {
                    throw new IllegalArgumentException("isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant");
                }
                ++isNameExpr;
                isNameExpr[isNameExpr] = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            }
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        // isComment
        for (AnnotatedMethod isVariable : isNameExpr.isMethod()) {
            int isVariable = isNameExpr.isMethod();
            if (isNameExpr < isIntegerConstant || !isNameExpr.isMethod(isNameExpr)) {
                // isComment
                continue;
            }
            // isComment
            SettableBeanProperty[] isVariable = new SettableBeanProperty[isNameExpr];
            int isVariable = isIntegerConstant;
            for (int isVariable = isIntegerConstant; isNameExpr < isNameExpr; ++isNameExpr) {
                AnnotatedParameter isVariable = isNameExpr.isMethod(isNameExpr);
                String isVariable = (isNameExpr == null) ? null : isNameExpr.isMethod(isNameExpr);
                // isComment
                if (isNameExpr == null || isNameExpr.isMethod() == isIntegerConstant) {
                    throw new IllegalArgumentException("isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr + "isStringConstant");
                }
                ++isNameExpr;
                isNameExpr[isNameExpr] = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr, isNameExpr);
            }
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    protected SettableBeanProperty isMethod(DeserializationConfig isParameter, BasicBeanDescription isParameter, String isParameter, int isParameter, AnnotatedParameter isParameter) throws JsonMappingException {
        JavaType isVariable = isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod(), isNameExpr);
        // isComment
        JsonDeserializer<Object> isVariable = isMethod(isNameExpr, isNameExpr);
        // isComment
        isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        TypeDeserializer isVariable = isMethod(isNameExpr, isNameExpr);
        SettableBeanProperty isVariable = new SettableBeanProperty.CreatorProperty(isNameExpr, isNameExpr, isNameExpr, isNameExpr.isMethod(), isNameExpr);
        if (isNameExpr != null) {
            isNameExpr.isMethod(isNameExpr);
        }
        return isNameExpr;
    }
}
