// isComment
package org.dmfs.provider.tasks.utils;

import org.dmfs.iterators.AbstractBaseIterator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * isComment
 */
@Deprecated
public final class isClassOrIsInterface<T> extends AbstractBaseIterator<T> {

    private int isVariable;

    private final Iterator<T> isVariable;

    public isConstructor(int isParameter, Iterator<T> isParameter) {
        isNameExpr = isNameExpr;
        isNameExpr = isNameExpr;
    }

    @Override
    public boolean isMethod() {
        return isNameExpr > isIntegerConstant && isNameExpr.isMethod();
    }

    @Override
    public T isMethod() {
        if (!isMethod()) {
            throw new NoSuchElementException("isStringConstant");
        }
        isNameExpr--;
        return isNameExpr.isMethod();
    }
}
