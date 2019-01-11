// isComment
package net.pejici.java;

import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

/**
 * isComment
 */
public class isClassOrIsInterface extends Observable {

    private Vector<WeakObserver> isVariable = new Vector<WeakObserver>();

    public isConstructor() {
    }

    @Override
    public void isMethod(Observer isParameter) {
        WeakObserver isVariable = new WeakObserver(isNameExpr);
        isNameExpr.isMethod(isNameExpr);
        super.isMethod(isNameExpr);
    }

    @Override
    public synchronized void isMethod(Observer isParameter) {
        WeakObserver isVariable = null;
        Vector<WeakObserver> isVariable = new Vector<WeakObserver>();
        for (WeakObserver isVariable : isNameExpr) {
            Observer isVariable = isNameExpr.isMethod();
            if (null == isNameExpr) {
                isNameExpr.isMethod(isNameExpr);
            } else if (isNameExpr.isMethod() == isNameExpr) {
                isNameExpr = isNameExpr;
            }
        }
        for (WeakObserver isVariable : isNameExpr) {
            isNameExpr.isMethod(isNameExpr);
            super.isMethod(isNameExpr);
        }
        if (null != isNameExpr) {
            isNameExpr.isMethod(isNameExpr);
            super.isMethod(isNameExpr);
        }
    }

    @Override
    public synchronized void isMethod() {
        isNameExpr.isMethod();
        super.isMethod();
    }

    public void isMethod() {
        Vector<WeakObserver> isVariable = new Vector<WeakObserver>();
        for (WeakObserver isVariable : isNameExpr) {
            Observer isVariable = isNameExpr.isMethod();
            if (null == isNameExpr) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
        for (WeakObserver isVariable : isNameExpr) {
            isNameExpr.isMethod(isNameExpr);
            super.isMethod(isNameExpr);
        }
        super.isMethod();
    }
}
