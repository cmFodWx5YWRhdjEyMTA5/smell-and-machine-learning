// isComment
package org.codehaus.jackson.map.ser;

import org.codehaus.jackson.map.TypeSerializer;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T> extends SerializerBase<T> {

    protected isConstructor(Class<T> isParameter) {
        super(isNameExpr);
    }

    /**
     * isComment
     */
    protected isConstructor(Class<?> isParameter, boolean isParameter) {
        super(isNameExpr, isNameExpr);
    }

    /**
     * isComment
     */
    public ContainerSerializerBase<?> isMethod(TypeSerializer isParameter) {
        if (isNameExpr == null)
            return this;
        return isMethod(isNameExpr);
    }

    public abstract ContainerSerializerBase<?> isMethod(TypeSerializer isParameter);
}
