// isComment
package org.codehaus.jackson.map.introspect;

import java.util.*;
import java.lang.annotation.Annotation;
import org.codehaus.jackson.annotate.*;
import org.codehaus.jackson.map.AnnotationIntrospector;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.JsonSerializer;
import org.codehaus.jackson.map.KeyDeserializer;
import org.codehaus.jackson.map.annotate.*;
import org.codehaus.jackson.map.jsontype.NamedType;
import org.codehaus.jackson.map.jsontype.TypeIdResolver;
import org.codehaus.jackson.map.jsontype.TypeResolverBuilder;
import org.codehaus.jackson.map.jsontype.impl.StdTypeResolverBuilder;
import org.codehaus.jackson.map.util.ClassUtil;
import org.codehaus.jackson.type.JavaType;

/**
 * isComment
 */
public class isClassOrIsInterface extends AnnotationIntrospector {

    public isConstructor() {
    }

    /*isComment*/
    @Override
    public boolean isMethod(Annotation isParameter) {
        Class<? extends Annotation> isVariable = isNameExpr.isMethod();
        // isComment
        return isNameExpr.isMethod(JacksonAnnotation.class) != null;
    }

    /*isComment*/
    @Override
    public String isMethod(Annotated isParameter) {
        // isComment
        return null;
    }

    @Override
    public String isMethod(Enum<?> isParameter) {
        return isNameExpr.isMethod();
    }

    /*isComment*/
    @Override
    public Boolean isMethod(AnnotatedClass isParameter) {
        JsonCachable isVariable = isNameExpr.isMethod(JsonCachable.class);
        if (isNameExpr == null) {
            return null;
        }
        return isNameExpr.isMethod() ? isNameExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr;
    }

    @Override
    public String isMethod(AnnotatedClass isParameter) {
        // isComment
        return null;
    }

    @Override
    public String[] isMethod(AnnotatedClass isParameter) {
        JsonIgnoreProperties isVariable = isNameExpr.isMethod(JsonIgnoreProperties.class);
        return (isNameExpr == null) ? null : isNameExpr.isMethod();
    }

    @Override
    public Boolean isMethod(AnnotatedClass isParameter) {
        JsonIgnoreProperties isVariable = isNameExpr.isMethod(JsonIgnoreProperties.class);
        return (isNameExpr == null) ? null : isNameExpr.isMethod();
    }

    /*isComment*/
    @Override
    public VisibilityChecker<?> isMethod(AnnotatedClass isParameter, VisibilityChecker<?> isParameter) {
        JsonAutoDetect isVariable = isNameExpr.isMethod(JsonAutoDetect.class);
        return (isNameExpr == null) ? isNameExpr : isNameExpr.isMethod(isNameExpr);
    }

