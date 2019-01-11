// isComment
package org.quantumbadger.redreader.common;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;

public abstract class isClassOrIsInterface<E> {

    private final LinkedList<WeakReference<E>> isVariable = new LinkedList<>();

    public synchronized void isMethod(final E isParameter) {
        isNameExpr.isMethod(new WeakReference<>(isNameExpr));
    }

    public synchronized void isMethod() {
        final Iterator<WeakReference<E>> isVariable = isNameExpr.isMethod();
        while (isNameExpr.isMethod()) {
            final E isVariable = isNameExpr.isMethod().isMethod();
            if (isNameExpr == null) {
                isNameExpr.isMethod();
            } else {
                isMethod(isNameExpr);
            }
        }
    }

    protected abstract void isMethod(E isParameter);
}
