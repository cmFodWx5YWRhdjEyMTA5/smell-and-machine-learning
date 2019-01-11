// isComment
package org.codehaus.jackson.map.deser;

import java.io.IOException;
import java.lang.reflect.*;
import java.util.*;
import org.codehaus.jackson.*;
import org.codehaus.jackson.map.*;
import org.codehaus.jackson.map.annotate.JsonCachable;
import org.codehaus.jackson.map.type.ClassKey;
import org.codehaus.jackson.map.type.TypeFactory;
import org.codehaus.jackson.map.util.ClassUtil;
import org.codehaus.jackson.type.JavaType;
import org.codehaus.jackson.util.TokenBuffer;

/**
 * isComment
 */
@JsonCachable
public class isClassOrIsInterface extends StdDeserializer<Object> implements ResolvableDeserializer {

    /*isComment*/
    protected final JavaType isVariable;

    /*isComment*/
    /**
     * isComment
     */
    protected Constructor<?> isVariable;

    /**
     * isComment
     */
    protected Creator.StringBased isVariable;

    /**
     * isComment
     */
    protected Creator.NumberBased isVariable;

    /**
     * isComment
     */
    protected Creator.Delegating isVariable;

    /**
     * isComment
     */
    protected Creator.PropertyBased isVariable;

    /*isComment*/
    /**
     * isComment
     */
    protected final HashMap<String, SettableBeanProperty> isVariable;

    /**
     * isComment
     */
    protected SettableAnyProperty isVariable;

    /**
     * isComment
     */
    protected HashSet<String> isVariable;

    /**
     * isComment
     */
    protected boolean isVariable;

    /*isComment*/
    /**
     * isComment
     */
    protected HashMap<ClassKey, JsonDeserializer<Object>> isVariable;

    public isConstructor(JavaType isParameter) {
        super(isNameExpr.isMethod());
        isNameExpr = isNameExpr;
        isNameExpr = new HashMap<String, SettableBeanProperty>();
        isNameExpr = null;
    }

