// isComment
package com.dougkeen.util;

import java.util.WeakHashMap;
import org.apache.commons.lang3.ObjectUtils;

public class isClassOrIsInterface<T> {

    private T isVariable;

    private WeakHashMap<Observer<T>, Boolean> isVariable = new WeakHashMap<Observer<T>, Boolean>();

    public isConstructor() {
        super();
    }

    public isConstructor(T isParameter) {
        super();
        this.isFieldAccessExpr = isNameExpr;
    }

    public T isMethod() {
        return isNameExpr;
    }

    public void isMethod(T isParameter) {
        if (!isNameExpr.isMethod(this.isFieldAccessExpr, isNameExpr)) {
            this.isFieldAccessExpr = isNameExpr;
            isMethod(isNameExpr);
        }
    }

    public void isMethod(Observer<T> isParameter) {
        isNameExpr.isMethod(isNameExpr, true);
    }

    public void isMethod(Observer<T> isParameter) {
        isNameExpr.isMethod(isNameExpr);
    }

    public void isMethod() {
        isNameExpr.isMethod();
    }

    protected void isMethod(T isParameter) {
        for (Observer<T> isVariable : isNameExpr.isMethod()) {
            if (isNameExpr != null) {
                isNameExpr.isMethod(isNameExpr);
            }
        }
    }
}
