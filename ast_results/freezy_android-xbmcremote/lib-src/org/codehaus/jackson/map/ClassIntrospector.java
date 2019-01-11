// isComment
package org.codehaus.jackson.map;

import org.codehaus.jackson.type.JavaType;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T extends BeanDescription> {

    /**
     * isComment
     */
    public interface isClassOrIsInterface {

        /**
         * isComment
         */
        public Class<?> isMethod(Class<?> isParameter);
    }

    protected isConstructor() {
    }

    /*isComment*/
    /**
     * isComment
     */
    public abstract T isMethod(SerializationConfig isParameter, Class<?> isParameter, MixInResolver isParameter);

    /**
     * isComment
     */
    public abstract T isMethod(DeserializationConfig isParameter, JavaType isParameter, MixInResolver isParameter);

    /**
     * isComment
     */
    public abstract T isMethod(DeserializationConfig isParameter, Class<?> isParameter, MixInResolver isParameter);

    /**
     * isComment
     */
    public abstract T isMethod(MapperConfig<?> isParameter, Class<?> isParameter, MixInResolver isParameter);

    /**
     * isComment
     */
    public abstract T isMethod(MapperConfig<?> isParameter, Class<?> isParameter, MixInResolver isParameter);
}