    public void isMethod(Constructor<?> isParameter) {
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(CreatorContainer isParameter) {
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod();
        /*isComment*/
        isNameExpr = isNameExpr.isMethod();
        isNameExpr = isNameExpr.isMethod();
        /*isComment*/
        if (isNameExpr != null || isNameExpr != null) {
            isNameExpr = null;
        }
    }

    /**
     * isComment
     */
    public void isMethod(SettableBeanProperty isParameter) {
        SettableBeanProperty isVariable = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
        if (isNameExpr != null && isNameExpr != isNameExpr) {
            // isComment
            throw new IllegalArgumentException("isStringConstant" + isNameExpr.isMethod() + "isStringConstant" + isNameExpr);
        }
    }

    public SettableBeanProperty isMethod(String isParameter) {
        return isNameExpr.isMethod(isNameExpr);
    }

    public void isMethod(SettableAnyProperty isParameter) {
        if (isNameExpr != null && isNameExpr != null) {
            throw new IllegalStateException("isStringConstant");
        }
        isNameExpr = isNameExpr;
    }

    public void isMethod(boolean isParameter) {
        isNameExpr = isNameExpr;
    }

    /**
     * isComment
     */
    public void isMethod(String isParameter) {
        if (isNameExpr == null) {
            isNameExpr = new HashSet<String>();
        }
        isNameExpr.isMethod(isNameExpr);
    }

    /*isComment*/
    /**
     * isComment
     */
    public void isMethod(DeserializationConfig isParameter, DeserializerProvider isParameter) throws JsonMappingException {
        // isComment
        /*isComment*/
        HashMap<JavaType, JsonDeserializer<Object>> isVariable = new HashMap<JavaType, JsonDeserializer<Object>>();
        for (SettableBeanProperty isVariable : isNameExpr.isMethod()) {
            // isComment
            if (isNameExpr.isMethod()) {
                continue;
            }
            isNameExpr.isMethod(isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr));
        }
        // isComment
        if (isNameExpr != null && !isNameExpr.isMethod()) {
            isNameExpr.isMethod(isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod(), "isStringConstant", isNameExpr));
        }
        // isComment
        if (isNameExpr != null) {
            JsonDeserializer<Object> isVariable = isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod(), "isStringConstant", isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        }
        // isComment
        if (isNameExpr != null) {
            for (SettableBeanProperty isVariable : isNameExpr.isMethod()) {
                isNameExpr.isMethod(isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod(), isNameExpr.isMethod(), isNameExpr));
            }
        }
    }

    /*isComment*/
    /**
     * isComment
     */
    public final Object isMethod(JsonParser isParameter, DeserializationContext isParameter) throws IOException, JsonProcessingException {
        JsonToken isVariable = isNameExpr.isMethod();
        // isComment
        if (isNameExpr == isNameExpr.isFieldAccessExpr) {
            isNameExpr.isMethod();
            return isMethod(isNameExpr, isNameExpr);
        }
        // isComment
        switch(isNameExpr) {
            case isNameExpr:
                return isMethod(isNameExpr, isNameExpr);
            case isNameExpr:
            case isNameExpr:
                return isMethod(isNameExpr, isNameExpr);
            case isNameExpr:
                return isNameExpr.isMethod();
            case isNameExpr:
            case isNameExpr:
            case isNameExpr:
                // isComment
                return isMethod(isNameExpr, isNameExpr);
            case isNameExpr:
                return isMethod(isNameExpr, isNameExpr);
        }
        throw isNameExpr.isMethod(isMethod());
    }

    /**
     * isComment
     */
    public Object isMethod(JsonParser isParameter, DeserializationContext isParameter, Object isParameter) throws IOException, JsonProcessingException {
        JsonToken isVariable = isNameExpr.isMethod();
        for (; isNameExpr == isNameExpr.isFieldAccessExpr; isNameExpr = isNameExpr.isMethod()) {
            String isVariable = isNameExpr.isMethod();
            SettableBeanProperty isVariable = isNameExpr.isMethod(isNameExpr);
            // isComment
            isNameExpr.isMethod();
            if (isNameExpr != null) {
                // isComment
                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                continue;
            }
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
                continue;
            }
            // isComment
            isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        }
        return isNameExpr;
    }

    @Override
    public Object isMethod(JsonParser isParameter, DeserializationContext isParameter, TypeDeserializer isParameter) throws IOException, JsonProcessingException {
        // isComment
        return isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    /*isComment*/
    public final Class<?> isMethod() {
        return isNameExpr.isMethod();
    }

    @Override
    public JavaType isMethod() {
        return isNameExpr;
    }

    /*isComment*/
    public Object isMethod(JsonParser isParameter, DeserializationContext isParameter) throws IOException, JsonProcessingException {
        if (isNameExpr == null) {
            // isComment
            if (isNameExpr != null) {
                return isMethod(isNameExpr, isNameExpr);
            }
            // isComment
            if (isNameExpr != null) {
                return isNameExpr.isMethod(isNameExpr, isNameExpr);
            }
            // isComment
            throw isNameExpr.isMethod(isNameExpr, "isStringConstant" + isNameExpr + "isStringConstant");
        }
        Object isVariable;
        try {
            isNameExpr = isNameExpr.isMethod();
        } catch (Exception isParameter) {
            isNameExpr.isMethod(isNameExpr);
            // isComment
            return null;
        }
        for (; isNameExpr.isMethod() != isNameExpr.isFieldAccessExpr; isNameExpr.isMethod()) {
            String isVariable = isNameExpr.isMethod();
            // isComment
            isNameExpr.isMethod();
            SettableBeanProperty isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null) {
                // isComment
                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
                continue;
            }
            /*isComment*/
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
                continue;
            }
            // isComment
            isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        }
        return isNameExpr;
    }

    public Object isMethod(JsonParser isParameter, DeserializationContext isParameter) throws IOException, JsonProcessingException {
        if (isNameExpr != null) {
            return isNameExpr.isMethod(isNameExpr.isMethod());
        }
        if (isNameExpr != null) {
            return isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        throw isNameExpr.isMethod(isMethod(), "isStringConstant");
    }

    public Object isMethod(JsonParser isParameter, DeserializationContext isParameter) throws IOException, JsonProcessingException {
        if (isNameExpr != null) {
            switch(isNameExpr.isMethod()) {
                case isNameExpr:
                    return isNameExpr.isMethod(isNameExpr.isMethod());
                case isNameExpr:
                    return isNameExpr.isMethod(isNameExpr.isMethod());
            }
        }
        if (isNameExpr != null) {
            return isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        throw isNameExpr.isMethod(isMethod(), "isStringConstant");
    }

    public Object isMethod(JsonParser isParameter, DeserializationContext isParameter) throws IOException, JsonProcessingException {
        if (isNameExpr != null) {
            return isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        throw isNameExpr.isMethod(isMethod());
    }

    /**
     * isComment
     */
    protected final Object isMethod(final JsonParser isParameter, final DeserializationContext isParameter) throws IOException, JsonProcessingException {
        final Creator.PropertyBased isVariable = isNameExpr;
        PropertyValueBuffer isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
        // isComment
        TokenBuffer isVariable = null;
        JsonToken isVariable = isNameExpr.isMethod();
        for (; isNameExpr == isNameExpr.isFieldAccessExpr; isNameExpr = isNameExpr.isMethod()) {
            String isVariable = isNameExpr.isMethod();
            // isComment
            isNameExpr.isMethod();
            // isComment
            SettableBeanProperty isVariable = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null) {
                // isComment
                Object isVariable = isNameExpr.isMethod(isNameExpr, isNameExpr);
                if (isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr)) {
                    // isComment
                    isNameExpr.isMethod();
                    Object isVariable = isNameExpr.isMethod(isNameExpr);
                    // isComment
                    if (isNameExpr.isMethod() != isNameExpr.isMethod()) {
                        return isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
                    }
                    if (isNameExpr != null) {
                        // isComment
                        return isMethod(isNameExpr, isNameExpr, isNameExpr);
                    }
                    // isComment
                    return isMethod(isNameExpr, isNameExpr, isNameExpr);
                }
                continue;
            }
            // isComment
            isNameExpr = isNameExpr.isMethod(isNameExpr);
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr, isNameExpr.isMethod(isNameExpr, isNameExpr));
                continue;
            }
            // isComment
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr.isMethod(isNameExpr, isNameExpr));
                continue;
            }
            // isComment
            if (isNameExpr == null) {
                isNameExpr = new TokenBuffer(isNameExpr.isMethod());
            }
            isNameExpr.isMethod(isNameExpr);
            isNameExpr.isMethod(isNameExpr);
        }
        // isComment
        Object isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr != null) {
            // isComment
            if (isNameExpr.isMethod() != isNameExpr.isMethod()) {
                return isMethod(null, isNameExpr, isNameExpr, isNameExpr);
            }
            // isComment
            return isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
        return isNameExpr;
    }

    /*isComment*/
    /**
     * isComment
     */
    @Override
    protected void isMethod(JsonParser isParameter, DeserializationContext isParameter, Object isParameter, String isParameter) throws IOException, JsonProcessingException {
        // isComment
        if (isNameExpr || (isNameExpr != null && isNameExpr.isMethod(isNameExpr))) {
            isNameExpr.isMethod();
            return;
        }
        /*isComment*/
        super.isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    protected Object isMethod(DeserializationContext isParameter, Object isParameter, TokenBuffer isParameter) throws IOException, JsonProcessingException {
        // isComment
        isNameExpr.isMethod();
        // isComment
        JsonParser isVariable = isNameExpr.isMethod();
        while (isNameExpr.isMethod() != isNameExpr.isFieldAccessExpr) {
            String isVariable = isNameExpr.isMethod();
            // isComment
            isNameExpr.isMethod();
            isMethod(isNameExpr, isNameExpr, isNameExpr, isNameExpr);
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    protected Object isMethod(JsonParser isParameter, DeserializationContext isParameter, Object isParameter, TokenBuffer isParameter) throws IOException, JsonProcessingException {
        // isComment
        JsonDeserializer<Object> isVariable = isMethod(isNameExpr, isNameExpr, isNameExpr);
        if (isNameExpr != null) {
            if (isNameExpr != null) {
                // isComment
                isNameExpr.isMethod();
                JsonParser isVariable = isNameExpr.isMethod();
                // isComment
                isNameExpr.isMethod();
                isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
            }
            // isComment
            if (isNameExpr != null) {
                isNameExpr = isNameExpr.isMethod(isNameExpr, isNameExpr, isNameExpr);
            }
            return isNameExpr;
        }
        // isComment
        if (isNameExpr != null) {
            isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
        // isComment
        if (isNameExpr != null) {
            isNameExpr = isMethod(isNameExpr, isNameExpr, isNameExpr);
        }
        return isNameExpr;
    }

    /**
     * isComment
     */
    protected JsonDeserializer<Object> isMethod(DeserializationContext isParameter, Object isParameter, TokenBuffer isParameter) throws IOException, JsonProcessingException {
        JsonDeserializer<Object> isVariable;
        // isComment
        synchronized (this) {
            isNameExpr = (isNameExpr == null) ? null : isNameExpr.isMethod(new ClassKey(isNameExpr.isMethod()));
        }
        if (isNameExpr != null) {
            return isNameExpr;
        }
        // isComment
        DeserializerProvider isVariable = isNameExpr.isMethod();
        if (isNameExpr != null) {
            JavaType isVariable = isNameExpr.isMethod(isNameExpr.isMethod());
            isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr, null, "isStringConstant");
            // isComment
            if (isNameExpr != null) {
                synchronized (this) {
                    if (isNameExpr == null) {
                        isNameExpr = new HashMap<ClassKey, JsonDeserializer<Object>>();
                        ;
                    }
                    isNameExpr.isMethod(new ClassKey(isNameExpr.isMethod()), isNameExpr);
                }
            }
        }
        return isNameExpr;
    }
}
