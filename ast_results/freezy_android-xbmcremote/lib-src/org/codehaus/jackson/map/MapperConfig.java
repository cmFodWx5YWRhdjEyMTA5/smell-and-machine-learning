// isComment
package org.codehaus.jackson.map;

import java.util.Map;
import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.map.introspect.VisibilityChecker;
import org.codehaus.jackson.map.jsontype.TypeResolverBuilder;
import org.codehaus.jackson.type.JavaType;

/**
 * isComment
 */
public interface isClassOrIsInterface<T extends MapperConfig<T>> extends ClassIntrospector.MixInResolver {

    // isComment
    // isComment
    /**
     * isComment
     */
    public void isMethod(Class<?> isParameter);

    /**
     * isComment
     */
    public T isMethod(TypeResolverBuilder<?> isParameter, VisibilityChecker<?> isParameter);

    // isComment
    public AnnotationIntrospector isMethod();

    public void isMethod(AnnotationIntrospector isParameter);

    public void isMethod(ClassIntrospector<? extends BeanDescription> isParameter);

    /**
     * isComment
     */
    public void isMethod(Map<Class<?>, Class<?>> isParameter);

    /**
     * isComment
     */
    public void isMethod(Class<?> isParameter, Class<?> isParameter);

    // isComment
    /**
     * isComment
     */
    public Class<?> isMethod(Class<?> isParameter);

    /**
     * isComment
     */
    public TypeResolverBuilder<?> isMethod(JavaType isParameter);

    /**
     * isComment
     */
    public VisibilityChecker<?> isMethod();
}
