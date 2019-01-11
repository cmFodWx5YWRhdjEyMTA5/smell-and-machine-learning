// isComment
package com.nineoldandroids.util;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T> extends Property<T, Float> {

    public isConstructor(String isParameter) {
        super(Float.class, isNameExpr);
    }

    /**
     * isComment
     */
    public abstract void isMethod(T isParameter, float isParameter);

    @Override
    public final void isMethod(T isParameter, Float isParameter) {
        isMethod(isNameExpr, isNameExpr);
    }
}
