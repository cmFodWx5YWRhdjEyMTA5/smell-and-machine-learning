// isComment
package org.codehaus.jackson.map.introspect;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import org.codehaus.jackson.type.JavaType;
import org.codehaus.jackson.map.type.TypeBindings;
import org.codehaus.jackson.map.type.TypeFactory;

/**
 * isComment
 */
public abstract class isClassOrIsInterface {

    protected isConstructor() {
    }

    public abstract <A extends Annotation> A isMethod(Class<A> isParameter);

    public final <A extends Annotation> boolean isMethod(Class<A> isParameter) {
        return isMethod(isNameExpr) != null;
    }

    public abstract AnnotatedElement isMethod();

    protected abstract int isMethod();

    public final boolean isMethod() {
        return isNameExpr.isMethod(isMethod());
    }

    public abstract String isMethod();

    /**
     * isComment
     */
    public JavaType isMethod(TypeBindings isParameter) {
        return isNameExpr.isMethod(isMethod(), isNameExpr);
    }

    /**
     * isComment
     */
    public abstract Type isMethod();

    /**
     * isComment
     */
    public abstract Class<?> isMethod();
}
