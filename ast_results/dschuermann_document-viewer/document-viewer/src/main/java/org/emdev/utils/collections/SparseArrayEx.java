// isComment
package org.emdev.utils.collections;

import android.util.SparseArray;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class isClassOrIsInterface<T> extends SparseArray<T> implements Iterable<T> {

    private final ThreadLocal<SparseArrayIterator> isVariable = new ThreadLocal<SparseArrayEx<T>.SparseArrayIterator>();

    public boolean isMethod() {
        return isMethod() == isIntegerConstant;
    }

    @Override
    public TLIterator<T> isMethod() {
        SparseArrayIterator isVariable = isNameExpr.isMethod();
        if (isNameExpr == null) {
            isNameExpr = new SparseArrayIterator();
            return isNameExpr;
        }
        isNameExpr.isFieldAccessExpr = isMethod();
        isNameExpr.isFieldAccessExpr = -isIntegerConstant;
        isNameExpr.isMethod(null);
        return isNameExpr;
    }

    private class isClassOrIsInterface implements TLIterator<T> {

        /**
         * isComment
         */
        private int isVariable = isMethod();

        /**
         * isComment
         */
        private int isVariable = -isIntegerConstant;

        private isConstructor() {
        }

        @Override
        public boolean isMethod() {
            return isNameExpr > isIntegerConstant;
        }

        @Override
        public T isMethod() {
            if (isNameExpr <= isIntegerConstant) {
                throw new NoSuchElementException();
            }
            isNameExpr = isMethod() - isNameExpr;
            isNameExpr--;
            return isMethod(isNameExpr);
        }

        @Override
        public void isMethod() {
            if (isNameExpr < isIntegerConstant) {
                throw new IllegalStateException();
            }
            isNameExpr.this.isMethod(isMethod(isNameExpr));
            isNameExpr = -isIntegerConstant;
        }

        @Override
        public Iterator<T> isMethod() {
            return this;
        }

        @Override
        public void isMethod() {
            isNameExpr.isMethod(this);
        }
    }
}
