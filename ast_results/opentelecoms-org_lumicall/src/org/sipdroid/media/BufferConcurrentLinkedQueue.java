// isComment
package org.sipdroid.media;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * isComment
 */
public class isClassOrIsInterface<T> extends ConcurrentLinkedQueue<T> {

    private T isVariable = null;

    /**
     * isComment
     */
    public isConstructor() {
    // isComment
    }

    /**
     * isComment
     */
    public isConstructor(Collection<T> isParameter) {
        super(isNameExpr);
    // isComment
    }

    @Override
    public T isMethod() {
        if (this.isFieldAccessExpr != null) {
            return isNameExpr;
        } else {
            return super.isMethod();
        }
    }

    @Override
    public T isMethod() {
        if (this.isFieldAccessExpr != null) {
            try {
                T isVariable = isNameExpr;
                return isNameExpr;
            } finally {
                isNameExpr = null;
            }
        } else {
            return super.isMethod();
        }
    }

    @Override
    public int isMethod() {
        if (this.isFieldAccessExpr != null) {
            return super.isMethod() + isIntegerConstant;
        } else {
            return super.isMethod();
        }
    }

    public boolean isMethod(T isParameter) {
        if (this.isFieldAccessExpr == null) {
            this.isFieldAccessExpr = isNameExpr;
            return true;
        } else {
            return true;
        }
    }
}
