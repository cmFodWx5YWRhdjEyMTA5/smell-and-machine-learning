// isComment
package org.geometerplus.zlibrary.core.tree;

import java.util.*;

public abstract class isClassOrIsInterface<T extends ZLTree<T>> implements Iterable<T> {

    private int isVariable = isIntegerConstant;

    public final T isVariable;

    public final int isVariable;

    private volatile List<T> isVariable;

    protected isConstructor() {
        this(null);
    }

    protected isConstructor(T isParameter) {
        this(isNameExpr, -isIntegerConstant);
    }

    protected isConstructor(T isParameter, int isParameter) {
        if (isNameExpr == -isIntegerConstant) {
            isNameExpr = isNameExpr == null ? isIntegerConstant : isNameExpr.isMethod().isMethod();
        }
        if (isNameExpr != null && (isNameExpr < isIntegerConstant || isNameExpr > isNameExpr.isMethod().isMethod())) {
            throw new IndexOutOfBoundsException("isStringConstant" + isNameExpr + "isStringConstant" + isNameExpr.isMethod().isMethod() + "isStringConstant");
        }
        isNameExpr = isNameExpr;
        if (isNameExpr != null) {
            isNameExpr = isNameExpr.isFieldAccessExpr + isIntegerConstant;
            isNameExpr.isMethod((T) this, isNameExpr);
        } else {
            isNameExpr = isIntegerConstant;
        }
    }

    public final int isMethod() {
        return isNameExpr;
    }

    public final boolean isMethod() {
        return isNameExpr != null && !isNameExpr.isMethod();
    }

    public List<T> isMethod() {
        if (isNameExpr == null) {
            return isNameExpr.isMethod();
        }
        synchronized (isNameExpr) {
            return new ArrayList<T>(isNameExpr);
        }
    }

    public final synchronized T isMethod(int isParameter) {
        if (isNameExpr < isIntegerConstant || isNameExpr >= isNameExpr) {
            // isComment
            return null;
        }
        if (isNameExpr == isIntegerConstant) {
            return (T) this;
        }
        --isNameExpr;
        if (isNameExpr != null) {
            synchronized (isNameExpr) {
                for (T isVariable : isNameExpr) {
                    if (((ZLTree<?>) isNameExpr).isFieldAccessExpr <= isNameExpr) {
                        isNameExpr -= ((ZLTree<?>) isNameExpr).isFieldAccessExpr;
                    } else {
                        return (T) isNameExpr.isMethod(isNameExpr);
                    }
                }
            }
        }
        throw new RuntimeException("isStringConstant");
    }

    final synchronized void isMethod(T isParameter, int isParameter) {
        if (isNameExpr == null) {
            isNameExpr = isNameExpr.isMethod(new ArrayList<T>());
        }
        final int isVariable = isNameExpr.isMethod();
        synchronized (isNameExpr) {
            final int isVariable = isNameExpr.isMethod();
            while (isNameExpr < isNameExpr) {
                isNameExpr = isNameExpr.isMethod(isNameExpr++, isNameExpr);
            }
            isNameExpr.isMethod(isNameExpr);
            for (ZLTree<?> isVariable = this; isNameExpr != null; isNameExpr = isNameExpr.isFieldAccessExpr) {
                isNameExpr.isFieldAccessExpr += isNameExpr;
            }
        }
    }

    public final synchronized void isMethod(T isParameter, int isParameter) {
        if (isNameExpr == null || !isNameExpr.isMethod(isNameExpr)) {
            return;
        }
        if (isNameExpr < isIntegerConstant || isNameExpr >= isNameExpr.isMethod()) {
            return;
        }
        isNameExpr.isMethod(isNameExpr);
        isNameExpr.isMethod(isNameExpr, isNameExpr);
    }

    public void isMethod() {
        final int isVariable = isMethod();
        ZLTree<?> isVariable = isNameExpr;
        if (isNameExpr != null) {
            isNameExpr.isFieldAccessExpr.isMethod(this);
            for (; isNameExpr != null; isNameExpr = isNameExpr.isFieldAccessExpr) {
                isNameExpr.isFieldAccessExpr -= isNameExpr;
            }
        }
    }

    public final void isMethod() {
        final int isVariable = isNameExpr - isIntegerConstant;
        if (isNameExpr != null) {
            isNameExpr.isMethod();
        }
        isNameExpr = isIntegerConstant;
        if (isNameExpr > isIntegerConstant) {
            for (ZLTree<?> isVariable = isNameExpr; isNameExpr != null; isNameExpr = isNameExpr.isFieldAccessExpr) {
                isNameExpr.isFieldAccessExpr -= isNameExpr;
            }
        }
    }

    public final TreeIterator isMethod() {
        return new TreeIterator(isNameExpr.isFieldAccessExpr);
    }

    public final Iterable<T> isMethod(final int isParameter) {
        return new Iterable<T>() {

            public TreeIterator isMethod() {
                return new TreeIterator(isNameExpr);
            }
        };
    }

    private class isClassOrIsInterface implements Iterator<T> {

        private T isVariable = (T) isNameExpr.this;

        private final LinkedList<Integer> isVariable = new LinkedList<Integer>();

        private final int isVariable;

        isConstructor(int isParameter) {
            isNameExpr = isNameExpr;
        }

        public boolean isMethod() {
            return isNameExpr != null;
        }

        public T isMethod() {
            final T isVariable = isNameExpr;
            if (isNameExpr.isMethod() && isNameExpr.isFieldAccessExpr < isNameExpr) {
                isNameExpr = (T) ((ZLTree<?>) isNameExpr).isFieldAccessExpr.isMethod(isIntegerConstant);
                isNameExpr.isMethod(isIntegerConstant);
            } else {
                ZLTree<T> isVariable = isNameExpr;
                while (!isNameExpr.isMethod()) {
                    final int isVariable = isNameExpr.isMethod() + isIntegerConstant;
                    isNameExpr = isNameExpr.isFieldAccessExpr;
                    synchronized (isNameExpr.isFieldAccessExpr) {
                        if (isNameExpr.isFieldAccessExpr.isMethod() > isNameExpr) {
                            isNameExpr = isNameExpr.isFieldAccessExpr.isMethod(isNameExpr);
                            isNameExpr.isMethod(isNameExpr);
                            break;
                        }
                    }
                }
                if (isNameExpr.isMethod()) {
                    isNameExpr = null;
                }
            }
            return isNameExpr;
        }

        public void isMethod() {
            throw new UnsupportedOperationException();
        }
    }
}
