// isComment
package org.codehaus.jackson.map.introspect;

import java.lang.annotation.Annotation;
import java.util.List;
import org.codehaus.jackson.type.JavaType;
import org.codehaus.jackson.map.JsonDeserializer;
import org.codehaus.jackson.map.KeyDeserializer;
import org.codehaus.jackson.map.AnnotationIntrospector;
import org.codehaus.jackson.map.annotate.JsonSerialize.Inclusion;
import org.codehaus.jackson.map.annotate.JsonSerialize.Typing;
import org.codehaus.jackson.map.jsontype.NamedType;
import org.codehaus.jackson.map.jsontype.TypeResolverBuilder;

/**
 * isComment
 */
public class isClassOrIsInterface extends AnnotationIntrospector {

    /**
     * isComment
     */
    public static final NopAnnotationIntrospector isVariable = new NopAnnotationIntrospector();

    /*isComment*/
    @Override
    public boolean isMethod(Annotation isParameter) {
        return true;
    }

    /*isComment*/
    @Override
    public String isMethod(Annotated isParameter) {
        return null;
    }

    @Override
    public String isMethod(Enum<?> isParameter) {
        return null;
    }

    /*isComment*/
    @Override
    public Boolean isMethod(AnnotatedClass isParameter) {
        return null;
    }

    @Override
    public String isMethod(AnnotatedClass isParameter) {
        return null;
    }

    @Override
    public String[] isMethod(AnnotatedClass isParameter) {
        return null;
    }

    @Override
    public Boolean isMethod(AnnotatedClass isParameter) {
        return null;
    }

    /*isComment*/
    @Override
    public VisibilityChecker<?> isMethod(AnnotatedClass isParameter, VisibilityChecker<?> isParameter) {
        return isNameExpr;
    }

    /*isComment*/
    @Override
    public TypeResolverBuilder<?> isMethod(AnnotatedClass isParameter, JavaType isParameter) {
        return null;
    }

    @Override
    public TypeResolverBuilder<?> isMethod(AnnotatedMember isParameter, JavaType isParameter) {
        return null;
    }

    @Override
    public TypeResolverBuilder<?> isMethod(AnnotatedMember isParameter, JavaType isParameter) {
        return null;
    }

    @Override
    public List<NamedType> isMethod(Annotated isParameter) {
        return null;
    }

    @Override
    public String isMethod(AnnotatedClass isParameter) {
        return null;
    }

    /*isComment*/
    @Override
    public boolean isMethod(AnnotatedConstructor isParameter) {
        return true;
    }

    @Override
    public boolean isMethod(AnnotatedMethod isParameter) {
        return true;
    }

    /*isComment*/
    @Override
    public boolean isMethod(AnnotatedField isParameter) {
        return true;
    }

    /*isComment*/
    @Override
    public Object isMethod(Annotated isParameter) {
        return null;
    }

    @Override
    public Inclusion isMethod(Annotated isParameter, Inclusion isParameter) {
        return isNameExpr.isFieldAccessExpr;
    }

    @Override
    public Class<?> isMethod(Annotated isParameter) {
        return null;
    }

    @Override
    public Typing isMethod(Annotated isParameter) {
        return null;
    }

    @Override
    public Class<?>[] isMethod(Annotated isParameter) {
        return null;
    }

    /*isComment*/
    public String[] isMethod(AnnotatedClass isParameter) {
        return null;
    }

    public Boolean isMethod(AnnotatedClass isParameter) {
        return null;
    }

    /*isComment*/
    @Override
    public String isMethod(AnnotatedMethod isParameter) {
        return null;
    }

    @Override
    public boolean isMethod(AnnotatedMethod isParameter) {
        return true;
    }

    @Override
    public String isMethod(AnnotatedField isParameter) {
        return null;
    }

    @Override
    public Class<?> isMethod(Annotated isParameter, JavaType isParameter, String isParameter) {
        return null;
    }

    @Override
    public Class<?> isMethod(Annotated isParameter, JavaType isParameter, String isParameter) {
        return null;
    }

    @Override
    public Class<?> isMethod(Annotated isParameter, JavaType isParameter, String isParameter) {
        return null;
    }

    @Override
    public Object isMethod(Annotated isParameter) {
        return null;
    }

    @Override
    public Class<KeyDeserializer> isMethod(Annotated isParameter) {
        return null;
    }

    @Override
    public Class<JsonDeserializer<?>> isMethod(Annotated isParameter) {
        return null;
    }

    @Override
    public String isMethod(AnnotatedParameter isParameter) {
        return null;
    }

    @Override
    public String isMethod(AnnotatedField isParameter) {
        return null;
    }

    @Override
    public String isMethod(AnnotatedMethod isParameter) {
        return null;
    }

    @Override
    public boolean isMethod(AnnotatedMethod isParameter) {
        return true;
    }

    @Override
    public boolean isMethod(Annotated isParameter) {
        return true;
    }
}
