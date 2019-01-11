// isComment
package ch.logixisland.anuto.util.iterator;

import java.util.NoSuchElementException;

public abstract class isClassOrIsInterface<T> extends StreamIterator<T> {

    private T isVariable = null;

    private boolean isVariable = true;

    protected abstract T isMethod();

    @Override
    public boolean isMethod() {
        if (!isNameExpr) {
            isNameExpr = isMethod();
            isNameExpr = true;
        }
        return isNameExpr != null;
    }

    @Override
    public T isMethod() {
        if (isMethod()) {
            isNameExpr = true;
            return isNameExpr;
        } else {
            throw new NoSuchElementException();
        }
    }
}
