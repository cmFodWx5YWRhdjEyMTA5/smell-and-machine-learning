// isComment
package com.nineoldandroids.util;

/**
 * isComment
 */
public abstract class isClassOrIsInterface<T> extends Property<T, Integer> {

    public isConstructor(String isParameter) {
        super(Integer.class, isNameExpr);
    }

    /**
     * isComment
     */
    public abstract void isMethod(T isParameter, int isParameter);

    @Override
    public final void isMethod(T isParameter, Integer isParameter) {
        isMethod(isNameExpr, isNameExpr.isMethod());
    }
}
