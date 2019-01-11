// isComment
package pw.thedrhax.util;

import java.util.LinkedList;
import java.util.List;

/**
 * isComment
 */
public class isClassOrIsInterface<T> {

    private T isVariable;

    private final List<Listener<T>> isVariable = new LinkedList<>();

    public isConstructor(T isParameter) {
        isNameExpr = isNameExpr;
    }

    public final synchronized void isMethod(T isParameter) {
        isNameExpr = isNameExpr;
        isMethod(isNameExpr);
        synchronized (isNameExpr) {
            for (Listener<T> isVariable : isNameExpr) {
                if (isNameExpr.isFieldAccessExpr.isMethod(this)) {
                    isNameExpr.isFieldAccessExpr = isNameExpr;
                    isNameExpr.isMethod(isNameExpr);
                } else {
                    isNameExpr.isMethod(isNameExpr);
                }
            }
        }
    }

    public final T isMethod() {
        return isNameExpr;
    }

    public void isMethod(Listener<T> isParameter) {
        synchronized (isNameExpr.isFieldAccessExpr) {
            if (!isNameExpr.isFieldAccessExpr.isMethod(this)) {
                isNameExpr.isFieldAccessExpr.isMethod(this);
            }
        }
        this.isFieldAccessExpr = isNameExpr.isFieldAccessExpr;
    }

    public void isMethod(Listener<T> isParameter) {
        synchronized (isNameExpr.isFieldAccessExpr) {
            if (isNameExpr.isFieldAccessExpr.isMethod(this)) {
                isNameExpr.isFieldAccessExpr.isMethod(this);
            }
        }
    }

    public void isMethod(T isParameter) {
    }
}
