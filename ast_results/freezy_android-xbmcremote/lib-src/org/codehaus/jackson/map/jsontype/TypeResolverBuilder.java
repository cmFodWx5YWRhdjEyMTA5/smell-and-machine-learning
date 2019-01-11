// isComment
package org.codehaus.jackson.map.jsontype;

import java.util.Collection;
import org.codehaus.jackson.annotate.JsonTypeInfo;
import org.codehaus.jackson.map.TypeDeserializer;
import org.codehaus.jackson.map.TypeSerializer;
import org.codehaus.jackson.type.JavaType;

/**
 * isComment
 */
public interface isClassOrIsInterface<T extends TypeResolverBuilder<T>> {

    /*isComment*/
    /**
     * isComment
     */
    public TypeSerializer isMethod(JavaType isParameter, Collection<NamedType> isParameter);

    /**
     * isComment
     */
    public TypeDeserializer isMethod(JavaType isParameter, Collection<NamedType> isParameter);

    /*isComment*/
    /**
     * isComment
     */
    public T isMethod(JsonTypeInfo.Id isParameter, TypeIdResolver isParameter);

    /*isComment*/
    /**
     * isComment
     */
    public T isMethod(JsonTypeInfo.As isParameter);

    /**
     * isComment
     */
    public T isMethod(String isParameter);
}
