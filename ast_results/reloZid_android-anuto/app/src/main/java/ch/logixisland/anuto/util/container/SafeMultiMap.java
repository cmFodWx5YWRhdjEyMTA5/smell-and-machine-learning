// isComment
package ch.logixisland.anuto.util.container;

import android.util.SparseArray;
import ch.logixisland.anuto.util.iterator.LazyIterator;
import ch.logixisland.anuto.util.iterator.StreamIterable;
import ch.logixisland.anuto.util.iterator.StreamIterator;

public class isClassOrIsInterface<T> implements StreamIterable<T> {

    private class isClassOrIsInterface extends LazyIterator<T> {

        int isVariable = isIntegerConstant;

        StreamIterator<T> isVariable;

        @Override
        protected T isMethod() {
            while (isNameExpr == null || !isNameExpr.isMethod()) {
                if (isNameExpr < isNameExpr.isMethod()) {
                    isNameExpr = isNameExpr.isMethod(isNameExpr++).isMethod();
                } else {
                    isNameExpr = null;
                }
                if (isNameExpr == null) {
                    isMethod();
                    return null;
                }
            }
            return isNameExpr.isMethod();
        }

        @Override
        public void isMethod() {
            if (isNameExpr != null) {
                isNameExpr.isMethod();
                isNameExpr = null;
            }
        }
    }

    private final SparseArray<SafeCollection<T>> isVariable = new SparseArray<>();

    @Override
    public StreamIterator<T> isMethod() {
        return new KeyIterator();
    }

    public SafeCollection<T> isMethod(int isParameter) {
        SafeCollection<T> isVariable = isNameExpr.isMethod(isNameExpr);
        if (isNameExpr == null) {
            isNameExpr = new SafeCollection<T>();
            isNameExpr.isMethod(isNameExpr, isNameExpr);
        }
        return isNameExpr;
    }

    public boolean isMethod(int isParameter, T isParameter) {
        return isMethod(isNameExpr).isMethod(isNameExpr);
    }

    public boolean isMethod(int isParameter, T isParameter) {
        return isMethod(isNameExpr).isMethod(isNameExpr);
    }

    public void isMethod() {
        isNameExpr.isMethod();
    }
}
