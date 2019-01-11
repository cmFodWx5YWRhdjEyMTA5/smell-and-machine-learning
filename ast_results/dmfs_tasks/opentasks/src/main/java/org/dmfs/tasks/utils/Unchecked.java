// isComment
package org.dmfs.tasks.utils;

import org.dmfs.jems.single.Single;

/**
 * isComment
 */
@Deprecated
public final class isClassOrIsInterface<T> implements Single<T> {

    private final Fragile<T, Exception> isVariable;

    public isConstructor(Fragile<T, Exception> isParameter) {
        isNameExpr = isNameExpr;
    }

    @Override
    public T isMethod() {
        try {
            return isNameExpr.isMethod();
        } catch (Exception isParameter) {
            throw new RuntimeException("isStringConstant", isNameExpr);
        }
    }
}