    /*isComment*/
    @Override
    public TypeResolverBuilder<?> isMethod(AnnotatedClass isParameter, JavaType isParameter) {
        // isComment
        TypeResolverBuilder<?> isVariable;
        JsonTypeInfo isVariable = isNameExpr.isMethod(JsonTypeInfo.class);
        JsonTypeResolver isVariable = isNameExpr.isMethod(JsonTypeResolver.class);
        if (isNameExpr != null) {
            /*isComment*/
            isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(), true);
        } else {
            // isComment
            if (isNameExpr == null || isNameExpr.isMethod() == isNameExpr.isFieldAccessExpr.isFieldAccessExpr) {
                return null;
            }
            isNameExpr = new StdTypeResolverBuilder();
        }
        // isComment
        JsonTypeIdResolver isVariable = isNameExpr.isMethod(JsonTypeIdResolver.class);
        TypeIdResolver isVariable = (isNameExpr == null) ? null : isNameExpr.isMethod(isNameExpr.isMethod(), true);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod(), isNameExpr);
        isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod());
        isNameExpr = isNameExpr.isMethod(isNameExpr.isMethod());
        return isNameExpr;
    }

    @Override
    public TypeResolverBuilder<?> isMethod(AnnotatedMember isParameter, JavaType isParameter) {
        // isComment
        return null;
    }

    @Override
    public TypeResolverBuilder<?> isMethod(AnnotatedMember isParameter, JavaType isParameter) {
        // isComment
        return null;
    }

    @Override
    public List<NamedType> isMethod(Annotated isParameter) {
        JsonSubTypes isVariable = isNameExpr.isMethod(JsonSubTypes.class);
        if (isNameExpr == null)
            return null;
        JsonSubTypes.Type[] isVariable = isNameExpr.isMethod();
        ArrayList<NamedType> isVariable = new ArrayList<NamedType>(isNameExpr.isFieldAccessExpr);
        for (JsonSubTypes.Type isVariable : isNameExpr) {
            isNameExpr.isMethod(new NamedType(isNameExpr.isMethod(), isNameExpr.isMethod()));
        }
        return isNameExpr;
    }

    @Override
    public String isMethod(AnnotatedClass isParameter) {
        JsonTypeName isVariable = isNameExpr.isMethod(JsonTypeName.class);
        return (isNameExpr == null) ? null : isNameExpr.isMethod();
    }

    /*isComment*/
    @Override
    public boolean isMethod(AnnotatedMethod isParameter) {
        return isMethod(isNameExpr);
    }

    @Override
    public boolean isMethod(AnnotatedConstructor isParameter) {
        return isMethod(isNameExpr);
    }

    /*isComment*/
    @Override
    public boolean isMethod(AnnotatedField isParameter) {
        return isMethod(isNameExpr);
    }

    /*isComment*/
    @Override
    public Class<? extends JsonSerializer<?>> isMethod(Annotated isParameter) {
        /*isComment*/
        JsonSerialize isVariable = isNameExpr.isMethod(JsonSerialize.class);
        if (isNameExpr != null) {
            Class<? extends JsonSerializer<?>> isVariable = isNameExpr.isMethod();
            if (isNameExpr != JsonSerializer.None.class) {
                return isNameExpr;
            }
        }
        // isComment
        return null;
    }

    @Override
    public JsonSerialize.Inclusion isMethod(Annotated isParameter, JsonSerialize.Inclusion isParameter) {
        JsonSerialize isVariable = isNameExpr.isMethod(JsonSerialize.class);
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        }
        /*isComment*/
        JsonWriteNullProperties isVariable = isNameExpr.isMethod(JsonWriteNullProperties.class);
        if (isNameExpr != null) {
            boolean isVariable = isNameExpr.isMethod();
            return isNameExpr ? isNameExpr.isFieldAccessExpr.isFieldAccessExpr : isNameExpr.isFieldAccessExpr.isFieldAccessExpr;
        }
        return isNameExpr;
    }

    @Override
    public Class<?> isMethod(Annotated isParameter) {
        // isComment
        JsonSerialize isVariable = isNameExpr.isMethod(JsonSerialize.class);
        if (isNameExpr != null) {
            Class<?> isVariable = isNameExpr.isMethod();
            if (isNameExpr != NoClass.class) {
                return isNameExpr;
            }
        }
        return null;
    }

    @Override
    public JsonSerialize.Typing isMethod(Annotated isParameter) {
        JsonSerialize isVariable = isNameExpr.isMethod(JsonSerialize.class);
        return (isNameExpr == null) ? null : isNameExpr.isMethod();
    }

    @Override
    public Class<?>[] isMethod(Annotated isParameter) {
        JsonView isVariable = isNameExpr.isMethod(JsonView.class);
        return (isNameExpr == null) ? null : isNameExpr.isMethod();
    }

    /*isComment*/
    public String[] isMethod(AnnotatedClass isParameter) {
        JsonPropertyOrder isVariable = isNameExpr.isMethod(JsonPropertyOrder.class);
        return (isNameExpr == null) ? null : isNameExpr.isMethod();
    }

    public Boolean isMethod(AnnotatedClass isParameter) {
        JsonPropertyOrder isVariable = isNameExpr.isMethod(JsonPropertyOrder.class);
        return (isNameExpr == null) ? null : isNameExpr.isMethod();
    }

    /*isComment*/
    @SuppressWarnings("isStringConstant")
    @Override
    public String isMethod(AnnotatedMethod isParameter) {
        /*isComment*/
        JsonProperty isVariable = isNameExpr.isMethod(JsonProperty.class);
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        }
        /*isComment*/
        JsonGetter isVariable = isNameExpr.isMethod(JsonGetter.class);
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        }
        /*isComment*/
        if (isNameExpr.isMethod(JsonSerialize.class)) {
            return "isStringConstant";
        }
        return null;
    }

    @Override
    public boolean isMethod(AnnotatedMethod isParameter) {
        JsonValue isVariable = isNameExpr.isMethod(JsonValue.class);
        // isComment
        return (isNameExpr != null && isNameExpr.isMethod());
    }

    /*isComment*/
    @Override
    public String isMethod(AnnotatedField isParameter) {
        JsonProperty isVariable = isNameExpr.isMethod(JsonProperty.class);
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        }
        // isComment
        if (isNameExpr.isMethod(JsonSerialize.class)) {
            return "isStringConstant";
        }
        return null;
    }

    /*isComment*/
    @Override
    public Class<? extends JsonDeserializer<?>> isMethod(Annotated isParameter) {
        /*isComment*/
        JsonDeserialize isVariable = isNameExpr.isMethod(JsonDeserialize.class);
        if (isNameExpr != null) {
            Class<? extends JsonDeserializer<?>> isVariable = isNameExpr.isMethod();
            if (isNameExpr != JsonDeserializer.None.class) {
                return isNameExpr;
            }
        }
        // isComment
        return null;
    }

    @Override
    public Class<? extends KeyDeserializer> isMethod(Annotated isParameter) {
        JsonDeserialize isVariable = isNameExpr.isMethod(JsonDeserialize.class);
        if (isNameExpr != null) {
            Class<? extends KeyDeserializer> isVariable = isNameExpr.isMethod();
            if (isNameExpr != KeyDeserializer.None.class) {
                return isNameExpr;
            }
        }
        return null;
    }

    @Override
    public Class<? extends JsonDeserializer<?>> isMethod(Annotated isParameter) {
        JsonDeserialize isVariable = isNameExpr.isMethod(JsonDeserialize.class);
        if (isNameExpr != null) {
            Class<? extends JsonDeserializer<?>> isVariable = isNameExpr.isMethod();
            if (isNameExpr != JsonDeserializer.None.class) {
                return isNameExpr;
            }
        }
        return null;
    }

    @Override
    public Class<?> isMethod(Annotated isParameter, JavaType isParameter, String isParameter) {
        // isComment
        JsonDeserialize isVariable = isNameExpr.isMethod(JsonDeserialize.class);
        if (isNameExpr != null) {
            Class<?> isVariable = isNameExpr.isMethod();
            if (isNameExpr != NoClass.class) {
                return isNameExpr;
            }
        }
        /*isComment*/
        @SuppressWarnings("isStringConstant")
        JsonClass isVariable = isNameExpr.isMethod(JsonClass.class);
        if (isNameExpr != null) {
            @SuppressWarnings("isStringConstant")
            Class<?> isVariable = isNameExpr.isMethod();
            if (isNameExpr != NoClass.class) {
                return isNameExpr;
            }
        }
        return null;
    }

    @Override
    public Class<?> isMethod(Annotated isParameter, JavaType isParameter, String isParameter) {
        // isComment
        JsonDeserialize isVariable = isNameExpr.isMethod(JsonDeserialize.class);
        if (isNameExpr != null) {
            Class<?> isVariable = isNameExpr.isMethod();
            if (isNameExpr != NoClass.class) {
                return isNameExpr;
            }
        }
        /*isComment*/
        @SuppressWarnings("isStringConstant")
        JsonKeyClass isVariable = isNameExpr.isMethod(JsonKeyClass.class);
        if (isNameExpr != null) {
            @SuppressWarnings("isStringConstant")
            Class<?> isVariable = isNameExpr.isMethod();
            if (isNameExpr != NoClass.class) {
                return isNameExpr;
            }
        }
        return null;
    }

    @SuppressWarnings("isStringConstant")
    @Override
    public Class<?> isMethod(Annotated isParameter, JavaType isParameter, String isParameter) {
        // isComment
        JsonDeserialize isVariable = isNameExpr.isMethod(JsonDeserialize.class);
        if (isNameExpr != null) {
            Class<?> isVariable = isNameExpr.isMethod();
            if (isNameExpr != NoClass.class) {
                return isNameExpr;
            }
        }
        /*isComment*/
        JsonContentClass isVariable = isNameExpr.isMethod(JsonContentClass.class);
        if (isNameExpr != null) {
            Class<?> isVariable = isNameExpr.isMethod();
            if (isNameExpr != NoClass.class) {
                return isNameExpr;
            }
        }
        return null;
    }

    /*isComment*/
    @SuppressWarnings("isStringConstant")
    @Override
    public String isMethod(AnnotatedMethod isParameter) {
        /*isComment*/
        JsonProperty isVariable = isNameExpr.isMethod(JsonProperty.class);
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        }
        /*isComment*/
        JsonSetter isVariable = isNameExpr.isMethod(JsonSetter.class);
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        }
        /*isComment*/
        if (isNameExpr.isMethod(JsonDeserialize.class)) {
            return "isStringConstant";
        }
        return null;
    }

    @Override
    public boolean isMethod(AnnotatedMethod isParameter) {
        /*isComment*/
        return isNameExpr.isMethod(JsonAnySetter.class);
    }

    @Override
    public boolean isMethod(Annotated isParameter) {
        /*isComment*/
        return isNameExpr.isMethod(JsonCreator.class);
    }

    /*isComment*/
    @Override
    public String isMethod(AnnotatedField isParameter) {
        JsonProperty isVariable = isNameExpr.isMethod(JsonProperty.class);
        if (isNameExpr != null) {
            return isNameExpr.isMethod();
        }
        // isComment
        if (isNameExpr.isMethod(JsonDeserialize.class)) {
            return "isStringConstant";
        }
        return null;
    }

    /*isComment*/
    @Override
    public String isMethod(AnnotatedParameter isParameter) {
        if (isNameExpr != null) {
            JsonProperty isVariable = isNameExpr.isMethod(JsonProperty.class);
            if (isNameExpr != null) {
                return isNameExpr.isMethod();
            }
        /*isComment*/
        }
        return null;
    }

    /*isComment*/
    protected boolean isMethod(Annotated isParameter) {
        JsonIgnore isVariable = isNameExpr.isMethod(JsonIgnore.class);
        return (isNameExpr != null && isNameExpr.isMethod());
    }
}
